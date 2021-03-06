/*
 * New Spec 1 / Before Design Pattern
 * -----------------------------------------
 * New Spec 1: Tha prepei na kanoume tin ilopoiisi oste na mporei enas client na enimeronete me ta nea data kathe fora pou ayta
 *                 anabathmizontai. Mas protinoun de o kodikas aytos na ilopoiithei stin measurementsChanged() method pou mas exoun
 *                 ftiaxei stin WeatherData class
 * Solution 1: Tha ftiaxoume 3 antikeimena (CurrentConditionsDisplay, StatisticsDisplay, ForecastDisplay) 
 *                 kai tha kaloume se ayta tin update method pou tha exoun me parametro 
 *                 ta 3 data poy allazoun (temp,humidity,pressure) 
 *      
 *
 * Problem 1 : Distixos me ayton ton tropo ,ylopoiontas diladi se concrete implementation, den tha mporoume sto mellon
 *                  na prosthetoume alla display elements xoris na kanoume allages sto programma.
 * Skepseis  :     
 * Design 
 * Pattern (2) : The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, 
 *                   all its dependents are notified and updated automatically
 * 
 * Design 
 * Principle (3) : Strive for loosely coupled designs between objects that interact 
 *                   all its dependents are notified and updated automatically       
 *                 
 *                 -> Loosely coupled designs allow us to build flexible OO systems that can handle change 
 *                 -> because they minimize the interdependency between objects.            
 * 
 * 
 * Solution2 : [I] IMPLEMENT THE INTERFACES
 							 1. Implementing the Subject Interface 
 *                a) registerObserver(Observer o)	 // gia na mporei na kanei register kathe observer (eggrafi gia enimeroseis..)              
 *                b) removeObserver(Observer o)  	 // gia na mporei na kanei unregister kathe observer (apeggrafi apo tis enimeroseis..)
 *                c) notifyObservers() // Ayti i methodos kaleite oste na enimerosi olous tous observers oti to Subject State allaxe..            
 *                 
 *             2. Implementing the Observer Interface
 *                a) update(float temp, float humidity, float pressure) // H update efarmozete apo olous tous observers oste na mporei
 *                                                                      //to subject..na tous idopoiisei otan yparxoun nea data..
 *                                                                      // xrisimopoiontas os koini glossa ayti tin methodo
 *																																			
 *             3. Implementing the Display Interface
 *								a) display() // Prokeite gia tin methodo pou prepei ola ta concrete display classes na ilopoiisoun..
 *
 *
 *						[II] ALTER WEATHERDATA CLASS
 *             4. Tropopoisi tis klasis WeatherData
 *                a) Tropopoioume tin klasi oste na kanei implement to Subject Interface                  
 *                b) Prosthetoume ena neo instance variable typoy ArrayList me onoma observers
 *								c) Ston constructor kanoume instantiate to ArrayList observers
 *                d) Ylopoioume tis 3 methodous registerObservers(Observer o), removeObserver(Observer o), notifyObservers()
 *								e) Tropopoioume tin method measurementsChanges oste na kanlei tin notifyObservers()
 *								f) ftiaxnoume kai mia dummy setMeasuraments(float temperaturemfloat humidity, float pressure) oste na tropopoiountai
 *                      oi times kai na leitourgei to olo observer pattern...kata tin allagi ton data..          
 *
 *
 *						[III] BUILD THOSE DISPLAY ELEMENTS
 *             5. Ftiaxnoume tis 3 concrete Display klasis (CurrentConditionsDisplay, StatisticsDisplay, ForecastDisplay)
 *                   oi opoies kanoun implement 2 interfaces to Observer kai to DisplayElement
 *
 *                a) Ylopoioume tis methodous pou apaitountai apo ta 2 ayta Interface
 *                b) Epipleon ston constructor tous pou dexete os parametro to Subject to kratame os reference gia mellontiki xrisi
 *											p.x. gia na kanoume unregister to ekastote Display apo to Subject kai tis enimeroseis tou gia allages sto state tou..                
 *
 *
 *
 *						[III] BUILD A TESTER Class WITH MAIN METHOD..
 *             5. Dhmiourgoume mia klasi gia test pou exei tin main...tin WeatherStations
 *                a) Dimiourgoume ena antikeimeno WeatherData (oste na ftiaxtei kai i ArrayList Observers pou tha krata tous Observers
 *                       pou exoun kanei register gia na enimeronontai apo tis allages tou state tou Subject..
 *                b) Kanoume instantiate tis 3 Display concrete klaseis..dinontas tous os parametro to object pou dimiourgisame ligo prin
 *                       (to weatherData object..)
 *                c) kai thetoume kapoia data meso tis setMeasurementstis weatherData class oste na doume an doulei to pattern mas..
 *                       kai enimeronontai me tis allages ta display..
 *
 * 
 */