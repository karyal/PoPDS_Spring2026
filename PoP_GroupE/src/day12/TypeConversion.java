package day12;

public class TypeConversion {

	public static void main(String[] args) {
		String str1="123";
		System.out.println(str1);
		
		byte bn=12; //8 bits
		short sn=bn; //16 bits
		int in=sn; //32 bits
		long ln=in; //64 bits
		float fn=ln; //32 bits
		double dn=fn;//64 bits
		System.out.println(dn);
		//byte -> short -> int -> long -> float -> double //Auto conversion
		
		dn = 123456789.456789;
		//fn = dn;//Type mismatch: cannot convert from double to float
		fn = (float) dn; //double -> cast to float
		ln = (long) fn;
		in = (int)ln;
		sn = (short)in;
		bn = (byte)sn;
		System.out.println(sn);
		
		//String to Numeric
		str1 ="13";
		//bn = str1;//String to byte //Type mismatch: cannot convert from String to byte
		bn = Byte.parseByte(str1);//static byte parseByte(String str1)
		System.out.println(++bn);
		
		//Numeric to String
		bn=89;
		//str1 = bn;//Type mismatch: cannot convert from byte to String
		str1 = Byte.toString(bn); //byte to String
		System.out.println(str1);
		
	}

}








