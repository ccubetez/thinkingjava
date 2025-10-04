/* 21. (1) Создайте перечисление с названиями шести типов бумажных денег. Переберите
результат values() с выводом каждого значения и его ordinal(). */

public class Exc21 {
    public enum Money {
        PENNY, NICKEL, DIME, QUARTER, FIFTYCENT, DOLLAR
    }
    public static void main(String[] args) {
        for(Money m : Money.values()) {
            System.out.println(m + " " + m.ordinal());
        }
    }
}