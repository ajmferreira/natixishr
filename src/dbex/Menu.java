package dbex;

import java.util.Scanner;

public class Menu {

	 public static int menu() {

	        int selection;
	        Scanner input = new Scanner(System.in);

	        /***************************************************/

	        System.out.println("Choose from these choices");
	        System.out.println("-------------------------\n");
	        System.out.println("1 - Inserir - nova pessoa");
	        System.out.println("2 - Apagar ");
	        System.out.println("3 - Actualizar");
	        System.out.println("4 - Selecionar");
	        System.out.println("5 - Terminar");

	        selection = input.nextInt();
	        return selection;    
	    }
	
	
	
}
