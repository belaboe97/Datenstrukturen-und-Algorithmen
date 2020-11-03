
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import java.time.format.DateTimeFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.util.UUID;


public class randomAttendee {


    public static final String xls_path = "C:\\Users\\BelaBoente\\Desktop\\University\\Datastructures and Algorithm\\uebung2\\src\\main\\java\\attendee_list.xlsx";
                                        //ABSOLUT PATH : CONVERT TO RELATIVE --> PlEASE ADJUST WHEN TRY OUT !
    public static  ArrayList candidates = new ArrayList<String>();

    public static ArrayList names = new ArrayList<String>(
            Arrays.asList(
                    "Joni Almond",
                    "Dayna Drew",
                    "Josh Allison",
                    "Huseyin Thorpe",
                    "Romany Frank",
                    "Daniyal Walls",
                    "Gurveer Appleton",
                    "Rhona North",
                    "Ansh Gross",
                    "Bogdan Sparrow",
                    "Elise Lloyd",
                    "Saanvi Hardy",
                    "Asha Lin",
                    "Susan Palacios"
            ));



    public static void main(String[] args) throws IOException, InvalidFormatException {


        Workbook workbook = WorkbookFactory.create(new File(xls_path));
        Sheet sheet = workbook.getSheetAt(0);

        Iterator<Row> rowIterator = sheet.rowIterator();

        while (rowIterator.hasNext()) {

            Row row = rowIterator.next();

            //System.out.println(row.getCell(0));
            //System.out.println(row.getRowNum());
            //System.out.println(row.getCell(1));

            if( row.getRowNum() > 0 && row.getCell(1) != null) {
                if (row.getCell(1).getNumericCellValue()  == 0) {
                    candidates.add(row.getCell(0).getRichStringCellValue().getString());
                }
            }
        }


        if (candidates.size() > 0) {

            System.out.println("this are the possible " + candidates.size() + " loggers: \n" + candidates);

            String select_candidate = candidates.get((int) Math.floor(Math.random() * candidates.size())).toString();

            System.out.println(select_candidate + " is today's logger!");

            System.out.println("For next week: " + (candidates.size()-1) + "  possible logger/ s left!  \n");


            Iterator<Row> rowIteratorInsert = sheet.rowIterator();

            LocalDateTime now = LocalDateTime.now();

            while (rowIteratorInsert.hasNext()) {

                Row row = rowIteratorInsert.next();

                if(row.getCell(0) != null && row.getCell(1) != null) {

                    String compare_name = row.getCell(0).toString();

                    // System.out.println(compare_name +" "+select_candidate);
                    if (compare_name == select_candidate) {
                        row.getCell(1).setCellValue(1);
                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                        row.createCell(2).setCellValue(dtf.format(now));
                    }
                }

            }

            FileOutputStream fileOut = new FileOutputStream("poi-generated-file.xlsx");
            workbook.write(fileOut);
            fileOut.close();

            workbook.close();

        }
        else {

            UUID uuid = UUID.randomUUID();
            workbook.createSheet("list-"+uuid);
            //workbook.setSheetName(workbook.getSheetIndex(sheet), "list-"+uuid);
            //workbook.setSheetOrder(newSheet,0);
            String sheetName = workbook.getSheetName(0);
            workbook.setSheetOrder(sheetName,1);

            Sheet sheetWorker = workbook.getSheetAt(0);

            Iterator<Row> rowIteratorNewSheet = sheetWorker.rowIterator();

            Row header = sheetWorker.createRow(0);

            header.createCell(0).setCellValue("Name");
            header.createCell(1).setCellValue("Check");
            header.createCell(2).setCellValue("Date");

            for(int i = 0; i < names.size(); i++){

                String name = names.get(i).toString();
                System.out.println(name);

                Row workRow = sheetWorker.createRow(i+1);
                workRow.createCell(0);
                workRow.getCell(0).setCellValue(name);
                workRow.createCell(1).setCellValue(0);

            }

            FileOutputStream fileOut = new FileOutputStream("poi-generated-file.xlsx");
            workbook.write(fileOut);
            fileOut.close();
            System.out.println("A new Worksheet for the next weeks has been created!");
            workbook.close();


        }

    }
}





//NOT NEEDED ANYMORE

/*
Iterator<Cell> cellIterator = row.cellIterator();

            String name = "";

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();


                int checkVar = 1;

                switch (cell.getCellType()) {

                    case STRING:
                        name =  cell.getRichStringCellValue().getString();
                        break;

                    case NUMERIC:
                        if (DateUtil.isCellDateFormatted(cell)) {
                            System.out.print(cell.getDateCellValue());
                        } else {
                            checkVar = (int) cell.getNumericCellValue();
                        }
                        break;
                }



            if (compare_name == select_candidate) {
                    System.out.println("HIT");

                    Iterator<Cell> cellIterator = row.cellIterator();
        while (cellIterator.hasNext()) {
        Cell cell = cellIterator.next();
        if( cell.getColumnIndex() == 1 ){
        System.out.println("DASD");
        cell.setCellValue(1);
        }
        }

        }

*/