package ru.tyumen.artamonov.vyacheslav.volume.one.reverseroot;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    static void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> nums = new ArrayList<>();

        while (sc.hasNextLong()) {
            nums.add(sc.nextLong());
        }

        for (int i = nums.size() - 1; i >= 0; i--) {
            System.out.printf("%.4f%n", Math.sqrt(nums.get(i)));
        }
    }
}
