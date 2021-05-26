	public class Funciones2 {

		public static void main(String[] args) {
		
			
			
			exponente(7,5);
		

		}
		
		public static int exponente(int base, int exponente) {
			int res =1;
			for(int i =1;i<=exponente;i++) {
			
			res = res*base;
			}
			System.out.println(res);
			return res;
		}

	}
}
