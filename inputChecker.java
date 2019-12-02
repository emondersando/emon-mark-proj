
package main;

class inputChecker  {
    //Checking the input, range must not exceed the n but can be equal to n

    public boolean inputChecker(long n, long r) {
        boolean state = true;
        if (n < r) {
            System.out.println("Syntax Error");
            state = false;
            
        }
        else if (n >500 || r > 500){
            System.out.println("out of range");
            state = false;
            
        }
        return state;
    }

//Checking the input, range can never be less than 0
    public boolean inputChecker(long n) {
        boolean state = true;
        if (n <= -1) {
            
            System.out.println("Syntax Error");
            state = false;
        }
        return state;
    }


}


