
public class Empleado {
	
	private String nombre;
	private String apellido;
	private String cedula;
	private String direccion;
	private double temperatura;
	private byte puntaje;
	
	public Empleado() {
		
	}
	
	public Empleado (String nombre, String apellido, String cedula,String direccion, double temperatura, byte puntaje) {
		this.nombre= nombre;
		this.apellido=apellido;
		this.cedula=cedula;
		this.direccion=direccion;
		this.temperatura=temperatura;
		this.puntaje=puntaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public byte getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(byte puntaje) {
		this.puntaje = puntaje;
	}
	
	//***********************************METODOS*********************************************
	
	public String toString () {
		return "Nombre: "+ this.nombre+"\nApellido: "+ this.apellido+"\nCedula: "+this.cedula+"\nDireccion: "+this.direccion+"\nTemp: "+this.temperatura+"\nPuntaje: "+this.puntaje;
	}
	//************************COBVERTIR FAHRENHEIT A CELSIUS*********************************
	public double convertir () {
		double temp = (this.temperatura-32)*(5.0/9.0);	
		return temp;
	}
	//*************************************CONTROL********************************************
	public void control () {
		if (convertir()> 37.2) {
			System.out.println("No puede ingresar,  por favor concurra a examen médico.");
		}
		if(convertir()<=37.2){
				System.out.println("Su temperatura es aceptable, puede pasar");
		}
				
	}
	//****************************************************************************************
}
