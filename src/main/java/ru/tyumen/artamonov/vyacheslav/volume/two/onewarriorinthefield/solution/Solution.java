package ru.tyumen.artamonov.vyacheslav.volume.two.onewarriorinthefield.solution;

import java.util.Scanner;

public class Solution {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[] dx = {1, 1, -1, -1, 2, 2, -2, -2};
        int[] dy = {2, -2, 2, -2, 1, -1, 1, -1};

        for (int t = 0; t < n; t++) {
            String s = sc.nextLine().trim();
            int col = s.charAt(0) - 'a' + 1;
            int row = s.charAt(1) - '0';

            int cnt = 0;
            for (int i = 0; i < 8; i++) {
                int nc = col + dx[i];
                int nr = row + dy[i];
                if (nc >= 1 && nc <= 8 && nr >= 1 && nr <= 8) cnt++;
            }

            System.out.println(cnt);
        }
    }
}
