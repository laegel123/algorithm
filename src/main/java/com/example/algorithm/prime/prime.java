package com.example.algorithm.prime;

public class prime {

    public static void isPrime(int number) {
        if (number < 2) {
            System.out.println("소수가 아닙니다.");
            return;
        }

        if (number == 2) {
            System.out.println("소수입니다.");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("소수가 아닙니다.");
                return;
            }
        }

        System.out.println("소수입니다.");
    }

    public static void isPrimeSqrt(int number) {
        if (number < 2) {
            System.out.println("소수가 아닙니다.");
            return;
        }

        if (number == 2) {
            System.out.println("소수입니다.");
            return;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println("소수가 아닙니다.");
                return;
            }
        }

        System.out.println("소수입니다.");
    }

    /**
     *
     * @param number : number 까지 소수를 찾는다.
     * @return array의 값이 true 이면 소수가 아니다.
     *                    false 이면 소수이다.
     */
    public static boolean[] makePrime(int number) {
        boolean[] prime = new boolean[number + 1];

        if (number < 2) {
            return prime;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (prime[i]) {
                continue;
            }

            for (int j = i * i; j < prime.length; j = j + i) {
                prime[j] = true;
            }
        }

        return prime;
    }
}
