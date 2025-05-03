import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class LlamarApi {


    public Moneda convertir() {

        String clave="9ad86510b31a5905733a9d5b";

        String direccion = ("https://v6.exchangerate-api.com/v6/"+ clave + "/latest/USD");


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()       //Construye una solicitud HTTP
                .uri(URI.create(direccion))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString()); //llama a Client y enviá dentro de los parametros la solicitud



            return new Gson().fromJson(response.body(), Moneda.class); // convirtio el json que se obtuvo a tipo Moneda

        } catch (IOException | InterruptedException e) {

            throw new RuntimeException(e);

        }

    }
}