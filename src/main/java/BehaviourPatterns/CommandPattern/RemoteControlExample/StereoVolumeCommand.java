package BehaviourPatterns.CommandPattern.RemoteControlExample;

public class StereoVolumeCommand implements ICommand{

    private Stereo stereo;
    private int newVolume;
    private int oldVolume;

    public StereoVolumeCommand(Stereo stereo, int volume){
        this.stereo = stereo;
        this.newVolume = volume;
    }


    @Override
    public void Execute() {
        oldVolume = stereo.getVolume();
        stereo.setVolume(newVolume);
    }

    @Override
    public void Undo() {
        stereo.setVolume(oldVolume);
    }
}
