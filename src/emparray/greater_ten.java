package emparray;

import empmodel.Employee;

import java.util.ArrayList;
import java.util.List;

public class greater_ten {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"shubendra kumar",15000.0));
        list.add(new Employee(1,"gulshan kumar",12500.0));
        list.add(new Employee(1,"raman kumar",10000.0));
        list.add(new Employee(1,"hemant kumar",8500.0));

        list.stream().filter(emp -> emp.getSalary()>10000).forEach(System.out::println);


    }
}
