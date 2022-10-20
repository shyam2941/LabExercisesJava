package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise1 {

	public static void main(String[] args) {

		//Map hm = Map.of("e1",10,"e2",25);
		HashMap hm = new HashMap();
		hm.put("e1", 12);
		hm.put("e2", 34);
		hm.put("e3", 28);
		hm.put("e4", 45);
		hm.put("e5", 56);
		hm.put("e6", 78);
		
		Exercise1 obj = new Exercise1();
		System.out.println(obj.getValues(hm));
		
	}
	
	List getValues(HashMap hm) {
		
		List lst = new ArrayList(hm.values());
		Collections.sort(lst);
		return lst;
	}

}
