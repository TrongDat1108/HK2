package Person;

public class Person {
    protected String name;
    protected String address;

    public Person() {
    }

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person(Person p) {
        p.name = this.name;
        p.address = this.address;
    }

    public String toString() {
        return "Person[" + "Name = " + this.name + ",Address = " + this.address + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
