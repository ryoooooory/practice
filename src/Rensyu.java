import java.util.Scanner;


public class Rensyu {
	int MAXN = 100000;
	int first;
	int secound;
	public void solve() {
		int S = 0;
		int E = 0;
		int N = 0;
		Scanner sc =  new Scanner(System.in);
		Scanner sb =  new Scanner(System.in);
		Scanner sa =  new Scanner(System.in);
		
		N = sa.nextInt();				//仕事の個数
							
		Pair pair = new Pair<Integer, Integer>(first,secound);
		Pair data[] = null;
		for(int i=0;i<N;i++){
			S = sc.nextInt();			//仕事のスタート
			E = sb.nextInt();				//仕事の終わり
			data[i] = pair(S,E);
		}

		System.out.println(data[0]);
		




	}
	private Pair pair(int n, int n2) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}	
}

