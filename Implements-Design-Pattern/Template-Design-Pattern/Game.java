public abstract class Game {

    public abstract void initilize();
    public abstract void startPlay();
    public abstract void endPlay();
    
    public final void play(){
        initilize();
        startPlay();
        endPlay();
    }
}
