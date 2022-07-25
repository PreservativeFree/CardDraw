import java.util.Scanner;

public class CardDrawMain {

	public static void main (String[] args) {
		int K, P, M, G;
		int check1, check2;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter values for four cards:");
		K = input.nextInt();
		P = input.nextInt();
		M = input.nextInt();
		G = input.nextInt();
		if(K > 10 || P > 10 || M > 10 || G > 10)
			return;
		if(K < 1 || P < 1 || M < 1 || G < 1)
			return;

		check1 = K + P;
		check2 = M + G;

		if(K - P == 0 && M - G == 0 && P - G == 0) {
			System.out.println("4 of a kind");
		} else if(((check1 > check2 && (K == P)) && (K == M || K == G)) || (check2 > check1 && (M == G) && (M == K || M == P)) ) {
			System.out.println("3 of a kind");
		} else if(((check1 > check2 && (M == G)) && (M == K || M == P)) || (check2 > check1 && (K == P) && (K == M || K == G)) ) {
			System.out.println("3 of a kind");
		} else if( M == G || P == G || K == G || K == P || K == M || P == M) {
			System.out.println("2 of a kind");
		} else
			System.out.println("Nothing: Bad Draw");


	}

}