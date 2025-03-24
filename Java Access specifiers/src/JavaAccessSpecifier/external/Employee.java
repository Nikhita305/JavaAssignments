package JavaAccessSpecifier.external;

import JavaAccessSpecifier.internal.Mall;

public class Employee {
    public void Salary(){
        Mall mall = new Mall();

        System.out.println("Diff Class with diff package "+mall.name);
        mall.Open();
    }
}
