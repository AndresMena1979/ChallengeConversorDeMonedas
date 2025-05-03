public class ConvertirMoneda {

    public void convertirMoneda(int opcion, double cantidad) {

        LlamarApi llamarApi = new LlamarApi();
        Moneda datos = llamarApi.convertir();  // Datos reales de la API

        double resultado;

        switch (opcion) {
            case 1 -> { // USD => Peso argentino
                double tasa = datos.conversion_rates().get("ARS");
                resultado = cantidad * tasa;
                System.out.printf("%.2f USD = %.2f ARS%n", cantidad, resultado);
            }
            case 2 -> { // Peso argentino => USD
                double tasa = datos.conversion_rates().get("ARS");
                resultado = cantidad / tasa;
                System.out.printf("%.2f ARS = %.2f USD%n", cantidad, resultado);
            }
            case 3 -> { // USD => BRL
                double tasa = datos.conversion_rates().get("BRL");
                resultado = cantidad * tasa;
                System.out.printf("%.2f USD = %.2f BRL%n", cantidad, resultado);
            }
            case 4 -> { // BRL => USD
                double tasa = datos.conversion_rates().get("BRL");
                resultado = cantidad / tasa;
                System.out.printf("%.2f BRL = %.2f USD%n", cantidad, resultado);
            }
            case 5 -> { // USD => COP
                double tasa = datos.conversion_rates().get("COP");
                resultado = cantidad * tasa;
                System.out.printf("%.2f USD = %.2f COP%n", cantidad, resultado);
            }
            case 6 -> { // COP => USD
                double tasa = datos.conversion_rates().get("COP");
                resultado = cantidad / tasa;
                System.out.printf("%.2f COP = %.2f USD%n", cantidad, resultado);
            }
            case 7 -> {
                System.out.println("Gracias por usar el conversor. ¡Hasta luego!");
                return;
            }
            default -> {
                System.out.println("Opción no válida.");
                return;
            }
        }
    }
}
