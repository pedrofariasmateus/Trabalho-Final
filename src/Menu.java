
import java.util.*;

public class Menu {
	int option;
	Scanner s = new Scanner(System.in);
	Sistema sis = new Sistema();
	
	
	
	public void mainMenu(){
		do{
			System.out.println("Please select one option: ");
			System.out.println("1 - Insert Client;");
			System.out.println("2 - Edit Client Data;");
			System.out.println("3 - Search Client;");
			System.out.println("0 - Exit");
		
			if(s.hasNextInt()){
			option= s.nextInt();
			}
			else{
				s.next();
			}
			
		}while(option!=0&&option!=1&&option!=2&&option!=3);
		
		if(option==0){
			return;
		}
		
		if(option==1){
			sis.insert();
		}
		
		if(option==2){
			sis.modify();
		}
		
		if(option==3){
			sis.search();
		}
		
	}
	
}