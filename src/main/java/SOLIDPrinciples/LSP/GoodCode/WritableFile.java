package SOLIDPrinciples.LSP.GoodCode;

public class WritableFile extends ReadableFile implements IWritable {

    @Override
    public void write() {
        System.out.println("Writing to a file ...");
    }
}
