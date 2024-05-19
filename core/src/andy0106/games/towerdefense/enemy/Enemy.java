package andy0106.games.towerdefense.enemy;

import andy0106.games.towerdefense.Main;
import andy0106.games.towerdefense.events.Events;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Disposable;

public class Enemy extends Events implements Disposable {
    public EnemyData data;
    public Vector2 pos = new Vector2();
    public EnemyRenderProfile erp;
    public int count;
    public Vector2 getCentral() {
        return new Vector2(data.hitbox_size.x/2f, data.hitbox_size.y/2f).add(pos);
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

    }
}
