
package edu.canisius.csc.lsp;

public interface IntSequence{

	default boolean hasNext(){ return true;};
	int next();

}


