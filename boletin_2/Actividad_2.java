import java.util.Scanner;

public class Actividad_2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Le pedimos al usuario las medidas de los lados del cuadrado
        System.out.print ("Por favor, introduce la medida de los lados del cuadrado: ");
        int lado = scanner.nextInt();

        // Ahora calculamos el área del cuadrado con los datos que nos ha dado el usuario
        long area = lado * lado;

        // Aqui mostramos la medida del área del cuadrado
        System.out.println ("El área de este cuadrado es "+ area +" centrimetros cuadrados.");
        
        // Cerramos el programa
        scanner.close();
    }

}
