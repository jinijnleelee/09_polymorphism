package edu.kh.poly.practice.mode.service;

import java.util.Scanner;

import edu.kh.poly.practice.model.vo.Person;

public class QuestionService implements QuestionInterface {

	
	
	
	
	@Override
	public void displayMenu() {
		Scanner sc = new Scanner(System.in);
		int inputNum = 0; 
		
		do{
			System.out.println("\n회원정보관리프로그램");
			System.out.println("1 모든요소출력");
			System.out.println("2 학생정보만 출력");
			System.out.println("3 직원정보만 출력");
			System.out.println("4 정보 찾기(이름)");
			System.out.println("5 모든사람의 나이(합,최고,최저)");
			System.out.println("6 입력 인덱스 삭제");
			System.out.println("7 학생 OR 직원 등록");
			System.out.println("0 프로그램 종료");
			System.out.println("메뉴 입력>>>");
			
			inputNum = sc.nextInt();
			sc.nextLine();
			
			
			switch(inputNum ) {
			case 1 : 
				insertPerson();
				break;
			case 2 : 
				selectStudent();
				break;
			case 3 : 
				selectEmployee();
				break;
			case 4 : 
				searchName();
				break;
			case 5 : 
				printAge();
				break;
			case 6 : 
				deletePerson();
				break;
			case 7 : 
				addPerson();
				break;
			case 8 : 
				System.out.println("프로그램을 종료합니다");
				break;
		
			}
		}while(inputNum !=0);
	}

	@Override
	public void insertPerson() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person searchName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String printName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printAge() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person deletePerson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addPerson() {
		// TODO Auto-generated method stub
		
	}

}
