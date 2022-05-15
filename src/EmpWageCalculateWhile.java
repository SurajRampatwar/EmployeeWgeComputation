public class EmpWageCalculateWhile {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int WORKING_DAYS = 2;
    public static final int MAX_HOURS_IN_MONTH = 10;

    public static void main(String[] args) {
        int EmpHr = 0;
        int TOTAL_WORKING_DAYS = 0;
        int TotalEmpHR = 0;
        while (EmpHr <= MAX_HOURS_IN_MONTH && TOTAL_WORKING_DAYS < WORKING_DAYS) {
            TOTAL_WORKING_DAYS++;
            int EmpCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (EmpCheck) {
                case IS_PART_TIME:
                    EmpHr = 4;
                    break;
                case IS_FULL_TIME:
                    EmpHr = 8;
                    break;
            }
            TotalEmpHR += EmpHr;
            System.out.println("DAY " + TotalEmpHR + "EMP HOUR: " + EmpHr);

        }
        int EmpMonthWage = TotalEmpHR * WAGE_PER_HOUR;
        System.out.println("Total Employee Wage is :" + EmpMonthWage);
    }
}
