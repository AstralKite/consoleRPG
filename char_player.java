package RPG_characters;


public class char_player extends characters{

    int health = 20;
    int attackPWR = 5;
    int newPower = 0;
    String char_class = "Player";
    String name = "";
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

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void useItem_Potion(){
        if(potionCount > 0){
            System.out.println(name + " restored 5 health!");
            addHealth(5);
            --potionCount;
        } else{
            System.out.println(name + " RAN OUT OF POTIONS!");
        }
    }

    public int getPotionCunt(){
        return potionCount;
    }
}
