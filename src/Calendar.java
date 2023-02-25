import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class Calendar implements Iterable<Tasks> {
    private List<Tasks> tasksList = new ArrayList<>();

    public List<Tasks> getTasksList() {
        return tasksList;
    }

    public void setTasksList(List<Tasks> tasksList) {
        this.tasksList = tasksList;
    }

    public void addTask(Tasks tasks) {
        tasksList.add(tasks);
    }

    public void removeTask(Tasks tasks) {
        tasksList.remove(tasks);
    }

    public void showNotification() {
        for (Tasks tasks : tasksList) {
            if (tasks.isNotification()) {
                if (LocalDate.now().equals(tasks.getDeadline())) {
                    System.out.println(tasks.getTaskTopic() + ": дедлайн!");
                }
            }
        }
    }

    public void sort() {
        Collections.sort(tasksList);

    }

    public void fileWriter(){
        try (FileWriter fileWriter = new FileWriter("Tasks.txt",false)){
            for (Tasks tasks : tasksList) {
                fileWriter.write(tasks +"\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<Tasks> iterator() {
        return tasksList.iterator();
    }
}
