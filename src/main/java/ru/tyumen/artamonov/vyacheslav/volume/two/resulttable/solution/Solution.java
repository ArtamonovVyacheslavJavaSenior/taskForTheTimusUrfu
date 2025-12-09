package ru.tyumen.artamonov.vyacheslav.volume.two.resulttable.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Team> teams = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            int m = sc.nextInt();
            teams.add(new Team(id, m));
        }

        teams.sort((a, b) -> b.m - a.m);

        StringBuilder out = new StringBuilder();
        for (Team t : teams) {
            out.append(t.id).append(" ").append(t.m).append("\n");
        }

        System.out.print(out);
    }
}

class Team {
    int id;
    int m;

    Team(int id, int m) {
        this.id = id;
        this.m = m;
    }
}