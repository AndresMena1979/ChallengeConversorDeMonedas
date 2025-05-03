import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ConvertirMoneda convertir = new ConvertirMoneda();

        int opcionEscogida;

        try {
        do {                                                  // Bucle do While para poder realizar varias conversiones
            String mensaje = """
                    *****************************************
                    Sea bienvenido/a al Conversor de Moneda.
                    
                    1) Dólar =>> Peso argentino.
                    2) Peso argentino =>> Dólar.
                    3) Dólar =>> Real brasilero.
                    4) Real brasilero =>> Dólar.
                    5) Dólar =>> Peso colombiano.
                    6) Peso colombiano =>> Dólar.
                    7) Salir.
                    
                    Elija una opción válida:
                    *******************************************
                    """;

            System.out.println(mensaje);
            opcionEscogida = scanner.nextInt();



                if (opcionEscogida >= 1 && opcionEscogida <= 6) {

                    System.out.print("Escriba la cantidad a convertir: ");

                    double cantidadDigitada = scanner.nextDouble();

                    convertir.convertirMoneda(opcionEscogida, cantidadDigitada);

                } else if (opcionEscogida == 7) {
                    System.out.println("Gracias por usar el conversor. ¡Hasta luego!");

                } else {
                    System.out.println("Opción no válida. Intente nuevamente.");
                }

                System.out.println("-----------------------------------------"); // Línea para separar cada operación

            } while (opcionEscogida != 7) ;    // Mientras e opcionEscogida sea diferente de 7 el bucle se repite

        } catch (InputMismatchException e) {

            System.out.println("Error: Debe ingresar un número valido.");
        }

            scanner.close();


    }
}
