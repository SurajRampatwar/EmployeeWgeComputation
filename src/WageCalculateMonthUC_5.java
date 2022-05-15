public class WageCalculateMonthUC_5 {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 0;
    public static final int WAGE_PER_HOUR = 20;
    public static final int WORKING_DAYS = 2;

    public static void main(String[] args) {
        int EmpHr = 0;
        int EmpWage = 0;
        int EmpMonthWage = 0;
        for (int day = 0; day < WORKING_DAYS; day++) {
            int EmpCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (EmpCheck) {
                case IS_PART_TIME:
                    EmpHr = 4;
                    break;
                case IS_FULL_TIME:
                    EmpHr = 8;
                    break;
            }
            EmpWage = EmpHr * WAGE_PER_HOUR;
            System.out.println("Employee Wage is :" + EmpWage);
            EmpMonthWage += EmpWage;
        }
        System.out.println("Monthly Employee Wage is :" + EmpMonthWage);
    }
 }