package level1.model;

public class InSiteWorkerManager extends WorkerManager {
    static final double FUEL_COST=5;

    public InSiteWorkerManager(String name, String surname, double salaryPerHour) {
        super(name, surname, salaryPerHour);
    }

    @Override
    public double calculateTotalSalary(int workingHours){
        double totalSalary = (20*FUEL_COST)+(super.getSalaryPerHour() * workingHours);
        return totalSalary;
    }

    @Deprecated
    public void deprecatedMethod(){
        System.out.println("This function is outdated");
    }
}
