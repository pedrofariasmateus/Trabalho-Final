import junit.framework.TestCase;
import java.util.ArrayList;

public class ConvertStringTest extends TestCase{
	
	String toConvert="Yes, I hope you die a miserable painful deathright now.";
	
	
	public void test1(){
		ArrayList<String> x=ConvertString.Converter(toConvert);
		String temp="";
		int t=x.size();
		for(int i=0; i<t-1; i++){
			temp=temp+x.get(i) + " ";}
		temp=temp+x.get(t-1);
		
		assertEquals(toConvert, temp);
	}

	
}
