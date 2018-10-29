
public class ComparadorGeometrico {
	
	
	
	public static Figura areaMasGrande(Figura a, Figura b) {
		
		if (a.getArea() > b.getArea()) {
			return a;
		}
		else {
			return b;
		}
		
	}
	
	
	public static Figura perimetroMasGrande(Figura a, Figura b) {
		if (a.getPerimetro() > b.getPerimetro()) {
			return a;
		}
		else {
			return b;
		}
	}

}
