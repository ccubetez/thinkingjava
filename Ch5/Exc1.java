/* 1. (1) Создайте класс с неинициализированной ссылкой на string. Покажите, что Java
инициализирует ссылку значением null. */

public class Exc1 {
    String str;
    public static void main(String[] args) {
        Exc1 obj1 = new Exc1();
        System.out.println(obj1.str);
    }
}