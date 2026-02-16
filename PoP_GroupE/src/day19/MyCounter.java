package day19;

public class MyCounter {
	//Increase the number
	public MyNumber increase(MyNumber mn) {
		int tmpNum=mn.getNum1();
		tmpNum++;
		mn.setNum1(tmpNum);
		return mn;
	}
}
