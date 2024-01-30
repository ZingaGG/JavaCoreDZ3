package People;

import java.util.ArrayList;

public class Boss extends Employee{
    public Boss(String name, String surname, String post, int number, int salary, int age) {
        super(name, surname, post, number, salary, age);
    }

    // Спокойно используем апкастинг, те объекты которые были созданы на основе класса Boss не будут получать надбавку за возраст!
    public static void increaseSalary(int newAmount, int reqAge, ArrayList<Employee> employees){
        for(Employee x: employees){
            if(!(x instanceof Boss) && (x.age > reqAge)){
                x.salary += newAmount;
            }
        }
    }
}
