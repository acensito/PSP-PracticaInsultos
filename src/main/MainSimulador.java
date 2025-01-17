
package main;

import cliente.Cliente;
import java.util.Scanner;

public class MainSimulador {

    public static void main(String[] args) {
        int cantidad;
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduzca numero de clientes: ");
        cantidad = teclado.nextInt();
        
        for (int i = 0; i < cantidad; i++) {
            Cliente cliente = new Cliente(String.valueOf(i));
            cliente.start();
        }
        
    }
    
}
