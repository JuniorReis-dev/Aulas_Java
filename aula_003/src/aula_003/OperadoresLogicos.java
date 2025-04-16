package aula_003;

public class OperadoresLogicos {

	public static void main(String[] args) {
		int x = 10;
		int z = 5;
		int y = 5;
		int w = 20;
		
		System.out.printf("\n %d > %d = %b",x,y,(x>y));
		System.out.printf("\n %d < %d = %b",x,y,(x<y));
		System.out.printf("\n %d >= %d = %b",x,y,(z>=y));
		System.out.printf("\n %d <= %d = %b",x,y,(z<=y));
		
		
		System.out.printf("\n (%d > %d) E (%d>%d) = %b ",x,y,z,w,(z<=y));

	}

}
