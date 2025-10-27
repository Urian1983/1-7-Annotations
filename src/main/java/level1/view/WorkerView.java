package level1.view;

import level1.exceptions.NegativeSalaryException;
import level1.model.InSiteWorkerManager;
import level1.model.OnlineWorkerManager;
import level1.model.WorkerManager;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerView {
    private ArrayList<WorkerManager> workersList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public ArrayList<WorkerManager> getWorkersList() {
        return workersList;
    }

    public void addWorkerToList(WorkerManager newWorkerManager){
        workersList.add(newWorkerManager);
    }



    public int getWorkingHours(Scanner scanner){
        System.out.println("How many hours the worker is working?");
        int workingHours = scanner.nextInt();
        scanner.nextLine();
        return workingHours;
    }

    public OnlineWorkerManager generateNewOnlineWorker(Scanner scanner) throws NegativeSalaryException{
        System.out.println("Name of the new worker?");
        String nameWorker = scanner.nextLine();
        System.out.println("Surname of the new worker?");
        String surnameWorker = scanner.nextLine();
        System.out.println("Salary of the new worker?");
        double salary = scanner.nextDouble();
        if(salary <= 0){
            throw new NegativeSalaryException();
        }
        scanner.nextLine();
        OnlineWorkerManager newOnlineWorker = new OnlineWorkerManager(nameWorker,surnameWorker,salary);

        return newOnlineWorker;
    }

    public InSiteWorkerManager generateInSiteWorker(Scanner scanner){
        System.out.println("Name of the new worker?");
        String nameWorker = scanner.nextLine();
        System.out.println("Surname of the new worker?");
        String surnameWorker = scanner.nextLine();
        System.out.println("Salary of the new worker?");
        double salary = scanner.nextDouble();
        scanner.nextLine();

        InSiteWorkerManager newInSiteWorker = new InSiteWorkerManager(nameWorker,surnameWorker,salary);
        return newInSiteWorker;
    }




}
