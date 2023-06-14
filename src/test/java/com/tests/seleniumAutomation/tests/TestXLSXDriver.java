package com.tests.seleniumAutomation.tests;
import java.io.File;

import com.tests.seleniumAutomation.utilities.Constants;
import com.tests.seleniumAutomation.utilities.XLSXFileReadWrite;
import com.tests.seleniumAutomation.utilities.writeXLSXCellData;
//import Utility.writeXLSXCellData;

//import Utility.Constants;
public class TestXLSXDriver {

	public static void main(String[] args) {
		 //System.out.println(Constants.CUR_DIR);
		File file = new File(Constants.XL_DATA_PATH);
		
		//XLSXFileReadWrite.readCellDataFromXLfile(file, "FEB STATUS", 2, 1);
		
		//XLSXFileReadWrite.readAllCellDataFromXLfile(file ,"FEB STATUS");
		//XLSXFileReadWrite.readAllCellDataFromXLfile(file);
		writeXLSXCellData.modifyXLSXCellData(file, "FEB STATUS", 2, 0, "CCCC");
		
	}

}
