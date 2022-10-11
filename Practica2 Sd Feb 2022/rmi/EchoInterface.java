
package rmi;

//Interfaz de tipo remota, cabe resaltar que
// solo tiene el metodo echo ( no hay instrucciones) 
public interface EchoInterface extends java.rmi.Remote {
    public int pago(String cantidad, String tarjeta, String cvv, String total) throws java.rmi.RemoteException;
}
