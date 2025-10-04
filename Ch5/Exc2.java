/* 2. (2) Создайте класс с полем String, инициализируемым в точке определения, и другим
полем, инициализируемым конструктором. Чем отличаются эти два подхода? */

public class Exc2 {
    String field1 = "Word";

    public Exc2() {
        String field2 = "Word2";
        System.out.println(field2);
    }
    public static void main(String[] args) {
        Exc2 construct = new Exc2();
        System.out.println(construct.field1);
    }
    
}
// Отличаются они тем, что конструктор гарантирует инициализацию поля field2 и позволяет избежать обращения к полю field2 через имя объекта. 