package com.kn.forloop;
import java.util.Scanner;

public class SDC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int scd = findSCD(num1, num2);
        System.out.println(scd);
        sc.close();
    }

    public static int findSCD(int num1, int num2) {
        int scd = 1;
        int start = 2;

        while (start <= num1 && start <= num2) {
            if (num1 % start == 0 && num2 % start == 0) {
                scd = start;
                break;
            }
            start++;
        }
        return scd;
    }


	}


