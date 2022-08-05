
public class 연습문제 {
	public static void main(String[] args) {
	for(int i=1; i<=7; i++) {
		System.out.print(fibo(i)+"\t");
	}
}
	static int fibo(int n) {
		if(n==1||n==2) return 1;
		else return fibo(n-1)+(n-2);
	}
}
		
//		int before=1;
//		int after=1;
//		int next=0;
//		for(int i=0; i<7; i++) {
//			System.out.print(before+"\t");
//			next=before+after;
//			before=after;
//			after=next;
//		}
//		int i = 10;
//		for (int j = 1; j < i; j++) {
//			System.out.print(Fibo(i) + "");
//		}
//		public static int Fibo(int i)
//		{if(n==1||n==2) return 1;
//		else return Fibo(n-1)+Fibo(n-2);
//			
//		}
	


/*
 * 7개의 피보나치 수열을 출력하시오 출력결과 : 1 1 2 3 5 8 13 반복문(for) 혹은 재기호출을 사용하면댐
 * n=(n-1)+(n-2)
 */