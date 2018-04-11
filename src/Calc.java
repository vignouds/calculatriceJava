import java.util.*;

import org.apache.commons.lang3.StringUtils;

class Calc {
	public static void main(String[]args) {
		int x=0, y=0, result=0;
		String nombre1 = " ", operateur = " ", nombre2 = " ";
		boolean test;
		Scanner scan = new Scanner(System.in);

		// On rentre l'opération et on fait les tests
		do
		{
			System.out.println("Veuillez saisir un premier nombre (entier)");
			nombre1 = scan.nextLine();
		} while (StringUtils.isNumeric(nombre1)==false);
					
		do
		{
			System.out.println("Veuillez saisir un opérateur(+ - * /)");
			operateur = scan.nextLine();
			test = operateur.equals("+")||operateur.equals("-")||operateur.equals("*")||operateur.equals("/");
		} while (test == false);

		do
		{
			System.out.println("Veuillez saisir un second nombre (entier)");
			nombre2 = scan.nextLine();
		} while (StringUtils.isNumeric(nombre2)==false);
		
		x = Integer.parseInt(nombre1);
		y = Integer.parseInt(nombre2);
		
		//On réalise le calcul
		if(operateur.equals("+")) {
			result = x+y;
		}
		else if(operateur.equals("-")) {
			result = x-y;
		}
		else if(operateur.equals("*")) {
			result = x*y;
		}
		else if(operateur.equals("/")) {
			result = x/y;
		}
		else {
			System.out.println("Erreur");
		}	
		
		System.out.println("Résultat : " + result);
	}
}
