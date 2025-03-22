package immutability.nonImmutiblity;

public class AddressOfEmployee {
    private String streetName;
    private String city;
    private long zipcode;

    public AddressOfEmployee(String streetName, String city, long zipcode) {
        this.streetName = streetName;
        this.city = city;
        this.zipcode = zipcode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString(){
        return "Address {" +
                "streetName= '"+ streetName+ '\''+
                ", city='"+city+'\''+
                ", zipCode= "+ zipcode+
                "}";
    }
}
