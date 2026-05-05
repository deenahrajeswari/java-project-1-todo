class Task{
    String title;
    boolean isCompleted;

    public Task(String title, boolean isCompleted){
        this.title=title;
        this.isCompleted=isCompleted;
    }
    public void display() {
    System.out.println(title + " - " + (isCompleted ? "Done" : "Pending"));
}
}
public class Main{
    public static void main(String[] args) {
        Task t1=new Task("learn java", false);
        Task t2=new Task("practice java", true);
        t1.display();
        t2.display();
    }
}