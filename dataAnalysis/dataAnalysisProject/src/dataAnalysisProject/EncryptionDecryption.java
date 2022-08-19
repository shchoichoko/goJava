package dataAnalysisProject;

import java.util.Arrays;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

public class EncryptionDecryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "";
		int count = 0;
		for(int i = 0; i < 29; i++) {
			inputString += "a";
			count++;
		}
		inputString += "777";
		System.out.println(encrypt(inputString, "kopo kopo kopo"));
		System.out.println(decrypt(inputString, "ruDZ3CTS5Md3+ipVKt20hQ=="));
	}
	
	public static String encrypt(String key, String text) {
		String cipherTest = "";
		try {
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			IvParameterSpec ivspec = new IvParameterSpec(Arrays.copyOfRange(key.getBytes("UTF-8"), 0, cipher.getBlockSize()));
			cipher.init(Cipher.ENCRYPT_MODE,new SecretKeySpec(key.getBytes("UTF-8"),"AES"), ivspec);
			cipherTest = new String(Base64.encodeBase64(cipher.doFinal(text.getBytes("UTF-8"))),"UTF-8");
		} catch(Exception e) {
			e.printStackTrace();
		}
		return cipherTest;
	}
	
	public static String decrypt(String key, String encryptedText) {
		String plainText = "";
		try {
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			IvParameterSpec ivspec = new IvParameterSpec(Arrays.copyOfRange(key.getBytes("UTF-8"), 0, cipher.getBlockSize()));
			cipher.init(Cipher.DECRYPT_MODE,new SecretKeySpec(key.getBytes("UTF-8"),"AES"), ivspec);
			plainText = new String(cipher.doFinal(Base64.decodeBase64(encryptedText.getBytes("UTF-8"))),"UTF-8");
		} catch(Exception e) {
			plainText = "";
			e.printStackTrace();
		}
		return plainText;
	}

}
