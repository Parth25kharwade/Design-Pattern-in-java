package CompositeLaptopExample;

import java.util.ArrayList;
import java.util.List;

public class Laptop implements Component{
    List<Component> list=new ArrayList<>();


    public void add(Component component) {
        list.add(component);

    }


    public void remove(Component component) {
        list.remove(component);

    }
    @Override
    public void getDescription() {
        for (Component component:list){
            System.out.println(" ");
            component.getDescription();
        }

    }

    @Override
    public double getCost() {
        double total=0;
        for (Component component:list){
            total+=component.getCost();
        }
        System.out.println("Total Cost: "+total);

        return total;
    }
}
