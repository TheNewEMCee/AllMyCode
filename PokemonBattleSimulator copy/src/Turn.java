public class Turn {
    Pokemon attacker = new Pokemon();
    Pokemon defender = new Pokemon();
    Pokemon[] pokeTurn = {attacker, defender};
    public Turn(Pokemon attacker, Pokemon defender) {
      this.attacker = attacker;
      this.defender = defender;
    }
    public Turn(Pokemon[] pokeTurn) {
      this.attacker = pokeTurn[0];
      this.defender = pokeTurn[1];
    }
    
    public void doubleEdge() {
      this.attacker.movePriority = 0;
      double power = 120.0;
      double stab = 1.0;
      double burn = 1.0;
      double accuracy = 100.0;
      double critChance = 0.0417;
      String typeOfMove = "normal";
      String moveName = "Double-Edge";
      String moveType = "physical";
      int atkStat = 0;
      int defStat = 0;
      if (moveType.equals("physical")) {
        atkStat = this.attacker.attack;
        defStat = this.defender.defense;
      } else if (moveType.equals("special")) {
        atkStat = this.attacker.spAtk;
        defStat = this.defender.spDef;
      }
      if (this.attacker.condition == 1) {
        burn = 0.5;
      }
      System.out.println(this.attacker.name + " used " + moveName + "!");
      double critical = 1.0;
      if (Math.random() <= critChance) {
        critical = 1.5;
        System.out.println("Critical Hit!");
      }
      //calculate type multipliers
      if (this.attacker.type1.equals(typeOfMove) || this.attacker.type2.equals(typeOfMove)) {
        stab = 1.5;
      }
      double type = 1.0;
      if (this.defender.type1.equals("rock") || this.defender.type1.equals("steel")) {
        type *= 0.5;
      }
      if (this.defender.type2.equals("rock") || this.defender.type2.equals("steel")) {
        type *= 0.5;
      }
      if (this.defender.type1.equals("ghost") || this.defender.type2.equals("ghost")) {
        type *= 0.0;
      }
      if (type > 1.0){
        System.out.println("It's super effective!");
      } else if (type < 1.0 && type > 0.0) {
        System.out.println("It's not very effective....");
      } else if (type == 0.0) {
        System.out.println("It didn't affect " + defender.name + "....");
      }
      double other = 1.0;
      //if ()
      double random = Math.floor((Math.random() * ((100.0 - 85.0) + 1.0)) + 85.0) / 100.0;
      int damage = (int) Math.floor((((42.0 * power * (atkStat / defStat)) / 50.0) + 2) *  critical * Math.floor((Math.random() * ((100.0 - 85.0) + 1.0)) + 85.0) / 100.0 * stab * type * burn * other);
      this.defender.hp -= damage;
      
      System.out.println(this.defender.name + " took " + damage + " damage!\n" + this.defender.name + " is at " + this.defender.hp + " HP!");
      this.attacker.hp -= (damage / 3);
      System.out.println(this.attacker.name + " took " + (damage / 3) + " damage in recoil!\n" + this.attacker.name + " is at " + this.attacker.hp + " HP!");
    }
    public void vineWhip() {
      this.attacker.movePriority = 0;
      double power = 45.0;
      double stab = 1.0;
      double burn = 1.0;
      double accuracy = 100.0;
      double critChance = 0.0417;
      String typeOfMove = "grass";
      String moveType = "physical";
      String moveName = "Vine Whip";
      int atkStat = 0;
      int defStat = 0;
      if (moveType.equals("physical")) {
        atkStat = this.attacker.attack;
        defStat = this.defender.defense;
      } else if (moveType.equals("special")) {
        atkStat = this.attacker.spAtk;
        defStat = this.defender.spDef;
      }
      if (this.attacker.condition == 1) {
        burn = 0.5;
      }
      System.out.println(this.attacker.name + " used " + moveName + "!");
      double critical = 1.0;
      if (Math.random() <= critChance) {
        critical = 1.5;
        System.out.println("Critical Hit!");
      }
      //calculate type multipliers
      if (this.attacker.type1.equals(typeOfMove) || this.attacker.type2.equals(typeOfMove)) {
        stab = 1.5;
      }
      double type = 1.0;
      if (this.defender.type1.equals("water") || this.defender.type1.equals("ground") || this.defender.type1.equals("rock")) {
        type *= 2;
      }
      if (this.defender.type2.equals("water") || this.defender.type2.equals("ground") || this.defender.type2.equals("rock")) {
        type *= 2.0;
      }
      if (this.defender.type1.equals("fire") || this.defender.type1.equals("grass") || this.defender.type1 == "poison" || this.defender.type1.equals("flying") || this.defender.type1.equals("bug") || this.defender.type1.equals("dragon") || this.defender.type1.equals("steel")) {
        type *= 0.5;
      }
      if (this.defender.type2.equals("fire") || this.defender.type2.equals("grass") || this.defender.type2 == "poison" || this.defender.type2.equals("flying") || this.defender.type2.equals("bug") || this.defender.type2.equals("dragon") || this.defender.type2.equals("steel")) {
        type *= 0.5;
      }
      if (type > 1.0){
        System.out.println("It's super effective!");
      } else if (type < 1.0 && type > 0.0) {
        System.out.println("It's not very effective....");
      } else if (type == 0.0) {
        System.out.println("It didn't affect " + defender.name + "....");
      }
      double other = 1.0;
      
      double random = Math.floor((Math.random() * ((100.0 - 85.0) + 1.0)) + 85.0) / 100.0;
      int damage = (int) Math.floor((((42.0 * power * (atkStat / defStat)) / 50.0) + 2) *  critical * Math.floor((Math.random() * ((100.0 - 85.0) + 1.0)) + 85.0) / 100.0 * stab * type * burn * other);
      this.defender.hp -= damage;
      
      System.out.println(this.defender.name + " took " + damage + " damage!\n" + this.defender.name + " is at " + this.defender.hp + " HP!");
    }
    public void waterShuriken() {
      this.attacker.movePriority = 1;
      double power = 45.0;
      double stab = 1.0;
      double burn = 1.0;
      double accuracy = 100.0;
      double critChance = 0.0417;
      String typeOfMove = "water";
      String moveName = "Water Shuriken";
      String moveType = "special";
      int atkStat = 0;
      int defStat = 0;
      if (moveType.equals("physical")) {
        atkStat = this.attacker.attack;
        defStat = this.defender.defense;
      } else if (moveType.equals("special")) {
        atkStat = this.attacker.spAtk;
        defStat = this.defender.spDef;
      }
      if (this.attacker.condition == 1) {
        burn = 0.5;
      }
      System.out.println(this.attacker.name + " used " + moveName + "!");
      //calculate type multipliers
      if (this.attacker.type1.equals(typeOfMove) || this.attacker.type2.equals(typeOfMove)) {
        stab = 1.5;
      }
      double type = 1.0;
      if (this.defender.type1.equals("water") || this.defender.type1.equals("ground") || this.defender.type1.equals("rock")) {
        type *= 2.0;
      }
      if (this.defender.type2.equals("water") || this.defender.type2.equals("ground") || this.defender.type2.equals("rock")) {
        type *= 0.5;
      }
      if (this.defender.type1.equals("water") || this.defender.type1.equals("grass") ||  this.defender.type1.equals("dragon")) {
        type *= 0.5;
      }
      if (this.defender.type2.equals("water") || this.defender.type2.equals("grass") || this.defender.type2.equals("dragon")) {
        type *= 0.5;
      }
      double random = 0;
      int damage = 0;
      double critical = 1.0;
      double other = 1.0;
      int totalDamage = 0;
      double abilityMultiplier = 1.0;
      if (this.attacker.hp <= (this.attacker.maxhp / 3) && this.attacker.ability.equals("torrent")) {
        other *= 3.0;
      }
      int hits = (int) (Math.random() * (6 - 2)) + 2;
      for (int i = 0; i < hits; i++) {
        random = Math.floor((Math.random() * ((100.0 - 85.0) + 1.0)) + 85.0) / 100.0;
        damage = (int) Math.floor((((42.0 * power * (atkStat / defStat)) / 50.0) + 2) *  critical * Math.floor((Math.random() * ((100.0 - 85.0) + 1.0)) + 85.0) / 100.0 * stab * type * burn * other);
        this.defender.hp -= damage;
        totalDamage += damage;
        if (Math.random() <= critChance) {
        critical = 1.5;
        System.out.println("Critical Hit!");
        critical = 1.0;
        }
      }
      if (type > 1.0) {
        System.out.println("It's super effective!");
      } else if (type < 1.0 && type > 0.0) {
        System.out.println("It's not very effective....");
      } else if (type == 0.0) {
        System.out.println("It didn't affect " + defender.name + "....");
      }
      System.out.println(this.defender.name + " took " + totalDamage + " damage!\n" + this.defender.name + " is at " + this.defender.hp + " HP!");
    }  
    //flare blitz can be used while frozen
    public void useAttack(String attack) {
      if (attack.equals(this.attacker.move1) || attack.equals(this.attacker.move2) || attack.equals(this.attacker.move3) || attack.equals(this.attacker.move4) && attack.equals("Double-Edge")) {
        this.doubleEdge();
      } else if (attack.equals(this.attacker.move1) || attack.equals(this.attacker.move2) || attack.equals(this.attacker.move3) || attack.equals(this.attacker.move4) && attack.equals("Vine Whip")) {
        this.vineWhip();
      } else if (attack.equals(this.attacker.move1) || attack.equals(this.attacker.move2) || attack.equals(this.attacker.move3) || attack.equals(this.attacker.move4) && attack.equals("Double-Edge")) {
        this.waterShuriken();
      }
    }
  }