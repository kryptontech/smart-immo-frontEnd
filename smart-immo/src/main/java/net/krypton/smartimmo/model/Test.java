package net.krypton.smartimmo.model;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Random rand = new Random(); int randomNum = 0 +
		 * rand.nextInt((999999999 - 1111111) + 1); String st_rand =
		 * Integer.toString(randomNum); String band_compte =
		 * st_rand.substring(2, 6);
		 * 
		 * System.out.println(band_compte);
		
*/
		//System.out.println(md5("0608"));

		String tryt = "dd-MM-yyyy";

		char a_char = tryt.toString().charAt(2);
		String s = String.valueOf(a_char);

		System.out.println(s);
		
		
		//Email Email = new Email();
		//Email.send("jasonsacra@gmail.com", "info", "étè atgfsqyèèè'à!ç!)ù%*£+?NVXWW&é&&&&&");
	}

	public String md5(String txt) {
		return Test.getHash(txt, "MD5");
	}

	public static String getHash(String txt, String hashType) {
		try {

			System.out.println("MD5  " + txt);
			java.security.MessageDigest md = java.security.MessageDigest
					.getInstance(hashType);
			byte[] array = md.digest(txt.getBytes());
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < array.length; ++i) {
				sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100)
						.substring(1, 3));
			}
			return sb.toString();
		} catch (java.security.NoSuchAlgorithmException e) {
			// error action
		}
		return null;
	}
}