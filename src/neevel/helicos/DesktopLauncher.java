package neevel.helicos;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import neevel.helicos.utils.Constants;

public class DesktopLauncher {
	public static void main(String[] args) { // lwjgl ermöglicht zugriff auf openGL / libGdx wrapper über lwjgl
		
		//openGL kontext kreieren 
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration(); 
		cfg.title = Constants.TITLE; 
		cfg.width = Constants.WIDTH; 
		cfg.height = Constants.HEIGHT; 
		cfg.resizable = Constants.RESIZABLE; 
		
		new LwjglApplication(new HelicosMain(), cfg); 
	}
	
}
