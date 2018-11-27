import java.util.ArrayList;
public class ArrayListPractice{
	public static void main(String[]args){

		ArrayList<Integer> num1 = new ArrayList<>();
		num1.add(1);
		num1.add(2);
		num1.add(3);
		ArrayList<Integer> num2 = new ArrayList<>();
		num1.add(4);
		num1.add(5);
		num1.add(6);
		System.out.println(combine(num1, num2));

	}
	//The first method combine will take in two ArrayLists and combine them into one List. The new List should be returned.
	public static ArrayList<Integer> combine(ArrayList<Integer> a, ArrayList<Integer> b){

		ArrayList<Integer> c = new ArrayList<>();
		for (int i = 0; i<a.size(); i++){
			c.add(a.get(i));
		}
		for (int i = 0; i<b.size(); i++){
			c.add(b.get(i));
		}

		return c;
	}
}