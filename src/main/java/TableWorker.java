import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class TableWorker  {

    public static HSSFWorkbook testTable (HSSFWorkbook wb) {
        //class for testing table and printing errors
        HSSFWorkbook currBook;
        currBook = wb;

        //each error should call sout(error string here)
        HSSFWorkbook fixedBook = currBook;
        //return currBook, later return fixed fixedBook
        return fixedBook;
    }

}
