class Solution {
    public List<String> fizzBuzz(int n) {
		List<String> output = new ArrayList<>();
		for (int number = 1; number <= n; number++) {
			if (number % 3 == 0 && number % 5 == 0) {
				output.add("FizzBuzz");
			} else if (number % 5 == 0) {
				output.add("Buzz");
			} else if (number % 3 == 0) {
				output.add("Fizz");
			} else {
				output.add("" + number);
			}
		}
        return output;
    }
}