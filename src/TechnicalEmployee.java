import interfaces.Programmer;

class TechnicalEmployee extends Employee implements Programmer {
    protected int workingHours;
    protected double hourlyWage;

    public TechnicalEmployee(String name, int age, int workingHours, double hourlyWage) {
        super(name, age);
        this.workingHours = workingHours;
        this.hourlyWage = hourlyWage;
    }

    @Override
    public void calculateSalary() {
        this.salary = this.workingHours * this.hourlyWage;
    }
    @Override
    public void sendEmail() {
        System.out.println("Nhân viên kỹ thuật gửi email");
    }

    @Override
    public void programing() {
        System.out.println("Nhân viên kỹ thuật lập trình");
    }
}
