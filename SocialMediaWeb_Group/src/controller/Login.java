package controller;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Dbuser;
import mytools.DBUtil;

/**
 * SERVLET implementation class Logon.java
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public Login() {
        super();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}//END doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		request.setAttribute("message", null);
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		
		
		
		try {
			Dbuser user = (Dbuser) em.createNamedQuery("Dbuser.findUserByEmailAndPassword")
					.setParameter("email", request.getParameter("email"))
					.setParameter("password", request.getParameter("password"))
					.getSingleResult();			
			
			/* If they exist:
			 * Create/set the logged in session variable to true.
			 * Redirect them to the user-list Servlet.java.
			 *
			 * Else:
			 * Set a login fail message.
			 * Redirect them back to the login page.
			 */
			if( existEvaluate(user) == true ){
				session.setAttribute("log", true);
				session.setAttribute("user", user);
				getServletContext().getRequestDispatcher("/DisplayUserList").forward(request, response);
			}else{
				session.setAttribute("log", false);
				request.setAttribute("message", "Your Email/Password combination is incorect.");
				getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
			}
		}//END TRY
		catch (Exception e){	
		}
		
		
	}//END doPost
	
	//Returns if the customer email exists.
	protected boolean existEvaluate(Dbuser user){
		return (user.getEmail() != null && user.getEmail() != "") ? true : false;
	}//END existEvaluate
}//END Servlet.Class Logon.java