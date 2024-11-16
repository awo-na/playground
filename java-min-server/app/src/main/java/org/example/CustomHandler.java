package org.example;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

import java.io.OutputStream;

public class CustomHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws java.io.IOException {
        // リクエストURIを取得
        String requestURI = exchange.getRequestURI().toString();

        // レスポンスを作成
        String response = "You accessed: " + requestURI;

        // HTTPレスポンスを送信
        exchange.sendResponseHeaders(200, response.getBytes().length);
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }
}
