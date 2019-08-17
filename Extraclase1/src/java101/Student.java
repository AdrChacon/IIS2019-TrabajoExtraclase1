package java101;

// Ejemplo de abstracción y clase
// Clase: Student es una clase, tiene atributos y metodos.
// Abstracción: La clase Student es un ejemplo de abstracción ya que un estudiante no es solamente su 
// Carne, nombre, correo, etc... estos son solo los datos que son relevantes para esta tarea.
public class Student {
	
	// Ejemplo de Atributos: Estas son las variables que serían asignadas a un objeto Student, esta la 
	// variable variable carne que es un numero entero, nombre que sería un String...
	protected String carne;
	protected String nombre;
	protected String correo;
	protected String telefono;
	protected String apodo;
	protected String type;
	protected String notaFinal;
	
	public Student(String id, String name, String email, String phone, String nickname){
		this.carne = id;
		this.nombre = name;
		this.correo = email;
		this.telefono = phone;
		this.apodo = nickname;
	}
	
	public String calcularNotaFinal() {
		notaFinal = "100";
		return notaFinal;
	}
	
	public String getCarne() {
		return carne;
	}

	public void setCarne(String carne) {
		this.carne = carne;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getApodo() {
		return apodo;
	}
	public String getType() {
		return type;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	
	
}
