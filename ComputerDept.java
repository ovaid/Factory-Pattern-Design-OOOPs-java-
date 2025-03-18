class ComputerDept implements Teacher {
    @Override
    public String Department() {

        System.out.println("This is a computer Science Department!!");
        return "Computer Engineering";
    }
}
// WHAT IS FACTORY DESIGN PATTERN : ========================================
// Factory Method pattern is a creational design pattern that provides an interface 
// for creating objects in a superclass but allows subclasses to alter the type of 
// objects that will be created. It encapsulates the object creation logic, decoupling 
// it from the client code that uses the objects.