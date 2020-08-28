
public class Main {

	public static void main(String[] args) {

		int stackA;
		int stackB;
		stackA = 5;
		stackB = stackA;
		stackA = stackA + 10;
		//What is b?
		//System.out.println(stackA);
		//System.out.println(stackB);
		
		MyInt heapA;
		MyInt heapB;
		heapA = new MyInt(5);
		heapB = heapA;
		heapA.addTen();
		int heapAAmount = heapA.amount;
		int heapBAmount = heapB.amount;
		//What is b.value?
		//System.out.println(heapA.amount);
		//System.out.println(heapB.amount);

	}

}
