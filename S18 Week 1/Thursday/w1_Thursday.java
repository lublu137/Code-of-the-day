
public static String abbreviate(String word) { //Kevin's Method
        char[] charWord = word.toCharArray();
        StringBuilder abbWord = new StringBuilder();
        abbWord.append(charWord[0] + ((charWord.length-2) + "") + charWord[charWord.length-1]);
        return abbWord.toString();
    }

public static String newWord(String n)  // Daniel's Method
    {
        int num = n.length() - 2;
        char a = n.charAt(0);
        char b = n.charAt(n.length() -1);
        String temp = a + Integer.toString(num) + b;
        
        return temp;
    }

static String work(String input){ //Juancarlos's Method
		int length = input.length();
		
		String work = input.charAt(0) + String.valueOf(length-2) + input.charAt(length-1);
		return work;
		
	}
