import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ConvertirMoneda convertir = new ConvertirMoneda();

        int opcionEscogida = 0;

        while ( opcionEscogida != 7) {   // Bucle While para poder realizar varias conversiones

            try {


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
                        
                        
                        *******************************************
                        """;

                System.out.println(mensaje);
                System.out.println("Elija una opción válida:\n");
                opcionEscogida = scanner.nextInt();


                if (opcionEscogida >= 1 && opcionEscogida <= 6) {

                    System.out.print("Escriba la cantidad a convertir:\n");

                    double cantidadDigitada = scanner.nextDouble();
                    System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_"); //Para separar el resultado
                    System.out.println("Resultado:");

                    convertir.convertirMoneda(opcionEscogida, cantidadDigitada);


                } else if (opcionEscogida == 7) {
                    System.out.println("Gracias por usar el conversor. ¡Hasta pronto!");


                } else {
                    System.out.println("Opción no válida. Intente nuevamente.");
                }

                System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-"); // Líneas para separar cada operación


            } catch (InputMismatchException e) {

                System.out.println("Error: Debe ingresar un dato valido.");
                scanner.next();  // Limpia el dato inválido de los buffers, de lo contario queda repitiéndose una y otra vez
                System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-"); // Líneas para separar cada operación

            }
        }
        scanner.close();


    }
}
