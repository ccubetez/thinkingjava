/* (1) Завершите предыдущее упражнение — создайте объекты, которыми заполняется
массив ссылок. */

public class Exc18 {

    public Exc18(String a) {
        System.out.println("Argument is " + a);
    }
    public static void main(String[] args) {
        Exc18[] ar = {
            new Exc18("a"),
            new Exc18("b"),
            new Exc18("c"),
        };
    }     
}
    
