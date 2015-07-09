package mytools;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	private static final EntityManagerFactory emf =
			Persistence.createEntityManagerFactory("SocialMediaWeb_Group");

public static EntityManagerFactory getEmFactory()
{
	return emf;
}
}
