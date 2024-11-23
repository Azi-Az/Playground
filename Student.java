
    public class Student extends Person {
        private int indexNumber;

//    public Student(String name, String surname, int age, String city, String street, int indexNumber) {
//        super(name, surname, age, city, street);
//        this.indexNumber = indexNumber;


        public Student(Person person, int indexNumber) {
            super(person.getName(), person.getSurname(), person.getAge());
            this.indexNumber = indexNumber;
        }
    }
