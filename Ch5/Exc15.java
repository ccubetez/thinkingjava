public class Exc15 {
    private String s;
    {
        s = "Инициализация в блоке нестатических данных";
        System.out.println(s);
    }
    private Exc15() {
        s = "Инициализация в конструкторе";
        System.out.println(s);
    }
    public static void main(String[] args) {
        new Exc15();
    }
}