public class Pet { 
    String name;
    int age; 

    Person owner;

    Pet(String petName, int petAge, Person ownerName) {
        this.age= petAge;
        this.name = petName; 
        this.owner= ownerName; 
        System.out.println();
    }
    void showOwner() {
        System.out.println("My name is " + this.name + ", My owner name is " + owner.name);

    }
    
}
 