import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Directory currentDirectory = new Directory("root");
        final char c = '>';
        Scanner sc = new Scanner(System.in);
        String func;
        do {
            System.out.print(currentDirectory.getFilePath() + c);
            func = sc.next();
            switch (func) {
                case "ls" -> currentDirectory.ls();
                case "cd" -> {
                    String directoryName = sc.next();
                    if (currentDirectory.cd(directoryName) == null) {
                        System.out.println("系統找不到指定路徑");
                    } else {
                        currentDirectory = currentDirectory.cd(directoryName);
                    }
                }
                case "cd.." -> currentDirectory = currentDirectory.getParent();
                case "touch" -> currentDirectory.touch(sc.next());
                case "mkdir" -> currentDirectory.mkdir(sc.next());
                case "search" -> currentDirectory.search(sc.next());
                case "getPath" -> currentDirectory.printFilePath();
            }
        } while (!func.equals("System.exit"));
        sc.close();
        System.exit(0);
    }
}