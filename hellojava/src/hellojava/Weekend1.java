package hellojava;

import java.util.Scanner;

public class Weekend1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    boolean run = true;
	    
		


		while (run) {
			
			System.out.println("=============================");
			System.out.println("       [숫자맞추기게임 시작]     ");
			System.out.println("=============================");
			
			

			int answer = (int) (Math.random() * 100) + 1;
			boolean correct = false;

			while (!correct) {
				System.out.println(">>");
				int n = sc.nextInt();
				sc.nextLine();

				if (n < answer) {
					System.out.println("더 높게");
				} else if (n > answer) {
					System.out.println("더 낮게");
				} else {
					System.out.println("맞았습니다.");
					correct = true;
					}
				}
				System.out.println("게임을 종료하시겠습니까?(y/n)");
				String b = sc.nextLine(); 
				
				if (b.equals("y")) {
					run = false;	
					
				System.out.println("=============================");
				System.out.println("       [숫자맞추기게임 종료]     ");
				System.out.println("=============================");

			}

		
	}
		sc.close();

	}
	}
