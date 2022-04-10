import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.InputStreamReader;

import java.io.OutputStreamWriter;

import java.net.ServerSocket;

import java.net.Socket;



public class Server {

    public static void main(String[] args ) {

        try {

            //���� ����

            ServerSocket serverSocket = new ServerSocket(9000);

            //client ���� accept

            Socket socket = serverSocket.accept();

            

            //client�� ���� ������ ���

            BufferedReader bufReader =

              new BufferedReader( new InputStreamReader( socket.getInputStream()));

            String message = bufReader.readLine();

            System.out.println("Message : " + message );

            

            //client�� ������ ����

            BufferedWriter bufWriter = 

              new BufferedWriter( new OutputStreamWriter( socket.getOutputStream()));

            bufWriter.write("hello world");

            bufWriter.newLine();

            bufWriter.flush();

            

            socket.close();

            serverSocket.close();

            bufReader.close();

            bufWriter.close();

            

          }

          catch( Exception e ){

            e.printStackTrace();

          }

            

     }

}

