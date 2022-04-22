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
		// #1 XML 22.04.21 최수혁
		//파씽을 위한 준비
		DocumentBuilder k41_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		
		//xml파일을 처리 PC안에 있어서 전체경로를 지정, xml파싱 처리 
		Document k41_doc = k41_docBuilder.parse(new File("C:\\Users\\폴리텍\\Desktop\\수혁\\Data\\testdata.xml"));

		Element k41_root = k41_doc.getDocumentElement();
		//root 태그를 쓰기도 하지만 지금은 쓰이는 곳이 없음.
		NodeList k41_tag_name = k41_doc.getElementsByTagName("name");	//지정한 파일 태그 이름이 일치한 내용을 가져온다.
		NodeList k41_tag_studentid = k41_doc.getElementsByTagName("studentid");	//지정한 파일 태그 이름이 일치한 내용을 가져온다.
		NodeList k41_tag_kor = k41_doc.getElementsByTagName("kor");	//지정한 파일 태크 이름이 일치한 내용을 가져온다.
		NodeList k41_tag_eng = k41_doc.getElementsByTagName("eng");	//지정한 파일 태크 이름이 일치한 내용을 가져온다.
		NodeList k41_tag_mat = k41_doc.getElementsByTagName("mat");	//지정한 파일 태크 이름이 일치한 내용을 가져온다.
		
		
		System.out.printf("*******************************************************\n");
		for(int k41_i = 0; k41_i < k41_tag_name.getLength(); k41_i++) {
			System.out.printf("이름 : %s\n", k41_tag_name.item(k41_i).getFirstChild().getNodeValue());		
			//태그 이름이 name인 것중에 item은 첫번째,getFirstChild()는 노드의 첫번째 하위내용을 가져옴. getNodeValue로 해당 값을 가져옴.
			System.out.printf("학번 : %s\n", k41_tag_studentid.item(k41_i).getFirstChild().getNodeValue());	
			//태그 이름이 studentid인 것중에 item은 첫번째,getFirstChild()는 노드의 첫번째 하위내용을 가져옴. getNodeValue로 해당 값을 가져옴.
			System.out.printf("국어 : %s\n", k41_tag_kor.item(k41_i).getFirstChild().getNodeValue());
			//태그 이름이 kor인 것중에 item은 첫번째,getFirstChild()는 노드의 첫번째 하위내용을 가져옴. getNodeValue로 해당 값을 가져옴.
			System.out.printf("영어 : %s\n", k41_tag_eng.item(k41_i).getFirstChild().getNodeValue());
			//태그 이름이 eng인 것중에 item은 첫번째,getFirstChild()는 노드의 첫번째 하위내용을 가져옴. getNodeValue로 해당 값을 가져옴.
			System.out.printf("수학 : %s\n", k41_tag_mat.item(k41_i).getFirstChild().getNodeValue());
			//태그 이름이 mat인 것중에 item은 첫번째,getFirstChild()는 노드의 첫번째 하위내용을 가져옴. getNodeValue로 해당 값을 가져옴.
			System.out.printf("*******************************************************\n");
		}
		
	}

}
