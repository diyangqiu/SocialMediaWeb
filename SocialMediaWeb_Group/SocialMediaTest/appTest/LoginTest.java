package appTest;

import static org.junit.Assert.*;
import model.Dbuser;
import org.junit.Test;

public class LoginTest{

	@Test
	public void test() {	
			boolean testlog = false;
			
			try {
				Dbuser user = new Dbuser();	
				user.setEmail("testemail");
				
				if( existEvaluate(user) == true ){
					testlog = true;
				}else{
					testlog = false;					
				}
			}
			finally{	
				assertEquals(testlog, true);
			}
	}
	protected boolean existEvaluate(Dbuser user){
		return (user.getEmail() != null && user.getEmail() != "") ? true : false;
	}//END existEvaluate
}
