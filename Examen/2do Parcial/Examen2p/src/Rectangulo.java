
public class Rectangulo implements Figura{
	
	private int base;
	private int altura;
	private String nombre;
	
	
	public Rectangulo(int base, int altura, String nombre) {
		super();
		this.base = base;
		this.altura = altura;
		this.nombre = nombre;
	}


	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "R";
	}



	@Override
	public float getArea() {
		float a = base * altura;
		return a;
	}


	@Override
	public float getPerimetro() {
		float p = (base * 2) + (altura * 2);
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
