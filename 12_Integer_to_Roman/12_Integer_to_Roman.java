import java.util.HashMap;

class Solution {
    public String intToRoman(int num) {
		String output = "";
		int count = 0;
		HashMap<Integer, String> romanNums = new HashMap<Integer, String>();
		romanNums.put(1, "I");
		romanNums.put(2, "II");
		romanNums.put(3, "III");
		romanNums.put(4, "IV");
		romanNums.put(5, "V");
		romanNums.put(6, "VI");
		romanNums.put(7, "VII");
		romanNums.put(8, "VIII");
		romanNums.put(9, "IX");
		if (num >= 1000) {
			while (num >= 1000) {
				count++;
				num -= 1000;
			}
			while (count > 0) {
				output += "M";
				count--;
			}
		}
		if (num >= 900) {
			num -= 900;
			output += "CM";
		}
		if (num >= 500) {
			num -= 500;
			output += "D";
		}
		if (num >= 400) {
			num -= 400;
			output += "CD";
		}
		if (num >= 100) {
			while (num >= 100) {
				count++;
				num -= 100;
			}
			while (count > 0) {
				output += "C";
				count--;
			}
		}
		if (num >= 90) {
			num -= 90;
			output += "XC";
		}
		if (num >= 50) {
			num -= 50;
			output += "L";
		}
		if (num >= 40) {
			num -= 40;
			output += "XL";
		}
		if (num >= 10) {
			while (num >= 10) {
				count++;
				num -= 10;
			}
			while (count > 0) {
				output += "X";
				count--;
			}
		}
		for (int i = 9; i > 0; i--) {
			if (num >= i) {
				num -= i;
				output += romanNums.get(i);
			}
		}
		return output;
    }
}