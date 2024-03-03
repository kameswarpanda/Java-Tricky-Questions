//concider and How many objects will be eligible for garbage collection after the execution of the below code?

package MemoryManagement;

public class mmQ3 {
  double balance;
    
    public static void main(String args[]) {
      mmQ3 account1=null;
      mmQ3 account2=null;
        account1=new mmQ3();
        account2=new mmQ3();
        account2=account1;
        account1=new mmQ3();
        account2 = account1 = null;
    }
}
