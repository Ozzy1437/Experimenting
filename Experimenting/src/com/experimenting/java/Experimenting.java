package com.experimenting.java;

import java.util.*;

public class Experimenting {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the amount of rows: ");
        int rowNum = in.nextInt();
        System.out.print("Please enter the amount of columns: ");
        int columnNum = in.nextInt();

        int[] sampleArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < columnNum; j++) {
                System.out.printf("[%d]", sampleArray[j + i]);
            }
            System.out.println();
        }
    }
}
