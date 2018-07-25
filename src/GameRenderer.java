

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;



public class GameRenderer {

	private GameWorld gameWorld;
	private SpriteBatch batch;
	private Camera gameCam;
	private Viewport viewport;

	public GameRenderer(GameWorld gameWorld) {
		this.gameWorld = gameWorld;
		batch = ((Main) Gdx.app.getApplicationListener()).getBatch();
		if (Gdx.app.getType() == Application.ApplicationType.Desktop) {
			gameCam = new OrthographicCamera();
			viewport = new FitViewport(Constants.VIRTUAL_WIDTH, Constants.VIRTUAL_HEIGHT, gameCam);
		}
		if (Gdx.app.getType() == Application.ApplicationType.Android) {
			gameCam = new OrthographicCamera(Constants.VIRTUAL_WIDTH, Constants.VIRTUAL_HEIGHT);
			gameCam.position.set(gameCam.viewportWidth / 2, gameCam.viewportHeight / 2, 0);
		}

	}

	public void render(float delta) {
		Gdx.gl20.glClearColor(72 / 255f, 15 / 255f, 15 / 255f, 0);
		Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gameCam.update();

		batch.setProjectionMatrix(gameCam.combined);
		batch.begin();
		batch.draw(gameWorld.getHero().getTexture(), gameWorld.getHero().getPosition().x, gameWorld.getHero().getPosition().y, gameWorld.getHero().getWidth(), gameWorld.getHero().getHeight());
		batch.end();
	}

	public void resize(int width, int height) {
		if (Gdx.app.getType() == Application.ApplicationType.Desktop) {
			viewport.update(width, height, true);
		}
	}

	public void dispose() {
	}

}
