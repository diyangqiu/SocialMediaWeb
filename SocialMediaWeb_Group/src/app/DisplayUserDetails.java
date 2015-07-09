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

		List<Dbuser> userdetails = displayUserDetails();

		try {

			tableInfo += tableInfo += "<tr><th>Nickname</th><th>Name</th><th>Email Address</th><th>Address</th><th>Favorite Song</th><th>Favorite Movie</th><th>Favorite Color</th></tr>";
			
			request.setAttribute("tableInfo", tableInfo);
			
			for (int i = 0; i < userdetails.size(); i++) {

				tableInfo += "<tr><td>" + userdetails.get(i).getNickname()
						+ "</th><th>" + userdetails.get(i).getName()
						+ "</th><th>" + userdetails.get(i).getEmail()
						+ "</th><th>" + userdetails.get(i).getAddress()
						+ "</th><th>" + userdetails.get(i).getFavsong()
						+ "</th><th>" + userdetails.get(i).getFavmovie()
						+ "</th><th>" + userdetails.get(i).getFavcolor()
						+ "</td></tr>";

			}
			request.setAttribute("tableInfo", tableInfo);
		} catch (Exception e) {
			request.setAttribute(
					"message",
					"<div class='alert alert-danger' role='alert'>Error! Could not diplay users details! "
							+ e + "</div>");
			e.printStackTrace();
		}

		getServletContext().getRequestDispatcher("/displayUserDetails.jsp")
				.forward(request, response);
	}

	protected static List<Dbuser> displayUserDetails() {

		EntityManager em = mytools.DBUtil.getEmFactory().createEntityManager();
		String qString = "SELECT d FROM Dbuser d";
		TypedQuery<Dbuser> q = em.createQuery(qString, Dbuser.class);
		System.out.println("1");
		List<Dbuser> i = null;
		try {

			i = q.getResultList();
			if (i == null || i.isEmpty()) {
				i = null;
			}
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
