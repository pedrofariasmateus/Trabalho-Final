import java.util.Scanner;
import java.util.ArrayList;
 
public class ConvertString {
	
	
	public static ArrayList<String> Converter(String input){
		
		ArrayList<String> inp=new ArrayList<String>();
		//vai separar cada peda�o do array assim que encontrar um espa�o.
		//isto � indicado pelo valor entre os \\s*.
		Scanner a = new Scanner(input).useDelimiter("\\s* \\s*");
		//Coloca cada valor na arraylist
		while(a.hasNext()==true){
			String x=a.next();
			inp.add(x);
			}
		a.close();
		//retorna a arraylist com cada valor individual
		return inp;
	}
	
}
