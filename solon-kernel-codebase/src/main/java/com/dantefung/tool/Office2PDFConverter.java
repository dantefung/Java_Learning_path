package com.dantefung.tool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ConnectException;
import java.util.Properties;

import com.artofsolving.jodconverter.DocumentConverter;
import com.artofsolving.jodconverter.openoffice.connection.OpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.connection.SocketOpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.converter.OpenOfficeDocumentConverter;

/**
 * ��Office�ĵ�ת��ΪPDF�ĵ�
 * 
 * @author Dante Fung
 * @date 2015-7-22
 */
public class Office2PDFConverter {
	
	public static void main(String[] args){
		office2PDF("D:\\234.doc" , "D:\\123.pdf");
	}

	/**
	 * �������������url.properties�ľ���·��
	 */
	private static final String RUL_PATH = Thread.currentThread()
			.getContextClassLoader().getResource("").getPath()
			.replace("%20", " ")
			+ "url.properties";

	/**
	 * ��Office�ĵ�ת��ΪPDF. ���иú�����Ҫ�õ�OpenOffice, OpenOffice�汾3.x
	 * 
	 * <pre>
	 * ����ʾ��:
	 * String sourcePath = "F:\\office\\source.doc";
	 * String destFile = "F:\\pdf\\dest.pdf";
	 * Office2PDFConverter.office2PDF(sourcePath, destFile);
	 * </pre>
	 * 
	 * @author Dante Fung
	 * @date 2015-7-22
	 * @param sourceFile
	 * 			Դ�ļ�, ����·��. ������Office2003-2007ȫ����ʽ���ĵ�, Office2010��û����. ����.doc,
	 *            .docx, .xls, .xlsx, .ppt, .pptx��. ʾ��: F:\\office\\source.doc
	 * @param destFile
	 * 			 Ŀ���ļ�. ����·��. ʾ��: F:\\pdf\\dest.pdf
	 * @return
	 */
	public static boolean office2PDF(String sourceFile, String destFile) {
		
		try {
			
			// 1  �Ҳ���Դ�ļ�, �򷵻�false
			File inputFile = new File(sourceFile);
			if (!inputFile.exists()) {
				return false;
			}

			File outputFile = new File(destFile);
			
			// 2 �Ѿ�����pdf�ļ������سɹ�
			if (outputFile.exists())
				return true;

			// 3  ���Ŀ��·��������, ���½���·��
			if (!outputFile.getParentFile().exists()) {
				outputFile.getParentFile().mkdirs();
			}
			
			// 4 ��url.properties�ļ��ж�ȡOpenOffice�İ�װ��Ŀ¼, OpenOffice_HOME��Ӧ�ļ�ֵ.
			Properties prop = new Properties();
			FileInputStream fis = null;
			fis = new FileInputStream(RUL_PATH);	// �����ļ�������
			prop.load(fis);		// �������ļ���װ�ص�Properties������
			fis.close();		// �ر���

			String OpenOffice_HOME = prop.getProperty("OpenOffice_HOME");
			
			// 5 ���û������openoffice Home  �����ش���
			if (OpenOffice_HOME == null)
				return false;
			
			// 6 ������ļ��ж�ȡ��URL��ַ���һ���ַ����� '\'�������'\'
			if (OpenOffice_HOME.charAt(OpenOffice_HOME.length() - 1) != '\\') {
				OpenOffice_HOME += "\\";
			}
			
			// 7 ����OpenOffice�ķ��� , ע��˿ڲ�Ҫ��ͻ
			String command = OpenOffice_HOME
					+ "program\\soffice.exe -headless -accept=\"socket,host=127.0.0.1,port=8300;urp;\" -nofirststartwizard";
			Process pro = Runtime.getRuntime().exec(command);
			
			// 8 ���ӵ�OpenOffice ��ע��˿�Ҫ������һ��
			OpenOfficeConnection connection = new SocketOpenOfficeConnection(
					"127.0.0.1", 8300);
			connection.connect();

			// 8 ת��pdf
			DocumentConverter converter = new OpenOfficeDocumentConverter(
					connection);
			converter.convert(inputFile, outputFile);

			// 9 �ر�����
			connection.disconnect();
			
			// 10  �ر�OpenOffice����Ľ��� �� ����ռ��CPU
			pro.destroy();

			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (ConnectException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

//		return false;
	}
}
