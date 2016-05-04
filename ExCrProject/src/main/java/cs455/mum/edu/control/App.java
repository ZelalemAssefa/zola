package cs455.mum.edu.control;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cs455.mum.edu.domain.Movie;




/**
 * Hello world!
 *
 */
public class App 
{
	
	private static EntityManagerFactory emf;

	static {
		try {
			emf = Persistence.createEntityManagerFactory("cs544");
		} catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static void main(String[] args) {

		EntityManager entitymanager = emf.createEntityManager();
		entitymanager.getTransaction().begin();
           Movie mv1=new Movie();
           mv1.setTitle("Titanic");
           mv1.setYear(1995);
           //i will continue on this
		 
               
		   entitymanager.getTransaction().commit();
		   entitymanager.close();
		  emf.close();
		   }
		}