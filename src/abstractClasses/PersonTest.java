package abstractClasses;
/*
В этой программе демонстрируется
применение абстрактных классов
 */
public class PersonTest {
    public static void main(String[] args) {
        Person [] people = new Person[2];

        // заполнить масиив people объектами
        // типа student и Employee
        people[0] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");

        //Вывести имена и описания всех лиц,
        //представленных объектами типа person
        for(Person p : people) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}
