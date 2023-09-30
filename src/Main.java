import org.cef.OS;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String currentDirectory = System.getProperty("user.dir");
        String destinationDir, zippedDir;

        if(OS.isMacintosh()){
            destinationDir = currentDirectory + "/Documents";
            zippedDir = currentDirectory + "/ZippedFiles/png2jpg.zip";
        } else{
            destinationDir = currentDirectory + "\\Documents";
            zippedDir = currentDirectory + "\\ZippedFiles\\png2jpg.zip";
        }

        Utilities.UnZip(zippedDir, destinationDir);
        System.out.println("Current Directory: " + destinationDir);
        System.out.println("Zipped Directory: " + zippedDir);
    }
}
