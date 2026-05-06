import java.util.ArrayList;
class Task{
    String title;
    boolean isCompleted;

    public Task(String title, boolean isCompleted){
        this.title=title;
        this.isCompleted=isCompleted;
    }
}   
public class Main{
    public static void main(String[] args) {
        
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Learn Java",false));
        tasks.add(new Task("Build To-Do App",true ));
        tasks.add(new Task("Practice Coding",true));

        for (int i = 0; i < tasks.size(); i++) {
        Task t = tasks.get(i);
        System.out.println((i + 1) + ". " + t.title + " - " + (t.isCompleted ? "Done" : "Pending"));
}
    }
}