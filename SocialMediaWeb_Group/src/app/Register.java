package app;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Dbuser;
import mytools.DBUtil;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub\
		String message = "";
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String nickname = request.getParameter("nickname");
		String address = request.getParameter("address");
		String favsong = request.getParameter("favsong");
		String favmovie = request.getParameter("favmovie");
		String favcolor = request.getParameter("favcolor");
		
		Dbuser user = new Dbuser();
		user.setAddress(address);
		user.setEmail(email);
		user.setFavcolor(favcolor);
		user.setFavmovie(favmovie);
		user.setFavsong(favsong);
		user.setName(name);
		user.setNickname(nickname);
		user.setPassword(password);
	
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		try {
			trans.begin();
			em.persist(user);
			trans.commit();
		} catch (Exception e) {
			message = e.toString();
			System.out.println(e.getMessage());
		} finally {
			em.close();
		}
		
		request.setAttribute("message", message);
		request.setAttribute("user", user);
		
		request.getRequestDispatcher("DisplayUserList").forward(request, response);
	}

}
