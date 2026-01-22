package BehaviourPatterns.CommandPattern.RemoteControlExample;

// Concrete Command
public class TVOnCommand implements ICommand {

    private TV tv;

    public TVOnCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void Execute() {
        tv.on();
    }

    @Override
    public void Undo() {
        tv.off();
    }
}
