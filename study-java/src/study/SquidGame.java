package study;

/* 
 * ��¡�� ������ �����Ͽ���.
 * ���� ���ӿ��� �ּ� 10���� �������� �� ���� Ż�����Ѿ� �ϴ°�.
 * 456���� �����ڰ� �����ϰ�, 1�δ� 1������ ���Ǿ� �����ڰ� Ż���ϸ�
 * ����ڰ� Ż���� ���ڰ��� ���� ���� ���´�.
 * 
 * �� ���� �� 10���� �����ڰ� ���������� Ż���Ѵ�.
 * �� ������ �����ؾ� 1�δ� 10���� ���� �� ������?
*/

public class SquidGame { //Ŭ���� �� : �빮�ڷ� �����Ѵ�.
	
	public static final String title = "SquidGame"; //�ʵ� Ȥ�� �������(�Ӽ�)
	public static int people = 456;
	public int savePeople = 456;
	public int money = 456;
	
	
	public SquidGame() { //������
		//class���� ���� ���� ȣ��Ǵ� �κ��̴�.
		//�����ڷ� ���ؼ� �޸𸮿� ��ü�� �ö󰣴�.
	}
	
	public static void main(String[] args) { //�޼���(���)
		//main �޼����  jvm�� ���� ���� �����Ѵ�.
		
		//int myMoney = 1;
		int people2 = 456;
		
		Game firstGame = new Game(); //��ü-�ν��Ͻ� / newŰ���带 ���� ��ü�� �����Ѵ�. - �޸𸮿� ��ü�� �����ȴ�.
		firstGame.diePeople = 10;
		firstGame.totalPeople = people2;
		firstGame.gameName = "ù ��°";
		
		people2 = firstGame.playGame();
		firstGame.endGame();
		System.out.println("ù ��° ������ �����ڴ� " + people2 + "�� �Դϴ�.");
		
		Game secondGame = new Game();
		secondGame.diePeople = 20;
		secondGame.totalPeople = people2;
		secondGame.gameName = "�� ��°";
		
		people2 = secondGame.playGame();
		secondGame.playGame();
		System.out.println("�� ��° ������ �����ڴ� " + people2 + "�� �Դϴ�.");
	}
}

class Game { 
	
	int diePeople;
	int totalPeople;
	String gameName;
	
	int playGame() {
		int winner = totalPeople - diePeople; //���������� static�̾�� �ٸ� Ŭ�������� ��� �� �� �ִµ�, static�� �ƴϸ鼭 ����Ϸ���?
		return winner;
	}
	
	void endGame() {
		System.out.println(gameName + "���� ����");
	}
}