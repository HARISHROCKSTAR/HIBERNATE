package ComponentsDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Com.ciq.UtilComponents.ComponentConnections;

public class ClientTest {

		public static void main(String[] args) {
			Session session =ComponentConnections .getSession();
			session.getTransaction().begin();
			LeaveTracker lTracker = new LeaveTracker(2, 12, 90, 5);
			LeaveTracker lTracker1 = new LeaveTracker(5, 44, 78, 544);
			Employee employee = new Employee("anil", 22000, lTracker);
			Employee employee1 = new Employee("harish", 556500, lTracker1);
			session.persist(employee);
			session.persist(employee1);
			session.getTransaction().commit();
			ComponentConnections .closeSession(session);
		}
		
		
		
		
	}

