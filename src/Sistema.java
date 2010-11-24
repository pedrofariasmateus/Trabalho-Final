import java.util.*;

public class Sistema {
	
	Scanner s = new Scanner(System.in);
	String atribute;
	Database d = new Database();
	Cliente client;
	
	public Cliente insert(){
		String n,m,p,e,ap ="";
	
		int info=0;
		
		System.out.println("Please insert a name:");
		
		n=s.nextLine();
		
		
		System.out.println("Please insert an address:");
		
		m=s.nextLine();
		
		
		System.out.println("Please insert a phone number:");
		p=s.nextLine();
		
		
		
	
		client = new Cliente(n,m,p);
		
		do{
			System.out.println("Would you like to insert an e-mail and an alternate phone number?");
			System.out.println("Yes - 1; No - 0");
			
			if(s.hasNextInt()){
				
			info = s.nextInt();
			
			}
			else{ 
				s.next();
			}
			
		}while(info!=0&&info!=1);
		
		if(info==0){
			client.email.add(null);
			client.phones.add(null);
			s.nextLine();
		}
		
		if(info ==1){
		
		System.out.println("Please insert an e-mail:");
		e=s.nextLine();
		s.nextLine();
		
		System.out.println("Please insert an alternate phone number:");
		ap=s.nextLine();
		
		
		client.email.add(e);
		client.phones.add(ap);
		}
		
		d.add(client);
		
		return client;
		
	}
	
	public void modify(){
		String se,at,edt,cat;
		System.out.println("Which client whose data you would like to edit?");
		System.out.println("Insert one attribute, please: ");
		se = s.nextLine();
		
		System.out.println("Available Options: name, address, main phone, email, phone;");
		System.out.println("What would you like to edit?");
		at = s.next();
		
		System.out.println("Available Options: name, address, main phone, email, phone;");
		System.out.println("Attribute to edit:");
		cat=s.nextLine();
		s.nextLine();
		
		System.out.println("Please edit the attribute chosen:");
		edt=s.nextLine();
		
		d.modify(se,at,cat,edt);
		
		
	}
	
	public void search(){
		System.out.println("Available Options: name, address, phone, email;");
		System.out.println("Search By: ");
		
		String searchby = s.next();
		
		System.out.println("Search:");
		String search = s.next();
		
		ArrayList<Cliente> searchresults = d.search(search,searchby);
		
		if(searchresults.size()!=0){
		System.out.println(searchresults.toString());
		}
		else{
			System.out.println("There aren't any clients corresponding to your search.");
		}
		
	}

}
