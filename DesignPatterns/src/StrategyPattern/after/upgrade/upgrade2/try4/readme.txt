/*
 * New Spec 2 / Before Design Pattern
 * ----------------------------------
 * 
 * New Spec 2: Xafnika apaitetai na mpoun sto programma kai xilina omoiomata papias (DecoyDuck)
 *             ta opoia oute petane , oute kanoun quack
 *             Etsi diapistonoume oti kai to inheritance (code reusage and one place to code on upgrade) exei apotixei
 *             stin periptosi ton sinexomenon diaforetikon simperiforon metaxi tis mitras papias kai ton eidon papias..
 *             
 * Skepseis  : Etsi to na kanoume sinexos override stis methodous ton concrete classes (ton eidon papias) den einai lisi...
 * 						 idios otan to project tha allazei sinexos xoris akomi na xeroun ti nea idi tha bazoun....
 *             kai ara akoma perissotera kai sixnotera overrides stis methodous fly(); kai quack() mesa stis concrete classes!!!
 *             EPOMENOS xreiazomaste ena pio katharo tropo antimetopisis mias tetoias katastasis!!
 *             Ena tropo pou na mas epitrepei mono se merikes kai oxi se oles tis papies na kanoun fly() kai quack()
 *             
 * Solution 3: Etsi apofasizoume na katafigoume stin logiki tou Interface!!
 *             Pio sigkekrimena tha bgaloume tis methodous fly() kai quack() exo apo tin abstract Superclass Duck
 *             kai tha ftiaxoume 2 Interfaces 
 *             a) Flyable() Interface    me mia    fly() method   
 *             b) Quackable() Interdace  me mia  quack() method            
 *             
 *                          
 *                               							A L L A !!!!!
 *             
 *             
 * Skepseis  : Xeroume oti den prepei oles ta eidi ton papion prepei na petane fly() i na bgazon ixous quack()
 *             kai ara i kleironomikotita (Inheritance) den einai lisi!!
 *             Dimiourgontas ta Interfaces kai bazontas to concrete classes na ilopoioun tis methodous pou exoun kathoristei sta Interfaces
 *             linei nai men to parapano problima afou mono osa eidi papias petane i kanoun quack tha prepei na kanoun implement ta
 *             antistoixa interfaces kai na ulopoiisoun tis antistoixes methodous tous fly() gia to Flyable Interface kai quack() gia to Quackable Interface
 *             ALLA katastrefei teleios to code reuse kai tin kentropoisis pou mas parexei to Inheritance!!!!
 *             Ayto exei san apotelesma na prepei na grafoume endexomenos kai idia pragmata se kathe ena apo ta eidi papias stis antistoixes methodous tous fly() kai quack()
 *             pragma pou simainei oti glitonoume apo ton 1o efialti ton if() mesa sto ekastote subclass alla sto telos grafoume ta idia kai ta diia endexomenos 
 *             mesa se ayto to subclass(dialdi sta eidi ton papion) 
 *             Ti mporoume na kanoume oste :
 *                a) Na apotrepoume to na ektelounte lathos leitourgies se ena eidos papias (p.x. na petaei eno den epitrepete)
 *                       i na bazoume if...mesa stis methodous ton subclasses..
 *                b) Alla apo tin alli na min xreiazomaste na kanoume duplicate coding stis methodous mesa se kathe eidos papias???
 *                     p.x. fantasou na prepei na kaneis mia allagi (tin idia..) se ola ta 48 eidi papias pou petane
 *                   kai pou na fantastoume oti oxi mono den tha epitrepete na petaei i na bgazei ixous mia papia
 *                   alla mporei na to kanei kai diaforetika...epomenos na prepei telika na grafoume kai diafoeritika eidi kodika gia tin idia leitouria
 *                   mesa stis methodous tis concrete subclass tis papias diladi mesa se kathe eidos papias..   
 *                   
 *                                           
 *                                           --> CONSTANT IN SOFTWARE DEVELOPMENT ==> C H A N G E !!! <--    
 *                      
 *
 *																    			            --> DESIGN THE DUCK BEHAVIORS <--  
 *
 *                      
 * Design 
 * Principle (1) : Identify the aspects of your application that vary
 *                   and seperate them from what stayes the same!!             
 *                 
 *                 -> Take what varies and "encapsulate" it so it won't affect the rest of your code
 *                 -> The result? Fewer unintended consequences from code changes and more flexibility in your systems
 *              
 *                 -> Take the parts that vary and encapsulate them, 
 *                 -> so that later you can alter or extend the parts tha vary .
 *                 -> without affecting those that don't!!
 *                 
 *                 * Prokeite gia tin basi olon ton Design Principles - 
 *                   Diladi na mporoume na tropopoioume merika komatia tou kodika/sistimatos XORIS na epireazontai ta alla!!
 *             
 *              Basismenoi loipon sto 1o Sxediastiko kanona tha prepei na xexorisoume ayta pou allazoun apo ayta pou paramenoun idia
 *              Epomenos idia menoun edo to pos kolimpane oles oi papies
 *              eno diaforetika einai to pos petane kai kanoun quack 
 *              (bebaia diaforetika einai kai to pos fainontai display() alla ekei einai teleios diaforetika se kathe eidos papias opote
 *               profanos kai apla to kratame mesa stin concrete subclass (eidos papias) pros ilopoiisi )
 *              
 *              Me ta parapano katalabainoume oti to petagma fly() kai o ixos quack() allazoun kai tha allazoun sinexos kai sto mellon
 *              epomenos tha prepei na ta apokentrosoume - diladi na ta bgaloume ektos tis klasis Duck os behavious (os methodoi)
 *              
 *              Pio sigkekrimena : 
 *              a) Tha bgaloume to behavior (tis methodous) fly() kai quack() ektos tis klasis Duck
 *              b) Tha ftiaxoume 2 set klasseon ena gia to petagma kai ena gia ton ixo pou bgazoun
 *                 Kathe mia apo aytes tis klaseis tha emperiexoun tin ekastote ilopoiisi tis simperiforas pou tin aforoun 
 *                 (eache set of classes will hole all the implementation of their respctive bejavior)
 *                 i allios..tha dimiourgisoume ena neo set klaseon pou tha antiprosopeyei tin ekastote simperifora
 *                 Etsi gia to 1o SET pou afora sto QUACK : 
 *                    i) tha exoume mia klasi pou tha ilopoiei to "quacking"
 *                   ii) alli mia klasi pou tha ilopoiei (implements) to "squeaking"
 *                  iii) kai alli mia klasi pou tha ilopoiei (implements) to "silence"
 *                  
 *              
 *              Theloume loipon ta pragmata na einai flexible , 
 *              kai theloume na kanoume assign behaviors sta instances enos Duck
 *               
 *              Diladi tha thelame na mpoorume na kanoume instantiate ena MallardDuck Instance 
 *              kai na to kanoume initialize oste na tou prosdidoume mia sigkekrimeni simperifora petagmatos (flying behavior)
 *              
 *              Kai mia kai tha eimaste se ayto to sxediastiko simeio..giati na min mporoume kai na allazoume kai tin simperifora ayti kai sto runtime
 *              Diladi..gia tin na min efarmosoume Getters kai Setters methodous stin Duck Class (Encapsulation i alli themelliodis arxi tou OO Programming)
 *                 oste na mporoume na allazoume tin simperifora petagmatos (fly behavior) p.x. tou eidous MallardDuck kai kata to runtime!!
 *                 
 *                 
 *                 
 *                 
 *              
 *              Exontas os stoxo ta parapano..as doume ton 2o Design Principle.. 
 * Design 
 * Principle (2) : Program to an Interface , NOT an Implementation
 *                 (ayto gia na einai oso to dinaton pio abstract oste p.x. mesa sto duck class i sta subclases tou na min xreiazontai 
 *                  idiaiteres dieykriniseis kai ara programamtistikes tropoopoiseis kai diafores..)             
 *              
 *              
 *              
 *              
 *              c) Tha xrisimopoiisoume loipon 2 interfaces* (ta 2 sets..pou legame parapano)  
 *                 gia paradeigma "FlyBehavior" kai "QuackBehavior" 
 *                 
 *                 (*me tin genikoteri ennoia ..dhladh Interface i Abstract class..stin java)
 *                 
 *              d) KAI kathe ilopoiisi mias ek ton simperiforon (behavior) tha ilopoiiei ena apo ayta ta 2 interfaces
 *                 Etsi apo do kai pera oi simperifores tis papias Duck behaviors (fly,quack) tha zoun se mia xexoristi klasi
 *                 i opoia tha prepei na ilopoiei (implement) ena sigkekrimeno behavior interface!!
 *                 (diladi tha emploutisoume ton kodika pou grapsame sto bima b se sxesi me to c)
 *                 
 *   
 *   APOTELESMA : Etsi oi DUCK CLASSES den tha xreiazetai na gnorizoun KAMIA LEPTOMERIA sxetika me tin YLOPOISI tis idias tous tis SYMPERIFORAS!!!
 *                 
 *   
 *   EPOMENOS...edo erxomaste se antithesi me ayto pou kaname mexri tora 
 *              diladi na exoume to behavior eite mesa stin superclass Duck
 *              eite na to exoume mesa stis concrete subclasses (sta eidi ton papion)
 *              
 *              Ant' aytou oi simperifores eina xexoristes klaseis oi opoies ilopoioun tis eyriteres ennoies simperforon (fly,quack) ilopoiontas ayta ta enoiologika behavior interfaces
 *              
 *              Me to neo mas Design oi Duck subclasses tha xrisimopoouin tin simperifora pou parousiazete apo ena interface (FlyBehavior and QuackBehavior) 
 *              (etsi kanoume xrisi tis 3is themeliodis arxis tou OO Programming - ayto tou polimorfismou)
 *              Etsi i pragmatiki ilopoiisi tis simperiforas (i epi tis ousias simperifora tou ekastote eidous eite gia to fly eite gia to quack) 
 *              den tha eiani egklobismeno mesa sto ekastote Duck subclass (diladi sto ekastote eidos papias) 
 *              
 *              H xrisi tou  interface (FlyBehavior and QuackBehavior)  einai enoiologiki!! Tha mporouse stin Java na einai eite ena Java Interface eite mia Abstract class!! 
 *                                               ### PROGRAM TO AN INTERFACE really means PROGRAM TO A SUPERTYPE ###
 *                                               
 *          
 *                                                         
 *                                                                     TELIKA ME APLA LOGIA 
 *                                                    Antikathistoume tin logiki tou "I N H E R I T A N C E" 
 *                                            me ayti tou "E N C A P S U L A T I  O N"  kai tou "P O L Y M O R F I S M"
 *              
 *              
 *             H ousia einai na ekmetaleytoume ton polumorfismo oste na programamtisoume se ena supertype (Java interface i Java abstract class den exei simasia..)
 *             etsi oste to runtime object mas na min einai egklobismeno ston kodika alla stin xrisi enos "tilekontrol"
 *             Kai ti simainei stin Java..tilekontrol;;; METABLITH!!! Dhladh tha antikatastisoume tis palies methodous fly() kai quack() to behavior diladi
 *             me state ..me instance variable sigkekrimenou omos tipou!!
 *             
 *             Kai gia na to poume kai me diaforetika logia....oste na katalixoume kai sto epomeno bima..(to pos denoume diladi ta parapano me tin superklasi mas Duck..)
 *             Programm to supertype simaieni oti o dilothen tupos (to tilekontrol!!!)  ton metabliton tha prepei na einai supertype - sinithos mia abstract class i eina interface
 *             oste ta antikeimena opou ginontai assgned se aytes tis metablites na mporoun na einai opoiasdipote ilopoiiseis tou supertype pou ta dilonoume!!
 *             Auto me tin seira tou simainei oti oi klaseis pou ta orizoun ayta ta instance variables den xreiazete na xeroun apo poies concrete class simperiforas tha ilopoithoun telika
 *             
 *             Kai gia na thimithoume tin diafora..
 *             
 *                                                             --> Programming to an Implementation <--
 *             Dog d = new Dog();
 *             d.bark();
 *             Ara thetontas tin metabliti se ena typo Dog (pou afora se ena concrete implementation enos Animal) 
 *             mas anagkazei na grapsoume kodika gia tin sigkekrimeni ilopoiisi aytou tou antikeimenou diladi d.bark i an itan gata d.niaou
 *             
 *             
 *             eno..
 *             
 *                                                             --> Programming to an Interface <--
 *             Animal animal = new Dog();
 *             animal.makesound();
 *             Xeroume oti einai skilos...alla tora mporoume na xrisimopoiisoume to animal reference sto na bgalei ixo to zoo/skilos polimorfika!!
 *             Xrisimopoiontas diladi tin methodo tou interface oxi tou sigkekrimenou hard/coded ekastote..limited/egklobismenou implementation..diadli tou skilou!!
 *             
 *                           
 *             kai malista akomi kalitera tha mporousame..na apofigoume kai tin entoli pou kanei anafora sto concrete object new Dog pou kai ayto mas dimiourgei limitation kai hardcode..
 *             a = getAnimal();
 *             a.makeSound();
 *             
 *             Diladi tha epafiemetha stin methodo getAnimal na mas epistrepsei to katalilo object oste meso tou abstract methodo tou interface mas ayto to animal na bgalei ixo..
 *             Emeis diladi den xeroume poio einai to pragmatiko animal subtype..to mono pou mas noiazei einai oti exoume to tilekontrol oste na to kanoume na skouxei..
 *                          
 *                          
 *             Etsi tha exoume p.x. gia to behavior tou petagmatos..:
 *             
 *                                                         <<interface>
 *                                                          FlyBehavior
 *                                                          -----------
 *                                                            fly()
 *                                                             | 
 *                                                          |     |
 *                                                       |           | 
 *                                                   |                   |
 *                                             FlyWithWings           FlyNoWay
 *                                             ------------           --------
 *                                                fly(){                fly(){
 *                                                  //wingfly();          nofly();
 *                                                }                     }
 *                                                
 *                                                
 *                                                             
 *             Epipleon an xreiastoun nea Fly Behaviors den tha xreiastei na tropopisoume tis klasis proigoumenon Fly Behaviors
 *             kai episis dem tha xreaistei na peiraxoume poso mallon tin superclass Duck alla oute kai tin ekastote palia i nea subclass (neo eidos)
 *             
 *             
 *             
 *             
 *           
 *                                 //////////               TELIKA TI PETYXAINOUME????            ////////////
 *                                 
 *     Telika ayto pou petixainoume enai kai to CODE REUSE apo tin mia..
 *     alla kai xoris ta arnitika pou eferne to Inheritance stis 3 proigoumenes prospathies mas..
 *     
 *     
 *     
 * Solution 4 : 1. Implementing the Duck Behavior
 *                 1a. Diladi ftiaxnoume 2 behavior interfaces (pou tha antiprosopeyoun ta 2 behavior sets..)
 *                 1b. Ftiaxnoume gia to kathe behavior mia klasi pou tha kanei implement to ekastote parapano interface
 *                   
 *     					2. Integrating the Duck Behacior
 *								 2a. Orizoume 2 refernce variables (instance variables) stin abstract klasi Duck me tupo to ekastote Behavior Interface
 *								 2b. Diagrafoume tis proigoumenes methodous fly() kai quack() afou pleon aytes ilopoiounte apo tis klaseis pou ilopooun ta Behavior Interfaces (diladi ektos ton Duck kai ton subclasses tou)
 *								 2c. Dimiourgoume 2 nees methodous tis performFly() kai performQuack() oi opoies tha epikalounte tin methodo fly() kai quack() antistoixa ton reference variable ton Behavior Interfaces pou orisame parapano
 *								     xoris na tous endiaferei i akribis ilopoiisei kai to eidos tou fly i tou squack!! Etsi exoume kataferei tin apokentrosi... pou thelame.
 *								     
 *							3. More Integration in the Duck's conecrete subclasses
 *                 3a. Diagrafoume tis methodous fly() kai quack() pou exidikeyan ayta ta behavior mesa stis concrete subclasses (p.x. stin MallardDuck.java)
 *                 3b. Orizoume mesa ston constructor tous tis flyBehavior kai quackBehavior instance variables 
 *                       kanontas instanciate me tin katallili class pou ilopoiei to Behavior Interface
 *                     (We initialize the flybehavior instance variable with an instance of thype FlyWithWings ( a FlyBehavior concrete implementation class) )
 *																  
 *     
 *  -----------------------------------------------------------------------------------------------------------------------------------
 *  
 * New Spec 1: H anabathmisi pou mas zitithike exei na kanei me tin dinatotita tis papias na petaei 
 * Solution 1: Etsi apofasizoume stin abstract klasi na baloume tin methodo fly() stin logiki ton quack() kai swim()
 *            etsi oles oi papies na exoun ayti tin dinatotita otan kanoume subclasses
 *
 * Problem 1 : Distixos me ayton ton tropo mporoun na petaxoun kai eidi papias pou den mporoun na petaxoun!!!
 * Solution2 : San 2i lisi loipon prokreinete to na  kanei OVERRIDE mesa stis CONCRETE CLASSES (diladi tis klasis ton eidon tis papias)
 *             tropoopiontas ton kodika oste aytes pou den mporoun na petoun na min petoun
 * 
 * 
 *  
 */