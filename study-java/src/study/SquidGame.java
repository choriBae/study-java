package study;

public class SquidGame {

	public static void main(String[] args) {

		/* 
		 * ��¡�� ������ �����Ͽ���.
		 * ���� ���ӿ��� �ּ� 10���� �������� �� ���� Ż�����Ѿ� �ϴ°�.
		 * 456���� �����ڰ� �����ϰ�, 1�δ� 1������ ���Ǿ� �����ڰ� Ż���ϸ�
		 * ����ڰ� Ż���� ���ڰ��� ���� ���� ���´�.
		*/
		
		String title = "SquidGame";
		int people = 456;
		int myMoney = 1;
		
		//���ǹ�
		if (people > 10) {
			System.out.println();
		}
		
		
		if (1 > 5) {
			System.out.println("5�� 1���� ũ��");
        } else  {
        	System.out.println("5�� 1���� �۴�");
        }
		
		if (1 < 5) {
			if (3 == 3) {
				System.out.println("5�� 1���� ũ��, 3�� 3�� ����.");
			}
		}
		
		switch(5 % 2) {
		  case 0:
			  System.out.println("������ ����");
			  break;
		  case 1:
			  System.out.println("������ 1");
			  break;
		  default:
			  System.out.println("�´� ���� ����");
		}
		
		//�ݺ���
	}

}
