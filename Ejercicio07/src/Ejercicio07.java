public class Ejercicio07 {
    public static void main(String args[]){
        int var1 = 81, var2 = 9, var3 = 3, var4 = 10, var5 = 1, var6 = 100, var7 = 25;
        boolean result1 = (Math.sqrt(var1) + var2) / var3 == var3;
        boolean result2 = (var4 > var5);
        boolean result3 = var6 / var7 >= Math.sqrt(var6);
        boolean result4 = result1 || result2;
        boolean result5 = result4 && result3;
        System.out.println("El resultado es: " + result5);
    }
}
