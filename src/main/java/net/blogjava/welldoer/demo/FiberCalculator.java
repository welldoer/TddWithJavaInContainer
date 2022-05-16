package net.blogjava.welldoer.demo;

public class FiberCalculator {

    public static long calculate(int index) {
        if (index < 1) {
            throw new IllegalArgumentException();
        }
        if (index == 1 || index == 2) {
            return 1;
        }

        long first = 1;
        long second = 1;
        long temp;
        for(int i = 3; i <= index; i++) {
            temp = second;
            second += first;
            first = temp;
        }

        return second;
    }

}
