package java0221;

public class Main2 {

	public static void main(String[] args) {

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		try {
		String str = "Hello World";
		//������ NumberFormatException�� �߻���Ŵ
		throw new NumberFormatException();
		
		//NullPointerException �߻�
		//System.out.printf("%s\n", str.toUpperCase());
		//������ �����Ϸ��ٰ� ���� �߻� - NumberFormatException
		//int n1 = Integer.parseInt("T_T");
		}
		/*
		//NullPointerException�� �߻����� �� ȣ��Ǵ� ��
		catch(NullPointerException e) {
			System.err.printf("�� ������ ���� �߻�\n");
		}
		
		//NumberFormatException ó��
		catch(NumberFormatException e) {
			System.err.printf("������ ��ȯ�� ���� ���ϴ� ���� �߻�\n");
		}
		*/
		
		/*
		//2���� ���ܸ� |�� ��� ó��
		catch(NumberFormatException | NullPointerException e) {
			System.out.printf("%s\n", e.getMessage());
		}
		*/
		
		//���� Ŭ������ ������ �������� ���� Ŭ���� Ÿ���� �ν��Ͻ� ������
		//������ �� �ֽ��ϴ�.
		//NumberFormatException Ŭ������ NullPointerException Ŭ������
		//��� RuntimeException Ŭ�����κ��� ��ӹ޾ұ� ������
		//RuntimeEsception Ŭ������ ������ ������ ������ �����մϴ�.
		//RuntimeEsception Ŭ������ Exception Ŭ�����κ��� ��ӹ޾����Ƿ�
		//Exception���� �����ص� ������ ����� ���ɴϴ�.
		
		catch(RuntimeException e) {
			System.out.printf("%s\n", e.getMessage());
		}
		/*
		//������ �� ���� �ڵ�� ������ ����
		catch(NumberFormatException | NullPointerException e) {
			System.out.printf("%s\n", e.getMessage());
		}
		*/
		
		//���� �߻� ���ο� ������� ����
		finally {
		System.out.printf("������ ����\n");
		}
		System.out.println("���α׷�����");
	}
	
}