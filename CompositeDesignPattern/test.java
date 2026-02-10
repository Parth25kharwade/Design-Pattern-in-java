package CompositeDesignPattern;

public class test {
    public static void main(String[] args) {
        EmployeeComponent CEO =new EmployeeLeaf(101,"Parth","CEO");
        EmployeeComponent SalesManager= new EmployeeLeaf(102,"Ameya","Manager-Sales");
        EmployeeComponent ProductionManager =new EmployeeLeaf(103,"Pranav","Manager-Production");
        EmployeeComponent MarketingPerson1 =new EmployeeLeaf(104,"Nikhil","Marketing");
        EmployeeComponent MarketingPerson2 =new EmployeeLeaf(105,"Kshitij","Marketing");
        EmployeeComponent clerk1 =new EmployeeLeaf(106,"Radhika","Cleark");
        EmployeeComponent productionEngineer1 =new EmployeeLeaf(107,"Pranjal","Production-Engineer");
        EmployeeComponent productionEngineer2 =new EmployeeLeaf(109,"Sanvi","Production-Engineer");
        EmployeeComponent Clerk2 =new EmployeeLeaf(101,"Parth","clerk");

        EmployeeComponent ceoTeam=new EmployeeComposite();
        EmployeeComponent ProductionTeam=new EmployeeComposite();

        EmployeeComponent SalesTeam=new EmployeeComposite();

        ceoTeam.add(CEO);
        ceoTeam.add(SalesManager);
        ceoTeam.add(ProductionManager);

        SalesTeam.add(MarketingPerson1);
        SalesTeam.add(MarketingPerson2);
        SalesTeam.add(clerk1);

        ProductionTeam.add(productionEngineer1);
        ProductionTeam.add(productionEngineer2);
        ProductionTeam.add(Clerk2);

        ceoTeam.add(SalesTeam);
        ceoTeam.add(ProductionTeam);

        CEO.showDetails();



    }
}
