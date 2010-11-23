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

	ArrayList<Cliente> search(String input , String tipo) {
	
		ArrayList<String> inp=new ArrayList<String>();
		if(tipo.equals("address")==true||tipo.equals("name")==true)
			inp=ConvertString.Converter(input);
		
		
		int count=0;
		ArrayList<Cliente> toReturn=new ArrayList<Cliente>();
		for(int i=0; i<data.size(); i++){
			Cliente temp=data.get(i);
			
			ArrayList<String> inpTemp = null;
			if(tipo.equals("name")==true){
				inpTemp=temp.nameA;}
			if(tipo.equals("address")==true){
				inpTemp=temp.addressA;}
			
			if(tipo.equals("address")==true||tipo.equals("name")==true){
			for(int j=0; j<inp.size(); j++){
				for(int k=0; k<inpTemp.size(); k++){
					String a=inpTemp.get(k);
					String b=inp.get(j);
					boolean x=a.equals(b);
					if(x==true){
						count++;
					}
				}
			}
			if(count==inp.size())
				toReturn.add(temp);
			count=0;
			}
			else
			{
				
				
			}
				
		}
		return toReturn;
	}
	
	void modify(Cliente oldStr, Cliente newStr) {

	}
	
	void modify(String dados, int position, Cliente c) {
	}
	
}

