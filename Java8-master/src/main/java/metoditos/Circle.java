package metoditos;

/**
 * Clase metodo sophos
 * 
 * @author 1758830
 *
 */
public class Circle {

	private static double radius;
	private String color;

	public Circle() {
		radius = 1.0;
		color = "red";
	}

	/** Returns the radius */
	public double getRadius() {
		return radius;
	}

	/** Returns the area of this Circle instance */
	public static double getArea() {
		return radius * radius * Math.PI;
	}

	public void algo() {
		int _telefono = new Integer(7201014);
		char _$exo = 'M';
	}

	public static void algo2() {
				
		boolean flag = true;
		if (flag = false) {
			System.out.println("1");
		} else if (flag) {
			System.out.println("2");
		} else if (!flag) {
			System.out.println("3");
		} else
			System.out.println("4");

	}

	public static void main(String args[]) {
		Circle circle = new Circle();
		System.out.println(circle.getArea());
		algo2();
	}
	
	

}
