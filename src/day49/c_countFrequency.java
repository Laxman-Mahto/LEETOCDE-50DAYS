package day49;

import java.util.HashMap;
import java.util.Map;

public class c_countFrequency {
    public static void printFrequencies(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        printFrequencies(arr);
    }
}