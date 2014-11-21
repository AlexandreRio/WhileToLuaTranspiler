package org.xtext.tl.mydsl.formatting;

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.xtext.tl.mydsl.services.MyDslGrammarAccess;

import com.google.inject.Inject;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting on how and
 * when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an
 * example
 */
public class MyDslFormatter extends AbstractDeclarativeFormatter {

	@Inject
	private MyDslGrammarAccess f;

	@Override
	protected void configureFormatting(FormattingConfig c) {
		c.setLinewrap(1).around(f.getFunctionRule());
		/*for (Keyword semicolon : f.findKeywords(";")) {
			c.setLinewrap().after(semicolon);
			c.setNoSpace().before(semicolon);
		}

		for (Keyword percent : f.findKeywords("%")) {
			c.setLinewrap().before(percent);
			c.setNoSpace().after(percent);
		}
		
		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("(", ")")) {
			c.setNoSpace().after(pair.getFirst());
			c.setNoSpace().before(pair.getSecond());
		}*/

		//c.setNoSpace().after(f.getSortieRule());
		//c.setNoSpace().before(f.getFunctionRule());

		//c.setLinewrap(0, 0, 1);
		//c.setLinewrap(2, 2, 2).around(f.getFunctionRule());
		//c.setNoSpace().around(f.getLCRule());
	}
}