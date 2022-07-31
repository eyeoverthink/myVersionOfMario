package jade;

import components.Component;
import components.PlayerController;
import components.Sprite;
import components.Spritesheet;
import observers.Observer;
import observers.events.Event;
import physics2d.Physics2D;
import physics2d.RaycastInfo;
import scenes.LevelEditorSceneInitializer;
import scenes.LevelSceneInitializer;
import scenes.Scene;
import scenes.SceneInitializer;
import util.AssetPool;
import util.JMath;

public class Jarvis extends GameObject {
    public Camera camera;
    public GameObject gameObject;
    public KeyListener keyListener;
    public MouseListener mouseListener;
    public Prefabs prefabs;
    public  Sound sound;
    public Window window;
    public Physics2D physics2D;
    public Event event;
    public Observer observer;
    public Direction direction;
    public RaycastInfo raycastInfo;
    public LevelEditorSceneInitializer levelEditorSceneInitializer;
    public LevelSceneInitializer levelSceneInitializer;
    public Scene scene;
    public SceneInitializer sceneInitializer;
    public AssetPool assetPool;
    public JMath jMath;
    public Component component;
    public Spritesheet spritesheet;
    public Sprite sprite;
    public PlayerController playerController;

    public Jarvis(String name) {
        super(name);
    }



    public Camera getCamera() {
        return camera;
    }

    public GameObject getGameObject() {
        return gameObject;
    }

    public KeyListener getKeyListener() {
        return keyListener;
    }

    public MouseListener getMouseListener() {
        return mouseListener;
    }

    public Prefabs getPrefabs() {
        return prefabs;
    }

    public Sound getSound() {
        return sound;
    }

    public Window getWindow() {
        return window;
    }

    public Physics2D getPhysics2D() {
        return physics2D;
    }

    public Event getEvent() {
        return event;
    }

    public Observer getObserver() {
        return observer;
    }

    public Direction getDirection() {
        return direction;
    }

    public RaycastInfo getRaycastInfo() {
        return raycastInfo;
    }

    public LevelEditorSceneInitializer getLevelEditorSceneInitializer() {
        return levelEditorSceneInitializer;
    }

    public LevelSceneInitializer getLevelSceneInitializer() {
        return levelSceneInitializer;
    }

    public Scene getScene() {
        return scene;
    }

    public SceneInitializer getSceneInitializer() {
        return sceneInitializer;
    }

    public AssetPool getAssetPool() {
        return assetPool;
    }

    public JMath getjMath() {
        return jMath;
    }

    public Component getComponent() {
        return component;
    }

    public Spritesheet getSpritesheet() {
        return spritesheet;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public PlayerController getPlayerController() {
        return playerController;
    }
}
