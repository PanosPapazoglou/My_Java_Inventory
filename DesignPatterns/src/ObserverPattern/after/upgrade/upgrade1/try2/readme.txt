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
                   na prosthetoume alla display elements xoris na kanoume allages sto programma.
 * Solution2 : 
 *             
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
 */