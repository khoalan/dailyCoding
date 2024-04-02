package blind;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;
import java.util.Locale;
import java.util.stream.Collectors;


class A{
    static String fieldA1 = "fieldA1";
    String fieldA2 = "fieldA2";

    static void methodA(){
        System.out.println("methodA");
    }

    void methodB(){
        System.out.println("methodB");
    }
}

class B extends A{
    String fieldB3;
    void call() {
        super.methodB();
    }
}

public class test{


    public static Set<String> permutationFinder(String str) {
        Set<String> perm = new HashSet<String>();
        //Handling error scenarios
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0); // first character
        String rem = str.substring(1); // Full string without first character
        Set<String> words = permutationFinder(rem);
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
                perm.add(charInsert(strNew, initial, i));
            }
        }
        return perm;
    }

    public static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }

    public static void main(String[] args) {
        String s = "AAC";
        String s1 = "ABC";
        String s2 = "ABCD";
        System.out.println("\nPermutations for " + s + " are: \n" + permutationFinder(s));

//        DateTimeFormatter formatter = DateTimeFormatter
//                .ofPattern("yyyy-MM-dd").withZone(ZoneId.systemDefault());;
//        List<String> ls = new ArrayList<>(Arrays.asList("a".split(" ")));
//        ls.remove(0);
//        System.out.println(ls.toString());
//        //Date string with offset information
//        String dateString = "2019-08-01T16:20:17.717Z";
//
//        Instant dateTime = Instant.parse(dateString);
//        String date = formatter.format(dateTime);


//        Instant instant = Instant.ofEpochSecond(1663853990450L);
//        long test_timestamp = 1663853990450L;
//        ZonedDateTime triggerTime =
//                ZonedDateTime.ofInstant(Instant.ofEpochMilli(test_timestamp),
//                        TimeZone.getDefault().toZoneId());
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E LLL dd yyyy HH:mm:ss OOOO (zzzz)");
//        DateTimeFormatter formatterCutoff = DateTimeFormatter.ofPattern(dateFormat);
//
//        String[] testArray = new String[2];
//
//        System.out.println("testArray "+ testArray[0]);
//        System.out.println("testArray "+ testArray[1]);
//        System.out.println(triggerTime.format(formatter));
//
//       Set<String> listS = new HashSet<>();
//        Set<String> listB = new HashSet<>();
//        Set<String> listc = new HashSet<>();
//        listB.add("aa");
//       listS.add("aa");
//       listc.add("aa");
//        listc.add("bb");
//        System.out.println(listS.addAll(listB));
//        System.out.println(listS.addAll(listc));
//        System.out.println(listS.toString());
//
//        final String dateFormat = "yyyy-MM-dd'T'HH:mm:ss";
//
//        String dateString = "2023-04-19T00:00:00.000";
//        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yy").withZone(ZoneOffset.UTC);
//        Instant instant = Instant.parse(dateString+"Z");
//        String date2 = dateFormatter.format(instant);
//        System.out.println("Change format: " + date2);
//
//
//        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
//        LocalDateTime time = LocalDateTime.now();
//        ZonedDateTime timeZ = ZonedDateTime.now(ZoneOffset.UTC);
//        ZonedDateTime timeZParsed = time.atZone(ZoneId.of("America/New_York"));
//
//        System.out.println(timeZParsed.compareTo(timeZ));
//        Instant dateTime = Instant.parse(dateString);
////
//        Date date = Date.from(dateTime);
//        String mydate = dateFormatter.format(time);
//        String myTime = timeFormatter.format(time);
//        System.out.println(myTime.toString());
//        System.out.println(timeZParsed.toString());
//
//        String status = "Executed 2";
//        String status2 = "Pending Executed - Complex";
//        System.out.println(status.replaceAll("(-)*[0-9]*","").trim());
//        System.out.println(status2.replaceAll("(-)*[0-9]*",""));
//        System.out.println("" == null);
//        System.out.println("".isEmpty());
    }
}
