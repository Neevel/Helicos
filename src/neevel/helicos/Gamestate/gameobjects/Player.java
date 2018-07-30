package neevel.helicos.Gamestate.gameobjects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class Player {

	private Texture test; // test wird durch ANIMATION CLASS ersetzt
	private float width;
	private float height;
	private Vector2 position;

	
	public Player(float width, float height, Vector2 position, Texture test) {
		this.width = width;
		this.height = height;
		this.position = position;
		this.test = test;
	}

	public void update(float delta) {
		
	}
	public Texture getTest() {
		return test;
	}

	public float getWidth() {
		return width;
	}

	public float getHeight() {
		return height;
	}

	public Vector2 getPosition() {
		return position;
	}


}
