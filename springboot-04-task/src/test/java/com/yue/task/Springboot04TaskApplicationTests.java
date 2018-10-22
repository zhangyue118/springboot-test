package com.yue.task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.MailMessage;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot04TaskApplicationTests {

	@Autowired
	JavaMailSenderImpl mailSender;

	@Test
	public void contextLoads() {
		SimpleMailMessage mailMessage=new SimpleMailMessage();
		mailMessage.setSubject("通知-今晚开会");
		mailMessage.setText("8点开会!");
		mailMessage.setFrom("1143458217@qq.com");
		mailMessage.setTo("m13687916426@163.com");
		mailSender.send(mailMessage);
	}

	@Test
	public void test02() throws Exception{
		MimeMessage mailMessage=mailSender.createMimeMessage();
		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mailMessage,true);
		//SimpleMailMessage message=new SimpleMailMessage();
		mimeMessageHelper.setSubject("通知-今晚开会");
		mimeMessageHelper.setText("<b style='color:red'>8点开会!</b>",true);
		mimeMessageHelper.setFrom("1143458217@qq.com");
		mimeMessageHelper.setTo("m13687916426@163.com");
		mimeMessageHelper.addAttachment("1.jpg",new File("D:\\Pictures\\Screenshots\\509-140415151050.jpg"));
		mimeMessageHelper.addAttachment("3.jpg",new File("D:\\Pictures\\Screenshots\\QQ截图20150108215450.png"));
		mailSender.send(mailMessage);
	}
}
