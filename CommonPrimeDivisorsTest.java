import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonPrimeDivisorsTest {
    @Test
    void solution(){
        //Example Test
        int[] A = {15,10,3};
        int[] B = {75,30,5};
        assertEquals(1,CommonPrimeDivisors.solution(A,B));

        //Extreme, one element each, both primes
        int[] C = {3};
        int[] D = {1};
        assertEquals(0,CommonPrimeDivisors.solution(C,D));

        //Medium Input
        int[] E = {15,10,3,65,34,76,89,12,34,9,13,65,7,55,53,21,70,1237,4328,94121,99,1,54,85,47,3859,1298,75,4,12};
        int[] F = {75,30,5,13,17,25,11,3,12,3,13,6,7,2,64,76,145,28,471,522,3,45,72,936,100,262,78542,53,86,13,3};
        assertEquals(5,CommonPrimeDivisors.solution(E,F));
    }

    @Test
    void greatestCommonDivisor() {
        //Simple Test of GCD
        assertEquals(5,CommonPrimeDivisors.greatestCommonDivisor(5,25));

        //Two Primes Test
        assertEquals(1,CommonPrimeDivisors.greatestCommonDivisor(5,13));

        //Same Number Test
        assertEquals(6,CommonPrimeDivisors.greatestCommonDivisor(6,6));

        //Test of Larger Numbers
        assertEquals(71775,CommonPrimeDivisors.greatestCommonDivisor(71775,1722600));
    }

    @Test
    void removeCommonDivisors() {
        //Simple Test
        assertEquals(1,CommonPrimeDivisors.removeCommonDivisors(75,15));

        //Same Number Test
        assertEquals(1,CommonPrimeDivisors.removeCommonDivisors(5,5));

        //Simple Test, Should not return 1
        assertEquals(6,CommonPrimeDivisors.removeCommonDivisors(30,5));
    }

    @Test
    void hasSamePrimeDivisors() {
        //Simple test of True
        assertEquals(true,CommonPrimeDivisors.hasSamePrimeDivisors(15,75));

        //Simple test of False
        assertEquals(false,CommonPrimeDivisors.hasSamePrimeDivisors(5,3));
    }
}