
public class PlainText extends Text {

    String text;
    public PlainText(String text) {
        this.text = text;
    }

    @Override
    public void write() {
        System.out.print(text);
    }


}
