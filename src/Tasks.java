import java.time.LocalDate;

public abstract class Tasks implements Comparable<Tasks> {
    private String taskTopic;
    private LocalDate deadline;
    private boolean priority;
    private boolean notification;

    public Tasks(String taskTopic, LocalDate deadline, boolean priority) {
        this.taskTopic = taskTopic;
        this.deadline = deadline;
        this.priority = priority;
        this.notification = false;
    }

    public String getTaskTopic() {
        return taskTopic;
    }

    public void setTaskTopic(String taskTopic) {
        this.taskTopic = taskTopic;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public String toStringPriority() {
        if (this.priority) {
            return "высокий";
        } else {
            return "обычный";
        }
    }

    public boolean isPriority() {
        return priority;
    }

    public void setPriority(boolean priority) {
        this.priority = priority;
    }

    public boolean isNotification() {
        return notification;
    }

    public void setNotification(boolean notification) {
        this.notification = notification;
    }

    public String toStringNotification() {
        if (this.notification) {
            return "включено";
        } else {
            return "выключено";
        }
    }

    public void changesNotification() {
        if (!this.notification) {
            System.out.println(this.taskTopic + ": уведомление включено");
            this.notification = true;
        } else {
            System.out.println(this.taskTopic + ": уведомление выключено");
            this.notification = false;
        }
    }

    @Override
    public String toString() {
        return "Тема: " + taskTopic +
                ". Дедлайн: " + deadline +
                ". Приоритет " + toStringPriority() +
                ". Уведомление " + toStringNotification();
    }
}
