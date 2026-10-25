public class Ejercicio04 {
    public static void main(String[] args) {
        int var1 = 20, var2 = 1, var3 = 3;
        double result = var1 / (var2 + var3) + (var3 - var2);
        boolean mayorTres = result >= 3;
        System.out.println("Es el resultado mayor que 3? : " + mayorTres);
    }
}
