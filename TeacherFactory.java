public class TeacherFactory {
    public static Teacher getDepartment(String deptName) {
        if(deptName == null) return null;

        if(deptName.equalsIgnoreCase("Computer")) {
            return new ComputerDept();

        } else if(deptName.equalsIgnoreCase("Mechanical")) {
            return new Mechanical();

        } else return null;
    }
    
}
