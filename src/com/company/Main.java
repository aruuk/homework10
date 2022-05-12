package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        Создайте метод который берет одно число и varargs целых чисел.
//        Метод должен проверить есть ли такое значение как первый аргумент в varargs,
//        если есть то метод вернет true если нет, то вернет false.
        System.out.println(contains(7,46,683));
    }
    static boolean contains (int a, int ... b) {
        Random random = new Random();
        b = new int[10];
        for (int i = 0; i < b.length; i++) {
            b[i] = random.nextInt(10);
            System.out.print(b[i]);
            if (a == b[i]) {
                return true;
            }

        }
        return false;
    }
}
