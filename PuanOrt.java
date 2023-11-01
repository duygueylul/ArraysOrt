package JavaArrays;

import java.util.Scanner;
public class PuanOrt {

	public static void main(String[] args) {
		int [] nots = new int[7];
		int top = 0;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Notlarınızı Giriniz: ");
		System.out.println("Mat 1: ");
		nots[0] = scan.nextInt();
		System.out.println("Türkçe 2: ");
		nots[1] = scan.nextInt();
		System.out.println("Fizik 3: ");
		nots[2] = scan.nextInt();
		System.out.println("Tarih 4: ");
		nots[3] = scan.nextInt();
		System.out.println("Kimya 5: ");
		nots[4] = scan.nextInt();
		System.out.println("Beden 6: ");
		nots[5] = scan.nextInt();
		System.out.println("Müzik 7: ");
		nots[6] = scan.nextInt();
		
		
		for(int not : nots) {
			top += not;
		}
		System.out.println("Ortalama: " + (top / nots.length));
	}

}
