public class CDplayer implements Media {

    @Override
    public void start() {
        System.out.println("i start media ");
    }

    @Override
    public void stop(){
        System.out.println("i stop media ");
    }

}
