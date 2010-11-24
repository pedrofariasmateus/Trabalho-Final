import java.util.ArrayList;
import java.lang.String;
 
public class Database {
	//data refere-se á arraylist que representa a base de dados.
	ArrayList<Cliente> data;
	
	public Database() {
		data = new ArrayList<Cliente>();
	}
	
	void add(Cliente c) {
		//Adiciona um cliente á base de dados.
		data.add(c);
	}
	
	ArrayList<Cliente> getDB() {
		//retorna a base de dados completa.
		return this.data;
	}
	
	Cliente getCliente(int pos) {
		//Retorna um cliente numa posição específica da base de dados.
		Cliente toRet = data.get(pos);
		return toRet;
	}
	
	ArrayList<Cliente> search(String input , String tipo) {
	//Pesquisa clientes segundo o seu nome, morada, telefone ou email (tipo).
		
		//inp refere-se ao que o utilizador deu como dado de procura. Caso seja morada ou
		//nome, parti-lo-á de forma a tornar a procura por partes do nome possível.
		ArrayList<String> inp=new ArrayList<String>();
		if(tipo.equals("address")==true||tipo.equals("name")==true)
			inp=ConvertString.Converter(input);
		int count=0;
		
		//Clientes a retornar que satisfaçam os critérios de procura.
		ArrayList<Cliente> toReturn=new ArrayList<Cliente>();
			
		for(int i=0; i<data.size(); i++){
			//Cliente retirado da BD.
			Cliente temp=data.get(i);
			//nome ou morada do cliente retirado da BD, separados para permitir pesquisa
			//parcial.
			ArrayList<String> inpTemp = null;
			if(tipo.equals("name")==true){
				inpTemp=temp.nameA;}
			if(tipo.equals("address")==true){
				inpTemp=temp.addressA;}
			
			//Se temos uma pesquisa por nome ou morada, executa o código que verifica
			//o input tendo em conta a possibilidade de estarem presentes apenas parte
			//dos componentes do nome ou morada.
			if(tipo.equals("address")==true||tipo.equals("name")==true){
				//Percorre o input do user e o nome/endereço do cliente retirado da BD.
				for(int j=0; j<inp.size(); j++){
					for(int k=0; k<inpTemp.size(); k++){
						String a=inpTemp.get(k);
						String b=inp.get(j);
						//Caso o nome/adress relevante seja encontrado, incrementa count.
						boolean x=a.equals(b);
						if(x==true){
							count++;
						}
					}
				}
			//se todos os nomes/addresses do input estão presentes no cliente, adiciona-o
			//á arraylist que será retornada.
				if(count==inp.size())
					toReturn.add(temp);
			//count é reset para o próximo cliente da BD.
				count=0;
			}
			else
			//Caso sejam telefones ou emails, executa a pesquisa por strings completas.
			{if(tipo.equals("phone")){
				ArrayList<String> t=temp.getPhones();
				for(int q=0; q<t.size(); q++)
					if(t.get(q).equals(input)==true)
						toReturn.add(temp);}
			
			if(tipo.equals("mainPhone")) {
				String x=temp.getMainPhone();
				if(x.equals(input)==true)
					toReturn.add(temp);	
			}
			
			if(tipo.equals("email")){
				ArrayList<String> t=temp.getEmail();
				for(int q=0; q<t.size(); q++)
					if(t.get(q).equals(input)==true)
						toReturn.add(temp);
					}
				}
			}
		//Retorna os clientes que satisfaçam a pesquisa.
		return toReturn;
	}
	
	public String toString(){
		//Método toString convencional.
		return data.toString();
	}
	
	public void modify(String toSearch, String searchType, String toChangeType, 
			String old, String nova){
		
		//Modifica os dados de um cliente.
		
		
		//Procura o cliente que é suposto alterar
		Cliente ccheck=this.search(toSearch, searchType).get(0);
		
		//altera o dado correspondente
		if(toChangeType.equals("email")){
		ccheck.modEmail(nova, old);
		}
		
		if(toChangeType.equals("phone")){
			ccheck.modPhones(nova, old);
		}
		
		if(toChangeType.equals("name")){
			ccheck.setName(nova);
		}
		
		if(toChangeType.equals("address")){
			ccheck.setAddress(nova);
		}
		
		if(toChangeType.equals("mainPhone")){
			ccheck.setMainPhone(nova);
		}
	
	}
}

