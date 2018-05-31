public class EmTextDecorator extends TextDecorator {

    private String prefix="<em>", postfix="</em>";

    public EmTextDecorator(Text text) {
        super(text);
    }


    @Override
    public void write() {
        System.out.print(prefix);
        super.write();
        System.out.print(postfix);
    }
}
