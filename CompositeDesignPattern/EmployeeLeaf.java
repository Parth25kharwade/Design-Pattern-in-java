package CompositeDesignPattern;

public class EmployeeLeaf implements EmployeeComponent {
    private int empployeeId;
    private String name;
    private String position;



    public int getEmpployeeId() {
        return empployeeId;
    }

    public void setEmpployeeId(int empployeeId) {
        this.empployeeId = empployeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public EmployeeLeaf(int empployeeId, String name, String position) {
        this.empployeeId = empployeeId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println("EmployeeLeaf{" +
                "empployeeId=" + empployeeId +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}');
    }

    @Override
    public void add(EmployeeComponent component) {

    }

    @Override
    public void remove(EmployeeComponent component) {

    }
}
