import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main {
  public static Scanner user_input = new Scanner(System.in);
  public static void main(String[] args) {
    Pokemon venusaur = new Pokemon("Venusaur", 3, "grass", "poison", "Seed Pokemon", "2.0 m (6'07\")", "100.0 kg (220.5 lbs)", "Overgrow", "The flower on its back catches the sun’s rays. The sunlight is then absorbed and used for energy.", 270, 364, 152, 289, 153, 291, 184, 328, 184, 328, 148, 284, 0, "Double-Edge", "Vine Whip", "Leer", "Razor Leaf", 0);
    Pokemon charizard = new Pokemon("Charizard", 6, "fire", "flying", "Flame Pokemon", "1.7 m (5'07\")", "90.5 kg (199.5 lbs)", "Blaze", "When this Pokémon expels a blast of superhot fire, the red flame at the tip of its tails burns more intensely.", 266, 360, 155, 293, 144, 280, 200, 348, 157, 295, 184, 328, 0, "Flare Blitz", "Dragon Claw", "Blast Burn", "Thunder Punch", 0);
    Pokemon blastoise = new Pokemon("Blastoise", 9, "water", "null", "Shellfish Pokemon", "1.6 m (5'03\")", "85.5 kg (188.5 lbs)", "Torrent", "Once it takes aim at its enemy, it blasts out water with even more force than a fire hose.", 268, 362, 153, 291, 184, 328, 157, 295, 193, 339, 144, 280, 0, "Hydro Pump", "Bite", "Surf", "Blizzard", 0);
    Pokemon sceptile = new Pokemon("Sceptile", 254, "grass", "null", "Forest Pokemon", "1.7 m (5'07\")", "52.2 kg (115.1 lbs)", "Overgrow", "DEXENTRY", 250, 344, 175, 269, 135, 229, 215, 309, 175, 269, 245, 339, 0, "Leaf Blade", "Dual Chop", "Crunch", "Iron Tail", 0);
    Pokemon greninja = new Pokemon("Greninja", 658, "water", "dark", "Ninja Pokemon", "1.5 m (4'11\")", "40.0 kg (88.2 lbs)", "Torrent", "DEXENTRY", 254, 348, 195, 289, 139, 233, 211, 305, 147, 241, 249, 243, 0, "Water Shuriken", "Night Slash", "Gunk Shot", "Blizzard", 0);
    Pokemon gardevoir = new Pokemon("Gardevoir", 282, "ghost", "rock", "Embrace Pokemon", "1.6 m (5'03\")", "48.4 kg (106.7 lbs)", "Synchronize", "DEXENTRY", 246, 340, 135, 229, 135, 229, 255, 349, 235, 329, 165, 259, 0, "Moonblast", "Calm Mind", "Shadow Ball", "Thunder Punch", 0);
    
    Pokemon[] p1Party = {venusaur, charizard, blastoise};
    Pokemon[] p2Party = {greninja, gardevoir, sceptile};
    Turn p1Turn = new Turn(p1Party[0], p2Party[0]);
    Turn p2Turn = new Turn(p2Party[0], p1Party[0]);
    //venusaur.printStats();
    //charizard.printStats();
    //blastoise.printStats();
    System.out.println("Player 1 sent out " + p1Party[0].name + "!\nPlayer 2 sent out " + p2Party[0].name + "!");
    int p1Act = 0;
    int p2Act = 0;
    int[] act = {p1Act, p2Act};
    Pokemon[][] party = {p1Party, p2Party};
    int playerNum = 0;
    String p1Action = "";
    String p2Action = "";
    for (int v = 0; v < 1; v++) {
      //v--;
      System.out.println("Player 1's turn!");
      
      for (int turnEnd = 0; turnEnd < 1; turnEnd++) {
        playerNum = 0;
        for (int i = 0; i < 2; i++) {
          System.out.println("Player " + (i + 1) + ", what would you like to do?");
          if (user_input.nextLine().equals("attack")) {
            System.out.println("Which attack would you like to use?");
            System.out.println(party[playerNum][act[i]].move1);
            System.out.println(party[playerNum][act[i]].move2);
            System.out.println(party[playerNum][act[i]].move3);
            System.out.println(party[playerNum][act[i]].move4);
            System.out.println("back");
            if (user_input.nextLine().equals(party[playerNum][act[i]].move1)) {
              p1Action = party[playerNum][act[i]].move1;
            } else if (user_input.nextLine().equals(party[playerNum][act[i]].move2)) {
              p1Action = party[playerNum][act[i]].move2;
            } else if (user_input.nextLine().equals(party[playerNum][act[i]].move3)) {
              p1Action = party[playerNum][act[i]].move3;
            } else if (user_input.nextLine().equals(party[playerNum][act[i]].move4)) {
              p1Action = party[playerNum][act[i]].move4;
            } else if (user_input.nextLine().equals("back")) {
              i--;
            } else {
            }
          }
          System.out.println("NEXT");
          playerNum++;
        }
        playerNum--;
        System.out.println(p1Party[p1Act].move1);
        /*for (int x = 0; x < 10; x++) {
          p2Turn.waterShuriken();
          p1Turn.vineWhip();
        }*/
        
        if (p1Party[p1Act].speed >= p2Party[p2Act].speed && p1Party[p1Act].movePriority >= p2Party[p2Act].movePriority) {
          p1Turn.useAttack(p1Action);
          p2Turn.useAttack(p2Action);
        } else {
          p2Turn.useAttack(p2Action);
          p1Turn.useAttack(p1Action);
        }

      }
      
      
      //victory = 1 -- player 1 victory, victory = 2 -- player 2 victory
    }
    p1Turn.useAttack(p1Action);
    p2Turn.useAttack(p2Action);
  }
  /*possible actions for turn: attack, switch, use item
  bag
  hyper potion 3x
  
  */
  
  
}