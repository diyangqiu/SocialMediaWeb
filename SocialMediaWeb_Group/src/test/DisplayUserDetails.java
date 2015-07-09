package test;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;

import model.Dbuser;
import mytools.DBUtil;

import org.junit.Test;

public class DisplayUserDetails {

	@Test
	public void testDisplayUserDetails() 
	{
		
		EntityManager em = mytools.DBUtil.getEmFactory().createEntityManager();
		List<Dbuser> userList = em.createNamedQuery("Dbuser.findAll").getResultList();
		assertEquals(userList.size(), 3);

	
	}

}
