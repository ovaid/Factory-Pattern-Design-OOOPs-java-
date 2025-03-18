class StudentFactory {
    public static Student getStudent(String studentType) {
        if (studentType == null) return null;

        if (studentType.equalsIgnoreCase("Developer")) {
            return new Dev();
        } else if (studentType.equalsIgnoreCase("Designer")) {
            return new Design();
        } else if (studentType.equalsIgnoreCase("Networking")) {
            return new Networking();
        }

        return null;
    }
}
