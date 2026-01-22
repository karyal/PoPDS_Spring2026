package day3;

public class MobileTest {

	public static void main(String[] args) {
		Mobile m1; //Declare
		m1 = new Mobile(); //Allocate Memory
		m1.mfgBy="Colors India Ltd"; //Set Value
		m1.mfgYear="2020";
		m1.model="C40000";
		System.out.println(m1.mfgBy); //Get Value
		
		m1.callToOther(); //Call to other
		m1.receiveCall(); //Receive call from other
		m1.textToOther(); //Send text message
		m1.receiveText(); //Read text message of other

	}

}
