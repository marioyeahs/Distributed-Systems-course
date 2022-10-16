
package rmi;

//Interfaz de tipo remota, cabe resaltar que
// solo tiene el metodo echo ( no hya instrucciones) 
public interface EchoInt extends java.rmi.Remote {
    public int pago(String cantidad, String tarjeta, String cvv, String total) throws java.rmi.RemoteException;
}
