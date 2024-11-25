public class Main {
    public static void main(String[] args) {
        System.out.println("hello sendy");

		if(args.length!=2) {
			System.out.println("please run with only two command line arguments; x y");
			return;
		}

		MathOperation m = (int a, int b) -> a + b;

		int x = m.calculate(Integer.valueOf(args[0]),Integer.valueOf(args[1]));
		System.out.println("result: " + x);
    }

    @FunctionalInterface
    interface MathOperation {
		int calculate(int a, int b);
	}

}