package andy0106.games.towerdefense.tower;

import andy0106.games.towerdefense.Main;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Disposable;

public class Tower implements Disposable {
    public TowerData data;
    private Vector2 pos = new Vector2();
    public TowerRenderProfile trp;
    public int count;
    public Circle attack_circle;
    public ShapeRenderer shapeRenderer = new ShapeRenderer();

    public Tower(TowerData data) {
        this.data = data;
        this.attack_circle = new Circle(getCentral(), this.data.attack_range);
    }

    public void render(Batch batch) {
        batch.draw(trp.texture, pos.x+trp.pos.x, pos.y+trp.pos.y);
        /*shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
        shapeRenderer.circle(attack_circle.x, attack_circle.y, attack_circle.radius);
        shapeRenderer.end();*/
    }

    public Vector2 getCentral() {
        return new Vector2(data.hitbox_size.x/2f, data.hitbox_size.y/2f).add(pos);
    }

    public Vector2 getPos() {
        return pos;
    }

    public void setPos(Vector2 pos) {
        this.pos = pos;
        attack_circle.setPosition(getCentral());
    }

    public TowerData getData() {
        return data;
    }

    public void setData(TowerData data) {
        this.data = data;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public TowerRenderProfile getTrp() {
        return trp;
    }

    public void setTrp(TowerRenderProfile trp) {
        this.trp = trp;
    }

    @Override
    public void dispose() {
        trp.texture.dispose();
    }

    public void update(final Main main) {
        main.enemy_manager.enemies.forEach(enemy -> {
            //System.out.println(enemy.getCentral());
            //System.out.println(new Vector2(attack_circle.x, attack_circle.y));
            if (attack_circle.contains(enemy.getCentral())) {
                main.event_bus.onEnemyInAC(this, enemy);
            }
        });
    }
}
