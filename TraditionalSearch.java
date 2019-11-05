import java.util.ArrayList;
public class TraditionalSearch{

	public static void main(String[] args){
		ArrayList<Animal_>animals = new ArrayList<Animal_>();
		animals.add(new Animal_("fish",false,true));
		animals.add(new Animal_("kangaroo",true,false));
		animals.add(new Animal_("rabbit",true,false));
		animals.add(new Animal_("turtle",false,true));

		//print(animals, new CheckIfHopper());
		print(animals, a -> a.canHop());
		print(animals, a -> a.canSwim());

	}

	private static void print
	(ArrayList<Animal_>animals, CheckTrait checker){

	for (Animal_ animal : animals){
		if (checker.test(animal))
			System.out.println(animal + " ");
	}
	System.out.println();
}
}
