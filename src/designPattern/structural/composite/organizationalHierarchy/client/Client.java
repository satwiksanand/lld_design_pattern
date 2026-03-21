package designPattern.structural.composite.organizationalHierarchy.client;

import designPattern.structural.composite.organizationalHierarchy.abstractClasses.OrgEmployee;
import designPattern.structural.composite.organizationalHierarchy.concreteClasses.Employee;
import designPattern.structural.composite.organizationalHierarchy.concreteClasses.Manager;

public class Client {
    public static void main(String[] args) {
        OrgEmployee e1 = new Employee("e1", "SDE", 180000);
        OrgEmployee e2 = new Employee("e2", "Tester", 12000);
        OrgEmployee e3 = new Employee("e3", "HR", 0);

        Manager m1 = new Manager("m1", "Ford project", 12000);
        Manager m2 = new Manager("m2", "Nissan project", 10000);
        Manager m3 = new Manager("m3", "CEO", 99999999);

        m1.addEmployee(e1);
        m1.addEmployee(e2);
        m2.addEmployee(e3);
        m3.addEmployee(m1);
        m3.addEmployee(m2);

        System.out.println("-----------------organizational hierarchy------------------------");
        m3.printHierarchy("");

        System.out.println("-----------------total head count--------------------------------");
        System.out.println(m3.getHeadCount());

        System.out.println("-----------------total expenditure of the org--------------------");
        System.out.println(m3.getSalary());
    }
}
