package n1exercise2;

public class Main {

    public static void main(String[] args) {

        Level LevelUser1 = Level.LOW;
        Level LevelUser2 = Level.MEDIUM;
        Level LevelUser3 = Level.HIGH;

        Task task1 = new Task(LevelUser1);
        Task task2 = new Task(LevelUser2);
        Task task3 = new Task(LevelUser3);

        task1.recomendedBook();
        task2.recomendedBook();
        task3.recomendedBook();

    }

}
