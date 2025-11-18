package ru.tyumen.artamonov.vyacheslav.volume.one.factorial.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    static void main() throws IOException {
        Solution solution = new Solution();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String factorial = br.readLine();
        String[] s = factorial.split(" ");

        int number = Integer.parseInt(s[0]);
        String exclamationMarks = s[1];
        int exclamationMarkCount = solution.findExclamationMarkCount(exclamationMarks);
        List<Integer> factList = new ArrayList<>();

        int result = number;

        while (number > 0) {
            number = solution.findNextNumber(factList, number, exclamationMarkCount);
        }

       for (int fact: factList) {
           result *= fact;
       }

        System.out.println(result);
    }

    private int findNextNumber(List<Integer> factList, int number, int factorialCount) {
        int i = number - factorialCount;
        if (i > 0) {
            factList.add(i);
        }
        return i;
    }

    private int findExclamationMarkCount(String exclamationMarks) {
        return exclamationMarks.split("").length;
    }
}
