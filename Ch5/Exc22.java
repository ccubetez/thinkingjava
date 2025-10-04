/* 22. (2) Напишите команду switch для перечисления из предыдущего примера. Для
каждого случая выведите расширенное описание конкретной валюты. */

public class Exc22 {
    public enum MoneyKinds {
        PENNY, NICKEL, DIME, QUARTER, FIFTYCENT, DOLLAR
    }
    
    public static class Money {
    MoneyKinds whatMoney;
    public Money(MoneyKinds whatMoney) { this.whatMoney = whatMoney;}
    public void describe() {
        switch (whatMoney) {
            case PENNY: System.out.println("Один пенни"); break;
            case NICKEL: System.out.println("Пять центов"); break;
            case DIME: System.out.println("Десять центов"); break;
            case QUARTER: System.out.println("Четвертак"); break;
            case FIFTYCENT: System.out.println("Пятьдесят центов"); break;
            case DOLLAR: System.out.println("Доллар"); break;
            default:
                throw new AssertionError();
        }
    }
    }
    public static void main(String[] args) {
        Money penny = new Money(MoneyKinds.PENNY);
        Money nickel = new Money(MoneyKinds.NICKEL);
        Money dime = new Money(MoneyKinds.DIME);
        Money quarter = new Money(MoneyKinds.QUARTER);
        Money fifty = new Money(MoneyKinds.FIFTYCENT);
        Money dollar = new Money(MoneyKinds.DOLLAR);

        penny.describe();
    }
}