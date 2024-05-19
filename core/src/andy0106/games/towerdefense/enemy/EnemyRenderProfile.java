package andy0106.games.towerdefense.enemy;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class EnemyRenderProfile {
    Texture texture;
    Vector2 pos;

    public Texture getTexture() {
        return texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public Vector2 getPos() {
        return pos;
    }

    public EnemyRenderProfile(Texture texture, Vector2 pos) {
        this.texture = texture;
        this.pos = pos;
    }

    public void setPos(Vector2 pos) {
        this.pos = pos;
    }
}
