import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class WeatherJson {

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		// #2 Weather Json �ּ��� 04.22
		DocumentBuilder k41_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		//xml������ ó�� PC�ȿ� �־ ��ü��θ� ����, xml�Ľ� ó�� 
		Document k41_doc = k41_docBuilder.parse(new File("C:\\Users\\������\\Desktop\\����\\Data\\queryDFS.xml"));
		String k41_seq = "";	// 48�ð� �� ���° ���� ����Ŵ.
		String k41_hour = "";	//���׿��� 3�ð� ����
		String k41_day = "";	//1��° ��	(0 : ����/ 1: ���� / 2: ��)
		String k41_temp = "";	//���� �ð� �µ�
		String k41_tmx = "";	//�ְ� �µ�
		String k41_tmn= "";		//���� �µ�
		String k41_sky= "";		//�ϴ� ���� �ڵ�(1: ����, 2: ��������, 3: ���� ����, 4: �帲)
		String k41_pty= "";		//���� ���� �ڵ�(0: ����, 1: ��, 2: ��/��, 3: ��/��, 4: ��)
		String k41_wfKor= "";	//���� �ѱ���
		String k41_wfEn	= "";	//���� ����
		String k41_pop= "";		//���� Ȯ��%
		String k41_r12= "";		//12�ð� ���� ������
		String k41_s12= "";		//12�ð� ���� ������
		String k41_ws= "";		//ǳ��(m/s)
		String k41_wd= "";		//ǳ��( 0 ~ 7 : ��, �ϵ�, ��, ����, ��, ����, ��, �ϼ�)
		String k41_wdKor = "";	//ǳ�� �ѱ���
		String k41_wdEn= "";	//ǳ�� ����
		String k41_reh	= "";	//���� %
		String k41_r06	= "";	//6�ð� ���� ������
		String k41_s06	= "";	//6�Ⱓ ���� ������
	
		NodeList k41_tag_001 = k41_doc.getElementsByTagName("data");
		for(int k41_i = 0; k41_i < k41_tag_001.getLength(); k41_i++ ) {
			Element k41_elmt = (Element)k41_tag_001.item(k41_i);
			//�� �׸񺰷� ���� ���ͼ� �ش��ϴ� ���ڿ��� �����Ѵ�.
			//TagName �� xml ���� ���� tag�� ��ġ�ؾ� ��.
			//item�� ù��°,getFirstChild()�� ����� ù��° ���������� ������. getNodeValue�� �ش� ���� ������.
			k41_seq = k41_tag_001.item(k41_i).getAttributes().getNamedItem("seq").getNodeValue();
			k41_hour = k41_elmt.getElementsByTagName("hour").item(0).getFirstChild().getNodeValue();
			k41_day = k41_elmt.getElementsByTagName("day").item(0).getFirstChild().getNodeValue();
			k41_temp = k41_elmt.getElementsByTagName("temp").item(0).getFirstChild().getNodeValue();
			k41_tmx = k41_elmt.getElementsByTagName("tmx").item(0).getFirstChild().getNodeValue();
			k41_tmn = k41_elmt.getElementsByTagName("tmn").item(0).getFirstChild().getNodeValue();
			k41_sky = k41_elmt.getElementsByTagName("sky").item(0).getFirstChild().getNodeValue();
			k41_pty = k41_elmt.getElementsByTagName("pty").item(0).getFirstChild().getNodeValue();
			k41_wfKor = k41_elmt.getElementsByTagName("wfKor").item(0).getFirstChild().getNodeValue();
			k41_wfEn = k41_elmt.getElementsByTagName("wfEn").item(0).getFirstChild().getNodeValue();
			k41_pop = k41_elmt.getElementsByTagName("pop").item(0).getFirstChild().getNodeValue();
			k41_r12 = k41_elmt.getElementsByTagName("r12").item(0).getFirstChild().getNodeValue();
			k41_s12 = k41_elmt.getElementsByTagName("s12").item(0).getFirstChild().getNodeValue();
			k41_ws = k41_elmt.getElementsByTagName("ws").item(0).getFirstChild().getNodeValue();
			k41_wd = k41_elmt.getElementsByTagName("wd").item(0).getFirstChild().getNodeValue();
			k41_wdKor = k41_elmt.getElementsByTagName("wdKor").item(0).getFirstChild().getNodeValue();
			k41_wdEn = k41_elmt.getElementsByTagName("wdEn").item(0).getFirstChild().getNodeValue();
			k41_reh = k41_elmt.getElementsByTagName("reh").item(0).getFirstChild().getNodeValue();
			k41_r06 = k41_elmt.getElementsByTagName("r06").item(0).getFirstChild().getNodeValue();
			k41_s06 = k41_elmt.getElementsByTagName("s06").item(0).getFirstChild().getNodeValue();
			System.out.printf("*******************************************************\n");
			System.out.printf("48�ð� �� : %s \n", k41_seq);		
			System.out.printf("%s�� \n", k41_hour);		
			System.out.printf("%s��°�� \n", k41_day);
			System.out.printf("���� �µ� : %s \n", k41_temp);
			System.out.printf("�ְ� �µ� : %s \n", k41_tmx);
			System.out.printf("���� �µ� : %s \n", k41_tmn);
			System.out.printf("�ϴ� �����ڵ� : %s \n", k41_sky);
			System.out.printf("���� �����ڵ� : %s \n", k41_pty);
			System.out.printf("���� �ѱ��� : %s \n", k41_wfKor);
			System.out.printf("���� ���� : %s \n", k41_wfEn);
			System.out.println("���� Ȯ�� : "+k41_pop + " %");
			System.out.printf("12�ð� ���� ������ : %s \n", k41_r12);
			System.out.printf("12�ð� ���� ������ : %s \n", k41_s12);
			System.out.printf("ǳ�� : %.3s (m/s) \n", k41_ws);
			System.out.printf("ǳ�� : %s \n", k41_wd);
			System.out.printf("ǳ�� �ѱ��� : %s \n", k41_wdKor);
			System.out.printf("ǳ�� ���� : %s \n", k41_wdEn);
			System.out.println("���� : "+k41_reh + " %");
			System.out.printf("6�ð� ���� ������ : %s \n", k41_r06);
			System.out.printf("6�ð� ���� ������ : %s \n", k41_s06);
			
			System.out.printf("*******************************************************\n");
				
			}
		

	}

}
