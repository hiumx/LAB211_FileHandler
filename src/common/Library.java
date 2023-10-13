
package common;

import java.util.Random;
import java.util.Scanner;

public class Library {
    
    private Scanner sc = new Scanner(System.in);
    
    public char getChar(String promt) {
        System.out.print(promt);
        return sc.nextLine().charAt(0);
    }
    
    public String getString(String promt) {
        System.out.print(promt);
        return sc.nextLine();
    }
    
    public int getInt(String promt) {
        int number;
        while(true) {
            System.out.print(promt);
            try {
                number = Integer.parseInt(sc.nextLine());
                return number;
            } catch (Exception e) {
            }
        }
    }

    public int getInt(String promt, int m, int n) {
        int a = -1;
        while (true) {
            System.out.print(promt);
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }

    public int[] createArray(int size_Array) {
        int[] array = new int[size_Array];
        Random rd = new Random();
        for (int i = 0; i < size_Array; i++) {
            array[i] = rd.nextInt(100);
        }
        return array;
    }

    public void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("");
    }

}