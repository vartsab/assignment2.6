package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(8, 1, 96, 2000, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> text = new ArrayList<>(List.of(
                "collections", "lists", "maps", "sets", "hashmaps", "lists", "arrays", "lists"
        ));

        //1. Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
        List<Integer> odds = new ArrayList<>();
        for (Integer num : nums) {
            if (num%2==1) {
                odds.add(num);
            }
        }
        System.out.println(odds);

        //2. Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания.
        List<Integer> evens = new ArrayList<>();
        for (Integer num : nums) {
            if ( (num%2==0) && (!evens.contains(num)) ) {
                evens.add(num);
            }
        }
        evens.sort(Integer::compareTo);
        System.out.println(evens);

        //3. Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли.
        Set<String> vocabulary = new HashSet<>();
        for (String word : text) {
            vocabulary.add(word);
        }
        System.out.println(vocabulary);

        /*4.Напишите код, который выводит в консоль все количество дублей из списка слов.
        *Например, у вас есть текст из 6 слов, в котором есть одно слово, которое повторяется.
        В таком случае в консоли выведется результат "2", то есть то количество элементов, которые повторяются. */
        int count = 0;
        for (int i = 0; i < text.size(); i++)
            for (int j = i+1; j < text.size(); j++)
                if ( text.get(i).equals(text.get(j)) )
                    count++;
        System.out.println(count);
    }
}
