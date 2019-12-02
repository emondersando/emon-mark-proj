package main;

import java.util.Scanner;

public class MAIN {

    public static void main(String[] args) {
        //initialization classes and user input
        Scanner get = new Scanner(System.in);
        int c = -1, n, r;
        int b = 0;
        while (b == 0) {
            do {
                print in = new print();

                //initializing variables
                try {
                    c = get.nextInt();

                    in.printdiv();

                    //conditional statement for user input
                    if (c == 1) {
                        in.printn();
                        n = get.nextInt();
                        in.printr();
                        r = get.nextInt();
                        in.printres1(n, r);
                    } else if (c == 2) {
                        in.printn();
                        n = get.nextInt();
                        in.printr();
                        r = get.nextInt();
                        in.printres2(n, r);
                    } else if (c == 3) {
                        in.printn();
                        n = get.nextInt();
                        in.printk();
                        r = get.nextInt();
                        in.printres3(n, r);
                        //        } else if (c == 4) {
                        //            in.printr();
                        //            r = get.nextInt();
                        //            in.printres4(r + 1);
                    } else if (c == 4) {
                        in.printrow();
                        r = get.nextInt();
                        in.printres4(r);

                    } else if(c==5) {
                        System.exit(0);
                        break;
                    }

                } catch (Exception e) {
                    System.out.println("--------------");
                    System.out.println("|Integer only |");
                    System.out.println("--------------");
                    get.next();

                }
            } while (c < 0 || c > 5);
        }
    }
}
