import java.util.Scanner;

public class Tableaux {

	public static void main(String[] args) {
	
//		char tableauCaractere[] = {'a','b','c','d','e','f','g'};
//		
////		for(int i = 0; i < tableauCaractere.length; i++)
////		{
////		  System.out.println("À l'emplacement " + i +" du tableau nous avons = " + tableauCaractere[i]);
////		}
//		
//		int i = 0;
//		char reponse = ' ',carac = ' ';
//		Scanner sc = new Scanner(System.in);
//		         
//		do {//Boucle principale
//		  do {//On répète cette boucle tant que l'utilisateur n'a pas rentré une lettre figurant dans le tableau
//		    i = 0;
//		    System.out.println("Rentrez une lettre en minuscule, SVP ");
//		                
//		    carac = sc.nextLine().charAt(0);
//		    //Boucle de recherche dans le tableau
//		    while(i < tableauCaractere.length && carac != tableauCaractere[i])
//		      i++;
//		         
//		    //Si i < 7 c'est que la boucle n'a pas dépassé le nombre de cases du tableau 
//		    if (i < tableauCaractere.length)
//		      System.out.println(" La lettre " +carac+ " se trouve bien dans le tableau !");
//		    else //Sinon
//		      System.out.println(" La lettre " +carac+ " ne se trouve pas dans le tableau !");
//		         
//		  }while(i >= tableauCaractere.length);
//
//		  //Tant que la lettre de l'utilisateur ne correspond pas à une lettre du tableau    
//		  do{
//		    System.out.println("Voulez-vous essayer à nouveau ? (O/N)");
//		    reponse = sc.nextLine().charAt(0);
//		  }while(reponse != 'N' && reponse != 'O');      
//		}while (reponse == 'O');
//		                
//		System.out.println("Au revoir !");
		
//		String[] str = new String[10];
//		//L'instruction suivante va déclencher une exception
//		//Car vous essayez d'écrire à la case 11 de votre tableau 
//		//Alors que celui-ci n'en contient que 10 (ça commence à 0 !)
//		str[10] = "Une exception";
		
//		int premiersNombres[][] = { {0,2,4,6,8},{1,3,5,7,9} }, i = 0, j = 0;
//		 
//		while (i < 2)
//		{
//		  j = 0;
//		  while(j < 5)
//		  {
//		    System.out.print(premiersNombres[i][j]);
//		    j++;
//		  }
//		  
//		  System.out.println("");
//		  i++;
		  
		  
//		  int premiersNombres[][] = { {0,2,4,6,8},{1,3,5,7,9} };
//		  
//		  for(int i = 0; i < 2; i++)
//		  {    
//		    for(int j = 0; j < 5; j++)
//		    {
//		      System.out.print(premiersNombres[i][j]);       
//		    }
//		    System.out.println("");     
//		  }
		  
//		  String tab[] = {"toto", "titi", "tutu", "tete", "tata"};
//		  
//		  for(String str : tab)
//		    System.out.println(str);
		  
//		  int tab[] = {0, 1, 2, 3, 4};
//		  
//		  for(int str : tab)
//		    System.out.println(str);
//		
		  String tab[][]={{"toto", "titi", "tutu", "tete", "tata"}, {"1", "2", "3", "4"}};
		  int i = 0, j = 0;
		   
		  for(String sousTab[] : tab)
		  {
		    i = 0;
		    for(String str : sousTab)
		    {     
		      System.out.println("La valeur de la nouvelle boucle est  : " + str);
		      System.out.println("La valeur du tableau à l'indice ["+j+"]["+i+"] est : " + tab[j][i]);
		      i++;
		    }
		    j++;
		  }
		  
	}

}
