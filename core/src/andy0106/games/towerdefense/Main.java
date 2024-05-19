package andy0106.games.towerdefense;

import andy0106.games.towerdefense.enemy.Enemy;
import andy0106.games.towerdefense.enemy.EnemyData;
import andy0106.games.towerdefense.enemy.EnemyManager;
import andy0106.games.towerdefense.enemy.EnemyRenderProfile;
import andy0106.games.towerdefense.events.EventBus;
import andy0106.games.towerdefense.events.EventImpl;
import andy0106.games.towerdefense.events.Events;
import andy0106.games.towerdefense.tower.Tower;
import andy0106.games.towerdefense.tower.TowerData;
import andy0106.games.towerdefense.tower.TowerManager;
import andy0106.games.towerdefense.tower.TowerRenderProfile;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;

public class Main extends Events implements ApplicationListener, Runnable {

	public TowerManager tower_manager;
	public EnemyManager enemy_manager;
	public SpriteBatch batch;
	public final EventBus event_bus = new EventBus();
	public Thread update_thread;

	@Override
	public void create () {
		event_bus.register(this);
		tower_manager = new TowerManager(this);
		enemy_manager = new EnemyManager(this);
		batch = new SpriteBatch();

		update_thread = new Thread(this);
		update_thread.setDaemon(true);
		update_thread.start();

		TowerData tdata = new TowerData("MyTower", 50, 20, 10, 4, 1f, 200, new Vector2(10, 10));
		TowerRenderProfile trp = new TowerRenderProfile(new Texture("tower.png"), new Vector2(0, 0));
		Tower my_tower = tower_manager.newTower(tdata, trp);
		my_tower.setPos(new Vector2(0f, 0f));

		EnemyData edata = new EnemyData(100, 10, 5, 10, 5, 1f, 0, 10, new Vector2(10, 10));
		EnemyRenderProfile erp = new EnemyRenderProfile(new Texture("tower.png"), new Vector2(0, 0));
		Enemy my_enemy = enemy_manager.newEnemy(edata, erp);
		my_enemy.pos.set(10f, 10f);
	}

	@Override
	public void resize(int width, int height) {}

	@Override
	public void run() {
		long time;
		while (true) {
			time = System.currentTimeMillis();
			update();
			while (System.currentTimeMillis() <= time+50);
		}
	}

	public void update() {
		tower_manager.update();
		enemy_manager.update();
	}

	@Override
	public void render () {
		ScreenUtils.clear(0.4f, 0.8f, 1, 1);
		batch.begin();
		tower_manager.render(batch);
		enemy_manager.render(batch);
		batch.end();
	}

	@Override
	public void pause() {}

	@Override
	public void resume() {}

	@Override
	public void dispose () {
		tower_manager.dispose();
		enemy_manager.dispose();
		batch.dispose();
	}

	@Override
	public void onTowerCreated(Tower tower) {
		System.out.println("TowerCreated: name=" + tower.data.tower_name);
	}

	@Override
	public void onEnemyInAC(Tower tower, Enemy enemy) {
	}
}