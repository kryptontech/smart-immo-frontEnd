package net.krypton.smartimmo;

import java.util.ArrayList;
import java.util.List;

import net.krypton.smartimmo.entities.Bien;
import net.krypton.smartimmo.service.BienService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
@Controller
public class AllMethods {
	
	
	private final double PRIX_MAX = 2000000000;
	private final double PRIX_MIN = 0;
	
	@Autowired
	BienService bienService;
	
	
	public List<Bien> listeDesBiensParTypeOffre(String libTO)
	{
		
		List<Bien> biens = new ArrayList<Bien>();
				
		biens = 	bienService.consulterBiens();
		
		System.out.println(biens.size());
		List<Bien> listBiens = new ArrayList<Bien>();
		
		for (int i=0; i < biens.size(); i++)
		{
			Bien b = new Bien();
			b = biens.get(i);
			if (b.getTypeoffre().getLibelleTypeOffre().equals(libTO))
			{
				listBiens.add(i, b);
			}
		}
		return listBiens;
	}
	
	
	public List<Bien> listeDesBiensParQuartier(String libTO, String quartier)
	{
		
		List<Bien> biens = listeDesBiensParTypeOffre(libTO);
		List<Bien> listBiens = new ArrayList<Bien>();
		
		for (int i=0; i < biens.size(); i++)
		{
			Bien b = new Bien();
			b = biens.get(i);
			if (b.getQuartierBien().equals(quartier))
			{
				listBiens.add(i, b);
			}
		}
		return listBiens;
	}
	
	
	public List<Bien> listeDesBiensParSousCat(String libTO, String libSousCat)
	{
		
		List<Bien> biens = listeDesBiensParTypeOffre(libTO);
		List<Bien> listBiens = new ArrayList<Bien>();
		
		for (int i=0; i < biens.size(); i++)
		{
			Bien b = new Bien();
			b = biens.get(i);
			if (b.getSousCategorie().getLibelleSousCategorie().equals(libSousCat))
			{
				listBiens.add(i, b);
			}
		}
		return listBiens;
	}
	
	
	public List<Bien> listeDesBiensParPrixBas(String libTO, double prixMin)
	{
		List<Bien> biens = listeDesBiensParTypeOffre(libTO);
		List<Bien> listBiens = new ArrayList<Bien>();
		for (int i=0; i < biens.size(); i++)
		{
			Bien b = new Bien();
			b = biens.get(i);
			double prix = b.getPrixBien();
			if ((prix >= prixMin) && (prix <= PRIX_MAX))
			{
				listBiens.add(i, b);
			}
		}
		return listBiens;
	}
	
	
	public List<Bien> listeDesBiensParPrixMax(String libTO, double prixMax)
	{
		List<Bien> biens = listeDesBiensParTypeOffre(libTO);
		List<Bien> listBiens = new ArrayList<Bien>();
		for (int i=0; i < biens.size(); i++)
		{
			Bien b = new Bien();
			b = biens.get(i);
			double prix = b.getPrixBien();
			if ((prix <= prixMax) && (prix >= PRIX_MIN))
			{
				listBiens.add(i, b);
			}
		}
		return listBiens;
	}
	
	
	public List<Bien> listeDesBiensParVille(String libTO, String libVille)
	{
		List<Bien> biens = listeDesBiensParTypeOffre(libTO);
		List<Bien> listBiens = new ArrayList<Bien>();
		
		for (int i=0; i < biens.size(); i++)
		{
			Bien b = new Bien();
			b = biens.get(i);
			if (b.getVille().getLibelleVille().equals(libVille))
			{
				listBiens.add(i, b);
			}
		}
		return listBiens;
	}
	
	
	public List<Bien> listeDesBiensParVilleEtSousCat(String libTO, String libVille, String libSousCat)
	{
		List<Bien> biens = listeDesBiensParTypeOffre(libTO);
		List<Bien> listBiens = new ArrayList<Bien>();
		
		for (int i=0; i < biens.size(); i++)
		{
			Bien b = new Bien();
			b = biens.get(i);
			if (b.getVille().getLibelleVille().equals(libVille)) {
				if  (b.getSousCategorie().getLibelleSousCategorie().equals(libSousCat)){
						listBiens.add(i, b);
				}
			}
		}
		return listBiens;
	}
	
	public List<Bien> listeDesBiensParVilleEtQuartier(String libTO, String libVille, String quartier)
	{
		List<Bien> biens = listeDesBiensParTypeOffre(libTO);
		List<Bien> listBiens = new ArrayList<Bien>();
		
		for (int i=0; i < biens.size(); i++)
		{
			Bien b = new Bien();
			b = biens.get(i);
			if (b.getVille().getLibelleVille().equals(libVille)) {
				if  (b.getQuartierBien().equals(quartier)){
						listBiens.add(i, b);
				}
			}
		}
		return listBiens;
	}
	
	public List<Bien> listeDesBiensParVilleSousCatEtQuartier(String libTO, String libVille, String libSousCat, String quartier)
	{
		List<Bien> BVS = listeDesBiensParVilleEtSousCat(libTO, libVille, libSousCat);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  Bien b = new Bien();
			  b = BVS.get(i);
			  if (b.getQuartierBien().equals(quartier))
			  {
				  listBiens.add(i, b);
			  }
		  }
		  return listBiens; 
	}
	
	public List<Bien> listeDesBiensParSousCatEtQuartier(String libTO, String libSousCat, String quartier)
	{
		List<Bien> biens = listeDesBiensParTypeOffre(libTO);
		List<Bien> listBiens = new ArrayList<Bien>();
		
		for (int i=0; i < biens.size(); i++)
		{
			Bien b = new Bien();
			b = biens.get(i);
			if (b.getSousCategorie().getLibelleSousCategorie().equals(libSousCat)) {
				if  (b.getQuartierBien().equals(quartier)){
						listBiens.add(i, b);
				}
			}
		}
		return listBiens;
	}
	
	////////////////////////////////////////////
	public List<Bien> listeDesBiensQuartierEtPrixMin(String libTO, String quartier, double prixMin)
	{
		List<Bien> BVS = listeDesBiensParQuartier(libTO, quartier);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  	Bien b = new Bien();
				b = BVS.get(i);
				double prix = b.getPrixBien();
				if ((prix <= PRIX_MAX) && (prix >= prixMin))
				{
					listBiens.add(i, b);
				}
		  }
		  return listBiens; 
	}
	////////////////////////////////////////	
	public List<Bien> listeDesBiensQuartierEtPrixMax(String libTO, String quartier, double prixMax)
	{
		List<Bien> BVS = listeDesBiensParQuartier(libTO, quartier);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  Bien b = new Bien();
				b = BVS.get(i);
				double prix = b.getPrixBien();
				if ((prix <= prixMax) && (prix >= PRIX_MIN))
				{
					listBiens.add(i, b);
				}
		  }
		  return listBiens; 
	}
		
	///////2
	public List<Bien> listeDesBiensParVilleSousCatQuartierEtPrixMin(String libTO, String libVille, String libSousCat, String quartier, double prixMin)
	{
		List<Bien> BVS = listeDesBiensParVilleSousCatEtQuartier(libTO, libVille, libSousCat, quartier);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  	Bien b = new Bien();
				b = BVS.get(i);
				double prix = b.getPrixBien();
				if ((prix <= PRIX_MAX) && (prix >= prixMin))
				{
					listBiens.add(i, b);
				}
		  }
		  return listBiens; 
	}
	
	//////3
	public List<Bien> listeDesBiensParVilleSousCatQuartierEtPrixMax(String libTO, String libVille, String libSousCat, String quartier, double prixMax)
	{
		List<Bien> BVS = listeDesBiensParVilleSousCatEtQuartier(libTO, libVille, libSousCat, quartier);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  	Bien b = new Bien();
				b = BVS.get(i);
				double prix = b.getPrixBien();
				if ((prix >= PRIX_MIN) && (prix <= prixMax))
				{
					listBiens.add(i, b);
				}
		  }
		  return listBiens; 
	}
	
	//////4
	public List<Bien> listeDesBiensParVilleSousCatQuartierEtPrix(String libTO, String libVille, String libSousCat, String quartier,  double prixMin, double prixMax)
	{
		List<Bien> BVS = listeDesBiensParVilleSousCatEtQuartier(libTO, libVille, libSousCat, quartier);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  	Bien b = new Bien();
				b = BVS.get(i);
				double prix = b.getPrixBien();
				if ((prix >= prixMin) && (prix <= prixMax))
				{
					listBiens.add(i, b);
				}
		  }
		  return listBiens; 
	}
	
	/////500000000000000
	public List<Bien> listeDesBiensParVilleQuartierEtPrix(String libTO, String libVille, String quartier,  double prixMin, double prixMax)
	{
		List<Bien> BVS = listeDesBiensParVilleEtQuartier(libTO, libVille, quartier);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  	Bien b = new Bien();
				b = BVS.get(i);
				double prix = b.getPrixBien();
				if ((prix >= prixMin) && (prix <= prixMax))
				{
					listBiens.add(i, b);
				}
		  }
		  return listBiens; 
	}
	
	
	////0000000000000
	public List<Bien> listeDesBiensParSousCatQuartierEtPrix(String libTO, String libSousCat, String quartier,  double prixMin, double prixMax)
	{
		List<Bien> BVS = listeDesBiensParSousCatEtQuartier(libTO, libSousCat, quartier);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  	Bien b = new Bien();
				b = BVS.get(i);
				double prix = b.getPrixBien();
				if ((prix >= prixMin) && (prix <= prixMax))
				{
					listBiens.add(i, b);
				}
		  }
		  return listBiens; 
	}
	
	////0000000000000
	public List<Bien> listeDesBiensParSousCatQuartierEtPrixMin(String libTO, String libSousCat, String quartier,  double prixMin)
	{
		List<Bien> BVS = listeDesBiensParSousCatEtQuartier(libTO, libSousCat, quartier);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  	Bien b = new Bien();
				b = BVS.get(i);
				double prix = b.getPrixBien();
				if ((prix >= prixMin) && (prix <= PRIX_MAX))
				{
					listBiens.add(i, b);
				}
		  }
		  return listBiens; 
	}
	///////////////0000000000000000000
	public List<Bien> listeDesBiensParVilleQuartierEtPrixMin(String libTO, String libVille, String quartier,  double prixMin)
	{
		List<Bien> BVS = listeDesBiensParVilleEtQuartier(libTO, libVille, quartier);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  	Bien b = new Bien();
				b = BVS.get(i);
				double prix = b.getPrixBien();
				if ((prix >= prixMin) && (prix <= PRIX_MAX))
				{
					listBiens.add(i, b);
				}
		  }
		  return listBiens; 
	}
	/////////////////////0000000000000000000000000000000
	public List<Bien> listeDesBiensParSousCatQuartierEtPrixMax(String libTO, String libSousCat, String quartier, double prixMax)
	{
		List<Bien> BVS = listeDesBiensParSousCatEtQuartier(libTO, libSousCat, quartier);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  	Bien b = new Bien();
				b = BVS.get(i);
				double prix = b.getPrixBien();
				if ((prix >= PRIX_MIN) && (prix <= prixMax))
				{
					listBiens.add(i, b);
				}
		  }
		  return listBiens; 
	}
	///////////////0000000000000000000
	public List<Bien> listeDesBiensParVilleQuartierEtPrixMax(String libTO, String libVille, String quartier, double prixMax)
	{
		List<Bien> BVS = listeDesBiensParVilleEtQuartier(libTO, libVille, quartier);
		List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVS.size(); i++)
		  {
			  	Bien b = new Bien();
				b = BVS.get(i);
				double prix = b.getPrixBien();
				if ((prix >= PRIX_MIN) && (prix <= prixMax))
				{
					listBiens.add(i, b);
				}
		  }
		  return listBiens; 
	}
	
	//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
	public List<Bien> listeDesBiensParVilleSousCatEtPrixMin(String libTO, String libVille, String libSousCat, double prixMin)
	 {
	  List<Bien> BVS = listeDesBiensParVilleEtSousCat(libTO, libVille, libSousCat);
	  List<Bien> listBiens = new ArrayList<Bien>();
	  for (int i=0; i < BVS.size(); i++)
	  {
		  Bien b = new Bien();
		  b = BVS.get(i);
		  double prix = b.getPrixBien();
		  if ((prix >= prixMin) && (prix <=PRIX_MAX))
		  {
			  listBiens.add(i, b);
		  }
	  }
	  return listBiens; 
	 }
	
	//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
	public List<Bien> listeDesBiensParVilleSousCatEtPrixMax(String libTO, String libVille, String libSousCat, double prixMax)
	 {
	  List<Bien> BVS = listeDesBiensParVilleEtSousCat(libTO, libVille, libSousCat);
	  List<Bien> listBiens = new ArrayList<Bien>();
	  for (int i=0; i < BVS.size(); i++)
	  {
		  Bien b = new Bien();
		  b = BVS.get(i);
		  double prix = b.getPrixBien();
		  if ((prix >= PRIX_MIN) && (prix <=prixMax))
		  {
			  listBiens.add(i, b);
		  }
	  }
	  return listBiens; 
	 }
	
	
	public List<Bien> listeDesBiensParVilleSousCatEtPrix(String libTO, String libVille, String libSousCat, double prixMin, double prixMax)
	 {
	  List<Bien> BVS = listeDesBiensParVilleEtSousCat(libTO, libVille, libSousCat);
	  List<Bien> listBiens = new ArrayList<Bien>();
	  for (int i=0; i < BVS.size(); i++)
	  {
		  Bien b = new Bien();
		  b = BVS.get(i);
		  double prix = b.getPrixBien();
		  if ((prix >= prixMin) && (prix <=prixMax))
		  {
			  listBiens.add(i, b);
		  }
	  }
	  return listBiens; 
	 }

	
	public List<Bien> listeDesBiensParVilletEtPrix(String libTO, String libVille, double prixMin, double prixMax) 
	{

		  List<Bien> BVP = listeDesBiensParPrix(libTO,prixMin, prixMax);
		  List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVP.size(); i++)
		  {
			  Bien b = new Bien();
			  b = BVP.get(i);
			  if (b.getVille().getLibelleVille().equals(libVille))
			  {
				  listBiens.add(i, b);
			  }
		  }
		  return listBiens; 
	}
	
	public List<Bien> listeDesBiensParSousCatEtPrix(String libTO, String libSousCat, double prixMin, double prixMax)
	{
		 List<Bien> BVP = listeDesBiensParPrix(libTO, prixMin, prixMax);
		  List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVP.size(); i++)
		  {
			  Bien b = new Bien();
			  b = BVP.get(i);
			  if (b.getVille().getLibelleVille().equals(libSousCat))
			  {
				  listBiens.add(i, b);
			  }
		  }
		  return listBiens; 
	}
	
	public List<Bien> listeDesBiensParPrix(String libTO, double prixMin, double prixMax)
	{
		List<Bien> biens = listeDesBiensParTypeOffre(libTO);
		
		List<Bien> listBiens = new ArrayList<Bien>();
		
		for (int i=0; i < biens.size(); i++)
		{
			Bien b = new Bien();
			b = biens.get(i);
			double prix = b.getPrixBien();
			if ((prix >= prixMin) && (prix <= prixMax))
			{
				listBiens.add(i, b);
			}
		}
		return listBiens;
	}

	
	
	//wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
	public List<Bien> listeDesBiensParVilleEtPrixMin(String libTO, String libVille, double prixMin)
	 {
	  List<Bien> BVS = listeDesBiensParVille(libTO, libVille);
	  List<Bien> listBiens = new ArrayList<Bien>();
	  for (int i=0; i < BVS.size(); i++)
	  {
		  Bien b = new Bien();
		  b = BVS.get(i);
		  double prix = b.getPrixBien();
		  if ((prix >= prixMin) && (prix <=PRIX_MAX))
		  {
			  listBiens.add(i, b);
		  }
	  }
	  return listBiens; 
	 }
	//wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
	public List<Bien> listeDesBiensParSousCatEtPrixMin(String libTO, String libSousCat, double prixMin)
	 {
	  List<Bien> BVS = listeDesBiensParSousCat(libTO, libSousCat);
	  List<Bien> listBiens = new ArrayList<Bien>();
	  for (int i=0; i < BVS.size(); i++)
	  {
		  Bien b = new Bien();
		  b = BVS.get(i);
		  double prix = b.getPrixBien();
		  if ((prix >= prixMin) && (prix <=PRIX_MAX))
		  {
			  listBiens.add(i, b);
		  }
	  }
	  return listBiens; 
	 }
	//wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
	public List<Bien> listeDesBiensParVilleEtPrixMax(String libTO, String libVille, double prixMax)
	 {
	  List<Bien> BVS = listeDesBiensParVille(libTO, libVille);
	  List<Bien> listBiens = new ArrayList<Bien>();
	  for (int i=0; i < BVS.size(); i++)
	  {
		  Bien b = new Bien();
		  b = BVS.get(i);
		  double prix = b.getPrixBien();
		  if ((prix >= PRIX_MIN) && (prix <=prixMax))
		  {
			  listBiens.add(i, b);
		  }
	  }
	  return listBiens; 
	 }
	//wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
	public List<Bien> listeDesBiensParSousCatEtPrixMax(String libTO, String libVille, double prixMax)
	 {
	  List<Bien> BVS = listeDesBiensParSousCat(libTO, libVille);
	  List<Bien> listBiens = new ArrayList<Bien>();
	  for (int i=0; i < BVS.size(); i++)
	  {
		  Bien b = new Bien();
		  b = BVS.get(i);
		  double prix = b.getPrixBien();
		  if ((prix >= PRIX_MIN) && (prix <=prixMax))
		  {
			  listBiens.add(i, b);
		  }
	  }
	  return listBiens; 
	 }

	public List<Bien> listeDesBiensParQuartierEtPrix(String libTO, String quartier, double prixMin, double prixMax)
	{
		List<Bien> BVP = listeDesBiensParPrix(libTO, prixMin, prixMax);
		  List<Bien> listBiens = new ArrayList<Bien>();
		  for (int i=0; i < BVP.size(); i++)
		  {
			  Bien b = new Bien();
			  b = BVP.get(i);
			  if (b.getQuartierBien().equals(quartier))
			  {
				  listBiens.add(i, b);
			  }
		  }
		  return listBiens;
	}

}
