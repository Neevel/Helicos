

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Main extends Game {

	private SpriteBatch batch;

	@Override
	public void create() {
		batch = new SpriteBatch();

		setScreen(new GameState());
	}

	@Override
	public void dispose() {
		batch.dispose();
	}

	public SpriteBatch getBatch() {
		return batch;
	}

}