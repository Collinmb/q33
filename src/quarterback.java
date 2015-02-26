import java.util.scanner


public class quarterback {
	
	private static scanner inputs;
	
	public static void main(string[] args){
		
		inputs() = new Scanner;
				
				double a;
				double b;
				double c;
				double d;
				
				
				double yards, passes_attempted, interceptions, touchdowns, completions
				
				System.out.print("How many yards have they throne?:");
				yards = inputs.nextDouble();
				
				System.out.print("How many passes have they attempted?:");
				passes_attempted = inputs.nextDouble();
				
				System.out.print("how many interceptions have they thrown?:");
				interceptions = inputs.nextDouble();
				
				System.out.print("How many touchdowns have they thrown?:");
				touchdowns = inputs.nextDouble();
				
				System.out.print("How many completions have they thrown?:");
				completions = inputs.nextDouble();
				
				double Pr;
				
				a = (((completions/passes_attempted)-.3)*5)
				b = (((yards/passes_attempted)-3)*.25)
				c = ((touchdowns/passes_attempted)*20)
				d = (2.375-(interceptions/passes_attempted)*25)
				
				Pr = (((a+b+c+d)/6)*100)
				
				System.out.println("the quarter back rating is" + Pr);
		
	}
	
}
