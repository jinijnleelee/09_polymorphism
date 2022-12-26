package edu.kh.abs.model.vo;

public class Cat extends TypeMammalia{
	//추상메서드들을 상속받은 아이들은 무조건 추상메서들을 다 정의해워야한다.
	// TypeMammalia는 animal을 상속받았고 animal은 추상클래스들임.
	//animal은 추상클래스 안에 있는 애들이 eat,cry, move임
	@Override
	public void eat() {
		System.out.println("냐미냐미");
		
	}

	@Override
	public void cry() {
		System.out.println("미야우미야우");
		
	}

	@Override
	public void move() {
		System.out.println("살금살금");
		
	}

	@Override
	public void breastfeed() {
		System.out.println("고양이기ㅏ 수유를 한다 ");
		
	}
	
	

}
