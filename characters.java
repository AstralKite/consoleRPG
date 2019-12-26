package RPG_characters;



abstract class characters {

    //--------------- variables
    int health;
    String name = "";
    String char_class = "CHAR_BLANK";
    int potionCount = 0;
    //create object instance of a weapon to hold
    Weapon myWeapon = new wep_None();

    //
    abstract void speak();

    public void setWeapon(Weapon w){
        myWeapon = w;
    }

    abstract public int fight();
    abstract public void addHealth(int n);
    abstract public void useItem_Potion();

    public int getPotionCunt(){
        return potionCount;
    }


    abstract public int getHealth();

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }


}
