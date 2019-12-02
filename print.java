package main;

import java.math.BigInteger;

public class print {
    //initialization of function class

    Functions func = new Functions();

    //default class method
    public print() {

        System.out.println();
        System.out.println("===========================================================");
        System.out.println("| [1] For Combination and Permutation without Repetition  |");
        System.out.println("| [2] For Combination and Permutation with Repetition     |");
        System.out.println("| [3] For Stirling second number case                     |");
        System.out.println("| [4] For Pascal Triangle row generator                   |");
        System.out.println("| [5] EXIT                                                |");
        System.out.println("===========================================================");
        System.out.print("Enter your choice: ");

    }

    //all the output will be printed in this methods
    public void printn() {
        System.out.print("Enter n: ");
    }

    public void printr() {
        System.out.print("Enter r: ");
    }

    public void printk() {
        System.out.print("Enter k: ");
    }

    public void printrow() {
        System.out.print("Enter row: ");
    }

    public void printdiv() {

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

    //printing the result for combination and permutation without repetition
    public void printres1(int n, int r) {
        printdiv();
        if (func.combinationWoRB(n, r) == null) {
        } else {
            System.out.println("===============================");
            System.out.println("COMBINATION WITHOUT REPETITION");
            System.out.println("```````````````````````````````");
            System.out.println("Combination: " + func.combinationWoRB(n, r));
            
        }

        if (func.permutationWoRB(n, r) == null) {
        } else {
            System.out.println("Permutation: " + func.permutationWoRB(n, r));
            System.out.println("===============================");
        }
    }

    //printing the result for combination and permutation with repetition
    public void printres2(int n, int r) {
        printdiv();
        if (func.combinationWRB(n, r) == null) {
        } else {
            System.out.println("=============================");
            System.out.println("`````````````````````````````");
            System.out.println("COMBINATION WITH REPETITION");
            
            System.out.println("Combination: " + func.combinationWRB(n, r));
        }

        if (func.permutationWRB(n, r) == null) {
        } else {
            System.out.println("Permutation: " + func.permutationWRB(n, r));
            System.out.println("=============================");
        }
    }

    //printing the result for stirling numbers
    public void printres3(int n, int r) {
        printdiv();
        if (n < r) {
            System.out.println("Syntax Error");
        } else {
            System.out.println("============================");
            System.out.println("STIRLING NUMBER OF 2nd CASE");
            System.out.println("============================");
            System.out.println("ANSWER: " + func.StirlingNum(n, r));
        }
    }
//
//    //printing the pattern for pascal triangle
//    public void printres4(long r) {
//        printdiv();
//        System.out.println(func.pascalTri(r));
//    }
//}

    //printing the pattern for pascal triangle
    public void printres4(int n) {//dapat long
        printdiv();
//        System.out.println(func.pascalTri(r));
        if (n <= 500) {
            System.out.println(func.pascal(n));
        } else {
            System.out.println("out of range");
        }
    }
}
