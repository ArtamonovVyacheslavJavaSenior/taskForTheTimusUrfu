package ru.tyumen.artamonov.vyacheslav.volume.one.pilestones.solution;

import java.util.Scanner;

public class Solution {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scannerPilesWeight = new int[n];

        int sumPiles = 0;
        for (int i = 0; i < n; i++) {
            scannerPilesWeight[i] = sc.nextInt();
            sumPiles += scannerPilesWeight[i];
        }

        int target = sumPiles / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int weight : scannerPilesWeight) {
            for (int j = target; j >= weight; j--) {
                dp[j] |= dp[j - weight];
            }
        }

        int best = 0;
        for (int i = target; i >= 0; i--) {
            if (dp[i]) {
                best = i;
                break;
            }
        }

        System.out.println(Math.abs(sumPiles - 2 * best));
    }
}
