package net.krypton.smartimmo.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import net.krypton.smartimmo.entities.Album;
import net.krypton.smartimmo.entities.Bien;
import net.krypton.smartimmo.model.URIConstants;
import net.krypton.smartimmo.model.Update;
import net.krypton.smartimmo.service.AlbumService;
import net.krypton.smartimmo.service.BienService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * Handles requests for the application file upload requests
 */
@Controller
public class FileUploadController {

	@Autowired
	BienService bienService;

	@Autowired
	AlbumService albumService;

	private static final Logger logger = LoggerFactory
			.getLogger(FileUploadController.class);

	/**
	 * Upload single file using Spring Controller
	 * 
	 * 
	 * 
	 */

	@RequestMapping(value = "/up")
	public String supprAlbum() {

		return "/multipleUpload";
	}

	@RequestMapping(value = "/multipleSave", method = RequestMethod.POST)
	public  String multipleSave(
			@RequestParam("file") MultipartFile[] files,
			@RequestParam("id") String id) {

		Update Update = new Update();

		Bien bien = new Bien();

		bien = bienService.consulterBien(Integer.valueOf(id));
		System.out.println(true + id);
		String fileName = null;
		String msg = "";
		if (files != null && files.length > 0) {
			for (int i = 0; i < files.length; i++) {
				String name ="";
				try {
					fileName = files[i].getOriginalFilename();
					MultipartFile file = files[i];
					 name = Update.addVideo(file);
					Album Album = new Album();
					Album.setBien(bien);
					Album.setPathAlbum(URIConstants.url_depot+name);
					
					albumService.modifierAlbum(Album);

				} catch (Exception e) {
					return "You failed to upload " + name + ": "
							+ e.getMessage() + "<br/>";
				}
			}
			//return msg;
		} else {
			//return "Unable to upload. File is empty.";
		}

		return "redirect:/viewAlbums";
	}

	@RequestMapping(value = { "/uploadFile" }, method = RequestMethod.POST)
	public String uploadFileHandler(@RequestParam("name") String name,
			@RequestParam("file") MultipartFile file) {

		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();

				// Creating the directory to store file
				String rootPath = System.getProperty("catalina.home");
				File dir = new File(rootPath + File.separator + "tmpFiles");
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
				File serverFile = new File(dir.getAbsolutePath()
						+ File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();

				logger.info("Server File Location="
						+ serverFile.getAbsolutePath());

				return "You successfully uploaded file=" + name;
			} catch (Exception e) {
				return "You failed to upload " + name + " => " + e.getMessage();
			}
		} else {
			return "You failed to upload " + name
					+ " because the file was empty.";
		}
	}

	/**
	 * Upload multiple file using Spring Controller
	 */
	@RequestMapping(value = "/uploadMultipleFile", method = RequestMethod.POST)
	public String uploadMultipleFileHandler(
			@RequestParam("name") String[] names,
			@RequestParam("file") MultipartFile[] files) {

		if (files.length != names.length)
			return "Mandatory information missing";

		String message = "";
		for (int i = 0; i < files.length; i++) {
			MultipartFile file = files[i];
			String name = names[i];
			try {
				byte[] bytes = file.getBytes();

				// Creating the directory to store file
				String rootPath = System.getProperty("catalina.home");
				File dir = new File("/Users/halleymax/Desktop/dossier"
						+ File.separator + "tmpFiles");
				if (!dir.exists())
					dir.mkdirs();

				// Create the file on server
				File serverFile = new File(dir.getAbsolutePath()
						+ File.separator + name);
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();

				logger.info("Server File Location="
						+ serverFile.getAbsolutePath());

				message = message + "You successfully uploaded file=" + name
						+ "<br />";
			} catch (Exception e) {
				return "You failed to upload " + name + " => " + e.getMessage();
			}
		}
		return "up";
	}
}
