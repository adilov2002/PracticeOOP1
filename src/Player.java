public class Player{
    public int number;
    public String name;
    public String surname;
    public String position;


    public Player() { }
    public Player(int number, String name, String surname, String position) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

