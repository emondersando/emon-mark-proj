package main;

import java.math.BigInteger;

public class Functions {

    inputChecker in = new inputChecker();
    Calculations calc = new Calculations();

    //all the methods that is processing the input
    //permutation without repetition Big integer
    public BigInteger permutationWoRB(int n, int r) {// n! / (n-r)! WITHOUT REP
        if ((in.inputChecker(n, r) && in.inputChecker(r)) == false) {
            return null;
        } else {
            BigInteger a = new BigInteger(calc.factorialB(n));
            BigInteger b = new BigInteger(calc.factorialB(n - r));

            a = a.divide(b);
            return a;
        }
    }

    //combination without repetition Big integer
    public BigInteger combinationWoRB(int n, int r) { // n! / r!(n-r)! WITHOUT REP

        if ((in.inputChecker(n, r) && in.inputChecker(r)) == false) {
            return null;
        } else {
            BigInteger a = new BigInteger(calc.factorialB(n));
            BigInteger b = new BigInteger(calc.factorialB(r));
            BigInteger c = new BigInteger(calc.factorialB(n - r));
            BigInteger d = new BigInteger("1");
            d = a.divide((b.multiply(c)));
            return d;
        }
    }

    //combination with repetition Big integer
    public BigInteger combinationWRB(int n, int r) {// *(R+N-1)!/R!*(N-1)!   WITH REP
        if ((in.inputChecker(n, r) && in.inputChecker(r)) == false) {
            return null;
        } else {
            BigInteger a = new BigInteger(calc.factorialB(r + n - 1));
            BigInteger b = new BigInteger(calc.factorialB(r));
            BigInteger c = new BigInteger(calc.factorialB(n - 1));
            BigInteger d = new BigInteger("1");
            d = a.divide((b.multiply(c)));
            return d;
        }
    }

    //permutation with repetition Big integer
    public BigInteger permutationWRB(int n, int r) { // N^R WITH REP
         if ((in.inputChecker(n, r) && in.inputChecker(r)) == false) {
            return null;
        } else {
            BigInteger exp = new BigInteger("1");
            BigInteger a = new BigInteger(Long.toString(n));
            for (int i = 0; i < r; i++) {
                exp = exp.multiply(a);
            }
            return exp;
        }
    }

    //stirling numbers Big integer
//    public BigInteger stirlingNumber(int r, int n) {
//        BigInteger b = new BigInteger("-1");
//        BigInteger c = new BigInteger("-1");
//
//        if (n > r) {
//            return null;
//        } else if (n == 0) {
//            return b;
//        } else if (r == n) {
//            return c;
//        } else if (n == 1) {
//            BigInteger temp = new BigInteger(calc.factorialB(r - 1));
//            return temp;
//        } else if (r - n == 1) {
//            return permutationWoRB(r, 2);
//        } else {
//            String w = Integer.toString(r - 1);
//            BigInteger q = new BigInteger(w);
//            return stirlingNumber(r - 1, n - 1).add((q.multiply(stirlingNumber(r - 1, n))));
//        }
//
//    }
    public  BigInteger factorial(int n) {
   
        BigInteger a = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            a = a.multiply(BigInteger.valueOf(i));
        }
        return a;
    }
    
    public BigInteger StirlingNum(int n, int r) {
             if ((in.inputChecker(n, r) && in.inputChecker(r)) == false) {
            return null;
        } else {
        BigInteger m = BigInteger.valueOf(-1);
        BigInteger l = BigInteger.valueOf(-1);
        BigInteger denver = BigInteger.ZERO;
        BigInteger lat = BigInteger.ZERO;
        BigInteger nat = BigInteger.ZERO;
        for (int x = 0; x < r; x++) {
            m = (m).multiply(l);
            BigInteger comb1 = factorial(r).divide(factorial(x).multiply(factorial(r - x)));
            denver = BigInteger.valueOf(r).subtract(BigInteger.valueOf(x));
            lat = BigInteger.valueOf(r).subtract(BigInteger.valueOf(x));
            for (int z = 1; z < n; z++) {
                denver = denver.multiply(lat);
            }
            nat = nat.add((m).multiply(comb1).multiply(denver));

        }
        return nat.divide(factorial(r));
    }
    }

    //pascal triangle this will return string
//    public String pascalTri(long r) {
//        if (in.inputChecker(r) == false) {
//            return "";
//        } else {
//        
//            long n = 1;
//            for (long i = 0; i < r; i++) {
//                for (long k = r; k > i; k--) {
//                    System.out.print(" ");
//                }
//                n = 1;
//                for (long j = 0; j <= i; j++) {
//                    System.out.print(n + " ");
//                    n = n * (i - j) / (j + 1);
//                }
//                System.out.println();
//            }
//            return "";
//        }
//    }
    public String pascal(int n) {

        if (in.inputChecker(n) == false) {
            return "";

        } else {
            System.out.print("pascal triangle line " + n + " is: ");
            for (int r = 0; r <= n; r++) {
                System.out.print(" " + combinationWoRB(n, r));

            }

        }
        return "";

    }

}
