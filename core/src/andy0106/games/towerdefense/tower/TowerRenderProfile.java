package andy0106.games.towerdefense.tower;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class TowerRenderProfile {
    Texture texture;
    Vector2 pos;

    public Vector2 getPos() {
        return pos;
    }

    public void setPos(Vector2 pos) {
        this.pos = pos;
    }

    public TowerRenderProfile(Texture texture, Vector2 pos) {
        this.texture = texture;
        this.pos = pos;
    }

    public Texture getTexture() {
        return texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }
}
