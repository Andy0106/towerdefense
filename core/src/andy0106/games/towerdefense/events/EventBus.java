package andy0106.games.towerdefense.events;

import andy0106.games.towerdefense.enemy.Enemy;
import andy0106.games.towerdefense.tower.Tower;

import java.util.ArrayList;

public class EventBus extends Events {
    private final ArrayList<Events> callables = new ArrayList<>();

    public void register(Events callable) {
        callables.add(callable);
    }

    @Override
    public void onTowerCreated(Tower tower) {
        callables.forEach(callable -> callable.onTowerCreated(tower));
    }

    @Override
    public void onEnemyCreated(Enemy enemy) {
        callables.forEach(callable -> callable.onEnemyCreated(enemy));
    }

    @Override
    public void onEnemyInAC(Tower tower, Enemy enemy) {
        callables.forEach(callable -> callable.onEnemyInAC(tower, enemy));
    }
}
