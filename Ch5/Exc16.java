/* 16. (1) Создайте массив объектов string. Присвойте объект String каждому элементу.
Выведите содержимое массива в цикле for. */

public class Exc16 {
    public static void main(String[] args) {
        String[] a = new String[5];
        for( int i = 0; i < 5; i++) {
            a[i] = "Word";
        }
        for( int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
    }
}