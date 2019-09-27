package com.dantefung.tool;

import java.security.GeneralSecurityException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.util.MailSSLSocketFactory;

public class MailTool {
    public static void main(String[] args) throws MessagingException, GeneralSecurityException {
        Properties props = new Properties();

        // ����debug����
        props.setProperty("mail.debug", "true");
        // ���ͷ�������Ҫ�����֤
        props.setProperty("mail.smtp.auth", "true");
        // �����ʼ�������������
        props.setProperty("mail.host", "smtp.qq.com");
        // �����ʼ�Э������
        props.setProperty("mail.transport.protocol", "smtp");

        MailSSLSocketFactory sf = new MailSSLSocketFactory();
        sf.setTrustAllHosts(true);
        props.put("mail.smtp.ssl.enable", "true");
        props.put("mail.smtp.ssl.socketFactory", sf);

        Session session = Session.getInstance(props);

        Message msg = new MimeMessage(session);
        msg.setSubject("����Dante�Ĳ����ʼ�");
        StringBuilder builder = new StringBuilder();
        builder.append("url = " + "http://www.cnblogs.com/dantefung/");
        builder.append("\nDante�Ĳ���");
        builder.append("\n��ǰ��ʱ��Ϊ�� " + new Date().getTime());
        msg.setText(builder.toString());
        msg.setFrom(new InternetAddress("476400902@qq.com"));

        Transport transport = session.getTransport();
        transport.connect("smtp.qq.com", "476400902@qq.com", "zzpcujbgtquccagd");

        transport.sendMessage(msg, new Address[] { new InternetAddress("476400902@qq.com") });
        transport.close();
    }
}