public class Address {
    private String city;
    private String street;

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public void setCity(String city) {
        System.out.println("UWAGA nastapila zmiana miasta zamieszkania");
        this.city = city;
    }

    public void setStreet(String Street) {
        System.out.println("UWAGA nastapila zmiana ulicy w adresie zamieszkania");
        this.street = street;
    }
}
