/**
 * ServicePortBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tut4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServicePortBindingImpl implements tut4.Service{
    public double getSQRT(double arg0) throws java.rmi.RemoteException {
        return -3;
    }

    public double makeOperation(double arg0, double arg1, int arg2) throws java.rmi.RemoteException {
        return -3;
    }

    public java.lang.String getDate() throws java.rmi.RemoteException {
        return null;
    }
    
    public boolean validateUsername(String username) {
    	if ( username.equals("tatartim") ) {
    			return true;
    	}
    	return false;
    }
    
    public boolean validateEmail(String email) {
    	if ( email.equals("tatartim@fit.cvut.cz") ) {
    		return true;
    	}
    	String[] result = email.split("@");
    	if ( result[1].equals("fit.cvut.cz") ) {
    		return true;
    	}
    	return false;
    }

}
