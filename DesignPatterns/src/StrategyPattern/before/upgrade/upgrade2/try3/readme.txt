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
 *  -----------------------------------------------------------------------------------------------------------------------------------
 * New Spec 1: H anabathmisi pou mas zitithike exei na kanei me tin dinatotita tis papias na petaei 
 * Solution 1: Etsi apofasizoume stin abstract klasi na baloume tin methodo fly() stin logiki ton quack() kai swim()
 *            etsi oles oi papies na exoun ayti tin dinatotita otan kanoume subclasses
 *
 * Problem 1 : Distixos me ayton ton tropo mporoun na petaxoun kai eidi papias pou den mporoun na petaxoun!!!
 * Solution2 : San 2i lisi loipon prokreinete to na  kanei OVERRIDE mesa stis CONCRETE CLASSES (diladi tis klasis ton eidon tis papias)
 *             tropoopiontas ton kodika oste aytes pou den mporoun na petoun na min petoun
 * 
 *  
 */