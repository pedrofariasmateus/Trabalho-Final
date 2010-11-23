
import junit.framework.TestCase;
import java.util.ArrayList;

public class testModify extends TestCase{

	public void test1(){
		
		Database x=new Database();
		Cliente c1=new Cliente("João Aiveca", "Bairro Nossa Sra. da Graça", 
				"987654321");
		
		Cliente c2=new Cliente("Pedro Mateias", "Your name was wrong", "931298746");
		c2.addEmail("joaidveca@hotmail.com");
		
		Cliente c3=new Cliente("Marlene Olivas", "Land of Doom", "966666666");
		c3.addEmail("joaivseca@hotmail.com");
		
		Cliente c4=new Cliente("Pedro Phathiash", "Bairro China", "4328756");
		c4.addEmail("joaivewqeca@hotmail.com");

		c1.addEmail("joaiveca@hotmail.com");
		c1.addEmail("B@hotmail.com");
		c1.addEmail("C@hotmail.com");
		c1.addEmail("D@hotmail.com");
		
		x.add(c4);
		x.add(c2);
		x.add(c3);
		x.add(c1);
		
		Cliente ccheck=x.search("joaiveca@hotmail.com", "email").get(0);
		
		ArrayList<String> velha = new ArrayList<String>();
		
		for(int i=0; i<ccheck.getEmail().size(); i++)
			velha.add(i, ccheck.email.get(i));
		
		
		x.modify("João Aiveca", "name", "B@hotmail.com", "jkeg@hotmail.com");
		
		Cliente ccheck2=x.search("joaiveca@hotmail.com", "email").get(0);
		ArrayList<String> nova = ccheck2.getEmail();
		
		boolean check=false;
		for(int i=0; i<nova.size(); i++)
			if(nova.get(i)!=velha.get(i))
				check=true;
		
		assertTrue(check);
		
		
	}
	
	
}
