package neevel.helicos.Gamestate;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;

public class GameControls extends InputAdapter {
	private GameState gameState; 
	private GameWorld gameWorld; 

	public GameControls(GameState gameState, GameWorld gameWorld) {
		this.gameState = gameState; 
		this.gameWorld = gameWorld; 
		
	}

	@Override
	public boolean keyDown(int key) {
		if(key == Input.Keys.A) {
			System.out.println("Fuck Yeah");
			gameWorld.getPlayer().moveLeft();
		}
		return false;
	}


	

	@Override
	public boolean keyUp(int key) {
		
		return false;
	}

	

}
