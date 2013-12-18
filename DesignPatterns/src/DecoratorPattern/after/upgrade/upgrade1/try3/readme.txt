/*
 * New Spec 2 / Before Design Pattern
 * ----------------------------------
 * 
 * New Spec 2: Ektos apo to afepsima theloume to sistima na ipostirizei kai tin prosthiki extra ilikon pano apo ayto
 *             p.x. xtipimeno gala , trimata sokolatas k.t.l.
 *             
 * Solution 2: Etsi apofasizoume na ftiaxoume (blakodos) olous tous sindiasmous se klasis..
 *						 Diladi an exoume 5 eidi afepsimaton kai 10 idi extra ilikon na ftiaxoume to sindiasmo tous os concrete classes tou Beverage
 *             Alla epipleon ena afepsima mporei na exei parapano apo ena ilika..mazi..i 2 fores ena iliko p.x. extra chocolate trims.. 
 *             Etsi kathe concrete klasi pou tha periexei ton ekastote sindiasmo..tha kanei kai ton katalilo ipologismo kostous!
 *
 *
 * Problem 1 : Distixos me ayton ton tropo exoume ena karo klasis kai to maintance eiani tragiko..
 *             Ti tha ginei an allaxei i timi sto gala; Tha prepei na mpoume se oles tis klasis me gala kai na allaxoume to cost;
 *             Omois ti tha gieni an iparxei neo rofima i neo extra iliko...tha fonazoume programmatisti na ftiaxnei tous neous sindiasmous klaseon;
 *             Epi tis ousias parabiazoume 2 apo ta design principals pou exoume mathei..
 *               
 * Solution3 : San 2i lisi loipon prokreinete to na baloume os instance variables typoy boolean ta extra ylika (condiments)
 *             kai na ilopoisoume stin abstract tin methodo cost opou initial tha ipologizoume to kostos ton condiments
 *             afinontas tis concrete classes na uypologizoun to synoliko kostos analoga me to kostos tou ekastote Veverage..  
 * 
 *
 * Problem 2 : Me ayti tin nea sxediasi isos exoume problimata sto mellon. Gia paradeigma.. :
 *             1. An allaxoun oi times sta extra ylika(condiments) tha anagkastoume na allaxoume ton yparxon kodika 
 *             2. Nea extra ylika (Condiments) tha mas anagkasoun na prosthesoume nees methodous kai na tropopoiisoume to cost method stin superclass
 *             3. Isos na exoume nea rofimata (beverages). Epipleon se kapoia apo ayta ta rofimata (ice tea gia paradeigma..) isos merika extra ylika na min tairiazoun..
 *                Emeis omos meso tou inheritance tha ta klironomisoume stin concrete class. Etsi tha exoume gia paradeigma methodous tipoy hasWhip stin periptosi tou tea.. 
 *             4. Ti tha ginei an enas pelatis thelei dipli dosi trimatos sokolatas; 
 *              
 *  
 * Skepseis  : Component = Beverage 
 *						 Decorator = CondimentDecorator 
 *
 * Design 
 * Principle (5) : Classes should be open for extension, but closed for modification
 *      
 * Design 
 * Pattern   (3) : The Decorator Pattern attaches additional responsibilities to an object dynamically.
 *								 Decorators provide a flexible alternative to subclassing for extending functionality. 
 *  
 *  
 * Solution4 : 1. Ylopoioume tin abstract class Beverage me 2 methodous..a)tin getDescription , b)tin abstract cost()
 *						 2. Synexizoume me tin ylopoiisi tou component..(tou decorator..tou..wrapper..) tis asbstract class ton Condiments i opoia tha epektinei tin abstract class ton Beverages oste na exei idio tipo..kai na mporei na tin ypokathista..
 *						 3. Stin sinexeia ylopoioume ta concrete Beverage Classes (Espresso, HouseBlend, DarkRoast kai Decaf) kanoume extend tin abtract Beverage Class
 *                a) Ston constructor tous tha dilosoume to ekastote description
 *                b) Eno tha ilopoiisoume kai tha orisoume to kostos tous (xoris ta extra ilika..) - To kostos den mas apasxolei edo..ayto einai kai to kerdos apo tin efarmogi tou Decorator Pattern.. 
 *             
 *             4. Stin sinexeia ylopoioume tis concrete klasses ton Condiments(extra ylika)   pou tha kanoun extend tin abstract class ton Condiments (to component..ton Decorator diladi...ton..wrapper..)
 *								
 *           
 *  -----------------------------------------------------------------------------------------------------------------------------------
 *             
 *             
 * New Spec 1 / Before Design Pattern
 * -----------------------------------------
 * New Spec 1: Theloume na ftiaoume to billing sistima ton StarBuzz Coffee gia ta rofimata
 * Solution 1: Ftiaxnoume mia abstact class Beverage i opoia tha exei :
 *								a) Ena Instance variable to Description
 *								b) Mia methodo getDescription() pou tha epistrefei to decription
 *								c) Mia abstract methodo cost() pou tha ilopoieite apo tis concrete classes kai tha epistrefei tin timi tou Beverage
 * 					   
 *             
 *            
 */