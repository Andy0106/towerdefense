package andy0106.games.towerdefense.enemy;

import com.badlogic.gdx.math.Vector2;

public class EnemyData {
    public int max_health;
    public int health;
    public int physical_dp;
    public int magical_dp;
    public int physical_defense;
    public int magical_defense;
    public float attack_speed;
    public int enemy_tag;
    public int speed;
    public Vector2 hitbox_size;

    public EnemyData(int max_health, int physical_dp, int magical_dp, int physical_defense, int magical_defense, float attack_speed, int enemy_tag, int speed, Vector2 hitbox_size) {
        this.max_health = max_health;
        this.health = this.max_health;
        this.physical_dp = physical_dp;
        this.magical_dp = magical_dp;
        this.physical_defense = physical_defense;
        this.magical_defense = magical_defense;
        this.attack_speed = attack_speed;
        this.enemy_tag = enemy_tag;
        this.speed = speed;
        this.hitbox_size = hitbox_size;
    }

    public int getMax_health() {
        return max_health;
    }

    public void setMax_health(int max_health) {
        this.max_health = max_health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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

    public int getEnemy_tag() {
        return enemy_tag;
    }

    public void setEnemy_tag(int enemy_tag) {
        this.enemy_tag = enemy_tag;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
