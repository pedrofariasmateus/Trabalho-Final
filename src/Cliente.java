import java.util.ArrayList;

public class Cliente {
	String name, address, phone, email, altphone;
	
	ConvertString s1=new ConvertString();
	ConvertString s2=new ConvertString();
	ArrayList<String> nameA, addressA;
	
	public Cliente(String n, String a, String p, String e, String ap){
		
		this.name=n;
		nameA=(s1.Converter(name));
		this.address=a;
		addressA=(s2.Converter(address));
		this.phone=p;
		this.email=e;
		this.altphone=ap;
	}
	
	public Cliente(String n, String a, String p){

		this.name=n;
		nameA=(s1.Converter(name));
		
		this.address=a;
		addressA=(s2.Converter(address));
		
		
		this.phone=p;
		
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