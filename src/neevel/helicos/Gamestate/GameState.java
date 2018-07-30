package neevel.helicos.Gamestate;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;

public class GameState implements Screen { // Screen = Zustand

	private GameWorld gameWorld; 
	private GameRenderer gameRenderer; 
	private GameControls gameControls; 
	

	@Override
	public void show() { // wie Konstruktor
		gameWorld = new GameWorld(); 
		gameRenderer = new GameRenderer(gameWorld); 
		gameControls = new GameControls(this, gameWorld); 
		Gdx.input.setInputProcessor(gameControls);
		
		
	}
	// GameLoop: Spielobjekte aktualisieren, SpielObjekte Zeichnen, Interpolieren
	@Override
	public void render(float delta) { // ( GameLoop ) default 60 mal die sekunde (google)
		// Trennen von Logik und Zeichnen / Darstellung ( Logik in GameWorld) 
		gameWorld.update(delta);
		gameRenderer.render(delta);
		
	}

	@Override
	public void dispose() { // objekte entfernen / löschen
		gameWorld.dispose();
		gameRenderer.dispose();
	}

	@Override
	public void hide() { // spiel versteckt / faife ist schuld*
		dispose();
	}

	@Override
	public void pause() { // Spielstand speichern

	}

	@Override
	public void resize(int width, int height) { // Fenstergröße verändert
		gameRenderer.resize(width, height); // resize geht uns nichts an, geht an die GamerRenderer weiter
		
	}

	@Override
	public void resume() { // Spielstand laden

	}

}
