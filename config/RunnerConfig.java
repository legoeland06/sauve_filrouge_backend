package com.example.demo.config;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.DateTimeAtProcessing;

import com.example.demo.dao.AdresseRepository;
import com.example.demo.dao.CategorieRepository;
import com.example.demo.dao.CommandeRepository;
import com.example.demo.dao.EmailRepository;
import com.example.demo.dao.EntrepriseRepository;
import com.example.demo.dao.FormateurRepository;
import com.example.demo.dao.FormationRepository;
import com.example.demo.dao.InternauteRepository;
import com.example.demo.dao.LienTestRepository;
import com.example.demo.dao.NiveauRepository;
import com.example.demo.dao.TelephoneRepository;
import com.example.demo.entities.Adresse;
import com.example.demo.entities.Client;
import com.example.demo.entities.Commande;
import com.example.demo.entities.Email;
import com.example.demo.entities.Entreprise;
import com.example.demo.entities.Formation;
import com.example.demo.entities.Internaute;
import com.example.demo.entities.Niveau;
import com.example.demo.entities.Telephone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerConfig implements CommandLineRunner {

	@Autowired
	private TelephoneRepository tl;

	@Autowired
	private NiveauRepository nvRepository;

	@Autowired
	private AdresseRepository adrRepository;

	@Autowired
	private InternauteRepository internauteRepository;
	
	@Autowired
	private EntrepriseRepository entrepriseRepository;

	@Autowired
	private CommandeRepository cmdRepository;

	@Autowired
	private CategorieRepository catRepository;
	
	@Autowired
	private EmailRepository emailRepository;
	
	@Autowired
	private FormationRepository fmRepository;

	@Autowired
	private FormateurRepository frRepository;

	@Autowired
	private LienTestRepository ltRepository;

	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		nvRepository.save(new Niveau("xs"));
		nvRepository.save(new Niveau("s"));
		nvRepository.save(new Niveau("m"));
		nvRepository.save(new Niveau("ml"));
		nvRepository.save(new Niveau("l"));
		nvRepository.save(new Niveau("xl"));
		nvRepository.save(new Niveau("xxl"));
		
		List<Adresse> adresses1 = new ArrayList<Adresse>();
		List<Adresse> adresses2 = new ArrayList<Adresse>();

		Adresse adresse1 = new Adresse();
		Adresse adresse2 = new Adresse();
		Adresse adresse3 = new Adresse();
		Adresse adresse4 = new Adresse();

		adresse1.setRue("rue de la pissiculture");
		adresse1.setCp("83790");
		adresse1.setVille("Pignans");
		adresse1.setPays("france");
		adrRepository.save(adresse1);

		adresse2.setRue("avenue St Roch");
		adresse2.setCp("06100");
		adresse2.setVille("Nice");
		adresse2.setPays("france");
		adrRepository.save(adresse2);

		adresse3.setRue("chemin de troie");
		adresse3.setCp("75000");
		adresse3.setVille("Paris 1");
		adresse3.setPays("france");
		adrRepository.save(adresse3);

		adresse4.setRue("boulevard René Cassin");
		adresse4.setCp("13127");
		adresse4.setVille("Marseille");
		adresse4.setPays("france");
		adrRepository.save(adresse4);

		adresses1.add(adresse1);
		adresses1.add(adresse2);

		adresses2.add(adresse3);
		adresses2.add(adresse4);
		
		Internaute internaute = new Internaute("Eric", "bruneau");
		internaute.setEmail(new Email("ericbruneau@gmail.com"));
		
		//internaute.setAdresses(adresses1);
		Commande commande = new Commande();
		commande.setSolde(44425D);
		commande.setFormation(new Formation("JAVA JEE","Devellopement SPRING BOOT"));
		cmdRepository.save(commande);
		
		internaute.setCurrentCommande(commande);
		internauteRepository.save(internaute);
		
		Entreprise entreprise = new Entreprise();
		entreprise.setRaisonSociale("LE MONDE DES BISOUNOURS");
		entreprise.setContactEntrepriseNom("LEMOINS");
		entreprise.setContactEntreprisePrenom("ludovic");
		//entreprise.setAdresses(adresses2);
		
		entrepriseRepository.save(entreprise);
		
		internauteRepository.save(new Internaute("Sophia", "calage"));
		internauteRepository.save(new Internaute("Jerome", "leclerc"));
		internauteRepository.save(new Internaute("Charles", "saugier"));
		internauteRepository.save(new Internaute("Loubna", "rameur"));
		internauteRepository.save(new Internaute("marwa", "carre"));
		internauteRepository.save(new Internaute("julie", "solies"));
		
		System.out.println("*******************************************************");
		internauteRepository.findAll().forEach((p)->{
			System.out.println(p.getNom()+", "+p.getPrenom());
		});
		
		System.out.println("*******************************************************");
		cmdRepository.findAll().forEach((c)->{
			Formation formation = c.getFormation();
			System.out.println(formation.getIntitule().toString()+", "+formation.getDescriptif()+" : "+ (c.getSolde().toString()));
		});
		
		
		
//		Telephone t1 = new Telephone("0456251548");
//		tl.save(t1);
//
//		Internaute internaute = new Internaute("Bruneau", "Eric");
//
//		Email email = new Email("ericbruneau@gmail.com");
//		internaute.setEmail(email);
//
//		List<Adresse> adresses1 = new ArrayList<Adresse>();
//		List<Adresse> adresses2 = new ArrayList<Adresse>();
//
//		Adresse adresse1 = new Adresse();
//		Adresse adresse2 = new Adresse();
//		Adresse adresse3 = new Adresse();
//		Adresse adresse4 = new Adresse();
//
//		adresse1.setRue("rue de la pissiculture");
//		adresse1.setCp("83790");
//		adresse1.setVille("Pignans");
//		adresse1.setPays("france");
//
//		adresse2.setRue("avenue St Roch");
//		adresse2.setCp("06100");
//		adresse2.setVille("Nice");
//		adresse2.setPays("france");
//
//		adresse3.setRue("chemin de troie");
//		adresse3.setCp("75000");
//		adresse3.setVille("Paris 1");
//		adresse3.setPays("france");
//
//		adresse4.setRue("boulevard René Cassin");
//		adresse4.setCp("13127");
//		adresse4.setVille("Marseille");
//		adresse4.setPays("france");
//
//		adresses1.add(adresse1);
//		adresses1.add(adresse2);
//
//		adresses2.add(adresse3);
//		adresses2.add(adresse4);
//
//		internaute.setAdresses(adresses1);
//
//		Entreprise entreprise = new Entreprise();
//
//		entreprise.setRaisonSociale("Lego e land");
//
//		Telephone telephone1 = new Telephone("0625415245");
//		Telephone telephone2 = new Telephone("0452136585");
//		Telephone telephone3 = new Telephone("0956525415");
//		Telephone telephone4 = new Telephone("0624515878");
//
//		List<Telephone> telephones1 = new ArrayList<Telephone>();
//		List<Telephone> telephones2 = new ArrayList<Telephone>();
//
//		telephones1.add(telephone1);
//		telephones1.add(telephone2);
//		
//		telephones2.add(telephone3);
//		telephones2.add(telephone4);
//
//		entreprise.setTelephones(telephones1);
//
//		entreprise.setAdresses(adresses2);
//
//		entrepriseRepository.save(entreprise);
//		
//		Niveau niveau= new Niveau("xl");
//		internaute.setNiveau(niveau);
//		
//		internaute.setPassword("gjdgjreb,ntglsmj:;d");
//		internaute.setTelephones(telephones1);
//
//		internauteRepository.save(internaute);	
//		
//		Commande commande = new Commande();
//		commande.setSolde(44000D);
//		commande.setDateValidation(new Date(0));

	}

//	@Autowired
//	private TelephoneRepository tl;
//
//	@Autowired
//	private InternauteRepository it;
//
//	@Autowired
//	private AdresseRepository addr;
//
//	@Autowired
//	private EmailRepository em;
//
//	@Autowired
//	private CategorieRepository ct;
//
//	@Autowired
//	private NiveauRepository nv;
//
//	@Autowired
//	private EntrepriseRepository entr;
//
//	@Autowired
//	private FormationRepository fm;
//
//	@Autowired
//	private FormateurRepository fr;
//
//	@Autowired
//	private LienTestRepository lt;
//
//	@Autowired
//	private CommandeRepository cm;
//	
//	@Override
//	public void run(String... args) throws Exception {
//
//		
//
//		Email em1 = (new Email("sophiaseller@gmail.com"));
//		Email em2 = (new Email("strauss-khan@gmail.com"));
//		Email em3 = (new Email("jacquesdutronc@gmail.com"));
//		Email em4 = (new Email("silvielarmoire@gmail.com"));
//		Email em5 = (new Email("rogerrabbit@gmail.com"));
//		Email em6 = (new Email("talarondelphine@gmail.com"));
//		Email em7 = (new Email("regislecon@gmail.com"));
//		
//		em.save(em1);
//		em.save(em2);
//		em.save(em3);
//		em.save(em4);
//		em.save(em5);
//		em.save(em6);
//		em.save(em7);
//
//		LienTest lt1 = (new LienTest("http://www.just-training/lien1"));
//		LienTest lt2 = (new LienTest("http://www.just-training/lien2"));
//		LienTest lt3 = (new LienTest("http://www.just-training/lien3"));
//		LienTest lt4 = (new LienTest("http://www.just-training/lien4"));
//		LienTest lt5 = (new LienTest("http://www.just-training/lien5"));
//		LienTest lt6 = (new LienTest("http://www.just-training/lien6"));
//		LienTest lt7 = (new LienTest("http://www.just-training/lien7"));
//		LienTest lt8 = (new LienTest("http://www.just-training/lien8"));
//		LienTest lt9 = (new LienTest("http://www.just-training/lien9"));
//		LienTest lt10 = (new LienTest("http://www.just-training/lienA"));
//		LienTest lt11 = (new LienTest("http://www.just-training/lienB"));
//		LienTest lt12 = (new LienTest("http://www.just-training/lienC"));
//		LienTest lt13 = (new LienTest("http://www.just-training/lienD"));
//		LienTest lt14 = (new LienTest("http://www.just-training/lienE"));
//		LienTest lt15 = (new LienTest("http://www.just-training/lienF"));
//		
//		lt.save(lt1);
//		lt.save(lt2);
//		
//
//		Telephone t1 = (new Telephone("0456251548"));
//		Telephone t2 = (new Telephone("6525452175"));
//		Telephone t3 = (new Telephone("4253658575"));
//		Telephone t4 = (new Telephone("5465857544"));
//		Telephone t5 = (new Telephone("0456251548"));
//		Telephone t6 = (new Telephone("2254668898"));
//		Telephone t7 = (new Telephone("5544332266"));
//		Telephone t8 = (new Telephone("5487658548"));
//		Telephone t9 = (new Telephone("2312546598"));
//		Telephone t10 = (new Telephone("6352418596"));
//		Telephone t11 = (new Telephone("4152637485"));
//		Telephone t12 = (new Telephone("8574524136"));
//		Telephone t13 = (new Telephone("2452368596"));
//		Telephone t14 = (new Telephone("6875423568"));
//		Telephone t15 = (new Telephone("1425368978"));
//		Telephone tl6 = (new Telephone("5487452365"));
//		
//		tl.save(t1);
//
//		Categorie ct1 = (new Categorie("Informatique",null,null) );
//		Categorie ct2 = (new Categorie("Développement Personnel", null, null));
//		Categorie ct3 = (new Categorie("Commerce", null, null));
//		Categorie ct4 = (new Categorie("Gestion de Projets", null, null));
//		Categorie ct5 = (new Categorie("Ressources Humaines", null, null));
//		Categorie ct6 = (new Categorie("Réseaux", null, null));
//		Categorie ct7 = (new Categorie("Sécurité", null, null));
//		Categorie ct8 = (new Categorie("Systèmes de Bases de Données", null, null));
//		Categorie ct9 = (new Categorie("Graphisme CAO DAO", null, null));
//		Categorie ct10 = (new Categorie("Développement", null, null));
//		Categorie ct11= (new Categorie("Java JEE", null, null));
//		Categorie ct12= (new Categorie("Front-End", null, null));
//		Categorie ct13= (new Categorie("Back-End", null, null));
//		Categorie ct14= (new Categorie("HTML CSS JAVASCRIPT", null, null));
//		Categorie ct15= (new Categorie("TYPESCRIPT ANGULAR JSON", null, null));
//		Categorie ct16= (new Categorie("Java SpringBoot", null, null));
//		Categorie ct17= (new Categorie("Scrum Développement", null, null));
//		Categorie ct18= (new Categorie("Agile", null, null));
//		
//		ct.save(ct1);
//		
//		Adresse addr1  = (new Adresse("rue de la pome", "06532", "nice", "france"));
//		Adresse addr2  = (new Adresse("rue de la pome", "99564", "madrid", "Espagne"));
//		Adresse addr3  = (new Adresse("rue de la pome", "99587", "venise", "Italie"));
//		Adresse addr4  = (new Adresse("rue de la pome", "83245", "toulon", "france"));
//		Adresse addr5  = (new Adresse("rue de la pome", "06520", "antibes", "france"));
//		Adresse addr6  = (new Adresse("rue de la pome", "06500", "vence", "france"));
//		Adresse addr7  = (new Adresse("rue de la pome", "06544", "grasse", "france"));
//		Adresse addr8  = (new Adresse("rue de la pome", "06524", "valbonne", "france"));
//		Adresse addr9  = (new Adresse("rue de la pome", "06530", "sophia-antipolis", "france"));
//		Adresse addr10  = (new Adresse("rue de la pome", "06600", "nice", "france"));
//
//		addr.save(addr1);
//		
//		Formation fm1 = (new Formation("Devenez Scrum Developpeur", "La méthode Agile poussée à l'extrem-programming"));
//		Formation fm2 = (new Formation("Developpez votre force de vente", "se faire comprendre et comprendre le client"));
//		Formation fm3 = (new Formation("Administrateur Réseaux", "Veille, sauvegarde, traitement des logs"));
//		Formation fm4 = (new Formation("3DStudio Max", "Dessinez vos projets 3D"));
//		Formation fm5 = (new Formation("Unreal Engine", "Réalisez vous-même vos animations 3D"));
//		Formation fm6 = (new Formation("Blender programming", "développez sous Blender avec Python 2.7"));
//
//		fm.save(fm1);
//		
//		Formateur fr1 = (new Formateur("Majax", "Gerard"));
//		Formateur fr2 = (new Formateur("Menvussa", "chirstelle"));
//		Formateur fr3 = (new Formateur("Roger", "Simonit"));
//		Formateur fr4 = (new Formateur("Talas", "Marie"));
//		Formateur fr5 = (new Formateur("souffi", "marwa"));
//		Formateur fr6 = (new Formateur("callet", "jeremi"));
//		Formateur fr7 = (new Formateur("laconasse", "sandra"));
//		Formateur fr8 = (new Formateur("PoteDansMaPoche", "Jessica"));
//
//		fr.save(fr1);
//		
//		Entreprise entr1 = (new Entreprise("Lessieur"));
//		Entreprise entr2 = (new Entreprise("Boudier"));
//		Entreprise entr3 = (new Entreprise("IbFormations"));
//		Entreprise entr4 = (new Entreprise("JavaxEnterprise"));
//		Entreprise entr5 = (new Entreprise("ABACAR"));
//		Entreprise entr6 = (new Entreprise("CENTOS"));
//		Entreprise entr7 = (new Entreprise("Messier"));
//		Entreprise entr8 = (new Entreprise("carreer"));
//		Entreprise entr9 = (new Entreprise("chantiel"));
//		
//		entr.save(entr1);
//		
//		Internaute it1 = (new Internaute("Strauss-Khan", "Domi-nique"));
//		Internaute it2 = (new Internaute("Mitterand", "Fredéric"));
//		Internaute it3 = (new Internaute("Epstein", "Jeffrey"));
//		Internaute it4 = (new Internaute("Epstein", "Jeffrey"));
//		
//		it.save(it1);
//		
//		Commande cmd1= new Commande(it1, null, 45);
//		Commande cmd2= new Commande(it2, null, 45);
//		Commande cmd3= new Commande(it3, null, 45);
//		Commande cmd4= new Commande(it4, null, 45);
////		
//		cm.save(cmd1);
//		cm.save(cmd2);
//		cm.save(cmd3);
//		cm.save(cmd4);

//	}
}