package day8;

public class PersonTest {

	public static void main(String[] args) {
		//How to test person class?
		//Create an object; Initialize an object
		//set values, process values, get values
		
		Person person1; //object declare
		person1=new Person(); //default constructor
		person1.setPid(1); //Setter 
		System.out.println(person1.getPid());//Getter
		System.out.println(person1);//toString
		
		Person person2=new Person(2); //Declare and initialize
		person2.setPid(3); //Setter
		System.out.println(person2.getPid()); //Getter
		System.out.println(person2); //toString
		
		System.out.println(person1==person2); //Equals to
		System.out.println(person1!=person2); //Not Equals to
		//System.out.println(person1>person2);
		//System.out.println(person1>=person2);
		//System.out.println(person1<person2);
		//System.out.println(person1<=person2);
		
		Person person3 = person1; //memory of person refer by person3
		System.out.println(person1==person3); //Equals to
		
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		System.out.println(person3.hashCode());
		
	}

}
