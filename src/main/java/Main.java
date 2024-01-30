import People.Boss;
import People.Employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        {
            System.out.println("Increase Salary: ");
            Employee a1 = new Employee("name1", "surname1", "post1", 123, 5000, 46);
            Employee a2 = new Employee("name2", "surname2", "post2", 321, 5000, 44);
            Boss b1 = new Boss("boss1", "surname2", "post2", 321, 5000, 46);

            ArrayList<Employee> employees = new ArrayList<>();
            employees.add(a1);
            employees.add(a2);
            employees.add(b1);

            Boss.increaseSalary(5000, 45, employees);
            for (Employee x : employees) {
                System.out.println(x.toString());
            }
            System.out.println();
        }

        {
            System.out.println("Comparator: ");
            Employee a1 = new Employee("name1", "surname1", "post1", 123, 5000, 46);
            Employee a2 = new Employee("name2", "surname2", "post2", 321, 5000, 44);
            Employee a3 = new Employee("name1", "surname2", "post2", 321, 5000, 44);
            Boss b1 = new Boss("name1", "surname2", "post2", 321, 5000, 46);
            System.out.println((a1.compare(a1,a2) == 0 ? "Equal" : "Not Equal")); // Вывод -1 т.к. не равны
            System.out.println((a1.compare(a1,a3) == 0 ? "Equal" : "Not Equal")); // Вывод 0 т.к. равны
            System.out.println((a1.compare(a1,b1) == 0 ? "Equal" : "Not Equal")); // Здесь апкастинг может быть опасным и вот пример) Фикс - больше проверок в компараторе
        }


    }
}
