package com.dantefung.tool;
import java.io.File;  
import java.io.IOException;  
  
import com.jacob.activeX.ActiveXComponent;  
import com.jacob.com.Dispatch;  
  
public class Word2PdfUtil {  
  
    static final int wdDoNotSaveChanges = 0;// ����������ĸ��ġ�  
    static final int wdFormatPDF = 17;// wordתPDF ��ʽ  
  
    public static void main(String[] args) throws IOException {  
        String source1 = "D:\\234_.doc";  
        String target1 = "D:\\test1.pdf";  
        Word2PdfUtil pdf = new Word2PdfUtil();  
        pdf.word2pdf(source1, target1);  
    }  
  
    public static boolean word2pdf(String source, String target) {  
        System.out.println("WordתPDF��ʼ����...");  
        long start = System.currentTimeMillis();  
        ActiveXComponent app = null;  
        try {  
            app = new ActiveXComponent("Word.Application");  
            app.setProperty("Visible", false);  
            Dispatch docs = app.getProperty("Documents").toDispatch();  
            System.out.println("���ĵ���" + source);  
            Dispatch doc = Dispatch.call(docs, "Open", source, false, true).toDispatch();  
            System.out.println("ת���ĵ���PDF��" + target);  
            File tofile = new File(target);  
            if (tofile.exists()) {  
                tofile.delete();  
            }  
            Dispatch.call(doc, "SaveAs", target, wdFormatPDF);  
            Dispatch.call(doc, "Close", false);  
            long end = System.currentTimeMillis();  
            System.out.println("ת����ɣ���ʱ��" + (end - start) + "ms");  
            return true;  
        } catch (Exception e) {  
            System.out.println("WordתPDF����" + e.getMessage());  
            return false;  
        } finally {  
            if (app != null) {  
                app.invoke("Quit", wdDoNotSaveChanges);  
            }  
        }  
    }  
  
}  