package study;

/* 
 * 오징어 게임을 참가하였다.
 * 내가 게임에서 최소 10억을 가지려면 몇 명을 탈락시켜야 하는가.
 * 456명의 참가자가 참여하고, 1인당 1억으로 계산되어 참가자가 탈락하면
 * 우승자가 탈락된 참자가의 돈을 나눠 갖는다.
 * 
 * 한 게임 당 10명의 참가자가 고정적으로 탈락한다.
 * 몇 게임을 진행해야 1인당 10억을 가질 수 있을까?
*/

public class SquidGame { //클래스
	
	public static final String title = "SquidGame"; //필드
	static int people = 456;
	
 	
	public static void main(String[] args) { //메서드

		int myMoney = 1;
		
		SquidGame firstGame = new SquidGame();
		int people = firstGame.playGame();
		
		System.out.println(people);
	}

	int playGame() {
		int winner = (this.people)-10;
		
		return winner;
	}
}
