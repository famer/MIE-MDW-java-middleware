package service;

import java.util.Date;

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

}
