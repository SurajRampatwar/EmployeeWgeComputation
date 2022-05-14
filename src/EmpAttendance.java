public class EmpAttendance {
    public static void main(String[] args) {
        System.out.println("Welcome to employee Wage Computation");
        int AttendanceCheck = (int) Math.floor(Math.random() * 10) % 2;
        if(AttendanceCheck == 0)
            System.out.println("Employee is Absent");
        else
            System.out.println("Employee is Present");
    }
}
