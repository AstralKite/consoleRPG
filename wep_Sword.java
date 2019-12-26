package RPG_characters;



public class wep_Sword implements Weapon{

    private String wep_name = "SWORD";

    @Override
    public String attack(){
        return (wep_name + " ATTACK");
    }

    @Override
    public String getWeaponName(){
        return wep_name;
    }
}
