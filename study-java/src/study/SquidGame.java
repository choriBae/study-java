package study;

public class SquidGame {

	public static void main(String[] args) {

		/* 
		 * 오징어 게임을 참가하였다.
		 * 내가 게임에서 최소 10억을 가지려면 몇 명을 탈락시켜야 하는가.
		 * 456명의 참가자가 참여하고, 1인당 1억으로 계산되어 참가자가 탈락하면
		 * 우승자가 탈락된 참자가의 돈을 나눠 갖는다.
		*/
		
		String title = "SquidGame";
		int people = 456;
		int myMoney = 1;
		
		//조건문
		if (people > 10) {
			System.out.println();
		}
		
		
		if (1 > 5) {
			System.out.println("5는 1보다 크다");
        } else  {
        	System.out.println("5는 1보다 작다");
        }
		
		if (1 < 5) {
			if (3 == 3) {
				System.out.println("5는 1보다 크고, 3과 3은 같다.");
			}
		}
		
		switch(5 % 2) {
		  case 0:
			  System.out.println("나머지 없음");
			  break;
		  case 1:
			  System.out.println("나머지 1");
			  break;
		  default:
			  System.out.println("맞는 값이 없음");
		}
		
		//반복문
	}

}
