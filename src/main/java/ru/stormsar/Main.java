package ru.stormsar;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(15) + 1;
        }

        System.out.println("Массив случайных чисел:");
        System.out.println(Arrays.toString(array));

        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int num : array) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        System.out.println("Числа, встречающиеся больше одного раза:");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("число '" + entry.getKey() + "' встречается " + entry.getValue() + " раз(a)");
            }
        }
    }
}