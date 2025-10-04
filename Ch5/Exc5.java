/* 5. Создайте класс Dog (собака) с перегруженным методом bark() (лай). Метод должен
быть перегружен для разных примитивных типов данных с целью вывода сообщения
о лае, завывании, поскуливании и т. п. в зависимости от версии перегруженного
метода. Напишите метод main(), вызывающий все версии. */

public class Exc5 {

    public Exc5() {
        System.out.println("Bark! It is default constructor!");
    }
    public Exc5(int x) {
        System.out.println("Bark! It is overloaded constructor accepting int argument!");
    }
    public Exc5(char x) {
        System.out.println("Bark! It is overloaded constructor accepting char argument!");
    }
    public Exc5(float x) {
        System.out.println("Bark! It is overloaded constructor accepting float argument!");
    }
    public Exc5(String x) {
        System.out.println("Bark! It is overloaded constructor accepting String argument!");
    }
    public static void main(String[] args) {
        Exc5 construct1 = new Exc5();
        Exc5 construct2 = new Exc5('y');
        Exc5 construct3 = new Exc5(1.0F);
        Exc5 construct4 = new Exc5("Name");
        Exc5 construct5 = new Exc5(5);
        
    }
}