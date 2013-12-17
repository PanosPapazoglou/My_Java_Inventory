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
 * Solution2 : San 2i lisi loipon prokreinete to na ftiaxoume alli mia abstrace class gia ta Condiments
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