

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public abstract class GameObject {

	protected Vector2 position;
	protected Texture tex;
	protected float width, height;

	public GameObject(Vector2 position, Texture tex, float width, float height) {
		this.position = position;
		this.tex = tex;
		this.width = width;
		this.height = height;
	}

	public abstract void update(float delta);

	public Vector2 getPosition() {
		return position;
	}

	public Texture getTexture() {
		return tex;
	}

	public float getWidth() {
		return width;
	}

	public float getHeight() {
		return height;
	}

}
