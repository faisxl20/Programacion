import java.util.Scanner; 

public class Actividad_3 {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        // Le vamos a pedir al usuario que introduzca los dos numeros que quiere calcular
        System.out.print ("Por favor, introduzca el primer numero que quiere calcular: ");
        int numero1 = scanner.nextInt();

        System.out.print ("Por favor, introduzca el segundo número que quiere calcular:");
        int numero2 = scanner.nextInt();

        // Hacemos todas las operaciones con los dos numeros que nos ha dado 
        long resultado_suma = numero1 + numero2;
        long resultado_resta = numero1 - numero2;
        long resultado_mult = numero1 * numero2;
        long resultado_div = numero1 / numero2;

        // Aqui mostramos el resultado de las operaciones que hemos realizado
        System.out.println ("El resultado de la suma es "+ resultado_suma + "");
        System.out.println ("El resultado de la resta es "+ resultado_resta + "");
        System.out.println ("El resultado de la multiplicación es "+ resultado_mult + "");
        System.out.println ("El resultado de la división es " + resultado_div + ""); 

        // Cerramos el programa
        scanner.close();
    }
}