package io.codelex.notes.day16;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class MainFunctions {
    public static void main(String[] args) {
        MyAdvancedFunction<Integer> myFuction = (Integer number) -> number * 2;
        UnaryOperator<Integer> unaryFunction = n -> n * 4;
        Integer functionResult = myFuction.calculate(8);
        System.out.println(functionResult);

        BiFunction<Integer, Integer, Double> pow = (a, b) -> Math.pow(a, b);
        System.out.println(pow.apply(8, 2));

        Integer resultOFChain = chainFunctions(2, a -> a * 2, a -> a + 2, a -> a * 2);
        System.out.println(resultOFChain);
    }

    public static Integer chainFunctions(Integer number, UnaryOperator<Integer>... functions) {
        Integer result = number;
        for (UnaryOperator<Integer> function : functions) {
            result = function.apply(result);
        }
        return result;
    }

}
