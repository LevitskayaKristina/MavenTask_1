package org.example;

public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 150;
        int actual = service.calculate(5_000, true);
    }
}
