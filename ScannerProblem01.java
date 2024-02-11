package com.leehojun.scannerproblem;

import java.util.Scanner;

public class ScannerProblem01 {

    public static void main(String[] args) {

        Scanner scr = new Scanner (System.in);

        System.out.print("문자열을 입력해주세요 : ");
        String str1 = scr.next();
        System.out.println("str1 = " + str1);

        scr.nextLine();

        System.out.print("숫자를 입력 해주세요 : ");
        int num = scr.nextInt();
        System.out.println("num = " + num);




    }


}
