
public class TrianguloEquilatero implements Figura{
	
	private int base;
	private int altura;
	private String nombre;
	
	public TrianguloEquilatero(int base, int altura, String nombre) {
		super();
		this.base = base;
		this.altura = altura;
		this.nombre = nombre;
	}
	

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "T";
	}


	@Override
	public float getArea() {
		float a = (base * altura) / 2;
		return a;
	}

	@Override
	public float getPerimetro() {
		float p = base * 3;
		return p;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getBase() {
		return base;
	}


	public int getAltura() {
		return altura;
	}

}
