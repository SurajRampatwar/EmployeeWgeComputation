public class EmpFullPart_UC3 {
    public static void main(String[] args) {
        int WAGE_PER_HOUR = 20;
        int IS_FULL_TIME = 2;
        int IS_PART_TIME = 1;
        int EmpWage = 0;
        int EmpHrs = 0;

        System.out.println("Welcome to employee Wage Computation");
        int AttendanceCheck = (int) Math.floor(Math.random() * 10) % 2;
        if (AttendanceCheck == IS_PART_TIME)
            EmpHrs = 4;
        //System.out.println("Employee is Absent");
        else if (AttendanceCheck == IS_FULL_TIME)
            EmpHrs = 8;
        else
            EmpHrs = 0;

        EmpWage = WAGE_PER_HOUR * EmpHrs;
        System.out.println("Employee is Present  AND  Employee Wage is = " + EmpWage);
    }
}
