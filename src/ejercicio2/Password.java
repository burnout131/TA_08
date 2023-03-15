package ejercicio2;

public class Password {
	private int longitud;
	private String contrase�a;
	final private int LONGITUD_DEFAULT = 8;

	public Password() {
		this.longitud = LONGITUD_DEFAULT;
		this.contrase�a = "";
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contrase�a = generaPassword(this.longitud);
	}

	public String generaPassword(int longitud) {
		
		//Elegimos un caracter aleatorio del siguiente String
		String alfaNumerico = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789"
		+ "abcdefghijklmnopqrstuvxyz";

		//Creamos un StringBuilder con la longitud establecida por parametro
		StringBuilder sb = new StringBuilder(longitud);

		for (int i = 0; i < longitud; i++) {
			// Generamos un numero entre 0 i la longitud maxima, para usarlo despues como indice
			int indice = (int) (alfaNumerico.length() * Math.random());

			// A�adimos los caracteres al StringBuilder
			sb.append(alfaNumerico.charAt(indice));
		}
		return sb.toString();
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
}
