package andy0106.games.towerdefense.events;

import andy0106.games.towerdefense.enemy.Enemy;
import andy0106.games.towerdefense.tower.Tower;

public class Events implements EventImpl {
    public void onTowerCreated(Tower tower){}
    public void onEnemyCreated(Enemy enemy){}

    @Override
    public void onEnemyInAC(Tower tower, Enemy enemy) {}
}
