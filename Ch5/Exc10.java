/* 10. (2) Создайте класс с методом finalize(), который выводит сообщение. В методе
main() создайте объект вашего класса. Объясните поведение программы. */

public class Exc10 {
    public static void main(String[] args) {
        new Exc10();
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Вызывается finalize()");
    }
    
}