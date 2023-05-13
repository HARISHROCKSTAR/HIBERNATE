package Com.ciq.Client;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import Com.Util.HibernateUtil;
import Com.ciq.Entity.Address;
import Com.ciq.Entity.Person;

public class ClientTest {
	public static void main(String[] args) {
		
	Session s=HibernateUtil.getseSession();
     s.getTransaction().begin();
     
    Person person=new Person("Harish","Rocky");
    Address address=new Address("HYD","TS",person);
   s.save(person);
    s.save(address);
//    
//    Address address1=s.get(Address.class, 1l);
//    System.out.println(address);
    
//    Criteria cr=s.createCriteria(Address.class);
//    Criterion cn= Restrictions.eq("city", "HYD");
//    cr.add(cn);
//    Address uniqueResult=(Address)cr.uniqueResult();
//    System.out.println(uniqueResult.getPerson().getFirstname());
    s.getTransaction().commit();
    HibernateUtil.closeSession(s);
}
}