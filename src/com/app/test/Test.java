package com.app.test;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        String a[]={"ebacd", "fghij","olmkn","trpqs","xywuv"};

        char[][] grid = {
                        {'e', 'b', 'a', 'c', 'd'},
                        {'f', 'g', 'h', 'i', 'j'},
                        {'o', 'l', 'm', 'k', 'n'},
                        {'t', 'r', 'p', 'q', 's'},
                        {'x', 'y', 'w', 'u', 'v'},
                     };

        /*
        int n=5;
        char[][] c = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = b[i].charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("------------------------");

         */
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }
        /*
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[0].length; j++) {
                System.out.print(d[i][j]+" ");
            }
            System.out.println("");
        }

         */
        System.out.print(checkColumns(grid)?"YES":"NO");

    }
    public static boolean checkColumns(char[][] grid) {
        boolean result = false;
        ArrayList<Character> al= new ArrayList();
        for (int i = 0;i < grid.length; i++) {
            al.add(grid[i][0]);
        }
        for (int i = 0;i < al.size()-1; i++) {
            if (al.get(i) - al.get(i+1) <= 0)
                result = true;
            else
                return false;
        }
        return result;
    }
}
