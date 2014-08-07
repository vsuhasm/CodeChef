import java.util.*;


public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 0;
		int j;
		StringBuffer sb = new StringBuffer();
		String op[] = new String[n];
		for(int i = 0; i<n; i++){
			if(sc.next().charAt(0) == '+'){
				j = sc.nextInt();
				sb.insert(j, sc.next());
			}
			else{
				op[c] = sb.substring(sc.nextInt()-1, sc.nextInt());
				c++;
			}
		}
		for(int i = 0; i<c; i++)
			System.out.println(op[i]);
	}
}													
