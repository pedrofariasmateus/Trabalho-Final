import java.util.ArrayList;

public class Database {
	ArrayList<Cliente> data;

	public Database() {
		data = new ArrayList<Cliente>();
	}

	void add(Cliente c) {
		data.add(c);
	}

	Cliente getCliente(int pos) {
		Cliente toRet = data.get(pos);
		return toRet;
	}

	Cliente searchByName(String nome) {
		ConvertString x = new ConvertString();
		ArrayList<String> providedName = x.Converter(nome);
			
		int remainingClients=data.size();
		boolean check = false;
		int temporary = 0;
		Cliente c1;
		int i=0;
		
		while(remainingClients!=0){
			

			c1 = data.get(i);
			i++;
			remainingClients--;
			
			ArrayList<Object> tempClient = c1.getClient();
			ArrayList<String> tempName = (ArrayList<String>) tempClient.get(0);
			
			
			for (int k = 0; k < providedName.size(); k++) {
				String test = providedName.get(k);
				
					
				for (int j = 0; j < tempName.size(); j++) {
						String l=tempName.get(j);					
					if (test == l)
						temporary++;
						System.out.println(temporary);	
				}
			}

			if (temporary == providedName.size()) {
				check = true;
				return c1;
			} else
				temporary = 0;
		}
		
		return null;
	}

	void modify(Cliente oldStr, Cliente newStr) {

		for (int i = 0; i < data.size(); i++) {
			Cliente temp = data.get(i);
			if (temp == oldStr) {
				data.remove(i);
				data.add(i, newStr);
			}
			}
	}
	
	void modify(String dados, int position, Cliente c) {

		for (int i = 0; i < data.size(); i++) {
			Cliente temp = data.get(i);
			if (temp == c) {
				data.remove(i);
				temp.remove(i);
				temp.add(i, dados);
				data.add(i, temp);
			}
		}
	}
	

	ArrayList<Cliente> getDB() {
		return this.data;
	}
}
