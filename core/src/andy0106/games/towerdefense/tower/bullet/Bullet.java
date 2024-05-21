package andy0106.games.towerdefense.tower.bullet;

import andy0106.games.towerdefense.Main;
import andy0106.games.towerdefense.enemy.Enemy;
import andy0106.games.towerdefense.tower.Tower;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Bullet {
    public Rectangle hitbox;
    public Texture texture;// = new Texture("bomb.png");
    public Enemy target;
    public float speed = 10;
    public Tower parent_tower;

    public Bullet(Vector2 pos, Enemy target, Texture texture, Tower from) {
        this.hitbox = new Rectangle(pos.x, pos.y, texture.getWidth(), texture.getHeight());
        this.texture = texture;
        this.target = target;
        this.parent_tower = from;
    }

    public void update(final Main main) {
        if (hitbox.contains(target.getCentral())) {
            this.parent_tower.magazine.remove(this);
            target.targeted = false;
            target.data.health -= (parent_tower.data.physical_dp - target.data.physical_defense);// + (parent_tower.data.magical_dp - target.data.magical_defense);
        } else {
            float Xdis = target.pos.x - hitbox.x;
            float Ydis = target.pos.y - hitbox.y;
            double distance = Math.sqrt(Math.pow((Xdis), 2) + Math.pow((Ydis), 2));
            hitbox.x += speed * ((Xdis) / distance);
            hitbox.y += speed * ((Ydis) / distance);
        }
    }

    public void render(Batch batch) {
        batch.draw(texture, hitbox.x, hitbox.y);
    }
}
