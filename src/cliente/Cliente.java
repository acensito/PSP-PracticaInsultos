
package cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Random;

public class Cliente extends Thread {

    private static final String HOST = "localhost";
    private static final int PORT = 2000;
    private final Random random = new Random();

    public Cliente(String name) {
        super(name);
    }

    @Override
    public void run() {
        
        //conectamos al servidor y abrimos los streams de entrada/salida de datos
        try (Socket skClient = new Socket(HOST, PORT);
            DataInputStream dataIN = new DataInputStream(skClient.getInputStream());
            DataOutputStream dataOUT = new DataOutputStream(skClient.getOutputStream())) {
            
            try {
                //mandamos que mensaje queremos, 0 insulto, 1 piropo
                dataOUT.writeInt(random.nextInt(2));
                //mostramos el mensaje que hemos seleccionado
                System.out.println(getName() + " recibe como mensaje: " + dataIN.readUTF());
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

}