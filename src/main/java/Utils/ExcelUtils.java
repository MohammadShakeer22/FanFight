package Utils;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class ExcelUtils {

    public static String colValue;

    public static String fetchData(String file, String sheet, String key) throws FilloException {
        Fillo fillo = new Fillo();

        Connection connection=fillo.getConnection(System.getProperty("user.dir")+"\\src\\main\\resources\\"+file+"");

        String strQuery="Select * from "+sheet+"";
        Recordset recordset=connection.executeQuery(strQuery);

        while(recordset.next())
        {
            colValue=recordset.getField(key);
        }

        recordset.close();
        connection.close();

        return colValue;
    }

}
