/* 13. (1) Проверьте истинность утверждений из предыдущего абзаца. */


    class Spoon {
    public Spoon(int marker) {
            System.out.println("This is Spoon " + marker);
        } 
    }
    class Spoons {
        static Spoon spoon1;
        static Spoon spoon2;
        static {
            spoon1 = new Spoon(1);
            spoon2 = new Spoon(2);
        }
    }
    public class Exc11 {
    public static void main(String[] args) {
        // Spoons makespoons = new Spoons();
        Spoon makenew = new Spoon(1);
    }
}