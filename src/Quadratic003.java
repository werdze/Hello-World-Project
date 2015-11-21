
public class Quadratic003 {

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		System.out.println("Before calling quadFormula");
//		double val1, val2, val3;
////		val1 = 17.0;
////		val2 = -3.0;
////		val3 = 4.0;
//		val1 = 1.0;
//		val2 = 2.0;
//		val3 = 1.0;
//
//		quadFormula(val1, val2, val3, true);
//		//double sol1 = quadFormula(val1, val2, val3, true)
//		//double sol1 = quadFormula(val1, val2, val3, false)
//		
//		//Quadratic003.quadFormula();
//		System.out.println("After calling quadFormula");
//	}
//	
//	public static double quadFormula(double a, double b, double c, boolean first){
//		System.out.println("a = " + a + " b = " + b + " c = " + c);
//		System.out.println("Inside quadFormula");
//		double solutionOne = (-b + Math.sqrt(b*b - 4.0*a*c))/(2*a);
//		double solutionTwo = (-b - Math.sqrt(b*b - 4.0*a*c))/(2*a);
//		b = -999.0;
//		System.out.println("Solution One is " + solutionOne);
//		if (first) return solutionOne;
//		else return solutionTwo;
//		
//	}
//	
//}

	public static void main(String[] args){
		double aaa = 1.0;
		double bbb = 2.0;
		double ccc = 1.0;
		double solution = Quadratic.quadFormula(aaa, bbb, ccc);
	}
	public static double quadFOrmula(double a, double b, double c){
		double solutionOne = (-b + Math.sqrt(b*b - 4.0*a*c))/(2*a);
		double solutionTwo = (-b - Math.sqrt(b*b - 4.0*a*c))/(2*a);
		return solutionOne;
		
	}
	}
	
	
	
	
	
	