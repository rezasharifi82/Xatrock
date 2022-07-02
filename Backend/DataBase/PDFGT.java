package xat.DataBase;




import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;


import java.io.FileOutputStream;
import java.util.List;

public class PDFGT {
    public static void pdfgen(String name) {
        Document document = new Document();
        List<Questions> qlist;
        String me=name;
        qlist=DBNT.get_questions_of_exam(name);

        try {
            PdfWriter.getInstance(document, new FileOutputStream(me+".pdf"));
            document.open();
            Font Question_font = FontFactory.getFont(FontFactory.COURIER, 40, BaseColor.RED);
            Font Answer_font =FontFactory.getFont(FontFactory.HELVETICA,20,BaseColor.BLUE);
            Font line=FontFactory.getFont(FontFactory.HELVETICA,10,BaseColor.BLACK);
            Chunk chunk = new Chunk(qlist.get(0).getName_of_lesson()+"\n\n\n\n");
            document.add(chunk);

            for(Questions i: qlist){
                chunk=new Chunk(i.getQuestion()+"\n\n",Question_font).setLineHeight(40);
                document.add(chunk);
                chunk=new Chunk(i.getOp1()+"\n\n",Answer_font).setLineHeight(20);
                document.add(chunk);
                chunk=new Chunk(i.getOp2()+"\n\n",Answer_font).setLineHeight(20);
                document.add(chunk);
                chunk=new Chunk(i.getOp3()+"\n\n",Answer_font).setLineHeight(20);
                document.add(chunk);
                chunk=new Chunk(i.getOp4()+"\n\n",Answer_font).setLineHeight(20);
                document.add(chunk);
                chunk=new Chunk("___________________________________________________________________________________________________________________________"+"\n\n",line);
                document.add(chunk);
            }
//            chunk = new Chunk(qlist.get(0).getName_of_lesson()+"\n\n").setLineHeight(20);
//
//            document.add(chunk);
//            chunk = new Chunk(qlist.get(0).getName_of_lesson()+"\n\n").setLineHeight(40);
//
//            document.add(chunk);
            document.close();
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("#129038");
            e.printStackTrace();
            throw new RuntimeException(e);

        }



    }
    public static void pdfgen(List<Questions> opp) {
        Document document = new Document();
        List<Questions> qlist;
        //String me=name;
        qlist=opp;

        try {
            PdfWriter.getInstance(document, new FileOutputStream("default.pdf"));
            document.open();
            Font Question_font = FontFactory.getFont(FontFactory.COURIER, 40, BaseColor.RED);
            Font Answer_font =FontFactory.getFont(FontFactory.HELVETICA,20,BaseColor.BLUE);
            Font line=FontFactory.getFont(FontFactory.HELVETICA,10,BaseColor.BLACK);
            Chunk chunk = new Chunk("\t\t\t\tIn The Name Of God"+"\n\n\n\n\n\n\n");
            document.add(chunk);
            chunk = new Chunk(qlist.get(0).getName_of_lesson()+"\n\n\n\n");
            document.add(chunk);

            for(Questions i: qlist){
                chunk=new Chunk(i.getQuestion()+"\n\n",Question_font).setLineHeight(40);
                document.add(chunk);
                chunk=new Chunk(i.getOp1()+"\n\n",Answer_font).setLineHeight(20);
                document.add(chunk);
                chunk=new Chunk(i.getOp2()+"\n\n",Answer_font).setLineHeight(20);
                document.add(chunk);
                chunk=new Chunk(i.getOp3()+"\n\n",Answer_font).setLineHeight(20);
                document.add(chunk);
                chunk=new Chunk(i.getOp4()+"\n\n",Answer_font).setLineHeight(20);
                document.add(chunk);
                chunk=new Chunk("___________________________________________________________________________________________________________________________"+"\n\n",line);
                document.add(chunk);
            }
//            chunk = new Chunk(qlist.get(0).getName_of_lesson()+"\n\n").setLineHeight(20);
//
//            document.add(chunk);
//            chunk = new Chunk(qlist.get(0).getName_of_lesson()+"\n\n").setLineHeight(40);
//
//            document.add(chunk);
            document.close();
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("#129038");
            e.printStackTrace();
            throw new RuntimeException(e);

        }



    }
}
