package MaasHesapla;

public class Employee {
    private String name ;
    private double baseSalary ;
    private int workHours ;
    private int hireYear ;
    private double raise=0;
    private double bonus=0;
    private double tax=0;

    public Employee(String name, double baseSalary, int workHours, int hireYear) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double salary) {
        this.baseSalary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    @Override
    public String toString() {
        return "Employee: \n" +
                "\nName=" + name  +
                "\nSalary=" + baseSalary +
                "\nWork Hours=" + workHours +
                "\nHire Year=" + hireYear +
                "\nRaise=" + raise +
                "\nBonus=" + bonus +
                "\nTax=" + tax +
                "\nSalary with Tax and Bonus=" + (baseSalary+bonus-tax) +
                "\nTotal Salary=" + (baseSalary+bonus-tax+raise)
                ;
    }

    public double tax(){
        if(baseSalary<1000){
            return tax;
        }else{
            return tax= baseSalary * 0.03;
        }
    }
    public double bonus(){

         if(workHours > 40) bonus= (workHours-40)*30;
         return bonus;
    }
    public double raiseSalary(){
        int yearsInJob=2021-hireYear;
        if(yearsInJob <10) raise= baseSalary * 0.05;
        else if (yearsInJob<20 && yearsInJob>9) raise= baseSalary * 0.1;
        else raise= baseSalary * 0.15;

        return raise;
    }
}
