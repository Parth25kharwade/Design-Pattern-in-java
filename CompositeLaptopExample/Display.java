package CompositeLaptopExample;

public class Display implements Component {
    private String displayName;
    private double displayCost;

    public Display(String displayName, double displayCost) {
        this.displayName = displayName;
        this.displayCost = displayCost;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public double getDisplayCost() {
        return displayCost;
    }

    public void setDisplayCost(double displayCost) {
        this.displayCost = displayCost;
    }

    @Override
    public void getDescription() {
        System.out.println(displayName+" ");

    }

    @Override
    public double getCost() {
        return displayCost;
    }
}
