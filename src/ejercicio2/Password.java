package ejercicio2;

public class Password {
	private int longitud;
	private String contraseña;
	final private int LONGITUD_DEFAULT = 8;

	public Password() {
		this.longitud = LONGITUD_DEFAULT;
		this.contraseña = "";
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generaPassword(this.longitud);
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

			// Añadimos los caracteres al StringBuilder
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

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
}
