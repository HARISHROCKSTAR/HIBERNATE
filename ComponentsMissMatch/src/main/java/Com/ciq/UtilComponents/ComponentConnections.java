package Com.ciq.UtilComponents;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ComponentConnections {
	
	public static SessionFactory sf;
	
	static {
		Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
		sf=configuration.buildSessionFactory();
		System.out.println(sf);
	}
	public static Session getSession() {
		return sf.openSession();
		
	}
	
	public static void closeSession(Session session) {
		if(session!=null) {
			session.close();
		}
}
	public static void main(String[] args) {
		System.out.println(getSession());
		
	}
}
	