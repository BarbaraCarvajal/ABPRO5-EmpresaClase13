package empresaclase13;
/**
 * @author 
Luis Zenteno - Barbara Carvajal - Maria Fernanda
*/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Capacitacion {

	private String identificador, rut, dia, hora, lugar, duracion, cantAsistentes ;
	private String numeroInterno;

	
	public Capacitacion() {
			
		}
	
	/**
	 * @param identificador
	 * @param rut
	 * @param dia
	 * @param hora
	 * @param lugar
	 * @param duracion
	 * @param cantAsistentes
	 * @param numeroInterno
	 */
	
	
	public Capacitacion(String identificador, String rut, String dia, String hora, String lugar, String duracion,
			String cantAsistentes, String numeroInterno) {
		
		this.identificador = identificador;
		this.rut = rut;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantAsistentes = cantAsistentes;
		this.numeroInterno = numeroInterno;
	}
	
	
	@Override
	public String toString() {
		return "Capacitacion [identificador=" + identificador + ", rut=" + rut + ", dia=" + dia + ", hora=" + hora
				+ ", lugar=" + lugar + ", duracion=" + duracion + ", cantAsistentes=" + cantAsistentes
				+ ", numeroInterno=" + numeroInterno + "]";
	}

	
	
	/**
	 * Método que valida el formato del RUN ingresado por el usuario.
	*/
	public String validarRun(String mensaje, Scanner sc) {

		boolean condRun = true;
		String entrada = "";

		while (condRun) {

			System.out.print("\n" + mensaje);
			entrada = sc.nextLine();

			if (entrada.matches("\\d{2}.\\d{3}.\\d{3}")) {

				condRun = false;
			} else {

				System.out.println("Run ingresado no valido, intentelo nuevamente");
			}
		}
		return entrada;
	}
	
	/** 
	 * Metodo que valida el formato de un evento ingresado por el usuario.
	 */
	public String validarLugar(String mensaje, Scanner sc) {

		boolean condicion2 = true;
		String entrada = "";

		while (condicion2) {

			System.out.print("\n" + mensaje);
			entrada = sc.nextLine();

			if (entrada.matches("[a-z A-Z 0-9]{5,50}")) {

				condicion2 = false;
			} else {

				System.out.println("Direccion ingresada no valida, intentelo nuevamente");
			}
		}
		return entrada;
	}

	/**
	 * Metodo que valida el formato de un ID ingresado por el usuario, con una longitud de digitos de 5 a 8.
	 */
	public String validarId(String mensaje, Scanner sc) {

		boolean condicionId = true;
		String entrada = "";

		while (condicionId) {

			System.out.print(mensaje);
			entrada = sc.nextLine();

			if (entrada.matches("[a-zA-Z 0-9]{5,8}")) {

				condicionId = false;
			} else {

				System.out.println("ID ingresado no valido, intentelo nuevamente");
			}
		}
		return entrada;
	}

	/**
	 * Metodo que valida el formato del día de un evento ingresado por el usuario, se compara con las 7 opciones de los días de la semana.
	 */
	public String validarDia(String mensaje, Scanner sc) {

		boolean condDia = true;
		String entrada = "";

		while (condDia) {

			System.out.print("\n" + mensaje);
			entrada = sc.nextLine();

			if (entrada.matches("[a-zA-Z]{1,}")) {

				if (entrada.equals("lunes") || entrada.equals("martes") || entrada.equals("miercoles")
						|| entrada.equals("jueves") || entrada.equals("viernes") || entrada.equals("sabado")
						|| entrada.equals("domingo")) {
					
					condDia = false;
					
				} else {
					System.out.println("Día ingresado no válido");
				}
			} else {
				System.out.println("Dato ingresado no valido, intentelo nuevamente");
			}
		}
		return entrada;
	}


	/**
	 * Valida que una entrada de usuario sea una hora en formato "HH:mm".
	 * 	
	 * SimpleDateFormat es una clase de Java que permite formatear o convertir un objeto de tipo Date a una cadena de texto con un formato específico, y viceversa. 
	 * 
	 * La propiedad "lenient" de la clase java.text.DateFormat es una bandera que indica si se permite la interpretación flexible de fechas y horas.
	 * Si está establecido en true, el formato de fecha y hora será más permisivo y permitirá fechas y horas que no cumplen con los requisitos exactos. 
	 * Si está establecido en false, el formato de fecha y hora será más estricto y sólo aceptará fechas y horas que cumplan con los requisitos exactos.	
	 * 
	 * @param mensaje Mensaje a mostrar al usuario para pedir la entrada de hora.
	 * @param sc Objeto Scanner para leer la entrada de usuario.
	 * @return La hora en formato "HH:mm" si es válida, o una cadena vacía en caso contrario.
	 */
	public String validarHora(String mensaje, Scanner sc) {
		
		boolean condHora = true;
		String entrada = "";
		
		while (condHora) {
			
			System.out.print("\n" + mensaje);
			entrada = sc.nextLine();
			
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
			sdf.setLenient(false); 

			try {
				
			  Date hora = sdf.parse(entrada);
			  
			  condHora = false;
			} 
			catch (ParseException e) {
			  System.out.println("Formato de hora inválido, intentalo nuevamente");
			}
		}
		
		return entrada;
	}
	
	
	/**
	 * Este método valida la duración de un evento.
	*/
	public String validarDuracion(String mensaje, Scanner sc) {
		
		boolean condicion3 = true;
		String entrada = "";
		
		while (condicion3) {
			
			System.out.print("\n" + mensaje);
			entrada = sc.nextLine();
			
			/*
			 * Esta sección utilizada para la validacion de la duración de un evento, valida que lo ingresado por el usuario sean solo números .
			 * Si la duración del evento está en un rango de 1 a 5, el ciclo continuará.
			 * Si lo ingresado por el usuario no es un dato numerico ni esta dentro del rango establecido, el ciclo volverá a repetirse para pedir los datos nuevamente.
			*/
			if (entrada.matches("[1-5]{1}")) {
				
				condicion3 = false;
			}
			else {
				
				System.out.println("Cantidad de horas no valida, intentelo nuevamente");
			}
		}
		return entrada;
	}
	
	/**
	 * Metodo que valida el formato de una cantidad de asistentes a un evento ingresado por el usuario, solo pueden ser datos numericos con un rango de 1 a 999 asistentes.
	 */
	public String validarAsistentes(String mensaje, Scanner sc) {
		
		boolean condAsist = true;
		String entrada = "";
		
		while (condAsist) {
			
			System.out.println("\n" + mensaje);
			entrada = sc.nextLine();
			
			if (entrada.matches("[0-9]{1,3}")) {
				
				if (!entrada.equals("0")) {
					
					condAsist = false;
				}else {
					
					System.out.println("Tiene que haber al menos 1 asistente, intentelo de nuevo");
				}
			}
			else {
				
				System.out.println("Cantidad de asistenes no validos, intentelo nuevamente");
			}
		}
		return entrada;
	}
	
	/**
	Metodo que valida que num interno 
	*/
	public String validarNumeroInterno(String mensaje, Scanner sc) {
		
		boolean condNum = true;
		String entrada = "";
		
		while (condNum) {
			
			System.out.println("\n" + mensaje);
			entrada = sc.nextLine();
			
			if (entrada.matches("[0-9]{3,5}")) {
				
				if (!entrada.equals("0")) {
					
					condNum = false;
				}else {
					
					System.out.println("El código debe ser de mínimo 3 digitos y máximo 5.");
				}
			}
			else {
				
				System.out.println("Código ingresado no valido, intentelo nuevamente");
			}
		}
		return entrada;
	}
	
	
	/**
	 * @return the identificador
	 */
	public String getIdentificador() {
		return identificador;
	}
	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}
	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}
	/**
	 * @return the dia
	 */
	public String getDia() {
		return dia;
	}
	/**
	 * @param dia the dia to set
	 */
	public void setDia(String dia) {
		this.dia = dia;
	}
	/**
	 * @return the hora
	 */
	public String getHora() {
		return hora;
	}
	/**
	 * @param hora the hora to set
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}
	/**
	 * @return the lugar
	 */
	public String getLugar() {
		return lugar;
	}
	/**
	 * @param lugar the lugar to set
	 */
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	/**
	 * @return the duracion
	 */
	public String getDuracion() {
		return duracion;
	}
	/**
	 * @param duracion the duracion to set
	 */
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	/**
	 * @return the cantAsistentes
	 */
	public String getCantAsistentes() {
		return cantAsistentes;
	}
	/**
	 * @param cantAsistentes the cantAsistentes to set
	 */
	public void setCantAsistentes(String cantAsistentes) {
		this.cantAsistentes = cantAsistentes;
	}
	/**
	 * @return the numeroInterno
	 */
	public String getNumeroInterno() {
		return numeroInterno;
	}
	/**
	 * @param numeroInterno the numeroInterno to set
	 */
	public void setNumeroInterno(String numeroInterno) {
		this.numeroInterno = numeroInterno;
	}
	
	




}
