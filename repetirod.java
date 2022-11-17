package testarcond;

public class repetirod {
	public static void main (String[] args) {
		int res=0;
		for(int multiplicador = 0;multiplicador <10; multiplicador ++) {
			for(int contador=0; contador<10; contador ++) {
		
		res=contador*multiplicador;
		
		System.out.println("tabuada do " + multiplicador);
		System.out.print (multiplicador * contador );
		System.out.println(" ");
		}	
			System.out.println();
	}
	}

}
