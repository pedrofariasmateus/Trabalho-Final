import java.util.ArrayList;

public class Cliente {
	
	String name, address, mainPhone;
	ArrayList<String> email=new ArrayList<String>(); 
	ArrayList<String> phones=new ArrayList<String>(); 
	ArrayList<String> nameA, addressA;

	public Cliente(String n, String a, String p){

		this.name=n;
		nameA=(ConvertString.Converter(name));
		
		this.address=a;
		addressA=(ConvertString.Converter(address));
		
		this.mainPhone=p;
				
	}
	
	public String toString(){
		String toPrint= "Nome Cliente: "+name+"; "+"Morada: "+address+"; "+"Nº telefone principal: "+mainPhone+"; ";
		
		if(phones.isEmpty()==false)
			toPrint=toPrint+"Número(s) de Telefone: "+phones.toString()+"; ";

		if(email.isEmpty()==false)
			toPrint=toPrint+"Endereços de E-mail: "+email.toString()+"; ";
		
		
		return toPrint;
	}
	public void setName(String n){
		this.name=n;
		nameA=(ConvertString.Converter(name));
		
	}
	public void setAddress(String a){
		this.address=a;
		addressA=(ConvertString.Converter(address));
	}
	public void setMainPhone(String p){
		this.mainPhone=p;
	}
	public void modEmail(String ein, String eout){
		for(int a=0; a<email.size();a++){
			if(this.email.get(a).equals(eout)==true){
				this.email.set(a,ein);
			}
		}
	}
	public void modPhones(String pin, String pout){
		for(int a=0; a<phones.size();a++){
			if(this.phones.get(a).equals(pout)==true){
				this.phones.set(a,pin);
			}
		}
	}
	public String getNome(){
		return this.name;
	}
	public String getAddress(){
		return this.address;
	}
	public String getMainPhone(){
		return this.mainPhone;
	}
	public ArrayList<String> getPhones(){
		return this.phones;
	}
	public ArrayList<String> getEmail(){
		return this.email;
	}
	public void addPhones(String p){
		this.phones.add(p);
	}
	public void addEmail(String e){
		this.email.add(e);
	}
}

