package edu.kh.abs.model.vo;

public abstract class Animal {
	//abstract 붙는 순간 객체화가 안되는 클래스.
	//단, 타입으로서의 의미는 그대로!
	
	public abstract void eat();//추상메서드
	//먹기라는 메서드는 있지만, 어떻게 동작할지 정의하지 않아야 한다.
	// ++ 추상메서드가 있다면, 추상클래스여야 한다.
	public abstract void cry();
	public abstract void move();
	
	//동물들은 암튼 모두 먹거나 움직이거나 우는 공통점을 가지고 있으니까
	

}
