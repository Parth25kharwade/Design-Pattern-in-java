package CompositeDesignPattern;

public interface EmployeeComponent {
    void showDetails();
    void add(EmployeeComponent component);
    void remove(EmployeeComponent component);

}
