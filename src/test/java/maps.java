import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class maps {
	@Test
	public void adding() {
		List<String> l1 = new ArrayList<String>();
		l1.add("Apple");
		l1.add("Banana");
		l1.add("Straberry");
		List<String> l2 = new ArrayList<String>();
		l2.add("carrot");
		l2.add("Beetroot");
		l2.add("cucumber");
		List<String> l3 = new ArrayList<String>();
		l3.add("Kaju");
		l3.add("Raisins");
		l3.add("Almonds");
		Map<String,List<String>> m =new HashMap<String,List<String>>();
		m.put("fruits",l1);
		m.put("Vegetables", l2);
		m.put("Dryfruits", l3);
		
		
		System.out.println(m);
	}

}
