package People;

import lombok.*;

import javax.management.ConstructorParameters;
import java.util.ArrayList;
import java.util.Comparator;

// Создать класс ”Сотрудник” с полями:
//ФИО, должность, телефон, зарплата, возраст;
@ToString
@Getter
@Setter
@AllArgsConstructor
public class Employee implements Comparator<Employee> {
    protected String name;
    protected String surname;
    protected String post;
    protected int number;
    protected int salary;
    protected int age;

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
