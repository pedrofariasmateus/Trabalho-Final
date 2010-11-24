
public class Gestor {
	
	public static void main(String args []){
		boolean exit = false;
		Menu m = new Menu();
		
		do{
		
		m.mainMenu();
		if(m.option!=0){
			m.mainMenu();
			
			}
		if(m.option==0){
			exit=true;
			}
		}
		while(exit!=true);
		
		}
}