package CompositeLaptopExample;

public class HDD implements Component{
    private String hddName;
    private double hddCost;

    public HDD(double cost, String hddName) {
        this.hddCost = cost;
        this.hddName = hddName;
    }

    public String getHddName() {
        return hddName;
    }

    public void setHddName(String hddName) {
        this.hddName = hddName;
    }

    public void setHddCost(double cost) {
        this.hddCost = cost;
    }
    public double getHddCost(){
        return hddCost;
    }

    @Override
    public void getDescription() {
        System.out.println(hddName+" ");

    }

    @Override
    public double getCost() {
        return hddCost;
    }
}
