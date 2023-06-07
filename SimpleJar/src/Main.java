import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        boolean error = false;
        if(args.length == 0) {
            System.out.println(
                    "Hey! I am first aplication Java.\n" +
                            "Run me with parametres \"help\" and I tell" +
                            "you"
            );
        } else if (args.length == 1) {
            if (args[0].equals("help")) {
                System.out.println(
                        "I can tell easy questions.\n" +
                                "For see my answer you must use\n" +
                                "-\"Hey!\"\n" +
                                "-\"What is up?\"\n" +
                                "-\"How you doing?\"\n" +
                                "-\"Why you do not sleep?\"\n" +
                                "-\"What you doing today afternoon?\"\n"
                );
            } else if (args[0].equals("Hey!")) {
                Calendar calendar = Calendar.getInstance();
                int hour = calendar.get(Calendar.HOUR_OF_DAY);
                if (hour < 12) {
                    System.out.println("Good morning!");
                } else if (hour >= 12 && hour <= 18) {
                    System.out.println("Good day!");
                } else {
                    System.out.println("Good afternoon!");
                }
            } else if (args[0].equals("what is up?")) {
                System.out.println("very nice, thanks!");
            } else if (args[0].equals("what you doing?")) {
                System.out.println("Reading interesting book");
            } else if (args[0].equals("why don't sleep?")) {
                System.out.println("Now four pm");
            } else if (args[0].equals("what you doing today afternoon?")){
                System.out.println("I will play footbal with my friends");
            }
            else if (args[0].equals("Bye!")) {
                System.out.println("See you later");
            } else {
                error = true;
            }
        } else {
            error = true;
        }
        if (error) {
            System.out.println("Sorry:( I don't understand\n" +
                    "Answer me better. For example:\n");
        }
    }
}