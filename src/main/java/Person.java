import java.util.Objects;

public class Person {

    private final String name;
    private final String surname;

    private int age;
    private String address;


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
        return (this.age > 0 || this.age == 0);
    }

    public boolean hasAddress() {
        return this.address != null;
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
//        personBilder.setAge(1);
        personBilder.setAddress(this.address);
        return personBilder;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {

        private String name;
        private String surname;

        private int age = 0;
        private String address = null;

        private PersonBuilder() {
        }

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            if (this.name == null || this.surname == null) {
                throw new IllegalStateException("Имя и/или фамилия не указаны!");
            } else {
                if (this.age < 0) {
                    throw new IllegalStateException("Возраст указан некорректно!");
                }
            }
            return new Person(name, surname, age, address);
        }

    }

}
