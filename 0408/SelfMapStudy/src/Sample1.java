import java.util.HashMap;

public class Sample1 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		map.put("people", "���");
		map.put("baseBall", "�߱�");
		map.put("basketBall", "��");
		map.put("footBall", "�౸");
		
		System.out.println(map.get("people"));
		System.out.println(map.get("baseBall"));
		System.out.println(map.getOrDefault("people2", "NONONO"));
		System.out.println(map.containsKey("people"));
		map.remove("people");
		System.out.println(map.keySet());
	}

}
