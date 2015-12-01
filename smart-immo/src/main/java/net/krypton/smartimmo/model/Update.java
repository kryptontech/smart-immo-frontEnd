package net.krypton.smartimmo.model;

import java.io.File;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

public class Update {
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method
	 * stub
	 * 
	 * }
	 */

	public String addVideo(MultipartFile file) {
		String bool ="not";
		try {
			// String serverUrlPrefix =
			// "http://localhost/ndossBattle/web/videos/";
			// String saveDirectory = "/Users/ayepi/Desktop/bulk_csv/";
			String saveDirectory = URIConstants.url_depot;
			if (!file.isEmpty()) {
				long fileSize = file.getSize();

				if (fileSize < 2048000) {
					System.out.println("########### File size : " + fileSize
							+ "!");

					String fileName = file.getOriginalFilename();
					System.out.println("le nom du fichier est : " + fileName
							+ "!");

					if (fileName.contains(".")) {
						String[] tabFileName = fileName.split("\\.");
						System.out.println("le nom splitté : "
								+ tabFileName.toString() + "!  size : "
								+ tabFileName.length);

						String extension = tabFileName[(tabFileName.length) - 1];

						System.out.println("the extension of the file is "
								+ extension + "!");
						if (extension.equals("jpeg")
								|| (extension.equals("jpg") || extension
										.equals("png"))) {

							switch (extension) {
							case "jpg":
								String newFileName = UUID.randomUUID()
										.toString() + ".jpg";
								file.transferTo(new File(saveDirectory
										+ newFileName));

								bool = newFileName;
								break;
							case "jpeg":
								String newFileName2 = UUID.randomUUID()
										.toString() + ".jpeg";
								file.transferTo(new File(saveDirectory
										+ newFileName2));

								bool = newFileName2;
								break;
							case "png":

								String newFileName3 = UUID.randomUUID()
										.toString() + ".png";
								file.transferTo(new File(saveDirectory
										+ newFileName3));

								bool = newFileName3;
								break;

							}

						} else {
							bool = "false";
							System.out
									.println("the extension is not png, it is "
											+ extension);
						}
					} else {
						// throw new IllegalArgumentException("fileName " +
						// fileName
						// + " does not contain .");
						System.out.println("fileName " + fileName
								+ " does not contain .");
						bool = "false";
					}
				} else {
					bool = "false";
					System.out
							.println("la taille du fichier depasse 20M ,  taille :"
									+ fileSize);
				}

			} else {
				System.out
						.println("You failed to upload  because the file was empty.");

				bool = "false";
			}
		} catch (Exception e) {
			/*
			 * System.out .println("You failed to upload " +
			 * videoToUpload.getNom_video() + " => " + e.getLocalizedMessage());
			 * bool = "false";
			 */
			bool = "false";
		}

		return bool;
	}

}
