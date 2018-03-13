import java.util.*;

public class InteractiveSorting {
	public static void main (String[] args){
		int N, Q, i, j;
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		Q = sc.nextInt();
			
		ArrayList<Character> s = new ArrayList<Character>();
		for(i = 0; i < N; i++){
			char x = (char)('A' + i);
			s.add(x);
		}
		for(i = 0; i < N; i++){
			for(j = 0; j < N-1-i; j++){
				System.out.println("? " + s.get(j) + " " + s.get(j+1));
				String ans = sc.next();
				if(ans.equals(">")){
					Collections.swap(s, j, j+1);
				}
			}
		}
		String result = "";
		for(i = 0; i < N; i++){
			result += s.get(i);
		}
		System.out.println("! " + result);
	}
}
