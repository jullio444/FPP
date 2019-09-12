package homework.lesson5.prob3;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figure[] fig = {new UpwardHat(),
				new UpwardHat(),
				new DownwardHat(),
				new FaceMaker(),
				new Vertical()};
		for(Figure f: fig) {
			f.getFigure();
		}
		System.out.println("\n");
		
		for(Figure f: fig) {
			System.out.print(f.getClass().getSimpleName()+":");
			f.getFigure();
			System.out.println();
		}
	}
	
}
/*Sample Output

/\/\\/:)||

UpwardHat:/\
UpwardHat:/\
DownwardHat:\/
FaceMaker::)
Vertical:||*/
