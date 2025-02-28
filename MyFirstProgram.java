import java.util.Scanner;
public class MyFirstProgram{

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033c");
        System.out.print("Before the program \"starts\", we'd like to know your name :3 hehe\nYour Name : ");
        String name = scanner.next();
        System.out.print("\033c");
        String yBrF = "\u001B[31m\u001b[43m";
        String r = "\u001B[33m";
        String b = "\u001B[0m";
        String welcome = (yBrF + "|                                                                |\u001B[0m\n" + //
                          yBrF + "| ██╗    ██╗███████╗██╗      ██████╗ ██████╗ ███╗   ███╗███████╗ |\u001B[0m\n"+
                          yBrF + "| ██║    ██║██╔════╝██║     ██╔════╝██╔═══██╗████╗ ████║██╔════╝ |\u001B[0m\n"+
                          yBrF + "| ██║ █╗ ██║█████╗  ██║     ██║     ██║   ██║██╔████╔██║█████╗   |\u001B[0m\n"+
                          yBrF + "| ██║███╗██║██╔══╝  ██║     ██║     ██║   ██║██║╚██╔╝██║██╔══╝   |\u001B[0m\n"+
                          yBrF + "| ╚███╔███╔╝███████╗███████╗╚██████╗╚██████╔╝██║ ╚═╝ ██║███████╗ |\u001B[0m\n"+
                          yBrF + "|  ╚══╝╚══╝ ╚══════╝╚══════╝ ╚═════╝ ╚═════╝ ╚═╝     ╚═╝╚══════╝ |\u001B[0m");
        String[] funfacts = {
            "The Java team jokingly considered \"Silk\" as their new name, but then they settled on \"Java\".",
            "In the Java 1.3.1 installer, clicking the coffee cup logo repeatedly would trigger a hidden \"Java 4 Ever\" animation.",
            "The iconic Java mascot Duke, was created by Joe Palrang, who later became a lead animator for Shrek.",
            "A Java developer's median salary is $83,975,00. It pays to be a Java developer.",
            "Java rationally runs on more than 1 Billion as the Android operating system of GOogle uses Java APIs.",
            "In one year Java gets downloaded one billion times.",
            "Before becoming a web development staple, Java was called \"Oak\", and it was created in 1991 for interactive cable TV Systems.",
            "The basic syntax of Java involves four components :Object, Class methods, and Instant Variables.",
            "Google Maps, Skype and the Famous Angry Birds are made with Java.",
            "Gosling and his team were working on Set-Up box by cleaning up C++ and ended up with a new programming language, which is Java."
        };
        String[] stickmananimation = {" @  \n/|\\\n/ \\ ",
                                      " @/  Hello "+name+"!\n/| \n/ \\"," @__ Hello "+name+"!\n/| \n/ \\"," @/  Hello "+name+"!\n/| \n/ \\"," @__ Hello "+name+"!\n/| \n/ \\"," @/  Hello "+name+"!\n/| \n/ \\",
                                      " @   Here's a little fun fact!\n/|\\\n/ \\",
                                      " @   Did you know                 \n<|>\n/ \\"," @   Did you know.                \n<|>\n/ \\"," @__ Did you know..               \n<| \n/ \\"," @__ Did you know...              \n<| \n/ \\"," @__ "+funfacts[(int) (Math.random()*10)]+"              \n<| \n/ \\"};
        for (int i = 0; i < 12;i++) {
            System.out.print("\033[?25l");
            System.out.print("\033[H");
            System.out.println(welcome);
            System.out.println("Current Version of Java : "+System.getProperty("java.version"));
            System.out.println(r + stickmananimation[i] + b);
            Thread.sleep(270);
            if (i == 6) {
                Thread.sleep(1000);
            }
        }
        scanner.close();
    }
}