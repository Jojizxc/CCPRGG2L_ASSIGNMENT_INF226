public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        System.out.println("----------- CHARACTER----------");

        knight.strength = 100;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Zoro";
        knight.sayMyName(); 
        knight.sayMyStrength();
        knight.Attack();

        Character Sword = new Character(); 

        System.out.println("-----------WEAPON----------");

        Weapon sword = new Weapon();
        sword.name = "Wado Ichimonji"; 
        sword.damage = 10;
        sword.rarity= "Maniac";
        sword.WeaponType= "Sword";
        sword.addDamage(10); 
        sword.showNameandRarity();
        System.out.println(sword.showNameandRarity());

        System.out.println("----------- CHARACTER ----------");
        
        Character mage = new Character();

        mage.strength = 50;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName(); 
        mage.sayMyStrength();
        mage.Attack();

        System.out.println("-----------WEAPON----------");

        Weapon sword2 = new Weapon();
        sword2.name = "Sandai Kitetsu";
        sword2.damage = 10;
        sword2.rarity = "Legendary";
        sword2.WeaponType = "Sword";
        sword2.addDamage(10);
        sword2.showNameandRarity();
        System.out.println(sword2.showNameandRarity());

        System.out.println("----------- CHARACTER ----------");


        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();   
        thief.sayMyStrength();
        thief.Attack();
        

        System.out.println("-----------WEAPON----------");

        Weapon sword3 = new Weapon();
        sword3.name = "Enma";
        sword3.damage = 10;
        sword3.rarity = "Savage";
        sword3.WeaponType= "Sword"; 
        sword3.addDamage(10);
        sword3.showNameandRarity();
        System.out.println(sword3.showNameandRarity());

        System.out.println("----------- CHARACTER ----------");
        
        Character Wizard = new Character();
        Wizard.name= "Invoker";
        Wizard.strength =100;
        Wizard.intelligence= 50;
        Wizard.agility = 10;
        Wizard.sayMyName();
        Wizard.sayMyStrength();
        Wizard.Attack();

        System.out.println("-----------WEAPON----------");

        Weapon sword4 = new Weapon();
        sword4.name = "Midas";
        sword4.damage =10;
        sword4.rarity ="Epic";
        sword4.WeaponType="Sword";
        sword4.addDamage(10);
        sword4.showNameandRarity();
        System.out.println(sword4.showNameandRarity());
       
        


    }
}
