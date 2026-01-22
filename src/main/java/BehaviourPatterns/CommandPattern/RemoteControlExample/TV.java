package BehaviourPatterns.CommandPattern.RemoteControlExample;

// Receiver - who knows how to do the actual work
public class TV {

    private boolean state;

    public TV(){
        this.state = false;
    }

    public void on(){
        this.state = true;
        System.out.println("TV is ON");
    }

    public void off(){
        this.state = false;
        System.out.println("TV is OFF");
    }

}
