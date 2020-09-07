package com.practice;


import java.util.*;

/**
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
 * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 * [leo, kiki, eden]	[eden, kiki]
 *
 * <Resources>
 * https://www.cs.cmu.edu/~adamchik/15-121/lectures/Hashing/hashing.html
 * </Resources>
 */
public class HashTest {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

//        String[] data = new String("Nothing is as easy as it looks").split(" ");
//        HashMap <String, Integer> hm = new HashMap<>();
//
//        for (String key : participant)
//        {
//            Integer freq = hm.get(key);
//            if(freq == null) freq = 1; else freq ++;
//            hm.put(key, 1);
//        }

//        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
//
//        // Input the values
//        hm.put(1, "Geeks");
//        hm.put(12, "forGeeks");
//        hm.put(15, "A computer");
//        hm.put(3, "Portal");
//
//        // Printing the Hashtable
//        System.out.println(hm);
//
//
//        HashMap <String, Integer> hm = new HashMap<>();
//
//        for (String key : participant)
//        {
//            Integer freq = hm.get(key);
//            hm.put(key, 0);
//        }
//
//        for (String key : completion)
//        {
//            Integer freq = hm.get(key);
//            if(freq != null) hm.put(key, 1);;
//
//        }
//        System.out.println(hm);
//
//        for (String key : participant)
//        {
//            Integer freq = hm.get(key);
//            if(freq == 0) {
//                return key;
//            }
//        }
//        List<String> a = new LinkedList<String>(Arrays.asList(participant));
//
//        System.out.println(a);
//
//        for (String key : completion)
//        {
//            int idx = a.indexOf(key);
//            if(idx > -1 ){
//                a.remove(idx);
//            }
//        }

        HashMap <String, Integer> hm = new HashMap<>();
        HashMap <Integer, String> hm2 = new HashMap<>();

        for (String key : participant)
        {
            Integer freq = hm.get(key);
            if(freq == null) freq = 1; else freq++;
            hm.put(key, freq);
        }
        System.out.println(hm+"aaaa");

        for (String key : completion)
        {
            Integer freq = hm.get(key);

            if(freq != null) {
                freq -= 1;
                if(freq ==0){
                    hm.remove(key);
                } else {
                    hm.put(key, freq);
                }
            }

        }

        System.out.println(hm);

        List<String> finalRecs = new ArrayList<String>(hm.keySet());

        return finalRecs.get(0);
    }

}
