package Music;

import java.util.Scanner;

public class MusicDataBase {

	static Scanner sc = new Scanner(System.in);
	static int i ;
	static String y ;
	static String z ;

	public static void main(String[] args) {

		System.out.println("press any number from 1 to 4 = ");
		System.out.println("press 1 for play a song");
		System.out.println("press 2 for Search a Song");
		System.out.println("press 3 for Show all songs");
		System.out.println("press 4 for Operate the Song List");
		int i = Integer.parseInt(sc.nextLine()) ;

		switch(i) {
		case 1:
			System.out.println("Chosse any character from A ,B , C = " );
			System.out.println("press A for play all songs");
			System.out.println("press B for play Random songs");
			System.out.println("press C for play particular song");
			String y = sc.nextLine();

			switch(y) {

			case "A" :

				Play.play();

				break;

			case "B" :

				Random.random();

				break ;

			case "C" :

				Particular.particular();

			}

			break;

		case 2 :

			Search.search();

			break;

		case 3:
			
			Song.song();

			break;
			
		case 4 :
			
			System.out.println("Chosse any character from A , B , C ");
			System.out.println("A for insert the song");
			System.out.println("B for edit the song name");
			System.out.println("C for delete the song");
			
			String z = sc.nextLine();
			
			switch(z) {
			
			case "A" :
				
				Insert.insert();
				
				break;
			
			case "B" :
				
				Operate.operate();
				
				break;
				
			case "C" :
				
				Delete.delete();
			}
			
			
			
		}

	}

}

