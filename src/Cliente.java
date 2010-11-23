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
			toPrint=toPrint+phones.toString();

		if(email.isEmpty()==false)
			toPrint=toPrint+email.toString();
		
		return toPrint;
	}
}