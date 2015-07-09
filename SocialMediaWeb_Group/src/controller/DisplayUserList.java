package controller;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class DisplayUserList
 */
@WebServlet("/DisplayUserList")
public class DisplayUserList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayUserList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		trans.begin();
																									
		
		try{
			//em.persist(user); No need of persist to retrieve from the d/b its needed to send value to the d/b
			
			
			List<Dbuser> userlist = em.createNamedQuery("Dbuser.findAll").getResultList();
			request.setAttribute("userlist", userlist);
			//System.out.println(userlist.size());
			
		}catch(Exception e){
			System.out.println("Exception in Display user servlet"+e.getMessage());
		}finally{
			em.close();
		}
		request.getRequestDispatcher("/UserList.jsp").forward(request, response);
	}

}
//These are to register the user it's jason's module i.e these lines before try is to get the parameter from the user input
//and set the value in the d/b
/*String email = request.getParameter("email");
String password = request.getParameter("password");
String name = request.getParameter("name");
String nickname = request.getParameter("nickname");
String address = request.getParameter("address");
String favsong = request.getParameter("favsong");
String favcolor = request.getParameter("favcolor");
String favmovie = request.getParameter("favmovie"); 
Dbuser user = new Dbuser();
user.setPassword(password);
user.setNickname(nickname);
user.setName(name);
user.setAddress(address);
user.setEmail(email);
user.setFavcolor(favcolor);
user.setFavmovie(favmovie);
user.setFavsong(favsong); */
