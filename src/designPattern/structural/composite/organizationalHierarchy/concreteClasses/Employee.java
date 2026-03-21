package designPattern.structural.composite.organizationalHierarchy.concreteClasses;

import designPattern.structural.composite.organizationalHierarchy.abstractClasses.OrgEmployee;

public class Employee implements OrgEmployee {
    private final String name;
    private final String title;
    private final int salary;

    public Employee(String name, String title, int salary){
        this.name = name;
        this.salary = salary;
        this.title = title;
    }

    public int getSalary() {
        return salary;
    }

    public int getHeadCount(){
        return 1;//since only one employee and we are sure that there are none working under this one.
    }

    public void printHierarchy(String indent){
        System.out.println(indent + "- Employee Name: " + name + " : " + title);
    }
}
