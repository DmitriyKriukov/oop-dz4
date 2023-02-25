import java.time.LocalDate;

public class Main {
    /*
    С учетом информации полученной ранее знакомимся с параметрическим полиморфизмом и продолжаем погружаться в ООП.
    Спроектировать и реализовать планировщик дел для работы с задачами разных приоритетов.

    Например:
    Должен быть класс Задачи (общий/родительский и подтипы)
    У задачи должно быть длительность, дедлайн, приоритет, тема, ответсвенный... - параметры на Ваше усмотрение
    **У задачи должна быть возможность включить или выключить нотификацию на разные события, например,
     приближение дедлайна.

    Должен быть класс Календарь, в который можно добавлять Задачи.
    *** При пересечении задач по времени - выводить сообщение пользователю.

    **** Должна быть возможность выгрузки Календаря в файл (тип на Ваше усмотрение)
    **** Файл должен содержать следующие данные: id, дату добавления записи, время добавления записи,
     дедлай задачи, ФИО автора и др
     */


    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        MyTask myTask1 = new MyTask("Купить продукты", LocalDate.of(2023, 2, 25), true);
        MyTask myTask2 = new MyTask("Поменять резину", LocalDate.of(2023, 3, 3), false);
        TeamTask teamTask1 = new TeamTask("8 марта", LocalDate.of(2023, 3, 8), false, "отец");
        calendar.addTask(myTask1);
        calendar.addTask(myTask2);
        calendar.addTask(teamTask1);
        myTask1.changesNotification();
        calendar.removeTask(myTask2);

        calendar.sort();
        for (Tasks tasks : calendar) {
            System.out.println(tasks);
        }
        calendar.showNotification();
        calendar.fileWriter();
    }
}