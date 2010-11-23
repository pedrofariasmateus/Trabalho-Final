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
			{if(tipo.equals("phone")){
				ArrayList<String> t=temp.getPhones();
				for(int q=0; q<t.size(); q++)
					if(t.get(q).equals(input)==true)
						toReturn.add(temp);}
			
			if(tipo.equals("email")){
				ArrayList<String> t=temp.getEmail();
				for(int q=0; q<t.size(); q++)
					if(t.get(q).equals(input)==true)
						toReturn.add(temp);
				}
			}
				
			
				
		}
		return toReturn;
	}
	
	public String toString(){
		
		return data.toString();
	}
	
	public void modify(String toSearch, String type, String old, String nova){
		
		Cliente ccheck=this.search(toSearch, type).get(0);
		
		ccheck.modEmail(nova, old);
		
	}
}
}

