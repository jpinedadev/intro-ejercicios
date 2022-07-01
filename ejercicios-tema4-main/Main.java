public class Main{
	public static void main(String[] args){
		System.out.println("**Ejercicios tema 4**");
		numeros(-1);
		mientras(1);
		para(0);
		interruptor("verano");
	}
	public static void numeros(int numeroIf){
		System.out.println("-Compare si la variable numeroIf es positivo, negativo, o 0");
		if (numeroIf<0) {
			System.out.println("Numero es negativo");
		}else if(numeroIf==0){
			System.out.println("Numero es igual a cero");
		}else{
			System.out.println("El numero es positivo");
		}
	}
	public static void mientras(int numeroWhile){
		System.out.println("-Que la variable numeroWhile sea inferior a 3,");
		while(numeroWhile<3){
			System.out.println(numeroWhile);
			numeroWhile++;
		}
	}
	public static void para(int numero){
		System.out.println("-Su condición será que la variable sea igual o menor que 3");
		for (int numeroFor = numero;numeroFor<=3;numeroFor++ ) {
			System.out.println(numeroFor);
		}
	}
	public static void interruptor(String estacion){
		System.out.println("-Case para las cuatro estaciones del año.");
		switch(estacion){
			case "verano":
				System.out.println("La estacion es verano");
				break;
			case  "invierno":
				System.out.println("La estacion es invierno");
				break;
			case  "otoño":
				System.out.println("La estacion es otoño");
				break;
			case  "primavera":
				System.out.println("La estacion es primavera");
				break;
			default:
				System.out.println("No es una estacion");
		}
	}
}