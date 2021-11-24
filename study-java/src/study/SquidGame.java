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
		int people = 456,
			myMoney = 1;
		String[] array = {"고구마","감자","치팅","계란","닭가슴살"}; 
		
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
		for(int i=0; i < array.length; i++) {
			System.out.println("일반 for문 = " + array[i]);
		}
		
		for(String stmp : array) {
			System.out.println("향상된 for문 = "+ stmp);
		}
		
		
		int count = 5;
		while (count != 5) {
			System.out.println(count);
			count++;
		}
		
		int count2 = 4;
		do {
			//System.out.println(count2);
			count2++;
			
			if(count2 == 6)
			break;
		} while (count != 6);
		
		for(String stmp : array) {
			System.out.println("오늘의 식단은 "+ stmp);
			
			if(stmp == "치팅") {
				System.out.println("치킨이다!!");
				continue;
			}
			
			System.out.println("웩");
		}
			
	}

}
