public class Main {

    public static void main(String[] args) {

        Person father = Person.builder()
                .setName("Petr")
                .setSurname("Ivanov")
                .setAge(44)
                .setAddress("Moscow")
                .build();

        father.setAddress("Piter");
        father.happyBirthday();
        System.out.println("Отец" + father);
        System.out.println("Есть у отца данные о возрасте? " + father.hasAge());
        System.out.println("Есть у отца данные об адресе? " + father.hasAddress());

        Person son = father.newChildBuilder()
                .setName("Ivan")
                .setAge(1)
                .build();

        son.happyBirthday();
        System.out.println("Сын" + son);

        Person brother = Person.builder()
                .setName("Sidor")
                .setSurname("Ivanov")
                .setAge(47)
                .build();

        brother.happyBirthday();
        System.out.println("Брат" + brother);
        System.out.println("Есть у брата данные о возрасте? " + brother.hasAge());
        System.out.println("Есть у брата данные об адресе? " + brother.hasAddress());
        brother.setAddress("Tula");
        System.out.println("Брат" + brother);
        System.out.println("Есть у брата данные об адресе? " + brother.hasAddress());

        Person frend = Person.builder()
                .setName("Dima")
//                .setSurname("Kozlov")
                .setAge(44)
                .setAddress("Moscow")
                .build();

        System.out.println("Друг" + frend);

        Person svat = Person.builder()
                .setName("Roma")
                .setSurname("Smirnov")
                .setAge(-3)
                .setAddress("Moscow")
                .build();

        System.out.println("Сват" + svat);

    }
}
