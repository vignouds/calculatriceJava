import java.util.*;

import org.apache.commons.lang3.StringUtils;

class CalcV2 {
	public static void main(String[]args) {
		List liste = new LinkedList();
		String calcul = new String();
		String element = new String();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Veuillez saisir votre calcul");
		calcul = scan.nextLine();
		
		for(int i=0;i<calcul.length();i++)
			liste.add(calcul.charAt(i));
			//System.out.println(calcul.charAt(i));
		
		for(int i=0;i<liste.size();i++) {
			//System.out.println("element " + i + " est " + liste.get(i));
			element = liste.get(i);
			if (StringUtils.isNumeric(element)==true)
				// ???
		}
	}
}
