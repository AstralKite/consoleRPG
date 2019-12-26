package RPG_characters;



public class wep_None implements Weapon {

    private String wep_name = "NONE";

    @Override
    public String attack(){
        return (wep_name + " ATTACK");
    }

    @Override
    public String getWeaponName(){
        return wep_name;
    }
}
