import junit.framework.TestCase;

public class testCliente extends TestCase{
	 
	public void test1{
		Cliente c = new Cliente("Marlene Oliveira","Rua Desconhecida","96523423");
		c.email.add("evil@hell.com");
		c.phones.add("92345678");
		
		assertTrue(c.getNome().equals("Marlene Oliveira"));
		assertTrue(c.getAddress().equals("Rua Desconhecida"));
		assertTrue(c.getPhones().equals("96523423"));
		assertTrue(c.email.get(0).equals("evil@hell.com"));
		assertTrue(c.phones.get(0).equals("92345678"));
	}
	
	public void teste2{
		Cliente cl = new Cliente("Marlene Oliveira","Rua Desconhecida","96523423");
		cl.email.add("evil@hell.com");
		cl.phones.add("92345678");
		
		cl.setName("Pedro Mateus");
		cl.setAddress("Hell inc");
		cl.setMainPhone("966666666");
		cl.modEmail("devilitself@hell.com","evil@hell.com");
		cl.modPhones("92666666", "966666666");
		
		assertTrue(cl.getNome().equals("Pedro Mateus"));
		assertTrue(cl.getAddress().equals("Hell inc"));
		assertTrue(cl.getPhones().equals("966666666"));
		assertTrue(cl.email.get(0).equals("devilitself@hell.com"));
		assertTrue(cl.phones.get(0).equals("92666666"));
		
	}
	
}
