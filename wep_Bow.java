package RPG_characters;



public class wep_Bow implements Weapon{

    private String wep_name = "BOW";

    @Override
    public String attack(){
        return (wep_name + " ATTACK");
    }

    @Override
    public String getWeaponName(){
        return wep_name;
    }
}
