//concider and How many objects will be eligible for garbage collection after the execution of the below code?

package MemoryManagement;

public class mmQ2 {
  public static void main(String[] args) {

    mmQ2 student1 = new mmQ2();
    mmQ2 student2 = new mmQ2();
    mmQ2 student3 = new mmQ2();
    mmQ2 student4 = student2;
    student3 = null;
    student1 = student3;
  }
}
