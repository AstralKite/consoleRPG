package RPG_characters;



public class wep_Axe implements Weapon{

    private String wep_name = "AXE";

    @Override
    public String attack(){
        return (wep_name + " ATTACK");
    }

    @Override
    public String getWeaponName(){
        return wep_name;
    }
}
