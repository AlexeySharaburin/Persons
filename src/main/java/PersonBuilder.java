public class PersonBuilder {

    private String name;
    protected String surname;

    private int age = 0;
    private String address = null;

    public PersonBuilder() {
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
            throw new IllegalStateException("Имя или фамилия не указаны!");
        } else {
            if (this.age < 0 || this.age == 0) {
                throw new IllegalStateException("Возраст указан некорректно!");
            }
        }

        return new Person(name, surname, age, address);
    }


}
