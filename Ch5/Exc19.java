/* 19. (2) Напишите метод, получающий список аргументов переменной длины с массивом
String. Убедитесь в том, что этому методу может передаваться как список объектов
string, разделенных запятыми, так и string[]. */

public class Exc19 {
    static void printStrings(String... args) {
        for(String s : args) {
        System.out.println(s);
        }
    }
    public static void main(String[] args) {
        printStrings("One","Two","Three");
        printStrings(new String[] { "First element", "Second element", "Third element"});
    }
}
