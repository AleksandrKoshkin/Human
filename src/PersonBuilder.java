public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Недопустимое значение " + age);
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalStateException {
        if (surname == null || name == null) {
            throw new IllegalStateException("Нет  значения");
        }
        if (age == 0) {
            Person person = new Person(name, surname);
            person.setAddress(address);
            return person;
        } else {
            Person person = new Person(name, surname, age);
            person.setAddress(address);
            return person;
        }
    }
}