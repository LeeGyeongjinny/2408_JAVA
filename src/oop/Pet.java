package oop;

import oop.pet.Whale;

public class Pet {
    public static void main(String[] args) {
        Whale whale = new Whale(); // 인스턴스화
        Whale whale2 = new Whale(20);
        Whale whale3 = new Whale(30, "meerkat");
        whale.swimming();

        int sum = whale.mySum(1, 2);
        System.out.println(sum); // 3

        long long1 = 1;
        long long2 = 2;
        long sum2 = whale.mySum(long1,  long2);
    }
}

