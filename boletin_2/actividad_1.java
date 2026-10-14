import java.util.Scanner;

public class Actividad_1 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Le vamos a pedir al usuario que escriba los años
    System.out.print ("Por favor, introduzca el número de años: ");
    int anos = scanner.nextInt();

    // Calculamos las horas que tiene los años introducidos con la siguiente operacion
    long horas = anos * 365 * 24;

    // Aqui mostramos las horas que tiene la cantidad de años que ha introducido el usuario
    System.out.println("En "+ anos +" años hay un total de "+ horas + " horas.");

    // Cerramos el programa
    scanner.close(); 
    

}
}
