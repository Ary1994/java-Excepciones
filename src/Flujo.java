
public class Flujo {
	public static void main(String[] args) {
		System.out.println("iniciando el flujo");
		metodo1();
		System.out.println("fin flujo");
	}
	
	private static void metodo1() {
		System.out.println("inicaindo metodo 1");
		metodo2();
		System.out.println("fin metodo 1");
	}
	private static void metodo2() {
		System.out.println("inicaindo metodo 2");
		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
		System.out.println("fin metodo 2");
	}
}
