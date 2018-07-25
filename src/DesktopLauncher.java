import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;



public class DesktopLauncher {
	public static void main(String[] arg) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();

		cfg.title = Constants.TITLE + " v" + Constants.VERSION;
		cfg.width = Constants.WIDTH;
		cfg.height = Constants.HEIGHT;

		new LwjglApplication(new Main(), cfg);
	}
}
