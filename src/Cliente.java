import java.util.ArrayList;

public class Cliente {
	//Em String temos os valores de string completos (ex. "Nome1 Nome2 Nome3")
	//Em ArrayList temos os valores para pesquisa nome-a-nome (Ex. "Nome1" "Nome2" "Nome3")
	String name, address, mainPhone;
	ArrayList<String> email=new ArrayList<String>(); 
	ArrayList<String> phones=new ArrayList<String>(); 
	ArrayList<String> nameA, addressA;

	public Cliente(String n, String a, String p){
		//Construtor com os 3 dados obrigatórios.
		
		this.name=n;
		nameA=(ConvertString.Converter(name));
		
		this.address=a;
		addressA=(ConvertString.Converter(address));
		
		this.mainPhone=p;
				
	}
	
	public String toString(){
		//ToString convencional. Os ifs tratam dos casos especiais de ter email ou outros telefones.
		String toPrint= "Nome Cliente: "+name+"; "+"Morada: "+address+"; "+"Nº telefone principal: "+mainPhone+"; ";
		
		if(phones.isEmpty()==false)
			toPrint=toPrint+"Número(s) de Telefone: "+phones.toString()+"; ";

		if(email.isEmpty()==false)
			toPrint=toPrint+"Endereços de E-mail: "+email.toString()+"; ";
		
		
		return toPrint;
	}
	public void setName(String n){
		//Reatribui o nome.
		this.name=n;
		nameA=(ConvertString.Converter(name));
		
	}
	public void setAddress(String a){
		//Reatribui a morada.
		this.address=a;
		addressA=(ConvertString.Converter(address));
	}
	public void setMainPhone(String p){
		//Reatribui o telefone principal.
		this.mainPhone=p;
	}
	public void modEmail(String ein, String eout){
		//Altera um dos emails.
		for(int a=0; a<email.size();a++){
			if(this.email.get(a).equals(eout)==true){
				this.email.set(a,ein);
			}
		}
	}
	public void modPhones(String pin, String pout){
		//Altera um dos nºs de telefone secundários.
		for(int a=0; a<phones.size();a++){
			if(this.phones.get(a).equals(pout)==true){
				this.phones.set(a,pin);
			}
		}
	}
	public String getNome(){
		//retorna o nome.
		return this.name;
	}
	public String getAddress(){
		//retorna a morada.
		return this.address;
	}
	public String getMainPhone(){
		//retorna o telefone principal.
		return this.mainPhone;
	}
	public ArrayList<String> getPhones(){
		//retorna uma arraylist com os telefones.
		return this.phones;
	}
	public ArrayList<String> getEmail(){
		//Retorna uma arraylist com os emails.
		return this.email;
	}
	public void addPhones(String p){
		//Adiciona um nº de telefone (secundário).
		this.phones.add(p);
	}
	public void addEmail(String e){
		//Adiciona um email (secundário).
		this.email.add(e);
	}
}

