package crono;

import java.util.HashMap;
import java.util.Map;

import crono.AbstractSyntax.Atom;
import crono.AbstractSyntax.CronoType;


public class TempCombSymbol //implements Atom //extends Symbol
{
    private final String name;
    public static final int S_COMBINATOR=0; 
    public static final int K_COMBINATOR=1;
    public static final int B_COMBINATOR=2;
    public static final int C_COMBINATOR=3;
    public static final int Y_COMBINATOR=4;


  
    private static final HashMap<CombSymbol, Integer> combinators = new HashMap<CombSymbol, Integer>();

    private CronoTypeVar ctv;
  
    public TempCombSymbol(String s) 
    {
	this.name = s.toUpperCase();
	ctv = new CronoTypeVar();
    }

    /*  public String toString() 
    {
	return this.name;
    }

    public boolean equals(Object o) 
    {
	if (o instanceof CombSymbol) {
	    return ((CombSymbol)o).name.equals(this.name);
	} else {
	    return false;
	}
    }
  
    public static void initCombinators()
    {
	combinators.put(new CombSymbol("<S>"), S_COMBINATOR);
	combinators.put(new CombSymbol("<K>"), K_COMBINATOR);
	combinators.put(new CombSymbol("<B>"), B_COMBINATOR);
	combinators.put(new CombSymbol("<C>"), C_COMBINATOR);
	combinators.put(new CombSymbol("<Y>"), Y_COMBINATOR);
    }
  
    public static boolean isCombinatorSymbol(CombSymbol symbol)
    {
	if(combinators.containsKey(symbol))
	    return true;
	return false;
    }
  
    public static int getValueOf(CombSymbol symbol)
    {
	return combinators.get(symbol);
    }

    public CronoTypeVar type() {
	if(ctv == null) ctv = new CronoTypeVar();
	return ctv;
    }
	
    public CronoTypeConstraint[] constraint(CronoType[] args) {
	/*	System.out.println("COMB NAME: " + name);
		CronoTypeConstraint[] ret = new CronoTypeConstraint[1];
		ret[0] = new CronoTypeConstraint(ctv, new CronoTypeVar(1)); //TODO make clone????
		return ret;

	CronoTypeConstraint[] ret = null;
	//System.out.println("Name: " + name);	
	 
	//if(name.equals("<S>") || name.equals("<K>")) {
	/*int index = 0;
	    for(CronoType ctc: args) {
		System.out.println("S K CTC " + index + ": "+ ctc);
		index++;
	    }
	    ret = new CronoTypeConstraint[2];
	    ret[0] = new CronoTypeConstraint(ctv.clone(), args[0].type().clone());
	    ret[1] = new CronoTypeConstraint(args[args.length-1].type().clone(), ctv.clone());
	     
	    return ret;
	    //	}
	    
	if(!name.equals("t")) {
	//	if(name.equals("<S>") || name.equals("<K>")) {
	    /*   int index = 0;
	   for(CronoType ctc: args) {
		System.out.println("CTC " + name + " "  + index + ": "+ ctc);
		index++;
		}*/

	    /*  CronoTypeVar unknown = null;

	    for(int i = 1; i<args.length - 1; i++) {
		if(unknown == null) {
		    unknown = args[i].type().clone();
		}
		else {
		    unknown.addVar(args[i].type().clone());
		}
	    }

	    System.out.println("ARGS[0]: " + args[0]);

	    if(unknown == null) {
		unknown = args[0].type().clone();
	    }
	    else {
		unknown.addVar(args[0].type().clone());
	    }

	    CronoTypeVar same = new CronoTypeVar();
	    CronoTypeVar unknown = args[0].type().clone();
	    CronoTypeVar known = same;

	    unknown.addVar(args[args.length - 1].type().clone());
	    known.addVar(same);
		       
	   
	    ret = new CronoTypeConstraint[2];
	    ret[0] = new CronoTypeConstraint(ctv.clone(), unknown);
	    ret[1] = new CronoTypeConstraint(ctv.clone(), known);
	    //	    ret[0] = new CronoTypeConstraint(ctv.clone(), args[0].type().clone());
	    //ret[1] = new CronoTypeConstraint(args[args.length-1].type().clone(), ctv.clone());	  
	}
	//	else if(name.equals("<C>")

	else {
	    ret = new CronoTypeConstraint[1];
	    ret[0] = new CronoTypeConstraint(ctv, new CronoTypeVar(true));
	}
	return ret;
    }
  
*/  
}
