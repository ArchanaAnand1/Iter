package abc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCase3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> fruits  = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Bananssa");
		
		Iterator<String> it = fruits.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
	}

}
