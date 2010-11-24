import junit.framework.TestCase;

public class testCliente extends TestCase{
	 
	public void test1{
		Cliente c = new Cliente("Marlene Oliveira","Rua Desconhecida","96523423");
		c.email.add("evil@hell.com");
		c.phones.add("92345678");
		
		assertEquals("Marlene Oliveira",c.getNome());
		assertEquals("Rua Desconhecida",c.getAddress());
		assertEquals("96523423",c.getPhones());
		assertEquals("evil@hell.com",c.email.get(0));
		assertEquals("92345678",c.phones.get(0));
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
		
		assertEquals("Pedro Mateus",cl.getNome());
		assertEquals("Hell inc",cl.getAddress());
		assertEquals("966666666",cl.getPhones());
		assertEquals("devilitself@hell.com",cl.email.get(0));
		assertEquals("92666666",cl.phones.get(0));
		
	}
	
}
