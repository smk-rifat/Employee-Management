package db;
import dto.Employee;

import java.util.HashMap;

public class EmployeeMapStorage implements EmployeeStorage{
    HashMap<Integer, Employee> database = new HashMap<>();
    @Override
    public void create(int id, String name, double salary) {
        if(!database.containsKey(id)){
            database.put(id, new Employee(id, name, salary));
        }
    }

    @Override
    public void updateSalary(int id, double salary) {
        Employee emp = database.get(id);
        emp.salary = salary;
    }

    @Override
    public void updateName(int id, String name) {
        database.get(id).name = name;
    }

    @Override
    public void update(int id, String name, double salary) {
        database.get(id).salary = salary;
        database.get(id).name = name;
    }


    @Override
    public void delete(int id) {
        database.remove(id);
    }

    @Override
    public void read(int id) {
        System.out.println(database.get(id).toString());
    }

    @Override
    public void readALl() {
        for (Employee emp : database.values()){
            System.out.println(emp.toString());
        }
    }
    public void deleteAl(){
        for(Employee emp : database.values()){
            database.remove(emp.id);
        }
    }
}
