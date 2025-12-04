public class CollegeStudent
{
  // variables
  private String name;
  private String courseTitle;
  private String courseNum;
  private int  credits;
  private int courseFee;
  private int costPerCredit = 125;
  private static int nextStudentID = 1;
  private int studentID;
  public CollegeStudent(){
    studentID = nextStudentID;
    nextStudentID++;
  }
  //constructors
  public CollegeStudent(String n){
    name = n;
    studentID = nextStudentID;
    nextStudentID++;
  }
  public CollegeStudent(String n, String ct, String cn, int c){
    name = n;
    courseTitle = ct;
    courseNum = cn;
    credits = c;
    courseFee = c * costPerCredit;
    studentID = nextStudentID;
    nextStudentID++;
  }  
  // set/get
  public void setName(String n){
    name = n;
  }
  public void setCourseTitle(String ct){
    courseTitle = ct;
  }
  public void setCourseNum(String cn){
    courseNum = cn;
  }
  public void setCredits(int c){
    credits = c;
  }
  public void setCourseFee(int c){
    courseFee = c * 125;
  }
  public String getName(){
    return name;
  }
  public String getCourseTitle(){
    return courseTitle;
  }
  public String getCourseNum(){
    return courseNum;
  }
  public int getCredits(){
    return credits;
  }
  public int getCourseFee(){
    return courseFee;
  }
    
    
    
    
    
    
    
    
}// Create your CollegeStudent class here

