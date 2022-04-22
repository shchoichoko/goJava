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
		// #2 Weather Json 최수혁 04.22
		DocumentBuilder k41_docBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		//xml파일을 처리 PC안에 있어서 전체경로를 지정, xml파싱 처리 
		Document k41_doc = k41_docBuilder.parse(new File("C:\\Users\\폴리텍\\Desktop\\수혁\\Data\\queryDFS.xml"));
		String k41_seq = "";	// 48시간 중 몇번째 인지 가리킴.
		String k41_hour = "";	//동네예보 3시간 단위
		String k41_day = "";	//1번째 날	(0 : 오늘/ 1: 내일 / 2: 모레)
		String k41_temp = "";	//현재 시간 온도
		String k41_tmx = "";	//최고 온도
		String k41_tmn= "";		//최저 온도
		String k41_sky= "";		//하늘 상태 코드(1: 맑음, 2: 구름조금, 3: 구름 많음, 4: 흐림)
		String k41_pty= "";		//강수 상태 코드(0: 없음, 1: 비, 2: 비/눈, 3: 눈/비, 4: 눈)
		String k41_wfKor= "";	//날씨 한국어
		String k41_wfEn	= "";	//날씨 영어
		String k41_pop= "";		//강수 확률%
		String k41_r12= "";		//12시간 예상 강수량
		String k41_s12= "";		//12시간 예상 적설량
		String k41_ws= "";		//풍속(m/s)
		String k41_wd= "";		//풍향( 0 ~ 7 : 북, 북동, 동, 남동, 남, 남서, 서, 북서)
		String k41_wdKor = "";	//풍향 한국어
		String k41_wdEn= "";	//풍향 영어
		String k41_reh	= "";	//습도 %
		String k41_r06	= "";	//6시간 예상 강수량
		String k41_s06	= "";	//6기간 예상 적설량
	
		NodeList k41_tag_001 = k41_doc.getElementsByTagName("data");
		for(int k41_i = 0; k41_i < k41_tag_001.getLength(); k41_i++ ) {
			Element k41_elmt = (Element)k41_tag_001.item(k41_i);
			//각 항목별로 값을 빼와서 해당하는 문자열에 저장한다.
			//TagName 이 xml 파일 내의 tag와 일치해야 함.
			//item은 첫번째,getFirstChild()는 노드의 첫번째 하위내용을 가져옴. getNodeValue로 해당 값을 가져옴.
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
			System.out.printf("48시간 중 : %s \n", k41_seq);		
			System.out.printf("%s시 \n", k41_hour);		
			System.out.printf("%s번째날 \n", k41_day);
			System.out.printf("현재 온도 : %s \n", k41_temp);
			System.out.printf("최고 온도 : %s \n", k41_tmx);
			System.out.printf("최저 온도 : %s \n", k41_tmn);
			System.out.printf("하늘 상태코드 : %s \n", k41_sky);
			System.out.printf("강수 상태코드 : %s \n", k41_pty);
			System.out.printf("날씨 한국어 : %s \n", k41_wfKor);
			System.out.printf("날씨 영어 : %s \n", k41_wfEn);
			System.out.println("강수 확률 : "+k41_pop + " %");
			System.out.printf("12시간 예상 강수량 : %s \n", k41_r12);
			System.out.printf("12시간 예상 적설량 : %s \n", k41_s12);
			System.out.printf("풍속 : %.3s (m/s) \n", k41_ws);
			System.out.printf("풍향 : %s \n", k41_wd);
			System.out.printf("풍향 한국어 : %s \n", k41_wdKor);
			System.out.printf("풍향 영어 : %s \n", k41_wdEn);
			System.out.println("습도 : "+k41_reh + " %");
			System.out.printf("6시간 예상 강수량 : %s \n", k41_r06);
			System.out.printf("6시간 예상 적설량 : %s \n", k41_s06);
			
			System.out.printf("*******************************************************\n");
				
			}
		

	}

}
