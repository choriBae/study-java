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
		int people = 456,
			myMoney = 1;
		String[] array = {"����","����","ġ��","���","�߰�����"}; 
		
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
		for(int i=0; i < array.length; i++) {
			System.out.println("�Ϲ� for�� = " + array[i]);
		}
		
		for(String stmp : array) {
			System.out.println("���� for�� = "+ stmp);
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
			System.out.println("������ �Ĵ��� "+ stmp);
			
			if(stmp == "ġ��") {
				System.out.println("ġŲ�̴�!!");
				continue;
			}
			
			System.out.println("��");
		}
			
	}

}
