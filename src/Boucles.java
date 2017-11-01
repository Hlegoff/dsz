import java.util.Scanner;

public class Boucles {


	public static void main(String[] args) {
		
		
		//////////// La boucle while ////////////

//		//Une variable vide
//		String prenom;
//		//On initialise celle-ci à O pour oui
//		char reponse = 'O';
//		//Notre objet Scanner, n'oubliez pas l'import de java.util.Scanner !
//		Scanner sc = new Scanner(System.in);
//		//Tant que la réponse donnée est égale à oui…
//		while (reponse == 'O')
//		{
//		  //On affiche une instruction
//		  System.out.println("Donnez un prénom : ");
//		  //On récupère le prénom saisi
//		  prenom = sc.nextLine();
//		  //On affiche notre phrase avec le prénom
//		  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
//		  //On demande si la personne veut faire un autre essai
//		  System.out.println("Voulez-vous réessayer ? (O/N)");
//		  //On récupère la réponse de l'utilisateur
//		  reponse = sc.nextLine().charAt(0);
//		}
//		 
		
		
//		String prenom;
//		char reponse = 'O';
//		Scanner sc = new Scanner(System.in);
//		
//		while (reponse == 'O')
//		{
//		  System.out.println("Tapez le titre d'un film que vous adorez : ");		
//		  prenom = sc.nextLine();		  
//		  System.out.println("J'ai beaucoup aimé le film " +prenom);
//		  System.out.println("Et vous ?(O/N)");
//		  reponse = sc.nextLine().charAt(0);
//		}
//		 
//		System.out.println("Chacun ses goûts :p…");
//		//Fin de la boucle
		
//		String prenom;
//		char reponse = 'O';
//		Scanner sc = new Scanner(System.in);
//		while (reponse == 'O')
//		{
//		  System.out.println("Donnez un prénom : ");
//		  prenom = sc.nextLine();
//		  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");                        
//		  //Sans ça, nous n'entrerions pas dans la deuxième boucle
//		  reponse = ' ';
//		                        
//		  //Tant que la réponse n'est pas O ou N, on repose la question
//		  while(reponse != 'O' && reponse != 'N')
//		  {
//		    //On demande si la personne veut faire un autre essai
//		    System.out.println("Voulez-vous réessayer ? (O/N)");
//		    reponse = sc.nextLine().charAt(0);
//		  }
//		}
//		
//		System.out.println("Au revoir…");
		
//		int a = 1, b = 15;
//		while (a < b)
//			
//		{
//		  System.out.println("coucou " +a+ " fois !!");
//		  a++;}
		
//		int a = 1, b = 15;
//		while (a++ < b)
//		   System.out.println("coucou " +a+ " fois !!");
		
		////// La boucle do… while //////
		
//		String prenom = new String();
//		//Pas besoin d'initialiser : on entre au moins une fois dans la boucle !
//		char reponse = ' ';
//		 
//		Scanner sc = new Scanner(System.in);
//		 
//		do{
//		  System.out.println("Donnez un prénom : ");
//		  prenom = sc.nextLine();
//		  System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");
//		       
//		  do{
//		    System.out.println("Voulez-vous réessayer ? (O/N)");
//		    reponse = sc.nextLine().charAt(0);
//		  }while(reponse != 'O' && reponse != 'N');
//		        
//		}while (reponse == 'O');
//		 
//		System.out.println("Au revoir…");
		
		/////// la boucle FOR ////////
		
//		for(int i = 1; i <= 10; i++)
//		{
//		  System.out.println("Voici la ligne "+i);
//		}
		
		/// Boucle for avec décrémentation
//		for(int i = 10; i >= 0; i--)
//			  System.out.println("Il reste "+i+" ligne(s) à écrire");
		
		/////////
		for(int i = 0, j = 2; (i < 10 && j < 6); i++, j+=2){
			  System.out.println("i = " + i + ", j = " + j);
			}
		
		
	}

}
