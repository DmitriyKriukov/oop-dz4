import java.time.LocalDate;

public class MyTask extends Tasks{
    public MyTask(String taskTopic, LocalDate deadline, boolean priority) {
        super(taskTopic, deadline, priority);
    }


    @Override
    public String toString() {
        return "Моя задача: " + super.toString();
    }

    @Override
    public int compareTo(Tasks o) {
         return getDeadline().compareTo(o.getDeadline());
    }
}
