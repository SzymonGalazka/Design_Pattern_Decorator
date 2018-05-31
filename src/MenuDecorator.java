import java.util.Scanner;

public class MenuDecorator {

    Text text;
    PTextDecorator pTextDecorator;

    public MenuDecorator() {
        getInput();
    }

    public void getInput() {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj slowo do otagowania: ");
        String plainText = input.nextLine();
        text = new PlainText(plainText);
    }

    public void showMenu(){
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Wybierz tagi, naciśnij 5 by wypisać");
            System.out.println("-------------------------");
            System.out.println("1 - <p>");
            System.out.println("2 - <em>");
            System.out.println("3 - <mark>");
            System.out.println("4 - <strong>");
            System.out.println("5 - wypisz");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    text = new PTextDecorator(text);
                    break;
                case 2:
                    text = new EmTextDecorator(text);
                    break;
                case 3:
                    text = new MarkTextDecorator(text);
                    break;
                case 4:
                    text = new StrongTextDecorator(text);
                    break;
                case 5:
                    text.write();
                    return;
                default:
            }
        }while(true);
    }

}
