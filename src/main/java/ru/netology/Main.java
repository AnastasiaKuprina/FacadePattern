package ru.netology;

public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();

        String aBinaryResult = binOps.sum("10111", "1001"); // 23 + 9
        String bBinaryResult = binOps.mult("10111", "1001"); // 23 * 9

        System.out.println("Сумма: " + Integer.parseInt(aBinaryResult, 2));
        System.out.println("Произведение: " + Integer.parseInt(bBinaryResult, 2));


    }
}