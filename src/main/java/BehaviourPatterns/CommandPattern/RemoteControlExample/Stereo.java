package BehaviourPatterns.CommandPattern.RemoteControlExample;

// Receiver - who knows how to do the actual work
public class Stereo {

    private int volume;

    public Stereo(){
        this.volume = 0;
    }

    public void increaseVolume(){
        this.volume++;
        System.out.println("Volume is increased! now: " + this.volume);
    }

    public void decreaseVolume(){
        if (this.volume <= 0)
            volume = 0;
        this.volume--;
        System.out.println("Volume is decreased! now: " + this.volume);

    }

    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("Volume is set to: " + this.volume);
    }

    public int getVolume(){
        return this.volume;
    }

}
