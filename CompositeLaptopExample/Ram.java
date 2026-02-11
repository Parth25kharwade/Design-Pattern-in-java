package CompositeLaptopExample;

public class Ram implements Component{
    private String ramType;
    private double ramCost;

    public Ram(String ramType, double cost) {
        this.ramType = ramType;
        this.ramCost = cost;
    }

    public String getRamType() {
        return ramType;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
    }

    public void setCost(double cost) {
        this.ramCost = cost;
    }


    @Override
    public void getDescription() {
        System.out.println(ramType+" ");

    }

    @Override
    public double getCost() {
        return ramCost;
    }
}
