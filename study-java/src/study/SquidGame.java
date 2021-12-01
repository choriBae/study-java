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

public class SquidGame { //클래스 명 : 대문자로 시작한다.
	
	public static final String title = "SquidGame"; //필드 혹은 멤버변수(속성)
	public static int people = 456;
	public int savePeople = 456;
	public int money = 456;
	
	
	public SquidGame() { //생성자
		//class에서 가장 먼저 호출되는 부분이다.
		//생성자로 인해서 메모리에 객체가 올라간다.
	}
	
	public static void main(String[] args) { //메서드(기능)
		//main 메서드는  jvm이 가장 먼저 실행한다.
		
		//int myMoney = 1;
		int people2 = 456;
		
		Game firstGame = new Game(); //객체-인스턴스 / new키워드를 통해 객체를 생성한다. - 메모리에 객체가 생성된다.
		firstGame.diePeople = 10;
		firstGame.totalPeople = people2;
		firstGame.gameName = "첫 번째";
		
		people2 = firstGame.playGame();
		firstGame.endGame();
		System.out.println("첫 번째 게임의 생존자는 " + people2 + "명 입니다.");
		
		Game secondGame = new Game();
		secondGame.diePeople = 20;
		secondGame.totalPeople = people2;
		secondGame.gameName = "두 번째";
		
		people2 = secondGame.playGame();
		secondGame.playGame();
		System.out.println("두 번째 게임의 생존자는 " + people2 + "명 입니다.");
	}
}

class Game { 
	
	int diePeople;
	int totalPeople;
	String gameName;
	
	int playGame() {
		int winner = totalPeople - diePeople; //전역변수를 static이어야 다른 클래스에서 사용 할 수 있는데, static이 아니면서 사용하려면?
		return winner;
	}
	
	void endGame() {
		System.out.println(gameName + "게임 종료");
	}
}