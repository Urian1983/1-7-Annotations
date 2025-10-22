package level1.model;

public class OnlineWorkerManager extends WorkerManager {
   final static double INTERNET_COST = 100;
    public OnlineWorkerManager(String name, String surname, double salaryPerHour) {
        super(name, surname, salaryPerHour);
    }

    @Override
    public double calculateTotalSalary(int workingHours) {
        double totalSalary = INTERNET_COST+(super.getSalaryPerHour() * workingHours);
        return totalSalary;
    }

    @Deprecated
    public void deprecatedMethod(){
        System.out.println("This function is outdated");
    }
}
