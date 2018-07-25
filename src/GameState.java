

import com.badlogic.gdx.ScreenAdapter;



public class GameState extends ScreenAdapter {

	private GameWorld gameWorld;
	private GameRenderer gameRenderer;

	@Override
	public void show() {
		gameWorld = new GameWorld();
		gameRenderer = new GameRenderer(gameWorld);
	}

	@Override
	public void render(float delta) {
		gameWorld.update(delta);
		gameRenderer.render(delta);
	}

	@Override
	public void resize(int width, int height) {
		gameRenderer.resize(width, height);
	}

	@Override
	public void dispose() {
		gameWorld.dispose();
		gameRenderer.dispose();
	}

	@Override
	public void hide() {
		dispose();
	}

}
