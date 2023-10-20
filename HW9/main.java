package HW9;

import com.sun.net.httpserver.HttpServer;
import HW9.model.UserHandler;
import HW9.controller.IUserController;
import HW9.controller.UserControllerList;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        IUserController userStorage = new UserControllerList();
        server.createContext("/users", new UserHandler(userStorage));
        server.start();
        System.out.println("Server started on port 8080");

    }
}