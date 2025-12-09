import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Would you like to add a student.");
    String loop = scan.nextLine();
    
    while (loop.equals("yes")){
      CollegeStudent a = createStudent(scan);
      System.out.println(a);
      System.out.println("Would you like to add more students.");
      loop = scan.nextLine();
      loop = scan.nextLine();
      System.out.println("Cool.");
    }
    
    // write a while loop to create and display CollegeStudnets using the below method
    
  }

  private static CollegeStudent createStudent(Scanner scan) {
    // complete this method to create a CollegeStudent object with details provided by the user
    System.out.println("What is the students name. (First and Last)");
    String name = scan.nextLine();
    System.out.println("What is the course called.");
    String course = scan.nextLine();
    System.out.println("What is the course number.");
    String courseNum = scan.nextLine();
    System.out.println("How many credits are there.");
    int credits = scan.nextInt();
    CollegeStudent i = new CollegeStudent(name, course, courseNum, credits);
    return i;
  }
    
}
