abstract class TextDecorator extends Text {

    public Text text;


    public TextDecorator(Text text) {
        this.text = text;
    }

    @Override
    public void write() {
        text.write();
    }
}
