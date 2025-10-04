/* 14. (1) Создайте класс с полем static string, инициализируемым в точке определения,
и другим полем, инициализируемым в блоке static. Добавьте статический метод,
который выводит значения полей и демонстрирует, что оба поля инициализируются
перед использованием. */

public class Exc14 {
    static class Testfield {
        static String test1 = "This is test1";
        static String test2;
        static {
            test2 = "This is test2";
            System.out.println("test2 and test1 are initialized");
        }

        public Testfield() {
            System.out.println(test1 + " " + test2);
        }
        
    }
    static void testmethod() {
        Testfield test = new Testfield();
    }
    public static void main(String[] args) {
        testmethod();
    }
}