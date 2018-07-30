package neevel.helicos.Gamestate;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import neevel.helicos.Gamestate.gameobjects.Player;

public class GameWorld { // Zuständig für Logik 
	
	private Player player; 

	public GameWorld() {
		player = new Player(200, 200, new Vector2(200, 200), new Texture(Gdx.files.internal("bac.png"))); 
	}

	public void update(float delta) {
		
	}

	public void dispose() {

	}
	public Player getPlayer() {
		return player; 
	}
}
