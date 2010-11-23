import java.util.ArrayList;

public class Cliente extends ArrayList {
	String name, address, phone, email, altphone;
	
	ConvertString s1=new ConvertString();
	ConvertString s2=new ConvertString();
	
	public Cliente(String n, String a, String p, String e, String ap){
		
		this.name=n;
		this.add(s1.Converter(name));
		
		this.address=a;
		this.add(s2.Converter(address));
		
		
		this.phone=p;
		this.add(phone);
		
		this.email=e;
		this.add(email);
		
		this.altphone=ap;
		this.add(altphone);
	}
	
	public Cliente(String n, String a, String p){

		this.name=n;
		this.add(s1.Converter(name));
		
		this.address=a;
		this.add(s2.Converter(address));
		
		
		this.phone=p;
		this.add(phone);
	}
	
	
	ArrayList<Object> getClient(){
		return this;
		
	}
	
	
	void add(int position, String s){
		
		/*Colocar a posição.
		0 - nome, 1 - address, 2 - phone, 3 - email, 4 - altphone*/
		this.remove(position);
		this.add(s);
		
	}
	
	
	public String toString(){
		String toPrint= "Nome Cliente: "+name+"; "+"Morada: "+address+"; "+"Telefone: "+phone+"; ";
		if(email!=null)
			toPrint=toPrint+ "E-mail: "+ email + "; ";
		if(altphone!=null)
			toPrint=toPrint+ "Telefone Alternativo" + altphone + "; ";
		return toPrint;
	}
}
