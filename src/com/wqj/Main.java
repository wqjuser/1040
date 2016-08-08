package com.wqj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int a;
    static int b;
    static int n;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        a = s.nextInt();
        b = s.nextInt();
        List<Integer> l = new ArrayList<Integer>();
        int[] grade = new int[n];
        int[] out = new int[n];
        int[] gradecopy = new int[n];
        for (int i = 0; i < n; i++) {
            int num = s.nextInt();
            grade[i] = num;
            l.add(grade[i]);
            out[i] = 1;
        }
        for (int i = 0; i < l.size(); i++) {
            gradecopy[i] = l.get(i);
        }
        Arrays.sort(grade);
        if (a > b) {
            for (int j = gradecopy.length - 1; j > gradecopy.length - b - 1; j--) {
                for (int i = n - 1; i >= 0; i--) {
                    if (gradecopy[i] == grade[j]) {
                        out[i] = 2;
                        gradecopy[i] = -1;
                        break;
                    }
                }
            }
            for (int i = 0; i < out.length; i++) {
                System.out.print(out[i] + " ");
            }

        } else if (a == b) {
            for (int i = 0; i < a; i++) {
                System.out.print(1 + " ");
            }
            for (int i = a; i < n; i++) {
                System.out.print(2 + " ");
            }
        } else if (a < b) {

            Arrays.sort(grade);
            for (int j = 0; j < b; j++) {
                for (int i = n - 1; i >= 0; i--) {
                    if (gradecopy[i] == grade[j]) {
                        out[i] = 2;
                        gradecopy[i] = -1;
                        break;
                    }
                }
            }
            for (int i = 0; i < out.length; i++) {
                System.out.print(out[i] + " ");
            }
        }
    }
}


