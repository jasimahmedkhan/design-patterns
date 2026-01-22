package BehaviourPatterns.CommandPattern.RemoteControlExample;

// Client
public class Main {

    static void main(String[] args) {
        TV tv = new TV();
        Stereo stereo = new Stereo();
        RemoteControl remote = new RemoteControl();

        remote.ExecuteCommand(new TVOnCommand(tv));
        remote.ExecuteCommand(new StereoVolumeCommand(stereo,30));

        remote.ExecuteCommand(new StereoVolumeCommand(stereo, 40));

        remote.Undo();

        remote.Undo();

    }
}
