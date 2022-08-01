package com.example.demo.config;

import java.util.ArrayList;
import java.util.List;

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
import com.example.demo.entities.Categorie;
import com.example.demo.entities.Commande;
import com.example.demo.entities.Entreprise;
import com.example.demo.entities.Formateur;
import com.example.demo.entities.Formation;
import com.example.demo.entities.Internaute;
import com.example.demo.entities.Niveau;

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

		// Catégorie INITIALE
		Categorie mere = new Categorie("Categories");
		catRepository.save(mere);
		
		Categorie dev = new Categorie("Developpement",mere);
		Categorie dev1 = new Categorie("Les bases de C++");
		Categorie dev2 = new Categorie("Appli Et Micro Services JAVA SPRING BOOT");
		Categorie dev3 = new Categorie("Appli Microsoft C# .NET");
		Categorie dev4 = new Categorie("FRONT ET BACK Avec PYTHON - DJANGO");
		Categorie dev5 = new Categorie("FRONT-END Avec ANGULAR JSON HTML5 TYPESCRIPT");
		Categorie dev6 = new Categorie("Apprendre GO");
		
		dev1.setMere(dev);
		dev2.setMere(dev);
		dev3.setMere(dev);
		dev4.setMere(dev);
		dev5.setMere(dev);
		dev6.setMere(dev);
		
		catRepository.save(dev);
		
		catRepository.save(dev1);
		catRepository.save(dev2);
		catRepository.save(dev3);
		catRepository.save(dev4);
		catRepository.save(dev5);
		catRepository.save(dev6);
		
		Categorie sgbd = new Categorie("SGBD",mere);
		Categorie sgbd1 = new Categorie("Mysql et requetes");
		Categorie sgbd2 = new Categorie("Oracle");
		Categorie sgbd3 = new Categorie("NoSql");
		Categorie sgbd4 = new Categorie("JSON-SERVER");
		sgbd1.setMere(sgbd);
		sgbd2.setMere(sgbd);
		sgbd3.setMere(sgbd);
		sgbd4.setMere(sgbd);
		
		catRepository.save(sgbd);
		catRepository.save(sgbd1);
		catRepository.save(sgbd2);
		catRepository.save(sgbd3);
		catRepository.save(sgbd4);		
		
		Categorie ia = new Categorie("IA",mere);
		Categorie ia1 = new Categorie("Réseau de neuronnes");
		Categorie ia2 = new Categorie("BigData");
		Categorie ia3 = new Categorie("Comment utiliser L'Ia");
		
		catRepository.save(ia);
		ia1.setMere(ia);
		ia2.setMere(ia);
		ia3.setMere(ia);

		Categorie softskill = new Categorie("SoftSkill",mere);
		
		Categorie caodao = new Categorie("CAO-DAO",mere);
		
		Categorie d3 = new Categorie("3D",mere);
		
		Categorie secAdm = new Categorie("Sécurité / Administration",mere);
		
		Categorie linuxAdmin = new Categorie("Linux Administration",mere);
		
		Categorie busi = new Categorie("Business",mere);
		
		Categorie devsec = new Categorie("DevSecOps",mere);
		
		catRepository.save(softskill);
		catRepository.save(caodao);
		catRepository.save(d3);
		catRepository.save(secAdm);
		catRepository.save(linuxAdmin);
		catRepository.save(busi);
		catRepository.save(devsec);


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

		Internaute internaute = new Internaute("Eric", "bruneau", "ml");
		internaute.setEmail("ericbruneau@gmail.com");

		Commande commande = new Commande();
		Commande commande1 = new Commande();
		Commande commande2 = new Commande();
		Commande commande3 = new Commande();
		commande1.setFormation(new Formation("TYPES SCRIPT", "Developpez Angular Framework"));
		commande1.setSolde(15324D);
		commande2.setFormation(new Formation("PHP", "Site Dynamique"));
		commande2.setSolde(11002D);
		commande3.setFormation(new Formation("PYTHON", "Developpez Django Framework"));
		commande.setSolde(44425D);
		commande3.setSolde(13245D);
		commande.setFormation(new Formation("JAVA JEE", "Devellopement SPRING BOOT"));
		cmdRepository.save(commande);
		cmdRepository.save(commande1);
		cmdRepository.save(commande2);
		cmdRepository.save(commande3);

		internaute.setCurrentCommande(commande);

		Entreprise entreprise = new Entreprise();
		entreprise.setRaisonSociale("LE MONDE DES BISOUNOURS");
		entreprise.setContactEntrepriseNom("LEMOINS");
		entreprise.setContactEntreprisePrenom("ludovic");
		internaute.setTelephone("0425658985");

		Internaute i1 = new Internaute("Georges", "De La Jungle", "s");
		Internaute i2 = new Internaute("Sisi", "L'impératrice", "l");
		Internaute i3 = new Internaute("Sacha", "Faitout", "s");
		Internaute i4 = new Internaute("Armand", "lucier", "xxxl");
		Internaute i5 = new Internaute("farah", "Mineuse", "xxl");
		Internaute i6 = new Internaute("Talaron", "delphine", "xs");
		Internaute i7 = new Internaute("Sigmund", "Freud", "s");
		Internaute i8 = new Internaute("Georges", "Washington", "xl");

		i8.setAdresse(adresse4);
		i8.setTelephone("0425125474");
		i8.setEmail("georgesWash@gmail.com");

		i4.setAdresse(adresse3);
		i6.setAdresse(adresse2);

		internauteRepository.save(internaute);
		internauteRepository.save(i1);
		internauteRepository.save(i2);
		internauteRepository.save(i3);
		internauteRepository.save(i4);
		internauteRepository.save(i5);
		internauteRepository.save(i6);
		internauteRepository.save(i7);
		internauteRepository.save(i8);

		entrepriseRepository.save(entreprise);

		frRepository.save(new Formateur("Lucas","Lamar","LucasLamar@gmail.com","0625458724"));
		frRepository.save(new Formateur("Gilles","Lamar","LamarGilles@gmail.com","5241253685"));
		frRepository.save(new Formateur("robert","silous","robertsilous@gmail.fr","4125457845"));
		frRepository.save(new Formateur("eric","frutier","ericfrutier@gmail.fr","1245021245"));
		frRepository.save(new Formateur("gaëlle","Lamar","Lamargaëlle@gmail.com","0635245878"));
		
		Formateur leFormateur = new Formateur("Sylvie","Aubert","sylvieaubert@gmail.fr","0625451254");
		frRepository.save(leFormateur);
		leFormateur.setCategorie(devsec);
		frRepository.saveAndFlush(leFormateur);
		
		Formateur leFormateur1 = new Formateur("Regina","Santomatte","@ReginaSantomattegmail.com","0524585774");
		frRepository.save(leFormateur1);
		leFormateur1.setCategorie(ia);
		frRepository.saveAndFlush(leFormateur1);
		
		Formateur leFormateur2 = new Formateur("Sisi","Mosquito","SisiMosquito@gmail.fr","5235689545");
		frRepository.save(leFormateur2);
		leFormateur2.setCategorie(sgbd2);
		frRepository.saveAndFlush(leFormateur2);
		
		Formateur leFormateur3 = new Formateur("Carole","Lamar","LamarCarole@gmail.fr","0256352457");
		frRepository.save(leFormateur3);
		leFormateur3.setCategorie(sgbd3);
		frRepository.saveAndFlush(leFormateur3);
		
		Formateur leFormateur4 = new Formateur("Gilles","Lamar","LamarGilles@gmail.com","5241253685");
		frRepository.save(leFormateur4);
		leFormateur4.setCategorie(sgbd4);
		frRepository.saveAndFlush(leFormateur4);
		
		Formateur leFormateur5 = new Formateur("robert","silous","robertsilous@gmail.fr","4125457845");
		frRepository.save(leFormateur5);
		leFormateur5.setCategorie(linuxAdmin);
		frRepository.saveAndFlush(leFormateur5);
		
		Formateur leFormateur6 = new Formateur("eric","frutier","ericfrutier@gmail.fr","1245021245");
		frRepository.save(leFormateur6);
		leFormateur6.setCategorie(secAdm);
		frRepository.saveAndFlush(leFormateur6);
		
		Formateur leFormateur7 = new Formateur("gaëlle","Lamar","Lamargaëlle@gmail.com","0635245878");
		frRepository.save(leFormateur7);
		leFormateur7.setCategorie(busi);
		frRepository.saveAndFlush(leFormateur7);
		
		
		

		internauteRepository.save(new Internaute("Sophia", "calage", "xl"));
		internauteRepository.save(new Internaute("Jerome", "leclerc", "l"));
		internauteRepository.save(new Internaute("Charles", "saugier", "xs"));
		internauteRepository.save(new Internaute("Loubna", "rameur", "s"));
		internauteRepository.save(new Internaute("marwa", "carre", "xxl"));
		internauteRepository.save(new Internaute("julie", "solies", "xl"));

		System.out.println("*******************************************************");
		internauteRepository.findAll().forEach((p) -> {
			System.out.println(p.getNom() + ", " + p.getPrenom());
		});

		System.out.println("*******************************************************");
		cmdRepository.findAll().forEach((c) -> {
			Formation formation = c.getFormation();
			System.out.println(formation.getIntitule().toString() + ", " + formation.getDescriptif() + " : "
					+ (c.getSolde().toString()));
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