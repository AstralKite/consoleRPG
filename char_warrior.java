package RPG_characters;


public class char_warrior extends characters{

    int health = 20;
    int attackPWR = 7;
    int newPower = 0;
    String char_class = "Warrior";
    int potionCount = 3;

    @Override
    public void speak(){
        System.out.println("I am a " + char_class + ", holding a " + myWeapon.getWeaponName());
    }

    @Override
    public int fight(){
        //randomize attack power
        newPower = (int)(Math.random() * attackPWR);
        System.out.println( char_class + " used " + myWeapon.attack() + " to deliver " + newPower + " damage!");
        return -newPower;
    }

    @Override
    public void addHealth(int n){
        health += n;
        if(health < 0){
            health = 0;
        }
    }

    public int getHealth(){
        return health;
    }

    public String getName(){
        return char_class;
    }

    public void useItem_Potion(){
        if(potionCount > 0){
            System.out.println(name + " restored 5 health!");
            addHealth(5);
        }
    }
}
