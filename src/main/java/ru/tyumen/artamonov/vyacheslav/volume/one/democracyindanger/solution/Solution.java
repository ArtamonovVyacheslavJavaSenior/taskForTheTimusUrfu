package ru.tyumen.artamonov.vyacheslav.volume.one.democracyindanger.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    static void main() throws IOException {
        Solution solution = new Solution();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int groupCounter = Integer.parseInt(br.readLine());
        String[] groupPeople = br.readLine().trim().split(" ");

        int resultPeople = 0;

        if (solution.checkCondition(groupPeople)) {

            if (groupCounter == 1) {
                System.out.println(solution.groupToLow(resultPeople, groupPeople));
            } else {
                System.out.println(solution.groupIsNormalCount(groupPeople, groupCounter, resultPeople));
            }
        } else {
            System.out.println("Население островных государств Карибского бассейна превысило 9999");
        }
    }

    private int groupToLow(int resultPeople, String[] groupPeople) {
        resultPeople += findHalfWithMajority(Integer.parseInt(groupPeople[0]));
        return resultPeople;
    }

    private int groupIsNormalCount(String[] groupPeople,int groupCounter, int resultPeople) {
        List<Integer> firstHalfWithMajority = Arrays.stream(groupPeople)
                .map(Integer::parseInt)
                .sorted()
                .limit(findHalfWithMajority(groupCounter))
                .collect(Collectors.toCollection(ArrayList::new));


        for (int people: firstHalfWithMajority) {
            resultPeople += findHalfWithMajority(people);
        }

        return resultPeople;
    }

    private boolean checkCondition(String[] parts) {
        int limitPopulation = 9999;

        int counterPeople = 0;
        for (String people : parts) {
            counterPeople += Integer.parseInt(people);
        }
        return counterPeople < limitPopulation;
    }

    private int findHalfWithMajority(int groupCounter) {
        return groupCounter / 2 + 1 ;
    }
}
