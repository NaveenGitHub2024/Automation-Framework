package mavenProject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractice1 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("A", 1);
		hm.put("B", 2);
		hm.put("C", 3);
		System.out.println(hm.entrySet());
		Set<Entry<String, Integer>> entries = hm.entrySet();

		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + "--------" + entry.getValue());
		}
		Iterator<Entry<String, Integer>> it = entries.iterator();
		while (it.hasNext()) {

			Entry<String, Integer> entry1 = it.next();
			System.out.println(entry1.getKey() + "-------" + entry1.getValue());
		}
	}

}
