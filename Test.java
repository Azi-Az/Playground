public class Test {
    public static void main(String[] args) {
        Person person = new Person("Natalia","Testowa",10);
        Person secondPerson = new Person("Julia","Przykładowa",16);

     Student student = new Student(person, 343);
     System.out.println(student.getName());


    }
}

//class Person {
//    private String name;
//    private String surname;
//    private int age;
//    private String city;
//    private String street;
//
//    public Person(String name, String surname, int age, String city, String street) {
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//        this.city = city;
//        this.street = street;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setName(String name) {
//        System.out.println("UWAGA nastąpiła zmiana imienia");
//        this.name = name;
//    }
//
//    public void setSurname(String surname) {
//        if (this.age < 18) {
//            System.out.println("Zmiana nazwiska nie jest możliwa dla osób niepełnoletnich");
//        } else {
//        System.out.println("UWAGA nazwisko zostało zmienione");
//        this.surname = surname;
//        }
//        }
//
//    public void setCity(String city) {
//        System.out.println("UWAGA nastapila zmiana miasta zamieszkania");
//        this.city = city;
//    }
//
//    public void setStreet(String Street) {
//        System.out.println("UWAGA nastapila zmiana ulicy w adresie zamieszkania");
//        this.street = street;
//    }
//
//}
//
//class Student extends Person {
//    private int indexNumber;
//
////    public Student(String name, String surname, int age, String city, String street, int indexNumber) {
////        super(name, surname, age, city, street);
////        this.indexNumber = indexNumber;
//
//
//    public Student(Person person, int indexNumber) {
//        super(person.getName(), person.getSurname(), person.getAge(), person.getCity(), person.getStreet());
//        this.indexNumber = indexNumber;
//    }
//}