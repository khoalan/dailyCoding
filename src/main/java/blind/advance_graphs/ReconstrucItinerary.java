package blind.advance_graphs;

import java.util.*;

public class ReconstrucItinerary {

    private static void dfs(Map<String, PriorityQueue<String>> adj, LinkedList<String> result, String s ){
        PriorityQueue<String> pq = adj.get(s);
        while(pq != null && !pq.isEmpty()){
            String v = pq.poll();
            dfs(adj, result, v);
        }
        result.addFirst(s);
    }

    public static List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> adj = new HashMap<>();
        for (List<String> t : tickets){
            adj.putIfAbsent(t.get(0), new PriorityQueue<>());
            adj.get(t.get(0)).add(t.get(1));
        }

        LinkedList<String> result = new LinkedList<>();
        dfs(adj, result, "JFK");
        return result;
    }
    public static void main(String[] args) {
        List<List<String>> air = new ArrayList<>();
        List<String> tic1 = new ArrayList<>(Arrays.asList(new String[]{"MUC", "LHR"}));
        List<String> tic2 = new ArrayList<>(Arrays.asList(new String[]{"JFK","MUC"}));
        List<String> tic3 = new ArrayList<>(Arrays.asList(new String[]{"SFO","SJC"}));
        List<String> tic4 = new ArrayList<>(Arrays.asList(new String[]{"LHR","SFO"}));
        air.add(tic1);
        air.add(tic2);
        air.add(tic3);
        air.add(tic4);
        System.out.println(findItinerary(air));
    }
}
