package emparray;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Employee {
    public static void main(String[] args) {
        List<empmodel.Employee> list = new ArrayList<>();
        list.add(new empmodel.Employee(1,"Shubendra Kumar",90000.00));
        list.add(new empmodel.Employee(1,"gulshan Kumar",100000));
        list.add(new empmodel.Employee(1,"raman Kumar",120000.00));
        list.add(new empmodel.Employee(1,"hemant Kumar",80000.00));


          Optional<Double> salary= list.stream().skip(2).map(e -> e.getSalary()).findFirst();

        System.out.println(salary.get());
    }
}
