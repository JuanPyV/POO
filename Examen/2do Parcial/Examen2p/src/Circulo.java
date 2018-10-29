
public class Circulo implements Figura {
	
	private int radio;
	private float pi = 3.1416f;
	private String nombre; 
	
	public Circulo(int radio, String nombre) {
		super();
		this.radio = radio;
		this.nombre = nombre;
	}

	@Override
	public String getTipo() {
		return "C";
	}


	@Override
	public float getArea() {
		float a = pi * (radio * radio);
		return a;
	}

	@Override
	public float getPerimetro() {
		float p = pi *(radio * 2);
		return p;
	}

	public String getNombre() {
		return nombre;
	}

	public int getBase() {
		return radio;
	}
	public int getAltura() {
		return 0;
	}

	
	
	
	

}
