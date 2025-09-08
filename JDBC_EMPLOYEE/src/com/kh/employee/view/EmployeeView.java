package com.kh.employee.view;

import java.util.List;
import java.util.Scanner;

import com.kh.employee.controller.EmployeeController;
import com.kh.employee.model.vo.Employee;

public class EmployeeView {
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();
	public void mainMenu() {
		while(true) {
			System.out.println("EMPLOYEE테이블로 JDBC프로젝트 만들기");
			
			System.out.println("===============================");
			System.out.println("1. 회원 전체 조회");
			System.out.println("2. 부서명을 입력받아 부서가 동일한 사원 조회");
			System.out.println("3. 직급명을 입력받아 직급이 동일한 사원 조회");
			System.out.println("4. 사원 상세 조회");
			System.out.println("5. 급여가 높은 상위 다섯명 조회");
			System.out.println("6. 급여가 낮은 하위 다섯명 조회");
			System.out.println("7. 사원 추가 기능");
			System.out.println("8. 사원 정보 수정");
			System.out.println("9. 사원 퇴사 기능");
			System.out.println("메뉴를 선택해주세요");
			int menuNo = sc.nextInt();
			sc.nextLine();
			
			switch(menuNo) {
			case 1: findAll(); break;
//			case 2: insertBoard(); break;
//			case 3: deleteBoard(); break;
//			case 4: deleteBoard(); break;
//			case 5: deleteBoard(); break;
//			case 6: deleteBoard(); break;
//			case 7: deleteBoard(); break;
//			case 8: deleteBoard(); break;
//			case 9: System.out.println("잘가"); return;
			}
		}
	}
	private void findAll() {
		
		List<Employee> employees = ec.findAll(); 
		
	}
}
