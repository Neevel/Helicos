

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;



public class GameWorld {

	private Hero hero;

	public GameWorld() {
		Texture tex = new Texture(Gdx.files.internal("Images/bac.gif"));

		hero = new Hero(new Vector2(5, 4), tex, 4, 7);
	}

	public void update(float delta) {
		hero.update(delta);
	}

	public void dispose() {

	}

	public Hero getHero() {
		return hero;
	}

}
