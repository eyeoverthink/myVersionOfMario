package components;

import jade.Camera;
import jade.GameObject;
import jade.Jarvis;
import jade.Window;
import org.joml.Vector2f;
import org.joml.Vector4f;


public class GameCamera extends Component {
    private transient GameObject player;

    public Vector2f myLock = new Vector2f(0, 0);

    private transient Camera gameCamera;
    private transient float highestX = Float.MIN_VALUE;

    private transient float highestY = Float.MIN_VALUE;

    private transient float abovegroundYLevel = Window.getHeight();
    private transient float undergroundYLevel = (abovegroundYLevel * 2) - abovegroundYLevel;
    private transient float skyYLevel = (abovegroundYLevel * 2);


    private transient float cameraBuffer = 1.5f;
    private transient float playerBuffer = 0.25f;
    public Jarvis jarvis = new Jarvis("this");


    private Vector4f skyColor = new Vector4f(92.0f / 255.0f, 148.0f / 255.0f, 252.0f / 255.0f, 1.0f);
    private Vector4f nightColor = new Vector4f(-92.0f / -255.0f, -148.0f / -255.0f, -252.0f / -255.0f, 1.0f);
    private Vector4f undergroundColor = new Vector4f(0, 0, 0, 1);
    private Vector4f nightTimeUpperLevel = new Vector4f(0, 0, 0, 1);

    public GameCamera(Camera gameCamera) {
        this.gameCamera = gameCamera;



    }

    @Override
    public void start() {
        this.player = Window.getScene().getGameObjectWith(PlayerController.class);
        this.gameCamera.clearColor.set(skyColor);
        this.undergroundYLevel = this.gameCamera.position.y -
                this.gameCamera.getProjectionSize().y - this.cameraBuffer;

        this.undergroundYLevel = this.gameCamera.position.y -
                this.gameCamera.getProjectionSize().y - this.cameraBuffer;




    }



    @Override
    public void update(float dt) {
        if (player != null && !player.getComponent(PlayerController.class).hasWon()) {

 /*           Vector2f myPos = new Vector2f(0, 0);
            Vector2f myLock = new Vector2f(0, 0);
            myLock.x = gameCamera.position.x = player.transform.position.x - 2.5f;
            myLock.y =  gameCamera.position.y = player.transform.position.y - 1.5f;*/
 /*           myLock.x = gameCamera.position.x = player.transform.position.x - 2.5f;
            myLock.y =  gameCamera.position.y = player.transform.position.y - 1.5f;*/


            myLock.x = gameCamera.position.x = player.transform.position.x - 2.5f;
            myLock.y =  gameCamera.position.y = player.transform.position.y - 1.5f;
            if (player.transform.position.y < -playerBuffer) {
               this.gameCamera.position.y = undergroundYLevel;
                
                this.gameCamera.clearColor.set(undergroundColor);
            } else {
                this.gameCamera.clearColor.set(skyColor);
            }
/*            gameCamera.position.x = Math.max(player.transform.position.x - 2.5f, highestX);
            highestX = Math.max(highestX, gameCamera.position.x);

*//*            gameCamera.position.y = Math.max(player.transform.position.y, highestY);
            highestY = Math.max(highestY, gameCamera.position.y);*//*
            if (player.transform.position.y < -playerBuffer) {
                this.gameCamera.position.y = undergroundYLevel;
                this.gameCamera.clearColor.set(undergroundColor);
            } if (player.transform.position.y >= 300) {
            gameCamera.position.y = player.transform.position.y;
            //highestY = Math.max(highestY, gameCamera.position.y);
            }*/

        }
    }
}
