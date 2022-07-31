package scenes;

import components.GameCamera;
import components.SpriteRenderer;
import components.Spritesheet;
import components.StateMachine;
import jade.GameObject;
import jade.Transform;
import org.joml.Vector2f;

import physics2d.physics2dtmp.PhysicsSystem2D;
import physics2d.physics2dtmp.rigidbody.Rigidbody2D;
import util.AssetPool;

public class LevelSceneInitializer extends SceneInitializer {
    private Spritesheet sprites, city_sprites, stairs;

    public LevelSceneInitializer() {


    }

    @Override
    public void init(Scene scene) {
        sprites = AssetPool.getSpritesheet("tilemap_packed.png");
        city_sprites = AssetPool.getSpritesheet("tilemap_packed.png");
        stairs =  AssetPool.getSpritesheet("assets/tiles/Side City Scapes/stairsStoneRound.png");

        GameObject cameraObject = scene.createGameObject("GameCamera");
        cameraObject.addComponent(new GameCamera(scene.camera()));
        cameraObject.start();
        scene.addGameObjectToScene(cameraObject);



    }

    @Override
    public void loadResources(Scene scene) {

        AssetPool.addSpritesheet("assets/tiles/Side City Scapes/stairsStoneRound.png",
                new Spritesheet(AssetPool.getTexture("assets/tiles/Side City Scapes/stairsStoneRound.png"),
                        55, 91, 1, 0));
        AssetPool.getShader("assets/shaders/default.glsl");

        AssetPool.addSpritesheet("assets/tilemap_packed.png",
                new Spritesheet(AssetPool.getTexture("assets/tilemap_packed.png"),
                        16, 16, 486, 0));


        AssetPool.addSpritesheet("assets/images/turtle.png",
                new Spritesheet(AssetPool.getTexture("assets/images/turtle.png"),
                        16, 24, 4, 0));
        AssetPool.addSpritesheet("assets/images/bigSpritesheet.png",
                new Spritesheet(AssetPool.getTexture("assets/images/bigSpritesheet.png"),
                        16, 32, 42, 0));
        AssetPool.addSpritesheet("assets/images/pipes.png",
                new Spritesheet(AssetPool.getTexture("assets/images/pipes.png"),
                        32, 32, 4, 0));
        AssetPool.addSpritesheet("assets/images/items.png",
                new Spritesheet(AssetPool.getTexture("assets/images/items.png"),
                        16, 16, 43, 0));
        AssetPool.addSpritesheet("assets/images/gizmos.png",
                new Spritesheet(AssetPool.getTexture("assets/images/gizmos.png"),
                        24, 48, 3, 0));
        AssetPool.getTexture("assets/images/blendImage2.png");

        AssetPool.addSound("assets/sounds/main-theme-overworld.ogg", true);
        AssetPool.addSound("assets/sounds/flagpole.ogg", false);
        AssetPool.addSound("assets/sounds/break_block.ogg", false);
        AssetPool.addSound("assets/sounds/bump.ogg", false);
        AssetPool.addSound("assets/sounds/coin.ogg", false);
        AssetPool.addSound("assets/sounds/gameover.ogg", false);
        AssetPool.addSound("assets/sounds/jump-small.ogg", false);
        AssetPool.addSound("assets/sounds/mario_die.ogg", false);
        AssetPool.addSound("assets/sounds/pipe.ogg", false);
        AssetPool.addSound("assets/sounds/powerup.ogg", false);
        AssetPool.addSound("assets/sounds/powerup_appears.ogg", false);
        AssetPool.addSound("assets/sounds/stage_clear.ogg", false);
        AssetPool.addSound("assets/sounds/stomp.ogg", false);
        AssetPool.addSound("assets/sounds/kick.ogg", false);
        AssetPool.addSound("assets/sounds/invincible.ogg", false);

        for (GameObject g : scene.getGameObjects()) {
            if (g.getComponent(SpriteRenderer.class) != null) {
                SpriteRenderer spr = g.getComponent(SpriteRenderer.class);
                if (spr.getTexture() != null) {
                    spr.setTexture(AssetPool.getTexture(spr.getTexture().getFilepath()));
                }
            }

            if (g.getComponent(StateMachine.class) != null) {
                StateMachine stateMachine = g.getComponent(StateMachine.class);
                stateMachine.refreshTextures();
            }
        }
    }

    @Override
    public void imgui() {


    }
}
