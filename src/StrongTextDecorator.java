public class StrongTextDecorator extends TextDecorator {

    private String prefix="<strong>", postfix="</strong>";

    public StrongTextDecorator(Text text) {
        super(text);
    }


    @Override
    public void write() {
        System.out.print(prefix);
        super.write();
        System.out.print(postfix);
    }
}
