import java.util.ArrayList;

public class Database {
	ArrayList<Cliente> data;

	public Database() {
		data = new ArrayList<Cliente>();
	}

	void add(Cliente c) {
		data.add(c);
	}

	ArrayList<Cliente> getDB() {
		return this.data;
	}

	Cliente getCliente(int pos) {
		Cliente toRet = data.get(pos);
		return toRet;
	}

	Cliente searchByName(String nome) {
		for(int i=0; i<data.size()-1; i++){
			//Cliente retirado da BD a comparar
			Cliente temp=data.get(i);
			ArrayList<String> nameTemp=(ArrayList<String>) temp.get(0);
			
			
			
		}
			
		
	}

	void modify(Cliente oldStr, Cliente newStr) {

	}
	
	void modify(String dados, int position, Cliente c) {
	}
	

	
}
