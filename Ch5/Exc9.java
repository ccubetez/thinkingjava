/* 9. (1) Подготовьте класс с двумя (перегруженными) конструкторами. Используя
ключевое слово this, вызовите второй конструктор из первого. */

public class Exc9 {

    Exc9(int a) {
        System.out.println("Вызов конструктора с параметром int");
    }
    Exc9(String b) {
        System.out.println("Вызов конструктора с параметром String");
    }
    Exc9() {
        this(48);
        System.out.println("Вызов конструктора по умолчанию");
    }
    public static void main(String[] args) {
        Exc9 objkt = new Exc9();
    }
}