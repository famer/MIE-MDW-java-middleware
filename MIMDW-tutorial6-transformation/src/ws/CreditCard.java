

package ws;
 
import javax.jws.*;
 
@WebService(name="CreditCard")
public class CreditCard {
 
    @WebMethod(operationName="validateCard")
    @WebResult(name="isValid")
    public boolean validateCard(@WebParam(name="cardNumber") String cardNumber, @WebParam(name="cardOwner") String cardOwner){
        return ("1234-1234-1234-1234".equals(cardNumber) && "cardowner".equals(cardOwner));
    }
 
}

