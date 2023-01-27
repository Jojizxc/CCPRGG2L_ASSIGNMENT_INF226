public class App {
    public static void main(String[] args) {
    

   Person me = new Person("Bianca", 18);
   Person friend = new Person("Regina", 19); 
   System.out.println();



   Person classmate = new Person("Klarenze", 20);
   Person classmate1 = new Person("Josh", 19);
   Person classmate2 = new Person("Seth", 19);
   System.out.println();
  
   me.addClassmate(classmate);
   me.addClassmate(classmate1);
   me.addClassmate(classmate2); 
   me.addFriend(friend); 

   
  
   Pet Dog= new Pet("collie", 1, me);
   Dog.showOwner(); 

   Car Honda =new Car("Civic", "White", "Honda", 10000, me);
   Honda.showOwner();


   
    

   }
}
