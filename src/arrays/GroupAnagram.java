package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

  /*
   * Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
   */

    public static void main(String[] args) throws Exception {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagrams(strs);
        for(List<String> list : result){
            for(String s : list){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        
        //store the sorted string as key and the original string as value
        Map<String, List<String>> map = new HashMap<>();
        //create a list to store the result grouped by anagrams
        List<List<String>> result = new ArrayList<>();
        //loop through the array
        for(String s : strs){
            //convert string to char array
            char[] c = s.toCharArray();
            //sort the char array
            Arrays.sort(c);
            //convert the sorted char array back to string
            String key = String.valueOf(c);
            //check if the map contains the key
            if(map.containsKey(key)){
                //if yes, add the value to the list
                map.get(key).add(s);
            } else {
                //if not, add the key and value to the map
                map.put(key, new ArrayList<>());
                map.get(key).add(s);
            }
        }
        //loop through the map
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            //add the value to the result list
            result.add(entry.getValue());
        }
        //return the result
        return result;
    }
}
