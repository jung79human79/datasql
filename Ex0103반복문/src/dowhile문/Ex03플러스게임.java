//package dowhile문;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Ex03플러스게임 {

//	public static void main(String[] args) {
//
//		// 1.입력도구 꺼내기
//		Scanner sc = new Scanner(System.in);
//		// 2.랜덤숫자 추출도구 꺼내기
//		Random ran = new Random();
//		do {
//			int ranNum1 = ran.nextInt(9) + 1; // +1을 주어 1부터~9까지 랜덤
//			int ranNum2 = ran.nextInt(9) + 1;
//			// 3.문제출력
//			System.out.print(ranNum1 + "+" + ranNum2 + "=");
//			// 4.사용자로부터 정답 입력받기
//			int input = sc.nextInt();
//			// 5.입력받은 숫자와 정답이 같은지 비교
//			if (input == ranNum1 + ranNum2) {
//				System.out.println("성공!");
//			} else {
//				// 5-1 정답이 미일치시 계속하시겠습니까? 출력
//				System.out.println("실패...");
//				System.out.print("계속하시겠습니까?>> ");
//				String answer = sc.next();
//				String answer2 = "";
//				// 5-2 N을 입력받으면 게임종료 // N이 아닌 어떤 다른 문자를 적으면 계속 됨
//				// 문자열 비교개념
//				if (answer.equals("N")|| answer2.equals("N")) { // ==은 기본자료형에서만 사용가능 String은 기본아님 .equals("") 명령어(구문) 사용함
//					System.out.print("종료합니다. ");
//					break;
//				} else if (answer.equals("Y")) {
//
//				} else {
//					while (true) {
//						System.out.println("다시 선택해주세요!");
//						System.out.print("계속하시겠습니까?>> ");
//						 answer2 = sc.next();
//						if (answer2.equals("N")) {
//							System.out.println("종료합니다. ");
//							break;	
//						} else if (answer2.equals("Y")) {
//							break;
//						}
//					}
//				}
//			}
//
//		} while (true);
//	}

//	 Scanner sc = new Scanner(System.in);
//     Random ran = new Random();
//
//     do {
//        int ranNum1 = ran.nextInt(9) + 1; 
//        int ranNum2 = ran.nextInt(9) + 1;
//
//        System.out.print(ranNum1 + "+" + ranNum2 + "=");
//        int input = sc.nextInt();
//
//        if (input == ranNum1 + ranNum2) {
//           System.out.println("성공!");
//        } else {
//           System.out.println("실패...");
//           while (true) {
//              System.out.print("계속하시겠습니까?>> ");
//              String answer = sc.next();
//              if (answer.equalsIgnoreCase("N")) {
//                 System.out.print("종료합니다. ");
//                 return; // 프로그램 종료
//              } else if (answer.equalsIgnoreCase("Y")) {
//                 break; // 다음 문제로 진행
//              } else {
//                 System.out.println("다시 선택해주세요!");
//              }
//           }
//        }
//
//     } while (true);
//
//
//
//
//
//
//
//
//}
//
//}
