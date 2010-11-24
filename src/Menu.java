
import java.util.*;

public class Menu {
	/*Esta classe possui o menu principal do sistema.
	 * É a partir deste menu que é efectuado o acesso
	 * às restantes funcionalidades do sistema.
	 */
	
	
	int option;       //Inteiro correspondente à opção do utilizador no main menu.             
	Scanner s = new Scanner(System.in);
	Sistema sis = new Sistema();
	
	
	
	public void mainMenu(){
		do{
			System.out.println("Please select one option: ");
			System.out.println("1 - Insert Client;");
			System.out.println("2 - Edit Client Data;");
			System.out.println("3 - Search Client;");
			System.out.println("0 - Exit");
		
			if(s.hasNextInt()){     //Se o valor recebido pelo Scanner for um inteiro, o programa continua.
			option= s.nextInt();
			}
			else{
				s.next();
			}
			
		}while(option!=0&&option!=1&&option!=2&&option!=3);
		//Restrição: o inteiro option só pode tomar os valores 0,1,2 ou 3.
		
		if(option==0){ //Caso option = 0, o programa sai.
			return;
		}
		
		if(option==1){ //Caso option=1, o programa avança para a criação de um cliente.
			sis.insert();
		}
		
		if(option==2){ //Caso option=2, o programa avança para a modificação de clientes existentes.
			sis.modify();
		}
		
		if(option==3){ //Caso option=3, o programa avança para a pesquisa de clientes.
			sis.search();
		}
		
	}
	
}