import junit.framework.TestCase;

public class testSearchName extends TestCase{
	
	public void testPerName(){
		Database x=new Database();
		Cliente c1=new Cliente("João Aiveca", "Bairro Nossa Sra. da Graça", 
				"987654321");
		c1.addEmail("joaiveca@hotmail.com");
		Cliente c2=new Cliente("Pedro Mateias", "Your name was wrong", 
				"931298746");

		c2.addEmail("joaidveca@hotmail.com");
		Cliente c3=new Cliente("Marlene Olivas", "Land of Doom", 
				"966666666");

		c3.addEmail("joaivseca@hotmail.com");
		Cliente c4=new Cliente("Pedro Phathiash", "Bairro China", 
				"4328756");
		c4.addEmail("joaivewqeca@hotmail.com");
		
		x.add(c1);
		x.add(c2);
		x.add(c3);
		x.add(c4);
		
		Cliente ccheck=x.search("joaiveca@hotmail.com", "email").get(0);
		assertEquals(c1, ccheck);//só para dizer que dá
	}

}
