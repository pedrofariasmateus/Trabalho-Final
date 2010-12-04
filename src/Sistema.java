import java.util.*;

public class Sistema {
	/* Nesta classe � feita a cria��o de clientes
	 * e a posterior inser��o dos mesmos na base de dados do sistema,
	 * bem como a altera��o dos dados de clientes que j� se encontrem 
	 * na base de dados e, finalmente, a pesquisa de clientes.
	 */
	
	Scanner s = new Scanner(System.in);
	Database d = new Database();  //Base de dados onde ser�o guardados os clientes.
	Cliente client;
	
	public void insert(){
		//Neste m�todo � efectuada a cria��o de clientes e a sua inser��o na base de dados.
		String n,m,p,e,e1,ap,ap1 ="";
		int opte,optap = 0;
		int info=0;
		
		System.out.println("Please insert a name:");
		
		n=s.nextLine();
		
		
		System.out.println("Please insert an address:");
		
		m=s.nextLine();
		
		
		System.out.println("Please insert a phone number:");
		p=s.nextLine();
		
		client = new Cliente(n,m,p); //Cliente criado com os atributos inseridos.
		
		do{ //Caso o utilizador o deseje, pode inserir e-mails e n�meros de telefone alternativos.
			System.out.println("Would you like to insert an e-mail and an alternate phone number?");
			System.out.println("Yes - 1 ; No - 0");
			
			if(s.hasNextInt()){ //Se o valor recebido pelo Scanner for um inteiro, o programa continua.
				
			info = s.nextInt();
			
			}
			else{ 
				s.next();
			}
			
		}while(info!=0&&info!=1);//Restri��o: o inteiro info s� pode tomar os valores 0 ou 1;
		
		if(info==0){ 
			//Caso o utilizador decida avan�ar sem introduzir e-mails ou n�meros de telefone alternativos,
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
		
		//Depois da inser��o de um endere�o de e-mail, � poss�vel inserir outro.
		System.out.println("Would you like to insert another one?");
		System.out.println("Yes - 1 ; No - 0");
		opte=s.nextInt();
		
		if(opte==1){ 
		System.out.println("Please insert an e-mail:");
		e1=s.next();
		//s.nextLine();
		}
		if(opte==0){
		
		System.out.println("Please insert an alternate phone number:");
		ap=s.next();
		//Depois da inser��o de um n�mero de telefone alternativo, � poss�vel inserir outro.
		System.out.println("Would you like to insert another one?");
		System.out.println("Yes - 1 ; No - 0");
		optap = s.nextInt();
		
		if(optap==1){
		System.out.println("Please insert an alternate phone number:");
		ap1=s.next();
			}
		/*else{
			s.nextLine();
			}
		}
		*/
		client.email.add(e);
		client.phones.add(ap);
		client.phones.add(ap1);
		}
		
		d.add(client); //O programa adiciona o cliente � base de dados.
		s.nextLine();
		}
		
		
	}
	
	public void modify(){
		//Neste m�todo � poss�vel fazer a altera��o de dados de cliente.
		String se,at,tc,edt;
		String cat="";
		
//Inicialmente � pedido ao utilizador o atributo pelo qual quer pesquisar o cliente cujos dados quer alterar.
		System.out.println("Available Options: name, address, mainphone, email,phone;");
		System.out.println("Search client by?");
		at = s.nextLine();
		
		
//De seguida o utilizador ter� de inserir a(s) palavra(s) chave pelas quais ir� ser feita a pesquisa.  
		System.out.println("Which client whose data you would like to edit?");
		se = s.nextLine();
		//System.out.println();

		
//Seguidamente o utilizador ter� de escolher o atributo a alterar.
		System.out.println("Available Options: name, address, mainphone, email,phone;");
		System.out.println("What would you like to edit?");
		tc = s.nextLine();
	
//O utilizador poder� inserir o tipo da altera��o desejada.
	
		if(tc.equals("email")){
			System.out.println("Please insert the old data:");
			cat=s.nextLine();
		}
		//else{
			
			//ArrayList<String>test = d.search(se, at).get(0).getEmail(); 
			//cat=test.toString();
			//System.out.println(test.toString());
		//}
		
		if(tc.equals("phone")){
			System.out.println("Please insert the old data:");
			cat=s.nextLine();
		}
		
		if(!(tc.equals("email"))){
			ArrayList<String>test = d.search(se, at).get(0).getEmail(); 
			String ce=test.toString();
			cat=ce;
			//System.out.println(test.toString());
		}
		
		if(!(tc.equals("phone"))){
			ArrayList<String>test = d.search(se, at).get(0).getPhones();
			String cap = test.toString();
			cat=cap;
		}
	
		
//Finalmente o utilizador poder� inserir a altera��o desejada.
		System.out.println("Please edit the attribute chosen:");
		edt=s.nextLine();
		
		d.modify(se,at,tc,cat,edt); //O programa efectua a altera��o.
		
	}
	
	public void search(){
		//Este m�todo permite a pesquisa de clientes.
		System.out.println("Available Options: name, address, phone, email, mainphone;");
		System.out.println("Search By: ");
		
		String searchby = s.next();  //String correspondente ao tipo do atributo a pesquisar.
		s.nextLine();
		System.out.println("Search:");
		String search = s.next(); //Palavra(s) chave a pesquisar.
		
		
		ArrayList<Cliente> searchresults = d.search(search,searchby); //ArrayList que cont�m os resultados da pesquisa.
		
		if(searchresults.size()!=0){//Se extistirem resultados, o programa retorna-os no output.
		System.out.println(searchresults.toString());
		}
		else{//Caso n�o existam resultados, o programa retorna uma mensagem de erro no output.
			System.out.println("There aren't any clients corresponding to your search.");
		}
		
	}

}
