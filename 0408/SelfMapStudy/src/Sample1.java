import java.util.HashMap;

public class Sample1 {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<>();
		map.put("people", "사람");
		map.put("baseBall", "야구");
		map.put("basketBall", "농구");
		map.put("footBall", "축구");
		
		System.out.println(map.get("people"));
		System.out.println(map.get("baseBall"));
		System.out.println(map.getOrDefault("people2", "NONONO"));
		System.out.println(map.containsKey("people"));
		map.remove("people");
		System.out.println(map.keySet());
	}

}
