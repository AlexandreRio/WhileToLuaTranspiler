package org.xtext.tl.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.tl.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LC", "RULE_SYMBOLES", "RULE_VARIABLE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'cons'", "'list'", "'hd'", "'tl'", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'do'", "'od'", "'in'", "'then'", "'fi'", "'else'", "'and'", "'or'", "'=?'", "'('", "')'", "'nil'", "'while'", "'for'", "'foreach'", "'if'", "'not'"
    };
    public static final int RULE_ID=7;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_SYMBOLES=5;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__14=14;
    public static final int RULE_LC=4;
    public static final int RULE_INT=8;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=9;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_VARIABLE=6;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=12;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModel"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:63:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:64:1: ( ruleModel EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:65:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel76);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel83); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:72:1: ruleModel : ( ( rule__Model__Group__0 )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:76:2: ( ( ( rule__Model__Group__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:77:1: ( ( rule__Model__Group__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:77:1: ( ( rule__Model__Group__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:78:1: ( rule__Model__Group__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:79:1: ( rule__Model__Group__0 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:79:2: rule__Model__Group__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel109);
            	    rule__Model__Group__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFunction"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:91:1: entryRuleFunction : ruleFunction EOF ;
    public final void entryRuleFunction() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:92:1: ( ruleFunction EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:93:1: ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction137);
            ruleFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction144); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:100:1: ruleFunction : ( ( rule__Function__Group__0 ) ) ;
    public final void ruleFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:104:2: ( ( ( rule__Function__Group__0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:105:1: ( ( rule__Function__Group__0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:105:1: ( ( rule__Function__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:106:1: ( rule__Function__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:107:1: ( rule__Function__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:107:2: rule__Function__Group__0
            {
            pushFollow(FOLLOW_rule__Function__Group__0_in_ruleFunction170);
            rule__Function__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleDefiniton"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:119:1: entryRuleDefiniton : ruleDefiniton EOF ;
    public final void entryRuleDefiniton() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:120:1: ( ruleDefiniton EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:121:1: ruleDefiniton EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonRule()); 
            }
            pushFollow(FOLLOW_ruleDefiniton_in_entryRuleDefiniton197);
            ruleDefiniton();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefiniton204); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefiniton"


    // $ANTLR start "ruleDefiniton"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:128:1: ruleDefiniton : ( ( rule__Definiton__Group__0 ) ) ;
    public final void ruleDefiniton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:132:2: ( ( ( rule__Definiton__Group__0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:133:1: ( ( rule__Definiton__Group__0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:133:1: ( ( rule__Definiton__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:134:1: ( rule__Definiton__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:135:1: ( rule__Definiton__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:135:2: rule__Definiton__Group__0
            {
            pushFollow(FOLLOW_rule__Definiton__Group__0_in_ruleDefiniton230);
            rule__Definiton__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefiniton"


    // $ANTLR start "entryRuleInput"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:147:1: entryRuleInput : ruleInput EOF ;
    public final void entryRuleInput() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:148:1: ( ruleInput EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:149:1: ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput257);
            ruleInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput264); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:156:1: ruleInput : ( ( rule__Input__Group__0 ) ) ;
    public final void ruleInput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:160:2: ( ( ( rule__Input__Group__0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:161:1: ( ( rule__Input__Group__0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:161:1: ( ( rule__Input__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:162:1: ( rule__Input__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:163:1: ( rule__Input__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:163:2: rule__Input__Group__0
            {
            pushFollow(FOLLOW_rule__Input__Group__0_in_ruleInput290);
            rule__Input__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:175:1: entryRuleOutput : ruleOutput EOF ;
    public final void entryRuleOutput() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:176:1: ( ruleOutput EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:177:1: ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_entryRuleOutput317);
            ruleOutput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutput324); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:184:1: ruleOutput : ( ( rule__Output__Group__0 ) ) ;
    public final void ruleOutput() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:188:2: ( ( ( rule__Output__Group__0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:189:1: ( ( rule__Output__Group__0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:189:1: ( ( rule__Output__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:190:1: ( rule__Output__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:191:1: ( rule__Output__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:191:2: rule__Output__Group__0
            {
            pushFollow(FOLLOW_rule__Output__Group__0_in_ruleOutput350);
            rule__Output__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleCommands"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:203:1: entryRuleCommands : ruleCommands EOF ;
    public final void entryRuleCommands() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:204:1: ( ruleCommands EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:205:1: ruleCommands EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsRule()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_entryRuleCommands377);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommands384); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:212:1: ruleCommands : ( ( rule__Commands__Group__0 ) ) ;
    public final void ruleCommands() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:216:2: ( ( ( rule__Commands__Group__0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:217:1: ( ( rule__Commands__Group__0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:217:1: ( ( rule__Commands__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:218:1: ( rule__Commands__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:219:1: ( rule__Commands__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:219:2: rule__Commands__Group__0
            {
            pushFollow(FOLLOW_rule__Commands__Group__0_in_ruleCommands410);
            rule__Commands__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleVars"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:231:1: entryRuleVars : ruleVars EOF ;
    public final void entryRuleVars() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:232:1: ( ruleVars EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:233:1: ruleVars EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsRule()); 
            }
            pushFollow(FOLLOW_ruleVars_in_entryRuleVars437);
            ruleVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVars444); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVars"


    // $ANTLR start "ruleVars"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:240:1: ruleVars : ( ( rule__Vars__Group__0 ) ) ;
    public final void ruleVars() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:244:2: ( ( ( rule__Vars__Group__0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:245:1: ( ( rule__Vars__Group__0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:245:1: ( ( rule__Vars__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:246:1: ( rule__Vars__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:247:1: ( rule__Vars__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:247:2: rule__Vars__Group__0
            {
            pushFollow(FOLLOW_rule__Vars__Group__0_in_ruleVars470);
            rule__Vars__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVars"


    // $ANTLR start "entryRuleExprs"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:259:1: entryRuleExprs : ruleExprs EOF ;
    public final void entryRuleExprs() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:260:1: ( ruleExprs EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:261:1: ruleExprs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsRule()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_entryRuleExprs497);
            ruleExprs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprs504); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprs"


    // $ANTLR start "ruleExprs"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:268:1: ruleExprs : ( ( rule__Exprs__Group__0 ) ) ;
    public final void ruleExprs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:272:2: ( ( ( rule__Exprs__Group__0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:273:1: ( ( rule__Exprs__Group__0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:273:1: ( ( rule__Exprs__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:274:1: ( rule__Exprs__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:275:1: ( rule__Exprs__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:275:2: rule__Exprs__Group__0
            {
            pushFollow(FOLLOW_rule__Exprs__Group__0_in_ruleExprs530);
            rule__Exprs__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleCommand"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:287:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:288:1: ( ruleCommand EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:289:1: ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand557);
            ruleCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand564); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:296:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:300:2: ( ( ( rule__Command__Alternatives ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:301:1: ( ( rule__Command__Alternatives ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:301:1: ( ( rule__Command__Alternatives ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:302:1: ( rule__Command__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getAlternatives()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:303:1: ( rule__Command__Alternatives )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:303:2: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_rule__Command__Alternatives_in_ruleCommand590);
            rule__Command__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleExpr"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:315:1: entryRuleExpr : ruleExpr EOF ;
    public final void entryRuleExpr() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:316:1: ( ruleExpr EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:317:1: ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr617);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr624); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:324:1: ruleExpr : ( ( rule__Expr__Alternatives ) ) ;
    public final void ruleExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:328:2: ( ( ( rule__Expr__Alternatives ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:329:1: ( ( rule__Expr__Alternatives ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:329:1: ( ( rule__Expr__Alternatives ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:330:1: ( rule__Expr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getAlternatives()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:331:1: ( rule__Expr__Alternatives )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:331:2: rule__Expr__Alternatives
            {
            pushFollow(FOLLOW_rule__Expr__Alternatives_in_ruleExpr650);
            rule__Expr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleAnd"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:343:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:344:1: ( ruleAnd EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:345:1: ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd677);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd684); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:352:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:356:2: ( ( ( rule__And__Group__0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:357:1: ( ( rule__And__Group__0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:357:1: ( ( rule__And__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:358:1: ( rule__And__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:359:1: ( rule__And__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:359:2: rule__And__Group__0
            {
            pushFollow(FOLLOW_rule__And__Group__0_in_ruleAnd710);
            rule__And__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleOr"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:371:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:372:1: ( ruleOr EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:373:1: ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr737);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr744); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:380:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:384:2: ( ( ( rule__Or__Group__0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:385:1: ( ( rule__Or__Group__0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:385:1: ( ( rule__Or__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:386:1: ( rule__Or__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:387:1: ( rule__Or__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:387:2: rule__Or__Group__0
            {
            pushFollow(FOLLOW_rule__Or__Group__0_in_ruleOr770);
            rule__Or__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleNot"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:399:1: entryRuleNot : ruleNot EOF ;
    public final void entryRuleNot() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:400:1: ( ruleNot EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:401:1: ruleNot EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotRule()); 
            }
            pushFollow(FOLLOW_ruleNot_in_entryRuleNot797);
            ruleNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNot804); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:408:1: ruleNot : ( ( rule__Not__Group__0 ) ) ;
    public final void ruleNot() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:412:2: ( ( ( rule__Not__Group__0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:413:1: ( ( rule__Not__Group__0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:413:1: ( ( rule__Not__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:414:1: ( rule__Not__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:415:1: ( rule__Not__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:415:2: rule__Not__Group__0
            {
            pushFollow(FOLLOW_rule__Not__Group__0_in_ruleNot830);
            rule__Not__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleEq"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:427:1: entryRuleEq : ruleEq EOF ;
    public final void entryRuleEq() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:428:1: ( ruleEq EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:429:1: ruleEq EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqRule()); 
            }
            pushFollow(FOLLOW_ruleEq_in_entryRuleEq857);
            ruleEq();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEq864); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEq"


    // $ANTLR start "ruleEq"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:436:1: ruleEq : ( ( rule__Eq__Alternatives ) ) ;
    public final void ruleEq() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:440:2: ( ( ( rule__Eq__Alternatives ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:441:1: ( ( rule__Eq__Alternatives ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:441:1: ( ( rule__Eq__Alternatives ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:442:1: ( rule__Eq__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getAlternatives()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:443:1: ( rule__Eq__Alternatives )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:443:2: rule__Eq__Alternatives
            {
            pushFollow(FOLLOW_rule__Eq__Alternatives_in_ruleEq890);
            rule__Eq__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEq"


    // $ANTLR start "entryRuleExprTerm"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:455:1: entryRuleExprTerm : ruleExprTerm EOF ;
    public final void entryRuleExprTerm() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:456:1: ( ruleExprTerm EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:457:1: ruleExprTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTermRule()); 
            }
            pushFollow(FOLLOW_ruleExprTerm_in_entryRuleExprTerm917);
            ruleExprTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprTermRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprTerm924); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprTerm"


    // $ANTLR start "ruleExprTerm"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:464:1: ruleExprTerm : ( ( rule__ExprTerm__Alternatives ) ) ;
    public final void ruleExprTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:468:2: ( ( ( rule__ExprTerm__Alternatives ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:469:1: ( ( rule__ExprTerm__Alternatives ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:469:1: ( ( rule__ExprTerm__Alternatives ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:470:1: ( rule__ExprTerm__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTermAccess().getAlternatives()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:471:1: ( rule__ExprTerm__Alternatives )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:471:2: rule__ExprTerm__Alternatives
            {
            pushFollow(FOLLOW_rule__ExprTerm__Alternatives_in_ruleExprTerm950);
            rule__ExprTerm__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprTermAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprTerm"


    // $ANTLR start "entryRuleExprSimple"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:483:1: entryRuleExprSimple : ruleExprSimple EOF ;
    public final void entryRuleExprSimple() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:484:1: ( ruleExprSimple EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:485:1: ruleExprSimple EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleRule()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_entryRuleExprSimple977);
            ruleExprSimple();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprSimple984); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExprSimple"


    // $ANTLR start "ruleExprSimple"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:492:1: ruleExprSimple : ( ( rule__ExprSimple__Group__0 ) ) ;
    public final void ruleExprSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:496:2: ( ( ( rule__ExprSimple__Group__0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:497:1: ( ( rule__ExprSimple__Group__0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:497:1: ( ( rule__ExprSimple__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:498:1: ( rule__ExprSimple__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:499:1: ( rule__ExprSimple__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:499:2: rule__ExprSimple__Group__0
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group__0_in_ruleExprSimple1010);
            rule__ExprSimple__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExprSimple"


    // $ANTLR start "entryRuleLexpr"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:511:1: entryRuleLexpr : ruleLexpr EOF ;
    public final void entryRuleLexpr() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:512:1: ( ruleLexpr EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:513:1: ruleLexpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLexprRule()); 
            }
            pushFollow(FOLLOW_ruleLexpr_in_entryRuleLexpr1037);
            ruleLexpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLexprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLexpr1044); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLexpr"


    // $ANTLR start "ruleLexpr"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:520:1: ruleLexpr : ( ( ( rule__Lexpr__Group__0 ) ) ( ( rule__Lexpr__Group__0 )* ) ) ;
    public final void ruleLexpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:524:2: ( ( ( ( rule__Lexpr__Group__0 ) ) ( ( rule__Lexpr__Group__0 )* ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:525:1: ( ( ( rule__Lexpr__Group__0 ) ) ( ( rule__Lexpr__Group__0 )* ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:525:1: ( ( ( rule__Lexpr__Group__0 ) ) ( ( rule__Lexpr__Group__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:526:1: ( ( rule__Lexpr__Group__0 ) ) ( ( rule__Lexpr__Group__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:526:1: ( ( rule__Lexpr__Group__0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:527:1: ( rule__Lexpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLexprAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:528:1: ( rule__Lexpr__Group__0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:528:2: rule__Lexpr__Group__0
            {
            pushFollow(FOLLOW_rule__Lexpr__Group__0_in_ruleLexpr1072);
            rule__Lexpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLexprAccess().getGroup()); 
            }

            }

            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:531:1: ( ( rule__Lexpr__Group__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:532:1: ( rule__Lexpr__Group__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLexprAccess().getGroup()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:533:1: ( rule__Lexpr__Group__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_LC) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:533:2: rule__Lexpr__Group__0
            	    {
            	    pushFollow(FOLLOW_rule__Lexpr__Group__0_in_ruleLexpr1084);
            	    rule__Lexpr__Group__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLexprAccess().getGroup()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLexpr"


    // $ANTLR start "rule__Command__Alternatives"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:546:1: rule__Command__Alternatives : ( ( ( rule__Command__Group_0__0 ) ) | ( ( rule__Command__Group_1__0 ) ) | ( ( rule__Command__Group_2__0 ) ) | ( ( rule__Command__Group_3__0 ) ) | ( ( rule__Command__Group_4__0 ) ) | ( ( rule__Command__Group_5__0 ) ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: ( ( ( rule__Command__Group_0__0 ) ) | ( ( rule__Command__Group_1__0 ) ) | ( ( rule__Command__Group_2__0 ) ) | ( ( rule__Command__Group_3__0 ) ) | ( ( rule__Command__Group_4__0 ) ) | ( ( rule__Command__Group_5__0 ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt3=2;
                }
                break;
            case 39:
                {
                alt3=3;
                }
                break;
            case 40:
                {
                alt3=4;
                }
                break;
            case 41:
                {
                alt3=5;
                }
                break;
            case 42:
                {
                alt3=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( ( rule__Command__Group_0__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( ( rule__Command__Group_0__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( rule__Command__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getGroup_0()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:553:1: ( rule__Command__Group_0__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:553:2: rule__Command__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_0__0_in_rule__Command__Alternatives1123);
                    rule__Command__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:557:6: ( ( rule__Command__Group_1__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:557:6: ( ( rule__Command__Group_1__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:558:1: ( rule__Command__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getGroup_1()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:559:1: ( rule__Command__Group_1__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:559:2: rule__Command__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_1__0_in_rule__Command__Alternatives1141);
                    rule__Command__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:563:6: ( ( rule__Command__Group_2__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:563:6: ( ( rule__Command__Group_2__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:564:1: ( rule__Command__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getGroup_2()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:565:1: ( rule__Command__Group_2__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:565:2: rule__Command__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_2__0_in_rule__Command__Alternatives1159);
                    rule__Command__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:569:6: ( ( rule__Command__Group_3__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:569:6: ( ( rule__Command__Group_3__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:570:1: ( rule__Command__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getGroup_3()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:571:1: ( rule__Command__Group_3__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:571:2: rule__Command__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_3__0_in_rule__Command__Alternatives1177);
                    rule__Command__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:575:6: ( ( rule__Command__Group_4__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:575:6: ( ( rule__Command__Group_4__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:576:1: ( rule__Command__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getGroup_4()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:577:1: ( rule__Command__Group_4__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:577:2: rule__Command__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_4__0_in_rule__Command__Alternatives1195);
                    rule__Command__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:581:6: ( ( rule__Command__Group_5__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:581:6: ( ( rule__Command__Group_5__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:582:1: ( rule__Command__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getGroup_5()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:583:1: ( rule__Command__Group_5__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:583:2: rule__Command__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_5__0_in_rule__Command__Alternatives1213);
                    rule__Command__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__Expr__Alternatives"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:592:1: rule__Expr__Alternatives : ( ( ( rule__Expr__ExprSimpleAssignment_0 ) ) | ( ( rule__Expr__ExpEtAssignment_1 ) ) | ( ( rule__Expr__ExpTerminaleAssignment_2 ) ) );
    public final void rule__Expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:596:1: ( ( ( rule__Expr__ExprSimpleAssignment_0 ) ) | ( ( rule__Expr__ExpEtAssignment_1 ) ) | ( ( rule__Expr__ExpTerminaleAssignment_2 ) ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ( ( rule__Expr__ExprSimpleAssignment_0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ( ( rule__Expr__ExprSimpleAssignment_0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:598:1: ( rule__Expr__ExprSimpleAssignment_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getExprSimpleAssignment_0()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:599:1: ( rule__Expr__ExprSimpleAssignment_0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:599:2: rule__Expr__ExprSimpleAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Expr__ExprSimpleAssignment_0_in_rule__Expr__Alternatives1246);
                    rule__Expr__ExprSimpleAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprAccess().getExprSimpleAssignment_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:603:6: ( ( rule__Expr__ExpEtAssignment_1 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:603:6: ( ( rule__Expr__ExpEtAssignment_1 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:604:1: ( rule__Expr__ExpEtAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getExpEtAssignment_1()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:605:1: ( rule__Expr__ExpEtAssignment_1 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:605:2: rule__Expr__ExpEtAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Expr__ExpEtAssignment_1_in_rule__Expr__Alternatives1264);
                    rule__Expr__ExpEtAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprAccess().getExpEtAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:609:6: ( ( rule__Expr__ExpTerminaleAssignment_2 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:609:6: ( ( rule__Expr__ExpTerminaleAssignment_2 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:610:1: ( rule__Expr__ExpTerminaleAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getExpTerminaleAssignment_2()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:611:1: ( rule__Expr__ExpTerminaleAssignment_2 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:611:2: rule__Expr__ExpTerminaleAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Expr__ExpTerminaleAssignment_2_in_rule__Expr__Alternatives1282);
                    rule__Expr__ExpTerminaleAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprAccess().getExpTerminaleAssignment_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__Alternatives"


    // $ANTLR start "rule__Eq__Alternatives"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:620:1: rule__Eq__Alternatives : ( ( ( rule__Eq__Group_0__0 ) ) | ( ( rule__Eq__Group_1__0 ) ) );
    public final void rule__Eq__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:624:1: ( ( ( rule__Eq__Group_0__0 ) ) | ( ( rule__Eq__Group_1__0 ) ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:625:1: ( ( rule__Eq__Group_0__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:625:1: ( ( rule__Eq__Group_0__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:626:1: ( rule__Eq__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getGroup_0()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:627:1: ( rule__Eq__Group_0__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:627:2: rule__Eq__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Eq__Group_0__0_in_rule__Eq__Alternatives1315);
                    rule__Eq__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:631:6: ( ( rule__Eq__Group_1__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:631:6: ( ( rule__Eq__Group_1__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:632:1: ( rule__Eq__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getGroup_1()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:633:1: ( rule__Eq__Group_1__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:633:2: rule__Eq__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Eq__Group_1__0_in_rule__Eq__Alternatives1333);
                    rule__Eq__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eq__Alternatives"


    // $ANTLR start "rule__Eq__ExprEq1Alternatives_0_0_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:642:1: rule__Eq__ExprEq1Alternatives_0_0_0 : ( ( ruleExprSimple ) | ( ruleExprTerm ) );
    public final void rule__Eq__ExprEq1Alternatives_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:646:1: ( ( ruleExprSimple ) | ( ruleExprTerm ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==36) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_SYMBOLES && LA6_0<=RULE_VARIABLE)||LA6_0==38) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:647:1: ( ruleExprSimple )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:647:1: ( ruleExprSimple )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:648:1: ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getExprEq1ExprSimpleParserRuleCall_0_0_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_rule__Eq__ExprEq1Alternatives_0_0_01366);
                    ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqAccess().getExprEq1ExprSimpleParserRuleCall_0_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:653:6: ( ruleExprTerm )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:653:6: ( ruleExprTerm )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:654:1: ruleExprTerm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getExprEq1ExprTermParserRuleCall_0_0_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleExprTerm_in_rule__Eq__ExprEq1Alternatives_0_0_01383);
                    ruleExprTerm();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqAccess().getExprEq1ExprTermParserRuleCall_0_0_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eq__ExprEq1Alternatives_0_0_0"


    // $ANTLR start "rule__Eq__ExprEq2Alternatives_0_4_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: rule__Eq__ExprEq2Alternatives_0_4_0 : ( ( ruleExprSimple ) | ( ruleExprTerm ) );
    public final void rule__Eq__ExprEq2Alternatives_0_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:668:1: ( ( ruleExprSimple ) | ( ruleExprTerm ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==36) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_SYMBOLES && LA7_0<=RULE_VARIABLE)||LA7_0==38) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:669:1: ( ruleExprSimple )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:669:1: ( ruleExprSimple )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:670:1: ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getExprEq2ExprSimpleParserRuleCall_0_4_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_rule__Eq__ExprEq2Alternatives_0_4_01415);
                    ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqAccess().getExprEq2ExprSimpleParserRuleCall_0_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:675:6: ( ruleExprTerm )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:675:6: ( ruleExprTerm )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:676:1: ruleExprTerm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getExprEq2ExprTermParserRuleCall_0_4_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleExprTerm_in_rule__Eq__ExprEq2Alternatives_0_4_01432);
                    ruleExprTerm();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqAccess().getExprEq2ExprTermParserRuleCall_0_4_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eq__ExprEq2Alternatives_0_4_0"


    // $ANTLR start "rule__Eq__ExpAlternatives_1_1_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:686:1: rule__Eq__ExpAlternatives_1_1_0 : ( ( ruleExprTerm ) | ( ruleExprSimple ) );
    public final void rule__Eq__ExpAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:690:1: ( ( ruleExprTerm ) | ( ruleExprSimple ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_SYMBOLES && LA8_0<=RULE_VARIABLE)||LA8_0==38) ) {
                alt8=1;
            }
            else if ( (LA8_0==36) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: ( ruleExprTerm )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:691:1: ( ruleExprTerm )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:692:1: ruleExprTerm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getExpExprTermParserRuleCall_1_1_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleExprTerm_in_rule__Eq__ExpAlternatives_1_1_01464);
                    ruleExprTerm();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqAccess().getExpExprTermParserRuleCall_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:697:6: ( ruleExprSimple )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:697:6: ( ruleExprSimple )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:698:1: ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getExpExprSimpleParserRuleCall_1_1_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_rule__Eq__ExpAlternatives_1_1_01481);
                    ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqAccess().getExpExprSimpleParserRuleCall_1_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eq__ExpAlternatives_1_1_0"


    // $ANTLR start "rule__ExprTerm__Alternatives"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: rule__ExprTerm__Alternatives : ( ( ( rule__ExprTerm__Group_0__0 ) ) | ( ( rule__ExprTerm__TermVarAssignment_1 ) ) | ( ( rule__ExprTerm__TermSymAssignment_2 ) ) );
    public final void rule__ExprTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:712:1: ( ( ( rule__ExprTerm__Group_0__0 ) ) | ( ( rule__ExprTerm__TermVarAssignment_1 ) ) | ( ( rule__ExprTerm__TermSymAssignment_2 ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt9=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt9=2;
                }
                break;
            case RULE_SYMBOLES:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:713:1: ( ( rule__ExprTerm__Group_0__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:713:1: ( ( rule__ExprTerm__Group_0__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:714:1: ( rule__ExprTerm__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprTermAccess().getGroup_0()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:715:1: ( rule__ExprTerm__Group_0__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:715:2: rule__ExprTerm__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__ExprTerm__Group_0__0_in_rule__ExprTerm__Alternatives1513);
                    rule__ExprTerm__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprTermAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:719:6: ( ( rule__ExprTerm__TermVarAssignment_1 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:719:6: ( ( rule__ExprTerm__TermVarAssignment_1 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: ( rule__ExprTerm__TermVarAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprTermAccess().getTermVarAssignment_1()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:721:1: ( rule__ExprTerm__TermVarAssignment_1 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:721:2: rule__ExprTerm__TermVarAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ExprTerm__TermVarAssignment_1_in_rule__ExprTerm__Alternatives1531);
                    rule__ExprTerm__TermVarAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprTermAccess().getTermVarAssignment_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:725:6: ( ( rule__ExprTerm__TermSymAssignment_2 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:725:6: ( ( rule__ExprTerm__TermSymAssignment_2 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:726:1: ( rule__ExprTerm__TermSymAssignment_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprTermAccess().getTermSymAssignment_2()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:727:1: ( rule__ExprTerm__TermSymAssignment_2 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:727:2: rule__ExprTerm__TermSymAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ExprTerm__TermSymAssignment_2_in_rule__ExprTerm__Alternatives1549);
                    rule__ExprTerm__TermSymAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprTermAccess().getTermSymAssignment_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTerm__Alternatives"


    // $ANTLR start "rule__ExprSimple__Alternatives_1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:736:1: rule__ExprSimple__Alternatives_1 : ( ( ( rule__ExprSimple__Group_1_0__0 ) ) | ( ( rule__ExprSimple__Group_1_1__0 ) ) );
    public final void rule__ExprSimple__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:740:1: ( ( ( rule__ExprSimple__Group_1_0__0 ) ) | ( ( rule__ExprSimple__Group_1_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=14 && LA10_0<=15)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=16 && LA10_0<=17)) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:741:1: ( ( rule__ExprSimple__Group_1_0__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:741:1: ( ( rule__ExprSimple__Group_1_0__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:742:1: ( rule__ExprSimple__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_1_0()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:743:1: ( rule__ExprSimple__Group_1_0__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:743:2: rule__ExprSimple__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_1_0__0_in_rule__ExprSimple__Alternatives_11582);
                    rule__ExprSimple__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:747:6: ( ( rule__ExprSimple__Group_1_1__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:747:6: ( ( rule__ExprSimple__Group_1_1__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:748:1: ( rule__ExprSimple__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_1_1()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:749:1: ( rule__ExprSimple__Group_1_1__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:749:2: rule__ExprSimple__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__0_in_rule__ExprSimple__Alternatives_11600);
                    rule__ExprSimple__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Alternatives_1"


    // $ANTLR start "rule__ExprSimple__MotAlternatives_1_0_0_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:758:1: rule__ExprSimple__MotAlternatives_1_0_0_0 : ( ( 'cons' ) | ( 'list' ) );
    public final void rule__ExprSimple__MotAlternatives_1_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: ( ( 'cons' ) | ( 'list' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            else if ( (LA11_0==15) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:763:1: ( 'cons' )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:763:1: ( 'cons' )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:764:1: 'cons'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getMotConsKeyword_1_0_0_0_0()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__ExprSimple__MotAlternatives_1_0_0_01634); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getMotConsKeyword_1_0_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:771:6: ( 'list' )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:771:6: ( 'list' )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:772:1: 'list'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getMotListKeyword_1_0_0_0_1()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__ExprSimple__MotAlternatives_1_0_0_01654); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getMotListKeyword_1_0_0_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__MotAlternatives_1_0_0_0"


    // $ANTLR start "rule__ExprSimple__MotAlternatives_1_1_0_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:784:1: rule__ExprSimple__MotAlternatives_1_1_0_0 : ( ( 'hd' ) | ( 'tl' ) );
    public final void rule__ExprSimple__MotAlternatives_1_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:788:1: ( ( 'hd' ) | ( 'tl' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            else if ( (LA12_0==17) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: ( 'hd' )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:789:1: ( 'hd' )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: 'hd'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getMotHdKeyword_1_1_0_0_0()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__ExprSimple__MotAlternatives_1_1_0_01689); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getMotHdKeyword_1_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:797:6: ( 'tl' )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:797:6: ( 'tl' )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: 'tl'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getMotTlKeyword_1_1_0_0_1()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__ExprSimple__MotAlternatives_1_1_0_01709); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getMotTlKeyword_1_1_0_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__MotAlternatives_1_1_0_0"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:812:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:816:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:817:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01741);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01744);
            rule__Model__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:824:1: rule__Model__Group__0__Impl : ( ( rule__Model__ModelAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:828:1: ( ( ( rule__Model__ModelAssignment_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:829:1: ( ( rule__Model__ModelAssignment_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:829:1: ( ( rule__Model__ModelAssignment_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:830:1: ( rule__Model__ModelAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelAssignment_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( rule__Model__ModelAssignment_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:831:2: rule__Model__ModelAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__ModelAssignment_0_in_rule__Model__Group__0__Impl1771);
            rule__Model__ModelAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getModelAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:841:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:845:1: ( rule__Model__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:846:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11801);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:852:1: rule__Model__Group__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:856:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getLCTerminalRuleCall_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:859:1: ( RULE_LC )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_LC) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:859:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Model__Group__1__Impl1829); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getLCTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:873:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:877:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:878:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__01864);
            rule__Function__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__01867);
            rule__Function__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0"


    // $ANTLR start "rule__Function__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:885:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:889:1: ( ( 'function' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:890:1: ( 'function' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:890:1: ( 'function' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:891:1: 'function'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__Function__Group__0__Impl1895); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__0__Impl"


    // $ANTLR start "rule__Function__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:904:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:908:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:909:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__11926);
            rule__Function__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__11929);
            rule__Function__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1"


    // $ANTLR start "rule__Function__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:916:1: rule__Function__Group__1__Impl : ( RULE_LC ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:920:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:921:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:921:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:922:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getLCTerminalRuleCall_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Function__Group__1__Impl1956); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getLCTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__1__Impl"


    // $ANTLR start "rule__Function__Group__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:933:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:937:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:938:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__21985);
            rule__Function__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__21988);
            rule__Function__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2"


    // $ANTLR start "rule__Function__Group__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:945:1: rule__Function__Group__2__Impl : ( ( rule__Function__FunNameAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:949:1: ( ( ( rule__Function__FunNameAssignment_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:950:1: ( ( rule__Function__FunNameAssignment_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:950:1: ( ( rule__Function__FunNameAssignment_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:951:1: ( rule__Function__FunNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFunNameAssignment_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:952:1: ( rule__Function__FunNameAssignment_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:952:2: rule__Function__FunNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Function__FunNameAssignment_2_in_rule__Function__Group__2__Impl2015);
            rule__Function__FunNameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getFunNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__2__Impl"


    // $ANTLR start "rule__Function__Group__3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:962:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:966:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:967:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__32045);
            rule__Function__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__32048);
            rule__Function__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3"


    // $ANTLR start "rule__Function__Group__3__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:974:1: rule__Function__Group__3__Impl : ( ':' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:978:1: ( ( ':' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:979:1: ( ':' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:979:1: ( ':' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:980:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getColonKeyword_3()); 
            }
            match(input,19,FOLLOW_19_in_rule__Function__Group__3__Impl2076); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getColonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__3__Impl"


    // $ANTLR start "rule__Function__Group__4"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:993:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:997:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:998:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__42107);
            rule__Function__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__5_in_rule__Function__Group__42110);
            rule__Function__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4"


    // $ANTLR start "rule__Function__Group__4__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1005:1: rule__Function__Group__4__Impl : ( RULE_LC ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1009:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1010:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1010:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1011:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getLCTerminalRuleCall_4()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Function__Group__4__Impl2137); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getLCTerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__4__Impl"


    // $ANTLR start "rule__Function__Group__5"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1022:1: rule__Function__Group__5 : rule__Function__Group__5__Impl ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1026:1: ( rule__Function__Group__5__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1027:2: rule__Function__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__52166);
            rule__Function__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5"


    // $ANTLR start "rule__Function__Group__5__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1033:1: rule__Function__Group__5__Impl : ( ( rule__Function__DefAssignment_5 ) ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1037:1: ( ( ( rule__Function__DefAssignment_5 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1038:1: ( ( rule__Function__DefAssignment_5 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1038:1: ( ( rule__Function__DefAssignment_5 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1039:1: ( rule__Function__DefAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getDefAssignment_5()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1040:1: ( rule__Function__DefAssignment_5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1040:2: rule__Function__DefAssignment_5
            {
            pushFollow(FOLLOW_rule__Function__DefAssignment_5_in_rule__Function__Group__5__Impl2193);
            rule__Function__DefAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getDefAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__Group__5__Impl"


    // $ANTLR start "rule__Definiton__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:1: rule__Definiton__Group__0 : rule__Definiton__Group__0__Impl rule__Definiton__Group__1 ;
    public final void rule__Definiton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1066:1: ( rule__Definiton__Group__0__Impl rule__Definiton__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1067:2: rule__Definiton__Group__0__Impl rule__Definiton__Group__1
            {
            pushFollow(FOLLOW_rule__Definiton__Group__0__Impl_in_rule__Definiton__Group__02235);
            rule__Definiton__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__1_in_rule__Definiton__Group__02238);
            rule__Definiton__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__Group__0"


    // $ANTLR start "rule__Definiton__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1074:1: rule__Definiton__Group__0__Impl : ( 'read' ) ;
    public final void rule__Definiton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1078:1: ( ( 'read' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1079:1: ( 'read' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1079:1: ( 'read' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1080:1: 'read'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getReadKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Definiton__Group__0__Impl2266); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getReadKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__Group__0__Impl"


    // $ANTLR start "rule__Definiton__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1093:1: rule__Definiton__Group__1 : rule__Definiton__Group__1__Impl rule__Definiton__Group__2 ;
    public final void rule__Definiton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1097:1: ( rule__Definiton__Group__1__Impl rule__Definiton__Group__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1098:2: rule__Definiton__Group__1__Impl rule__Definiton__Group__2
            {
            pushFollow(FOLLOW_rule__Definiton__Group__1__Impl_in_rule__Definiton__Group__12297);
            rule__Definiton__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__2_in_rule__Definiton__Group__12300);
            rule__Definiton__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__Group__1"


    // $ANTLR start "rule__Definiton__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:1: rule__Definiton__Group__1__Impl : ( RULE_LC ) ;
    public final void rule__Definiton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1109:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1110:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1110:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1111:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Definiton__Group__1__Impl2327); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__Group__1__Impl"


    // $ANTLR start "rule__Definiton__Group__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1122:1: rule__Definiton__Group__2 : rule__Definiton__Group__2__Impl rule__Definiton__Group__3 ;
    public final void rule__Definiton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1126:1: ( rule__Definiton__Group__2__Impl rule__Definiton__Group__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1127:2: rule__Definiton__Group__2__Impl rule__Definiton__Group__3
            {
            pushFollow(FOLLOW_rule__Definiton__Group__2__Impl_in_rule__Definiton__Group__22356);
            rule__Definiton__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__3_in_rule__Definiton__Group__22359);
            rule__Definiton__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__Group__2"


    // $ANTLR start "rule__Definiton__Group__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1134:1: rule__Definiton__Group__2__Impl : ( ( rule__Definiton__InputVarsAssignment_2 ) ) ;
    public final void rule__Definiton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:1: ( ( ( rule__Definiton__InputVarsAssignment_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1139:1: ( ( rule__Definiton__InputVarsAssignment_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1139:1: ( ( rule__Definiton__InputVarsAssignment_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1140:1: ( rule__Definiton__InputVarsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getInputVarsAssignment_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1141:1: ( rule__Definiton__InputVarsAssignment_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1141:2: rule__Definiton__InputVarsAssignment_2
            {
            pushFollow(FOLLOW_rule__Definiton__InputVarsAssignment_2_in_rule__Definiton__Group__2__Impl2386);
            rule__Definiton__InputVarsAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getInputVarsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__Group__2__Impl"


    // $ANTLR start "rule__Definiton__Group__3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1151:1: rule__Definiton__Group__3 : rule__Definiton__Group__3__Impl rule__Definiton__Group__4 ;
    public final void rule__Definiton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1155:1: ( rule__Definiton__Group__3__Impl rule__Definiton__Group__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1156:2: rule__Definiton__Group__3__Impl rule__Definiton__Group__4
            {
            pushFollow(FOLLOW_rule__Definiton__Group__3__Impl_in_rule__Definiton__Group__32416);
            rule__Definiton__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__4_in_rule__Definiton__Group__32419);
            rule__Definiton__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__Group__3"


    // $ANTLR start "rule__Definiton__Group__3__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1163:1: rule__Definiton__Group__3__Impl : ( RULE_LC ) ;
    public final void rule__Definiton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1167:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1168:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Definiton__Group__3__Impl2446); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__Group__3__Impl"


    // $ANTLR start "rule__Definiton__Group__4"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1180:1: rule__Definiton__Group__4 : rule__Definiton__Group__4__Impl rule__Definiton__Group__5 ;
    public final void rule__Definiton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1184:1: ( rule__Definiton__Group__4__Impl rule__Definiton__Group__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1185:2: rule__Definiton__Group__4__Impl rule__Definiton__Group__5
            {
            pushFollow(FOLLOW_rule__Definiton__Group__4__Impl_in_rule__Definiton__Group__42475);
            rule__Definiton__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__5_in_rule__Definiton__Group__42478);
            rule__Definiton__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__Group__4"


    // $ANTLR start "rule__Definiton__Group__4__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1192:1: rule__Definiton__Group__4__Impl : ( '%' ) ;
    public final void rule__Definiton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:1: ( ( '%' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1197:1: ( '%' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1197:1: ( '%' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1198:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getPercentSignKeyword_4()); 
            }
            match(input,21,FOLLOW_21_in_rule__Definiton__Group__4__Impl2506); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getPercentSignKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__Group__4__Impl"


    // $ANTLR start "rule__Definiton__Group__5"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:1: rule__Definiton__Group__5 : rule__Definiton__Group__5__Impl rule__Definiton__Group__6 ;
    public final void rule__Definiton__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1215:1: ( rule__Definiton__Group__5__Impl rule__Definiton__Group__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1216:2: rule__Definiton__Group__5__Impl rule__Definiton__Group__6
            {
            pushFollow(FOLLOW_rule__Definiton__Group__5__Impl_in_rule__Definiton__Group__52537);
            rule__Definiton__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__6_in_rule__Definiton__Group__52540);
            rule__Definiton__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__Group__5"


    // $ANTLR start "rule__Definiton__Group__5__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1223:1: rule__Definiton__Group__5__Impl : ( ( rule__Definiton__CommandListAssignment_5 ) ) ;
    public final void rule__Definiton__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1227:1: ( ( ( rule__Definiton__CommandListAssignment_5 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1228:1: ( ( rule__Definiton__CommandListAssignment_5 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1228:1: ( ( rule__Definiton__CommandListAssignment_5 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:1: ( rule__Definiton__CommandListAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getCommandListAssignment_5()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:1: ( rule__Definiton__CommandListAssignment_5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:2: rule__Definiton__CommandListAssignment_5
            {
            pushFollow(FOLLOW_rule__Definiton__CommandListAssignment_5_in_rule__Definiton__Group__5__Impl2567);
            rule__Definiton__CommandListAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getCommandListAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__Group__5__Impl"


    // $ANTLR start "rule__Definiton__Group__6"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1240:1: rule__Definiton__Group__6 : rule__Definiton__Group__6__Impl rule__Definiton__Group__7 ;
    public final void rule__Definiton__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1244:1: ( rule__Definiton__Group__6__Impl rule__Definiton__Group__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:2: rule__Definiton__Group__6__Impl rule__Definiton__Group__7
            {
            pushFollow(FOLLOW_rule__Definiton__Group__6__Impl_in_rule__Definiton__Group__62597);
            rule__Definiton__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__7_in_rule__Definiton__Group__62600);
            rule__Definiton__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__Group__6"


    // $ANTLR start "rule__Definiton__Group__6__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1252:1: rule__Definiton__Group__6__Impl : ( RULE_LC ) ;
    public final void rule__Definiton__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1256:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1257:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1257:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1258:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_6()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Definiton__Group__6__Impl2627); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__Group__6__Impl"


    // $ANTLR start "rule__Definiton__Group__7"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1269:1: rule__Definiton__Group__7 : rule__Definiton__Group__7__Impl rule__Definiton__Group__8 ;
    public final void rule__Definiton__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1273:1: ( rule__Definiton__Group__7__Impl rule__Definiton__Group__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1274:2: rule__Definiton__Group__7__Impl rule__Definiton__Group__8
            {
            pushFollow(FOLLOW_rule__Definiton__Group__7__Impl_in_rule__Definiton__Group__72656);
            rule__Definiton__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__8_in_rule__Definiton__Group__72659);
            rule__Definiton__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__Group__7"


    // $ANTLR start "rule__Definiton__Group__7__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1281:1: rule__Definiton__Group__7__Impl : ( '%' ) ;
    public final void rule__Definiton__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:1: ( ( '%' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:1: ( '%' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1286:1: ( '%' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1287:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getPercentSignKeyword_7()); 
            }
            match(input,21,FOLLOW_21_in_rule__Definiton__Group__7__Impl2687); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getPercentSignKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__Group__7__Impl"


    // $ANTLR start "rule__Definiton__Group__8"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1300:1: rule__Definiton__Group__8 : rule__Definiton__Group__8__Impl rule__Definiton__Group__9 ;
    public final void rule__Definiton__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1304:1: ( rule__Definiton__Group__8__Impl rule__Definiton__Group__9 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1305:2: rule__Definiton__Group__8__Impl rule__Definiton__Group__9
            {
            pushFollow(FOLLOW_rule__Definiton__Group__8__Impl_in_rule__Definiton__Group__82718);
            rule__Definiton__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__9_in_rule__Definiton__Group__82721);
            rule__Definiton__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__Group__8"


    // $ANTLR start "rule__Definiton__Group__8__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1312:1: rule__Definiton__Group__8__Impl : ( 'write' ) ;
    public final void rule__Definiton__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1316:1: ( ( 'write' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1317:1: ( 'write' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1317:1: ( 'write' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1318:1: 'write'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getWriteKeyword_8()); 
            }
            match(input,22,FOLLOW_22_in_rule__Definiton__Group__8__Impl2749); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getWriteKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__Group__8__Impl"


    // $ANTLR start "rule__Definiton__Group__9"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1331:1: rule__Definiton__Group__9 : rule__Definiton__Group__9__Impl rule__Definiton__Group__10 ;
    public final void rule__Definiton__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1335:1: ( rule__Definiton__Group__9__Impl rule__Definiton__Group__10 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:2: rule__Definiton__Group__9__Impl rule__Definiton__Group__10
            {
            pushFollow(FOLLOW_rule__Definiton__Group__9__Impl_in_rule__Definiton__Group__92780);
            rule__Definiton__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__10_in_rule__Definiton__Group__92783);
            rule__Definiton__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__Group__9"


    // $ANTLR start "rule__Definiton__Group__9__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1343:1: rule__Definiton__Group__9__Impl : ( RULE_LC ) ;
    public final void rule__Definiton__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1347:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1348:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1348:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1349:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_9()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Definiton__Group__9__Impl2810); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__Group__9__Impl"


    // $ANTLR start "rule__Definiton__Group__10"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1360:1: rule__Definiton__Group__10 : rule__Definiton__Group__10__Impl ;
    public final void rule__Definiton__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:1: ( rule__Definiton__Group__10__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:2: rule__Definiton__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Definiton__Group__10__Impl_in_rule__Definiton__Group__102839);
            rule__Definiton__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__Group__10"


    // $ANTLR start "rule__Definiton__Group__10__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:1: rule__Definiton__Group__10__Impl : ( ( rule__Definiton__OutputVarsAssignment_10 ) ) ;
    public final void rule__Definiton__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1375:1: ( ( ( rule__Definiton__OutputVarsAssignment_10 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1376:1: ( ( rule__Definiton__OutputVarsAssignment_10 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1376:1: ( ( rule__Definiton__OutputVarsAssignment_10 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1377:1: ( rule__Definiton__OutputVarsAssignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getOutputVarsAssignment_10()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1378:1: ( rule__Definiton__OutputVarsAssignment_10 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1378:2: rule__Definiton__OutputVarsAssignment_10
            {
            pushFollow(FOLLOW_rule__Definiton__OutputVarsAssignment_10_in_rule__Definiton__Group__10__Impl2866);
            rule__Definiton__OutputVarsAssignment_10();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getOutputVarsAssignment_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__Group__10__Impl"


    // $ANTLR start "rule__Input__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1410:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1414:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1415:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__02918);
            rule__Input__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group__1_in_rule__Input__Group__02921);
            rule__Input__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0"


    // $ANTLR start "rule__Input__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1422:1: rule__Input__Group__0__Impl : ( ( rule__Input__VAssignment_0 ) ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1426:1: ( ( ( rule__Input__VAssignment_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1427:1: ( ( rule__Input__VAssignment_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1427:1: ( ( rule__Input__VAssignment_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1428:1: ( rule__Input__VAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVAssignment_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:1: ( rule__Input__VAssignment_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:2: rule__Input__VAssignment_0
            {
            pushFollow(FOLLOW_rule__Input__VAssignment_0_in_rule__Input__Group__0__Impl2948);
            rule__Input__VAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__0__Impl"


    // $ANTLR start "rule__Input__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1439:1: rule__Input__Group__1 : rule__Input__Group__1__Impl ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1443:1: ( rule__Input__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1444:2: rule__Input__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__12978);
            rule__Input__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1"


    // $ANTLR start "rule__Input__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1450:1: rule__Input__Group__1__Impl : ( ( rule__Input__Group_1__0 )* ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:1: ( ( ( rule__Input__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1455:1: ( ( rule__Input__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1455:1: ( ( rule__Input__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:1: ( rule__Input__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:1: ( rule__Input__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:2: rule__Input__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Input__Group_1__0_in_rule__Input__Group__1__Impl3005);
            	    rule__Input__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group__1__Impl"


    // $ANTLR start "rule__Input__Group_1__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1471:1: rule__Input__Group_1__0 : rule__Input__Group_1__0__Impl rule__Input__Group_1__1 ;
    public final void rule__Input__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1475:1: ( rule__Input__Group_1__0__Impl rule__Input__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1476:2: rule__Input__Group_1__0__Impl rule__Input__Group_1__1
            {
            pushFollow(FOLLOW_rule__Input__Group_1__0__Impl_in_rule__Input__Group_1__03040);
            rule__Input__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_1__1_in_rule__Input__Group_1__03043);
            rule__Input__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_1__0"


    // $ANTLR start "rule__Input__Group_1__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1483:1: rule__Input__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Input__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1487:1: ( ( ',' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1488:1: ( ',' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1488:1: ( ',' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1489:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getCommaKeyword_1_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Input__Group_1__0__Impl3071); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_1__0__Impl"


    // $ANTLR start "rule__Input__Group_1__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1502:1: rule__Input__Group_1__1 : rule__Input__Group_1__1__Impl rule__Input__Group_1__2 ;
    public final void rule__Input__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1506:1: ( rule__Input__Group_1__1__Impl rule__Input__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1507:2: rule__Input__Group_1__1__Impl rule__Input__Group_1__2
            {
            pushFollow(FOLLOW_rule__Input__Group_1__1__Impl_in_rule__Input__Group_1__13102);
            rule__Input__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_1__2_in_rule__Input__Group_1__13105);
            rule__Input__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_1__1"


    // $ANTLR start "rule__Input__Group_1__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1514:1: rule__Input__Group_1__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Input__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1520:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getLCTerminalRuleCall_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1521:1: ( RULE_LC )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_LC) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1521:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Input__Group_1__1__Impl3133); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getLCTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_1__1__Impl"


    // $ANTLR start "rule__Input__Group_1__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1531:1: rule__Input__Group_1__2 : rule__Input__Group_1__2__Impl ;
    public final void rule__Input__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1535:1: ( rule__Input__Group_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1536:2: rule__Input__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_1__2__Impl_in_rule__Input__Group_1__23164);
            rule__Input__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_1__2"


    // $ANTLR start "rule__Input__Group_1__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1542:1: rule__Input__Group_1__2__Impl : ( ( rule__Input__V2Assignment_1_2 ) ) ;
    public final void rule__Input__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1546:1: ( ( ( rule__Input__V2Assignment_1_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1547:1: ( ( rule__Input__V2Assignment_1_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1547:1: ( ( rule__Input__V2Assignment_1_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1548:1: ( rule__Input__V2Assignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getV2Assignment_1_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:1: ( rule__Input__V2Assignment_1_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:2: rule__Input__V2Assignment_1_2
            {
            pushFollow(FOLLOW_rule__Input__V2Assignment_1_2_in_rule__Input__Group_1__2__Impl3191);
            rule__Input__V2Assignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getV2Assignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__Group_1__2__Impl"


    // $ANTLR start "rule__Output__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1565:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1569:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1570:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__03227);
            rule__Output__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group__1_in_rule__Output__Group__03230);
            rule__Output__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0"


    // $ANTLR start "rule__Output__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1577:1: rule__Output__Group__0__Impl : ( ( rule__Output__VAssignment_0 ) ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1581:1: ( ( ( rule__Output__VAssignment_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1582:1: ( ( rule__Output__VAssignment_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1582:1: ( ( rule__Output__VAssignment_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1583:1: ( rule__Output__VAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVAssignment_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1584:1: ( rule__Output__VAssignment_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1584:2: rule__Output__VAssignment_0
            {
            pushFollow(FOLLOW_rule__Output__VAssignment_0_in_rule__Output__Group__0__Impl3257);
            rule__Output__VAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getVAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__0__Impl"


    // $ANTLR start "rule__Output__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1594:1: rule__Output__Group__1 : rule__Output__Group__1__Impl ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1598:1: ( rule__Output__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1599:2: rule__Output__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__13287);
            rule__Output__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1"


    // $ANTLR start "rule__Output__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1605:1: rule__Output__Group__1__Impl : ( ( rule__Output__Group_1__0 )* ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1609:1: ( ( ( rule__Output__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1610:1: ( ( rule__Output__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1610:1: ( ( rule__Output__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1611:1: ( rule__Output__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1612:1: ( rule__Output__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1612:2: rule__Output__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Output__Group_1__0_in_rule__Output__Group__1__Impl3314);
            	    rule__Output__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group__1__Impl"


    // $ANTLR start "rule__Output__Group_1__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1626:1: rule__Output__Group_1__0 : rule__Output__Group_1__0__Impl rule__Output__Group_1__1 ;
    public final void rule__Output__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1630:1: ( rule__Output__Group_1__0__Impl rule__Output__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1631:2: rule__Output__Group_1__0__Impl rule__Output__Group_1__1
            {
            pushFollow(FOLLOW_rule__Output__Group_1__0__Impl_in_rule__Output__Group_1__03349);
            rule__Output__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group_1__1_in_rule__Output__Group_1__03352);
            rule__Output__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_1__0"


    // $ANTLR start "rule__Output__Group_1__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1638:1: rule__Output__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Output__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1642:1: ( ( ',' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1643:1: ( ',' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1643:1: ( ',' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1644:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getCommaKeyword_1_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Output__Group_1__0__Impl3380); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_1__0__Impl"


    // $ANTLR start "rule__Output__Group_1__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1657:1: rule__Output__Group_1__1 : rule__Output__Group_1__1__Impl rule__Output__Group_1__2 ;
    public final void rule__Output__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1661:1: ( rule__Output__Group_1__1__Impl rule__Output__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1662:2: rule__Output__Group_1__1__Impl rule__Output__Group_1__2
            {
            pushFollow(FOLLOW_rule__Output__Group_1__1__Impl_in_rule__Output__Group_1__13411);
            rule__Output__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group_1__2_in_rule__Output__Group_1__13414);
            rule__Output__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_1__1"


    // $ANTLR start "rule__Output__Group_1__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1669:1: rule__Output__Group_1__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Output__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1673:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1674:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1674:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1675:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getLCTerminalRuleCall_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1676:1: ( RULE_LC )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_LC) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1676:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Output__Group_1__1__Impl3442); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getLCTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_1__1__Impl"


    // $ANTLR start "rule__Output__Group_1__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1686:1: rule__Output__Group_1__2 : rule__Output__Group_1__2__Impl ;
    public final void rule__Output__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1690:1: ( rule__Output__Group_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1691:2: rule__Output__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group_1__2__Impl_in_rule__Output__Group_1__23473);
            rule__Output__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_1__2"


    // $ANTLR start "rule__Output__Group_1__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1697:1: rule__Output__Group_1__2__Impl : ( ( rule__Output__V2Assignment_1_2 ) ) ;
    public final void rule__Output__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1701:1: ( ( ( rule__Output__V2Assignment_1_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1702:1: ( ( rule__Output__V2Assignment_1_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1702:1: ( ( rule__Output__V2Assignment_1_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1703:1: ( rule__Output__V2Assignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getV2Assignment_1_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1704:1: ( rule__Output__V2Assignment_1_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1704:2: rule__Output__V2Assignment_1_2
            {
            pushFollow(FOLLOW_rule__Output__V2Assignment_1_2_in_rule__Output__Group_1__2__Impl3500);
            rule__Output__V2Assignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getV2Assignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__Group_1__2__Impl"


    // $ANTLR start "rule__Commands__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1720:1: rule__Commands__Group__0 : rule__Commands__Group__0__Impl rule__Commands__Group__1 ;
    public final void rule__Commands__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:1: ( rule__Commands__Group__0__Impl rule__Commands__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1725:2: rule__Commands__Group__0__Impl rule__Commands__Group__1
            {
            pushFollow(FOLLOW_rule__Commands__Group__0__Impl_in_rule__Commands__Group__03536);
            rule__Commands__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group__1_in_rule__Commands__Group__03539);
            rule__Commands__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group__0"


    // $ANTLR start "rule__Commands__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1732:1: rule__Commands__Group__0__Impl : ( ( rule__Commands__CAssignment_0 ) ) ;
    public final void rule__Commands__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1736:1: ( ( ( rule__Commands__CAssignment_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1737:1: ( ( rule__Commands__CAssignment_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1737:1: ( ( rule__Commands__CAssignment_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: ( rule__Commands__CAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCAssignment_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:1: ( rule__Commands__CAssignment_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:2: rule__Commands__CAssignment_0
            {
            pushFollow(FOLLOW_rule__Commands__CAssignment_0_in_rule__Commands__Group__0__Impl3566);
            rule__Commands__CAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getCAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group__0__Impl"


    // $ANTLR start "rule__Commands__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1749:1: rule__Commands__Group__1 : rule__Commands__Group__1__Impl ;
    public final void rule__Commands__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1753:1: ( rule__Commands__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1754:2: rule__Commands__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Commands__Group__1__Impl_in_rule__Commands__Group__13596);
            rule__Commands__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group__1"


    // $ANTLR start "rule__Commands__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1760:1: rule__Commands__Group__1__Impl : ( ( rule__Commands__Group_1__0 )* ) ;
    public final void rule__Commands__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1764:1: ( ( ( rule__Commands__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1765:1: ( ( rule__Commands__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1765:1: ( ( rule__Commands__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1766:1: ( rule__Commands__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:1: ( rule__Commands__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==24) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:2: rule__Commands__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Commands__Group_1__0_in_rule__Commands__Group__1__Impl3623);
            	    rule__Commands__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group__1__Impl"


    // $ANTLR start "rule__Commands__Group_1__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1781:1: rule__Commands__Group_1__0 : rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1 ;
    public final void rule__Commands__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1785:1: ( rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1786:2: rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1
            {
            pushFollow(FOLLOW_rule__Commands__Group_1__0__Impl_in_rule__Commands__Group_1__03658);
            rule__Commands__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group_1__1_in_rule__Commands__Group_1__03661);
            rule__Commands__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group_1__0"


    // $ANTLR start "rule__Commands__Group_1__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1793:1: rule__Commands__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Commands__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1797:1: ( ( ';' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1798:1: ( ';' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1798:1: ( ';' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1799:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Commands__Group_1__0__Impl3689); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group_1__0__Impl"


    // $ANTLR start "rule__Commands__Group_1__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1812:1: rule__Commands__Group_1__1 : rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2 ;
    public final void rule__Commands__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1816:1: ( rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1817:2: rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2
            {
            pushFollow(FOLLOW_rule__Commands__Group_1__1__Impl_in_rule__Commands__Group_1__13720);
            rule__Commands__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group_1__2_in_rule__Commands__Group_1__13723);
            rule__Commands__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group_1__1"


    // $ANTLR start "rule__Commands__Group_1__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:1: rule__Commands__Group_1__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Commands__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1828:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1829:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1829:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1830:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getLCTerminalRuleCall_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:1: ( RULE_LC )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_LC) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Commands__Group_1__1__Impl3751); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getLCTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group_1__1__Impl"


    // $ANTLR start "rule__Commands__Group_1__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1841:1: rule__Commands__Group_1__2 : rule__Commands__Group_1__2__Impl ;
    public final void rule__Commands__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1845:1: ( rule__Commands__Group_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1846:2: rule__Commands__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Commands__Group_1__2__Impl_in_rule__Commands__Group_1__23782);
            rule__Commands__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group_1__2"


    // $ANTLR start "rule__Commands__Group_1__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1852:1: rule__Commands__Group_1__2__Impl : ( ( rule__Commands__CAssignment_1_2 ) ) ;
    public final void rule__Commands__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1856:1: ( ( ( rule__Commands__CAssignment_1_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1857:1: ( ( rule__Commands__CAssignment_1_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1857:1: ( ( rule__Commands__CAssignment_1_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1858:1: ( rule__Commands__CAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCAssignment_1_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:1: ( rule__Commands__CAssignment_1_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:2: rule__Commands__CAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Commands__CAssignment_1_2_in_rule__Commands__Group_1__2__Impl3809);
            rule__Commands__CAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getCAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__Group_1__2__Impl"


    // $ANTLR start "rule__Vars__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1875:1: rule__Vars__Group__0 : rule__Vars__Group__0__Impl rule__Vars__Group__1 ;
    public final void rule__Vars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:1: ( rule__Vars__Group__0__Impl rule__Vars__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1880:2: rule__Vars__Group__0__Impl rule__Vars__Group__1
            {
            pushFollow(FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__03845);
            rule__Vars__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__03848);
            rule__Vars__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__0"


    // $ANTLR start "rule__Vars__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1887:1: rule__Vars__Group__0__Impl : ( ( rule__Vars__V1Assignment_0 ) ) ;
    public final void rule__Vars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1891:1: ( ( ( rule__Vars__V1Assignment_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1892:1: ( ( rule__Vars__V1Assignment_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1892:1: ( ( rule__Vars__V1Assignment_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1893:1: ( rule__Vars__V1Assignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getV1Assignment_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1894:1: ( rule__Vars__V1Assignment_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1894:2: rule__Vars__V1Assignment_0
            {
            pushFollow(FOLLOW_rule__Vars__V1Assignment_0_in_rule__Vars__Group__0__Impl3875);
            rule__Vars__V1Assignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getV1Assignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__0__Impl"


    // $ANTLR start "rule__Vars__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1904:1: rule__Vars__Group__1 : rule__Vars__Group__1__Impl ;
    public final void rule__Vars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1908:1: ( rule__Vars__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1909:2: rule__Vars__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__13905);
            rule__Vars__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__1"


    // $ANTLR start "rule__Vars__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1915:1: rule__Vars__Group__1__Impl : ( ( rule__Vars__Group_1__0 )? ) ;
    public final void rule__Vars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1919:1: ( ( ( rule__Vars__Group_1__0 )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1920:1: ( ( rule__Vars__Group_1__0 )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1920:1: ( ( rule__Vars__Group_1__0 )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1921:1: ( rule__Vars__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:1: ( rule__Vars__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:2: rule__Vars__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Vars__Group_1__0_in_rule__Vars__Group__1__Impl3932);
                    rule__Vars__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group__1__Impl"


    // $ANTLR start "rule__Vars__Group_1__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1936:1: rule__Vars__Group_1__0 : rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 ;
    public final void rule__Vars__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1940:1: ( rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1941:2: rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__0__Impl_in_rule__Vars__Group_1__03967);
            rule__Vars__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group_1__1_in_rule__Vars__Group_1__03970);
            rule__Vars__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_1__0"


    // $ANTLR start "rule__Vars__Group_1__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1948:1: rule__Vars__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Vars__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1952:1: ( ( ',' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1953:1: ( ',' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1953:1: ( ',' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1954:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getCommaKeyword_1_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Vars__Group_1__0__Impl3998); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_1__0__Impl"


    // $ANTLR start "rule__Vars__Group_1__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1967:1: rule__Vars__Group_1__1 : rule__Vars__Group_1__1__Impl ;
    public final void rule__Vars__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1971:1: ( rule__Vars__Group_1__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1972:2: rule__Vars__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__1__Impl_in_rule__Vars__Group_1__14029);
            rule__Vars__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_1__1"


    // $ANTLR start "rule__Vars__Group_1__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1978:1: rule__Vars__Group_1__1__Impl : ( ( rule__Vars__V2Assignment_1_1 ) ) ;
    public final void rule__Vars__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1982:1: ( ( ( rule__Vars__V2Assignment_1_1 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1983:1: ( ( rule__Vars__V2Assignment_1_1 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1983:1: ( ( rule__Vars__V2Assignment_1_1 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:1: ( rule__Vars__V2Assignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getV2Assignment_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:1: ( rule__Vars__V2Assignment_1_1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:2: rule__Vars__V2Assignment_1_1
            {
            pushFollow(FOLLOW_rule__Vars__V2Assignment_1_1_in_rule__Vars__Group_1__1__Impl4056);
            rule__Vars__V2Assignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getV2Assignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__Group_1__1__Impl"


    // $ANTLR start "rule__Exprs__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1999:1: rule__Exprs__Group__0 : rule__Exprs__Group__0__Impl rule__Exprs__Group__1 ;
    public final void rule__Exprs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2003:1: ( rule__Exprs__Group__0__Impl rule__Exprs__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2004:2: rule__Exprs__Group__0__Impl rule__Exprs__Group__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__04090);
            rule__Exprs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__04093);
            rule__Exprs__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group__0"


    // $ANTLR start "rule__Exprs__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2011:1: rule__Exprs__Group__0__Impl : ( ( rule__Exprs__ExpAssignment_0 ) ) ;
    public final void rule__Exprs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2015:1: ( ( ( rule__Exprs__ExpAssignment_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2016:1: ( ( rule__Exprs__ExpAssignment_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2016:1: ( ( rule__Exprs__ExpAssignment_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2017:1: ( rule__Exprs__ExpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpAssignment_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2018:1: ( rule__Exprs__ExpAssignment_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2018:2: rule__Exprs__ExpAssignment_0
            {
            pushFollow(FOLLOW_rule__Exprs__ExpAssignment_0_in_rule__Exprs__Group__0__Impl4120);
            rule__Exprs__ExpAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExpAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group__0__Impl"


    // $ANTLR start "rule__Exprs__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2028:1: rule__Exprs__Group__1 : rule__Exprs__Group__1__Impl ;
    public final void rule__Exprs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2032:1: ( rule__Exprs__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2033:2: rule__Exprs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__14150);
            rule__Exprs__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group__1"


    // $ANTLR start "rule__Exprs__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2039:1: rule__Exprs__Group__1__Impl : ( ( rule__Exprs__Group_1__0 )? ) ;
    public final void rule__Exprs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2043:1: ( ( ( rule__Exprs__Group_1__0 )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2044:1: ( ( rule__Exprs__Group_1__0 )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2044:1: ( ( rule__Exprs__Group_1__0 )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2045:1: ( rule__Exprs__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2046:1: ( rule__Exprs__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2046:2: rule__Exprs__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Exprs__Group_1__0_in_rule__Exprs__Group__1__Impl4177);
                    rule__Exprs__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group__1__Impl"


    // $ANTLR start "rule__Exprs__Group_1__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2060:1: rule__Exprs__Group_1__0 : rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1 ;
    public final void rule__Exprs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2064:1: ( rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2065:2: rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group_1__0__Impl_in_rule__Exprs__Group_1__04212);
            rule__Exprs__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group_1__1_in_rule__Exprs__Group_1__04215);
            rule__Exprs__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_1__0"


    // $ANTLR start "rule__Exprs__Group_1__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2072:1: rule__Exprs__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Exprs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2076:1: ( ( ',' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2077:1: ( ',' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2077:1: ( ',' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2078:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getCommaKeyword_1_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Exprs__Group_1__0__Impl4243); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getCommaKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_1__0__Impl"


    // $ANTLR start "rule__Exprs__Group_1__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2091:1: rule__Exprs__Group_1__1 : rule__Exprs__Group_1__1__Impl ;
    public final void rule__Exprs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2095:1: ( rule__Exprs__Group_1__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2096:2: rule__Exprs__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group_1__1__Impl_in_rule__Exprs__Group_1__14274);
            rule__Exprs__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_1__1"


    // $ANTLR start "rule__Exprs__Group_1__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2102:1: rule__Exprs__Group_1__1__Impl : ( ( rule__Exprs__ExpLAssignment_1_1 ) ) ;
    public final void rule__Exprs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2106:1: ( ( ( rule__Exprs__ExpLAssignment_1_1 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2107:1: ( ( rule__Exprs__ExpLAssignment_1_1 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2107:1: ( ( rule__Exprs__ExpLAssignment_1_1 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2108:1: ( rule__Exprs__ExpLAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpLAssignment_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2109:1: ( rule__Exprs__ExpLAssignment_1_1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2109:2: rule__Exprs__ExpLAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Exprs__ExpLAssignment_1_1_in_rule__Exprs__Group_1__1__Impl4301);
            rule__Exprs__ExpLAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExpLAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__Group_1__1__Impl"


    // $ANTLR start "rule__Command__Group_0__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2123:1: rule__Command__Group_0__0 : rule__Command__Group_0__0__Impl rule__Command__Group_0__1 ;
    public final void rule__Command__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2127:1: ( rule__Command__Group_0__0__Impl rule__Command__Group_0__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2128:2: rule__Command__Group_0__0__Impl rule__Command__Group_0__1
            {
            pushFollow(FOLLOW_rule__Command__Group_0__0__Impl_in_rule__Command__Group_0__04335);
            rule__Command__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_0__1_in_rule__Command__Group_0__04338);
            rule__Command__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_0__0"


    // $ANTLR start "rule__Command__Group_0__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2135:1: rule__Command__Group_0__0__Impl : ( () ) ;
    public final void rule__Command__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2139:1: ( ( () ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2140:1: ( () )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2140:1: ( () )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2141:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCommandAction_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2142:1: ()
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getCommandAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_0__0__Impl"


    // $ANTLR start "rule__Command__Group_0__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2154:1: rule__Command__Group_0__1 : rule__Command__Group_0__1__Impl ;
    public final void rule__Command__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2158:1: ( rule__Command__Group_0__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2159:2: rule__Command__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_0__1__Impl_in_rule__Command__Group_0__14396);
            rule__Command__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_0__1"


    // $ANTLR start "rule__Command__Group_0__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2165:1: rule__Command__Group_0__1__Impl : ( 'nop' ) ;
    public final void rule__Command__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2169:1: ( ( 'nop' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2170:1: ( 'nop' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2170:1: ( 'nop' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2171:1: 'nop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNopKeyword_0_1()); 
            }
            match(input,25,FOLLOW_25_in_rule__Command__Group_0__1__Impl4424); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNopKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_0__1__Impl"


    // $ANTLR start "rule__Command__Group_1__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2188:1: rule__Command__Group_1__0 : rule__Command__Group_1__0__Impl rule__Command__Group_1__1 ;
    public final void rule__Command__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2192:1: ( rule__Command__Group_1__0__Impl rule__Command__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2193:2: rule__Command__Group_1__0__Impl rule__Command__Group_1__1
            {
            pushFollow(FOLLOW_rule__Command__Group_1__0__Impl_in_rule__Command__Group_1__04459);
            rule__Command__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__1_in_rule__Command__Group_1__04462);
            rule__Command__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__0"


    // $ANTLR start "rule__Command__Group_1__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2200:1: rule__Command__Group_1__0__Impl : ( ( rule__Command__VarLAssignment_1_0 ) ) ;
    public final void rule__Command__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2204:1: ( ( ( rule__Command__VarLAssignment_1_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2205:1: ( ( rule__Command__VarLAssignment_1_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2205:1: ( ( rule__Command__VarLAssignment_1_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2206:1: ( rule__Command__VarLAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getVarLAssignment_1_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2207:1: ( rule__Command__VarLAssignment_1_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2207:2: rule__Command__VarLAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Command__VarLAssignment_1_0_in_rule__Command__Group_1__0__Impl4489);
            rule__Command__VarLAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getVarLAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__0__Impl"


    // $ANTLR start "rule__Command__Group_1__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2217:1: rule__Command__Group_1__1 : rule__Command__Group_1__1__Impl rule__Command__Group_1__2 ;
    public final void rule__Command__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2221:1: ( rule__Command__Group_1__1__Impl rule__Command__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2222:2: rule__Command__Group_1__1__Impl rule__Command__Group_1__2
            {
            pushFollow(FOLLOW_rule__Command__Group_1__1__Impl_in_rule__Command__Group_1__14519);
            rule__Command__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__2_in_rule__Command__Group_1__14522);
            rule__Command__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__1"


    // $ANTLR start "rule__Command__Group_1__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2229:1: rule__Command__Group_1__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Command__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2233:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2234:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2234:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2235:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:1: ( RULE_LC )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_LC) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_1__1__Impl4550); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__1__Impl"


    // $ANTLR start "rule__Command__Group_1__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2246:1: rule__Command__Group_1__2 : rule__Command__Group_1__2__Impl rule__Command__Group_1__3 ;
    public final void rule__Command__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2250:1: ( rule__Command__Group_1__2__Impl rule__Command__Group_1__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2251:2: rule__Command__Group_1__2__Impl rule__Command__Group_1__3
            {
            pushFollow(FOLLOW_rule__Command__Group_1__2__Impl_in_rule__Command__Group_1__24581);
            rule__Command__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__3_in_rule__Command__Group_1__24584);
            rule__Command__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__2"


    // $ANTLR start "rule__Command__Group_1__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2258:1: rule__Command__Group_1__2__Impl : ( ':=' ) ;
    public final void rule__Command__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2262:1: ( ( ':=' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2263:1: ( ':=' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2263:1: ( ':=' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2264:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getColonEqualsSignKeyword_1_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__Command__Group_1__2__Impl4612); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getColonEqualsSignKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__2__Impl"


    // $ANTLR start "rule__Command__Group_1__3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2277:1: rule__Command__Group_1__3 : rule__Command__Group_1__3__Impl rule__Command__Group_1__4 ;
    public final void rule__Command__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2281:1: ( rule__Command__Group_1__3__Impl rule__Command__Group_1__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2282:2: rule__Command__Group_1__3__Impl rule__Command__Group_1__4
            {
            pushFollow(FOLLOW_rule__Command__Group_1__3__Impl_in_rule__Command__Group_1__34643);
            rule__Command__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__4_in_rule__Command__Group_1__34646);
            rule__Command__Group_1__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__3"


    // $ANTLR start "rule__Command__Group_1__3__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2289:1: rule__Command__Group_1__3__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Command__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2293:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2294:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2294:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2295:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_3()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:1: ( RULE_LC )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_LC) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_1__3__Impl4674); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__3__Impl"


    // $ANTLR start "rule__Command__Group_1__4"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2306:1: rule__Command__Group_1__4 : rule__Command__Group_1__4__Impl ;
    public final void rule__Command__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2310:1: ( rule__Command__Group_1__4__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2311:2: rule__Command__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_1__4__Impl_in_rule__Command__Group_1__44705);
            rule__Command__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__4"


    // $ANTLR start "rule__Command__Group_1__4__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2317:1: rule__Command__Group_1__4__Impl : ( ( rule__Command__ExpLAssignment_1_4 ) ) ;
    public final void rule__Command__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2321:1: ( ( ( rule__Command__ExpLAssignment_1_4 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2322:1: ( ( rule__Command__ExpLAssignment_1_4 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2322:1: ( ( rule__Command__ExpLAssignment_1_4 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2323:1: ( rule__Command__ExpLAssignment_1_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpLAssignment_1_4()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2324:1: ( rule__Command__ExpLAssignment_1_4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2324:2: rule__Command__ExpLAssignment_1_4
            {
            pushFollow(FOLLOW_rule__Command__ExpLAssignment_1_4_in_rule__Command__Group_1__4__Impl4732);
            rule__Command__ExpLAssignment_1_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExpLAssignment_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_1__4__Impl"


    // $ANTLR start "rule__Command__Group_2__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2344:1: rule__Command__Group_2__0 : rule__Command__Group_2__0__Impl rule__Command__Group_2__1 ;
    public final void rule__Command__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2348:1: ( rule__Command__Group_2__0__Impl rule__Command__Group_2__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2349:2: rule__Command__Group_2__0__Impl rule__Command__Group_2__1
            {
            pushFollow(FOLLOW_rule__Command__Group_2__0__Impl_in_rule__Command__Group_2__04772);
            rule__Command__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__1_in_rule__Command__Group_2__04775);
            rule__Command__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_2__0"


    // $ANTLR start "rule__Command__Group_2__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2356:1: rule__Command__Group_2__0__Impl : ( ( rule__Command__NomAssignment_2_0 ) ) ;
    public final void rule__Command__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2360:1: ( ( ( rule__Command__NomAssignment_2_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2361:1: ( ( rule__Command__NomAssignment_2_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2361:1: ( ( rule__Command__NomAssignment_2_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2362:1: ( rule__Command__NomAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomAssignment_2_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2363:1: ( rule__Command__NomAssignment_2_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2363:2: rule__Command__NomAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Command__NomAssignment_2_0_in_rule__Command__Group_2__0__Impl4802);
            rule__Command__NomAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_2__0__Impl"


    // $ANTLR start "rule__Command__Group_2__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2373:1: rule__Command__Group_2__1 : rule__Command__Group_2__1__Impl rule__Command__Group_2__2 ;
    public final void rule__Command__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2377:1: ( rule__Command__Group_2__1__Impl rule__Command__Group_2__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2378:2: rule__Command__Group_2__1__Impl rule__Command__Group_2__2
            {
            pushFollow(FOLLOW_rule__Command__Group_2__1__Impl_in_rule__Command__Group_2__14832);
            rule__Command__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__2_in_rule__Command__Group_2__14835);
            rule__Command__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_2__1"


    // $ANTLR start "rule__Command__Group_2__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2385:1: rule__Command__Group_2__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2389:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2390:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2390:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2391:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_2__1__Impl4862); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_2__1__Impl"


    // $ANTLR start "rule__Command__Group_2__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2402:1: rule__Command__Group_2__2 : rule__Command__Group_2__2__Impl rule__Command__Group_2__3 ;
    public final void rule__Command__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2406:1: ( rule__Command__Group_2__2__Impl rule__Command__Group_2__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2407:2: rule__Command__Group_2__2__Impl rule__Command__Group_2__3
            {
            pushFollow(FOLLOW_rule__Command__Group_2__2__Impl_in_rule__Command__Group_2__24891);
            rule__Command__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__3_in_rule__Command__Group_2__24894);
            rule__Command__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_2__2"


    // $ANTLR start "rule__Command__Group_2__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2414:1: rule__Command__Group_2__2__Impl : ( ( rule__Command__ExpAssignment_2_2 ) ) ;
    public final void rule__Command__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2418:1: ( ( ( rule__Command__ExpAssignment_2_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2419:1: ( ( rule__Command__ExpAssignment_2_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2419:1: ( ( rule__Command__ExpAssignment_2_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2420:1: ( rule__Command__ExpAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpAssignment_2_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2421:1: ( rule__Command__ExpAssignment_2_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2421:2: rule__Command__ExpAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Command__ExpAssignment_2_2_in_rule__Command__Group_2__2__Impl4921);
            rule__Command__ExpAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExpAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_2__2__Impl"


    // $ANTLR start "rule__Command__Group_2__3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2431:1: rule__Command__Group_2__3 : rule__Command__Group_2__3__Impl rule__Command__Group_2__4 ;
    public final void rule__Command__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2435:1: ( rule__Command__Group_2__3__Impl rule__Command__Group_2__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2436:2: rule__Command__Group_2__3__Impl rule__Command__Group_2__4
            {
            pushFollow(FOLLOW_rule__Command__Group_2__3__Impl_in_rule__Command__Group_2__34951);
            rule__Command__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__4_in_rule__Command__Group_2__34954);
            rule__Command__Group_2__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_2__3"


    // $ANTLR start "rule__Command__Group_2__3__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2443:1: rule__Command__Group_2__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2447:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2448:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2448:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2449:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_2__3__Impl4981); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_2__3__Impl"


    // $ANTLR start "rule__Command__Group_2__4"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2460:1: rule__Command__Group_2__4 : rule__Command__Group_2__4__Impl rule__Command__Group_2__5 ;
    public final void rule__Command__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2464:1: ( rule__Command__Group_2__4__Impl rule__Command__Group_2__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2465:2: rule__Command__Group_2__4__Impl rule__Command__Group_2__5
            {
            pushFollow(FOLLOW_rule__Command__Group_2__4__Impl_in_rule__Command__Group_2__45010);
            rule__Command__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__5_in_rule__Command__Group_2__45013);
            rule__Command__Group_2__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_2__4"


    // $ANTLR start "rule__Command__Group_2__4__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2472:1: rule__Command__Group_2__4__Impl : ( 'do' ) ;
    public final void rule__Command__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2476:1: ( ( 'do' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2477:1: ( 'do' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2477:1: ( 'do' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2478:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getDoKeyword_2_4()); 
            }
            match(input,27,FOLLOW_27_in_rule__Command__Group_2__4__Impl5041); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getDoKeyword_2_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_2__4__Impl"


    // $ANTLR start "rule__Command__Group_2__5"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:1: rule__Command__Group_2__5 : rule__Command__Group_2__5__Impl rule__Command__Group_2__6 ;
    public final void rule__Command__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:1: ( rule__Command__Group_2__5__Impl rule__Command__Group_2__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2496:2: rule__Command__Group_2__5__Impl rule__Command__Group_2__6
            {
            pushFollow(FOLLOW_rule__Command__Group_2__5__Impl_in_rule__Command__Group_2__55072);
            rule__Command__Group_2__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__6_in_rule__Command__Group_2__55075);
            rule__Command__Group_2__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_2__5"


    // $ANTLR start "rule__Command__Group_2__5__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:1: rule__Command__Group_2__5__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2507:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2508:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2508:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2509:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_5()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_2__5__Impl5102); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_2__5__Impl"


    // $ANTLR start "rule__Command__Group_2__6"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2520:1: rule__Command__Group_2__6 : rule__Command__Group_2__6__Impl rule__Command__Group_2__7 ;
    public final void rule__Command__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2524:1: ( rule__Command__Group_2__6__Impl rule__Command__Group_2__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2525:2: rule__Command__Group_2__6__Impl rule__Command__Group_2__7
            {
            pushFollow(FOLLOW_rule__Command__Group_2__6__Impl_in_rule__Command__Group_2__65131);
            rule__Command__Group_2__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__7_in_rule__Command__Group_2__65134);
            rule__Command__Group_2__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_2__6"


    // $ANTLR start "rule__Command__Group_2__6__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2532:1: rule__Command__Group_2__6__Impl : ( ( rule__Command__C1Assignment_2_6 ) ) ;
    public final void rule__Command__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2536:1: ( ( ( rule__Command__C1Assignment_2_6 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2537:1: ( ( rule__Command__C1Assignment_2_6 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2537:1: ( ( rule__Command__C1Assignment_2_6 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2538:1: ( rule__Command__C1Assignment_2_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1Assignment_2_6()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2539:1: ( rule__Command__C1Assignment_2_6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2539:2: rule__Command__C1Assignment_2_6
            {
            pushFollow(FOLLOW_rule__Command__C1Assignment_2_6_in_rule__Command__Group_2__6__Impl5161);
            rule__Command__C1Assignment_2_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getC1Assignment_2_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_2__6__Impl"


    // $ANTLR start "rule__Command__Group_2__7"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2549:1: rule__Command__Group_2__7 : rule__Command__Group_2__7__Impl rule__Command__Group_2__8 ;
    public final void rule__Command__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2553:1: ( rule__Command__Group_2__7__Impl rule__Command__Group_2__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2554:2: rule__Command__Group_2__7__Impl rule__Command__Group_2__8
            {
            pushFollow(FOLLOW_rule__Command__Group_2__7__Impl_in_rule__Command__Group_2__75191);
            rule__Command__Group_2__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__8_in_rule__Command__Group_2__75194);
            rule__Command__Group_2__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_2__7"


    // $ANTLR start "rule__Command__Group_2__7__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2561:1: rule__Command__Group_2__7__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2565:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2566:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2566:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2567:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_7()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_2__7__Impl5221); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_2__7__Impl"


    // $ANTLR start "rule__Command__Group_2__8"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2578:1: rule__Command__Group_2__8 : rule__Command__Group_2__8__Impl ;
    public final void rule__Command__Group_2__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2582:1: ( rule__Command__Group_2__8__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2583:2: rule__Command__Group_2__8__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_2__8__Impl_in_rule__Command__Group_2__85250);
            rule__Command__Group_2__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_2__8"


    // $ANTLR start "rule__Command__Group_2__8__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2589:1: rule__Command__Group_2__8__Impl : ( 'od' ) ;
    public final void rule__Command__Group_2__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2593:1: ( ( 'od' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2594:1: ( 'od' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2594:1: ( 'od' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2595:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getOdKeyword_2_8()); 
            }
            match(input,28,FOLLOW_28_in_rule__Command__Group_2__8__Impl5278); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getOdKeyword_2_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_2__8__Impl"


    // $ANTLR start "rule__Command__Group_3__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2626:1: rule__Command__Group_3__0 : rule__Command__Group_3__0__Impl rule__Command__Group_3__1 ;
    public final void rule__Command__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2630:1: ( rule__Command__Group_3__0__Impl rule__Command__Group_3__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2631:2: rule__Command__Group_3__0__Impl rule__Command__Group_3__1
            {
            pushFollow(FOLLOW_rule__Command__Group_3__0__Impl_in_rule__Command__Group_3__05327);
            rule__Command__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__1_in_rule__Command__Group_3__05330);
            rule__Command__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_3__0"


    // $ANTLR start "rule__Command__Group_3__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2638:1: rule__Command__Group_3__0__Impl : ( ( rule__Command__NomAssignment_3_0 ) ) ;
    public final void rule__Command__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2642:1: ( ( ( rule__Command__NomAssignment_3_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2643:1: ( ( rule__Command__NomAssignment_3_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2643:1: ( ( rule__Command__NomAssignment_3_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2644:1: ( rule__Command__NomAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomAssignment_3_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2645:1: ( rule__Command__NomAssignment_3_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2645:2: rule__Command__NomAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Command__NomAssignment_3_0_in_rule__Command__Group_3__0__Impl5357);
            rule__Command__NomAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_3__0__Impl"


    // $ANTLR start "rule__Command__Group_3__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2655:1: rule__Command__Group_3__1 : rule__Command__Group_3__1__Impl rule__Command__Group_3__2 ;
    public final void rule__Command__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2659:1: ( rule__Command__Group_3__1__Impl rule__Command__Group_3__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2660:2: rule__Command__Group_3__1__Impl rule__Command__Group_3__2
            {
            pushFollow(FOLLOW_rule__Command__Group_3__1__Impl_in_rule__Command__Group_3__15387);
            rule__Command__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__2_in_rule__Command__Group_3__15390);
            rule__Command__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_3__1"


    // $ANTLR start "rule__Command__Group_3__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2667:1: rule__Command__Group_3__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2671:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2672:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2672:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2673:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_3__1__Impl5417); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_3__1__Impl"


    // $ANTLR start "rule__Command__Group_3__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2684:1: rule__Command__Group_3__2 : rule__Command__Group_3__2__Impl rule__Command__Group_3__3 ;
    public final void rule__Command__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2688:1: ( rule__Command__Group_3__2__Impl rule__Command__Group_3__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2689:2: rule__Command__Group_3__2__Impl rule__Command__Group_3__3
            {
            pushFollow(FOLLOW_rule__Command__Group_3__2__Impl_in_rule__Command__Group_3__25446);
            rule__Command__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__3_in_rule__Command__Group_3__25449);
            rule__Command__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_3__2"


    // $ANTLR start "rule__Command__Group_3__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2696:1: rule__Command__Group_3__2__Impl : ( ( rule__Command__ExpAssignment_3_2 ) ) ;
    public final void rule__Command__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2700:1: ( ( ( rule__Command__ExpAssignment_3_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2701:1: ( ( rule__Command__ExpAssignment_3_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2701:1: ( ( rule__Command__ExpAssignment_3_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2702:1: ( rule__Command__ExpAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpAssignment_3_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2703:1: ( rule__Command__ExpAssignment_3_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2703:2: rule__Command__ExpAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Command__ExpAssignment_3_2_in_rule__Command__Group_3__2__Impl5476);
            rule__Command__ExpAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExpAssignment_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_3__2__Impl"


    // $ANTLR start "rule__Command__Group_3__3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2713:1: rule__Command__Group_3__3 : rule__Command__Group_3__3__Impl rule__Command__Group_3__4 ;
    public final void rule__Command__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2717:1: ( rule__Command__Group_3__3__Impl rule__Command__Group_3__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2718:2: rule__Command__Group_3__3__Impl rule__Command__Group_3__4
            {
            pushFollow(FOLLOW_rule__Command__Group_3__3__Impl_in_rule__Command__Group_3__35506);
            rule__Command__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__4_in_rule__Command__Group_3__35509);
            rule__Command__Group_3__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_3__3"


    // $ANTLR start "rule__Command__Group_3__3__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2725:1: rule__Command__Group_3__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2729:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2730:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2730:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2731:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_3__3__Impl5536); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_3__3__Impl"


    // $ANTLR start "rule__Command__Group_3__4"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2742:1: rule__Command__Group_3__4 : rule__Command__Group_3__4__Impl rule__Command__Group_3__5 ;
    public final void rule__Command__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2746:1: ( rule__Command__Group_3__4__Impl rule__Command__Group_3__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2747:2: rule__Command__Group_3__4__Impl rule__Command__Group_3__5
            {
            pushFollow(FOLLOW_rule__Command__Group_3__4__Impl_in_rule__Command__Group_3__45565);
            rule__Command__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__5_in_rule__Command__Group_3__45568);
            rule__Command__Group_3__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_3__4"


    // $ANTLR start "rule__Command__Group_3__4__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2754:1: rule__Command__Group_3__4__Impl : ( 'do' ) ;
    public final void rule__Command__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2758:1: ( ( 'do' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2759:1: ( 'do' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2759:1: ( 'do' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2760:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getDoKeyword_3_4()); 
            }
            match(input,27,FOLLOW_27_in_rule__Command__Group_3__4__Impl5596); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getDoKeyword_3_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_3__4__Impl"


    // $ANTLR start "rule__Command__Group_3__5"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2773:1: rule__Command__Group_3__5 : rule__Command__Group_3__5__Impl rule__Command__Group_3__6 ;
    public final void rule__Command__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2777:1: ( rule__Command__Group_3__5__Impl rule__Command__Group_3__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2778:2: rule__Command__Group_3__5__Impl rule__Command__Group_3__6
            {
            pushFollow(FOLLOW_rule__Command__Group_3__5__Impl_in_rule__Command__Group_3__55627);
            rule__Command__Group_3__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__6_in_rule__Command__Group_3__55630);
            rule__Command__Group_3__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_3__5"


    // $ANTLR start "rule__Command__Group_3__5__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2785:1: rule__Command__Group_3__5__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2789:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2790:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2790:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2791:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_5()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_3__5__Impl5657); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_3__5__Impl"


    // $ANTLR start "rule__Command__Group_3__6"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2802:1: rule__Command__Group_3__6 : rule__Command__Group_3__6__Impl rule__Command__Group_3__7 ;
    public final void rule__Command__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2806:1: ( rule__Command__Group_3__6__Impl rule__Command__Group_3__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2807:2: rule__Command__Group_3__6__Impl rule__Command__Group_3__7
            {
            pushFollow(FOLLOW_rule__Command__Group_3__6__Impl_in_rule__Command__Group_3__65686);
            rule__Command__Group_3__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__7_in_rule__Command__Group_3__65689);
            rule__Command__Group_3__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_3__6"


    // $ANTLR start "rule__Command__Group_3__6__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2814:1: rule__Command__Group_3__6__Impl : ( ( rule__Command__C1Assignment_3_6 ) ) ;
    public final void rule__Command__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2818:1: ( ( ( rule__Command__C1Assignment_3_6 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:1: ( ( rule__Command__C1Assignment_3_6 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:1: ( ( rule__Command__C1Assignment_3_6 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2820:1: ( rule__Command__C1Assignment_3_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1Assignment_3_6()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2821:1: ( rule__Command__C1Assignment_3_6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2821:2: rule__Command__C1Assignment_3_6
            {
            pushFollow(FOLLOW_rule__Command__C1Assignment_3_6_in_rule__Command__Group_3__6__Impl5716);
            rule__Command__C1Assignment_3_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getC1Assignment_3_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_3__6__Impl"


    // $ANTLR start "rule__Command__Group_3__7"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2831:1: rule__Command__Group_3__7 : rule__Command__Group_3__7__Impl rule__Command__Group_3__8 ;
    public final void rule__Command__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2835:1: ( rule__Command__Group_3__7__Impl rule__Command__Group_3__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2836:2: rule__Command__Group_3__7__Impl rule__Command__Group_3__8
            {
            pushFollow(FOLLOW_rule__Command__Group_3__7__Impl_in_rule__Command__Group_3__75746);
            rule__Command__Group_3__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__8_in_rule__Command__Group_3__75749);
            rule__Command__Group_3__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_3__7"


    // $ANTLR start "rule__Command__Group_3__7__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2843:1: rule__Command__Group_3__7__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2847:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2848:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2848:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2849:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_7()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_3__7__Impl5776); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_3__7__Impl"


    // $ANTLR start "rule__Command__Group_3__8"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2860:1: rule__Command__Group_3__8 : rule__Command__Group_3__8__Impl ;
    public final void rule__Command__Group_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2864:1: ( rule__Command__Group_3__8__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2865:2: rule__Command__Group_3__8__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_3__8__Impl_in_rule__Command__Group_3__85805);
            rule__Command__Group_3__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_3__8"


    // $ANTLR start "rule__Command__Group_3__8__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2871:1: rule__Command__Group_3__8__Impl : ( 'od' ) ;
    public final void rule__Command__Group_3__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2875:1: ( ( 'od' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2876:1: ( 'od' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2876:1: ( 'od' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2877:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getOdKeyword_3_8()); 
            }
            match(input,28,FOLLOW_28_in_rule__Command__Group_3__8__Impl5833); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getOdKeyword_3_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_3__8__Impl"


    // $ANTLR start "rule__Command__Group_4__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2908:1: rule__Command__Group_4__0 : rule__Command__Group_4__0__Impl rule__Command__Group_4__1 ;
    public final void rule__Command__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2912:1: ( rule__Command__Group_4__0__Impl rule__Command__Group_4__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2913:2: rule__Command__Group_4__0__Impl rule__Command__Group_4__1
            {
            pushFollow(FOLLOW_rule__Command__Group_4__0__Impl_in_rule__Command__Group_4__05882);
            rule__Command__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__1_in_rule__Command__Group_4__05885);
            rule__Command__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__0"


    // $ANTLR start "rule__Command__Group_4__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2920:1: rule__Command__Group_4__0__Impl : ( ( rule__Command__NomAssignment_4_0 ) ) ;
    public final void rule__Command__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2924:1: ( ( ( rule__Command__NomAssignment_4_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2925:1: ( ( rule__Command__NomAssignment_4_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2925:1: ( ( rule__Command__NomAssignment_4_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2926:1: ( rule__Command__NomAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomAssignment_4_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:1: ( rule__Command__NomAssignment_4_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:2: rule__Command__NomAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Command__NomAssignment_4_0_in_rule__Command__Group_4__0__Impl5912);
            rule__Command__NomAssignment_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomAssignment_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__0__Impl"


    // $ANTLR start "rule__Command__Group_4__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2937:1: rule__Command__Group_4__1 : rule__Command__Group_4__1__Impl rule__Command__Group_4__2 ;
    public final void rule__Command__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2941:1: ( rule__Command__Group_4__1__Impl rule__Command__Group_4__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2942:2: rule__Command__Group_4__1__Impl rule__Command__Group_4__2
            {
            pushFollow(FOLLOW_rule__Command__Group_4__1__Impl_in_rule__Command__Group_4__15942);
            rule__Command__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__2_in_rule__Command__Group_4__15945);
            rule__Command__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__1"


    // $ANTLR start "rule__Command__Group_4__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2949:1: rule__Command__Group_4__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2953:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2954:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2954:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2955:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__1__Impl5972); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__1__Impl"


    // $ANTLR start "rule__Command__Group_4__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2966:1: rule__Command__Group_4__2 : rule__Command__Group_4__2__Impl rule__Command__Group_4__3 ;
    public final void rule__Command__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2970:1: ( rule__Command__Group_4__2__Impl rule__Command__Group_4__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2971:2: rule__Command__Group_4__2__Impl rule__Command__Group_4__3
            {
            pushFollow(FOLLOW_rule__Command__Group_4__2__Impl_in_rule__Command__Group_4__26001);
            rule__Command__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__3_in_rule__Command__Group_4__26004);
            rule__Command__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__2"


    // $ANTLR start "rule__Command__Group_4__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2978:1: rule__Command__Group_4__2__Impl : ( ( rule__Command__Exp1Assignment_4_2 ) ) ;
    public final void rule__Command__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2982:1: ( ( ( rule__Command__Exp1Assignment_4_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2983:1: ( ( rule__Command__Exp1Assignment_4_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2983:1: ( ( rule__Command__Exp1Assignment_4_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2984:1: ( rule__Command__Exp1Assignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExp1Assignment_4_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2985:1: ( rule__Command__Exp1Assignment_4_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2985:2: rule__Command__Exp1Assignment_4_2
            {
            pushFollow(FOLLOW_rule__Command__Exp1Assignment_4_2_in_rule__Command__Group_4__2__Impl6031);
            rule__Command__Exp1Assignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExp1Assignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__2__Impl"


    // $ANTLR start "rule__Command__Group_4__3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2995:1: rule__Command__Group_4__3 : rule__Command__Group_4__3__Impl rule__Command__Group_4__4 ;
    public final void rule__Command__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2999:1: ( rule__Command__Group_4__3__Impl rule__Command__Group_4__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3000:2: rule__Command__Group_4__3__Impl rule__Command__Group_4__4
            {
            pushFollow(FOLLOW_rule__Command__Group_4__3__Impl_in_rule__Command__Group_4__36061);
            rule__Command__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__4_in_rule__Command__Group_4__36064);
            rule__Command__Group_4__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__3"


    // $ANTLR start "rule__Command__Group_4__3__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3007:1: rule__Command__Group_4__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3011:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3012:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3012:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3013:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__3__Impl6091); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__3__Impl"


    // $ANTLR start "rule__Command__Group_4__4"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3024:1: rule__Command__Group_4__4 : rule__Command__Group_4__4__Impl rule__Command__Group_4__5 ;
    public final void rule__Command__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3028:1: ( rule__Command__Group_4__4__Impl rule__Command__Group_4__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3029:2: rule__Command__Group_4__4__Impl rule__Command__Group_4__5
            {
            pushFollow(FOLLOW_rule__Command__Group_4__4__Impl_in_rule__Command__Group_4__46120);
            rule__Command__Group_4__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__5_in_rule__Command__Group_4__46123);
            rule__Command__Group_4__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__4"


    // $ANTLR start "rule__Command__Group_4__4__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3036:1: rule__Command__Group_4__4__Impl : ( 'in' ) ;
    public final void rule__Command__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3040:1: ( ( 'in' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3041:1: ( 'in' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3041:1: ( 'in' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3042:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getInKeyword_4_4()); 
            }
            match(input,29,FOLLOW_29_in_rule__Command__Group_4__4__Impl6151); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getInKeyword_4_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__4__Impl"


    // $ANTLR start "rule__Command__Group_4__5"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3055:1: rule__Command__Group_4__5 : rule__Command__Group_4__5__Impl rule__Command__Group_4__6 ;
    public final void rule__Command__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3059:1: ( rule__Command__Group_4__5__Impl rule__Command__Group_4__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3060:2: rule__Command__Group_4__5__Impl rule__Command__Group_4__6
            {
            pushFollow(FOLLOW_rule__Command__Group_4__5__Impl_in_rule__Command__Group_4__56182);
            rule__Command__Group_4__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__6_in_rule__Command__Group_4__56185);
            rule__Command__Group_4__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__5"


    // $ANTLR start "rule__Command__Group_4__5__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3067:1: rule__Command__Group_4__5__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3071:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3072:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3072:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3073:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_5()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__5__Impl6212); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__5__Impl"


    // $ANTLR start "rule__Command__Group_4__6"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3084:1: rule__Command__Group_4__6 : rule__Command__Group_4__6__Impl rule__Command__Group_4__7 ;
    public final void rule__Command__Group_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3088:1: ( rule__Command__Group_4__6__Impl rule__Command__Group_4__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3089:2: rule__Command__Group_4__6__Impl rule__Command__Group_4__7
            {
            pushFollow(FOLLOW_rule__Command__Group_4__6__Impl_in_rule__Command__Group_4__66241);
            rule__Command__Group_4__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__7_in_rule__Command__Group_4__66244);
            rule__Command__Group_4__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__6"


    // $ANTLR start "rule__Command__Group_4__6__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3096:1: rule__Command__Group_4__6__Impl : ( ( rule__Command__Exp2Assignment_4_6 ) ) ;
    public final void rule__Command__Group_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3100:1: ( ( ( rule__Command__Exp2Assignment_4_6 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3101:1: ( ( rule__Command__Exp2Assignment_4_6 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3101:1: ( ( rule__Command__Exp2Assignment_4_6 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3102:1: ( rule__Command__Exp2Assignment_4_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExp2Assignment_4_6()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3103:1: ( rule__Command__Exp2Assignment_4_6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3103:2: rule__Command__Exp2Assignment_4_6
            {
            pushFollow(FOLLOW_rule__Command__Exp2Assignment_4_6_in_rule__Command__Group_4__6__Impl6271);
            rule__Command__Exp2Assignment_4_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExp2Assignment_4_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__6__Impl"


    // $ANTLR start "rule__Command__Group_4__7"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3113:1: rule__Command__Group_4__7 : rule__Command__Group_4__7__Impl rule__Command__Group_4__8 ;
    public final void rule__Command__Group_4__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3117:1: ( rule__Command__Group_4__7__Impl rule__Command__Group_4__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3118:2: rule__Command__Group_4__7__Impl rule__Command__Group_4__8
            {
            pushFollow(FOLLOW_rule__Command__Group_4__7__Impl_in_rule__Command__Group_4__76301);
            rule__Command__Group_4__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__8_in_rule__Command__Group_4__76304);
            rule__Command__Group_4__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__7"


    // $ANTLR start "rule__Command__Group_4__7__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3125:1: rule__Command__Group_4__7__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3129:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3130:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3130:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3131:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_7()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__7__Impl6331); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__7__Impl"


    // $ANTLR start "rule__Command__Group_4__8"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3142:1: rule__Command__Group_4__8 : rule__Command__Group_4__8__Impl rule__Command__Group_4__9 ;
    public final void rule__Command__Group_4__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3146:1: ( rule__Command__Group_4__8__Impl rule__Command__Group_4__9 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3147:2: rule__Command__Group_4__8__Impl rule__Command__Group_4__9
            {
            pushFollow(FOLLOW_rule__Command__Group_4__8__Impl_in_rule__Command__Group_4__86360);
            rule__Command__Group_4__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__9_in_rule__Command__Group_4__86363);
            rule__Command__Group_4__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__8"


    // $ANTLR start "rule__Command__Group_4__8__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3154:1: rule__Command__Group_4__8__Impl : ( 'do' ) ;
    public final void rule__Command__Group_4__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3158:1: ( ( 'do' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3159:1: ( 'do' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3159:1: ( 'do' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3160:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getDoKeyword_4_8()); 
            }
            match(input,27,FOLLOW_27_in_rule__Command__Group_4__8__Impl6391); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getDoKeyword_4_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__8__Impl"


    // $ANTLR start "rule__Command__Group_4__9"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3173:1: rule__Command__Group_4__9 : rule__Command__Group_4__9__Impl rule__Command__Group_4__10 ;
    public final void rule__Command__Group_4__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3177:1: ( rule__Command__Group_4__9__Impl rule__Command__Group_4__10 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3178:2: rule__Command__Group_4__9__Impl rule__Command__Group_4__10
            {
            pushFollow(FOLLOW_rule__Command__Group_4__9__Impl_in_rule__Command__Group_4__96422);
            rule__Command__Group_4__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__10_in_rule__Command__Group_4__96425);
            rule__Command__Group_4__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__9"


    // $ANTLR start "rule__Command__Group_4__9__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3185:1: rule__Command__Group_4__9__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3189:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3190:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3190:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3191:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_9()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__9__Impl6452); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__9__Impl"


    // $ANTLR start "rule__Command__Group_4__10"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3202:1: rule__Command__Group_4__10 : rule__Command__Group_4__10__Impl rule__Command__Group_4__11 ;
    public final void rule__Command__Group_4__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3206:1: ( rule__Command__Group_4__10__Impl rule__Command__Group_4__11 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3207:2: rule__Command__Group_4__10__Impl rule__Command__Group_4__11
            {
            pushFollow(FOLLOW_rule__Command__Group_4__10__Impl_in_rule__Command__Group_4__106481);
            rule__Command__Group_4__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__11_in_rule__Command__Group_4__106484);
            rule__Command__Group_4__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__10"


    // $ANTLR start "rule__Command__Group_4__10__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3214:1: rule__Command__Group_4__10__Impl : ( ( rule__Command__C1Assignment_4_10 ) ) ;
    public final void rule__Command__Group_4__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3218:1: ( ( ( rule__Command__C1Assignment_4_10 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3219:1: ( ( rule__Command__C1Assignment_4_10 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3219:1: ( ( rule__Command__C1Assignment_4_10 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3220:1: ( rule__Command__C1Assignment_4_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1Assignment_4_10()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:1: ( rule__Command__C1Assignment_4_10 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:2: rule__Command__C1Assignment_4_10
            {
            pushFollow(FOLLOW_rule__Command__C1Assignment_4_10_in_rule__Command__Group_4__10__Impl6511);
            rule__Command__C1Assignment_4_10();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getC1Assignment_4_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__10__Impl"


    // $ANTLR start "rule__Command__Group_4__11"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3231:1: rule__Command__Group_4__11 : rule__Command__Group_4__11__Impl rule__Command__Group_4__12 ;
    public final void rule__Command__Group_4__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3235:1: ( rule__Command__Group_4__11__Impl rule__Command__Group_4__12 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3236:2: rule__Command__Group_4__11__Impl rule__Command__Group_4__12
            {
            pushFollow(FOLLOW_rule__Command__Group_4__11__Impl_in_rule__Command__Group_4__116541);
            rule__Command__Group_4__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__12_in_rule__Command__Group_4__116544);
            rule__Command__Group_4__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__11"


    // $ANTLR start "rule__Command__Group_4__11__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3243:1: rule__Command__Group_4__11__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3247:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3248:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3248:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3249:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_11()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__11__Impl6571); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__11__Impl"


    // $ANTLR start "rule__Command__Group_4__12"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3260:1: rule__Command__Group_4__12 : rule__Command__Group_4__12__Impl ;
    public final void rule__Command__Group_4__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3264:1: ( rule__Command__Group_4__12__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3265:2: rule__Command__Group_4__12__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_4__12__Impl_in_rule__Command__Group_4__126600);
            rule__Command__Group_4__12__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__12"


    // $ANTLR start "rule__Command__Group_4__12__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3271:1: rule__Command__Group_4__12__Impl : ( 'od' ) ;
    public final void rule__Command__Group_4__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3275:1: ( ( 'od' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3276:1: ( 'od' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3276:1: ( 'od' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3277:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getOdKeyword_4_12()); 
            }
            match(input,28,FOLLOW_28_in_rule__Command__Group_4__12__Impl6628); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getOdKeyword_4_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_4__12__Impl"


    // $ANTLR start "rule__Command__Group_5__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3316:1: rule__Command__Group_5__0 : rule__Command__Group_5__0__Impl rule__Command__Group_5__1 ;
    public final void rule__Command__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3320:1: ( rule__Command__Group_5__0__Impl rule__Command__Group_5__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3321:2: rule__Command__Group_5__0__Impl rule__Command__Group_5__1
            {
            pushFollow(FOLLOW_rule__Command__Group_5__0__Impl_in_rule__Command__Group_5__06685);
            rule__Command__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__1_in_rule__Command__Group_5__06688);
            rule__Command__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5__0"


    // $ANTLR start "rule__Command__Group_5__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3328:1: rule__Command__Group_5__0__Impl : ( ( rule__Command__NomAssignment_5_0 ) ) ;
    public final void rule__Command__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3332:1: ( ( ( rule__Command__NomAssignment_5_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3333:1: ( ( rule__Command__NomAssignment_5_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3333:1: ( ( rule__Command__NomAssignment_5_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3334:1: ( rule__Command__NomAssignment_5_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomAssignment_5_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3335:1: ( rule__Command__NomAssignment_5_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3335:2: rule__Command__NomAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Command__NomAssignment_5_0_in_rule__Command__Group_5__0__Impl6715);
            rule__Command__NomAssignment_5_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomAssignment_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5__0__Impl"


    // $ANTLR start "rule__Command__Group_5__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3345:1: rule__Command__Group_5__1 : rule__Command__Group_5__1__Impl rule__Command__Group_5__2 ;
    public final void rule__Command__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3349:1: ( rule__Command__Group_5__1__Impl rule__Command__Group_5__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3350:2: rule__Command__Group_5__1__Impl rule__Command__Group_5__2
            {
            pushFollow(FOLLOW_rule__Command__Group_5__1__Impl_in_rule__Command__Group_5__16745);
            rule__Command__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__2_in_rule__Command__Group_5__16748);
            rule__Command__Group_5__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5__1"


    // $ANTLR start "rule__Command__Group_5__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3357:1: rule__Command__Group_5__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3361:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3362:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3362:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3363:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5__1__Impl6775); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5__1__Impl"


    // $ANTLR start "rule__Command__Group_5__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3374:1: rule__Command__Group_5__2 : rule__Command__Group_5__2__Impl rule__Command__Group_5__3 ;
    public final void rule__Command__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3378:1: ( rule__Command__Group_5__2__Impl rule__Command__Group_5__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3379:2: rule__Command__Group_5__2__Impl rule__Command__Group_5__3
            {
            pushFollow(FOLLOW_rule__Command__Group_5__2__Impl_in_rule__Command__Group_5__26804);
            rule__Command__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__3_in_rule__Command__Group_5__26807);
            rule__Command__Group_5__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5__2"


    // $ANTLR start "rule__Command__Group_5__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3386:1: rule__Command__Group_5__2__Impl : ( ( rule__Command__ExpAssignment_5_2 ) ) ;
    public final void rule__Command__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3390:1: ( ( ( rule__Command__ExpAssignment_5_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3391:1: ( ( rule__Command__ExpAssignment_5_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3391:1: ( ( rule__Command__ExpAssignment_5_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3392:1: ( rule__Command__ExpAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpAssignment_5_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3393:1: ( rule__Command__ExpAssignment_5_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3393:2: rule__Command__ExpAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Command__ExpAssignment_5_2_in_rule__Command__Group_5__2__Impl6834);
            rule__Command__ExpAssignment_5_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExpAssignment_5_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5__2__Impl"


    // $ANTLR start "rule__Command__Group_5__3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3403:1: rule__Command__Group_5__3 : rule__Command__Group_5__3__Impl rule__Command__Group_5__4 ;
    public final void rule__Command__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3407:1: ( rule__Command__Group_5__3__Impl rule__Command__Group_5__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3408:2: rule__Command__Group_5__3__Impl rule__Command__Group_5__4
            {
            pushFollow(FOLLOW_rule__Command__Group_5__3__Impl_in_rule__Command__Group_5__36864);
            rule__Command__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__4_in_rule__Command__Group_5__36867);
            rule__Command__Group_5__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5__3"


    // $ANTLR start "rule__Command__Group_5__3__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3415:1: rule__Command__Group_5__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3419:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3420:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3420:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3421:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5__3__Impl6894); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5__3__Impl"


    // $ANTLR start "rule__Command__Group_5__4"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3432:1: rule__Command__Group_5__4 : rule__Command__Group_5__4__Impl rule__Command__Group_5__5 ;
    public final void rule__Command__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3436:1: ( rule__Command__Group_5__4__Impl rule__Command__Group_5__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3437:2: rule__Command__Group_5__4__Impl rule__Command__Group_5__5
            {
            pushFollow(FOLLOW_rule__Command__Group_5__4__Impl_in_rule__Command__Group_5__46923);
            rule__Command__Group_5__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__5_in_rule__Command__Group_5__46926);
            rule__Command__Group_5__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5__4"


    // $ANTLR start "rule__Command__Group_5__4__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3444:1: rule__Command__Group_5__4__Impl : ( 'then' ) ;
    public final void rule__Command__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3448:1: ( ( 'then' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3449:1: ( 'then' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3449:1: ( 'then' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3450:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getThenKeyword_5_4()); 
            }
            match(input,30,FOLLOW_30_in_rule__Command__Group_5__4__Impl6954); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getThenKeyword_5_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5__4__Impl"


    // $ANTLR start "rule__Command__Group_5__5"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3463:1: rule__Command__Group_5__5 : rule__Command__Group_5__5__Impl rule__Command__Group_5__6 ;
    public final void rule__Command__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3467:1: ( rule__Command__Group_5__5__Impl rule__Command__Group_5__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3468:2: rule__Command__Group_5__5__Impl rule__Command__Group_5__6
            {
            pushFollow(FOLLOW_rule__Command__Group_5__5__Impl_in_rule__Command__Group_5__56985);
            rule__Command__Group_5__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__6_in_rule__Command__Group_5__56988);
            rule__Command__Group_5__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5__5"


    // $ANTLR start "rule__Command__Group_5__5__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3475:1: rule__Command__Group_5__5__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3479:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3480:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3480:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3481:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_5()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5__5__Impl7015); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5__5__Impl"


    // $ANTLR start "rule__Command__Group_5__6"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3492:1: rule__Command__Group_5__6 : rule__Command__Group_5__6__Impl rule__Command__Group_5__7 ;
    public final void rule__Command__Group_5__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3496:1: ( rule__Command__Group_5__6__Impl rule__Command__Group_5__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3497:2: rule__Command__Group_5__6__Impl rule__Command__Group_5__7
            {
            pushFollow(FOLLOW_rule__Command__Group_5__6__Impl_in_rule__Command__Group_5__67044);
            rule__Command__Group_5__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__7_in_rule__Command__Group_5__67047);
            rule__Command__Group_5__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5__6"


    // $ANTLR start "rule__Command__Group_5__6__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3504:1: rule__Command__Group_5__6__Impl : ( ( rule__Command__C1Assignment_5_6 ) ) ;
    public final void rule__Command__Group_5__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3508:1: ( ( ( rule__Command__C1Assignment_5_6 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3509:1: ( ( rule__Command__C1Assignment_5_6 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3509:1: ( ( rule__Command__C1Assignment_5_6 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3510:1: ( rule__Command__C1Assignment_5_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1Assignment_5_6()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3511:1: ( rule__Command__C1Assignment_5_6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3511:2: rule__Command__C1Assignment_5_6
            {
            pushFollow(FOLLOW_rule__Command__C1Assignment_5_6_in_rule__Command__Group_5__6__Impl7074);
            rule__Command__C1Assignment_5_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getC1Assignment_5_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5__6__Impl"


    // $ANTLR start "rule__Command__Group_5__7"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3521:1: rule__Command__Group_5__7 : rule__Command__Group_5__7__Impl rule__Command__Group_5__8 ;
    public final void rule__Command__Group_5__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3525:1: ( rule__Command__Group_5__7__Impl rule__Command__Group_5__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3526:2: rule__Command__Group_5__7__Impl rule__Command__Group_5__8
            {
            pushFollow(FOLLOW_rule__Command__Group_5__7__Impl_in_rule__Command__Group_5__77104);
            rule__Command__Group_5__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__8_in_rule__Command__Group_5__77107);
            rule__Command__Group_5__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5__7"


    // $ANTLR start "rule__Command__Group_5__7__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3533:1: rule__Command__Group_5__7__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3537:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3538:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3538:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3539:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_7()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5__7__Impl7134); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5__7__Impl"


    // $ANTLR start "rule__Command__Group_5__8"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3550:1: rule__Command__Group_5__8 : rule__Command__Group_5__8__Impl rule__Command__Group_5__9 ;
    public final void rule__Command__Group_5__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3554:1: ( rule__Command__Group_5__8__Impl rule__Command__Group_5__9 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3555:2: rule__Command__Group_5__8__Impl rule__Command__Group_5__9
            {
            pushFollow(FOLLOW_rule__Command__Group_5__8__Impl_in_rule__Command__Group_5__87163);
            rule__Command__Group_5__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__9_in_rule__Command__Group_5__87166);
            rule__Command__Group_5__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5__8"


    // $ANTLR start "rule__Command__Group_5__8__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3562:1: rule__Command__Group_5__8__Impl : ( ( rule__Command__Group_5_8__0 )? ) ;
    public final void rule__Command__Group_5__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3566:1: ( ( ( rule__Command__Group_5_8__0 )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3567:1: ( ( rule__Command__Group_5_8__0 )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3567:1: ( ( rule__Command__Group_5_8__0 )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3568:1: ( rule__Command__Group_5_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getGroup_5_8()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3569:1: ( rule__Command__Group_5_8__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==32) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3569:2: rule__Command__Group_5_8__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_5_8__0_in_rule__Command__Group_5__8__Impl7193);
                    rule__Command__Group_5_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getGroup_5_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5__8__Impl"


    // $ANTLR start "rule__Command__Group_5__9"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3579:1: rule__Command__Group_5__9 : rule__Command__Group_5__9__Impl ;
    public final void rule__Command__Group_5__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3583:1: ( rule__Command__Group_5__9__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3584:2: rule__Command__Group_5__9__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_5__9__Impl_in_rule__Command__Group_5__97224);
            rule__Command__Group_5__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5__9"


    // $ANTLR start "rule__Command__Group_5__9__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3590:1: rule__Command__Group_5__9__Impl : ( 'fi' ) ;
    public final void rule__Command__Group_5__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3594:1: ( ( 'fi' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3595:1: ( 'fi' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3595:1: ( 'fi' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3596:1: 'fi'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getFiKeyword_5_9()); 
            }
            match(input,31,FOLLOW_31_in_rule__Command__Group_5__9__Impl7252); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getFiKeyword_5_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5__9__Impl"


    // $ANTLR start "rule__Command__Group_5_8__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3629:1: rule__Command__Group_5_8__0 : rule__Command__Group_5_8__0__Impl rule__Command__Group_5_8__1 ;
    public final void rule__Command__Group_5_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3633:1: ( rule__Command__Group_5_8__0__Impl rule__Command__Group_5_8__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3634:2: rule__Command__Group_5_8__0__Impl rule__Command__Group_5_8__1
            {
            pushFollow(FOLLOW_rule__Command__Group_5_8__0__Impl_in_rule__Command__Group_5_8__07303);
            rule__Command__Group_5_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5_8__1_in_rule__Command__Group_5_8__07306);
            rule__Command__Group_5_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5_8__0"


    // $ANTLR start "rule__Command__Group_5_8__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3641:1: rule__Command__Group_5_8__0__Impl : ( 'else' ) ;
    public final void rule__Command__Group_5_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3645:1: ( ( 'else' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3646:1: ( 'else' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3646:1: ( 'else' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3647:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getElseKeyword_5_8_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Command__Group_5_8__0__Impl7334); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getElseKeyword_5_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5_8__0__Impl"


    // $ANTLR start "rule__Command__Group_5_8__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3660:1: rule__Command__Group_5_8__1 : rule__Command__Group_5_8__1__Impl rule__Command__Group_5_8__2 ;
    public final void rule__Command__Group_5_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3664:1: ( rule__Command__Group_5_8__1__Impl rule__Command__Group_5_8__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3665:2: rule__Command__Group_5_8__1__Impl rule__Command__Group_5_8__2
            {
            pushFollow(FOLLOW_rule__Command__Group_5_8__1__Impl_in_rule__Command__Group_5_8__17365);
            rule__Command__Group_5_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5_8__2_in_rule__Command__Group_5_8__17368);
            rule__Command__Group_5_8__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5_8__1"


    // $ANTLR start "rule__Command__Group_5_8__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3672:1: rule__Command__Group_5_8__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3676:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3677:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3677:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3678:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_8_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5_8__1__Impl7395); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5_8__1__Impl"


    // $ANTLR start "rule__Command__Group_5_8__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3689:1: rule__Command__Group_5_8__2 : rule__Command__Group_5_8__2__Impl rule__Command__Group_5_8__3 ;
    public final void rule__Command__Group_5_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3693:1: ( rule__Command__Group_5_8__2__Impl rule__Command__Group_5_8__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3694:2: rule__Command__Group_5_8__2__Impl rule__Command__Group_5_8__3
            {
            pushFollow(FOLLOW_rule__Command__Group_5_8__2__Impl_in_rule__Command__Group_5_8__27424);
            rule__Command__Group_5_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5_8__3_in_rule__Command__Group_5_8__27427);
            rule__Command__Group_5_8__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5_8__2"


    // $ANTLR start "rule__Command__Group_5_8__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3701:1: rule__Command__Group_5_8__2__Impl : ( ( rule__Command__C2Assignment_5_8_2 ) ) ;
    public final void rule__Command__Group_5_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3705:1: ( ( ( rule__Command__C2Assignment_5_8_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3706:1: ( ( rule__Command__C2Assignment_5_8_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3706:1: ( ( rule__Command__C2Assignment_5_8_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3707:1: ( rule__Command__C2Assignment_5_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC2Assignment_5_8_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3708:1: ( rule__Command__C2Assignment_5_8_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3708:2: rule__Command__C2Assignment_5_8_2
            {
            pushFollow(FOLLOW_rule__Command__C2Assignment_5_8_2_in_rule__Command__Group_5_8__2__Impl7454);
            rule__Command__C2Assignment_5_8_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getC2Assignment_5_8_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5_8__2__Impl"


    // $ANTLR start "rule__Command__Group_5_8__3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3718:1: rule__Command__Group_5_8__3 : rule__Command__Group_5_8__3__Impl ;
    public final void rule__Command__Group_5_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3722:1: ( rule__Command__Group_5_8__3__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3723:2: rule__Command__Group_5_8__3__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_5_8__3__Impl_in_rule__Command__Group_5_8__37484);
            rule__Command__Group_5_8__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5_8__3"


    // $ANTLR start "rule__Command__Group_5_8__3__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3729:1: rule__Command__Group_5_8__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3733:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3734:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3734:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3735:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_8_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5_8__3__Impl7511); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_8_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Group_5_8__3__Impl"


    // $ANTLR start "rule__And__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3754:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3758:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3759:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__07548);
            rule__And__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group__1_in_rule__And__Group__07551);
            rule__And__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3766:1: rule__And__Group__0__Impl : ( ( rule__And__ExpOuAssignment_0 ) ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3770:1: ( ( ( rule__And__ExpOuAssignment_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3771:1: ( ( rule__And__ExpOuAssignment_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3771:1: ( ( rule__And__ExpOuAssignment_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3772:1: ( rule__And__ExpOuAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getExpOuAssignment_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3773:1: ( rule__And__ExpOuAssignment_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3773:2: rule__And__ExpOuAssignment_0
            {
            pushFollow(FOLLOW_rule__And__ExpOuAssignment_0_in_rule__And__Group__0__Impl7578);
            rule__And__ExpOuAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getExpOuAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3783:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3787:1: ( rule__And__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3788:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__17608);
            rule__And__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3794:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3798:1: ( ( ( rule__And__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3799:1: ( ( rule__And__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3799:1: ( ( rule__And__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3800:1: ( rule__And__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3801:1: ( rule__And__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3801:2: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl7635);
            	    rule__And__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3815:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3819:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3820:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__07670);
            rule__And__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__07673);
            rule__And__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3827:1: rule__And__Group_1__0__Impl : ( RULE_LC ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3831:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3832:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3832:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3833:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getLCTerminalRuleCall_1_0()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__And__Group_1__0__Impl7700); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getLCTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3844:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3848:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3849:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__17729);
            rule__And__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__17732);
            rule__And__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3856:1: rule__And__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3860:1: ( ( 'and' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3861:1: ( 'and' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3861:1: ( 'and' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3862:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndKeyword_1_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__And__Group_1__1__Impl7760); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAndKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3875:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl rule__And__Group_1__3 ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3879:1: ( rule__And__Group_1__2__Impl rule__And__Group_1__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3880:2: rule__And__Group_1__2__Impl rule__And__Group_1__3
            {
            pushFollow(FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__27791);
            rule__And__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1__3_in_rule__And__Group_1__27794);
            rule__And__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3887:1: rule__And__Group_1__2__Impl : ( RULE_LC ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3891:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3892:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3892:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3893:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getLCTerminalRuleCall_1_2()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__And__Group_1__2__Impl7821); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getLCTerminalRuleCall_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group_1__3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3904:1: rule__And__Group_1__3 : rule__And__Group_1__3__Impl ;
    public final void rule__And__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3908:1: ( rule__And__Group_1__3__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3909:2: rule__And__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_1__3__Impl_in_rule__And__Group_1__37850);
            rule__And__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__3"


    // $ANTLR start "rule__And__Group_1__3__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3915:1: rule__And__Group_1__3__Impl : ( ( rule__And__ExpOu2Assignment_1_3 ) ) ;
    public final void rule__And__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3919:1: ( ( ( rule__And__ExpOu2Assignment_1_3 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3920:1: ( ( rule__And__ExpOu2Assignment_1_3 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3920:1: ( ( rule__And__ExpOu2Assignment_1_3 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3921:1: ( rule__And__ExpOu2Assignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getExpOu2Assignment_1_3()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3922:1: ( rule__And__ExpOu2Assignment_1_3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3922:2: rule__And__ExpOu2Assignment_1_3
            {
            pushFollow(FOLLOW_rule__And__ExpOu2Assignment_1_3_in_rule__And__Group_1__3__Impl7877);
            rule__And__ExpOu2Assignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getExpOu2Assignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__3__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3940:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3944:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3945:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__07915);
            rule__Or__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__07918);
            rule__Or__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3952:1: rule__Or__Group__0__Impl : ( ( rule__Or__ExpNonAssignment_0 ) ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3956:1: ( ( ( rule__Or__ExpNonAssignment_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3957:1: ( ( rule__Or__ExpNonAssignment_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3957:1: ( ( rule__Or__ExpNonAssignment_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3958:1: ( rule__Or__ExpNonAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getExpNonAssignment_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3959:1: ( rule__Or__ExpNonAssignment_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3959:2: rule__Or__ExpNonAssignment_0
            {
            pushFollow(FOLLOW_rule__Or__ExpNonAssignment_0_in_rule__Or__Group__0__Impl7945);
            rule__Or__ExpNonAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getExpNonAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3969:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3973:1: ( rule__Or__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3974:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__17975);
            rule__Or__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3980:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3984:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3985:1: ( ( rule__Or__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3985:1: ( ( rule__Or__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3986:1: ( rule__Or__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3987:1: ( rule__Or__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3987:2: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl8002);
            	    rule__Or__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4001:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4005:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4006:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__08037);
            rule__Or__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__08040);
            rule__Or__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4013:1: rule__Or__Group_1__0__Impl : ( RULE_LC ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4017:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4018:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4018:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4019:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getLCTerminalRuleCall_1_0()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Or__Group_1__0__Impl8067); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getLCTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4030:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4034:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4035:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__18096);
            rule__Or__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__18099);
            rule__Or__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4042:1: rule__Or__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4046:1: ( ( 'or' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4047:1: ( 'or' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4047:1: ( 'or' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4048:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrKeyword_1_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__Or__Group_1__1__Impl8127); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getOrKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4061:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl rule__Or__Group_1__3 ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4065:1: ( rule__Or__Group_1__2__Impl rule__Or__Group_1__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4066:2: rule__Or__Group_1__2__Impl rule__Or__Group_1__3
            {
            pushFollow(FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__28158);
            rule__Or__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group_1__3_in_rule__Or__Group_1__28161);
            rule__Or__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4073:1: rule__Or__Group_1__2__Impl : ( RULE_LC ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4077:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4078:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4078:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4079:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getLCTerminalRuleCall_1_2()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Or__Group_1__2__Impl8188); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getLCTerminalRuleCall_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__Or__Group_1__3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4090:1: rule__Or__Group_1__3 : rule__Or__Group_1__3__Impl ;
    public final void rule__Or__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4094:1: ( rule__Or__Group_1__3__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4095:2: rule__Or__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_1__3__Impl_in_rule__Or__Group_1__38217);
            rule__Or__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__3"


    // $ANTLR start "rule__Or__Group_1__3__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4101:1: rule__Or__Group_1__3__Impl : ( ( rule__Or__ExpNon2Assignment_1_3 ) ) ;
    public final void rule__Or__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4105:1: ( ( ( rule__Or__ExpNon2Assignment_1_3 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4106:1: ( ( rule__Or__ExpNon2Assignment_1_3 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4106:1: ( ( rule__Or__ExpNon2Assignment_1_3 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4107:1: ( rule__Or__ExpNon2Assignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getExpNon2Assignment_1_3()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4108:1: ( rule__Or__ExpNon2Assignment_1_3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4108:2: rule__Or__ExpNon2Assignment_1_3
            {
            pushFollow(FOLLOW_rule__Or__ExpNon2Assignment_1_3_in_rule__Or__Group_1__3__Impl8244);
            rule__Or__ExpNon2Assignment_1_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getExpNon2Assignment_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__3__Impl"


    // $ANTLR start "rule__Not__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4126:1: rule__Not__Group__0 : rule__Not__Group__0__Impl rule__Not__Group__1 ;
    public final void rule__Not__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4130:1: ( rule__Not__Group__0__Impl rule__Not__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4131:2: rule__Not__Group__0__Impl rule__Not__Group__1
            {
            pushFollow(FOLLOW_rule__Not__Group__0__Impl_in_rule__Not__Group__08282);
            rule__Not__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Not__Group__1_in_rule__Not__Group__08285);
            rule__Not__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__0"


    // $ANTLR start "rule__Not__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4138:1: rule__Not__Group__0__Impl : ( ( rule__Not__Group_0__0 )* ) ;
    public final void rule__Not__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4142:1: ( ( ( rule__Not__Group_0__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4143:1: ( ( rule__Not__Group_0__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4143:1: ( ( rule__Not__Group_0__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4144:1: ( rule__Not__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getGroup_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4145:1: ( rule__Not__Group_0__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==43) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4145:2: rule__Not__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Not__Group_0__0_in_rule__Not__Group__0__Impl8312);
            	    rule__Not__Group_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__0__Impl"


    // $ANTLR start "rule__Not__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4155:1: rule__Not__Group__1 : rule__Not__Group__1__Impl ;
    public final void rule__Not__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4159:1: ( rule__Not__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4160:2: rule__Not__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Not__Group__1__Impl_in_rule__Not__Group__18343);
            rule__Not__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__1"


    // $ANTLR start "rule__Not__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4166:1: rule__Not__Group__1__Impl : ( ( rule__Not__ExpEqAssignment_1 ) ) ;
    public final void rule__Not__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4170:1: ( ( ( rule__Not__ExpEqAssignment_1 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4171:1: ( ( rule__Not__ExpEqAssignment_1 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4171:1: ( ( rule__Not__ExpEqAssignment_1 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4172:1: ( rule__Not__ExpEqAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getExpEqAssignment_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4173:1: ( rule__Not__ExpEqAssignment_1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4173:2: rule__Not__ExpEqAssignment_1
            {
            pushFollow(FOLLOW_rule__Not__ExpEqAssignment_1_in_rule__Not__Group__1__Impl8370);
            rule__Not__ExpEqAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getExpEqAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__1__Impl"


    // $ANTLR start "rule__Not__Group_0__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4187:1: rule__Not__Group_0__0 : rule__Not__Group_0__0__Impl rule__Not__Group_0__1 ;
    public final void rule__Not__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4191:1: ( rule__Not__Group_0__0__Impl rule__Not__Group_0__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4192:2: rule__Not__Group_0__0__Impl rule__Not__Group_0__1
            {
            pushFollow(FOLLOW_rule__Not__Group_0__0__Impl_in_rule__Not__Group_0__08404);
            rule__Not__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Not__Group_0__1_in_rule__Not__Group_0__08407);
            rule__Not__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0__0"


    // $ANTLR start "rule__Not__Group_0__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4199:1: rule__Not__Group_0__0__Impl : ( ( rule__Not__NonAssignment_0_0 ) ) ;
    public final void rule__Not__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4203:1: ( ( ( rule__Not__NonAssignment_0_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4204:1: ( ( rule__Not__NonAssignment_0_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4204:1: ( ( rule__Not__NonAssignment_0_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4205:1: ( rule__Not__NonAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getNonAssignment_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4206:1: ( rule__Not__NonAssignment_0_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4206:2: rule__Not__NonAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Not__NonAssignment_0_0_in_rule__Not__Group_0__0__Impl8434);
            rule__Not__NonAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getNonAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0__0__Impl"


    // $ANTLR start "rule__Not__Group_0__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4216:1: rule__Not__Group_0__1 : rule__Not__Group_0__1__Impl ;
    public final void rule__Not__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4220:1: ( rule__Not__Group_0__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4221:2: rule__Not__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Not__Group_0__1__Impl_in_rule__Not__Group_0__18464);
            rule__Not__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0__1"


    // $ANTLR start "rule__Not__Group_0__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4227:1: rule__Not__Group_0__1__Impl : ( RULE_LC ) ;
    public final void rule__Not__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4231:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4232:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4232:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4233:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getLCTerminalRuleCall_0_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Not__Group_0__1__Impl8491); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getLCTerminalRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_0__1__Impl"


    // $ANTLR start "rule__Eq__Group_0__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4248:1: rule__Eq__Group_0__0 : rule__Eq__Group_0__0__Impl rule__Eq__Group_0__1 ;
    public final void rule__Eq__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4252:1: ( rule__Eq__Group_0__0__Impl rule__Eq__Group_0__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4253:2: rule__Eq__Group_0__0__Impl rule__Eq__Group_0__1
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__0__Impl_in_rule__Eq__Group_0__08524);
            rule__Eq__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_0__1_in_rule__Eq__Group_0__08527);
            rule__Eq__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eq__Group_0__0"


    // $ANTLR start "rule__Eq__Group_0__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4260:1: rule__Eq__Group_0__0__Impl : ( ( rule__Eq__ExprEq1Assignment_0_0 ) ) ;
    public final void rule__Eq__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4264:1: ( ( ( rule__Eq__ExprEq1Assignment_0_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4265:1: ( ( rule__Eq__ExprEq1Assignment_0_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4265:1: ( ( rule__Eq__ExprEq1Assignment_0_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4266:1: ( rule__Eq__ExprEq1Assignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getExprEq1Assignment_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4267:1: ( rule__Eq__ExprEq1Assignment_0_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4267:2: rule__Eq__ExprEq1Assignment_0_0
            {
            pushFollow(FOLLOW_rule__Eq__ExprEq1Assignment_0_0_in_rule__Eq__Group_0__0__Impl8554);
            rule__Eq__ExprEq1Assignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getExprEq1Assignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eq__Group_0__0__Impl"


    // $ANTLR start "rule__Eq__Group_0__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4277:1: rule__Eq__Group_0__1 : rule__Eq__Group_0__1__Impl rule__Eq__Group_0__2 ;
    public final void rule__Eq__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4281:1: ( rule__Eq__Group_0__1__Impl rule__Eq__Group_0__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4282:2: rule__Eq__Group_0__1__Impl rule__Eq__Group_0__2
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__1__Impl_in_rule__Eq__Group_0__18584);
            rule__Eq__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_0__2_in_rule__Eq__Group_0__18587);
            rule__Eq__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eq__Group_0__1"


    // $ANTLR start "rule__Eq__Group_0__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4289:1: rule__Eq__Group_0__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Eq__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4293:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4294:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4294:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4295:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getLCTerminalRuleCall_0_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4296:1: ( RULE_LC )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_LC) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4296:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Eq__Group_0__1__Impl8615); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getLCTerminalRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eq__Group_0__1__Impl"


    // $ANTLR start "rule__Eq__Group_0__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4306:1: rule__Eq__Group_0__2 : rule__Eq__Group_0__2__Impl rule__Eq__Group_0__3 ;
    public final void rule__Eq__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4310:1: ( rule__Eq__Group_0__2__Impl rule__Eq__Group_0__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4311:2: rule__Eq__Group_0__2__Impl rule__Eq__Group_0__3
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__2__Impl_in_rule__Eq__Group_0__28646);
            rule__Eq__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_0__3_in_rule__Eq__Group_0__28649);
            rule__Eq__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eq__Group_0__2"


    // $ANTLR start "rule__Eq__Group_0__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4318:1: rule__Eq__Group_0__2__Impl : ( '=?' ) ;
    public final void rule__Eq__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4322:1: ( ( '=?' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4323:1: ( '=?' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4323:1: ( '=?' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4324:1: '=?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getEqualsSignQuestionMarkKeyword_0_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__Eq__Group_0__2__Impl8677); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getEqualsSignQuestionMarkKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eq__Group_0__2__Impl"


    // $ANTLR start "rule__Eq__Group_0__3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4337:1: rule__Eq__Group_0__3 : rule__Eq__Group_0__3__Impl rule__Eq__Group_0__4 ;
    public final void rule__Eq__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4341:1: ( rule__Eq__Group_0__3__Impl rule__Eq__Group_0__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4342:2: rule__Eq__Group_0__3__Impl rule__Eq__Group_0__4
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__3__Impl_in_rule__Eq__Group_0__38708);
            rule__Eq__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_0__4_in_rule__Eq__Group_0__38711);
            rule__Eq__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eq__Group_0__3"


    // $ANTLR start "rule__Eq__Group_0__3__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4349:1: rule__Eq__Group_0__3__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Eq__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4353:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4354:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4354:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4355:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getLCTerminalRuleCall_0_3()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4356:1: ( RULE_LC )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_LC) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4356:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Eq__Group_0__3__Impl8739); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getLCTerminalRuleCall_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eq__Group_0__3__Impl"


    // $ANTLR start "rule__Eq__Group_0__4"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4366:1: rule__Eq__Group_0__4 : rule__Eq__Group_0__4__Impl ;
    public final void rule__Eq__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4370:1: ( rule__Eq__Group_0__4__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4371:2: rule__Eq__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__4__Impl_in_rule__Eq__Group_0__48770);
            rule__Eq__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eq__Group_0__4"


    // $ANTLR start "rule__Eq__Group_0__4__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4377:1: rule__Eq__Group_0__4__Impl : ( ( rule__Eq__ExprEq2Assignment_0_4 ) ) ;
    public final void rule__Eq__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4381:1: ( ( ( rule__Eq__ExprEq2Assignment_0_4 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4382:1: ( ( rule__Eq__ExprEq2Assignment_0_4 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4382:1: ( ( rule__Eq__ExprEq2Assignment_0_4 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4383:1: ( rule__Eq__ExprEq2Assignment_0_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getExprEq2Assignment_0_4()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4384:1: ( rule__Eq__ExprEq2Assignment_0_4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4384:2: rule__Eq__ExprEq2Assignment_0_4
            {
            pushFollow(FOLLOW_rule__Eq__ExprEq2Assignment_0_4_in_rule__Eq__Group_0__4__Impl8797);
            rule__Eq__ExprEq2Assignment_0_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getExprEq2Assignment_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eq__Group_0__4__Impl"


    // $ANTLR start "rule__Eq__Group_1__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4404:1: rule__Eq__Group_1__0 : rule__Eq__Group_1__0__Impl rule__Eq__Group_1__1 ;
    public final void rule__Eq__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4408:1: ( rule__Eq__Group_1__0__Impl rule__Eq__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4409:2: rule__Eq__Group_1__0__Impl rule__Eq__Group_1__1
            {
            pushFollow(FOLLOW_rule__Eq__Group_1__0__Impl_in_rule__Eq__Group_1__08837);
            rule__Eq__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_1__1_in_rule__Eq__Group_1__08840);
            rule__Eq__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eq__Group_1__0"


    // $ANTLR start "rule__Eq__Group_1__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4416:1: rule__Eq__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Eq__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4420:1: ( ( '(' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4421:1: ( '(' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4421:1: ( '(' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4422:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Eq__Group_1__0__Impl8868); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eq__Group_1__0__Impl"


    // $ANTLR start "rule__Eq__Group_1__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4435:1: rule__Eq__Group_1__1 : rule__Eq__Group_1__1__Impl rule__Eq__Group_1__2 ;
    public final void rule__Eq__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4439:1: ( rule__Eq__Group_1__1__Impl rule__Eq__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4440:2: rule__Eq__Group_1__1__Impl rule__Eq__Group_1__2
            {
            pushFollow(FOLLOW_rule__Eq__Group_1__1__Impl_in_rule__Eq__Group_1__18899);
            rule__Eq__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_1__2_in_rule__Eq__Group_1__18902);
            rule__Eq__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eq__Group_1__1"


    // $ANTLR start "rule__Eq__Group_1__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4447:1: rule__Eq__Group_1__1__Impl : ( ( rule__Eq__ExpAssignment_1_1 ) ) ;
    public final void rule__Eq__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4451:1: ( ( ( rule__Eq__ExpAssignment_1_1 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4452:1: ( ( rule__Eq__ExpAssignment_1_1 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4452:1: ( ( rule__Eq__ExpAssignment_1_1 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4453:1: ( rule__Eq__ExpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getExpAssignment_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4454:1: ( rule__Eq__ExpAssignment_1_1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4454:2: rule__Eq__ExpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Eq__ExpAssignment_1_1_in_rule__Eq__Group_1__1__Impl8929);
            rule__Eq__ExpAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getExpAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eq__Group_1__1__Impl"


    // $ANTLR start "rule__Eq__Group_1__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4464:1: rule__Eq__Group_1__2 : rule__Eq__Group_1__2__Impl ;
    public final void rule__Eq__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4468:1: ( rule__Eq__Group_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4469:2: rule__Eq__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Eq__Group_1__2__Impl_in_rule__Eq__Group_1__28959);
            rule__Eq__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eq__Group_1__2"


    // $ANTLR start "rule__Eq__Group_1__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4475:1: rule__Eq__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Eq__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4479:1: ( ( ')' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4480:1: ( ')' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4480:1: ( ')' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4481:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__Eq__Group_1__2__Impl8987); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eq__Group_1__2__Impl"


    // $ANTLR start "rule__ExprTerm__Group_0__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4500:1: rule__ExprTerm__Group_0__0 : rule__ExprTerm__Group_0__0__Impl rule__ExprTerm__Group_0__1 ;
    public final void rule__ExprTerm__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4504:1: ( rule__ExprTerm__Group_0__0__Impl rule__ExprTerm__Group_0__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4505:2: rule__ExprTerm__Group_0__0__Impl rule__ExprTerm__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExprTerm__Group_0__0__Impl_in_rule__ExprTerm__Group_0__09024);
            rule__ExprTerm__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprTerm__Group_0__1_in_rule__ExprTerm__Group_0__09027);
            rule__ExprTerm__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTerm__Group_0__0"


    // $ANTLR start "rule__ExprTerm__Group_0__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4512:1: rule__ExprTerm__Group_0__0__Impl : ( () ) ;
    public final void rule__ExprTerm__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4516:1: ( ( () ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4517:1: ( () )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4517:1: ( () )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4518:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTermAccess().getExprTermAction_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4519:1: ()
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4521:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprTermAccess().getExprTermAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTerm__Group_0__0__Impl"


    // $ANTLR start "rule__ExprTerm__Group_0__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4531:1: rule__ExprTerm__Group_0__1 : rule__ExprTerm__Group_0__1__Impl ;
    public final void rule__ExprTerm__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4535:1: ( rule__ExprTerm__Group_0__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4536:2: rule__ExprTerm__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprTerm__Group_0__1__Impl_in_rule__ExprTerm__Group_0__19085);
            rule__ExprTerm__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTerm__Group_0__1"


    // $ANTLR start "rule__ExprTerm__Group_0__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4542:1: rule__ExprTerm__Group_0__1__Impl : ( 'nil' ) ;
    public final void rule__ExprTerm__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4546:1: ( ( 'nil' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4547:1: ( 'nil' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4547:1: ( 'nil' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4548:1: 'nil'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTermAccess().getNilKeyword_0_1()); 
            }
            match(input,38,FOLLOW_38_in_rule__ExprTerm__Group_0__1__Impl9113); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprTermAccess().getNilKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTerm__Group_0__1__Impl"


    // $ANTLR start "rule__ExprSimple__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4565:1: rule__ExprSimple__Group__0 : rule__ExprSimple__Group__0__Impl rule__ExprSimple__Group__1 ;
    public final void rule__ExprSimple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4569:1: ( rule__ExprSimple__Group__0__Impl rule__ExprSimple__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4570:2: rule__ExprSimple__Group__0__Impl rule__ExprSimple__Group__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group__0__Impl_in_rule__ExprSimple__Group__09148);
            rule__ExprSimple__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group__1_in_rule__ExprSimple__Group__09151);
            rule__ExprSimple__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group__0"


    // $ANTLR start "rule__ExprSimple__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4577:1: rule__ExprSimple__Group__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4581:1: ( ( '(' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4582:1: ( '(' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4582:1: ( '(' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4583:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__ExprSimple__Group__0__Impl9179); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group__0__Impl"


    // $ANTLR start "rule__ExprSimple__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4596:1: rule__ExprSimple__Group__1 : rule__ExprSimple__Group__1__Impl rule__ExprSimple__Group__2 ;
    public final void rule__ExprSimple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4600:1: ( rule__ExprSimple__Group__1__Impl rule__ExprSimple__Group__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4601:2: rule__ExprSimple__Group__1__Impl rule__ExprSimple__Group__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group__1__Impl_in_rule__ExprSimple__Group__19210);
            rule__ExprSimple__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group__2_in_rule__ExprSimple__Group__19213);
            rule__ExprSimple__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group__1"


    // $ANTLR start "rule__ExprSimple__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4608:1: rule__ExprSimple__Group__1__Impl : ( ( rule__ExprSimple__Alternatives_1 ) ) ;
    public final void rule__ExprSimple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4612:1: ( ( ( rule__ExprSimple__Alternatives_1 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4613:1: ( ( rule__ExprSimple__Alternatives_1 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4613:1: ( ( rule__ExprSimple__Alternatives_1 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4614:1: ( rule__ExprSimple__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getAlternatives_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4615:1: ( rule__ExprSimple__Alternatives_1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4615:2: rule__ExprSimple__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Alternatives_1_in_rule__ExprSimple__Group__1__Impl9240);
            rule__ExprSimple__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group__1__Impl"


    // $ANTLR start "rule__ExprSimple__Group__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4625:1: rule__ExprSimple__Group__2 : rule__ExprSimple__Group__2__Impl ;
    public final void rule__ExprSimple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4629:1: ( rule__ExprSimple__Group__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4630:2: rule__ExprSimple__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group__2__Impl_in_rule__ExprSimple__Group__29270);
            rule__ExprSimple__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group__2"


    // $ANTLR start "rule__ExprSimple__Group__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4636:1: rule__ExprSimple__Group__2__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4640:1: ( ( ')' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4641:1: ( ')' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4641:1: ( ')' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4642:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__ExprSimple__Group__2__Impl9298); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group__2__Impl"


    // $ANTLR start "rule__ExprSimple__Group_1_0__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4661:1: rule__ExprSimple__Group_1_0__0 : rule__ExprSimple__Group_1_0__0__Impl rule__ExprSimple__Group_1_0__1 ;
    public final void rule__ExprSimple__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4665:1: ( rule__ExprSimple__Group_1_0__0__Impl rule__ExprSimple__Group_1_0__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4666:2: rule__ExprSimple__Group_1_0__0__Impl rule__ExprSimple__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_0__0__Impl_in_rule__ExprSimple__Group_1_0__09335);
            rule__ExprSimple__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_0__1_in_rule__ExprSimple__Group_1_0__09338);
            rule__ExprSimple__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1_0__0"


    // $ANTLR start "rule__ExprSimple__Group_1_0__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4673:1: rule__ExprSimple__Group_1_0__0__Impl : ( ( rule__ExprSimple__MotAssignment_1_0_0 ) ) ;
    public final void rule__ExprSimple__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4677:1: ( ( ( rule__ExprSimple__MotAssignment_1_0_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4678:1: ( ( rule__ExprSimple__MotAssignment_1_0_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4678:1: ( ( rule__ExprSimple__MotAssignment_1_0_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4679:1: ( rule__ExprSimple__MotAssignment_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getMotAssignment_1_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4680:1: ( rule__ExprSimple__MotAssignment_1_0_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4680:2: rule__ExprSimple__MotAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__ExprSimple__MotAssignment_1_0_0_in_rule__ExprSimple__Group_1_0__0__Impl9365);
            rule__ExprSimple__MotAssignment_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getMotAssignment_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1_0__0__Impl"


    // $ANTLR start "rule__ExprSimple__Group_1_0__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4690:1: rule__ExprSimple__Group_1_0__1 : rule__ExprSimple__Group_1_0__1__Impl ;
    public final void rule__ExprSimple__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4694:1: ( rule__ExprSimple__Group_1_0__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4695:2: rule__ExprSimple__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_0__1__Impl_in_rule__ExprSimple__Group_1_0__19395);
            rule__ExprSimple__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1_0__1"


    // $ANTLR start "rule__ExprSimple__Group_1_0__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4701:1: rule__ExprSimple__Group_1_0__1__Impl : ( ( rule__ExprSimple__LexprAssignment_1_0_1 ) ) ;
    public final void rule__ExprSimple__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4705:1: ( ( ( rule__ExprSimple__LexprAssignment_1_0_1 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4706:1: ( ( rule__ExprSimple__LexprAssignment_1_0_1 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4706:1: ( ( rule__ExprSimple__LexprAssignment_1_0_1 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4707:1: ( rule__ExprSimple__LexprAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLexprAssignment_1_0_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4708:1: ( rule__ExprSimple__LexprAssignment_1_0_1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4708:2: rule__ExprSimple__LexprAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__LexprAssignment_1_0_1_in_rule__ExprSimple__Group_1_0__1__Impl9422);
            rule__ExprSimple__LexprAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLexprAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1_0__1__Impl"


    // $ANTLR start "rule__ExprSimple__Group_1_1__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4722:1: rule__ExprSimple__Group_1_1__0 : rule__ExprSimple__Group_1_1__0__Impl rule__ExprSimple__Group_1_1__1 ;
    public final void rule__ExprSimple__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4726:1: ( rule__ExprSimple__Group_1_1__0__Impl rule__ExprSimple__Group_1_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4727:2: rule__ExprSimple__Group_1_1__0__Impl rule__ExprSimple__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__0__Impl_in_rule__ExprSimple__Group_1_1__09456);
            rule__ExprSimple__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__1_in_rule__ExprSimple__Group_1_1__09459);
            rule__ExprSimple__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1_1__0"


    // $ANTLR start "rule__ExprSimple__Group_1_1__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4734:1: rule__ExprSimple__Group_1_1__0__Impl : ( ( rule__ExprSimple__MotAssignment_1_1_0 ) ) ;
    public final void rule__ExprSimple__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4738:1: ( ( ( rule__ExprSimple__MotAssignment_1_1_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4739:1: ( ( rule__ExprSimple__MotAssignment_1_1_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4739:1: ( ( rule__ExprSimple__MotAssignment_1_1_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4740:1: ( rule__ExprSimple__MotAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getMotAssignment_1_1_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4741:1: ( rule__ExprSimple__MotAssignment_1_1_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4741:2: rule__ExprSimple__MotAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__ExprSimple__MotAssignment_1_1_0_in_rule__ExprSimple__Group_1_1__0__Impl9486);
            rule__ExprSimple__MotAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getMotAssignment_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExprSimple__Group_1_1__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4751:1: rule__ExprSimple__Group_1_1__1 : rule__ExprSimple__Group_1_1__1__Impl rule__ExprSimple__Group_1_1__2 ;
    public final void rule__ExprSimple__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4755:1: ( rule__ExprSimple__Group_1_1__1__Impl rule__ExprSimple__Group_1_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4756:2: rule__ExprSimple__Group_1_1__1__Impl rule__ExprSimple__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__1__Impl_in_rule__ExprSimple__Group_1_1__19516);
            rule__ExprSimple__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__2_in_rule__ExprSimple__Group_1_1__19519);
            rule__ExprSimple__Group_1_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1_1__1"


    // $ANTLR start "rule__ExprSimple__Group_1_1__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4763:1: rule__ExprSimple__Group_1_1__1__Impl : ( RULE_LC ) ;
    public final void rule__ExprSimple__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4767:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4768:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4768:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4769:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLCTerminalRuleCall_1_1_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__ExprSimple__Group_1_1__1__Impl9546); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLCTerminalRuleCall_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExprSimple__Group_1_1__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4780:1: rule__ExprSimple__Group_1_1__2 : rule__ExprSimple__Group_1_1__2__Impl ;
    public final void rule__ExprSimple__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4784:1: ( rule__ExprSimple__Group_1_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4785:2: rule__ExprSimple__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__2__Impl_in_rule__ExprSimple__Group_1_1__29575);
            rule__ExprSimple__Group_1_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1_1__2"


    // $ANTLR start "rule__ExprSimple__Group_1_1__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4791:1: rule__ExprSimple__Group_1_1__2__Impl : ( ( rule__ExprSimple__ExprAssignment_1_1_2 ) ) ;
    public final void rule__ExprSimple__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4795:1: ( ( ( rule__ExprSimple__ExprAssignment_1_1_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4796:1: ( ( rule__ExprSimple__ExprAssignment_1_1_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4796:1: ( ( rule__ExprSimple__ExprAssignment_1_1_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4797:1: ( rule__ExprSimple__ExprAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprAssignment_1_1_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4798:1: ( rule__ExprSimple__ExprAssignment_1_1_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4798:2: rule__ExprSimple__ExprAssignment_1_1_2
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprAssignment_1_1_2_in_rule__ExprSimple__Group_1_1__2__Impl9602);
            rule__ExprSimple__ExprAssignment_1_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprAssignment_1_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__Group_1_1__2__Impl"


    // $ANTLR start "rule__Lexpr__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4814:1: rule__Lexpr__Group__0 : rule__Lexpr__Group__0__Impl rule__Lexpr__Group__1 ;
    public final void rule__Lexpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4818:1: ( rule__Lexpr__Group__0__Impl rule__Lexpr__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4819:2: rule__Lexpr__Group__0__Impl rule__Lexpr__Group__1
            {
            pushFollow(FOLLOW_rule__Lexpr__Group__0__Impl_in_rule__Lexpr__Group__09638);
            rule__Lexpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Lexpr__Group__1_in_rule__Lexpr__Group__09641);
            rule__Lexpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexpr__Group__0"


    // $ANTLR start "rule__Lexpr__Group__0__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4826:1: rule__Lexpr__Group__0__Impl : ( RULE_LC ) ;
    public final void rule__Lexpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4830:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4831:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4831:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4832:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLexprAccess().getLCTerminalRuleCall_0()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Lexpr__Group__0__Impl9668); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLexprAccess().getLCTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexpr__Group__0__Impl"


    // $ANTLR start "rule__Lexpr__Group__1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4843:1: rule__Lexpr__Group__1 : rule__Lexpr__Group__1__Impl ;
    public final void rule__Lexpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4847:1: ( rule__Lexpr__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4848:2: rule__Lexpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Lexpr__Group__1__Impl_in_rule__Lexpr__Group__19697);
            rule__Lexpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexpr__Group__1"


    // $ANTLR start "rule__Lexpr__Group__1__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4854:1: rule__Lexpr__Group__1__Impl : ( ( rule__Lexpr__ExpAssignment_1 ) ) ;
    public final void rule__Lexpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4858:1: ( ( ( rule__Lexpr__ExpAssignment_1 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4859:1: ( ( rule__Lexpr__ExpAssignment_1 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4859:1: ( ( rule__Lexpr__ExpAssignment_1 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4860:1: ( rule__Lexpr__ExpAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLexprAccess().getExpAssignment_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4861:1: ( rule__Lexpr__ExpAssignment_1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4861:2: rule__Lexpr__ExpAssignment_1
            {
            pushFollow(FOLLOW_rule__Lexpr__ExpAssignment_1_in_rule__Lexpr__Group__1__Impl9724);
            rule__Lexpr__ExpAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLexprAccess().getExpAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexpr__Group__1__Impl"


    // $ANTLR start "rule__Model__ModelAssignment_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4876:1: rule__Model__ModelAssignment_0 : ( ruleFunction ) ;
    public final void rule__Model__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4880:1: ( ( ruleFunction ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4881:1: ( ruleFunction )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4881:1: ( ruleFunction )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4882:1: ruleFunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelFunctionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_rule__Model__ModelAssignment_09763);
            ruleFunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getModelFunctionParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ModelAssignment_0"


    // $ANTLR start "rule__Function__FunNameAssignment_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4891:1: rule__Function__FunNameAssignment_2 : ( RULE_SYMBOLES ) ;
    public final void rule__Function__FunNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4895:1: ( ( RULE_SYMBOLES ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4896:1: ( RULE_SYMBOLES )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4896:1: ( RULE_SYMBOLES )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4897:1: RULE_SYMBOLES
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFunNameSYMBOLESTerminalRuleCall_2_0()); 
            }
            match(input,RULE_SYMBOLES,FOLLOW_RULE_SYMBOLES_in_rule__Function__FunNameAssignment_29794); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getFunNameSYMBOLESTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__FunNameAssignment_2"


    // $ANTLR start "rule__Function__DefAssignment_5"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4906:1: rule__Function__DefAssignment_5 : ( ruleDefiniton ) ;
    public final void rule__Function__DefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4910:1: ( ( ruleDefiniton ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4911:1: ( ruleDefiniton )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4911:1: ( ruleDefiniton )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4912:1: ruleDefiniton
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getDefDefinitonParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleDefiniton_in_rule__Function__DefAssignment_59825);
            ruleDefiniton();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionAccess().getDefDefinitonParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Function__DefAssignment_5"


    // $ANTLR start "rule__Definiton__InputVarsAssignment_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4921:1: rule__Definiton__InputVarsAssignment_2 : ( ruleInput ) ;
    public final void rule__Definiton__InputVarsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4925:1: ( ( ruleInput ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4926:1: ( ruleInput )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4926:1: ( ruleInput )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4927:1: ruleInput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getInputVarsInputParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleInput_in_rule__Definiton__InputVarsAssignment_29856);
            ruleInput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getInputVarsInputParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__InputVarsAssignment_2"


    // $ANTLR start "rule__Definiton__CommandListAssignment_5"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4936:1: rule__Definiton__CommandListAssignment_5 : ( ruleCommands ) ;
    public final void rule__Definiton__CommandListAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4940:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4941:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4941:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4942:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getCommandListCommandsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Definiton__CommandListAssignment_59887);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getCommandListCommandsParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__CommandListAssignment_5"


    // $ANTLR start "rule__Definiton__OutputVarsAssignment_10"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4951:1: rule__Definiton__OutputVarsAssignment_10 : ( ruleOutput ) ;
    public final void rule__Definiton__OutputVarsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4955:1: ( ( ruleOutput ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4956:1: ( ruleOutput )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4956:1: ( ruleOutput )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4957:1: ruleOutput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getOutputVarsOutputParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_rule__Definiton__OutputVarsAssignment_109918);
            ruleOutput();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefinitonAccess().getOutputVarsOutputParserRuleCall_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definiton__OutputVarsAssignment_10"


    // $ANTLR start "rule__Input__VAssignment_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4966:1: rule__Input__VAssignment_0 : ( RULE_VARIABLE ) ;
    public final void rule__Input__VAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4970:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4971:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4971:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4972:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVVARIABLETerminalRuleCall_0_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Input__VAssignment_09949); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVVARIABLETerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__VAssignment_0"


    // $ANTLR start "rule__Input__V2Assignment_1_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4981:1: rule__Input__V2Assignment_1_2 : ( RULE_VARIABLE ) ;
    public final void rule__Input__V2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4985:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4986:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4986:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4987:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getV2VARIABLETerminalRuleCall_1_2_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Input__V2Assignment_1_29980); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getV2VARIABLETerminalRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Input__V2Assignment_1_2"


    // $ANTLR start "rule__Output__VAssignment_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4996:1: rule__Output__VAssignment_0 : ( RULE_VARIABLE ) ;
    public final void rule__Output__VAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5000:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5001:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5001:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5002:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVVARIABLETerminalRuleCall_0_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Output__VAssignment_010011); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getVVARIABLETerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__VAssignment_0"


    // $ANTLR start "rule__Output__V2Assignment_1_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5011:1: rule__Output__V2Assignment_1_2 : ( RULE_VARIABLE ) ;
    public final void rule__Output__V2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5015:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5016:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5016:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5017:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getV2VARIABLETerminalRuleCall_1_2_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Output__V2Assignment_1_210042); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getV2VARIABLETerminalRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Output__V2Assignment_1_2"


    // $ANTLR start "rule__Commands__CAssignment_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5026:1: rule__Commands__CAssignment_0 : ( ruleCommand ) ;
    public final void rule__Commands__CAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5030:1: ( ( ruleCommand ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5031:1: ( ruleCommand )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5031:1: ( ruleCommand )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5032:1: ruleCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_rule__Commands__CAssignment_010073);
            ruleCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__CAssignment_0"


    // $ANTLR start "rule__Commands__CAssignment_1_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5041:1: rule__Commands__CAssignment_1_2 : ( ruleCommand ) ;
    public final void rule__Commands__CAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5045:1: ( ( ruleCommand ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5046:1: ( ruleCommand )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5046:1: ( ruleCommand )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5047:1: ruleCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_rule__Commands__CAssignment_1_210104);
            ruleCommand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Commands__CAssignment_1_2"


    // $ANTLR start "rule__Vars__V1Assignment_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5056:1: rule__Vars__V1Assignment_0 : ( RULE_VARIABLE ) ;
    public final void rule__Vars__V1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5060:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5061:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5061:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5062:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getV1VARIABLETerminalRuleCall_0_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Vars__V1Assignment_010135); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getV1VARIABLETerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__V1Assignment_0"


    // $ANTLR start "rule__Vars__V2Assignment_1_1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5071:1: rule__Vars__V2Assignment_1_1 : ( ruleVars ) ;
    public final void rule__Vars__V2Assignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5075:1: ( ( ruleVars ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5076:1: ( ruleVars )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5076:1: ( ruleVars )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5077:1: ruleVars
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getV2VarsParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleVars_in_rule__Vars__V2Assignment_1_110166);
            ruleVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getV2VarsParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vars__V2Assignment_1_1"


    // $ANTLR start "rule__Exprs__ExpAssignment_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5086:1: rule__Exprs__ExpAssignment_0 : ( ruleExpr ) ;
    public final void rule__Exprs__ExpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5090:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5091:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5091:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5092:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpExprParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Exprs__ExpAssignment_010197);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExpExprParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__ExpAssignment_0"


    // $ANTLR start "rule__Exprs__ExpLAssignment_1_1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5101:1: rule__Exprs__ExpLAssignment_1_1 : ( ruleExprs ) ;
    public final void rule__Exprs__ExpLAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5105:1: ( ( ruleExprs ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5106:1: ( ruleExprs )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5106:1: ( ruleExprs )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5107:1: ruleExprs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpLExprsParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_rule__Exprs__ExpLAssignment_1_110228);
            ruleExprs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExpLExprsParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exprs__ExpLAssignment_1_1"


    // $ANTLR start "rule__Command__VarLAssignment_1_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5116:1: rule__Command__VarLAssignment_1_0 : ( ruleVars ) ;
    public final void rule__Command__VarLAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5120:1: ( ( ruleVars ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5121:1: ( ruleVars )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5121:1: ( ruleVars )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5122:1: ruleVars
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getVarLVarsParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleVars_in_rule__Command__VarLAssignment_1_010259);
            ruleVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getVarLVarsParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__VarLAssignment_1_0"


    // $ANTLR start "rule__Command__ExpLAssignment_1_4"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5131:1: rule__Command__ExpLAssignment_1_4 : ( ruleExprs ) ;
    public final void rule__Command__ExpLAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5135:1: ( ( ruleExprs ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5136:1: ( ruleExprs )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5136:1: ( ruleExprs )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5137:1: ruleExprs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpLExprsParserRuleCall_1_4_0()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_rule__Command__ExpLAssignment_1_410290);
            ruleExprs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExpLExprsParserRuleCall_1_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__ExpLAssignment_1_4"


    // $ANTLR start "rule__Command__NomAssignment_2_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5146:1: rule__Command__NomAssignment_2_0 : ( ( 'while' ) ) ;
    public final void rule__Command__NomAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5150:1: ( ( ( 'while' ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5151:1: ( ( 'while' ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5151:1: ( ( 'while' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5152:1: ( 'while' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomWhileKeyword_2_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5153:1: ( 'while' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5154:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomWhileKeyword_2_0_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__Command__NomAssignment_2_010326); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomWhileKeyword_2_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomWhileKeyword_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__NomAssignment_2_0"


    // $ANTLR start "rule__Command__ExpAssignment_2_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5169:1: rule__Command__ExpAssignment_2_2 : ( ruleExpr ) ;
    public final void rule__Command__ExpAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5173:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5174:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5174:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5175:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpExprParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_2_210365);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExpExprParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__ExpAssignment_2_2"


    // $ANTLR start "rule__Command__C1Assignment_2_6"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5184:1: rule__Command__C1Assignment_2_6 : ( ruleCommands ) ;
    public final void rule__Command__C1Assignment_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5188:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5189:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5189:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5190:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_2_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__C1Assignment_2_610396);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_2_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__C1Assignment_2_6"


    // $ANTLR start "rule__Command__NomAssignment_3_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5199:1: rule__Command__NomAssignment_3_0 : ( ( 'for' ) ) ;
    public final void rule__Command__NomAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5203:1: ( ( ( 'for' ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5204:1: ( ( 'for' ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5204:1: ( ( 'for' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5205:1: ( 'for' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomForKeyword_3_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5206:1: ( 'for' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5207:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomForKeyword_3_0_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__Command__NomAssignment_3_010432); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomForKeyword_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomForKeyword_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__NomAssignment_3_0"


    // $ANTLR start "rule__Command__ExpAssignment_3_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5222:1: rule__Command__ExpAssignment_3_2 : ( ruleExpr ) ;
    public final void rule__Command__ExpAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5226:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5227:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5227:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5228:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpExprParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_3_210471);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExpExprParserRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__ExpAssignment_3_2"


    // $ANTLR start "rule__Command__C1Assignment_3_6"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5237:1: rule__Command__C1Assignment_3_6 : ( ruleCommands ) ;
    public final void rule__Command__C1Assignment_3_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5241:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5242:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5242:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5243:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_3_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__C1Assignment_3_610502);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_3_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__C1Assignment_3_6"


    // $ANTLR start "rule__Command__NomAssignment_4_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5252:1: rule__Command__NomAssignment_4_0 : ( ( 'foreach' ) ) ;
    public final void rule__Command__NomAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5256:1: ( ( ( 'foreach' ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5257:1: ( ( 'foreach' ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5257:1: ( ( 'foreach' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5258:1: ( 'foreach' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomForeachKeyword_4_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5259:1: ( 'foreach' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5260:1: 'foreach'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomForeachKeyword_4_0_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__Command__NomAssignment_4_010538); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomForeachKeyword_4_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomForeachKeyword_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__NomAssignment_4_0"


    // $ANTLR start "rule__Command__Exp1Assignment_4_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5275:1: rule__Command__Exp1Assignment_4_2 : ( ruleExpr ) ;
    public final void rule__Command__Exp1Assignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5279:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5280:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5280:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5281:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExp1ExprParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__Exp1Assignment_4_210577);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExp1ExprParserRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Exp1Assignment_4_2"


    // $ANTLR start "rule__Command__Exp2Assignment_4_6"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5290:1: rule__Command__Exp2Assignment_4_6 : ( ruleExpr ) ;
    public final void rule__Command__Exp2Assignment_4_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5294:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5295:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5295:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5296:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExp2ExprParserRuleCall_4_6_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__Exp2Assignment_4_610608);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExp2ExprParserRuleCall_4_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__Exp2Assignment_4_6"


    // $ANTLR start "rule__Command__C1Assignment_4_10"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5305:1: rule__Command__C1Assignment_4_10 : ( ruleCommands ) ;
    public final void rule__Command__C1Assignment_4_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5309:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5310:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5310:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5311:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_4_10_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__C1Assignment_4_1010639);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_4_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__C1Assignment_4_10"


    // $ANTLR start "rule__Command__NomAssignment_5_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5320:1: rule__Command__NomAssignment_5_0 : ( ( 'if' ) ) ;
    public final void rule__Command__NomAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5324:1: ( ( ( 'if' ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5325:1: ( ( 'if' ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5325:1: ( ( 'if' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5326:1: ( 'if' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomIfKeyword_5_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5327:1: ( 'if' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5328:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomIfKeyword_5_0_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__Command__NomAssignment_5_010675); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomIfKeyword_5_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getNomIfKeyword_5_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__NomAssignment_5_0"


    // $ANTLR start "rule__Command__ExpAssignment_5_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5343:1: rule__Command__ExpAssignment_5_2 : ( ruleExpr ) ;
    public final void rule__Command__ExpAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5347:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5348:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5348:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5349:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpExprParserRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_5_210714);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExpExprParserRuleCall_5_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__ExpAssignment_5_2"


    // $ANTLR start "rule__Command__C1Assignment_5_6"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5358:1: rule__Command__C1Assignment_5_6 : ( ruleCommands ) ;
    public final void rule__Command__C1Assignment_5_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5362:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5363:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5363:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5364:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_5_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__C1Assignment_5_610745);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_5_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__C1Assignment_5_6"


    // $ANTLR start "rule__Command__C2Assignment_5_8_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5373:1: rule__Command__C2Assignment_5_8_2 : ( ruleCommands ) ;
    public final void rule__Command__C2Assignment_5_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5377:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5378:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5378:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5379:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC2CommandsParserRuleCall_5_8_2_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__C2Assignment_5_8_210776);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getC2CommandsParserRuleCall_5_8_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__C2Assignment_5_8_2"


    // $ANTLR start "rule__Expr__ExprSimpleAssignment_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5388:1: rule__Expr__ExprSimpleAssignment_0 : ( ruleExprSimple ) ;
    public final void rule__Expr__ExprSimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5392:1: ( ( ruleExprSimple ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5393:1: ( ruleExprSimple )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5393:1: ( ruleExprSimple )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5394:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExprSimpleExprSimpleParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__Expr__ExprSimpleAssignment_010807);
            ruleExprSimple();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getExprSimpleExprSimpleParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__ExprSimpleAssignment_0"


    // $ANTLR start "rule__Expr__ExpEtAssignment_1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5403:1: rule__Expr__ExpEtAssignment_1 : ( ruleAnd ) ;
    public final void rule__Expr__ExpEtAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5407:1: ( ( ruleAnd ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5408:1: ( ruleAnd )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5408:1: ( ruleAnd )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5409:1: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExpEtAndParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_rule__Expr__ExpEtAssignment_110838);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getExpEtAndParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__ExpEtAssignment_1"


    // $ANTLR start "rule__Expr__ExpTerminaleAssignment_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5418:1: rule__Expr__ExpTerminaleAssignment_2 : ( ruleExprTerm ) ;
    public final void rule__Expr__ExpTerminaleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5422:1: ( ( ruleExprTerm ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5423:1: ( ruleExprTerm )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5423:1: ( ruleExprTerm )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5424:1: ruleExprTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExpTerminaleExprTermParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExprTerm_in_rule__Expr__ExpTerminaleAssignment_210869);
            ruleExprTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprAccess().getExpTerminaleExprTermParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expr__ExpTerminaleAssignment_2"


    // $ANTLR start "rule__And__ExpOuAssignment_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5433:1: rule__And__ExpOuAssignment_0 : ( ruleOr ) ;
    public final void rule__And__ExpOuAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5437:1: ( ( ruleOr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5438:1: ( ruleOr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5438:1: ( ruleOr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5439:1: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getExpOuOrParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleOr_in_rule__And__ExpOuAssignment_010900);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getExpOuOrParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__ExpOuAssignment_0"


    // $ANTLR start "rule__And__ExpOu2Assignment_1_3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5448:1: rule__And__ExpOu2Assignment_1_3 : ( ruleOr ) ;
    public final void rule__And__ExpOu2Assignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5452:1: ( ( ruleOr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5453:1: ( ruleOr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5453:1: ( ruleOr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5454:1: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getExpOu2OrParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleOr_in_rule__And__ExpOu2Assignment_1_310931);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getExpOu2OrParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__ExpOu2Assignment_1_3"


    // $ANTLR start "rule__Or__ExpNonAssignment_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5463:1: rule__Or__ExpNonAssignment_0 : ( ruleNot ) ;
    public final void rule__Or__ExpNonAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5467:1: ( ( ruleNot ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5468:1: ( ruleNot )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5468:1: ( ruleNot )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5469:1: ruleNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getExpNonNotParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleNot_in_rule__Or__ExpNonAssignment_010962);
            ruleNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getExpNonNotParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__ExpNonAssignment_0"


    // $ANTLR start "rule__Or__ExpNon2Assignment_1_3"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5478:1: rule__Or__ExpNon2Assignment_1_3 : ( ruleNot ) ;
    public final void rule__Or__ExpNon2Assignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5482:1: ( ( ruleNot ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5483:1: ( ruleNot )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5483:1: ( ruleNot )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5484:1: ruleNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getExpNon2NotParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleNot_in_rule__Or__ExpNon2Assignment_1_310993);
            ruleNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getExpNon2NotParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__ExpNon2Assignment_1_3"


    // $ANTLR start "rule__Not__NonAssignment_0_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5493:1: rule__Not__NonAssignment_0_0 : ( ( 'not' ) ) ;
    public final void rule__Not__NonAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5497:1: ( ( ( 'not' ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5498:1: ( ( 'not' ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5498:1: ( ( 'not' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5499:1: ( 'not' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getNonNotKeyword_0_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5500:1: ( 'not' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5501:1: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getNonNotKeyword_0_0_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__Not__NonAssignment_0_011029); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getNonNotKeyword_0_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getNonNotKeyword_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__NonAssignment_0_0"


    // $ANTLR start "rule__Not__ExpEqAssignment_1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5516:1: rule__Not__ExpEqAssignment_1 : ( ruleEq ) ;
    public final void rule__Not__ExpEqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5520:1: ( ( ruleEq ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5521:1: ( ruleEq )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5521:1: ( ruleEq )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5522:1: ruleEq
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getExpEqEqParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEq_in_rule__Not__ExpEqAssignment_111068);
            ruleEq();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getExpEqEqParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__ExpEqAssignment_1"


    // $ANTLR start "rule__Eq__ExprEq1Assignment_0_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5531:1: rule__Eq__ExprEq1Assignment_0_0 : ( ( rule__Eq__ExprEq1Alternatives_0_0_0 ) ) ;
    public final void rule__Eq__ExprEq1Assignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5535:1: ( ( ( rule__Eq__ExprEq1Alternatives_0_0_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5536:1: ( ( rule__Eq__ExprEq1Alternatives_0_0_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5536:1: ( ( rule__Eq__ExprEq1Alternatives_0_0_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5537:1: ( rule__Eq__ExprEq1Alternatives_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getExprEq1Alternatives_0_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5538:1: ( rule__Eq__ExprEq1Alternatives_0_0_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5538:2: rule__Eq__ExprEq1Alternatives_0_0_0
            {
            pushFollow(FOLLOW_rule__Eq__ExprEq1Alternatives_0_0_0_in_rule__Eq__ExprEq1Assignment_0_011099);
            rule__Eq__ExprEq1Alternatives_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getExprEq1Alternatives_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eq__ExprEq1Assignment_0_0"


    // $ANTLR start "rule__Eq__ExprEq2Assignment_0_4"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5547:1: rule__Eq__ExprEq2Assignment_0_4 : ( ( rule__Eq__ExprEq2Alternatives_0_4_0 ) ) ;
    public final void rule__Eq__ExprEq2Assignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5551:1: ( ( ( rule__Eq__ExprEq2Alternatives_0_4_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5552:1: ( ( rule__Eq__ExprEq2Alternatives_0_4_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5552:1: ( ( rule__Eq__ExprEq2Alternatives_0_4_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5553:1: ( rule__Eq__ExprEq2Alternatives_0_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getExprEq2Alternatives_0_4_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5554:1: ( rule__Eq__ExprEq2Alternatives_0_4_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5554:2: rule__Eq__ExprEq2Alternatives_0_4_0
            {
            pushFollow(FOLLOW_rule__Eq__ExprEq2Alternatives_0_4_0_in_rule__Eq__ExprEq2Assignment_0_411132);
            rule__Eq__ExprEq2Alternatives_0_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getExprEq2Alternatives_0_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eq__ExprEq2Assignment_0_4"


    // $ANTLR start "rule__Eq__ExpAssignment_1_1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5563:1: rule__Eq__ExpAssignment_1_1 : ( ( rule__Eq__ExpAlternatives_1_1_0 ) ) ;
    public final void rule__Eq__ExpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5567:1: ( ( ( rule__Eq__ExpAlternatives_1_1_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5568:1: ( ( rule__Eq__ExpAlternatives_1_1_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5568:1: ( ( rule__Eq__ExpAlternatives_1_1_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5569:1: ( rule__Eq__ExpAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getExpAlternatives_1_1_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5570:1: ( rule__Eq__ExpAlternatives_1_1_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5570:2: rule__Eq__ExpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Eq__ExpAlternatives_1_1_0_in_rule__Eq__ExpAssignment_1_111165);
            rule__Eq__ExpAlternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getExpAlternatives_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eq__ExpAssignment_1_1"


    // $ANTLR start "rule__ExprTerm__TermVarAssignment_1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5579:1: rule__ExprTerm__TermVarAssignment_1 : ( RULE_VARIABLE ) ;
    public final void rule__ExprTerm__TermVarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5583:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5584:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5584:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5585:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTermAccess().getTermVarVARIABLETerminalRuleCall_1_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__ExprTerm__TermVarAssignment_111198); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprTermAccess().getTermVarVARIABLETerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTerm__TermVarAssignment_1"


    // $ANTLR start "rule__ExprTerm__TermSymAssignment_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5594:1: rule__ExprTerm__TermSymAssignment_2 : ( RULE_SYMBOLES ) ;
    public final void rule__ExprTerm__TermSymAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5598:1: ( ( RULE_SYMBOLES ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5599:1: ( RULE_SYMBOLES )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5599:1: ( RULE_SYMBOLES )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5600:1: RULE_SYMBOLES
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTermAccess().getTermSymSYMBOLESTerminalRuleCall_2_0()); 
            }
            match(input,RULE_SYMBOLES,FOLLOW_RULE_SYMBOLES_in_rule__ExprTerm__TermSymAssignment_211229); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprTermAccess().getTermSymSYMBOLESTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprTerm__TermSymAssignment_2"


    // $ANTLR start "rule__ExprSimple__MotAssignment_1_0_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5609:1: rule__ExprSimple__MotAssignment_1_0_0 : ( ( rule__ExprSimple__MotAlternatives_1_0_0_0 ) ) ;
    public final void rule__ExprSimple__MotAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5613:1: ( ( ( rule__ExprSimple__MotAlternatives_1_0_0_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5614:1: ( ( rule__ExprSimple__MotAlternatives_1_0_0_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5614:1: ( ( rule__ExprSimple__MotAlternatives_1_0_0_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5615:1: ( rule__ExprSimple__MotAlternatives_1_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getMotAlternatives_1_0_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5616:1: ( rule__ExprSimple__MotAlternatives_1_0_0_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5616:2: rule__ExprSimple__MotAlternatives_1_0_0_0
            {
            pushFollow(FOLLOW_rule__ExprSimple__MotAlternatives_1_0_0_0_in_rule__ExprSimple__MotAssignment_1_0_011260);
            rule__ExprSimple__MotAlternatives_1_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getMotAlternatives_1_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__MotAssignment_1_0_0"


    // $ANTLR start "rule__ExprSimple__LexprAssignment_1_0_1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5625:1: rule__ExprSimple__LexprAssignment_1_0_1 : ( ruleLexpr ) ;
    public final void rule__ExprSimple__LexprAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5629:1: ( ( ruleLexpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5630:1: ( ruleLexpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5630:1: ( ruleLexpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5631:1: ruleLexpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLexprLexprParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleLexpr_in_rule__ExprSimple__LexprAssignment_1_0_111293);
            ruleLexpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLexprLexprParserRuleCall_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__LexprAssignment_1_0_1"


    // $ANTLR start "rule__ExprSimple__MotAssignment_1_1_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5640:1: rule__ExprSimple__MotAssignment_1_1_0 : ( ( rule__ExprSimple__MotAlternatives_1_1_0_0 ) ) ;
    public final void rule__ExprSimple__MotAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5644:1: ( ( ( rule__ExprSimple__MotAlternatives_1_1_0_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5645:1: ( ( rule__ExprSimple__MotAlternatives_1_1_0_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5645:1: ( ( rule__ExprSimple__MotAlternatives_1_1_0_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5646:1: ( rule__ExprSimple__MotAlternatives_1_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getMotAlternatives_1_1_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5647:1: ( rule__ExprSimple__MotAlternatives_1_1_0_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5647:2: rule__ExprSimple__MotAlternatives_1_1_0_0
            {
            pushFollow(FOLLOW_rule__ExprSimple__MotAlternatives_1_1_0_0_in_rule__ExprSimple__MotAssignment_1_1_011324);
            rule__ExprSimple__MotAlternatives_1_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getMotAlternatives_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__MotAssignment_1_1_0"


    // $ANTLR start "rule__ExprSimple__ExprAssignment_1_1_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5656:1: rule__ExprSimple__ExprAssignment_1_1_2 : ( ruleExpr ) ;
    public final void rule__ExprSimple__ExprAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5660:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5661:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5661:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5662:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprExprParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprSimple__ExprAssignment_1_1_211357);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprExprParserRuleCall_1_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExprSimple__ExprAssignment_1_1_2"


    // $ANTLR start "rule__Lexpr__ExpAssignment_1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5671:1: rule__Lexpr__ExpAssignment_1 : ( ruleExpr ) ;
    public final void rule__Lexpr__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5675:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5676:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5676:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5677:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLexprAccess().getExpExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Lexpr__ExpAssignment_111388);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLexprAccess().getExpExprParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexpr__ExpAssignment_1"

    // $ANTLR start synpred8_InternalMyDsl
    public final void synpred8_InternalMyDsl_fragment() throws RecognitionException {   
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ( ( ( rule__Expr__ExprSimpleAssignment_0 ) ) )
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ( ( rule__Expr__ExprSimpleAssignment_0 ) )
        {
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ( ( rule__Expr__ExprSimpleAssignment_0 ) )
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:598:1: ( rule__Expr__ExprSimpleAssignment_0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprAccess().getExprSimpleAssignment_0()); 
        }
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:599:1: ( rule__Expr__ExprSimpleAssignment_0 )
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:599:2: rule__Expr__ExprSimpleAssignment_0
        {
        pushFollow(FOLLOW_rule__Expr__ExprSimpleAssignment_0_in_synpred8_InternalMyDsl1246);
        rule__Expr__ExprSimpleAssignment_0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred8_InternalMyDsl

    // $ANTLR start synpred9_InternalMyDsl
    public final void synpred9_InternalMyDsl_fragment() throws RecognitionException {   
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:603:6: ( ( ( rule__Expr__ExpEtAssignment_1 ) ) )
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:603:6: ( ( rule__Expr__ExpEtAssignment_1 ) )
        {
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:603:6: ( ( rule__Expr__ExpEtAssignment_1 ) )
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:604:1: ( rule__Expr__ExpEtAssignment_1 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprAccess().getExpEtAssignment_1()); 
        }
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:605:1: ( rule__Expr__ExpEtAssignment_1 )
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:605:2: rule__Expr__ExpEtAssignment_1
        {
        pushFollow(FOLLOW_rule__Expr__ExpEtAssignment_1_in_synpred9_InternalMyDsl1264);
        rule__Expr__ExpEtAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred9_InternalMyDsl

    // Delegated rules

    public final boolean synpred8_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA4_eotS =
        "\41\uffff";
    static final String DFA4_eofS =
        "\3\uffff\3\16\33\uffff";
    static final String DFA4_minS =
        "\2\5\1\uffff\3\4\4\uffff\4\0\3\uffff\1\0\2\uffff\1\0\10\uffff\1"+
        "\0\3\uffff";
    static final String DFA4_maxS =
        "\1\53\1\46\1\uffff\3\45\4\uffff\4\0\3\uffff\1\0\2\uffff\1\0\10\uffff"+
        "\1\0\3\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\13\uffff\1\3\21\uffff\1\1";
    static final String DFA4_specialS =
        "\12\uffff\1\0\1\1\1\2\1\3\3\uffff\1\4\2\uffff\1\5\10\uffff\1\6\3"+
        "\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\5\1\4\35\uffff\1\1\1\uffff\1\3\4\uffff\1\2",
            "\2\2\7\uffff\1\12\1\13\1\14\1\15\22\uffff\1\2\1\uffff\1\2",
            "",
            "\1\21\22\uffff\2\16\12\uffff\1\2\1\uffff\1\16",
            "\1\24\22\uffff\2\16\12\uffff\1\2\1\uffff\1\16",
            "\1\35\22\uffff\2\16\12\uffff\1\2\1\uffff\1\16",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "592:1: rule__Expr__Alternatives : ( ( ( rule__Expr__ExprSimpleAssignment_0 ) ) | ( ( rule__Expr__ExpEtAssignment_1 ) ) | ( ( rule__Expr__ExpTerminaleAssignment_2 ) ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_10 = input.LA(1);

                         
                        int index4_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 32;}

                        else if ( (synpred9_InternalMyDsl()) ) {s = 2;}

                         
                        input.seek(index4_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_11 = input.LA(1);

                         
                        int index4_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 32;}

                        else if ( (synpred9_InternalMyDsl()) ) {s = 2;}

                         
                        input.seek(index4_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_12 = input.LA(1);

                         
                        int index4_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 32;}

                        else if ( (synpred9_InternalMyDsl()) ) {s = 2;}

                         
                        input.seek(index4_12);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_13 = input.LA(1);

                         
                        int index4_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 32;}

                        else if ( (synpred9_InternalMyDsl()) ) {s = 2;}

                         
                        input.seek(index4_13);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_17 = input.LA(1);

                         
                        int index4_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 2;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index4_17);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_20 = input.LA(1);

                         
                        int index4_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 2;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index4_20);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_29 = input.LA(1);

                         
                        int index4_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 2;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index4_29);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA5_eotS =
        "\15\uffff";
    static final String DFA5_eofS =
        "\15\uffff";
    static final String DFA5_minS =
        "\2\5\13\uffff";
    static final String DFA5_maxS =
        "\2\46\13\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\1\6\uffff\1\2\3\uffff";
    static final String DFA5_specialS =
        "\15\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\2\35\uffff\1\1\1\uffff\1\2",
            "\2\11\7\uffff\4\2\22\uffff\1\11\1\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "620:1: rule__Eq__Alternatives : ( ( ( rule__Eq__Group_0__0 ) ) | ( ( rule__Eq__Group_1__0 ) ) );";
        }
    }
    static final String DFA25_eotS =
        "\24\uffff";
    static final String DFA25_eofS =
        "\1\1\3\uffff\1\1\17\uffff";
    static final String DFA25_minS =
        "\1\4\3\uffff\1\5\17\uffff";
    static final String DFA25_maxS =
        "\1\45\3\uffff\1\53\17\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\2\5\uffff\1\1\14\uffff";
    static final String DFA25_specialS =
        "\24\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\4\22\uffff\2\1\14\uffff\1\1",
            "",
            "",
            "",
            "\2\1\16\uffff\1\1\5\uffff\6\1\1\7\2\uffff\1\1\1\uffff\1\1\4"+
            "\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "()* loopback of 3801:1: ( rule__And__Group_1__0 )*";
        }
    }
    static final String DFA26_eotS =
        "\25\uffff";
    static final String DFA26_eofS =
        "\1\1\1\uffff\1\1\22\uffff";
    static final String DFA26_minS =
        "\1\4\1\uffff\1\5\22\uffff";
    static final String DFA26_maxS =
        "\1\45\1\uffff\1\53\22\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\2\13\uffff\1\1\7\uffff";
    static final String DFA26_specialS =
        "\25\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\2\22\uffff\2\1\14\uffff\1\1",
            "",
            "\2\1\16\uffff\1\1\5\uffff\7\1\1\15\1\uffff\1\1\1\uffff\1\1"+
            "\4\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "()* loopback of 3987:1: ( rule__Or__Group_1__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel76 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel109 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_ruleFunction170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefiniton_in_entryRuleDefiniton197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefiniton204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__0_in_ruleDefiniton230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0_in_ruleInput290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutput324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__0_in_ruleOutput350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_entryRuleCommands377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommands384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group__0_in_ruleCommands410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_entryRuleVars437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVars444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__0_in_ruleVars470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_entryRuleExprs497 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprs504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__0_in_ruleExprs530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand557 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Alternatives_in_ruleCommand590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Alternatives_in_ruleExpr650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0_in_ruleAnd710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0_in_ruleOr770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_entryRuleNot797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNot804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__Group__0_in_ruleNot830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEq_in_entryRuleEq857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEq864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Alternatives_in_ruleEq890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_entryRuleExprTerm917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprTerm924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTerm__Alternatives_in_ruleExprTerm950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_entryRuleExprSimple977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprSimple984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__0_in_ruleExprSimple1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLexpr_in_entryRuleLexpr1037 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLexpr1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lexpr__Group__0_in_ruleLexpr1072 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Lexpr__Group__0_in_ruleLexpr1084 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Command__Group_0__0_in_rule__Command__Alternatives1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__0_in_rule__Command__Alternatives1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__0_in_rule__Command__Alternatives1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__0_in_rule__Command__Alternatives1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__0_in_rule__Command__Alternatives1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__0_in_rule__Command__Alternatives1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExprSimpleAssignment_0_in_rule__Expr__Alternatives1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExpEtAssignment_1_in_rule__Expr__Alternatives1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExpTerminaleAssignment_2_in_rule__Expr__Alternatives1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__0_in_rule__Eq__Alternatives1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__0_in_rule__Eq__Alternatives1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Eq__ExprEq1Alternatives_0_0_01366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_rule__Eq__ExprEq1Alternatives_0_0_01383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Eq__ExprEq2Alternatives_0_4_01415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_rule__Eq__ExprEq2Alternatives_0_4_01432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_rule__Eq__ExpAlternatives_1_1_01464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Eq__ExpAlternatives_1_1_01481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTerm__Group_0__0_in_rule__ExprTerm__Alternatives1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTerm__TermVarAssignment_1_in_rule__ExprTerm__Alternatives1531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTerm__TermSymAssignment_2_in_rule__ExprTerm__Alternatives1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_0__0_in_rule__ExprSimple__Alternatives_11582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__0_in_rule__ExprSimple__Alternatives_11600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ExprSimple__MotAlternatives_1_0_0_01634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ExprSimple__MotAlternatives_1_0_0_01654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ExprSimple__MotAlternatives_1_1_0_01689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ExprSimple__MotAlternatives_1_1_0_01709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ModelAssignment_0_in_rule__Model__Group__0__Impl1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Model__Group__1__Impl1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__01864 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__01867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Function__Group__0__Impl1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__11926 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__11929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Function__Group__1__Impl1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__21985 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__21988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__FunNameAssignment_2_in_rule__Function__Group__2__Impl2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__32045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__32048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Function__Group__3__Impl2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__42107 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Function__Group__5_in_rule__Function__Group__42110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Function__Group__4__Impl2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__52166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__DefAssignment_5_in_rule__Function__Group__5__Impl2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__0__Impl_in_rule__Definiton__Group__02235 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definiton__Group__1_in_rule__Definiton__Group__02238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Definiton__Group__0__Impl2266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__1__Impl_in_rule__Definiton__Group__12297 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Definiton__Group__2_in_rule__Definiton__Group__12300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Definiton__Group__1__Impl2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__2__Impl_in_rule__Definiton__Group__22356 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definiton__Group__3_in_rule__Definiton__Group__22359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__InputVarsAssignment_2_in_rule__Definiton__Group__2__Impl2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__3__Impl_in_rule__Definiton__Group__32416 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Definiton__Group__4_in_rule__Definiton__Group__32419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Definiton__Group__3__Impl2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__4__Impl_in_rule__Definiton__Group__42475 = new BitSet(new long[]{0x0000078002000040L});
    public static final BitSet FOLLOW_rule__Definiton__Group__5_in_rule__Definiton__Group__42478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Definiton__Group__4__Impl2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__5__Impl_in_rule__Definiton__Group__52537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definiton__Group__6_in_rule__Definiton__Group__52540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__CommandListAssignment_5_in_rule__Definiton__Group__5__Impl2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__6__Impl_in_rule__Definiton__Group__62597 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Definiton__Group__7_in_rule__Definiton__Group__62600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Definiton__Group__6__Impl2627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__7__Impl_in_rule__Definiton__Group__72656 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Definiton__Group__8_in_rule__Definiton__Group__72659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Definiton__Group__7__Impl2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__8__Impl_in_rule__Definiton__Group__82718 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definiton__Group__9_in_rule__Definiton__Group__82721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Definiton__Group__8__Impl2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__9__Impl_in_rule__Definiton__Group__92780 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Definiton__Group__10_in_rule__Definiton__Group__92783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Definiton__Group__9__Impl2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__10__Impl_in_rule__Definiton__Group__102839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__OutputVarsAssignment_10_in_rule__Definiton__Group__10__Impl2866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__02918 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Input__Group__1_in_rule__Input__Group__02921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__VAssignment_0_in_rule__Input__Group__0__Impl2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__12978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__0_in_rule__Input__Group__1__Impl3005 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__0__Impl_in_rule__Input__Group_1__03040 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Input__Group_1__1_in_rule__Input__Group_1__03043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Input__Group_1__0__Impl3071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__1__Impl_in_rule__Input__Group_1__13102 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Input__Group_1__2_in_rule__Input__Group_1__13105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Input__Group_1__1__Impl3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__2__Impl_in_rule__Input__Group_1__23164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__V2Assignment_1_2_in_rule__Input__Group_1__2__Impl3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__03227 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Output__Group__1_in_rule__Output__Group__03230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__VAssignment_0_in_rule__Output__Group__0__Impl3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__13287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__0_in_rule__Output__Group__1__Impl3314 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__0__Impl_in_rule__Output__Group_1__03349 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Output__Group_1__1_in_rule__Output__Group_1__03352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Output__Group_1__0__Impl3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__1__Impl_in_rule__Output__Group_1__13411 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Output__Group_1__2_in_rule__Output__Group_1__13414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Output__Group_1__1__Impl3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__2__Impl_in_rule__Output__Group_1__23473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__V2Assignment_1_2_in_rule__Output__Group_1__2__Impl3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group__0__Impl_in_rule__Commands__Group__03536 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Commands__Group__1_in_rule__Commands__Group__03539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__CAssignment_0_in_rule__Commands__Group__0__Impl3566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group__1__Impl_in_rule__Commands__Group__13596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__0_in_rule__Commands__Group__1__Impl3623 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__0__Impl_in_rule__Commands__Group_1__03658 = new BitSet(new long[]{0x0000078002000050L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__1_in_rule__Commands__Group_1__03661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Commands__Group_1__0__Impl3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__1__Impl_in_rule__Commands__Group_1__13720 = new BitSet(new long[]{0x0000078002000050L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__2_in_rule__Commands__Group_1__13723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Commands__Group_1__1__Impl3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__2__Impl_in_rule__Commands__Group_1__23782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__CAssignment_1_2_in_rule__Commands__Group_1__2__Impl3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__03845 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__03848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__V1Assignment_0_in_rule__Vars__Group__0__Impl3875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__13905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__0_in_rule__Vars__Group__1__Impl3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__0__Impl_in_rule__Vars__Group_1__03967 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__1_in_rule__Vars__Group_1__03970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Vars__Group_1__0__Impl3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__1__Impl_in_rule__Vars__Group_1__14029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__V2Assignment_1_1_in_rule__Vars__Group_1__1__Impl4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__04090 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__04093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__ExpAssignment_0_in_rule__Exprs__Group__0__Impl4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__14150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__0_in_rule__Exprs__Group__1__Impl4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__0__Impl_in_rule__Exprs__Group_1__04212 = new BitSet(new long[]{0x0000085000000060L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__1_in_rule__Exprs__Group_1__04215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Exprs__Group_1__0__Impl4243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__1__Impl_in_rule__Exprs__Group_1__14274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__ExpLAssignment_1_1_in_rule__Exprs__Group_1__1__Impl4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_0__0__Impl_in_rule__Command__Group_0__04335 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Command__Group_0__1_in_rule__Command__Group_0__04338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_0__1__Impl_in_rule__Command__Group_0__14396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Command__Group_0__1__Impl4424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__0__Impl_in_rule__Command__Group_1__04459 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Command__Group_1__1_in_rule__Command__Group_1__04462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__VarLAssignment_1_0_in_rule__Command__Group_1__0__Impl4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__1__Impl_in_rule__Command__Group_1__14519 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Command__Group_1__2_in_rule__Command__Group_1__14522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_1__1__Impl4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__2__Impl_in_rule__Command__Group_1__24581 = new BitSet(new long[]{0x0000085000000070L});
    public static final BitSet FOLLOW_rule__Command__Group_1__3_in_rule__Command__Group_1__24584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Command__Group_1__2__Impl4612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__3__Impl_in_rule__Command__Group_1__34643 = new BitSet(new long[]{0x0000085000000070L});
    public static final BitSet FOLLOW_rule__Command__Group_1__4_in_rule__Command__Group_1__34646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_1__3__Impl4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__4__Impl_in_rule__Command__Group_1__44705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExpLAssignment_1_4_in_rule__Command__Group_1__4__Impl4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__0__Impl_in_rule__Command__Group_2__04772 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_2__1_in_rule__Command__Group_2__04775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NomAssignment_2_0_in_rule__Command__Group_2__0__Impl4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__1__Impl_in_rule__Command__Group_2__14832 = new BitSet(new long[]{0x0000085000000060L});
    public static final BitSet FOLLOW_rule__Command__Group_2__2_in_rule__Command__Group_2__14835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_2__1__Impl4862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__2__Impl_in_rule__Command__Group_2__24891 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_2__3_in_rule__Command__Group_2__24894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExpAssignment_2_2_in_rule__Command__Group_2__2__Impl4921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__3__Impl_in_rule__Command__Group_2__34951 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Command__Group_2__4_in_rule__Command__Group_2__34954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_2__3__Impl4981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__4__Impl_in_rule__Command__Group_2__45010 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_2__5_in_rule__Command__Group_2__45013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Command__Group_2__4__Impl5041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__5__Impl_in_rule__Command__Group_2__55072 = new BitSet(new long[]{0x0000078002000040L});
    public static final BitSet FOLLOW_rule__Command__Group_2__6_in_rule__Command__Group_2__55075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_2__5__Impl5102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__6__Impl_in_rule__Command__Group_2__65131 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_2__7_in_rule__Command__Group_2__65134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__C1Assignment_2_6_in_rule__Command__Group_2__6__Impl5161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__7__Impl_in_rule__Command__Group_2__75191 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Command__Group_2__8_in_rule__Command__Group_2__75194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_2__7__Impl5221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__8__Impl_in_rule__Command__Group_2__85250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Command__Group_2__8__Impl5278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__0__Impl_in_rule__Command__Group_3__05327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_3__1_in_rule__Command__Group_3__05330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NomAssignment_3_0_in_rule__Command__Group_3__0__Impl5357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__1__Impl_in_rule__Command__Group_3__15387 = new BitSet(new long[]{0x0000085000000060L});
    public static final BitSet FOLLOW_rule__Command__Group_3__2_in_rule__Command__Group_3__15390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_3__1__Impl5417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__2__Impl_in_rule__Command__Group_3__25446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_3__3_in_rule__Command__Group_3__25449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExpAssignment_3_2_in_rule__Command__Group_3__2__Impl5476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__3__Impl_in_rule__Command__Group_3__35506 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Command__Group_3__4_in_rule__Command__Group_3__35509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_3__3__Impl5536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__4__Impl_in_rule__Command__Group_3__45565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_3__5_in_rule__Command__Group_3__45568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Command__Group_3__4__Impl5596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__5__Impl_in_rule__Command__Group_3__55627 = new BitSet(new long[]{0x0000078002000040L});
    public static final BitSet FOLLOW_rule__Command__Group_3__6_in_rule__Command__Group_3__55630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_3__5__Impl5657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__6__Impl_in_rule__Command__Group_3__65686 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_3__7_in_rule__Command__Group_3__65689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__C1Assignment_3_6_in_rule__Command__Group_3__6__Impl5716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__7__Impl_in_rule__Command__Group_3__75746 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Command__Group_3__8_in_rule__Command__Group_3__75749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_3__7__Impl5776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__8__Impl_in_rule__Command__Group_3__85805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Command__Group_3__8__Impl5833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__0__Impl_in_rule__Command__Group_4__05882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_4__1_in_rule__Command__Group_4__05885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NomAssignment_4_0_in_rule__Command__Group_4__0__Impl5912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__1__Impl_in_rule__Command__Group_4__15942 = new BitSet(new long[]{0x0000085000000060L});
    public static final BitSet FOLLOW_rule__Command__Group_4__2_in_rule__Command__Group_4__15945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__1__Impl5972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__2__Impl_in_rule__Command__Group_4__26001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_4__3_in_rule__Command__Group_4__26004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Exp1Assignment_4_2_in_rule__Command__Group_4__2__Impl6031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__3__Impl_in_rule__Command__Group_4__36061 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Command__Group_4__4_in_rule__Command__Group_4__36064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__3__Impl6091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__4__Impl_in_rule__Command__Group_4__46120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_4__5_in_rule__Command__Group_4__46123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Command__Group_4__4__Impl6151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__5__Impl_in_rule__Command__Group_4__56182 = new BitSet(new long[]{0x0000085000000060L});
    public static final BitSet FOLLOW_rule__Command__Group_4__6_in_rule__Command__Group_4__56185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__5__Impl6212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__6__Impl_in_rule__Command__Group_4__66241 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_4__7_in_rule__Command__Group_4__66244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Exp2Assignment_4_6_in_rule__Command__Group_4__6__Impl6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__7__Impl_in_rule__Command__Group_4__76301 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Command__Group_4__8_in_rule__Command__Group_4__76304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__7__Impl6331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__8__Impl_in_rule__Command__Group_4__86360 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_4__9_in_rule__Command__Group_4__86363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Command__Group_4__8__Impl6391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__9__Impl_in_rule__Command__Group_4__96422 = new BitSet(new long[]{0x0000078002000040L});
    public static final BitSet FOLLOW_rule__Command__Group_4__10_in_rule__Command__Group_4__96425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__9__Impl6452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__10__Impl_in_rule__Command__Group_4__106481 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_4__11_in_rule__Command__Group_4__106484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__C1Assignment_4_10_in_rule__Command__Group_4__10__Impl6511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__11__Impl_in_rule__Command__Group_4__116541 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Command__Group_4__12_in_rule__Command__Group_4__116544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__11__Impl6571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__12__Impl_in_rule__Command__Group_4__126600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Command__Group_4__12__Impl6628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__0__Impl_in_rule__Command__Group_5__06685 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_5__1_in_rule__Command__Group_5__06688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NomAssignment_5_0_in_rule__Command__Group_5__0__Impl6715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__1__Impl_in_rule__Command__Group_5__16745 = new BitSet(new long[]{0x0000085000000060L});
    public static final BitSet FOLLOW_rule__Command__Group_5__2_in_rule__Command__Group_5__16748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5__1__Impl6775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__2__Impl_in_rule__Command__Group_5__26804 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_5__3_in_rule__Command__Group_5__26807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExpAssignment_5_2_in_rule__Command__Group_5__2__Impl6834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__3__Impl_in_rule__Command__Group_5__36864 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Command__Group_5__4_in_rule__Command__Group_5__36867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5__3__Impl6894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__4__Impl_in_rule__Command__Group_5__46923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_5__5_in_rule__Command__Group_5__46926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Command__Group_5__4__Impl6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__5__Impl_in_rule__Command__Group_5__56985 = new BitSet(new long[]{0x0000078002000040L});
    public static final BitSet FOLLOW_rule__Command__Group_5__6_in_rule__Command__Group_5__56988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5__5__Impl7015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__6__Impl_in_rule__Command__Group_5__67044 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_5__7_in_rule__Command__Group_5__67047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__C1Assignment_5_6_in_rule__Command__Group_5__6__Impl7074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__7__Impl_in_rule__Command__Group_5__77104 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__Command__Group_5__8_in_rule__Command__Group_5__77107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5__7__Impl7134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__8__Impl_in_rule__Command__Group_5__87163 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__Command__Group_5__9_in_rule__Command__Group_5__87166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__0_in_rule__Command__Group_5__8__Impl7193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__9__Impl_in_rule__Command__Group_5__97224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Command__Group_5__9__Impl7252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__0__Impl_in_rule__Command__Group_5_8__07303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__1_in_rule__Command__Group_5_8__07306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Command__Group_5_8__0__Impl7334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__1__Impl_in_rule__Command__Group_5_8__17365 = new BitSet(new long[]{0x0000078002000040L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__2_in_rule__Command__Group_5_8__17368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5_8__1__Impl7395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__2__Impl_in_rule__Command__Group_5_8__27424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__3_in_rule__Command__Group_5_8__27427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__C2Assignment_5_8_2_in_rule__Command__Group_5_8__2__Impl7454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__3__Impl_in_rule__Command__Group_5_8__37484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5_8__3__Impl7511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__07548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__07551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__ExpOuAssignment_0_in_rule__And__Group__0__Impl7578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__17608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl7635 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__07670 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__07673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__And__Group_1__0__Impl7700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__17729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__17732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__And__Group_1__1__Impl7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__27791 = new BitSet(new long[]{0x0000085000000060L});
    public static final BitSet FOLLOW_rule__And__Group_1__3_in_rule__And__Group_1__27794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__And__Group_1__2__Impl7821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__3__Impl_in_rule__And__Group_1__37850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__ExpOu2Assignment_1_3_in_rule__And__Group_1__3__Impl7877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__07915 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__07918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__ExpNonAssignment_0_in_rule__Or__Group__0__Impl7945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__17975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl8002 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__08037 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__08040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Or__Group_1__0__Impl8067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__18096 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__18099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Or__Group_1__1__Impl8127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__28158 = new BitSet(new long[]{0x0000085000000060L});
    public static final BitSet FOLLOW_rule__Or__Group_1__3_in_rule__Or__Group_1__28161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Or__Group_1__2__Impl8188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__3__Impl_in_rule__Or__Group_1__38217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__ExpNon2Assignment_1_3_in_rule__Or__Group_1__3__Impl8244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__Group__0__Impl_in_rule__Not__Group__08282 = new BitSet(new long[]{0x0000085000000060L});
    public static final BitSet FOLLOW_rule__Not__Group__1_in_rule__Not__Group__08285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__Group_0__0_in_rule__Not__Group__0__Impl8312 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Not__Group__1__Impl_in_rule__Not__Group__18343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__ExpEqAssignment_1_in_rule__Not__Group__1__Impl8370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__Group_0__0__Impl_in_rule__Not__Group_0__08404 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Not__Group_0__1_in_rule__Not__Group_0__08407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__NonAssignment_0_0_in_rule__Not__Group_0__0__Impl8434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__Group_0__1__Impl_in_rule__Not__Group_0__18464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Not__Group_0__1__Impl8491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__0__Impl_in_rule__Eq__Group_0__08524 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__1_in_rule__Eq__Group_0__08527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__ExprEq1Assignment_0_0_in_rule__Eq__Group_0__0__Impl8554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__1__Impl_in_rule__Eq__Group_0__18584 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__2_in_rule__Eq__Group_0__18587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Eq__Group_0__1__Impl8615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__2__Impl_in_rule__Eq__Group_0__28646 = new BitSet(new long[]{0x0000005000000070L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__3_in_rule__Eq__Group_0__28649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Eq__Group_0__2__Impl8677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__3__Impl_in_rule__Eq__Group_0__38708 = new BitSet(new long[]{0x0000005000000070L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__4_in_rule__Eq__Group_0__38711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Eq__Group_0__3__Impl8739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__4__Impl_in_rule__Eq__Group_0__48770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__ExprEq2Assignment_0_4_in_rule__Eq__Group_0__4__Impl8797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__0__Impl_in_rule__Eq__Group_1__08837 = new BitSet(new long[]{0x0000005000000060L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__1_in_rule__Eq__Group_1__08840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Eq__Group_1__0__Impl8868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__1__Impl_in_rule__Eq__Group_1__18899 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__2_in_rule__Eq__Group_1__18902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__ExpAssignment_1_1_in_rule__Eq__Group_1__1__Impl8929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__2__Impl_in_rule__Eq__Group_1__28959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Eq__Group_1__2__Impl8987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTerm__Group_0__0__Impl_in_rule__ExprTerm__Group_0__09024 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ExprTerm__Group_0__1_in_rule__ExprTerm__Group_0__09027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTerm__Group_0__1__Impl_in_rule__ExprTerm__Group_0__19085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ExprTerm__Group_0__1__Impl9113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__0__Impl_in_rule__ExprSimple__Group__09148 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__1_in_rule__ExprSimple__Group__09151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ExprSimple__Group__0__Impl9179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__1__Impl_in_rule__ExprSimple__Group__19210 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__2_in_rule__ExprSimple__Group__19213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Alternatives_1_in_rule__ExprSimple__Group__1__Impl9240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__2__Impl_in_rule__ExprSimple__Group__29270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ExprSimple__Group__2__Impl9298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_0__0__Impl_in_rule__ExprSimple__Group_1_0__09335 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_0__1_in_rule__ExprSimple__Group_1_0__09338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__MotAssignment_1_0_0_in_rule__ExprSimple__Group_1_0__0__Impl9365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_0__1__Impl_in_rule__ExprSimple__Group_1_0__19395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__LexprAssignment_1_0_1_in_rule__ExprSimple__Group_1_0__1__Impl9422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__0__Impl_in_rule__ExprSimple__Group_1_1__09456 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__1_in_rule__ExprSimple__Group_1_1__09459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__MotAssignment_1_1_0_in_rule__ExprSimple__Group_1_1__0__Impl9486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__1__Impl_in_rule__ExprSimple__Group_1_1__19516 = new BitSet(new long[]{0x0000085000000060L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__2_in_rule__ExprSimple__Group_1_1__19519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__ExprSimple__Group_1_1__1__Impl9546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__2__Impl_in_rule__ExprSimple__Group_1_1__29575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprAssignment_1_1_2_in_rule__ExprSimple__Group_1_1__2__Impl9602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lexpr__Group__0__Impl_in_rule__Lexpr__Group__09638 = new BitSet(new long[]{0x0000085000000060L});
    public static final BitSet FOLLOW_rule__Lexpr__Group__1_in_rule__Lexpr__Group__09641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Lexpr__Group__0__Impl9668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lexpr__Group__1__Impl_in_rule__Lexpr__Group__19697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lexpr__ExpAssignment_1_in_rule__Lexpr__Group__1__Impl9724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__Model__ModelAssignment_09763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOLES_in_rule__Function__FunNameAssignment_29794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefiniton_in_rule__Function__DefAssignment_59825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_rule__Definiton__InputVarsAssignment_29856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Definiton__CommandListAssignment_59887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_rule__Definiton__OutputVarsAssignment_109918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Input__VAssignment_09949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Input__V2Assignment_1_29980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Output__VAssignment_010011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Output__V2Assignment_1_210042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Commands__CAssignment_010073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Commands__CAssignment_1_210104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Vars__V1Assignment_010135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_rule__Vars__V2Assignment_1_110166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Exprs__ExpAssignment_010197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_rule__Exprs__ExpLAssignment_1_110228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_rule__Command__VarLAssignment_1_010259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_rule__Command__ExpLAssignment_1_410290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Command__NomAssignment_2_010326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_2_210365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__C1Assignment_2_610396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Command__NomAssignment_3_010432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_3_210471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__C1Assignment_3_610502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Command__NomAssignment_4_010538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__Exp1Assignment_4_210577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__Exp2Assignment_4_610608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__C1Assignment_4_1010639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Command__NomAssignment_5_010675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_5_210714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__C1Assignment_5_610745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__C2Assignment_5_8_210776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Expr__ExprSimpleAssignment_010807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Expr__ExpEtAssignment_110838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_rule__Expr__ExpTerminaleAssignment_210869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rule__And__ExpOuAssignment_010900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rule__And__ExpOu2Assignment_1_310931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_rule__Or__ExpNonAssignment_010962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_rule__Or__ExpNon2Assignment_1_310993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Not__NonAssignment_0_011029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEq_in_rule__Not__ExpEqAssignment_111068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__ExprEq1Alternatives_0_0_0_in_rule__Eq__ExprEq1Assignment_0_011099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__ExprEq2Alternatives_0_4_0_in_rule__Eq__ExprEq2Assignment_0_411132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__ExpAlternatives_1_1_0_in_rule__Eq__ExpAssignment_1_111165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__ExprTerm__TermVarAssignment_111198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOLES_in_rule__ExprTerm__TermSymAssignment_211229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__MotAlternatives_1_0_0_0_in_rule__ExprSimple__MotAssignment_1_0_011260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLexpr_in_rule__ExprSimple__LexprAssignment_1_0_111293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__MotAlternatives_1_1_0_0_in_rule__ExprSimple__MotAssignment_1_1_011324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprSimple__ExprAssignment_1_1_211357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Lexpr__ExpAssignment_111388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExprSimpleAssignment_0_in_synpred8_InternalMyDsl1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExpEtAssignment_1_in_synpred9_InternalMyDsl1264 = new BitSet(new long[]{0x0000000000000002L});

}