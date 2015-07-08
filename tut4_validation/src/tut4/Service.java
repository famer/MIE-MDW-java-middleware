/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tut4;

public interface Service extends java.rmi.Remote {
    public double getSQRT(double arg0) throws java.rmi.RemoteException;
    public double makeOperation(double arg0, double arg1, int arg2) throws java.rmi.RemoteException;
    public java.lang.String getDate() throws java.rmi.RemoteException;
}
