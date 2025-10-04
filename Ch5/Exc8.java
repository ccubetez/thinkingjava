/* 8. (1) Создайте класс с двумя методами. В первом методе дважды вызовите второй
метод: один раз без ключевого слова this, а во второй с this — просто для того, чтобы
убедиться в работоспособности этого синтаксиса; не используйте этот способ
вызова на практике. */

public class Exc8 {
    void method1() { 
        method2();
        this.method2();};
    void method2() {};
    public static void main(String[] args) {
        Exc8 test = new Exc8();
        test.method1();
    }

}