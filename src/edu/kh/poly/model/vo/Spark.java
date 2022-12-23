package edu.kh.poly.model.vo;

public class Spark extends Car {	//경차
	
	private double discountofter;	//할인 혜택
	
	//기본생성자
	
	public Spark() {} //super()생략시 컴파일러가 자동 추가

	public Spark(String engine, String fuel, int wheel, double discountofter) {
		super(engine, fuel, wheel);
		this.discountofter = discountofter;
	}

	public double getDiscountofter() {
		return discountofter;
	}

	public void setDiscountofter(double discountofter) {
		this.discountofter = discountofter;
	}
	
	@Override 
	public String toString() {
		return super.toString() + " / " + discountofter;
		
	}
	
	
	

}
