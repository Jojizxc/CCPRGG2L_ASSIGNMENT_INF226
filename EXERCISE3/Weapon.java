public class Weapon {
    

        String name;
        int damage;
        String rarity;
        String WeaponType;
        

        public void sayMyName() {
            System.out.println("My weapon is: " + name);
            System.out.println("My damage :" + damage);
            System.out.println("rarity:" + rarity);

        }
        public void addDamage (int addDamage) {
            int newDamage = this.damage + addDamage;
            
            System.out.println("Total damage: " + newDamage);
            this.damage = newDamage;
        }
          
        String showNameandRarity() {
            return "Name: " + name + "\n" + "Rarity: " + rarity; 

        

        }
        

        

        }
        
        

       


        
       




        


        
    
