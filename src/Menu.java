import java.util.*;

public class Menu {
	int option;
	Scanner s = new Scanner(System.in);
	Sistema sis = new Sistema();
	
	
	public void mainMenu(){
		do{
			System.out.println("Por favor escolha uma opção: ");
			System.out.println("1 - Inserir Cliente;");
			System.out.println("2 - Alterar Dados de Cliente;");
			System.out.println("3 - Procurar Cliente;");
			System.out.println("0 - Sair do Gestor de Clientes");
		
			if(s.hasNextInt()){
			option= s.nextInt();
			}
			else{
				s.next();
			}
			
		}while(option!=0&&option!=1&&option!=2&&option!=3);
		
		switch(option){
		case 0: return;
		case 1: insertMenu();
		case 2: modifyMenu();
		case 3: searchMenu();
		
		}
	}
	
	public void insertMenu(){
		sis.insert();
	}
	
	public void modifyMenu(){
		//sis.modify();
	}
	
	public void searchMenu(){
		sis.search();
	}
	
}



