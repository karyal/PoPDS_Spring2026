package day12;

public class Numbers {
	private int x;
	private int y;
	public Numbers() {
		this.x=0;
		this.y=0;
	}
	public Numbers(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public Numbers(Numbers nums) {//Copy Constructor - Object Argument
		this.x=nums.x;
		this.y=nums.y;
	}
	public void swap() {
		int tmp=this.x;
		this.x=this.y;
		this.y=tmp;
	}
	public String toString() {
		return (this.x+", "+this.y);
	}
}
