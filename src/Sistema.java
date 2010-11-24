import java.util.*;

public class Sistema {
	
	Scanner s = new Scanner(System.in);
	String atribute;
	Database d = new Database();
	Cliente client;
	
	public Cliente insert(){
		String n,m,p,e,ap ="";
	
		int info=0;
		
		System.out.println("Por favor insira um nome:");
		
		n=s.nextLine();
		
		
		System.out.println("Por favor insira uma morada:");
		
		m=s.nextLine();
		
		
		System.out.println("Por favor insira um número de telefone:");
		p=s.nextLine();
		
		
		
	
		client = new Cliente(n,m,p);
		
		do{
			System.out.println("Deseja inserir um e-mail e um número de telefone alternativo?");
			System.out.println("Sim - 1; Não - 0");
			
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
		
		System.out.println("Por favor insira um e-mail:");
		e=s.nextLine();
		s.nextLine();
		
		System.out.println("Por favor insira um telefone alternativo:");
		ap=s.nextLine();
		
		
		client.email.add(e);
		client.phones.add(ap);
		}
		
		d.add(client);
		
		return client;
		
	}
	
	public void modify(){
		String se,at;
		System.out.println("Qual o cliente cujos dados pretende alterar?");
		se = s.nextLine();
		
		System.out.println("O que pretende alterar?");
		at = s.next();
		
		//d.modify(se, at);
	}
	
	public void search(){
		
		System.out.println("Search By: ");
		System.out.println("Available Options: name, address, phone, email;");
		String searchby = s.next();
		
		System.out.println("Search:");
		String search = s.next();
		
		ArrayList<Cliente> searchresults = d.search(search,searchby);
		
		if(searchresults.size()!=0){
		System.out.println(searchresults.toString());
		}
		else{
			System.out.println("A sua pesquisa não retornou resultados.");
		}
		
	}

}
