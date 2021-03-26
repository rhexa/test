import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> mapErrors = new HashMap<>();
		 
		mapErrors.put(200, "OK");
		mapErrors.put(303, "See Other");
		mapErrors.put(404, "Not Found");
		mapErrors.put(500, "Internal Server Error");
		
		
		Map<Integer, String> mapErrors2 = new HashMap<>();
		 
		mapErrors2.put(600, "Syntax Error");
		mapErrors2.put(700, "Dictionary Error");
		mapErrors2.put(800, "Unexpected Error");
		 
		 
		System.out.println("Before: " + mapErrors);
		 
		mapErrors.putAll(mapErrors2);
		 
		System.out.println("After: " + mapErrors);
		
	}

}
