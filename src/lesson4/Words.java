package lesson4;

import java.util.*;

public class Words {
    public  static List<String> arr = new ArrayList<>(Arrays.asList("a", "s", "d", "f", "g", "h",
            "h", "g", "f", "d", "s", "a", "a", "s", "d", "a","l"));

    public static void main(String[] args) {
        Set<String> set = new HashSet<>(arr);
        System.out.println(set);


        HashMap<String,Integer> hm = new HashMap<>();
        for (String str: set){
            hm.put(str,count(str));
        }
        System.out.println(hm);
        }

        public static Integer count(String str){
            Integer result = 0;
            for(String arrStr : arr){
                if (str.equals(arrStr))result ++;
            }
            return result;
        }
    }

