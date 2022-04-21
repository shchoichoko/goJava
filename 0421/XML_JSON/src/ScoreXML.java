import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ScoreXML {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// #1 XML 22.04.21 �ּ���
		//�ľ��� ���� �غ�
		DocumentBuilder k41_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		
		//xml������ ó�� PC�ȿ� �־ ��ü��θ� ����, xml�Ľ� ó�� 
		Document k41_doc = k41_docBuilder.parse(new File("C:\\Users\\������\\Desktop\\����\\Data\\testdata.xml"));

		Element k41_root = k41_doc.getDocumentElement();
		//root �±׸� ���⵵ ������ ������ ���̴� ���� ����.
		NodeList k41_tag_name = k41_doc.getElementsByTagName("name");
		NodeList k41_tag_studentid = k41_doc.getElementsByTagName("studentid");
		NodeList k41_tag_kor = k41_doc.getElementsByTagName("kor");
		NodeList k41_tag_eng = k41_doc.getElementsByTagName("eng");
		NodeList k41_tag_mat = k41_doc.getElementsByTagName("mat");
		
		
		System.out.printf("*******************************************************\n");
		for(int k41_i = 0; k41_i < k41_tag_name.getLength(); k41_i++) {
			System.out.printf("�̸� : %s\n", k41_tag_name.item(k41_i).getFirstChild().getNodeValue());
			System.out.printf("�й� : %s\n", k41_tag_studentid.item(k41_i).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n", k41_tag_kor.item(k41_i).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n", k41_tag_eng.item(k41_i).getFirstChild().getNodeValue());
			System.out.printf("���� : %s\n", k41_tag_mat.item(k41_i).getFirstChild().getNodeValue());
			System.out.printf("*******************************************************\n");
		}
		
	}

}
