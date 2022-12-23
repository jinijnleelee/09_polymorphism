package edu.kh.poly.model.vo;

public class Tesla extends Car {
//Car를 상속 받을수 있도록! => extends Car(부모)
	
	private int batteryCapacity;	//배터리 용량
	
	
	//기본생성자 자동완성
	//컨트롤 + 스페이스 + 엔터 
	public Tesla() {
		super(); //Car
	}
	
	//매개변수 생성자 자동완성
	//알트 + 쉬프트 + s + o + 위에 드롭박스 매개변수채워져있는 생성자 클릭 후 생성
	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}
	//getter/setter
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	@Override //Car.toString의 오버라이딩
	public String toString() {
		//super 참조변수
		return super.toString() + " / " + batteryCapacity;
		
	}
	
	
	
}
