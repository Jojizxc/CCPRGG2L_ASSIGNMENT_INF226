public class Person {

    String name;
    int age; 

    Person(String personName, int personAge) {
        this.name=personName;
        this.age = personAge;
        }

        void addFriend (Person friend) {
            System.out.println("I am " + this.name + " and my friend is " + friend.name);
        }
    

    void addClassmate (Person Classmate) {
        System.out.println("Hi my name is " + this.name + " and my classmate is " + Classmate.name); 


    }
}
