package day02;

public class array {
	public static void main(String[] args) {
		// ������
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 25;
		arr[3] = 30;
		arr[4] = 18;
		
		// ʵ������
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				// ���˳�򲻶Ծ͵���λ��
				if(arr[j]>arr[j+1]){
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}				
			}
		}
		
		// ��ӡ�����Ľ��
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
