package andy0106.games.towerdefense.events;

import andy0106.games.towerdefense.enemy.Enemy;
import andy0106.games.towerdefense.tower.Tower;

public interface EventImpl {
    void onTowerCreated(Tower tower);
    void onEnemyCreated(Enemy enemy);
    void onEnemyInAC(Tower tower, Enemy enemy);
}
