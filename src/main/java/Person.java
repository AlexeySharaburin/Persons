import java.util.Objects;

public class Person {

    protected final String name;
    protected final String surname;

    protected int age;
    protected String address;

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean hasAge() {
        boolean hasAge = false;
        if (this.age > 0) {
            hasAge = true;
        }
        return hasAge;
    }

    public boolean hasAddress() {
        boolean hasAddress = false;
        if (!(this.address == null)) {
            hasAddress = true;
        }
        return hasAddress;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    @Override
    public String toString() {
        return " - " +
                "имя = '" + name + '\'' +
                ", фамилия = '" + surname + '\'' +
                ", возраст = " + age +
                ",  адрес = " + address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBilder = new PersonBuilder();
        personBilder.setSurname(this.surname);
        personBilder.setAge(1);
        personBilder.setAddress(this.address);
        return personBilder;
    }

}
