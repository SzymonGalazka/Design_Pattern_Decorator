public class PTextDecorator extends TextDecorator {

    private String prefix="<p>", postfix="</p>";

    public PTextDecorator(Text text) {
        super(text);
    }


    @Override
    public void write() {
        System.out.print(prefix);
        super.write();
        System.out.print(postfix);
    }
}
