package app;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dbuser;


/**
 * Servlet implementation class displayUserDetails
 */
@WebServlet("/displayUserDetails")
public class DisplayUserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DisplayUserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String tableInfo = "";
		String userID = request.getParameter("id");
		System.out.println(userID);
		Dbuser user = displayUserDetails(userID);

		
		try {

			tableInfo += tableInfo += "<tr><th>Nickname</th><th>Name</th><th>Email Address</th><th>Address</th><th>Favorite Song</th><th>Favorite Movie</th><th>Favorite Color</th></tr>";
			
			
			tableInfo += "<tr><td>" + user.getNickname()
						+ "</th><th>" + user.getName()
						+ "</th><th>" + user.getEmail()
						+ "</th><th>" + user.getAddress()
						+ "</th><th>" + user.getFavsong()
						+ "</th><th>" + user.getFavmovie()
						+ "</th><th>" + user.getFavcolor()
						+ "</td></tr>";
			request.setAttribute("tableInfo", tableInfo);
			}		
		
			catch (Exception e) {
			request.setAttribute(
					"message",
					"<div class='alert alert-danger' role='alert'>Error! Could not diplay users details! "
							+ e + "</div>");
			e.printStackTrace();
		}

		getServletContext().getRequestDispatcher("/displayUserDetails.jsp")
				.forward(request, response);
	}

	protected static Dbuser displayUserDetails(String userID) {

		EntityManager em = mytools.DBUtil.getEmFactory().createEntityManager();
		String qString = "SELECT d FROM Dbuser d where d.userid = :userid";
		TypedQuery<Dbuser> q = em.createQuery(qString, Dbuser.class);
		q.setParameter("userid", Long.parseLong(userID));
	
		Dbuser i = null;
		try {

			i = q.getSingleResult();
			
		} catch (NoResultException e) {
			System.out.println(e);
			System.out.println("2");
		}

		finally {
			em.close();
		}

		return i;
	}
	
}
