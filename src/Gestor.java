import java.util.*;

public class Gestor {
	
	public static void main(String args []){
		boolean exit = false;
		Menu m = new Menu();
		Sistema sis = new Sistema();
		Database d = sis.d;
		do{
			m.mainMenu();
			if(m.option==0){
				exit=true;
			}
		}while(exit!=true);
			
		
		
		
		
		//Cliente c = sis.d.getCliente(0);
		//String cli = c.toString();
		
		//System.out.println(cli);
		
		
		
			/*Database a=new Database();
			Cliente c1=new Cliente("João Aiveca", "Bairro N", null, null, null);
			Cliente c2=new Cliente("Pedro ", "Evora N",null, null, null);
			Cliente c3=new Cliente("Marlene ", "Bairro N", null, null, null);
			Cliente c4=new Cliente("Xlhéu ", "chocolate N", null, null, null);
			
			a.add(c1);
			a.add(c2);
			a.add(c3);
			//System.out.println(a.getDB());
			a.modify(c2, c4);
			//System.out.println(a.getDB());
			Cliente c5=a.searchByName("João Aiveca");
			//System.out.println(c5);
			a.modify(c4, c5);
			a.modify("not João", 0, c1);
			
			
			//a.modify(c2, c1);
			//System.out.println(a.getDB());
			//System.out.println(c5);*/
		}
	
	
}
