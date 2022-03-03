package ru.kristinak.HW;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
//        решаем проблему деления на ноль через исключение (ошибки (Calculator.java:12) и (Main.java:9))
//        try {
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
//        } catch (ArithmeticException d) {
//            System.out.println("Деление на ноль невозможно!");
//        }
    }
}