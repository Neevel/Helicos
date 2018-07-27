package neevel.helicos;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import neevel.helicos.Gamestate.GameState;

public class HelicosMain extends Game { // Game ist ein ApplicationLiestener
	private SpriteBatch batch; // möglichst nur ein objekt davon erstellen pro programm 

	@Override
	public void create() {
		batch = new SpriteBatch(); 
		setScreen(new GameState()); // aktiven Screen setzen (Screen = State) 
		
	}
	
	@Override
	public void dispose() {
		batch.dispose(); 
	}
	
	public SpriteBatch getBatch() {
		return batch; 
	}
	
}
