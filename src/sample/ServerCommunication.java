package sample;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.URI;
import java.net.http.HttpResponse;

public class ServerCommunication {


    HttpClient client;
    HttpRequest request;



    public void logIn(String login, String password) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("localhost:8080/login"))
                    .build();



            HttpResponse<String> response = client.send(request,
                    HttpResponse.BodyHandlers.ofString(login));


            System.out.println(response.body());



        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
