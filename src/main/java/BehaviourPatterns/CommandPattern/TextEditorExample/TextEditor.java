package BehaviourPatterns.CommandPattern.TextEditorExample;

import lombok.Getter;
import lombok.Setter;

// Receiver: who knows how to do the actual work
@Setter
@Getter
public class TextEditor {

    private String content;

    public TextEditor(){
        content = "";
    }

    public void AppendText(String text){
        content += text;
        System.out.println("Content: " + content);
    }

    public void DeleteFromTo(int startIndex, int endIndex){
        if (startIndex >= endIndex)
            return;
        content = content.substring(0, startIndex) + content.substring(endIndex);
    }

    public String DeleteText(int length){
        if (content.length() < length)
            length = content.length();
        var deletedText = content.substring(content.length() - length);
        content = content.substring(0, content.length() - length);
        System.out.println("Content: "+ content);
        return deletedText;
    }

}
