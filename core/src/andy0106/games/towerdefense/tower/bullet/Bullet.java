package andy0106.games.towerdefense.tower.bullet;

import andy0106.games.towerdefense.enemy.Enemy;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public class Bullet {
    public Rectangle hitbox;
    public Texture texture;
    public Enemy target;

    public Bullet(Vector2 pos, Enemy target, Texture texture) {
        this.hitbox = new Rectangle(pos.x, pos.y, texture.getWidth(), texture.getHeight());
        this.texture = texture;
        this.target = target;
    }

    public void update() {
    }

    public void render(Batch batch) {
        batch.draw(texture, hitbox.x, hitbox.y);
    }
}
