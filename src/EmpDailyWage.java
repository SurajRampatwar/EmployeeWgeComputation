public class EmpDailyWage {
    static final int WAGE_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static int EmpWage;
    public static void main(String[] args) {
        System.out.println("Welcome to employee Wage Computation");
        int AttendanceCheck = (int) Math.floor(Math.random() * 10) % 2;
        if (AttendanceCheck == 0)
            System.out.println("Employee is Absent");
        else
             EmpWage = WAGE_HOUR * FULL_DAY_HOUR;
        System.out.println("Employee is Present  AND  Employee Wage is = "+EmpWage);
    }
}
