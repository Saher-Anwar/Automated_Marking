import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String currentDirectory = System.getProperty("user.dir");
        String destinationDir = currentDirectory + "\\Documents";
        String zippedDir = currentDirectory + "\\ZippedFiles";

        Utilities.UnZip(zippedDir, currentDirectory);
        System.out.println("Current Directory: " + currentDirectory);
        System.out.println("Zipped Directory: " + zippedDir);
    }
}
