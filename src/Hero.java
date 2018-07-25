

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;



public class Hero extends GameObject {

	private float speed;

	public Hero(Vector2 position, Texture tex, float width, float height) {
		super(position, tex, width, height);
		speed = 10;
	}

	@Override
	public void update(float delta) {
		if (Gdx.input.isKeyPressed(Input.Keys.W)) {
			if(position.y + speed * delta < Constants.VIRTUAL_HEIGHT - height) {
				position.y += speed * delta;
			}
		}
		if (Gdx.input.isKeyPressed(Input.Keys.S)) {
			if(position.y - speed * delta > 0) {
				position.y -= speed * delta;
			}
		}
		if (Gdx.input.isKeyPressed(Input.Keys.A)) {
			if(position.x - speed * delta > 0) {
				position.x -= speed * delta;
			}
		}
		if (Gdx.input.isKeyPressed(Input.Keys.D)) {
			if(position.x + speed * delta < Constants.VIRTUAL_WIDTH - width) {
				position.x += speed * delta;
			}
		}
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

}