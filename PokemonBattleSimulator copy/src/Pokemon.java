import java.util.Random;
public class Pokemon {
  String name;
  int dexNumber;
  String type1 = "null";
  String type2 = "null";
  String species;
  String height;
  String weight;
  String ability;
  String dexEntry;
  int attackMin;
  int attackMax;
  int defenseMin;
  int defenseMax;
  int spAtkMin;
  int spAtkMax;
  int spDefMin;
  int spDefMax;
  int speedMin;
  int speedMax;
  int base_hp;
  int base_attack;
  int base_defense;
  int base_spAtk;
  int base_spDef;
  int base_speed;
  int maxhp;
  int hp;
  int attack;
  int defense;
  int spAtk;
  int spDef;
  int speed;
  int condition;
  String move1;
  String move2;
  String move3;
  String move4;
  int movePriority;
  

  public Pokemon(String name, int dexNumber, String type1, String type2, String species, String height, String weight, String ability, String dexEntry, int hpMin, int hpMax, int attackMin, int attackMax, int defenseMin, int defenseMax, int spAtkMin, int spAtkMax, int spDefMin, int spDefMax, int speedMin, int speedMax, int condition, String move1, String move2, String move3, String move4, int movePriority) {
    this.name = name;
    this.dexNumber = dexNumber;
    this.species = species;
    this.height = height;
    this.weight = weight;
    this.ability = ability;
    this.dexEntry = dexEntry;
    this.condition = condition;
    this.base_hp = (int) (Math.random() * (hpMax - hpMin + 1)) + hpMin;
    this.base_attack = (int) (Math.random() * (attackMax - attackMin + 1)) + attackMin;
    this.base_defense = (int) (Math.random() * (defenseMax - defenseMin + 1)) + defenseMin;
    this.base_spAtk = (int) (Math.random() * (spAtkMax - spAtkMin + 1)) + spAtkMin;
    this.base_spDef = (int) (Math.random() * (spDefMax - spDefMin + 1)) + spDefMin;
    this.base_speed = (int) (Math.random() * (speedMax - speedMin + 1)) + speedMin;
    this.maxhp = this.base_hp;
    this.hp = maxhp;
    this.attack = this.base_attack;
    this.defense = this.base_defense;
    this.spAtk = this.base_spAtk;
    this.spDef = this.base_spDef;
    this.speed = this.base_speed;
    this.type1 = type1;
    this.type2 = type2;
    this.move1 = move1;
    this.move2 = move2;
    this.move3 = move3;
    this.move4 = move4;
    if (type1 == type2) {
      this.type2 = "";
    }
    if (type2 == "null") {
      this.type2 = "";
    }
    this.movePriority = movePriority;
  }
  public Pokemon() {
    this.name = "";
    this.dexNumber = 0;
    this.species = "";
    this.height = "";
    this.weight = "";
    this.ability = "";
    this.dexEntry = "";
    this.condition = 0;
    this.base_hp = 0;
    this.base_attack = 0;
    this.base_defense = 0;
    this.base_spAtk = 0;
    this.base_spDef = 0;
    this.base_speed = 0;
    this.maxhp = 0;
    this.hp = 0;
    this.attack = 0;
    this.defense = 0;
    this.spAtk = 0;
    this.spDef = 0;
    this.speed = 0;
    this.type1 = "";
    this.type2 = "";
    this.move1 = "";
    this.move2 = "";
    this.move3 = "";
    this.move4 = "";
    if (type1 == type2) {
      this.type2 = "";
    }
    if (type2 == "null") {
      this.type2 = "";
    }
    this.movePriority = 0;
  }
  public Pokemon(Pokemon pokemon) {
    this.name = pokemon.name;
    this.dexNumber = pokemon.dexNumber;
    this.species = pokemon.species;
    this.height = pokemon.height;
    this.weight = pokemon.weight;
    this.ability = pokemon.ability;
    this.dexEntry = pokemon.dexEntry;
    this.condition = pokemon.condition;
    this.base_hp = pokemon.base_hp;
    this.base_attack = pokemon.base_hp;
    this.base_defense = pokemon.base_defense;
    this.base_spAtk = pokemon.base_spAtk;
    this.base_spDef = pokemon.base_spDef;
    this.base_speed = pokemon.base_speed;
    this.maxhp = pokemon.base_hp;
    this.hp = pokemon.maxhp;
    this.attack = pokemon.base_attack;
    this.defense = pokemon.base_defense;
    this.spAtk = pokemon.base_spAtk;
    this.spDef = pokemon.base_spDef;
    this.speed = pokemon.base_speed;
    this.type1 = pokemon.type1;
    this.type2 = pokemon.type2;
    this.move1 = pokemon.move1;
    this.move2 = pokemon.move2;
    this.move3 = pokemon.move3;
    this.move4 = pokemon.move4;
    if (type1 == type2) {
      this.type2 = "";
    }
    if (type2 == "null") {
      this.type2 = "";
    }
    this.movePriority = pokemon.movePriority;
  }
  public void conditionCheck() {
    if (this.condition == 1) {
      this.hp -= (this.maxhp / 16);
      System.out.println(this.name + " was hurt by its burn!");
    } else if (this.condition == 2) {
      //poison
    }
  }
  public void printStats() {
    /*String status = "";
    none, burn, freeze, paralysis, poison, toxic poison, sleep, attract, confusion, curse
    if (this.condition == 1) {
      status = "burned";
    } else if (this.condition == 2) {
      
    }
    I'll do this later
    */
    System.out.println("\n" + this.name + "\n#" + this.dexNumber + "\n" + this.type1 + "   " + this.type2 + "\n" +  this.species + "\nHeight " + this.height + "\nWeight " + this.weight + "\nAbility: " + this.ability + "\n" + this.dexEntry + "\n\nStats" + "\nHP      " + this.base_hp + "\nAttack  " + this.base_attack + "\nDefense " + this.base_defense + "\nSp. Atk " + this.spAtk + "\nSp. Def " + this.spDef + "\nSpeed   " + this.speed);
  }
}