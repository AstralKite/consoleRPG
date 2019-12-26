package RPG_characters;


import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class GAME {

    public static void main(String[] args) {

        //main objects
        characters wiz = new char_wizard();
        characters war = new char_warrior();


        //player object setup
        characters player = new char_player();
        player.setWeapon(new wep_Sword());
        int potion_count = 3;

        //setup enemies array
        characters[] enemies = new characters[3];
        enemies[0] = new char_wizard();
        enemies[1] = new char_warrior();
        enemies[2] = new char_fencer();


        //vars
        int choice = 0;
        Boolean choice_valid = false;
        int rand_enemy = 0;

        wiz.setWeapon(new wep_Bow());
        war.setWeapon(new wep_Axe());


        //set player name
        System.out.println("Type in your name!");
        Scanner scan = new Scanner(System.in);
        player.setName( scan.nextLine() );

        System.out.println( player.getName() );
        System.out.println(" \n\n-------------------- ");


        while(true) {

            //-------------------- pick random enemy
            rand_enemy = (int)( Math.random() * enemies.length);
            switch(rand_enemy){
                case 0:
                    enemies[rand_enemy] = new char_wizard();
                    break;
                case 1:
                    enemies[rand_enemy] = new char_warrior();
                    break;
                case 2:
                    enemies[rand_enemy] = new char_fencer();
                    break;
            }


            // ------------------------------------------------------------ BATTLE START
            // --------------- BATTLE LOOP
            while ((enemies[rand_enemy].getHealth() > 0) && (player.getHealth() > 0)) {
                //display stats
                System.out.print("[ " + player.getName() + " health: " + player.getHealth());
                System.out.println("  ||  " + enemies[rand_enemy].getName() + " health: " + enemies[rand_enemy].getHealth() + " ]");



                //switch to handle chosen options
                while(!choice_valid) {

                    //Choice menu
                    System.out.println("Choose an option!");
                    System.out.println("[1] Attack");
                    System.out.println("[2] Health Potion (" + player.getPotionCunt() + ")");

                    //get choice
                    System.out.print(">> ");
                    //need a way to check for input that's not an int/char
                    choice = scan.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.println(">> (ATTACK)\n");
                            enemies[rand_enemy].addHealth(player.fight());
                            choice_valid = true;
                            break;

                        case 2:
                            System.out.println(">> (POTION)\n");
                            player.useItem_Potion();
                            choice_valid = true;
                            break;

                        default:
                            System.out.println("****  Invalid option! ****\n\n\n");
                            choice_valid = false;
                            break;
                    }
                }// wnd while choice_valid
                choice_valid = false;

                player.addHealth( enemies[rand_enemy].fight());
                System.out.println(" -------------------- ");
            }// end Battle loop

            //check enemy health (For win/defeat message)
            if(enemies[rand_enemy].getHealth() <= 0){
                System.out.println("\n****** WIN! " + enemies[rand_enemy].getName() + " DEFEATED! ******\n");
            }

            // ------------------------------------------------------------ AFTER BATTLE OPTIONS
            //--- shop for items, change weapons

        }// end main loop
    }// end main
}// end main CLASS
