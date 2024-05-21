package andy0106.games.towerdefense.enemy;

import andy0106.games.towerdefense.Main;
import andy0106.games.towerdefense.Movable;
import andy0106.games.towerdefense.events.Events;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Disposable;

public class Enemy extends Events implements Disposable, Movable {
    public EnemyData data;
    public Vector2 pos = new Vector2();
    public EnemyRenderProfile erp;
    public boolean targeted;
    public int count;
    public boolean[] moving_flags = new boolean[4];
    public Vector2 getCentral() {
        return new Vector2(data.hitbox_size.x/2f, data.hitbox_size.y/2f).add(pos);
    }

    public boolean isTargeted() {
        return targeted;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Enemy(EnemyData data) {
        this.data = data;
    }

    public void render(Batch batch) {
        batch.draw(erp.texture, pos.x+erp.pos.x, pos.y+erp.pos.y);
    }

    public EnemyData getData() {
        return data;
    }

    public void setData(EnemyData data) {
        this.data = data;
    }

    public Vector2 getPos() {
        return pos;
    }

    public void setPos(Vector2 pos) {
        this.pos = pos;
    }

    public EnemyRenderProfile getErp() {
        return erp;
    }

    public void setErp(EnemyRenderProfile erp) {
        this.erp = erp;
    }

    @Override
    public void dispose() {
        erp.texture.dispose();
    }

    public void update(final Main main) {
        if (data.health <= 0) {
            main.enemy_manager.enemies.remove(this);
        }
        if (moving_flags[0]) this.pos.y += data.speed;
        else if (moving_flags[1]) this.pos.y -= data.speed;
        if (moving_flags[2]) this.pos.x -= data.speed;
        else if (moving_flags[3]) this.pos.x += data.speed;
    }

    @Override
    public void up() {
        moving_flags[0] = !moving_flags[0];
    }

    @Override
    public void down() {
        moving_flags[1] = !moving_flags[1];
    }

    @Override
    public void left() {
        moving_flags[2] = !moving_flags[2];
    }

    @Override
    public void right() {
        moving_flags[3] = !moving_flags[3];
    }
}
