package ru.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {

        try (Socket socket = new Socket(InetAddress.getLocalHost(), 13228)) {
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out.println(String.format("Vasya"));
            final String message = in.readLine();
            System.out.println(message);
        }
    }
}