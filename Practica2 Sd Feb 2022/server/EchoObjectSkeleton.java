
package server;

import java.net.*;
import java.io.*;
import java.text.*;
import java.util.*;
import rmi.EchoInterface;

public class EchoObjectSkeleton implements EchoInterface {
    String myURL = "localhost";

    // Constructor de la clase EchoObjectSkeleton
    public EchoObjectSkeleton() {
        try {
            // obtengo el nombre del equipo donde estoy ejecutando y lo guardo en la
            // propiedad MyURL
            myURL = InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            // si no pude conocer el nombre del equipo, mantengo el nombre localhost para
            // MyURL
            myURL = "localhost";
        }
    }

    // el Metodo Echo que es la implementacion de la interfaz EchoInterface
    public int pago(String cantidad, String tarjeta, String cvv, String total) throws java.rmi.RemoteException {
        // int Total_tarjetas = 1000;
        // toma la fecha y hora
        // escribe la fecha y la hora, nombre de compuadora y lo regresa
        System.out.println("En este momento nos encontramos atendiendo a un cliente");

        int longitud = tarjeta.length();
        System.out.println("Tarjeta: " + tarjeta);
        System.out.println("El tamanio del No. de tarjeta es: " + longitud);
        if (longitud == 16) {
            System.out.println("Número de trajeta válido...");
        } else {
            System.out.println("Número de tarejta invalido...");
            return 2;
        }

        int longitud_cvv = cvv.length();
        if (longitud_cvv == 3) {
            System.out.println("CVV valido...");
        } else {
            System.out.println("CVV invalido...");
            return 3;
        }

        int tot_pago = Integer.parseInt(cantidad);
        int tot = Integer.parseInt(total);
        if (tot_pago < tot) {
            tot -= tot_pago;
            System.out.println("Saldo nuevo: " + tot);
            System.out.println("Transacción Exitosa");
            return 1;
        } else {
            System.out.println("Transferencia fallida");
            return 0;
        }

        /*
         * System.out.println("Hemos concluido");
         * 
         * Date h = new Date();
         * // obtengo la fecha y hora actual
         * String fecha = DateFormat.getTimeInstance(3, Locale.FRANCE).format(h);
         * String ret = myURL + ":" + fecha + "> " + input;
         * System.out.println("Procesando: '" + input + "'");
         * try {
         * Thread.sleep(3000); // hilo actual
         * ret = ret + " (retrasada 3 segundos)";
         * } catch (InterruptedException e) {
         * }
         * System.out.println("Procesamiento de '" + input + "'terminado.");
         * return ret;
         */
    }
}
