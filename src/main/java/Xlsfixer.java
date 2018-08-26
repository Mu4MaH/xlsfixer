import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.io.File;
import java.io.FileInputStream;

public class Xlsfixer {

    public static void Xlsfixer (String[] args){
        File file = new File("C:\testfile.xlsx");
        TableWorker.testTable(loader(file));

    }

    private static HSSFWorkbook loader (File input) {
        try {
            POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(input.getName()));
            HSSFWorkbook wb = new HSSFWorkbook(fs);
            return wb;
        }
        catch (Exception e) {
            return null;
        }


    }
}
