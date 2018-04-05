public class CommonPrimeDivisors {
    public static int solution(int[] A, int[] B){
        int count = 0;
        //Go through ever pair to determine how many of the pairs contain the same prime divisors
        for(int i = 0; i<A.length; i++){
            if(hasSamePrimeDivisors(A[i],B[i])){
                count++;
            }
        }
        return count;
    }

    //Gives the GCD of two numbers
    public static int greatestCommonDivisor(int a, int b){
        if(a % b == 0){
            return b;
        }
        else{
            return greatestCommonDivisor(b, a%b);
        }
    }

    //Determines the values of x and y after their common divisors are removed
    //Called by hasSamePrimeDivisors in order to get x and y down to 1
    //If either is not equal to 1, the two do not have matching prime divisors
    public static int removeCommonDivisors(int x, int y){
       while(x != 1){
           int gcd = greatestCommonDivisor(x,y);
           if(gcd == 1){
               break;
           }
           x = x/gcd;
       }
       return x;
    }

    public static boolean hasSamePrimeDivisors(int x, int y){
        int gcdCandidate = greatestCommonDivisor(x,y);
        x = removeCommonDivisors(x,gcdCandidate);
        //If x != 1, then x and y do not have the same prime divisors
        //Since x can only be composed of the prime divisors in that case
        if(x != 1){
            return false;
        }
        y = removeCommonDivisors(y,gcdCandidate);

        if(y == 1){
            return true;
        }
        return false;
    }
}
