package employee;

class OfficeEmployee extends  Employee {
    protected int workingDays;
    private static final double DAYLY_WAGE = 100.0;
    public OfficeEmployee(String name, int age, int workingDays) {
        super(name, age);
        this.workingDays = workingDays;
    }

    @Override
    public void calculateSalary() {
        this.salary = this.workingDays * DAYLY_WAGE;
    }
    @Override
    public void sendEmail() {
        System.out.println("Nhân viên văn phòng gửi email");
    }
}

