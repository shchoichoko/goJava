
public class cutBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "라피네야채핸드&네일크림50에델바이스";
		System.out.println(subStrBytes(str,2));
		System.out.println(str.substring(0,2));
	}

	public static String subStrBytes(String source, int cutLength) {
		if(!source.isEmpty()) {
			source = source.trim();
			if(source.getBytes().length <= cutLength) {
				return source;
			} else {
				StringBuffer sb = new StringBuffer(cutLength);
				int cnt = 0;
				for(char ch : source.toCharArray()) {
					cnt += String.valueOf(ch).getBytes().length;
					if(cnt > cutLength) break;
					sb.append(ch);
				}
				return sb.toString() + " ";
				
			}
			
		} else {
			return "";
		}
	}
	
	   public static String k27_subStrByte(String k37_source, int k37_cutLength) {
	         if (!k37_source.isEmpty()) {
	            k37_source = k37_source.trim();// 공백 자르기
	            if (k37_source.getBytes().length < k37_cutLength) {
	               for (int k37_i = k37_cutLength - k37_source.getBytes().length; k37_i > 0; k37_i--) {
	                  k37_source += " ";
	               }
	               return k37_source;
	            } else {
	               StringBuffer k37_sb = new StringBuffer(k37_cutLength);
	               int k37_cnt = 0;
	               for (char k37_ch : k37_source.toCharArray()) {
	                  k37_cnt += String.valueOf(k37_ch).getBytes().length;
	                  if (k37_cnt > k37_cutLength)
	                     break;
	                  k37_sb.append(k37_ch);
	               }
	               
	               if(k37_sb.toString().getBytes().length == 19) {
	                  k37_sb.append(" ");
	               }
	               
	               return k37_sb.toString();
	            }
	         } else {
	            return "";
	         }
	      }
}
