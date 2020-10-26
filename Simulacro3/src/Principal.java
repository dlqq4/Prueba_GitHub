
public class Principal {

	public static void main(String[] args) {
		
		String a1[] = {"Lorena","Ana","Diego","Pedro","Ariel","Marta"};
		String a2[] = {"Rivero","Aral","Guti","Rios","Perez","Castro"};
		String a3[] = {"12223334","23332223","32221115","45556662","51112223","62221114"};
		String a4[] = {"Ayui 112","Iris 234","Oribe 135","Penza 455","Artigas 566","Batlle 543"};
		double a5[] = {87.4,89.3,99.2,97.2,100,97.6};
		byte a6[] = {4,7,9,6,3,8};

		Empleado E1 = new Empleado ();
		Empleado E2 = new Empleado ();
		Empleado E3 = new Empleado (a1[2],a2[2],a3[2],a4[2],a5[2],a6[2]);
		Empleado E4 = new Empleado (a1[3],a2[3],a3[3],a4[3],a5[3],a6[3]);
		Empleado E5 = new Empleado (a1[4],a2[4],a3[4],a4[4],a5[4],a6[4]);
		Empleado E6 = new Empleado (a1[5],a2[5],a3[5],a4[5],a5[5],a6[5]);
		
//******************************EMPLEADO 1 ************************************		
		E1.setNombre(a1[0]);
		E1.setApellido(a2[0]);
		E1.setCedula(a3[0]);
		E1.setDireccion(a4[0]);
		E1.setTemperatura(a5[0]);
		E1.setPuntaje(a6[0]);
		
		//System.out.println(E1);
		//System.out.println("\n");
		
//******************************EMPLEADO 2 *************************************	
		
		E2.setNombre(a1[1]);
		E2.setApellido(a2[1]);
		E2.setCedula(a3[1]);
		E2.setDireccion(a4[1]);
		E2.setTemperatura(a5[1]);
		E2.setPuntaje(a6[1]);
		
		//System.out.println(E2);
		//System.out.println("\n");
//****************************EJECUCIÓN METODOS*************************

		//E1.control();		
		//puntajes(a6);
		//nombres(a1);
		//System.out.println(nombres2(a1));
		dire(a4);
		
		
	}
//******************************FIN DEL MAIN*********************************	
	public static void puntajes(byte[]array) {
		byte bajo= Byte.MAX_VALUE;
		byte mayor=0;
		byte suma=0;
		
		for (int i = 0; i <array.length; i++) {
			if (array[i]>mayor) {
				mayor= array[i];
			}
			if (array[i]<bajo) {
				bajo= array[i];
			}
			suma= (byte) (array[i]+suma);
		}
		byte promedio = (byte)(suma/ array.length);
		
		System.out.println("El puntaje más alto es: "+ mayor+"\nEl puntaje más bajo es: "+bajo+"\nEl promedio es: "+promedio);
	}
//********************************MÉTODO NOMBRE*************************************************
	public static void nombres(String[]array) {
		System.out.println("Los nombres que empiezan o terminan con la letra A/a son:");
		for (int i = 0; i < array.length; i++) {
			if (array[i].startsWith("A")|| array[i].startsWith("a")||array[i].endsWith("A")||array[i].endsWith("a")) {
				System.out.println(array[i]);
			}
		}
	}
//********************************MÉTODO DIRECCIONES********************************************	
	public static void dire (String[]array ) {
		for (int i = 0; i < array.length; i++) {
			if (array[i].contentEquals("Penza 455")) {
				System.out.println("Se encontró la dirección:"+array[i]);
				
			}
		}
	}
//**********************************EJEMPLO 2***MÉTODO NOMBRE************************************
	public static String nombres2 (String[]array) {
		String nombres= "";
		for (int i = 0; i < array.length; i++) {
			if (array[i].startsWith("A")|| array[i].startsWith("a")||array[i].endsWith("A")||array[i].endsWith("a")) {
				nombres = nombres + array[i]+" ";
			}
		}
		return nombres;
	}
}
 

