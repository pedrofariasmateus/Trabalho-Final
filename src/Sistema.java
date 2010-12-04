import java.util.*;

public class Sistema {
	/* Nesta classe é feita a criação de clientes
	 * e a posterior inserção dos mesmos na base de dados do sistema,
	 * bem como a alteração dos dados de clientes que já se encontrem 
	 * na base de dados e, finalmente, a pesquisa de clientes.
	 */
	
	Scanner s = new Scanner(System.in);
	Database d = new Database();  //Base de dados onde serão guardados os clientes.
	Cliente client;
	
	public void insert(){
		//Neste método é efectuada a criação de clientes e a sua inserção na base de dados.
		String n,m,p,e,e1,ap,ap1 ="";
		int opte,optap = 0;
		int info=0;
		
		System.out.println("Please insert a name:");
		
		n=s.nextLine();
		
		
		System.out.println("Please insert an address:");
		
		m=s.nextLine();
		
		
		System.out.println("Please insert a phone number:");
		p=s.next();
		
		client = new Cliente(n,m,p); //Cliente criado com os atributos inseridos.
		
		do{ //Caso o utilizador o deseje, pode inserir e-mails e números de telefone alternativos.
			System.out.println("Would you like to insert an e-mail and an alternate phone number?");
			System.out.println("Yes - 1 ; No - 0");
			
			if(s.hasNextInt()){ //Se o valor recebido pelo Scanner for um inteiro, o programa continua.
				
			info = s.nextInt();
			
			}
			else{ 
				s.next();
			}
			
		}while(info!=0&&info!=1);//Restrição: o inteiro info só pode tomar os valores 0 ou 1;
		
		if(info==0){ 
			//Caso o utilizador decida avançar sem introduzir e-mails ou números de telefone alternativos,
			//o programa preenche os campos correspondentes aos e-mails e telefones alternativos e volta
			//ao menu principal.
			client.email.add(null);
			client.phones.add(null);
			s.nextLine();
		}
		
		if(info ==1){
			//Caso o utilizador decida inserir dados de e-mail e telefone alternativo, o programa continua.
		
		System.out.println("Please insert an e-mail:");
		e=s.next();
		//s.nextLine();
		
		//Depois da inserção de um endereço de e-mail, é possível inserir outro.
		System.out.println("Would you like to insert another one?");
		System.out.println("Yes - 1 ; No - 0");
		opte=s.nextInt();
		
		if(opte==1){ 
		System.out.println("Please insert an e-mail:");
		e1=s.next();
		s.nextLine();
		}
		
		
		System.out.println("Please insert an alternate phone number:");
		ap=s.next();
		//Depois da inserção de um número de telefone alternativo, é possível inserir outro.
		System.out.println("Would you like to insert another one?");
		System.out.println("Yes - 1 ; No - 0");
		optap = s.nextInt();
		
		if(optap==1){
		System.out.println("Please insert an alternate phone number:");
		ap1=s.next();
		}
		else{
			s.nextLine();
		}
		
		client.email.add(e);
		client.phones.add(ap);
		client.phones.add(ap1);
		}
		
		d.add(client); //O programa adiciona o cliente à base de dados.
		
		
		
	}
	
	public void modify(){
		//Neste metodo e possivel fazer a alteracao de dados de cliente.
		String se,at,tc,edt,cat;

		//Inicialmente e pedido ao utilizador o atributo pelo qual quer pesquisar o cliente cujos dados quer alterar.
		System.out.println("Available Options: name, address, phone, email;");
		System.out.println("Search client by?");
		at = s.next();

		//De seguida o utilizador tera de inserir a(s) palavra(s) chave pelas quais ira ser feita a pesquisa.
		System.out.println("Which client whose data you would like to edit?");
		se = s.nextLine();
		s.nextLine();

		//Seguidamente o utilizador tera de escolher o atributo a alterar.
		System.out.println("Available Options: name, address, phone, email;");
		System.out.println("What would you like to edit?");
		tc = s.next();

		//O utilizador podera inserir o tipo da alteracao desejada.
		System.out.println("Available Options: name, address, phone, email;");
		System.out.println("Attribute to edit:");
		cat=s.nextLine();
		s.nextLine();
		
		//Finalmente o utilizador podera inserir a alteracao desejada.
		System.out.println("Please edit the attribute chosen:");
		edt=s.nextLine();

		d.modify(se,at,tc,cat,edt); //O programa efectua a alteracao. 
		
	}
	
	public void search(){
		//Este método permite a pesquisa de clientes.
		System.out.println("Available Options: name, address, phone, email, mainphone;");
		System.out.println("Search By: ");
		
		String searchby = s.next();  //String correspondente ao tipo do atributo a pesquisar.
		s.nextLine();
		System.out.println("Search:");
		String search = s.next(); //Palavra(s) chave a pesquisar.
		
		
		ArrayList<Cliente> searchresults = d.search(search,searchby); //ArrayList que contém os resultados da pesquisa.
		
		if(searchresults.size()!=0){//Se extistirem resultados, o programa retorna-os no output.
		System.out.println(searchresults.toString());
		}
		else{//Caso não existam resultados, o programa retorna uma mensagem de erro no output.
			System.out.println("There aren't any clients corresponding to your search.");
		}
		
	}

}
