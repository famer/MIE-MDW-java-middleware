package services;

import javax.jws.*;

@WebService(name="Order")
public class Order {
 
    @WebMethod(operationName="processOrder")
    @WebResult(name="isProcessed")
    public String processOrder(@WebParam(name="productName") String productName, @WebParam(name="price") int price, @WebParam(name="cardNumber") String cardNumber, @WebParam(name="cardOwner") String cardOwner, @WebParam(name="isValid") boolean isValid){
        return (isValid?"processed":"not processed");
    }
 
}