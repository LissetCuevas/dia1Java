public class Persona{
	String name;
	String sexo;
	int edad;

	public void caminar(){
		System.out.println(name + " Esta caminando");
	}

	public void estudiar(){
		System.out.println(name + " Esta estudiando");
	}

	public void comer(String comida){
		System.out.println(name + " Esta comiendo " + comida);
	}

	public void pedirAlcohol(){
		if(edad >= 18){
			System.out.println("Aqui tienes tu cerveza");
		}else{
			System.out.println("Aun no puede tomar alcohol");
		}
	}
}

class Curso{
	public static void main(String args[]) {
		Persona juan = new Persona();
		juan.name = "Juan Perez";
		juan.sexo = "masculino";
		juan.edad = 12;
		juan.caminar();
		juan.estudiar();
		juan.comer("torta");
		juan.pedirAlcohol();

		Persona bety = new Persona();
		bety.name = "Beatriz";
		bety.sexo = "femenino";
		bety.edad = 19;
		bety.caminar();
		bety.estudiar();
		bety.comer("plato");
		bety.pedirAlcohol();
	}
}