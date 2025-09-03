package com.kh.view;

import java.util.Scanner;

import com.kh.controller.PlantController;

public class PlantView {
	private Scanner sc = new Scanner(System.in);
	private PlantController pc = new PlantController();
	
	public void mainMenu() {
		while (true) {
			System.out.println("----- 식물 관리 프로그램 -----");
			System.out.println("1. 식물 추가");
			System.out.println("2. 식물 전체 조회");
			System.out.println("3. 식물 아이디로 조회");
			System.out.println("4. 식물 종 키워드로 조회");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴를 선택하세요");
			
			int menuNo = sc.nextInt();
			sc.nextLine();
			switch (menuNo) {
			case 1: plantSave(); break;
			case 2: //plantFindAll(); break;
			case 3: //plantFindId(); break;
			case 4: //plantKeyword(); break;
			case 9: System.out.println("프로그램을 종료합니다"); return;
			default:
				System.out.println("잘못된 메뉴선택입니다");
			}
		}

	}

	private void plantSave() {
		System.out.println("--- 식물 추가 ---");
		
		System.out.println("식물 아이디를 입력하세요");
		int plantId = sc.nextInt();
		sc.nextLine();
		System.out.println("식물 이름을 입력하세요");
		String plantName = sc.nextLine();
		System.out.println("식물 종을 입력하세요");
		String species = sc.nextLine();
		System.out.println("물 주기를 입력하세요");
		String wateringCycle = sc.nextLine();
		System.out.println("하루에 필요한 햋빛양을 입력하세요 (시간당)");
		int sunlight = sc.nextInt();
		sc.nextLine();
		System.out.println("등록일을 입력하세요");
		String createAt = sc.nextLine();
		
		
				
	}
}
