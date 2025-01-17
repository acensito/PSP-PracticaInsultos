
package servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor extends Thread {

    private final Socket skClient;
    private static final int PORT = 2000;

    public Servidor(Socket skClient) {
        this.skClient = skClient;
    }
    
    public static void main (String[] args) {
        try (ServerSocket skServer = new ServerSocket(PORT)) {
            System.out.println("Servidor iniciado en el puerto " + PORT);
            while (true) {                
                Socket skt = skServer.accept();
                new Servidor(skt).start();
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    @Override
    public void run() {
        int seleccion;
        
        try (DataInputStream dataIN = new DataInputStream(skClient.getInputStream());
             DataOutputStream dataOUT = new DataOutputStream(skClient.getOutputStream())) {
            //obtenemos la seleccion del cliente
            seleccion = dataIN.readInt();
            //respondemos con una frase aleatoria segun la seleccion
            dataOUT.writeUTF(seleccion == 0 ? Frases.getInsulto() : Frases.getPiropo());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
