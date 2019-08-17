package java101;

public class StudentB extends Student{
	private String proyectoEin;
	private String proyectoZwai;
	private String proyectoDrei;
	private String promedioProyecto;
	
	public StudentB(String id, String name, String email, String phone, String nickname, String proyecto1, String proyecto2, String proyecto3) {
		super(id, name, email, phone, nickname);
		proyectoEin = proyecto1;
		proyectoZwai = proyecto2;
		proyectoDrei = proyecto3;
		promedioProyecto = this.calcularPromedio();
		this.type = "B";
		notaFinal = this.calcularNotaFinal();
	}

	public String getProyectoEin() {
		return proyectoEin;
	}
	public String getNotaFinal() {
		return notaFinal;
	}
	
	public String getPromedioProyecto() {
		return promedioProyecto;
	}

	public void setProyectoEin(String proyectoEin) {
		this.proyectoEin = proyectoEin;
	}

	public String getProyectoZwai() {
		return proyectoZwai;
	}

	public void setProyectoZwai(String proyectoZwai) {
		this.proyectoZwai = proyectoZwai;
	}

	public String getProyectoDrei() {
		return proyectoDrei;
	}

	public void setProyectoDrei(String proyectoDrei) {
		this.proyectoDrei = proyectoDrei;
	}
	
	public String studentType() {
		return "B";
	}
	
	/*
	 * Ejemplo de encapsulaci�n y m�todo: // M�todo: calcularPromedio es un
	 * m�todo, realiza acciones sobre los atributos de la clase StudentB. //
	 * Encapsulaci�n: este m�todo, mediante la palabra "private", esta oculto de
	 * otras clases, por lo que solo // podr� ser utilizada dentro de si misma.
	 */	
	private String calcularPromedio() {
		int pj1, pj2, pj3;
		pj1 = Integer.parseInt(proyectoEin);
		pj2 = Integer.parseInt(proyectoZwai);
		pj3 = Integer.parseInt(proyectoDrei);
		int average = (pj1 + pj2 + pj3)/3;
		String promedio = Integer.toString(average);
		return promedio;
	}

	/*
	 * Ejemplo de polimorfismo: StudentB, al igual que StudentA, heredan el m�todo
	 * calcularNotaFinal de la clase Student este m�todo se sobrescribe en ambas sub
	 * clases, resultando en dos clases que se consideran un objeto StudentA y un
	 * objeto StudentB se consideran iguales, pero tienen funciones diferentes.
	 */
	public String calcularNotaFinal() {
		int promedio = Integer.parseInt(promedioProyecto);
		int Nota = promedio + 5 + 10;
		String notafinal = Integer.toString(Nota);
		return notafinal;
	}
	
	public String calcularNotaFinal(int asistencia, int trabajoclase) {
		int promedio = Integer.parseInt(promedioProyecto);
		int Nota = promedio + asistencia + trabajoclase;
		String notafinal = Integer.toString(Nota);
		return notafinal;
	}
}
