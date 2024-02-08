package task2;

public class User {
    //Создайте класс User (id,name, description)
    // Введите от пользователя данные
    // создайте файл с названием "UserData_id.txt" и
    // сохраните в нем построчно информацию о пользователе с названием полей

    private Integer id;
    private String name;
    private String description;

    public User(Integer idCounter, String name, String description) {
        idCounter++;
        this.id = idCounter;
        this.name = name;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
