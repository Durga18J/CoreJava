// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Student {
  int rollNo;
  String name;
  Student(int rollNo, String name){
      this.name=name;
      this.rollNo= rollNo;
  }
    
    public static void main(String[] args) {
       System.out.println("Hello");
       Student st1 = new Student(101,"Durga");
       System.out.println(st1.rollNo);
       System.out.println(st1.name);
    }
}
