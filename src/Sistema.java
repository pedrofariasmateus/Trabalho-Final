
public class Sistema {
	
public static void main(String[]args){
	Database a=new Database();
	Cliente c1=new Cliente("João Aiveca", "Bairro N", null, null, null);
	Cliente c2=new Cliente("Pedro ", "Evora N",null, null, null);
	Cliente c3=new Cliente("Marlene ", "Bairro N", null, null, null);
	Cliente c4=new Cliente("Xlhéu ", "chocolate N", null, null, null);
	
	a.add(c1);
	a.add(c2);
	a.add(c3);
	//System.out.println(a.getDB());
	a.modify(c2, c4);
	//System.out.println(a.getDB());
	Cliente c5=a.searchByName("João Aiveca");
	//System.out.println(c5);
	a.modify(c4, c5);
	a.modify("not João", 0, c1);
	
	
	//a.modify(c2, c1);
	//System.out.println(a.getDB());
	//System.out.println(c5);
	}
}
