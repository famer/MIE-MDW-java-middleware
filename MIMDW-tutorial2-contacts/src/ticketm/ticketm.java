package ticketm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mSession.Msession;
import msessionDB.MsessionDB;
import Contact.Contact;
import ContactDB.ContactDB;

/**
 * Servlet implementation class ticketm
 */
public class ticketm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ticketm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String act = request.getParameter("act");

    	HttpSession session = request.getSession(true);
    	String stateAttrName = "state";


    	String mySessionID = session.getId();
    	if ( session.isNew() ) {
    		session.setAttribute(stateAttrName, "NEW");
    	}

    	String state = (String) session.getAttribute(stateAttrName);

    	response.getWriter().println("Previous state: " + state);
    	
    	if ( ( act == null || act.equalsIgnoreCase("NEW") ) && state.equals("COMPLETED") ) {
    		session.setAttribute(stateAttrName, "NEW");
    	}

    	if ( act != null && act.equalsIgnoreCase("PAYMENT") && state.equals("NEW") ) {
    		session.setAttribute(stateAttrName, "PAYMENT");
    	}

    	if ( act != null && act.equalsIgnoreCase("COMPLETED") && state.equals("PAYMENT")  ) {
    		session.setAttribute(stateAttrName, "COMPLETED");
    	}


    	state = (String) session.getAttribute(stateAttrName);

    	response.getWriter().println("New state: " + state);
    	/* 
		Cookie[] cookies = request.getCookies();

		MsessionDB DB = MsessionDB.getInstance();
		String cName = "sess";

		if ((cookies == null) || (cookies.length == 0)) {
			String cValue = "tratata";
			Cookie cookie = new Cookie(cName, cValue);
			response.addCookie(cookie);


			Msession sess = new Msession("cValue", "NEW");
			DB.add(sess);
	    } else { 
			for (int i = 0; i < cookies.length; i++) {
			  String name = cookies[i].getName();
			  String value = cookies[i].getValue();
			  //response.getWriter().println(DB.list().get(0).name);
			  if ( name.equals(cName) ) {
				  response.getWriter().println(name);
				  Msession sess = DB.find(value);
				  if ( sess != null ) {
					  response.getWriter().println(sess.name + ": " + sess.state);
				  }
			  }

			  //response.getWriter().println(name);
			}
	    }

		if ( act == null ) {

		}*/
    	//response.getWriter().println(request.getRemoteAddr() + act);
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
