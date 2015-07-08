package tut4;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.jws.WebService;

@WebService
public class Service {
	
	public String getDate() {
		Date dt = new Date();
		return dt.toString();
	}
	
	public double getSQRT( double x ) {
		return Math.sqrt(x);
	}
	
	public double makeOperation( double x, double y, int op ) {
		switch ( op ) {
			 case 1:
				 return x + y;
			 case 2:
				 return x*y;
				 
			 case 3:
				 if ( y != 0 ) {
					 return x/y;
				 }
				 break;
			default:
				return x;
				 
		}
		return x;
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
    	Pattern p = Pattern.compile("^.+@fit.cvut.cz$");
    	Matcher m = p.matcher(email);
    	if ( m.matches() )
    		return true;
    	
    	return false;
    }
    
    public boolean validateCard(String number) {
    	Pattern p = Pattern.compile("^[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}$");
    	Matcher m = p.matcher(number);
    	return m.matches();
    }

}
