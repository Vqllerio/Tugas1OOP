import java.util.Scanner;
public class MyFirstProgram{
    //THe main class that wil be executed
    public static void main(String[] args) throws InterruptedException {

        //Sets up the Scanner to get inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033c");
        System.out.print("Before the program \"starts\", we'd like to know your name :3 hehe\nYour Name : ");
        String name = scanner.next();
        
        //list of formats and styles
        String Pretty = "\u001B[31m\u001b[43m";
        String red = "\u001B[33m";
        String reset = "\u001B[0m";

        //variable to print welcome message
        String welcome = (Pretty + "|                                                                |"+reset+ //
                          Pretty + "| ██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗ |"+reset+
                          Pretty + "| ██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝ |"+reset+
                          Pretty + "| ██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗   |"+reset+
                          Pretty + "| ██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝   |"+reset+
                          Pretty + "| ╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗ |"+reset+
                          Pretty + "|  ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝ |"+reset);

        //List of fun facts
        String[] funfacts = {
            "The Java team jokingly considered \"Silk\" as their new name, but then they settled on \"Java\".",
            "In Java 1.3.1 installer, clicking the logo repeatedly would trigger a hidden \"Java 4 Ever\" animation.",
            "The iconic Java mascot Duke, was created by Joe Palrang, who later became a lead animator for Shrek.",
            "A Java developer's median salary is $83,975,00. It pays to be a Java developer.",
            "Java rationally runs on more than 1 Billion as the Android operating system of GOogle uses Java APIs.",
            "In one year Java gets downloaded one billion times.",
            "Java was called \"Oak\", and it was created in 1991 for interactive cable TV Systems.",
            "The basic syntax of Java involves four components :Object, Class methods, and Instant Variables.",
            "Google Maps, Skype and the Famous Angry Birds are made with Java.",
            "Gosling and his team were cleaning up C++ and ended up with a new programming language, Java."
        };

        //list of stickman animations in chronological order.
        String[] stickmananimation = {" @  \n/|\\\n/ \\ ",
                                      " @/  Hello "+name+"!\n/| \n/ \\",
                                      " @__ Hello "+name+"!\n/| \n/ \\",
                                      " @/  Hello "+name+"!\n/| \n/ \\",
                                      " @__ Hello "+name+"!\n/| \n/ \\",
                                      " @/  Hello "+name+"!\n/| \n/ \\",
                                      " @   Here's a little fun fact!\n/|\\\n/ \\",
                                      " @   Did you know             \n<|>\n/ \\",
                                      " @   Did you know.            \n<|>\n/ \\",
                                      " @__ Did you know..           \n<| \n/ \\",
                                      " @__ Did you know...          \n<| \n/ \\",
                                      " @__ "+funfacts[(int) (Math.random()*10)]+"              \n<| \n/ \\"};
                           
        //Looping to print so it looks like an animation
        for (int i = 0; i < 12;i++) {
            //sets the cursor to home(top left) and then rewrites everything
            System.out.print("\033[?25l\033[H");
            System.out.println(welcome);
            System.out.println("Current Version of Java : "+System.getProperty("java.version"));
            System.out.println(red + stickmananimation[i] + reset);
            Thread.sleep(270);
            if (i == 6) {// in the seventh frame, it pauses a little so i don't have to manually make more "frames"
                Thread.sleep(1000);
            }
        }
        //closes the scanner so save memory.
        scanner.close();
    }
}