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

public class SquidGame { //Ŭ����
	
	public static final String title = "SquidGame"; //�ʵ�
	static int people = 456;
	
 	
	public static void main(String[] args) { //�޼���

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
