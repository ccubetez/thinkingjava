/* 3. (1) Создайте класс с конструктором по умолчанию (без параметров), который выводит
на экран сообщение. Создайте объект этого класса. */

public class Exc3 {

    public Exc3() {
        System.out.println("Calling default constructor");
    }
    public static void main(String[] args) {
        Exc3 construct = new Exc3();
    }
    
}