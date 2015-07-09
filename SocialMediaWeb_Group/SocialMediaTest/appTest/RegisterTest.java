package appTest;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;

import model.Dbuser;
import mytools.DBUtil;

import org.junit.Test;

import app.Register;


public class RegisterTest {

	@Test
	public void test() {
		Dbuser user = new Dbuser();
		user.setAddress("q");
		user.setEmail("a@b.c");
		user.setFavcolor("q");
		user.setFavmovie("c");
		user.setFavsong("g");
		user.setName("h");
		user.setNickname("r");
		user.setPassword("h");
		
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		List<Dbuser> userList1 = em.createNamedQuery("Dbuser.findAll").getResultList();
		Register.regiserUser(user);
		List<Dbuser> usersList2 = em.createNamedQuery("Dbuser.findAll").getResultList();
		
		assertEquals(userList1.size() + 1, usersList2.size());
	}

}
