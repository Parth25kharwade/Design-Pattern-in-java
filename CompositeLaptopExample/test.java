package CompositeLaptopExample;

import java.util.concurrent.Callable;

public class test {
    public static void main(String[] args) {
        Component hdd=new HDD(2000,"Super Hddd");
        Component ram1=new Ram("16Gb Ram1",4000);
        Component ram2=new Ram("16Gb Ram2",4000);
        Component display=new Display("144hz Display",6000);

        Laptop laptop1=new Laptop();
        laptop1.add(hdd);
        laptop1.add(ram1);
        laptop1.add(ram2);
        laptop1.add(display);

        laptop1.getDescription();
        laptop1.getCost();

    }
}
