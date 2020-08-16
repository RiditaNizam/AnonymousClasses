public class Client {

	public static void main(String[] args) {

		// Child class of Machine (starting from new to };)
		Machine machine1 = new Machine() {
			// Will run start() in Machine but uses this new implementation
			@Override
			public void start() {
				System.out.println("Camera snapping");
			}
		};

		machine1.start();

		Plant plant1 = new Plant() {
			public void grow() {
				System.out.println("Plant growing");
			}

		};
		plant1.grow();

		Cat helloKitty = new Cat() {
			public void makeNoise() {
				System.out.println("Meow");
			}
		};

		helloKitty.makeNoise();

	}

}
