
package main;
import java.math.BigInteger;
class Calculations{
   //Generating Factorial

    public String factorialB(int n) {
        BigInteger q = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            q = q.multiply(BigInteger.valueOf(i));
        }
        return "" + q;
    }
//     static BigInteger factorial(int n){
//         BigInteger a = new BigInteger ("1");
//         for (int i = 2; i <=n; i++) {
//             a = a.multiply(BigInteger.valueOf(i));
//         }
//         return a;
//     }
}
