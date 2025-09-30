import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SteamAPIinJava {
	
	
   
     public static void main(String[] args) {
    
    	 List<String> names = Arrays.asList("Akshay", "Kimaya", "Rohit","Ankita", "Anjali");
    	 names.stream().filter(s -> s.startsWith("A")).  //-----Predicate
    	 forEach(e -> System.out.println(e));
    	 System.out.println("-------");
    	 
    	 names.stream().map(s -> s.toUpperCase()).  //-----Function
    	 forEach(e -> System.out.println(e));       //-----Consumer
    	 System.out.println("-------");
    	 
    	 //Above line of code can also be written as
    	 names.stream().map(String::toUpperCase).forEach(System.out::println);
    	 System.out.println("-------");
    	 
    	 List<String> list =names.stream().sorted().collect(Collectors.toList());  //-----Comparator
    	 list.forEach(e -> System.out.println(e));
    	 System.out.println("-------");
    	 
    	 Long count =names.stream().count();
    	 System.out.println(count);
    	 System.out.println("-------");

    	 //Find the 2nd Highest number from the list of Array
    	 List<Integer> nums = Arrays.asList(10, 20, 8, 25, 20, 30, 30);
    	 int secondHighest = nums.stream()
                 .distinct()
                 .sorted(Comparator.reverseOrder())
                 .skip(1)
                 .findFirst()
                 .get();
            System.out.println(secondHighest);
            System.out.println("-------");
            
          //Find the frequency of each character in the string  
          String input = "aabbcdeaa";
          Map<Character, Long> freqMap = input.chars()      // IntStream
                  .mapToObj(c -> (char)c)  // convert to Character
                  .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

          System.out.println(freqMap);
          
//          ________________________________________________________________________________
//          Write a program to iterate the List of Students class to find the avg grades. 
//          • Student Class Has Roll, Name, Age, Grade 
//          • Create list of Students 
//          • Use stream Api if possible 
//          • Do not create getters and setters for all, only required one
          
          
          
                  // Create list of students
                  List<Student> students = Arrays.asList(
                      new Student(1, "Akshay", 20, 85.5),
                      new Student(2, "Kimaya", 19, 90.0),
                      new Student(3, "Rohit", 21, 78.5),
                      new Student(4, "Ankita", 22, 88.0),
                      new Student(5, "Anjali", 20, 92.0)
                  );

                  // Calculate average grade using Stream API
                  double avgGrade = students.stream()
                                            .mapToDouble(Student::getGrade)
                                            .average()
                                            .orElse(0.0);  // Default if list is empty

                  System.out.println("Average Grade: " + avgGrade);
                  
//                  Without Stream API
//                  double sum = 0.0;
//                  for (Student s : students) {
//                      sum += s.grade;
//                  }
//
//                  double avg = students.size() > 0 ? sum / students.size() : 0.0;
//
//                  System.out.println("Average Grade: " + avg);
              }
          }

    	 

     class Student {
         int roll;
         String name;
         int age;
         double grade;  // Use double for average calculation

         // Constructor
         public Student(int roll, String name, int age, double grade) {
             this.roll = roll;
             this.name = name;
             this.age = age;
             this.grade = grade;
         }

         // Getter for grade (needed for stream)
         public double getGrade() {
             return grade;
         }
     }

