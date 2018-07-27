package neevel.helicos.Gamestate;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import neevel.helicos.HelicosMain;

public class GameState implements Screen { // Screen = Zustand

	private SpriteBatch batch;
	private Texture tex;

	@Override
	public void show() { // wie Konstruktor
		batch = ((HelicosMain) Gdx.app.getApplicationListener()).getBatch();
		tex = new Texture(Gdx.files.internal("bac.png"));
	}

	@Override
	public void render(float delta) { // ( GameLoop ) default 60 mal die sekunde (google)
		Gdx.gl20.glClearColor(0.400f, 0, 0, 0);
		Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin(); // hier starten wir das zeichnen	
			//batch.draw(tex, 200, 200, 200, 200);
		batch.end();
	}

	@Override
	public void dispose() { // objekte entfernen / löschen

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

	}

	@Override
	public void resume() { // Spielstand laden

	}

}
