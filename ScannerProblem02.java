package com.leehojun.scannerproblem;

import java.util.Scanner;

public class ScannerProblem02 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
//
//        System.out.print("다시 숫자를 입력해주세요 : ");
//        int num = scr.nextInt();
//        System.out.println("num = " + num);
//
//        scr.nextLine();
//
//        System.out.print("공백이 있는 문자열을 입력해주세요 : ");
//        String str = scr.nextLine();
//        System.out.println("str = " + str);

        System.out.print("write next statment with space ");

        String str1 = scr.next();
        System.out.println("str1 = " + str1);

        scr.nextLine();
        System.out.println("write statement anything ");
        String str2 = scr.nextLine();
        System.out.println("str2 = " + str2);



    }
}
