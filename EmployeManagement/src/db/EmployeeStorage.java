package db;

public interface EmployeeStorage {
    //4 methods
    void create(int id, String name, double salary);
    void updateSalary(int id, double salary);
    void updateName(int id, String name);
    void update(int id, String name, double salary);
    void delete(int id);
    void read(int id);
    void readALl();
}
