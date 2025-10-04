/* 6. Измените предыдущее упражнение так, чтобы два перегруженных метода принимали
два аргумента (разных типов) и отличались только порядком их следования
в списке аргументов. Проверьте, работает ли это. */

public class Exc6 {

    public Exc6(String x, int y) {
        System.out.println("Bark! It is constructor calling String first and then int!");
    }
    public Exc6(int y, String x) {
        System.out.println("Bark! It is constructor calling int first and then String!");
    }
    public static void main(String[] args) {
        Exc6 construct1 = new Exc6("String", 1);
        Exc6 construct2 = new Exc6(1, "String");
    }
    
}

// работает, сука!