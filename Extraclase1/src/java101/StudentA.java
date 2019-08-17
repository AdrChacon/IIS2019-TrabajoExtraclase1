package java101;


public class StudentA extends Student{
	// Ejemplo de Herencia: La clase StudentA hereda de la clase padre Student
	private String promedioExamenes;
	private String promedioQuices;
	private String promedioTareas;
	private String promedioExamenQuizTarea;
	
	public StudentA (String id, String name, String email, String phone, String nickname, String promedioExamen, String promedioQuiz, String promedioTarea) {
		super(id, name, email, phone, nickname);
		promedioExamenes = promedioExamen;
		promedioQuices = promedioQuiz;
		promedioTareas = promedioTarea;
		promedioExamenQuizTarea = this.calcularPromedio();
		this.type = "A";
		notaFinal = this.calcularNotaFinal();
	
	}
	
	/*
	 * Ejemplo de Sobrescritura: La clase padre Student tiene un metodo
	 * studentType que retorna un string "Unknown" // pero aquí retorna "A".
	 */	
	public String studentType() {
		return "A";
	}
	public String getNotaFinal() {
		return notaFinal;
	}

	public String getPromedioExamenQuizTarea() {
		return promedioExamenQuizTarea;
	}
	public String getPromedioExamenes() {
		return promedioExamenes;
	}


	public void setPromedioExamenes(String promedioExamenes) {
		this.promedioExamenes = promedioExamenes;
	}


	public String getPromedioQuices() {
		return promedioQuices;
	}


	public void setPromedioQuices(String promedioQuices) {
		this.promedioQuices = promedioQuices;
	}


	public String getPromedioTareas() {
		return promedioTareas;
	}


	public void setPromedioTareas(String promedioTareas) {
		this.promedioTareas = promedioTareas;
	}


	private String calcularPromedio() {
		int avgEx, avgQu, avgTa;
		avgEx =Integer.parseInt(promedioExamenes);
		avgQu= Integer.parseInt(promedioQuices);
		avgTa =Integer.parseInt(promedioTareas);
		int average = ((avgEx + avgQu + avgTa)/3);
		String promedio = Integer.toString(average);
		return promedio;
	}
	
	/*
	 * // Ejemplo de Sobrescritura: La clase padre Studednt tiene el método
	 * calcularNotaFinal que // retorna 100, las clases hijas StudentA y StudentB
	 * cambian la acción de este método // de modo que lo que retornan es un calculo
	 * utilizando los atributos de la clase.
	 */	
	public String calcularNotaFinal() {
		int avgEQT = Integer.parseInt(promedioExamenQuizTarea);
		int Nota = avgEQT + 5 + 10;
		String notafinal = Integer.toString(Nota);
		return notafinal;
	}

	/*
	 * Ejemplo de Sobrecarga: la nota final se calcula segun se presenten valores
	 * de "asistencia" y "trabajo en clase" // de no existir, se calcula usando los
	 * "valores maximos posibles".
	 */	
	public String calcularNotaFinal(int asistencia, int trabajoclase) {
		int avgEQT = Integer.parseInt(promedioExamenQuizTarea);
		int Nota = avgEQT + asistencia + trabajoclase;
		String notafinal = Integer.toString(Nota);
		return notafinal;
	}
	
}
