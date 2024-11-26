package org.example;

import java.io.OutputStream;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class HelloHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws java.io.IOException {
        String response = "Hello, this is a minimal HTTPS server!";
        exchange.sendResponseHeaders(200, response.getBytes().length); // 200 OK
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
