package fr.deweerconsulting.fizzbuzz;

import java.util.stream.IntStream;

public class FunctionalFizzBuzzV1 {


    public static int MIN_RANGE_INCLUSIVE = 1;
    public static int MAX_RANGE_EXCLUSIVE = 101;

    public static String FIZZ = "Fizz";
    public static String BUZZ = "Buzz";

    public static int FIZZ_DIVIDER = 3;
    public static int BUZZ_DIVIDER = 5;


    public static void main(String[] args) {


        IntStream
                .range(MIN_RANGE_INCLUSIVE, MAX_RANGE_EXCLUSIVE)
                .forEach(i ->
                        System.out.println(
                                isZeroRemainder(i, FIZZ_DIVIDER) && isZeroRemainder(i,BUZZ_DIVIDER)
                                        ?
                                        FIZZ+BUZZ
                                        :
                                        isZeroRemainder(i, BUZZ_DIVIDER)
                                                ?
                                                BUZZ
                                                :
                                                isZeroRemainder(i, FIZZ_DIVIDER)
                                                        ?
                                                        FIZZ
                                                        :
                                                        i

                        )
                );
    }

    private static boolean isZeroRemainder(int x, int y){
        return Math.floorMod(x, y) == 0;
    }
}
