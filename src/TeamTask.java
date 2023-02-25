import java.time.LocalDate;

public class TeamTask extends Tasks{
    String responsible;

    public TeamTask(String taskTopic, LocalDate deadline, boolean priority, String responsible) {
        super(taskTopic, deadline, priority);
        this.responsible = responsible;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    @Override
    public String toString() {
        return "Общая задача: " + super.toString() + ". Ответственный: " + responsible;
    }

    @Override
    public int compareTo(Tasks o) {
        return getDeadline().compareTo(o.getDeadline());
    }
}
