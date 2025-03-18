// Source code is decompiled from a .class file using FernFlower decompiler.
public class Main {

    public static void main(String[] var0) {
       Student var1 = StudentFactory.getStudent("Developer");
       var1.learn();
       Student var2 = StudentFactory.getStudent("Designer");
       var2.learn();
       Student var3 = StudentFactory.getStudent("Networking");
       var3.learn();


       Teacher t1 = TeacherFactory.getDepartment("Computer");

      
       System.out.println(t1.Department());


       Teacher t2 = TeacherFactory.getDepartment("Mechanical");

       System.out.println(t2.Department());

    }
 }
 