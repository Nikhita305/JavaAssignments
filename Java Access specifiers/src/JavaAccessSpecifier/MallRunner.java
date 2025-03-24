package JavaAccessSpecifier;

import JavaAccessSpecifier.external.Employee;
import JavaAccessSpecifier.internal.Store;

public class MallRunner {
    public static void main(String[] args){
        System.out.println("*******");
        Store store = new Store();
        store.AcessMall();

        System.out.println("*******");
        Employee employee = new Employee();
        employee.Salary();
    }
}
