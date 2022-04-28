package Chapter13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class D1025_Map {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95);
		System.out.println("�� Entry �� : "+map.size());
		
		Set<String> keyset = map.keySet();
		Iterator<String> keyit = keyset.iterator();
		while (keyit.hasNext()) {
			String key = keyit.next();
			Integer value = map.get(key);
			System.out.println(key+" : "+value);
		}
		System.out.println();
		
		map.remove("ȫ�浿");
		System.out.println("�� Entry �� : "+map.size());
		Set<Map.Entry<String, Integer>> entryset = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryit = entryset.iterator();
		
		while (entryit.hasNext()) {
			Map.Entry<String, Integer> entry = entryit.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+" : "+value);
		}
		

	}

}
