package Package2;

import java.util.Random;

public class GenerateRandomStringandNum {

	public static void main(String[] args) {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        int num= 100+ random.nextInt(900);
        
        System.out.println(num);
        int length = 3; // length of random string

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());//random index will be generated every time from the length of the string
            sb.append(chars.charAt(index));
        }

        System.out.println("Random String: " + sb.toString());
		
		
	}
	

}
