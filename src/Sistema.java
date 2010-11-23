import java.util.*;

public class Sistema {
	
	Scanner s = new Scanner(System.in);
	String atribute;
	Database d = new Database();
	
	public Cliente insert(){
		String n,m;
		String p;
		String e;
		String ap;
		int info=0;
		Cliente client;
		
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
		
		if(info ==1){
		
		System.out.println("Por favor insira um e-mail:");
		e=s.next();
		
		System.out.println("Por favor insira um telefone alternativo:");
		ap=s.next();
		
		client.email.add(e);
		client.phones.add(ap);
		}
		
		d.add(client);
		return client;
		
	}
	
	public void modify(Cliente c){
		String n,m,e;
		String p,ap;
		
		System.out.println("Qual o atributo que deseja alterar?");
			atribute=s.next();
			
		if((atribute.equals("Nome"))||atribute.equals("nome")){
			System.out.println("Insira o novo nome:");
			n=s.nextLine();
			c.setName(n);
			
		}
		if((atribute.equals("Morada"))||atribute.equals("morada")){
			System.out.println("Insira a nova morada");
			m=s.nextLine();
			c.setAddress(m);
			
		}
		if((atribute.equals("Telefone"))||(atribute.equals("telefone"))){
			System.out.println("Insira um novo número de telefone:");
			p=s.nextLine();
			c.setMainPhone(p);
			
		}
		if((atribute.equals("Telefone Alternativo"))||(atribute.equals("telefone alternativo"))){
			System.out.println("Insira um novo número de telefone alternativo:");
			ap=s.nextLine();
			c.modEmail(ap,c.email.get(0));
			
		}
		if((atribute.equals("Email"))||(atribute.equals("email"))||(atribute.equals("E-mail"))||(atribute.equals("e-mail"))){
			System.out.println("Insira um novo e-mail:");
			e=s.nextLine();
			//c.add(4,e);
			
		}
	}
	
	public void search(){
		
		System.out.println("Pesquisar Por: ");
		String searchby = s.next();
		
		System.out.println("Pesquisar:");
		String search = s.next();
		//ArrayList searchresults = d.search(search,searchby);
		//System.out.println(searchresults.get(0).toString());
		
	}

}
