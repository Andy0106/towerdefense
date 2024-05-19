package andy0106.games.towerdefense.tower;

import andy0106.games.towerdefense.Main;
import andy0106.games.towerdefense.events.EventBus;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.utils.Disposable;

import java.util.ArrayList;

public class TowerManager implements Disposable {
    public ArrayList<Tower> towers = new ArrayList<>();
    private int global_counter = -1;
    private final EventBus event_bus;
    private final Main main;

    public TowerManager(final Main main) {
        this.main = main;
        this.event_bus = this.main.event_bus;
    }

    public void update() {
        towers.forEach(tower -> tower.update(main));
    }

    public void render(Batch batch) {
        towers.forEach(tower -> tower.render(batch));
    }

    public Tower newTower(TowerData data, TowerRenderProfile trp) {
        global_counter++;
        Tower tower = new Tower(data);
        tower.setCount(global_counter);
        tower.setTrp(trp);
        towers.add(tower);
        event_bus.onTowerCreated(tower);
        return tower;
    }

    @Override
    public void dispose() {
        towers.forEach(tower -> tower.dispose());
    }
}
