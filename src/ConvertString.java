import java.util.Scanner;
import java.util.ArrayList;

public class ConvertString {
	static ArrayList<String> inp;
	public ConvertString(){
		inp=new ArrayList<String>();
	}
	public ArrayList<String> Converter(String input){
		//vai separar cada pedaço do array assim que encontrar um espaço.
		//isto é indicado pelo valor entre os \\s*.
		Scanner a = new Scanner(input).useDelimiter("\\s* \\s*");
		int i=0;
		//Coloca cada valor na arraylist
		while(a.hasNext()==true){
			String x=a.next();
			inp.add(x);
			i++;
			}
		a.close();
		//retorna a arraylist com cada valor individual
		return inp;
	}
}
