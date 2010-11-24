
public class Gestor {
	
	/*Esta classe serve unicamente para controlar
	 * o sistema, permitindo que o programa termine
	 * assim que o utilizador escolher a opção "0 - Exit"
	 * do menu principal.
	 */
	
	public static void main(String args []){
		boolean exit = false;   //boolean que indica se é possível sair do sistema.
		Menu m = new Menu();
		
		do{
		
		m.mainMenu();
		if(m.option!=0){       //Caso o inteiro que corresponde à opção do utilizador seja 
			                   //diferente de zero, o programa volta a apresentar o menu principal.
			m.mainMenu();
			
			}
		if(m.option==0){       //Quando o inteiro que simboliza a opção é zero, o boolean exit passa ter o
							   //valor true e o programa termina a sua execução;
			exit=true;
			}
		}
		while(exit!=true);
		
		}
}