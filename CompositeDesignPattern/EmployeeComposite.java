package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeComposite implements EmployeeComponent{
    List<EmployeeComponent> componentList=new ArrayList<>();

    @Override
    public void showDetails() {
        System.out.println("EmployeeComposite");

        for(EmployeeComponent emp:componentList){
            emp.showDetails();
        }
    }

    @Override
    public void add(EmployeeComponent component) {
        componentList.add(component);

    }

    @Override
    public void remove(EmployeeComponent component) {
        componentList.remove(component);

    }

//    public void addEmployee(EmployeeComponent component){
//        componentList.add(component);
//    }
//    public void removeEmployee(EmployeeComponent component){
//        componentList.remove(component);
//    }
}
