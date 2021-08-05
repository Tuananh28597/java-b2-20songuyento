package com.codegym;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int numbers;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập n : ");
        numbers = input.nextInt();
        int count = 0;
        int a = 2;
        while(count<numbers){
            if(check(a)){                    //goi ham check snt check() gia tri a
                System.out.println(a + "");
                count++;
            }
            a++;
        }


    }

    public static boolean check(int n) {   //ham check dieu kien snt, kieu boolean
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }


}
