public class Person {
    private String name;
    private String surname;
    private int age;
    private String city;
    private String street;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        System.out.println("UWAGA nastąpiła zmiana imienia");
        this.name = name;
    }

    public void setSurname(String surname) {
        if (this.age < 18) {
            System.out.println("Zmiana nazwiska nie jest możliwa dla osób niepełnoletnich");
        } else {
            System.out.println("UWAGA nazwisko zostało zmienione");
            this.surname = surname;
        }
    }
}
