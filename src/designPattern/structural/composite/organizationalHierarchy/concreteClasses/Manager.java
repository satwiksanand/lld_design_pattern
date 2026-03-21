package designPattern.structural.composite.organizationalHierarchy.concreteClasses;

import designPattern.structural.composite.organizationalHierarchy.abstractClasses.OrgEmployee;

import java.util.ArrayList;
import java.util.List;

public class Manager implements OrgEmployee {
    private final String name;
    private final String title;
    private final int salary;
    private final List<OrgEmployee> children = new ArrayList<>();

    public Manager(String name, String title, int salary){
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public void addEmployee(OrgEmployee employee){
        children.add(employee);
    }

    public void removeEmployee(OrgEmployee employee){
        children.remove(employee);
    }

    public int getSalary() {
        int tot = salary;
        for(OrgEmployee employee : children){
            tot += employee.getSalary();
        }
        return tot;
    }

    public int getHeadCount() {
        int tot = 1;
        for(OrgEmployee employee : children){
            tot += employee.getHeadCount();
        }
        return tot;
    }

    public void printHierarchy(String indent) {
        System.out.println(indent + "+ Manager Name: " + name + " : " + title);
        for(OrgEmployee employee : children){
            employee.printHierarchy(indent + "  ");
        }
    }
}
