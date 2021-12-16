class printThreeWords {
	public static void main (String[] args){
		drawSquare();
		checkSumSign();
		printColor();
		compareNumbers();
	}
	static void drawSquare() {
		System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");		
	}
	static void checkSumSign(){
		int a = 20;
		int b = 15;
		System.out.println("Sum is" + (a + b >= 0? "positive" : "negative"));
	}
	static void printColor(){
		int Value = 15;
        if (Value <= 0) {
            System.out.println("Red");
            } else if (Value > 0 && Value <= 100) {
            System.out.println("Yellow");
            } else if (Value > 100) {
            System.out.println("Green");
            }
	}
	static void compareNumbers(){
		int a = 27;
        int b = 72;
        System.out.println(a >= b? "a >= b" : "a < b");		
	}
};