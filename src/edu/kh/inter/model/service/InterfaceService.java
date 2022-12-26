package edu.kh.inter.model.service;

import edu.kh.inter.model.vo.Cat;
import edu.kh.inter.model.vo.Chicken;
import edu.kh.inter.model.vo.Dog;
import edu.kh.inter.model.vo.Eagle;
import edu.kh.inter.model.vo.Penguin;
import edu.kh.inter.model.vo.Shark;
import edu.kh.inter.model.vo.Whale;
import edu.kh.inter.model.vo.WaterLife;

public class InterfaceService {
	
	
	

	public void ex1()  {
		//포유류
		Cat cat = new Cat();
		Dog dog = new Dog();
		Whale whale = new Whale();
		
		//조류
		Chicken chicken = new Chicken();
		Eagle eagle = new Eagle();
		Penguin penguin = new Penguin();
		
		
		//어류
		Shark shark = new Shark();
		
		WaterLife[] waterLife = new WaterLife[] 
				{penguin,shark,whale};
		
	for(int i = 0; i<waterLife.length;i++) {
		waterLife[i].water();
		
	
		//관계가 전혀 없는 것들이 관계를 만들어주는게 인터페이스
		//고래 펭귄 상어를 묶어줄수있는 이유가
		//waterLige라는 인터페이스가 있기 때문이다.
		
	}
	}
}
