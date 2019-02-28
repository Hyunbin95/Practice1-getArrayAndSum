package java0225;

public class SortPractice {

	public static void main(String[] args) {

		String []ar = {"류준열","장동건","원빈","이영애","이국주"};
		//배열의 길이를 len에 저장
		int len = ar.length;
		//최대 n-1 회전 동안
		for(int i=0; i<len-1; i=i+1) {
			//위치 이동을 확인하기 위한 변수
			int flag=0;
			//인접한 데이터와 비교
			for(int j=0; j<len-1-i; j++) {
				//앞의 데이터가 더 크면 위치 변경
				if(ar[j].compareTo(ar[j+1])>0) { //앞에것과 비교해서 앞에것이 크면 1 같으면 0 작으면 -1 리턴?
					String temp = ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
					flag=1;
				}
				
			}
			for(String imsi : ar) {
				System.out.print(imsi + " ");
			}
			System.out.println();
			//위치 이동이 없으면 종료
			if(flag==0) {
				break;
			}

			

		}
	}
}