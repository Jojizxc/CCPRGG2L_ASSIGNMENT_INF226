public class Car { 

    String brand;
    String name;
    String color;
    int Price;
    Person owner;

    Car(String carName, String carColor, String carBrand,int Price, Person owner) {

        this.brand = carBrand;
        this.name = carName;
        this.color = carColor;
        this.Price= Price;
        
        System.out.println(); 
    }
   

    void showOwner() {
        System.out.println("Car brand is: " + this.brand + " and its name is: " + this.name + " and the color is: " + this.color);
        System.out.println("Price is:" + this.Price);
    
    }

}