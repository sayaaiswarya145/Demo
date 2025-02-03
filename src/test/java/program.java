import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class program {
	@Test
	public void lists() {
		List<String> li = new ArrayList<String>();
		//String name,
		li.add("name");
		li.add("loc");
		li.add("id");
		li.add("phone number");
		li.add("address");
		//System.out.println(li);
		List<String> l = new ArrayList<String>();
		for(String x:li) {
			String Str ="";
			for(int i=0;i<=x.length()-1;i++) {
			if(i==0 || i==x.length()-1) {
				Str = Str+x.charAt(i);
			}
			
			}
			//List<String> l = new ArrayList<String>();
			l.add(Str);
		
			
}
		System.out.println(l);
	}}