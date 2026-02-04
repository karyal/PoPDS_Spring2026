package day11;
import day12.Person;
public class PersonTest {

	public static void main(String[] args) {
		Person p2=new Person();
		//p2.pid=2;//default Cann't access field of class of different package
		p2.fullName="Ayush Sharma";//public
		//p2.address="Kopundole";// private cannt access
		//p2.email="ayush@gmail.com"; //protected cannt access
		
		//Retrieve
		System.out.println(p2.fullName);
		

	}

}
