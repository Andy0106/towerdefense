package andy0106.games.towerdefense.tower;

import com.badlogic.gdx.math.Vector2;

public class TowerData {
    public String tower_name;
    public int physical_dp;
    public int magical_dp;
    public int physical_defense;
    public int magical_defense;
    public float attack_speed;
    public int level = 0;//zero is the default
    public int attack_range;
    public Vector2 hitbox_size;

    public Vector2 getHitbox_size() {
        return hitbox_size;
    }

    public void setHitbox_size(Vector2 hitbox_size) {
        this.hitbox_size = hitbox_size;
    }

    public int getAttack_range() {
        return attack_range;
    }

    public void setAttack_range(int attack_range) {
        this.attack_range = attack_range;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public TowerData(String tower_name, int physical_dp, int magical_dp, int physical_defense, int magical_defense, float attack_speed, int attack_range, Vector2 hitbox_size) {
        this.tower_name = tower_name;
        this.physical_dp = physical_dp;
        this.magical_dp = magical_dp;
        this.physical_defense = physical_defense;
        this.magical_defense = magical_defense;
        this.attack_speed = attack_speed;
        this.attack_range = attack_range;
        this.hitbox_size = hitbox_size;
    }

    public TowerData() {}

    public String getTower_name() {
        return tower_name;
    }

    public void setTower_name(String tower_name) {
        this.tower_name = tower_name;
    }

    public int getPhysical_dp() {
        return physical_dp;
    }

    public void setPhysical_dp(int physical_dp) {
        this.physical_dp = physical_dp;
    }

    public int getMagical_dp() {
        return magical_dp;
    }

    public void setMagical_dp(int magical_dp) {
        this.magical_dp = magical_dp;
    }

    public int getPhysical_defense() {
        return physical_defense;
    }

    public void setPhysical_defense(int physical_defense) {
        this.physical_defense = physical_defense;
    }

    public int getMagical_defense() {
        return magical_defense;
    }

    public void setMagical_defense(int magical_defense) {
        this.magical_defense = magical_defense;
    }

    public float getAttack_speed() {
        return attack_speed;
    }

    public void setAttack_speed(float attack_speed) {
        this.attack_speed = attack_speed;
    }
}
