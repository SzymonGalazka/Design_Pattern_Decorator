public class MarkTextDecorator extends TextDecorator {

    private String prefix="<mark>", postfix="</mark>";

    public MarkTextDecorator(Text text) {
        super(text);
    }


    @Override
    public void write() {
        System.out.print(prefix);
        super.write();
        System.out.print(postfix);
    }
}
