package appTest;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;

import model.Dbuser;


import mytools.DBUtil;

import org.junit.Test;



public class DisplayUserListTest {

	@Test
	public void test() {
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		try{
			Dbuser user = em.find(Dbuser.class,(long)1);
			assertEquals("shruthi" , user.getName());
		}catch(Exception e){
			fail("Not yet implemented"+e.getMessage());
		}
		
	}

}
