/* 4. Добавьте к классу из упражнения 3 перегруженный конструктор, принимающий
в качестве параметра строку (string) и распечатывающий ее вместе с сообщением. */

public class Exc4 {

    public Exc4() {
        System.out.println("Calling default constructor");
    }
    public Exc4(String str) {
        System.out.println(str);
    }
    public static void main(String[] args) {
        Exc4 construct1 = new Exc4();
        Exc4 construct2 = new Exc4("Calling overload");
    }
    
}