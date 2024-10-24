package templatemethod;

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SocialNetwork network = null;
        // username and password
        System.out.print("Nome do Usuário: ");
        String username = scan.next();
        System.out.print("Senha: ");
        String password = scan.next();
        // enter with message
        System.out.print("Coloque o seu Post: ");
        String message = reader.readLine();
        System.out.print("Escolha a Rede Social a ser postada: [facebook/x] ");
        String socialNet = scan.next();
        if (socialNet.equalsIgnoreCase("facebook")) {
            network = new FacebookNetwork(username, password);
            network.postData(message);
        } else {
            network = new XNetwork(username, password);
            network.postData(message);
        }
    }
}
