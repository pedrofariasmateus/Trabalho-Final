
public class Cliente {
	String name;
	String address;
	long phone;
	String email;
	long altphone;
	
	public Cliente(){
		name="";
		address="";
		phone=0;
		email="";
		altphone=0;
	}
	
	public Cliente(String n,String a,long p){
		this.name=n;
		this.address=a;
		this.phone=p;
		
	}
	
	public Cliente(String e,long ap){
		this.email=e;
		this.altphone=ap;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name=n;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String a){
		address=a;
	}
	
	public long getPhone(){
		return phone;
	}
	
	public void setPhone(long p){
		phone=p;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String e){
		email=e;
	}
	
	public long getAltPhone(){
		return altphone;
	}
	
	public void setAltPhone(long ap){
		altphone=ap;
	}
	
	public String toString(){
		return "Nome Cliente: "+name+"; "+"Morada: "+address+"; "+"Telefone: "+phone+"; ";
	}
	
	public String compString(){
		return "Informação Complementar E-mail: "+email+"; "+"Contacto Alternativo: "+altphone+"; ";
	}
	
	public static void main(String [] args){
		
		Cliente c = new Cliente("marlene","r.dinis",1224343123);
		System.out.println(c.toString());
		System.out.println(c.compString());
	}
}
