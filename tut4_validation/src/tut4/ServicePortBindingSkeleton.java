/**
 * ServicePortBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tut4;

public class ServicePortBindingSkeleton implements tut4.Service, org.apache.axis.wsdl.Skeleton {
    private tut4.Service impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getSQRT", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tut4/", "getSQRT"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getSQRT") == null) {
            _myOperations.put("getSQRT", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getSQRT")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("makeOperation", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tut4/", "makeOperation"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("makeOperation") == null) {
            _myOperations.put("makeOperation", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("makeOperation")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
        };
        _oper = new org.apache.axis.description.OperationDesc("getDate", _params, new javax.xml.namespace.QName("", "return"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://tut4/", "getDate"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getDate") == null) {
            _myOperations.put("getDate", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getDate")).add(_oper);
    }

    public ServicePortBindingSkeleton() {
        this.impl = new tut4.ServicePortBindingImpl();
    }

    public ServicePortBindingSkeleton(tut4.Service impl) {
        this.impl = impl;
    }
    public double getSQRT(double arg0) throws java.rmi.RemoteException
    {
        double ret = impl.getSQRT(arg0);
        return ret;
    }

    public double makeOperation(double arg0, double arg1, int arg2) throws java.rmi.RemoteException
    {
        double ret = impl.makeOperation(arg0, arg1, arg2);
        return ret;
    }

    public java.lang.String getDate() throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.getDate();
        return ret;
    }

}
