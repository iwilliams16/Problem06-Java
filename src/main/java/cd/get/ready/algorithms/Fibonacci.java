package cd.get.ready.algorithms;

public class Fibonacci {
    public int getFibonacciValue(int n) {

        if(n==0){
            return 0;
        }
        int thisOne = 1;
        int last = 0;

        int beforeLast;
        for (int i = 2; i <= n; i++) {

            beforeLast = last;
            last = thisOne;
            thisOne = beforeLast + last;
        }
        return thisOne;
    }
}
