package utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileConversion extends SimpleFileVisitor <Path> {
    private static ZipOutputStream zos;
    private Path sourceDir;

    public FileConversion (Path sourceDir) {
        this.sourceDir = sourceDir;
    }

    public static String convertToZip (String dirPath) {
        Path sourceDir = Paths.get ( dirPath );
        try {
            String zipFileName = dirPath.concat ( ".zip" );
            zos = new ZipOutputStream ( new FileOutputStream ( zipFileName ) );
            Files.walkFileTree ( sourceDir, new FileConversion ( sourceDir ) );
            zos.close ( );
        } catch (IOException ex) {
            System.err.println ( "I/O Error: " + ex );
        }
        return dirPath+".zip";
    }

    @Override
    public FileVisitResult visitFile (Path file, BasicFileAttributes attributes) {
        try {
            Path targetFile = sourceDir.relativize ( file );
            zos.putNextEntry ( new ZipEntry ( targetFile.toString ( ) ) );
            byte[] bytes = Files.readAllBytes ( file );
            zos.write ( bytes, 0, bytes.length );
            zos.closeEntry ( );
        } catch (IOException ex) {
            System.err.println ( ex );
        }
        return FileVisitResult.CONTINUE;
    }

}
