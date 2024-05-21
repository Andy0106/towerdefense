package andy0106.games.towerdefense;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;

public class KeyProcessor implements InputProcessor {
    private Movable target;

    public KeyProcessor(Movable target) {
        this.target = target;
    }

    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Input.Keys.W) {
            target.up();
        } else if (keycode == Input.Keys.S) {
            target.down();
        }
        if (keycode == Input.Keys.A) {
            target.left();
        } else if (keycode == Input.Keys.D) {
            target.right();
        }
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        if (keycode == Input.Keys.W) {
            target.up();
        } else if (keycode == Input.Keys.S) {
            target.down();
        }
        if (keycode == Input.Keys.A) {
            target.left();
        } else if (keycode == Input.Keys.D) {
            target.right();
        }
        return true;
    }

    @Override
    public boolean keyTyped(char character) {

        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        return false;
    }
}
