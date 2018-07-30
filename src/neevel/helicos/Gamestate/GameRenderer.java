package neevel.helicos.Gamestate;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import neevel.helicos.HelicosMain;

public class GameRenderer { // Zuständig fürs zeichnen 

	private GameWorld gameWorld;
	private SpriteBatch batch; 

	public GameRenderer(GameWorld gameWorld) {
		this.gameWorld = gameWorld;
		batch = ((HelicosMain)Gdx.app.getApplicationListener()).getBatch(); 
	}

	public void render(float delta) {
		Gdx.gl20.glClearColor(0.5f, 0, 0, 0);
		Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		batch.begin();
		batch.draw(gameWorld.getPlayer().getTest(), gameWorld.getPlayer().getPosition().x, gameWorld.getPlayer().getPosition().y,
				gameWorld.getPlayer().getWidth(), gameWorld.getPlayer().getHeight()); 
		batch.end(); 
		System.out.println("render");
	}

	public void dispose() {
		
	}
	
	public void resize(int width, int height) {
		
	}
	
}
