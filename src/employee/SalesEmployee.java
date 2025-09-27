package employee;

import interfaces.Saleperson;

class SalesEmployee extends Employee implements Saleperson {
    public SalesEmployee(String name, int age, double salesAmount, double commissionRate) {
        super(name, age);

    }

    @Override
    public void sendEmail() {
        System.out.println("Nhân viên kinh doanh gửi email");
    }

    @Override
    public void sellProduct() {
        System.out.println("Nhân viên kinh doanh bán hàng");
    }
}
