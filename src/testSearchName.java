import junit.framework.TestCase;
import java.util.ArrayList;

public class testSearchName extends TestCase{
	
	public void test1(){
		Database x=new Database();
		Cliente c1=new Cliente("João Aiveca", "Bairro Nossa Sra. da Graça", 
				"987654321");
		Cliente c2=new Cliente("Pedro Mateias", "Your name was wrong", 
				"931298746");
		Cliente c3=new Cliente("Marlene Olivas", "Land of Doom", 
				"966666666");
		Cliente c4=new Cliente("Pedro Phathiash", "Bairro China", 
				"4328756");
		x.add(c1);
		x.add(c2);
		x.add(c3);
		x.add(c4);
		
		
		System.out.print(x.search("Your name was wrong", "address"));
		Cliente ccheck=x.search("Your name was wrong", "address").get(0);
		
		assertEquals(c2, ccheck);//só para dizer que dá
	}

}
