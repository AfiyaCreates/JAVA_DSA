//understand this class ache se***

public class niceCar {
    private Engine engine;
    private Media player=new CDplayer();

    public niceCar() {
        engine = new powerEngine(); // by default we set the engine as power engine
    }

    public void upgrade() {
        this.engine =new  electricEngine(); //if specified otherwise it treats both engine separately (poerengine and electrric engine)
    }


    public void start(){
        engine.start(); //this calls the start function of engine(Engine)
    }
    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        player.start(); //this calls the start function of player(Media)
    }
    public void stopMusic(){
        player.stop();
    }
}
