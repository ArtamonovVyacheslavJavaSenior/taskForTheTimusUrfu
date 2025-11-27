package ru.tyumen.artamonov.vyacheslav.volume.one.karynumbers.solution;

import java.util.Scanner;

public class Solution {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        long cntZero = 0;
        long cntNonZero = K - 1;

        for (int len = 2; len <= N; len++) {
            long newZero = cntNonZero;
            long newNonZero = (cntZero + cntNonZero) * (K - 1);
            cntZero = newZero;
            cntNonZero = newNonZero;
        }

        System.out.println(cntZero + cntNonZero);
    }
}