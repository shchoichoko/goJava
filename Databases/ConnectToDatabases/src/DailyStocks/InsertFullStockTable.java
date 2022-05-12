package DailyStocks;

import java.io.BufferedReader;//파일의 내용을 읽기위해 bufferedReader를 불러온다.
import java.io.File; //파일을 불러내기 위해 file을 import한다.
import java.io.FileReader;//파일 읽기를 위해 FileReader를 import한다. 
import java.io.IOException;//throw 예외처리를 위해 IOException를 import
import java.sql.Connection; //DriverManager 클래스의 static 메서드인 getConnection() 메서드를 호출
import java.sql.DriverManager;//드라이버로드를 위해 DriverManager를 import한다.
import java.sql.PreparedStatement;//PreparedStatement코드 안정성 높음. 가독성 높음.
import java.sql.SQLException;//throw 예외처리를 위해 SQLException를 import
import java.sql.Statement;//Statement 객체를 생성하여 질의 수행하기 위해 Statement를 import
import java.text.SimpleDateFormat;//date표시를 위해 SimpleDateFormat 을 import한다.

public class InsertFullStockTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {// 예외사항들을 throws 다음
																										// 입력한다.
		// TODO Auto-generated method stub

		// SimpleDateForm을 이용하여 포맷을 설정해준다
		SimpleDateFormat k24_time = new SimpleDateFormat("HH:mm:ss");
		// 표준시간(협정 세계시 (UTC))와의 사이에 발생하는 차이 UTC 1970년 1월 1일 00:00:00.000 을 기준으로한 현재 시간의
		// 차이를 long형으로 반환
		// 프로그램 시작 시간

		Class.forName("com.mysql.cj.jdbc.Driver"); // Class.forName() 을 이용해서 드라이버를 로드한다. 
													// ClassNotFoundException예외 처리를 한다.
		Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.23.106:3306/kopoctc", "root", "1234");
		Statement stmt = conn.createStatement();// Connection 객체의 createStatement() 메서드를 호출하여, 쿼리를 실행할 수 있는 Statement

		String QueryTxt = "insert ignore into  BigStockTable (stnd_iscd, bsop_date, shrn_iscd, stck_prpr, stck_oprc, stck_hgpr, stck_lwpr, prdy_vrss_sign, prdy_vrss, prdy_ctrt, " 
				+ "prdy_vol, acml_vol, acml_tr_pbmn, askp1, bidp1, total_askp_rsqn, total_bidp_rsqn, seln_cntg_smtn, shnu_cntg_smtn, seln_tr_pbmn, " 
				+ "shnu_tr_pbmn, seln_cntg_csnu, shnu_cntg_csnu, w52_hgpr, w52_lwpr, w52_hgpr_date, w52_lwpr_date, ovtm_untp_bsop_hour , ovtm_untp_prpr, ovtm_untp_prdy_vrss, ovtm_untp_prdy_vrss_sign," 
				+ "ovtm_untp_askp1, ovtm_untp_bidp1, ovtm_untp_vol, ovtm_untp_tr_pbmn, ovtm_untp_oprc, ovtm_untp_hgpr, ovtm_untp_lwpr, mkob_otcp_vol, mkob_otcp_tr_pbmn, mkfa_otcp_vol," 
				+ "mkfa_otcp_tr_pbmn, mrkt_div_cls_code,  pstc_dvdn_amt, lstn_stcn, stck_sdpr, stck_fcam, wghn_avrg_stck_prc, issu_limt_rate, frgn_limt_qty, oder_able_qty," 
				+ "frgn_limt_exhs_cls_code, frgn_hldn_qty, frgn_hldn_rate, hts_frgn_ehrt, itmt_last_nav, prdy_last_nav, trc_errt, dprt, ssts_cntg_qty,ssts_tr_pbmn," 
				+ "frgn_ntby_qty ,flng_cls_code, prtt_rate, acml_prtt_rate, stdv, beta_cfcn, crlt_cfcn, bull_beta,  bear_beta, bull_dvtn," 
				+ "bear_dvtn, bull_crlt, bear_crlt, stck_mxpr, stck_llam, icic_cls_code, itmt_vol, itmt_tr_pbmn, fcam_mod_cls_code, revl_issu_reas_code, " 
				+ "orgn_ntby_qty, adj_prpr, fn_oprc, fn_hgpr, fn_lwpr, fn_prpr, fn_acml_vol, fn_acml_tr_pbmn, fn_prtt_rate, fn_flng_cls_code," 
				+ "buyin_nor_prpr, buyin_nor_prdy_vrss, buyin_nor_vol, buyin_nor_tr_pbmn, buyin_tod_prpr, buyin_tod_prdy_vrss, buyin_tod_vol, buyin_tod_tr_pbmn)" 
				+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?"
				+ ",?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
				+ "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		PreparedStatement pstmt = conn.prepareStatement(QueryTxt);
		// PreparedStatement쓰는 이유: 인자값으로 전달이 가능하다.가독성이 높다.기존 Statement 보다 성능이 좋다.
		// File을 통해서 해당 위치의 StockDailyPrice 파일을 읽어온다
		File f = new File("C:\\Users\\폴리텍\\Desktop\\SooHyeok\\FileReadTest\\StockDailyPrice.csv");
		BufferedReader br = new BufferedReader(new FileReader(f));
		// 데이터를 모아뒀다가 한번에 보내는 훨씬더 효율적이다. 데이터량이 많으므로 BufferedReader사용
		String readtxt;// readtext를 변수 선언한다.

		if ((readtxt = br.readLine()) == null) { // 만약 readLine()이 비면 (읽혀지는 값이 없으면)
			System.out.println("빈 파일입니다"); // 해당내용 출력
			return;
		} // 조건문 닫는다.

		String[] field_name = readtxt.split(","); // csv파일이므로 컴마기준으로 문자열을 나눠 field_Name으로 문자열 나눔.

		int LintCnt = 0; // 라인수를 카운트하기 위한 정수형 변수를 선언하고 0으로 초기화한다.
		conn.setAutoCommit(false); // setAutoCommit(false) : commit 실행중 에러가 발생하면, 사용자가 직접 commit/rollback을 하겠다
		long k24_start = System.currentTimeMillis(); // 시간을 밀리세컨 단위로 불러온다.

		int numforField = 0; 

		while ((readtxt = br.readLine()) != null) { // 읽어드린 readline이 null이 아니면 계쏙 반복문을 수행한다.
			String[] field = readtxt.split(","); // readtext를 가져와 문자열 배열 field에 순서대로 부여한다.
			try {

				for (int i = 0; i < 99; i++) {

					pstmt.setString(i + 1, field[i]);
				}

				pstmt.addBatch(); // 모아둔 쿼리를 한번에 DB쪽으로 날린다.
				System.out.printf("%d번째 항목 addBatch OK\n", LintCnt);
				pstmt.clearParameters();
				if(LintCnt==10000) {
					break;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				// e.printStackTrace(); // 애러문구를 출력한다.
			} finally {
				LintCnt++;// 변수에 1을 더해준다.
				numforField++;

				try {
					if (LintCnt % 10000 == 0) {// 10000으로 나누어 떨어지면
						pstmt.executeBatch();// 모아둔 쿼리를 한번에 DB쪽으로 날린다.
						conn.commit();// 커밋 해주기.
					} 
				} catch (Exception e) {// try문이 수행되지 않으면 해당 문구 출력한다.
					e.printStackTrace(); // 애러문구를 출력한다.
				}
			}
		}

		try {
			pstmt.executeBatch();
		} catch (Exception e) {
			e.printStackTrace();
		}

		conn.commit();
		conn.setAutoCommit(true);
		long k24_end = System.currentTimeMillis(); // 프로그램 종료 시간

		System.out.println("start : " + k24_time.format(k24_start)); // 시작시간의 밀리세컨드
		System.out.println("end : " + k24_time.format(k24_end)); // 종료시간의 밀리케선드
		System.out.println("실행 시간 : " + (k24_end - k24_start) / 1000.0 + "초"); // 최종 실행시간
		br.close();
		stmt.close(); // Statement 종료
		conn.close(); // Connection 종료
	}
}
