class Solution {
    public String interpret(String command) {
		String output = "";
		for (int i = 0; i < command.length(); i++) {
			if (command.charAt(i) == 'G' || command.charAt(i) == 'a' || command.charAt(i) == 'l') {
				output += command.charAt(i);
			} else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
				output += "o";
			}
		}
        return output;
    }
}