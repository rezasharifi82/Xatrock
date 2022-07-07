package xat.DataBase;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.*;
import java.beans.Statement;
import java.io.File;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.util.ArrayList;

public class Excelcheck {

        //ArrayList<String> email_assign=new ArrayList<>();
        public static void well(String path) {
            String name;
            String Lastname;
            String position;
            String email;
            String Password;
            String mobile;
            String lesson_name;
            try {


                FileInputStream file = new FileInputStream(new File(path));
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                    int idd;
                    Sheet sheet = workbook.getSheetAt(0);
                        Row row;
                        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                            row = (Row) sheet.getRow(i);
                            name=row.getCell(0).getStringCellValue();
                            Lastname=row.getCell(1).getStringCellValue();
                            position="Student";
                            email=row.getCell(3).getStringCellValue();
                            Password=row.getCell(4).getStringCellValue();
                            mobile=row.getCell(5).getStringCellValue();
                            lesson_name=row.getCell(8).getStringCellValue();
                            DBNT.new_Member(name,email,0,0,mobile,Password,position,Lastname);
                            idd=DBNT.find_by_email(email).getId();
                            DBNT.new_member_add_to_Lesson(lesson_name,idd);



                        }


                file.close();
            } catch (Exception e) {
                System.out.println("#237684");
                e.printStackTrace();
            }
        }


    }
