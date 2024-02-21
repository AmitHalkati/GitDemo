import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,String> hash_map = new HashMap<>();
		
		hash_map.put("India","NewDelhi");
		hash_map.put("France","Paris");
		hash_map.put("Germany","Berlin");
		hash_map.put("Australia","Canberra");
		
		//Convert hasmap keys to Arraylist
		
		List<String> countryNameList = new ArrayList<>(hash_map.keySet());
		System.out.println("HashMap Keys are : ");
		for(String s: countryNameList) {
			System.out.println(s);
		}
		System.out.println("**************************** ");
		
		//Convert hasmap values to Arraylist
		List<String> capitalNameList = new ArrayList<String>(hash_map.values());
		System.out.println("HashMap values are : ");
		for(String s: capitalNameList) {
			System.out.println(s);
		}
	}

}
