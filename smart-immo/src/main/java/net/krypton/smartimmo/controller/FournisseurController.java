package net.krypton.smartimmo.controller;

import java.util.List;

import javax.validation.Valid;

import net.krypton.smartimmo.entities.Bien;
import net.krypton.smartimmo.entities.Disponibilite;
import net.krypton.smartimmo.entities.Fournisseur;
import net.krypton.smartimmo.entities.SousCategorie;
import net.krypton.smartimmo.entities.TypeOffre;
import net.krypton.smartimmo.entities.Ville;
import net.krypton.smartimmo.model.MdpModel;
import net.krypton.smartimmo.model.ModifierFourModel;
import net.krypton.smartimmo.model.Test;
import net.krypton.smartimmo.service.AgenceService;
import net.krypton.smartimmo.service.BienService;
import net.krypton.smartimmo.service.DisponibiliteService;
import net.krypton.smartimmo.service.FournisseurService;
import net.krypton.smartimmo.service.SousCategorieService;
import net.krypton.smartimmo.service.TypeOffreService;
import net.krypton.smartimmo.service.VilleService;
import net.krypton.smartimmo.service.Impl.UserDetailsServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.security.core.userdetails.User;

@Controller
public class FournisseurController {

	@Autowired
	FournisseurService fournisseurService;
	@Autowired
	AgenceService agenceService;

	@Autowired
	BienService bienService;

	@Autowired
	TypeOffreService typeOffreService;

	@Autowired
	VilleService villeService;

	@Autowired
	SousCategorieService sousCategorieService;

	@Autowired
	DisponibiliteService disponibiliteService;

	Test Test = new Test();

	@RequestMapping(value = "/saveFournisseur", method = RequestMethod.POST)
	public String enregistrerFournisseur(@Valid Fournisseur v,
			BindingResult result, ModelMap model) {
		v.setMdpFournisseur(Test.md5(v.getMdpFournisseur()));
		fournisseurService.ajouterFournisseur(v);
		return "login";
	}

	@RequestMapping(value = "/saveFournisseur", method = RequestMethod.GET)
	public String newFournisseur(ModelMap model) {
		Fournisseur fournisseur = new Fournisseur();
		model.addAttribute("formFournisseur", fournisseur);

		return "form-inscriptionParticulier";
	}

	@RequestMapping(value = "/secure-deleteFournisseur-{idFournisseur}")
	public String supprimerFournisseur(@PathVariable int idFournisseur) {

		fournisseurService.supprimerFournisseur(idFournisseur);
		return "redirect:/viewFournisseurs";
	}

	// MODIFICATION DES INFOS PERSO DU FOURNISSEUR
	@RequestMapping(value = "/secure-modifyFournisseur-{idFour}", method = RequestMethod.GET)
	public String editFournisseur(@PathVariable int idFour, ModelMap model) {
		Fournisseur f = fournisseurService.consulterFournisseur(idFour);
		ModifierFourModel mfm = new ModifierFourModel();
		mfm.setEmailFournisseur(f.getEmailFournisseur());
		mfm.setNomFournisseur(f.getNomFournisseur());
		mfm.setPseudoFournisseur(f.getPseudoFournisseur());
		mfm.setTelMobileFournisseur(f.getTelMobileFournisseur());
		model.addAttribute("fFournisseur", mfm);
		return "mesDonnees";
	}

	@RequestMapping(value = "/secure/modifyFournisseur-{idFour}", method = RequestMethod.POST)
	public String modifierFournisseur(@Valid ModifierFourModel mfm,
			BindingResult result, ModelMap model, @PathVariable int idFour) {
		Fournisseur f = fournisseurService.consulterFournisseur(idFour);
		f.setEmailFournisseur(mfm.getEmailFournisseur());
		f.setNomFournisseur(mfm.getNomFournisseur());
		f.setPseudoFournisseur(mfm.getPseudoFournisseur());
		f.setTelMobileFournisseur(mfm.getTelMobileFournisseur());
		fournisseurService.modifierFournisseur(f);
		model.addAttribute("fFournisseur", mfm);
		return "mesDonnees";
	}

	// MODIFICATION MOT DE PASSE DU FOURNISSEUR
	@RequestMapping(value = "/secure/modifyMdpFournisseur", method = RequestMethod.GET)
	public String modifierMdpFournisseur(ModelMap model) {
		User user = (User) SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		// String name = user.getClass(); // get logged in username

		Fournisseur f = new Fournisseur();
		f = fournisseurService.consulterFournisseurByName(user.getUsername());
		MdpModel mdp = new MdpModel();
		mdp.setMdpHideFournisseur(f.getMdpFournisseur());
		model.addAttribute("mdpForm", mdp);
		return "password";
	}

	@RequestMapping(value = "/secure/modifyMdpFournisseur-{idFour}", method = RequestMethod.POST)
	public String modifierMdpFournisseur(@Valid MdpModel mdp,
			BindingResult result, ModelMap model) {
		User user = (User) SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		// String name = user.getClass(); // get logged in username

		Fournisseur f = new Fournisseur();
		f = fournisseurService.consulterFournisseurByName(user.getUsername());

		if (f.getMdpFournisseur().equals(mdp.getMdpFournisseur())) {
			f.setMdpFournisseur(mdp.getNewMdpFournisseur());
		}
		fournisseurService.modifierFournisseur(f);
		model.addAttribute("mdpForm", mdp);
		return "password";
	}

	@RequestMapping(value = "/link")
	public String link() {

		return "redirect:/secure/profiles";
	}

	@RequestMapping(value = "/secure/profiles", method = RequestMethod.GET)
	public String grt(Model model) {

		User user = (User) SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		// String name = user.getClass(); // get logged in username

		Fournisseur Fournisseur = new Fournisseur();
		Fournisseur = fournisseurService.consulterFournisseurByName(user
				.getUsername());

		model.addAttribute("fFournisseur", Fournisseur);

		return "mesDonnees";

	}

	@RequestMapping(value = "/secure-profile-{idFour}", method = RequestMethod.POST)
	public String update(@Valid ModifierFourModel mf, BindingResult result,
			ModelMap model, @PathVariable int idFour) {

		Fournisseur f = new Fournisseur();
		f = fournisseurService.consulterFournisseur(idFour);
		f.setEmailFournisseur(mf.getEmailFournisseur());
		f.setNomFournisseur(mf.getNomFournisseur());
		f.setPseudoFournisseur(mf.getPseudoFournisseur());
		f.setTelMobileFournisseur(mf.getTelMobileFournisseur());

		model.addAttribute("fFournisseur", mf);
		fournisseurService.modifierFournisseur(f);
		// AJOUT DE BIEN PAR LE FOURNISSEUR POST
		// ******************************

		return "mesDonnees";

	}

	@RequestMapping(value = "/secure-profile-{idFour}", method = RequestMethod.GET)
	public String update(ModelMap model, @PathVariable int idFour) {
		ModifierFourModel mf = new ModifierFourModel();
		Fournisseur f = new Fournisseur();

		f = fournisseurService.consulterFournisseur(idFour);
		mf.setEmailFournisseur(f.getEmailFournisseur());
		mf.setNomFournisseur(f.getNomFournisseur());
		mf.setPseudoFournisseur(f.getPseudoFournisseur());
		mf.setTelMobileFournisseur(f.getTelMobileFournisseur());
		model.addAttribute("fFournisseur", mf);

		return "mesDonnees";

	}

	// LES METHODES POUR L AJOUT DU BIEN PAR LE FOURNISSEUR

	public Bien findBienByTitre(String titre) {
		List<Bien> biens = bienService.consulterBiens();
		Bien bien = new Bien();
		for (int i = 0; i < biens.size(); i++) {
			Bien b = new Bien();
			b = biens.get(i);
			if (b.getTitreBien().equals(titre)) {
				bien = b;
			}
		}
		return bien;
	}

	public Ville findVilleByName(String ville) {
		List<Ville> villes = villeService.consulterVilles();
		Ville Ville = new Ville();
		for (int i = 0; i < villes.size(); i++) {
			Ville V = new Ville();
			V = villes.get(i);

			if (V.getLibelleVille().equals(ville)) {
				Ville = V;
			}
		}
		return Ville;
	}

	public TypeOffre findTypeOffreByLibelle(String tofre) {
		List<TypeOffre> TypeOffres = typeOffreService.consulterTypeOffres();
		TypeOffre TypeOffre = new TypeOffre();
		for (int i = 0; i < TypeOffres.size(); i++) {
			TypeOffre T = new TypeOffre();
			T = TypeOffres.get(i);

			if (T.getLibelleTypeOffre().equals(tofre)) {
				TypeOffre = T;
			}
		}
		return TypeOffre;
	}

	public SousCategorie findSousCategorieByLibelle(String scat) {
		List<SousCategorie> SousCategories = sousCategorieService
				.consulterSousCategories();
		SousCategorie SousCategorie = new SousCategorie();
		for (int i = 0; i < SousCategories.size(); i++) {
			SousCategorie S = new SousCategorie();
			S = SousCategories.get(i);

			if (S.getLibelleSousCategorie().equals(scat)) {
				SousCategorie = S;
			}
		}
		return SousCategorie;
	}

	public Fournisseur findFournisseurByNom(String nom) {
		List<Fournisseur> Fournisseurs = fournisseurService
				.consulterFournisseurs();
		Fournisseur Fournisseur = new Fournisseur();
		for (int i = 0; i < Fournisseurs.size(); i++) {
			Fournisseur F = new Fournisseur();
			F = Fournisseurs.get(i);

			if (F.getNomFournisseur().equals(nom)) {
				Fournisseur = F;
			}
		}
		return Fournisseur;
	}

	public Disponibilite findDisponibiliteByLibelle(String libDispo) {
		List<Disponibilite> disponibilites = disponibiliteService
				.consulterDisponibilites();
		Disponibilite Disponibilite = new Disponibilite();
		for (int i = 0; i < disponibilites.size(); i++) {
			Disponibilite D = new Disponibilite();
			D = disponibilites.get(i);

			if (D.getLibelleDisponibilite().equals(libDispo)) {
				Disponibilite = D;
			}
		}
		return Disponibilite;
	}

}
