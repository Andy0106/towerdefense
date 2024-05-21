package andy0106.games.towerdefense.enemy;

import andy0106.games.towerdefense.Main;
import andy0106.games.towerdefense.events.EventBus;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.utils.Disposable;

import java.util.ArrayList;
import java.util.HashSet;

public class EnemyManager implements Disposable {
    public HashSet<Enemy> enemies = new HashSet<>();
    private int global_counter = -1;
    private final EventBus event_bus;
    private final Main main;

    public EnemyManager(final Main main) {
        this.main = main;
        this.event_bus = this.main.event_bus;
    }

    public void update() {
        enemies.forEach(enemy -> enemy.update(main));
    }

    public void render(Batch batch) {
        enemies.forEach(enemy -> enemy.render(batch));
    }

    public Enemy newEnemy(EnemyData data, EnemyRenderProfile erp) {
        global_counter++;
        Enemy enemy = new Enemy(data);
        enemy.setCount(global_counter);
        enemy.setErp(erp);
        enemies.add(enemy);
        event_bus.onEnemyCreated(enemy);
        return enemy;
    }

    @Override
    public void dispose() {
        enemies.forEach(enemy -> enemy.dispose());
    }
}
