import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		String text = "-31.525135151535841635135135135135";
		System.out.println(text);
		System.out.println(Float.parseFloat(text));
		System.out.println(Double.parseDouble(text));
		System.out.println("========================");
		Double d = Double.parseDouble(text);
		System.out.println(d);
		System.out.println(d.intValue());
		System.out.println("========================");
		BigDecimal bd = new BigDecimal(text);
		System.out.println(bd);
		System.out.println(Math.round(d));
		System.out.println(Math.floor(d));
		System.out.println(Math.ceil(d));
		System.out.println("========================");
		float f = 3.26f;
		System.out.println(f);
		System.out.println((int)f);
	}

}
