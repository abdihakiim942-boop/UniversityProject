public class Main {
    public static void main(String[] args) {
        UniversityPayrollSystem system = new UniversityPayrollSystem();

        system.addLecturer(new FullTimeLecturer("L021", "Abdi", 1700, 280, 120));
        system.addLecturer(new FullTimeLecturer("L022", "Hodan", 2000, 300, 200));
        system.addLecturer(new PartTimeLecturer("L023", "Khalid", 32, 20));
        system.addLecturer(new PartTimeLecturer("L024", "Maryan", 28, 17));

        System.out.println("ALL LECTURERS");
        system.displayAllLecturers();

        System.out.println("Full-Time Payroll: " + system.calculateFullTimePayroll());
        System.out.println("Part-Time Payroll: " + system.calculatePartTimePayroll());

        Lecturer highest = system.findHighestPaidLecturer();
        if (highest != null) {
            System.out.println("Highest Paid Lecturer:");
            highest.displayInformation();
        }

        System.out.println("Lecturers earning more than 2000:");
        system.displayLecturersAbove(2000);
    }
}
