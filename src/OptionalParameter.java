import java.util.Optional;

public class OptionalParameter {

	public int add(int... numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

	public static void printUser(String firstName, String lastName, Optional<String> middleName) {
        System.out.println("First Name: " + firstName);
        // Agar middle name present hai to print karo
        middleName.ifPresent(name -> System.out.println("Middle Name: " + name));
        System.out.println("Last Name: " + lastName);
    }

    public static void main(String[] args) {
    	OptionalParameter calc = new OptionalParameter();
        System.out.println(calc.add(5, 10));         // 2 parameters
        System.out.println(calc.add(5, 10, 15));     // 3 parameters
        System.out.println(calc.add(1, 2, 3, 4, 5)); // multiple
        
        printUser("Akshay", "Athale", Optional.of("Kumar"));
        // Case 2: Middle name nahi diya (optional)
        printUser("Rohit", "Sharma", Optional.empty());
    
}

}

// ifPresent() ek method hai jo internally Consumer<T> functional interface accept karta hai.
// Agar value present hai to ye us value ko Consumer ke accept method me pass kar deta hai.	
// middleName.ifPresent(new Consumer<String>() {
//     @Override
//     public void accept(String name) {
//         System.out.println("Middle Name: " + name);
//     }
// });
