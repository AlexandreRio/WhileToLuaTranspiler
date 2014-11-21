package org.xtext.tl.mydsl;

import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class PTree {
	@Inject
	private IParser parser;

	public PTree() {
		setupParser();
	}

	private void setupParser() {
		Injector injector = new MyDslStandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		injector.injectMembers(this);
	}

	/**
	 * Parses data provided by an input reader using Xtext and returns the
	 * root node of the resulting object tree.
	 * 
	 * @param reader
	 *            Input reader
	 * @return root object node
	 * @throws IOException
	 *             when errors occur during the parsing process
	 * @throws ParseException
	 */
	public EObject parse(Reader reader) throws IOException, ParseException {
		IParseResult result = parser.parse(reader);
		if (result.hasSyntaxErrors()) {
			throw new ParseException(
					"Provided input contains syntax errors.", -1);
		}
		return result.getRootASTElement();
	}
}