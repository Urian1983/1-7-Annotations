package level1;

import level1.model.InSiteWorkerManager;
import level1.model.OnlineWorkerManager;
import level1.view.WorkerView;

import java.util.Scanner;

public class MainLevel1Ex2 {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        WorkerView workerUI = new WorkerView();

        OnlineWorkerManager newOnlineWorker =  workerUI.generateNewOnlineWorker(scanner);
        int workingHours = workerUI.getWorkingHours(scanner);
        newOnlineWorker.calculateTotalSalary(workingHours);

        newOnlineWorker.deprecatedMethod();
        InSiteWorkerManager newInSiteWorker = workerUI.generateInSiteWorker(scanner);

    }
}
