package services;
import javax.jws.*;
 
@WebService(name="ProductOrder")
public class ProductOrder {
 
    @WebMethod(operationName="orderProduct")
    @WebResult(name="isProcessed")
    public String orderProduct(@WebParam(name="name") String productName, @WebParam(name="price") int price, @WebParam(name="count") int count, @WebParam(name="cNumber") String cardNumber, @WebParam(name="cOwner") String cardOwner){
        return "processed";
    }
 
}

