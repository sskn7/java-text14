
public class whilenokiso {

	public static void main(String[] args) {
		//while文
		//１～１００までの数字を表示し、‐をつける
		
		int i = 0;
		while(i <= 100) {
			System.out.println(i);
			System.out.println("-");
			i++;
		}
		
		//初期値;
		//while(条件式) {
		//処理内容; 増減式;
		//}
		
		//1から5までのループ文
		int a = 1;
		while (a <= 5) {
			System.out.println(a);
			a++;
		}
		
		//初期値が５で1づつ減る場合
		int b = 5;
		while(b > 0) {
			System.out.println(b);
			b--;
		}
		
		//初期値が１で、２ずつ増える場合
		int c =1;
		while(c <= 10) {
			System.out.println(c);
			c += 2;
		}
		
		//初期値が１０で、2ずつ減っていく場合
		int d = 10;
		while(d >= 1) {
			System.out.println(d);
			d -= 2;
		}
		
		//本来のwhile文の　初期値　と　条件式
		//は、ループの回数を意味している
		int f = 1;
		while (f<=5) {
			System.out.println("★");
			f++;
		}
		
		

	}

}
