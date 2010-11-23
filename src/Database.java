import java.util.ArrayList;
import java.lang.String;

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

	
	void modify(Cliente oldStr, Cliente newStr) {

	}
	
	void modify(String dados, int position, Cliente c) {
	}
	

	
}
