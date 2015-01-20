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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1915:1: rule__Vars__Group__1__Impl : ( ( rule__Vars__Group_1__0 )* ) ;
    public final void rule__Vars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1919:1: ( ( ( rule__Vars__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1920:1: ( ( rule__Vars__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1920:1: ( ( rule__Vars__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1921:1: ( rule__Vars__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:1: ( rule__Vars__Group_1__0 )*
            loop20:
            do {
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

            	default :
            	    break loop20;
                }
            } while (true);

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1967:1: rule__Vars__Group_1__1 : rule__Vars__Group_1__1__Impl rule__Vars__Group_1__2 ;
    public final void rule__Vars__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1971:1: ( rule__Vars__Group_1__1__Impl rule__Vars__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1972:2: rule__Vars__Group_1__1__Impl rule__Vars__Group_1__2
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__1__Impl_in_rule__Vars__Group_1__14029);
            rule__Vars__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group_1__2_in_rule__Vars__Group_1__14032);
            rule__Vars__Group_1__2();

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1979:1: rule__Vars__Group_1__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Vars__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1983:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getLCTerminalRuleCall_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1986:1: ( RULE_LC )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_LC) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1986:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Vars__Group_1__1__Impl4060); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getLCTerminalRuleCall_1_1()); 
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


    // $ANTLR start "rule__Vars__Group_1__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1996:1: rule__Vars__Group_1__2 : rule__Vars__Group_1__2__Impl ;
    public final void rule__Vars__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2000:1: ( rule__Vars__Group_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2001:2: rule__Vars__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__2__Impl_in_rule__Vars__Group_1__24091);
            rule__Vars__Group_1__2__Impl();

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
    // $ANTLR end "rule__Vars__Group_1__2"


    // $ANTLR start "rule__Vars__Group_1__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2007:1: rule__Vars__Group_1__2__Impl : ( ( rule__Vars__V2Assignment_1_2 ) ) ;
    public final void rule__Vars__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2011:1: ( ( ( rule__Vars__V2Assignment_1_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2012:1: ( ( rule__Vars__V2Assignment_1_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2012:1: ( ( rule__Vars__V2Assignment_1_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:1: ( rule__Vars__V2Assignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getV2Assignment_1_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2014:1: ( rule__Vars__V2Assignment_1_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2014:2: rule__Vars__V2Assignment_1_2
            {
            pushFollow(FOLLOW_rule__Vars__V2Assignment_1_2_in_rule__Vars__Group_1__2__Impl4118);
            rule__Vars__V2Assignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getV2Assignment_1_2()); 
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
    // $ANTLR end "rule__Vars__Group_1__2__Impl"


    // $ANTLR start "rule__Exprs__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2030:1: rule__Exprs__Group__0 : rule__Exprs__Group__0__Impl rule__Exprs__Group__1 ;
    public final void rule__Exprs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2034:1: ( rule__Exprs__Group__0__Impl rule__Exprs__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2035:2: rule__Exprs__Group__0__Impl rule__Exprs__Group__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__04154);
            rule__Exprs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__04157);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2042:1: rule__Exprs__Group__0__Impl : ( ( rule__Exprs__ExpAssignment_0 ) ) ;
    public final void rule__Exprs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2046:1: ( ( ( rule__Exprs__ExpAssignment_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2047:1: ( ( rule__Exprs__ExpAssignment_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2047:1: ( ( rule__Exprs__ExpAssignment_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2048:1: ( rule__Exprs__ExpAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpAssignment_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2049:1: ( rule__Exprs__ExpAssignment_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2049:2: rule__Exprs__ExpAssignment_0
            {
            pushFollow(FOLLOW_rule__Exprs__ExpAssignment_0_in_rule__Exprs__Group__0__Impl4184);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2059:1: rule__Exprs__Group__1 : rule__Exprs__Group__1__Impl ;
    public final void rule__Exprs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2063:1: ( rule__Exprs__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2064:2: rule__Exprs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__14214);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2070:1: rule__Exprs__Group__1__Impl : ( ( rule__Exprs__Group_1__0 )* ) ;
    public final void rule__Exprs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2074:1: ( ( ( rule__Exprs__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2075:1: ( ( rule__Exprs__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2075:1: ( ( rule__Exprs__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2076:1: ( rule__Exprs__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2077:1: ( rule__Exprs__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==23) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2077:2: rule__Exprs__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Exprs__Group_1__0_in_rule__Exprs__Group__1__Impl4241);
            	    rule__Exprs__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2091:1: rule__Exprs__Group_1__0 : rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1 ;
    public final void rule__Exprs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2095:1: ( rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2096:2: rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group_1__0__Impl_in_rule__Exprs__Group_1__04276);
            rule__Exprs__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group_1__1_in_rule__Exprs__Group_1__04279);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2103:1: rule__Exprs__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Exprs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2107:1: ( ( ',' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2108:1: ( ',' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2108:1: ( ',' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2109:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getCommaKeyword_1_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Exprs__Group_1__0__Impl4307); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2122:1: rule__Exprs__Group_1__1 : rule__Exprs__Group_1__1__Impl rule__Exprs__Group_1__2 ;
    public final void rule__Exprs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2126:1: ( rule__Exprs__Group_1__1__Impl rule__Exprs__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2127:2: rule__Exprs__Group_1__1__Impl rule__Exprs__Group_1__2
            {
            pushFollow(FOLLOW_rule__Exprs__Group_1__1__Impl_in_rule__Exprs__Group_1__14338);
            rule__Exprs__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group_1__2_in_rule__Exprs__Group_1__14341);
            rule__Exprs__Group_1__2();

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2134:1: rule__Exprs__Group_1__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Exprs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2138:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2139:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2139:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2140:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getLCTerminalRuleCall_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2141:1: ( RULE_LC )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_LC) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2141:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Exprs__Group_1__1__Impl4369); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getLCTerminalRuleCall_1_1()); 
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


    // $ANTLR start "rule__Exprs__Group_1__2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2151:1: rule__Exprs__Group_1__2 : rule__Exprs__Group_1__2__Impl ;
    public final void rule__Exprs__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2155:1: ( rule__Exprs__Group_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2156:2: rule__Exprs__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group_1__2__Impl_in_rule__Exprs__Group_1__24400);
            rule__Exprs__Group_1__2__Impl();

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
    // $ANTLR end "rule__Exprs__Group_1__2"


    // $ANTLR start "rule__Exprs__Group_1__2__Impl"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2162:1: rule__Exprs__Group_1__2__Impl : ( ( rule__Exprs__ExpLAssignment_1_2 ) ) ;
    public final void rule__Exprs__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2166:1: ( ( ( rule__Exprs__ExpLAssignment_1_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2167:1: ( ( rule__Exprs__ExpLAssignment_1_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2167:1: ( ( rule__Exprs__ExpLAssignment_1_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2168:1: ( rule__Exprs__ExpLAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpLAssignment_1_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2169:1: ( rule__Exprs__ExpLAssignment_1_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2169:2: rule__Exprs__ExpLAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Exprs__ExpLAssignment_1_2_in_rule__Exprs__Group_1__2__Impl4427);
            rule__Exprs__ExpLAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExpLAssignment_1_2()); 
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
    // $ANTLR end "rule__Exprs__Group_1__2__Impl"


    // $ANTLR start "rule__Command__Group_0__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2185:1: rule__Command__Group_0__0 : rule__Command__Group_0__0__Impl rule__Command__Group_0__1 ;
    public final void rule__Command__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2189:1: ( rule__Command__Group_0__0__Impl rule__Command__Group_0__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2190:2: rule__Command__Group_0__0__Impl rule__Command__Group_0__1
            {
            pushFollow(FOLLOW_rule__Command__Group_0__0__Impl_in_rule__Command__Group_0__04463);
            rule__Command__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_0__1_in_rule__Command__Group_0__04466);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2197:1: rule__Command__Group_0__0__Impl : ( () ) ;
    public final void rule__Command__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2201:1: ( ( () ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2202:1: ( () )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2202:1: ( () )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2203:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCommandAction_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2204:1: ()
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2206:1: 
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2216:1: rule__Command__Group_0__1 : rule__Command__Group_0__1__Impl ;
    public final void rule__Command__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2220:1: ( rule__Command__Group_0__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2221:2: rule__Command__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_0__1__Impl_in_rule__Command__Group_0__14524);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2227:1: rule__Command__Group_0__1__Impl : ( 'nop' ) ;
    public final void rule__Command__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:1: ( ( 'nop' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2232:1: ( 'nop' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2232:1: ( 'nop' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2233:1: 'nop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNopKeyword_0_1()); 
            }
            match(input,25,FOLLOW_25_in_rule__Command__Group_0__1__Impl4552); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2250:1: rule__Command__Group_1__0 : rule__Command__Group_1__0__Impl rule__Command__Group_1__1 ;
    public final void rule__Command__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2254:1: ( rule__Command__Group_1__0__Impl rule__Command__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2255:2: rule__Command__Group_1__0__Impl rule__Command__Group_1__1
            {
            pushFollow(FOLLOW_rule__Command__Group_1__0__Impl_in_rule__Command__Group_1__04587);
            rule__Command__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__1_in_rule__Command__Group_1__04590);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2262:1: rule__Command__Group_1__0__Impl : ( ( rule__Command__VarLAssignment_1_0 ) ) ;
    public final void rule__Command__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2266:1: ( ( ( rule__Command__VarLAssignment_1_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2267:1: ( ( rule__Command__VarLAssignment_1_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2267:1: ( ( rule__Command__VarLAssignment_1_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2268:1: ( rule__Command__VarLAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getVarLAssignment_1_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2269:1: ( rule__Command__VarLAssignment_1_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2269:2: rule__Command__VarLAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Command__VarLAssignment_1_0_in_rule__Command__Group_1__0__Impl4617);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:1: rule__Command__Group_1__1 : rule__Command__Group_1__1__Impl rule__Command__Group_1__2 ;
    public final void rule__Command__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2283:1: ( rule__Command__Group_1__1__Impl rule__Command__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2284:2: rule__Command__Group_1__1__Impl rule__Command__Group_1__2
            {
            pushFollow(FOLLOW_rule__Command__Group_1__1__Impl_in_rule__Command__Group_1__14647);
            rule__Command__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__2_in_rule__Command__Group_1__14650);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2291:1: rule__Command__Group_1__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Command__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2295:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2297:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2298:1: ( RULE_LC )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_LC) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2298:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_1__1__Impl4678); if (state.failed) return ;

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2308:1: rule__Command__Group_1__2 : rule__Command__Group_1__2__Impl rule__Command__Group_1__3 ;
    public final void rule__Command__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2312:1: ( rule__Command__Group_1__2__Impl rule__Command__Group_1__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2313:2: rule__Command__Group_1__2__Impl rule__Command__Group_1__3
            {
            pushFollow(FOLLOW_rule__Command__Group_1__2__Impl_in_rule__Command__Group_1__24709);
            rule__Command__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__3_in_rule__Command__Group_1__24712);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2320:1: rule__Command__Group_1__2__Impl : ( ':=' ) ;
    public final void rule__Command__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2324:1: ( ( ':=' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2325:1: ( ':=' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2325:1: ( ':=' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2326:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getColonEqualsSignKeyword_1_2()); 
            }
            match(input,26,FOLLOW_26_in_rule__Command__Group_1__2__Impl4740); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2339:1: rule__Command__Group_1__3 : rule__Command__Group_1__3__Impl rule__Command__Group_1__4 ;
    public final void rule__Command__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2343:1: ( rule__Command__Group_1__3__Impl rule__Command__Group_1__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2344:2: rule__Command__Group_1__3__Impl rule__Command__Group_1__4
            {
            pushFollow(FOLLOW_rule__Command__Group_1__3__Impl_in_rule__Command__Group_1__34771);
            rule__Command__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__4_in_rule__Command__Group_1__34774);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2351:1: rule__Command__Group_1__3__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Command__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2355:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2356:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2356:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2357:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_3()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2358:1: ( RULE_LC )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_LC) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2358:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_1__3__Impl4802); if (state.failed) return ;

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2368:1: rule__Command__Group_1__4 : rule__Command__Group_1__4__Impl ;
    public final void rule__Command__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2372:1: ( rule__Command__Group_1__4__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2373:2: rule__Command__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_1__4__Impl_in_rule__Command__Group_1__44833);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2379:1: rule__Command__Group_1__4__Impl : ( ( rule__Command__ExpLAssignment_1_4 ) ) ;
    public final void rule__Command__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2383:1: ( ( ( rule__Command__ExpLAssignment_1_4 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2384:1: ( ( rule__Command__ExpLAssignment_1_4 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2384:1: ( ( rule__Command__ExpLAssignment_1_4 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2385:1: ( rule__Command__ExpLAssignment_1_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpLAssignment_1_4()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2386:1: ( rule__Command__ExpLAssignment_1_4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2386:2: rule__Command__ExpLAssignment_1_4
            {
            pushFollow(FOLLOW_rule__Command__ExpLAssignment_1_4_in_rule__Command__Group_1__4__Impl4860);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2406:1: rule__Command__Group_2__0 : rule__Command__Group_2__0__Impl rule__Command__Group_2__1 ;
    public final void rule__Command__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2410:1: ( rule__Command__Group_2__0__Impl rule__Command__Group_2__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2411:2: rule__Command__Group_2__0__Impl rule__Command__Group_2__1
            {
            pushFollow(FOLLOW_rule__Command__Group_2__0__Impl_in_rule__Command__Group_2__04900);
            rule__Command__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__1_in_rule__Command__Group_2__04903);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2418:1: rule__Command__Group_2__0__Impl : ( ( rule__Command__NomAssignment_2_0 ) ) ;
    public final void rule__Command__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2422:1: ( ( ( rule__Command__NomAssignment_2_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2423:1: ( ( rule__Command__NomAssignment_2_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2423:1: ( ( rule__Command__NomAssignment_2_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2424:1: ( rule__Command__NomAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomAssignment_2_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2425:1: ( rule__Command__NomAssignment_2_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2425:2: rule__Command__NomAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Command__NomAssignment_2_0_in_rule__Command__Group_2__0__Impl4930);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2435:1: rule__Command__Group_2__1 : rule__Command__Group_2__1__Impl rule__Command__Group_2__2 ;
    public final void rule__Command__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2439:1: ( rule__Command__Group_2__1__Impl rule__Command__Group_2__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2440:2: rule__Command__Group_2__1__Impl rule__Command__Group_2__2
            {
            pushFollow(FOLLOW_rule__Command__Group_2__1__Impl_in_rule__Command__Group_2__14960);
            rule__Command__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__2_in_rule__Command__Group_2__14963);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2447:1: rule__Command__Group_2__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2451:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2452:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2452:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2453:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_2__1__Impl4990); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2464:1: rule__Command__Group_2__2 : rule__Command__Group_2__2__Impl rule__Command__Group_2__3 ;
    public final void rule__Command__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2468:1: ( rule__Command__Group_2__2__Impl rule__Command__Group_2__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2469:2: rule__Command__Group_2__2__Impl rule__Command__Group_2__3
            {
            pushFollow(FOLLOW_rule__Command__Group_2__2__Impl_in_rule__Command__Group_2__25019);
            rule__Command__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__3_in_rule__Command__Group_2__25022);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2476:1: rule__Command__Group_2__2__Impl : ( ( rule__Command__ExpAssignment_2_2 ) ) ;
    public final void rule__Command__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2480:1: ( ( ( rule__Command__ExpAssignment_2_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2481:1: ( ( rule__Command__ExpAssignment_2_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2481:1: ( ( rule__Command__ExpAssignment_2_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2482:1: ( rule__Command__ExpAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpAssignment_2_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:1: ( rule__Command__ExpAssignment_2_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:2: rule__Command__ExpAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Command__ExpAssignment_2_2_in_rule__Command__Group_2__2__Impl5049);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2493:1: rule__Command__Group_2__3 : rule__Command__Group_2__3__Impl rule__Command__Group_2__4 ;
    public final void rule__Command__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:1: ( rule__Command__Group_2__3__Impl rule__Command__Group_2__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2498:2: rule__Command__Group_2__3__Impl rule__Command__Group_2__4
            {
            pushFollow(FOLLOW_rule__Command__Group_2__3__Impl_in_rule__Command__Group_2__35079);
            rule__Command__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__4_in_rule__Command__Group_2__35082);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:1: rule__Command__Group_2__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2509:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2510:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2510:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2511:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_2__3__Impl5109); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2522:1: rule__Command__Group_2__4 : rule__Command__Group_2__4__Impl rule__Command__Group_2__5 ;
    public final void rule__Command__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2526:1: ( rule__Command__Group_2__4__Impl rule__Command__Group_2__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2527:2: rule__Command__Group_2__4__Impl rule__Command__Group_2__5
            {
            pushFollow(FOLLOW_rule__Command__Group_2__4__Impl_in_rule__Command__Group_2__45138);
            rule__Command__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__5_in_rule__Command__Group_2__45141);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2534:1: rule__Command__Group_2__4__Impl : ( 'do' ) ;
    public final void rule__Command__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2538:1: ( ( 'do' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2539:1: ( 'do' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2539:1: ( 'do' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2540:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getDoKeyword_2_4()); 
            }
            match(input,27,FOLLOW_27_in_rule__Command__Group_2__4__Impl5169); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2553:1: rule__Command__Group_2__5 : rule__Command__Group_2__5__Impl rule__Command__Group_2__6 ;
    public final void rule__Command__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2557:1: ( rule__Command__Group_2__5__Impl rule__Command__Group_2__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2558:2: rule__Command__Group_2__5__Impl rule__Command__Group_2__6
            {
            pushFollow(FOLLOW_rule__Command__Group_2__5__Impl_in_rule__Command__Group_2__55200);
            rule__Command__Group_2__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__6_in_rule__Command__Group_2__55203);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2565:1: rule__Command__Group_2__5__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2569:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2570:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2570:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2571:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_5()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_2__5__Impl5230); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2582:1: rule__Command__Group_2__6 : rule__Command__Group_2__6__Impl rule__Command__Group_2__7 ;
    public final void rule__Command__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2586:1: ( rule__Command__Group_2__6__Impl rule__Command__Group_2__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2587:2: rule__Command__Group_2__6__Impl rule__Command__Group_2__7
            {
            pushFollow(FOLLOW_rule__Command__Group_2__6__Impl_in_rule__Command__Group_2__65259);
            rule__Command__Group_2__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__7_in_rule__Command__Group_2__65262);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2594:1: rule__Command__Group_2__6__Impl : ( ( rule__Command__C1Assignment_2_6 ) ) ;
    public final void rule__Command__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2598:1: ( ( ( rule__Command__C1Assignment_2_6 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2599:1: ( ( rule__Command__C1Assignment_2_6 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2599:1: ( ( rule__Command__C1Assignment_2_6 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2600:1: ( rule__Command__C1Assignment_2_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1Assignment_2_6()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2601:1: ( rule__Command__C1Assignment_2_6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2601:2: rule__Command__C1Assignment_2_6
            {
            pushFollow(FOLLOW_rule__Command__C1Assignment_2_6_in_rule__Command__Group_2__6__Impl5289);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2611:1: rule__Command__Group_2__7 : rule__Command__Group_2__7__Impl rule__Command__Group_2__8 ;
    public final void rule__Command__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2615:1: ( rule__Command__Group_2__7__Impl rule__Command__Group_2__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2616:2: rule__Command__Group_2__7__Impl rule__Command__Group_2__8
            {
            pushFollow(FOLLOW_rule__Command__Group_2__7__Impl_in_rule__Command__Group_2__75319);
            rule__Command__Group_2__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__8_in_rule__Command__Group_2__75322);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2623:1: rule__Command__Group_2__7__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2627:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2628:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2628:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2629:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_7()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_2__7__Impl5349); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2640:1: rule__Command__Group_2__8 : rule__Command__Group_2__8__Impl ;
    public final void rule__Command__Group_2__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2644:1: ( rule__Command__Group_2__8__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2645:2: rule__Command__Group_2__8__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_2__8__Impl_in_rule__Command__Group_2__85378);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2651:1: rule__Command__Group_2__8__Impl : ( 'od' ) ;
    public final void rule__Command__Group_2__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2655:1: ( ( 'od' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2656:1: ( 'od' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2656:1: ( 'od' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2657:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getOdKeyword_2_8()); 
            }
            match(input,28,FOLLOW_28_in_rule__Command__Group_2__8__Impl5406); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2688:1: rule__Command__Group_3__0 : rule__Command__Group_3__0__Impl rule__Command__Group_3__1 ;
    public final void rule__Command__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2692:1: ( rule__Command__Group_3__0__Impl rule__Command__Group_3__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2693:2: rule__Command__Group_3__0__Impl rule__Command__Group_3__1
            {
            pushFollow(FOLLOW_rule__Command__Group_3__0__Impl_in_rule__Command__Group_3__05455);
            rule__Command__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__1_in_rule__Command__Group_3__05458);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2700:1: rule__Command__Group_3__0__Impl : ( ( rule__Command__NomAssignment_3_0 ) ) ;
    public final void rule__Command__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2704:1: ( ( ( rule__Command__NomAssignment_3_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2705:1: ( ( rule__Command__NomAssignment_3_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2705:1: ( ( rule__Command__NomAssignment_3_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2706:1: ( rule__Command__NomAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomAssignment_3_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2707:1: ( rule__Command__NomAssignment_3_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2707:2: rule__Command__NomAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Command__NomAssignment_3_0_in_rule__Command__Group_3__0__Impl5485);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2717:1: rule__Command__Group_3__1 : rule__Command__Group_3__1__Impl rule__Command__Group_3__2 ;
    public final void rule__Command__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2721:1: ( rule__Command__Group_3__1__Impl rule__Command__Group_3__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2722:2: rule__Command__Group_3__1__Impl rule__Command__Group_3__2
            {
            pushFollow(FOLLOW_rule__Command__Group_3__1__Impl_in_rule__Command__Group_3__15515);
            rule__Command__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__2_in_rule__Command__Group_3__15518);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2729:1: rule__Command__Group_3__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2733:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2734:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2734:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2735:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_3__1__Impl5545); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2746:1: rule__Command__Group_3__2 : rule__Command__Group_3__2__Impl rule__Command__Group_3__3 ;
    public final void rule__Command__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2750:1: ( rule__Command__Group_3__2__Impl rule__Command__Group_3__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2751:2: rule__Command__Group_3__2__Impl rule__Command__Group_3__3
            {
            pushFollow(FOLLOW_rule__Command__Group_3__2__Impl_in_rule__Command__Group_3__25574);
            rule__Command__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__3_in_rule__Command__Group_3__25577);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2758:1: rule__Command__Group_3__2__Impl : ( ( rule__Command__ExpAssignment_3_2 ) ) ;
    public final void rule__Command__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2762:1: ( ( ( rule__Command__ExpAssignment_3_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2763:1: ( ( rule__Command__ExpAssignment_3_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2763:1: ( ( rule__Command__ExpAssignment_3_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2764:1: ( rule__Command__ExpAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpAssignment_3_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2765:1: ( rule__Command__ExpAssignment_3_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2765:2: rule__Command__ExpAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Command__ExpAssignment_3_2_in_rule__Command__Group_3__2__Impl5604);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2775:1: rule__Command__Group_3__3 : rule__Command__Group_3__3__Impl rule__Command__Group_3__4 ;
    public final void rule__Command__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2779:1: ( rule__Command__Group_3__3__Impl rule__Command__Group_3__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2780:2: rule__Command__Group_3__3__Impl rule__Command__Group_3__4
            {
            pushFollow(FOLLOW_rule__Command__Group_3__3__Impl_in_rule__Command__Group_3__35634);
            rule__Command__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__4_in_rule__Command__Group_3__35637);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2787:1: rule__Command__Group_3__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2791:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2792:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2792:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2793:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_3__3__Impl5664); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2804:1: rule__Command__Group_3__4 : rule__Command__Group_3__4__Impl rule__Command__Group_3__5 ;
    public final void rule__Command__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2808:1: ( rule__Command__Group_3__4__Impl rule__Command__Group_3__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2809:2: rule__Command__Group_3__4__Impl rule__Command__Group_3__5
            {
            pushFollow(FOLLOW_rule__Command__Group_3__4__Impl_in_rule__Command__Group_3__45693);
            rule__Command__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__5_in_rule__Command__Group_3__45696);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2816:1: rule__Command__Group_3__4__Impl : ( 'do' ) ;
    public final void rule__Command__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2820:1: ( ( 'do' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2821:1: ( 'do' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2821:1: ( 'do' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2822:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getDoKeyword_3_4()); 
            }
            match(input,27,FOLLOW_27_in_rule__Command__Group_3__4__Impl5724); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2835:1: rule__Command__Group_3__5 : rule__Command__Group_3__5__Impl rule__Command__Group_3__6 ;
    public final void rule__Command__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2839:1: ( rule__Command__Group_3__5__Impl rule__Command__Group_3__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2840:2: rule__Command__Group_3__5__Impl rule__Command__Group_3__6
            {
            pushFollow(FOLLOW_rule__Command__Group_3__5__Impl_in_rule__Command__Group_3__55755);
            rule__Command__Group_3__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__6_in_rule__Command__Group_3__55758);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2847:1: rule__Command__Group_3__5__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2851:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2852:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2852:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2853:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_5()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_3__5__Impl5785); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2864:1: rule__Command__Group_3__6 : rule__Command__Group_3__6__Impl rule__Command__Group_3__7 ;
    public final void rule__Command__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2868:1: ( rule__Command__Group_3__6__Impl rule__Command__Group_3__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2869:2: rule__Command__Group_3__6__Impl rule__Command__Group_3__7
            {
            pushFollow(FOLLOW_rule__Command__Group_3__6__Impl_in_rule__Command__Group_3__65814);
            rule__Command__Group_3__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__7_in_rule__Command__Group_3__65817);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2876:1: rule__Command__Group_3__6__Impl : ( ( rule__Command__C1Assignment_3_6 ) ) ;
    public final void rule__Command__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2880:1: ( ( ( rule__Command__C1Assignment_3_6 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2881:1: ( ( rule__Command__C1Assignment_3_6 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2881:1: ( ( rule__Command__C1Assignment_3_6 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2882:1: ( rule__Command__C1Assignment_3_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1Assignment_3_6()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2883:1: ( rule__Command__C1Assignment_3_6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2883:2: rule__Command__C1Assignment_3_6
            {
            pushFollow(FOLLOW_rule__Command__C1Assignment_3_6_in_rule__Command__Group_3__6__Impl5844);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2893:1: rule__Command__Group_3__7 : rule__Command__Group_3__7__Impl rule__Command__Group_3__8 ;
    public final void rule__Command__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2897:1: ( rule__Command__Group_3__7__Impl rule__Command__Group_3__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2898:2: rule__Command__Group_3__7__Impl rule__Command__Group_3__8
            {
            pushFollow(FOLLOW_rule__Command__Group_3__7__Impl_in_rule__Command__Group_3__75874);
            rule__Command__Group_3__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__8_in_rule__Command__Group_3__75877);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2905:1: rule__Command__Group_3__7__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2909:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2910:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2910:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2911:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_7()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_3__7__Impl5904); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2922:1: rule__Command__Group_3__8 : rule__Command__Group_3__8__Impl ;
    public final void rule__Command__Group_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2926:1: ( rule__Command__Group_3__8__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:2: rule__Command__Group_3__8__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_3__8__Impl_in_rule__Command__Group_3__85933);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2933:1: rule__Command__Group_3__8__Impl : ( 'od' ) ;
    public final void rule__Command__Group_3__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2937:1: ( ( 'od' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2938:1: ( 'od' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2938:1: ( 'od' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2939:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getOdKeyword_3_8()); 
            }
            match(input,28,FOLLOW_28_in_rule__Command__Group_3__8__Impl5961); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2970:1: rule__Command__Group_4__0 : rule__Command__Group_4__0__Impl rule__Command__Group_4__1 ;
    public final void rule__Command__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2974:1: ( rule__Command__Group_4__0__Impl rule__Command__Group_4__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2975:2: rule__Command__Group_4__0__Impl rule__Command__Group_4__1
            {
            pushFollow(FOLLOW_rule__Command__Group_4__0__Impl_in_rule__Command__Group_4__06010);
            rule__Command__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__1_in_rule__Command__Group_4__06013);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2982:1: rule__Command__Group_4__0__Impl : ( ( rule__Command__NomAssignment_4_0 ) ) ;
    public final void rule__Command__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2986:1: ( ( ( rule__Command__NomAssignment_4_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2987:1: ( ( rule__Command__NomAssignment_4_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2987:1: ( ( rule__Command__NomAssignment_4_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2988:1: ( rule__Command__NomAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomAssignment_4_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2989:1: ( rule__Command__NomAssignment_4_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2989:2: rule__Command__NomAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Command__NomAssignment_4_0_in_rule__Command__Group_4__0__Impl6040);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2999:1: rule__Command__Group_4__1 : rule__Command__Group_4__1__Impl rule__Command__Group_4__2 ;
    public final void rule__Command__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3003:1: ( rule__Command__Group_4__1__Impl rule__Command__Group_4__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3004:2: rule__Command__Group_4__1__Impl rule__Command__Group_4__2
            {
            pushFollow(FOLLOW_rule__Command__Group_4__1__Impl_in_rule__Command__Group_4__16070);
            rule__Command__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__2_in_rule__Command__Group_4__16073);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3011:1: rule__Command__Group_4__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3015:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3016:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3016:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3017:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__1__Impl6100); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3028:1: rule__Command__Group_4__2 : rule__Command__Group_4__2__Impl rule__Command__Group_4__3 ;
    public final void rule__Command__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3032:1: ( rule__Command__Group_4__2__Impl rule__Command__Group_4__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3033:2: rule__Command__Group_4__2__Impl rule__Command__Group_4__3
            {
            pushFollow(FOLLOW_rule__Command__Group_4__2__Impl_in_rule__Command__Group_4__26129);
            rule__Command__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__3_in_rule__Command__Group_4__26132);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3040:1: rule__Command__Group_4__2__Impl : ( ( rule__Command__Exp1Assignment_4_2 ) ) ;
    public final void rule__Command__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3044:1: ( ( ( rule__Command__Exp1Assignment_4_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3045:1: ( ( rule__Command__Exp1Assignment_4_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3045:1: ( ( rule__Command__Exp1Assignment_4_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3046:1: ( rule__Command__Exp1Assignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExp1Assignment_4_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3047:1: ( rule__Command__Exp1Assignment_4_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3047:2: rule__Command__Exp1Assignment_4_2
            {
            pushFollow(FOLLOW_rule__Command__Exp1Assignment_4_2_in_rule__Command__Group_4__2__Impl6159);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3057:1: rule__Command__Group_4__3 : rule__Command__Group_4__3__Impl rule__Command__Group_4__4 ;
    public final void rule__Command__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3061:1: ( rule__Command__Group_4__3__Impl rule__Command__Group_4__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3062:2: rule__Command__Group_4__3__Impl rule__Command__Group_4__4
            {
            pushFollow(FOLLOW_rule__Command__Group_4__3__Impl_in_rule__Command__Group_4__36189);
            rule__Command__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__4_in_rule__Command__Group_4__36192);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3069:1: rule__Command__Group_4__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3073:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3074:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3074:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3075:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__3__Impl6219); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3086:1: rule__Command__Group_4__4 : rule__Command__Group_4__4__Impl rule__Command__Group_4__5 ;
    public final void rule__Command__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3090:1: ( rule__Command__Group_4__4__Impl rule__Command__Group_4__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3091:2: rule__Command__Group_4__4__Impl rule__Command__Group_4__5
            {
            pushFollow(FOLLOW_rule__Command__Group_4__4__Impl_in_rule__Command__Group_4__46248);
            rule__Command__Group_4__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__5_in_rule__Command__Group_4__46251);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3098:1: rule__Command__Group_4__4__Impl : ( 'in' ) ;
    public final void rule__Command__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3102:1: ( ( 'in' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3103:1: ( 'in' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3103:1: ( 'in' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3104:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getInKeyword_4_4()); 
            }
            match(input,29,FOLLOW_29_in_rule__Command__Group_4__4__Impl6279); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3117:1: rule__Command__Group_4__5 : rule__Command__Group_4__5__Impl rule__Command__Group_4__6 ;
    public final void rule__Command__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3121:1: ( rule__Command__Group_4__5__Impl rule__Command__Group_4__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3122:2: rule__Command__Group_4__5__Impl rule__Command__Group_4__6
            {
            pushFollow(FOLLOW_rule__Command__Group_4__5__Impl_in_rule__Command__Group_4__56310);
            rule__Command__Group_4__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__6_in_rule__Command__Group_4__56313);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3129:1: rule__Command__Group_4__5__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3133:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3134:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3134:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3135:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_5()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__5__Impl6340); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3146:1: rule__Command__Group_4__6 : rule__Command__Group_4__6__Impl rule__Command__Group_4__7 ;
    public final void rule__Command__Group_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3150:1: ( rule__Command__Group_4__6__Impl rule__Command__Group_4__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3151:2: rule__Command__Group_4__6__Impl rule__Command__Group_4__7
            {
            pushFollow(FOLLOW_rule__Command__Group_4__6__Impl_in_rule__Command__Group_4__66369);
            rule__Command__Group_4__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__7_in_rule__Command__Group_4__66372);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3158:1: rule__Command__Group_4__6__Impl : ( ( rule__Command__Exp2Assignment_4_6 ) ) ;
    public final void rule__Command__Group_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3162:1: ( ( ( rule__Command__Exp2Assignment_4_6 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3163:1: ( ( rule__Command__Exp2Assignment_4_6 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3163:1: ( ( rule__Command__Exp2Assignment_4_6 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3164:1: ( rule__Command__Exp2Assignment_4_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExp2Assignment_4_6()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3165:1: ( rule__Command__Exp2Assignment_4_6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3165:2: rule__Command__Exp2Assignment_4_6
            {
            pushFollow(FOLLOW_rule__Command__Exp2Assignment_4_6_in_rule__Command__Group_4__6__Impl6399);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3175:1: rule__Command__Group_4__7 : rule__Command__Group_4__7__Impl rule__Command__Group_4__8 ;
    public final void rule__Command__Group_4__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3179:1: ( rule__Command__Group_4__7__Impl rule__Command__Group_4__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3180:2: rule__Command__Group_4__7__Impl rule__Command__Group_4__8
            {
            pushFollow(FOLLOW_rule__Command__Group_4__7__Impl_in_rule__Command__Group_4__76429);
            rule__Command__Group_4__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__8_in_rule__Command__Group_4__76432);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3187:1: rule__Command__Group_4__7__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3191:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3192:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3192:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3193:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_7()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__7__Impl6459); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3204:1: rule__Command__Group_4__8 : rule__Command__Group_4__8__Impl rule__Command__Group_4__9 ;
    public final void rule__Command__Group_4__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3208:1: ( rule__Command__Group_4__8__Impl rule__Command__Group_4__9 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3209:2: rule__Command__Group_4__8__Impl rule__Command__Group_4__9
            {
            pushFollow(FOLLOW_rule__Command__Group_4__8__Impl_in_rule__Command__Group_4__86488);
            rule__Command__Group_4__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__9_in_rule__Command__Group_4__86491);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3216:1: rule__Command__Group_4__8__Impl : ( 'do' ) ;
    public final void rule__Command__Group_4__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3220:1: ( ( 'do' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:1: ( 'do' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:1: ( 'do' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3222:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getDoKeyword_4_8()); 
            }
            match(input,27,FOLLOW_27_in_rule__Command__Group_4__8__Impl6519); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3235:1: rule__Command__Group_4__9 : rule__Command__Group_4__9__Impl rule__Command__Group_4__10 ;
    public final void rule__Command__Group_4__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3239:1: ( rule__Command__Group_4__9__Impl rule__Command__Group_4__10 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3240:2: rule__Command__Group_4__9__Impl rule__Command__Group_4__10
            {
            pushFollow(FOLLOW_rule__Command__Group_4__9__Impl_in_rule__Command__Group_4__96550);
            rule__Command__Group_4__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__10_in_rule__Command__Group_4__96553);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3247:1: rule__Command__Group_4__9__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3251:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3252:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3252:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3253:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_9()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__9__Impl6580); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3264:1: rule__Command__Group_4__10 : rule__Command__Group_4__10__Impl rule__Command__Group_4__11 ;
    public final void rule__Command__Group_4__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3268:1: ( rule__Command__Group_4__10__Impl rule__Command__Group_4__11 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3269:2: rule__Command__Group_4__10__Impl rule__Command__Group_4__11
            {
            pushFollow(FOLLOW_rule__Command__Group_4__10__Impl_in_rule__Command__Group_4__106609);
            rule__Command__Group_4__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__11_in_rule__Command__Group_4__106612);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3276:1: rule__Command__Group_4__10__Impl : ( ( rule__Command__C1Assignment_4_10 ) ) ;
    public final void rule__Command__Group_4__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3280:1: ( ( ( rule__Command__C1Assignment_4_10 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3281:1: ( ( rule__Command__C1Assignment_4_10 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3281:1: ( ( rule__Command__C1Assignment_4_10 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3282:1: ( rule__Command__C1Assignment_4_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1Assignment_4_10()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3283:1: ( rule__Command__C1Assignment_4_10 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3283:2: rule__Command__C1Assignment_4_10
            {
            pushFollow(FOLLOW_rule__Command__C1Assignment_4_10_in_rule__Command__Group_4__10__Impl6639);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3293:1: rule__Command__Group_4__11 : rule__Command__Group_4__11__Impl rule__Command__Group_4__12 ;
    public final void rule__Command__Group_4__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3297:1: ( rule__Command__Group_4__11__Impl rule__Command__Group_4__12 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3298:2: rule__Command__Group_4__11__Impl rule__Command__Group_4__12
            {
            pushFollow(FOLLOW_rule__Command__Group_4__11__Impl_in_rule__Command__Group_4__116669);
            rule__Command__Group_4__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__12_in_rule__Command__Group_4__116672);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3305:1: rule__Command__Group_4__11__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3309:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3310:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3310:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3311:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_11()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__11__Impl6699); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3322:1: rule__Command__Group_4__12 : rule__Command__Group_4__12__Impl ;
    public final void rule__Command__Group_4__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3326:1: ( rule__Command__Group_4__12__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3327:2: rule__Command__Group_4__12__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_4__12__Impl_in_rule__Command__Group_4__126728);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3333:1: rule__Command__Group_4__12__Impl : ( 'od' ) ;
    public final void rule__Command__Group_4__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3337:1: ( ( 'od' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3338:1: ( 'od' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3338:1: ( 'od' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3339:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getOdKeyword_4_12()); 
            }
            match(input,28,FOLLOW_28_in_rule__Command__Group_4__12__Impl6756); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3378:1: rule__Command__Group_5__0 : rule__Command__Group_5__0__Impl rule__Command__Group_5__1 ;
    public final void rule__Command__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3382:1: ( rule__Command__Group_5__0__Impl rule__Command__Group_5__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3383:2: rule__Command__Group_5__0__Impl rule__Command__Group_5__1
            {
            pushFollow(FOLLOW_rule__Command__Group_5__0__Impl_in_rule__Command__Group_5__06813);
            rule__Command__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__1_in_rule__Command__Group_5__06816);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3390:1: rule__Command__Group_5__0__Impl : ( ( rule__Command__NomAssignment_5_0 ) ) ;
    public final void rule__Command__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3394:1: ( ( ( rule__Command__NomAssignment_5_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3395:1: ( ( rule__Command__NomAssignment_5_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3395:1: ( ( rule__Command__NomAssignment_5_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3396:1: ( rule__Command__NomAssignment_5_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomAssignment_5_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3397:1: ( rule__Command__NomAssignment_5_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3397:2: rule__Command__NomAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Command__NomAssignment_5_0_in_rule__Command__Group_5__0__Impl6843);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3407:1: rule__Command__Group_5__1 : rule__Command__Group_5__1__Impl rule__Command__Group_5__2 ;
    public final void rule__Command__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3411:1: ( rule__Command__Group_5__1__Impl rule__Command__Group_5__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3412:2: rule__Command__Group_5__1__Impl rule__Command__Group_5__2
            {
            pushFollow(FOLLOW_rule__Command__Group_5__1__Impl_in_rule__Command__Group_5__16873);
            rule__Command__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__2_in_rule__Command__Group_5__16876);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3419:1: rule__Command__Group_5__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3423:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3424:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3424:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3425:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5__1__Impl6903); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3436:1: rule__Command__Group_5__2 : rule__Command__Group_5__2__Impl rule__Command__Group_5__3 ;
    public final void rule__Command__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3440:1: ( rule__Command__Group_5__2__Impl rule__Command__Group_5__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3441:2: rule__Command__Group_5__2__Impl rule__Command__Group_5__3
            {
            pushFollow(FOLLOW_rule__Command__Group_5__2__Impl_in_rule__Command__Group_5__26932);
            rule__Command__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__3_in_rule__Command__Group_5__26935);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3448:1: rule__Command__Group_5__2__Impl : ( ( rule__Command__ExpAssignment_5_2 ) ) ;
    public final void rule__Command__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3452:1: ( ( ( rule__Command__ExpAssignment_5_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3453:1: ( ( rule__Command__ExpAssignment_5_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3453:1: ( ( rule__Command__ExpAssignment_5_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3454:1: ( rule__Command__ExpAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpAssignment_5_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3455:1: ( rule__Command__ExpAssignment_5_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3455:2: rule__Command__ExpAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Command__ExpAssignment_5_2_in_rule__Command__Group_5__2__Impl6962);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3465:1: rule__Command__Group_5__3 : rule__Command__Group_5__3__Impl rule__Command__Group_5__4 ;
    public final void rule__Command__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3469:1: ( rule__Command__Group_5__3__Impl rule__Command__Group_5__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3470:2: rule__Command__Group_5__3__Impl rule__Command__Group_5__4
            {
            pushFollow(FOLLOW_rule__Command__Group_5__3__Impl_in_rule__Command__Group_5__36992);
            rule__Command__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__4_in_rule__Command__Group_5__36995);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3477:1: rule__Command__Group_5__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3481:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3482:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3482:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3483:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5__3__Impl7022); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3494:1: rule__Command__Group_5__4 : rule__Command__Group_5__4__Impl rule__Command__Group_5__5 ;
    public final void rule__Command__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3498:1: ( rule__Command__Group_5__4__Impl rule__Command__Group_5__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3499:2: rule__Command__Group_5__4__Impl rule__Command__Group_5__5
            {
            pushFollow(FOLLOW_rule__Command__Group_5__4__Impl_in_rule__Command__Group_5__47051);
            rule__Command__Group_5__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__5_in_rule__Command__Group_5__47054);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3506:1: rule__Command__Group_5__4__Impl : ( 'then' ) ;
    public final void rule__Command__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3510:1: ( ( 'then' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3511:1: ( 'then' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3511:1: ( 'then' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3512:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getThenKeyword_5_4()); 
            }
            match(input,30,FOLLOW_30_in_rule__Command__Group_5__4__Impl7082); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3525:1: rule__Command__Group_5__5 : rule__Command__Group_5__5__Impl rule__Command__Group_5__6 ;
    public final void rule__Command__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3529:1: ( rule__Command__Group_5__5__Impl rule__Command__Group_5__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3530:2: rule__Command__Group_5__5__Impl rule__Command__Group_5__6
            {
            pushFollow(FOLLOW_rule__Command__Group_5__5__Impl_in_rule__Command__Group_5__57113);
            rule__Command__Group_5__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__6_in_rule__Command__Group_5__57116);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3537:1: rule__Command__Group_5__5__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3541:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3542:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3542:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3543:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_5()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5__5__Impl7143); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3554:1: rule__Command__Group_5__6 : rule__Command__Group_5__6__Impl rule__Command__Group_5__7 ;
    public final void rule__Command__Group_5__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3558:1: ( rule__Command__Group_5__6__Impl rule__Command__Group_5__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3559:2: rule__Command__Group_5__6__Impl rule__Command__Group_5__7
            {
            pushFollow(FOLLOW_rule__Command__Group_5__6__Impl_in_rule__Command__Group_5__67172);
            rule__Command__Group_5__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__7_in_rule__Command__Group_5__67175);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3566:1: rule__Command__Group_5__6__Impl : ( ( rule__Command__C1Assignment_5_6 ) ) ;
    public final void rule__Command__Group_5__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3570:1: ( ( ( rule__Command__C1Assignment_5_6 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3571:1: ( ( rule__Command__C1Assignment_5_6 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3571:1: ( ( rule__Command__C1Assignment_5_6 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3572:1: ( rule__Command__C1Assignment_5_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1Assignment_5_6()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3573:1: ( rule__Command__C1Assignment_5_6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3573:2: rule__Command__C1Assignment_5_6
            {
            pushFollow(FOLLOW_rule__Command__C1Assignment_5_6_in_rule__Command__Group_5__6__Impl7202);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3583:1: rule__Command__Group_5__7 : rule__Command__Group_5__7__Impl rule__Command__Group_5__8 ;
    public final void rule__Command__Group_5__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3587:1: ( rule__Command__Group_5__7__Impl rule__Command__Group_5__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3588:2: rule__Command__Group_5__7__Impl rule__Command__Group_5__8
            {
            pushFollow(FOLLOW_rule__Command__Group_5__7__Impl_in_rule__Command__Group_5__77232);
            rule__Command__Group_5__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__8_in_rule__Command__Group_5__77235);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3595:1: rule__Command__Group_5__7__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3599:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3600:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3600:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3601:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_7()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5__7__Impl7262); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3612:1: rule__Command__Group_5__8 : rule__Command__Group_5__8__Impl rule__Command__Group_5__9 ;
    public final void rule__Command__Group_5__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3616:1: ( rule__Command__Group_5__8__Impl rule__Command__Group_5__9 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3617:2: rule__Command__Group_5__8__Impl rule__Command__Group_5__9
            {
            pushFollow(FOLLOW_rule__Command__Group_5__8__Impl_in_rule__Command__Group_5__87291);
            rule__Command__Group_5__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__9_in_rule__Command__Group_5__87294);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3624:1: rule__Command__Group_5__8__Impl : ( ( rule__Command__Group_5_8__0 )? ) ;
    public final void rule__Command__Group_5__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3628:1: ( ( ( rule__Command__Group_5_8__0 )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3629:1: ( ( rule__Command__Group_5_8__0 )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3629:1: ( ( rule__Command__Group_5_8__0 )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3630:1: ( rule__Command__Group_5_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getGroup_5_8()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3631:1: ( rule__Command__Group_5_8__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3631:2: rule__Command__Group_5_8__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_5_8__0_in_rule__Command__Group_5__8__Impl7321);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3641:1: rule__Command__Group_5__9 : rule__Command__Group_5__9__Impl ;
    public final void rule__Command__Group_5__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3645:1: ( rule__Command__Group_5__9__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3646:2: rule__Command__Group_5__9__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_5__9__Impl_in_rule__Command__Group_5__97352);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3652:1: rule__Command__Group_5__9__Impl : ( 'fi' ) ;
    public final void rule__Command__Group_5__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3656:1: ( ( 'fi' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3657:1: ( 'fi' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3657:1: ( 'fi' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3658:1: 'fi'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getFiKeyword_5_9()); 
            }
            match(input,31,FOLLOW_31_in_rule__Command__Group_5__9__Impl7380); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3691:1: rule__Command__Group_5_8__0 : rule__Command__Group_5_8__0__Impl rule__Command__Group_5_8__1 ;
    public final void rule__Command__Group_5_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3695:1: ( rule__Command__Group_5_8__0__Impl rule__Command__Group_5_8__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3696:2: rule__Command__Group_5_8__0__Impl rule__Command__Group_5_8__1
            {
            pushFollow(FOLLOW_rule__Command__Group_5_8__0__Impl_in_rule__Command__Group_5_8__07431);
            rule__Command__Group_5_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5_8__1_in_rule__Command__Group_5_8__07434);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3703:1: rule__Command__Group_5_8__0__Impl : ( 'else' ) ;
    public final void rule__Command__Group_5_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3707:1: ( ( 'else' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3708:1: ( 'else' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3708:1: ( 'else' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3709:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getElseKeyword_5_8_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Command__Group_5_8__0__Impl7462); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3722:1: rule__Command__Group_5_8__1 : rule__Command__Group_5_8__1__Impl rule__Command__Group_5_8__2 ;
    public final void rule__Command__Group_5_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3726:1: ( rule__Command__Group_5_8__1__Impl rule__Command__Group_5_8__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3727:2: rule__Command__Group_5_8__1__Impl rule__Command__Group_5_8__2
            {
            pushFollow(FOLLOW_rule__Command__Group_5_8__1__Impl_in_rule__Command__Group_5_8__17493);
            rule__Command__Group_5_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5_8__2_in_rule__Command__Group_5_8__17496);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3734:1: rule__Command__Group_5_8__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3738:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3739:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3739:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3740:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_8_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5_8__1__Impl7523); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3751:1: rule__Command__Group_5_8__2 : rule__Command__Group_5_8__2__Impl rule__Command__Group_5_8__3 ;
    public final void rule__Command__Group_5_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3755:1: ( rule__Command__Group_5_8__2__Impl rule__Command__Group_5_8__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3756:2: rule__Command__Group_5_8__2__Impl rule__Command__Group_5_8__3
            {
            pushFollow(FOLLOW_rule__Command__Group_5_8__2__Impl_in_rule__Command__Group_5_8__27552);
            rule__Command__Group_5_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5_8__3_in_rule__Command__Group_5_8__27555);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3763:1: rule__Command__Group_5_8__2__Impl : ( ( rule__Command__C2Assignment_5_8_2 ) ) ;
    public final void rule__Command__Group_5_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3767:1: ( ( ( rule__Command__C2Assignment_5_8_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3768:1: ( ( rule__Command__C2Assignment_5_8_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3768:1: ( ( rule__Command__C2Assignment_5_8_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3769:1: ( rule__Command__C2Assignment_5_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC2Assignment_5_8_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3770:1: ( rule__Command__C2Assignment_5_8_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3770:2: rule__Command__C2Assignment_5_8_2
            {
            pushFollow(FOLLOW_rule__Command__C2Assignment_5_8_2_in_rule__Command__Group_5_8__2__Impl7582);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3780:1: rule__Command__Group_5_8__3 : rule__Command__Group_5_8__3__Impl ;
    public final void rule__Command__Group_5_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3784:1: ( rule__Command__Group_5_8__3__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3785:2: rule__Command__Group_5_8__3__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_5_8__3__Impl_in_rule__Command__Group_5_8__37612);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3791:1: rule__Command__Group_5_8__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3795:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3796:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3796:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3797:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_8_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5_8__3__Impl7639); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3816:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3820:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3821:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__07676);
            rule__And__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group__1_in_rule__And__Group__07679);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3828:1: rule__And__Group__0__Impl : ( ( rule__And__ExpOuAssignment_0 ) ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3832:1: ( ( ( rule__And__ExpOuAssignment_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3833:1: ( ( rule__And__ExpOuAssignment_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3833:1: ( ( rule__And__ExpOuAssignment_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3834:1: ( rule__And__ExpOuAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getExpOuAssignment_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3835:1: ( rule__And__ExpOuAssignment_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3835:2: rule__And__ExpOuAssignment_0
            {
            pushFollow(FOLLOW_rule__And__ExpOuAssignment_0_in_rule__And__Group__0__Impl7706);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3845:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3849:1: ( rule__And__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3850:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__17736);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3856:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3860:1: ( ( ( rule__And__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3861:1: ( ( rule__And__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3861:1: ( ( rule__And__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3862:1: ( rule__And__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3863:1: ( rule__And__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3863:2: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl7763);
            	    rule__And__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3877:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3881:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3882:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__07798);
            rule__And__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__07801);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3889:1: rule__And__Group_1__0__Impl : ( RULE_LC ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3893:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3894:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3894:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3895:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getLCTerminalRuleCall_1_0()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__And__Group_1__0__Impl7828); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3906:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3910:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3911:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__17857);
            rule__And__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__17860);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3918:1: rule__And__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3922:1: ( ( 'and' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3923:1: ( 'and' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3923:1: ( 'and' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3924:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndKeyword_1_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__And__Group_1__1__Impl7888); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3937:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl rule__And__Group_1__3 ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3941:1: ( rule__And__Group_1__2__Impl rule__And__Group_1__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3942:2: rule__And__Group_1__2__Impl rule__And__Group_1__3
            {
            pushFollow(FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__27919);
            rule__And__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1__3_in_rule__And__Group_1__27922);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3949:1: rule__And__Group_1__2__Impl : ( RULE_LC ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3953:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3954:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3954:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3955:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getLCTerminalRuleCall_1_2()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__And__Group_1__2__Impl7949); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3966:1: rule__And__Group_1__3 : rule__And__Group_1__3__Impl ;
    public final void rule__And__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3970:1: ( rule__And__Group_1__3__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3971:2: rule__And__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_1__3__Impl_in_rule__And__Group_1__37978);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3977:1: rule__And__Group_1__3__Impl : ( ( rule__And__ExpOu2Assignment_1_3 ) ) ;
    public final void rule__And__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3981:1: ( ( ( rule__And__ExpOu2Assignment_1_3 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3982:1: ( ( rule__And__ExpOu2Assignment_1_3 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3982:1: ( ( rule__And__ExpOu2Assignment_1_3 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3983:1: ( rule__And__ExpOu2Assignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getExpOu2Assignment_1_3()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3984:1: ( rule__And__ExpOu2Assignment_1_3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3984:2: rule__And__ExpOu2Assignment_1_3
            {
            pushFollow(FOLLOW_rule__And__ExpOu2Assignment_1_3_in_rule__And__Group_1__3__Impl8005);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4002:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4006:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4007:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__08043);
            rule__Or__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__08046);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4014:1: rule__Or__Group__0__Impl : ( ( rule__Or__ExpNonAssignment_0 ) ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4018:1: ( ( ( rule__Or__ExpNonAssignment_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4019:1: ( ( rule__Or__ExpNonAssignment_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4019:1: ( ( rule__Or__ExpNonAssignment_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4020:1: ( rule__Or__ExpNonAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getExpNonAssignment_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4021:1: ( rule__Or__ExpNonAssignment_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4021:2: rule__Or__ExpNonAssignment_0
            {
            pushFollow(FOLLOW_rule__Or__ExpNonAssignment_0_in_rule__Or__Group__0__Impl8073);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4031:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4035:1: ( rule__Or__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4036:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__18103);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4042:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4046:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4047:1: ( ( rule__Or__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4047:1: ( ( rule__Or__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4048:1: ( rule__Or__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4049:1: ( rule__Or__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                alt28 = dfa28.predict(input);
                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4049:2: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl8130);
            	    rule__Or__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4063:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4067:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4068:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__08165);
            rule__Or__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__08168);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4075:1: rule__Or__Group_1__0__Impl : ( RULE_LC ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4079:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4080:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4080:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4081:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getLCTerminalRuleCall_1_0()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Or__Group_1__0__Impl8195); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4092:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4096:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4097:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__18224);
            rule__Or__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__18227);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4104:1: rule__Or__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4108:1: ( ( 'or' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4109:1: ( 'or' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4109:1: ( 'or' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4110:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrKeyword_1_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__Or__Group_1__1__Impl8255); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4123:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl rule__Or__Group_1__3 ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4127:1: ( rule__Or__Group_1__2__Impl rule__Or__Group_1__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4128:2: rule__Or__Group_1__2__Impl rule__Or__Group_1__3
            {
            pushFollow(FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__28286);
            rule__Or__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group_1__3_in_rule__Or__Group_1__28289);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4135:1: rule__Or__Group_1__2__Impl : ( RULE_LC ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4139:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4140:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4140:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4141:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getLCTerminalRuleCall_1_2()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Or__Group_1__2__Impl8316); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4152:1: rule__Or__Group_1__3 : rule__Or__Group_1__3__Impl ;
    public final void rule__Or__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4156:1: ( rule__Or__Group_1__3__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4157:2: rule__Or__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_1__3__Impl_in_rule__Or__Group_1__38345);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4163:1: rule__Or__Group_1__3__Impl : ( ( rule__Or__ExpNon2Assignment_1_3 ) ) ;
    public final void rule__Or__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4167:1: ( ( ( rule__Or__ExpNon2Assignment_1_3 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4168:1: ( ( rule__Or__ExpNon2Assignment_1_3 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4168:1: ( ( rule__Or__ExpNon2Assignment_1_3 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4169:1: ( rule__Or__ExpNon2Assignment_1_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getExpNon2Assignment_1_3()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4170:1: ( rule__Or__ExpNon2Assignment_1_3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4170:2: rule__Or__ExpNon2Assignment_1_3
            {
            pushFollow(FOLLOW_rule__Or__ExpNon2Assignment_1_3_in_rule__Or__Group_1__3__Impl8372);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4188:1: rule__Not__Group__0 : rule__Not__Group__0__Impl rule__Not__Group__1 ;
    public final void rule__Not__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4192:1: ( rule__Not__Group__0__Impl rule__Not__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4193:2: rule__Not__Group__0__Impl rule__Not__Group__1
            {
            pushFollow(FOLLOW_rule__Not__Group__0__Impl_in_rule__Not__Group__08410);
            rule__Not__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Not__Group__1_in_rule__Not__Group__08413);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4200:1: rule__Not__Group__0__Impl : ( ( rule__Not__Group_0__0 )* ) ;
    public final void rule__Not__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4204:1: ( ( ( rule__Not__Group_0__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4205:1: ( ( rule__Not__Group_0__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4205:1: ( ( rule__Not__Group_0__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4206:1: ( rule__Not__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getGroup_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4207:1: ( rule__Not__Group_0__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==43) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4207:2: rule__Not__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Not__Group_0__0_in_rule__Not__Group__0__Impl8440);
            	    rule__Not__Group_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4217:1: rule__Not__Group__1 : rule__Not__Group__1__Impl ;
    public final void rule__Not__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4221:1: ( rule__Not__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4222:2: rule__Not__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Not__Group__1__Impl_in_rule__Not__Group__18471);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4228:1: rule__Not__Group__1__Impl : ( ( rule__Not__ExpEqAssignment_1 ) ) ;
    public final void rule__Not__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4232:1: ( ( ( rule__Not__ExpEqAssignment_1 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4233:1: ( ( rule__Not__ExpEqAssignment_1 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4233:1: ( ( rule__Not__ExpEqAssignment_1 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4234:1: ( rule__Not__ExpEqAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getExpEqAssignment_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4235:1: ( rule__Not__ExpEqAssignment_1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4235:2: rule__Not__ExpEqAssignment_1
            {
            pushFollow(FOLLOW_rule__Not__ExpEqAssignment_1_in_rule__Not__Group__1__Impl8498);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4249:1: rule__Not__Group_0__0 : rule__Not__Group_0__0__Impl rule__Not__Group_0__1 ;
    public final void rule__Not__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4253:1: ( rule__Not__Group_0__0__Impl rule__Not__Group_0__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4254:2: rule__Not__Group_0__0__Impl rule__Not__Group_0__1
            {
            pushFollow(FOLLOW_rule__Not__Group_0__0__Impl_in_rule__Not__Group_0__08532);
            rule__Not__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Not__Group_0__1_in_rule__Not__Group_0__08535);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4261:1: rule__Not__Group_0__0__Impl : ( ( rule__Not__NonAssignment_0_0 ) ) ;
    public final void rule__Not__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4265:1: ( ( ( rule__Not__NonAssignment_0_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4266:1: ( ( rule__Not__NonAssignment_0_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4266:1: ( ( rule__Not__NonAssignment_0_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4267:1: ( rule__Not__NonAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getNonAssignment_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4268:1: ( rule__Not__NonAssignment_0_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4268:2: rule__Not__NonAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Not__NonAssignment_0_0_in_rule__Not__Group_0__0__Impl8562);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4278:1: rule__Not__Group_0__1 : rule__Not__Group_0__1__Impl ;
    public final void rule__Not__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4282:1: ( rule__Not__Group_0__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4283:2: rule__Not__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Not__Group_0__1__Impl_in_rule__Not__Group_0__18592);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4289:1: rule__Not__Group_0__1__Impl : ( RULE_LC ) ;
    public final void rule__Not__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4293:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4294:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4294:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4295:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getLCTerminalRuleCall_0_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Not__Group_0__1__Impl8619); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4310:1: rule__Eq__Group_0__0 : rule__Eq__Group_0__0__Impl rule__Eq__Group_0__1 ;
    public final void rule__Eq__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4314:1: ( rule__Eq__Group_0__0__Impl rule__Eq__Group_0__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4315:2: rule__Eq__Group_0__0__Impl rule__Eq__Group_0__1
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__0__Impl_in_rule__Eq__Group_0__08652);
            rule__Eq__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_0__1_in_rule__Eq__Group_0__08655);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4322:1: rule__Eq__Group_0__0__Impl : ( ( rule__Eq__ExprEq1Assignment_0_0 ) ) ;
    public final void rule__Eq__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4326:1: ( ( ( rule__Eq__ExprEq1Assignment_0_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4327:1: ( ( rule__Eq__ExprEq1Assignment_0_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4327:1: ( ( rule__Eq__ExprEq1Assignment_0_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4328:1: ( rule__Eq__ExprEq1Assignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getExprEq1Assignment_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4329:1: ( rule__Eq__ExprEq1Assignment_0_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4329:2: rule__Eq__ExprEq1Assignment_0_0
            {
            pushFollow(FOLLOW_rule__Eq__ExprEq1Assignment_0_0_in_rule__Eq__Group_0__0__Impl8682);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4339:1: rule__Eq__Group_0__1 : rule__Eq__Group_0__1__Impl rule__Eq__Group_0__2 ;
    public final void rule__Eq__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4343:1: ( rule__Eq__Group_0__1__Impl rule__Eq__Group_0__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4344:2: rule__Eq__Group_0__1__Impl rule__Eq__Group_0__2
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__1__Impl_in_rule__Eq__Group_0__18712);
            rule__Eq__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_0__2_in_rule__Eq__Group_0__18715);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4351:1: rule__Eq__Group_0__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Eq__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4355:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4356:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4356:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4357:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getLCTerminalRuleCall_0_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4358:1: ( RULE_LC )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_LC) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4358:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Eq__Group_0__1__Impl8743); if (state.failed) return ;

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4368:1: rule__Eq__Group_0__2 : rule__Eq__Group_0__2__Impl rule__Eq__Group_0__3 ;
    public final void rule__Eq__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4372:1: ( rule__Eq__Group_0__2__Impl rule__Eq__Group_0__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4373:2: rule__Eq__Group_0__2__Impl rule__Eq__Group_0__3
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__2__Impl_in_rule__Eq__Group_0__28774);
            rule__Eq__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_0__3_in_rule__Eq__Group_0__28777);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4380:1: rule__Eq__Group_0__2__Impl : ( '=?' ) ;
    public final void rule__Eq__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4384:1: ( ( '=?' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4385:1: ( '=?' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4385:1: ( '=?' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4386:1: '=?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getEqualsSignQuestionMarkKeyword_0_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__Eq__Group_0__2__Impl8805); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4399:1: rule__Eq__Group_0__3 : rule__Eq__Group_0__3__Impl rule__Eq__Group_0__4 ;
    public final void rule__Eq__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4403:1: ( rule__Eq__Group_0__3__Impl rule__Eq__Group_0__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4404:2: rule__Eq__Group_0__3__Impl rule__Eq__Group_0__4
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__3__Impl_in_rule__Eq__Group_0__38836);
            rule__Eq__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_0__4_in_rule__Eq__Group_0__38839);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4411:1: rule__Eq__Group_0__3__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Eq__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4415:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4416:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4416:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4417:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getLCTerminalRuleCall_0_3()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4418:1: ( RULE_LC )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_LC) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4418:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Eq__Group_0__3__Impl8867); if (state.failed) return ;

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4428:1: rule__Eq__Group_0__4 : rule__Eq__Group_0__4__Impl ;
    public final void rule__Eq__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4432:1: ( rule__Eq__Group_0__4__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4433:2: rule__Eq__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__4__Impl_in_rule__Eq__Group_0__48898);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4439:1: rule__Eq__Group_0__4__Impl : ( ( rule__Eq__ExprEq2Assignment_0_4 ) ) ;
    public final void rule__Eq__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4443:1: ( ( ( rule__Eq__ExprEq2Assignment_0_4 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4444:1: ( ( rule__Eq__ExprEq2Assignment_0_4 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4444:1: ( ( rule__Eq__ExprEq2Assignment_0_4 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4445:1: ( rule__Eq__ExprEq2Assignment_0_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getExprEq2Assignment_0_4()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4446:1: ( rule__Eq__ExprEq2Assignment_0_4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4446:2: rule__Eq__ExprEq2Assignment_0_4
            {
            pushFollow(FOLLOW_rule__Eq__ExprEq2Assignment_0_4_in_rule__Eq__Group_0__4__Impl8925);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4466:1: rule__Eq__Group_1__0 : rule__Eq__Group_1__0__Impl rule__Eq__Group_1__1 ;
    public final void rule__Eq__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4470:1: ( rule__Eq__Group_1__0__Impl rule__Eq__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4471:2: rule__Eq__Group_1__0__Impl rule__Eq__Group_1__1
            {
            pushFollow(FOLLOW_rule__Eq__Group_1__0__Impl_in_rule__Eq__Group_1__08965);
            rule__Eq__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_1__1_in_rule__Eq__Group_1__08968);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4478:1: rule__Eq__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Eq__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4482:1: ( ( '(' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4483:1: ( '(' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4483:1: ( '(' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4484:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Eq__Group_1__0__Impl8996); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4497:1: rule__Eq__Group_1__1 : rule__Eq__Group_1__1__Impl rule__Eq__Group_1__2 ;
    public final void rule__Eq__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4501:1: ( rule__Eq__Group_1__1__Impl rule__Eq__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4502:2: rule__Eq__Group_1__1__Impl rule__Eq__Group_1__2
            {
            pushFollow(FOLLOW_rule__Eq__Group_1__1__Impl_in_rule__Eq__Group_1__19027);
            rule__Eq__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_1__2_in_rule__Eq__Group_1__19030);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4509:1: rule__Eq__Group_1__1__Impl : ( ( rule__Eq__ExpAssignment_1_1 ) ) ;
    public final void rule__Eq__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4513:1: ( ( ( rule__Eq__ExpAssignment_1_1 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4514:1: ( ( rule__Eq__ExpAssignment_1_1 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4514:1: ( ( rule__Eq__ExpAssignment_1_1 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4515:1: ( rule__Eq__ExpAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getExpAssignment_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4516:1: ( rule__Eq__ExpAssignment_1_1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4516:2: rule__Eq__ExpAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Eq__ExpAssignment_1_1_in_rule__Eq__Group_1__1__Impl9057);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4526:1: rule__Eq__Group_1__2 : rule__Eq__Group_1__2__Impl ;
    public final void rule__Eq__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4530:1: ( rule__Eq__Group_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4531:2: rule__Eq__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Eq__Group_1__2__Impl_in_rule__Eq__Group_1__29087);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4537:1: rule__Eq__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Eq__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4541:1: ( ( ')' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4542:1: ( ')' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4542:1: ( ')' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4543:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__Eq__Group_1__2__Impl9115); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4562:1: rule__ExprTerm__Group_0__0 : rule__ExprTerm__Group_0__0__Impl rule__ExprTerm__Group_0__1 ;
    public final void rule__ExprTerm__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4566:1: ( rule__ExprTerm__Group_0__0__Impl rule__ExprTerm__Group_0__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4567:2: rule__ExprTerm__Group_0__0__Impl rule__ExprTerm__Group_0__1
            {
            pushFollow(FOLLOW_rule__ExprTerm__Group_0__0__Impl_in_rule__ExprTerm__Group_0__09152);
            rule__ExprTerm__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprTerm__Group_0__1_in_rule__ExprTerm__Group_0__09155);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4574:1: rule__ExprTerm__Group_0__0__Impl : ( () ) ;
    public final void rule__ExprTerm__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4578:1: ( ( () ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4579:1: ( () )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4579:1: ( () )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4580:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTermAccess().getExprTermAction_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4581:1: ()
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4583:1: 
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4593:1: rule__ExprTerm__Group_0__1 : rule__ExprTerm__Group_0__1__Impl ;
    public final void rule__ExprTerm__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4597:1: ( rule__ExprTerm__Group_0__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4598:2: rule__ExprTerm__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprTerm__Group_0__1__Impl_in_rule__ExprTerm__Group_0__19213);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4604:1: rule__ExprTerm__Group_0__1__Impl : ( 'nil' ) ;
    public final void rule__ExprTerm__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4608:1: ( ( 'nil' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4609:1: ( 'nil' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4609:1: ( 'nil' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4610:1: 'nil'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTermAccess().getNilKeyword_0_1()); 
            }
            match(input,38,FOLLOW_38_in_rule__ExprTerm__Group_0__1__Impl9241); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4627:1: rule__ExprSimple__Group__0 : rule__ExprSimple__Group__0__Impl rule__ExprSimple__Group__1 ;
    public final void rule__ExprSimple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4631:1: ( rule__ExprSimple__Group__0__Impl rule__ExprSimple__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4632:2: rule__ExprSimple__Group__0__Impl rule__ExprSimple__Group__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group__0__Impl_in_rule__ExprSimple__Group__09276);
            rule__ExprSimple__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group__1_in_rule__ExprSimple__Group__09279);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4639:1: rule__ExprSimple__Group__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4643:1: ( ( '(' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4644:1: ( '(' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4644:1: ( '(' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4645:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__ExprSimple__Group__0__Impl9307); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4658:1: rule__ExprSimple__Group__1 : rule__ExprSimple__Group__1__Impl rule__ExprSimple__Group__2 ;
    public final void rule__ExprSimple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4662:1: ( rule__ExprSimple__Group__1__Impl rule__ExprSimple__Group__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4663:2: rule__ExprSimple__Group__1__Impl rule__ExprSimple__Group__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group__1__Impl_in_rule__ExprSimple__Group__19338);
            rule__ExprSimple__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group__2_in_rule__ExprSimple__Group__19341);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4670:1: rule__ExprSimple__Group__1__Impl : ( ( rule__ExprSimple__Alternatives_1 ) ) ;
    public final void rule__ExprSimple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4674:1: ( ( ( rule__ExprSimple__Alternatives_1 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4675:1: ( ( rule__ExprSimple__Alternatives_1 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4675:1: ( ( rule__ExprSimple__Alternatives_1 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4676:1: ( rule__ExprSimple__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getAlternatives_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4677:1: ( rule__ExprSimple__Alternatives_1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4677:2: rule__ExprSimple__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Alternatives_1_in_rule__ExprSimple__Group__1__Impl9368);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4687:1: rule__ExprSimple__Group__2 : rule__ExprSimple__Group__2__Impl ;
    public final void rule__ExprSimple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4691:1: ( rule__ExprSimple__Group__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4692:2: rule__ExprSimple__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group__2__Impl_in_rule__ExprSimple__Group__29398);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4698:1: rule__ExprSimple__Group__2__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4702:1: ( ( ')' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4703:1: ( ')' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4703:1: ( ')' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4704:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__ExprSimple__Group__2__Impl9426); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4723:1: rule__ExprSimple__Group_1_0__0 : rule__ExprSimple__Group_1_0__0__Impl rule__ExprSimple__Group_1_0__1 ;
    public final void rule__ExprSimple__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4727:1: ( rule__ExprSimple__Group_1_0__0__Impl rule__ExprSimple__Group_1_0__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4728:2: rule__ExprSimple__Group_1_0__0__Impl rule__ExprSimple__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_0__0__Impl_in_rule__ExprSimple__Group_1_0__09463);
            rule__ExprSimple__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_0__1_in_rule__ExprSimple__Group_1_0__09466);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4735:1: rule__ExprSimple__Group_1_0__0__Impl : ( ( rule__ExprSimple__MotAssignment_1_0_0 ) ) ;
    public final void rule__ExprSimple__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4739:1: ( ( ( rule__ExprSimple__MotAssignment_1_0_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4740:1: ( ( rule__ExprSimple__MotAssignment_1_0_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4740:1: ( ( rule__ExprSimple__MotAssignment_1_0_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4741:1: ( rule__ExprSimple__MotAssignment_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getMotAssignment_1_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4742:1: ( rule__ExprSimple__MotAssignment_1_0_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4742:2: rule__ExprSimple__MotAssignment_1_0_0
            {
            pushFollow(FOLLOW_rule__ExprSimple__MotAssignment_1_0_0_in_rule__ExprSimple__Group_1_0__0__Impl9493);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4752:1: rule__ExprSimple__Group_1_0__1 : rule__ExprSimple__Group_1_0__1__Impl ;
    public final void rule__ExprSimple__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4756:1: ( rule__ExprSimple__Group_1_0__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4757:2: rule__ExprSimple__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_0__1__Impl_in_rule__ExprSimple__Group_1_0__19523);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4763:1: rule__ExprSimple__Group_1_0__1__Impl : ( ( rule__ExprSimple__LexprAssignment_1_0_1 ) ) ;
    public final void rule__ExprSimple__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4767:1: ( ( ( rule__ExprSimple__LexprAssignment_1_0_1 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4768:1: ( ( rule__ExprSimple__LexprAssignment_1_0_1 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4768:1: ( ( rule__ExprSimple__LexprAssignment_1_0_1 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4769:1: ( rule__ExprSimple__LexprAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLexprAssignment_1_0_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4770:1: ( rule__ExprSimple__LexprAssignment_1_0_1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4770:2: rule__ExprSimple__LexprAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__LexprAssignment_1_0_1_in_rule__ExprSimple__Group_1_0__1__Impl9550);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4784:1: rule__ExprSimple__Group_1_1__0 : rule__ExprSimple__Group_1_1__0__Impl rule__ExprSimple__Group_1_1__1 ;
    public final void rule__ExprSimple__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4788:1: ( rule__ExprSimple__Group_1_1__0__Impl rule__ExprSimple__Group_1_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4789:2: rule__ExprSimple__Group_1_1__0__Impl rule__ExprSimple__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__0__Impl_in_rule__ExprSimple__Group_1_1__09584);
            rule__ExprSimple__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__1_in_rule__ExprSimple__Group_1_1__09587);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4796:1: rule__ExprSimple__Group_1_1__0__Impl : ( ( rule__ExprSimple__MotAssignment_1_1_0 ) ) ;
    public final void rule__ExprSimple__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4800:1: ( ( ( rule__ExprSimple__MotAssignment_1_1_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4801:1: ( ( rule__ExprSimple__MotAssignment_1_1_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4801:1: ( ( rule__ExprSimple__MotAssignment_1_1_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4802:1: ( rule__ExprSimple__MotAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getMotAssignment_1_1_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4803:1: ( rule__ExprSimple__MotAssignment_1_1_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4803:2: rule__ExprSimple__MotAssignment_1_1_0
            {
            pushFollow(FOLLOW_rule__ExprSimple__MotAssignment_1_1_0_in_rule__ExprSimple__Group_1_1__0__Impl9614);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4813:1: rule__ExprSimple__Group_1_1__1 : rule__ExprSimple__Group_1_1__1__Impl rule__ExprSimple__Group_1_1__2 ;
    public final void rule__ExprSimple__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4817:1: ( rule__ExprSimple__Group_1_1__1__Impl rule__ExprSimple__Group_1_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4818:2: rule__ExprSimple__Group_1_1__1__Impl rule__ExprSimple__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__1__Impl_in_rule__ExprSimple__Group_1_1__19644);
            rule__ExprSimple__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__2_in_rule__ExprSimple__Group_1_1__19647);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4825:1: rule__ExprSimple__Group_1_1__1__Impl : ( RULE_LC ) ;
    public final void rule__ExprSimple__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4829:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4830:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4830:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4831:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLCTerminalRuleCall_1_1_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__ExprSimple__Group_1_1__1__Impl9674); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4842:1: rule__ExprSimple__Group_1_1__2 : rule__ExprSimple__Group_1_1__2__Impl ;
    public final void rule__ExprSimple__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4846:1: ( rule__ExprSimple__Group_1_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4847:2: rule__ExprSimple__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__2__Impl_in_rule__ExprSimple__Group_1_1__29703);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4853:1: rule__ExprSimple__Group_1_1__2__Impl : ( ( rule__ExprSimple__ExprAssignment_1_1_2 ) ) ;
    public final void rule__ExprSimple__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4857:1: ( ( ( rule__ExprSimple__ExprAssignment_1_1_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4858:1: ( ( rule__ExprSimple__ExprAssignment_1_1_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4858:1: ( ( rule__ExprSimple__ExprAssignment_1_1_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4859:1: ( rule__ExprSimple__ExprAssignment_1_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprAssignment_1_1_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4860:1: ( rule__ExprSimple__ExprAssignment_1_1_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4860:2: rule__ExprSimple__ExprAssignment_1_1_2
            {
            pushFollow(FOLLOW_rule__ExprSimple__ExprAssignment_1_1_2_in_rule__ExprSimple__Group_1_1__2__Impl9730);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4876:1: rule__Lexpr__Group__0 : rule__Lexpr__Group__0__Impl rule__Lexpr__Group__1 ;
    public final void rule__Lexpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4880:1: ( rule__Lexpr__Group__0__Impl rule__Lexpr__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4881:2: rule__Lexpr__Group__0__Impl rule__Lexpr__Group__1
            {
            pushFollow(FOLLOW_rule__Lexpr__Group__0__Impl_in_rule__Lexpr__Group__09766);
            rule__Lexpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Lexpr__Group__1_in_rule__Lexpr__Group__09769);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4888:1: rule__Lexpr__Group__0__Impl : ( RULE_LC ) ;
    public final void rule__Lexpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4892:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4893:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4893:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4894:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLexprAccess().getLCTerminalRuleCall_0()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Lexpr__Group__0__Impl9796); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4905:1: rule__Lexpr__Group__1 : rule__Lexpr__Group__1__Impl ;
    public final void rule__Lexpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4909:1: ( rule__Lexpr__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4910:2: rule__Lexpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Lexpr__Group__1__Impl_in_rule__Lexpr__Group__19825);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4916:1: rule__Lexpr__Group__1__Impl : ( ( rule__Lexpr__ExpAssignment_1 ) ) ;
    public final void rule__Lexpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4920:1: ( ( ( rule__Lexpr__ExpAssignment_1 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4921:1: ( ( rule__Lexpr__ExpAssignment_1 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4921:1: ( ( rule__Lexpr__ExpAssignment_1 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4922:1: ( rule__Lexpr__ExpAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLexprAccess().getExpAssignment_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4923:1: ( rule__Lexpr__ExpAssignment_1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4923:2: rule__Lexpr__ExpAssignment_1
            {
            pushFollow(FOLLOW_rule__Lexpr__ExpAssignment_1_in_rule__Lexpr__Group__1__Impl9852);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4938:1: rule__Model__ModelAssignment_0 : ( ruleFunction ) ;
    public final void rule__Model__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4942:1: ( ( ruleFunction ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4943:1: ( ruleFunction )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4943:1: ( ruleFunction )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4944:1: ruleFunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelFunctionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_rule__Model__ModelAssignment_09891);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4953:1: rule__Function__FunNameAssignment_2 : ( RULE_SYMBOLES ) ;
    public final void rule__Function__FunNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4957:1: ( ( RULE_SYMBOLES ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4958:1: ( RULE_SYMBOLES )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4958:1: ( RULE_SYMBOLES )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4959:1: RULE_SYMBOLES
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFunNameSYMBOLESTerminalRuleCall_2_0()); 
            }
            match(input,RULE_SYMBOLES,FOLLOW_RULE_SYMBOLES_in_rule__Function__FunNameAssignment_29922); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4968:1: rule__Function__DefAssignment_5 : ( ruleDefiniton ) ;
    public final void rule__Function__DefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4972:1: ( ( ruleDefiniton ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4973:1: ( ruleDefiniton )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4973:1: ( ruleDefiniton )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4974:1: ruleDefiniton
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getDefDefinitonParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleDefiniton_in_rule__Function__DefAssignment_59953);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4983:1: rule__Definiton__InputVarsAssignment_2 : ( ruleInput ) ;
    public final void rule__Definiton__InputVarsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4987:1: ( ( ruleInput ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4988:1: ( ruleInput )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4988:1: ( ruleInput )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4989:1: ruleInput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getInputVarsInputParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleInput_in_rule__Definiton__InputVarsAssignment_29984);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4998:1: rule__Definiton__CommandListAssignment_5 : ( ruleCommands ) ;
    public final void rule__Definiton__CommandListAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5002:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5003:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5003:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5004:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getCommandListCommandsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Definiton__CommandListAssignment_510015);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5013:1: rule__Definiton__OutputVarsAssignment_10 : ( ruleOutput ) ;
    public final void rule__Definiton__OutputVarsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5017:1: ( ( ruleOutput ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5018:1: ( ruleOutput )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5018:1: ( ruleOutput )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5019:1: ruleOutput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getOutputVarsOutputParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_rule__Definiton__OutputVarsAssignment_1010046);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5028:1: rule__Input__VAssignment_0 : ( RULE_VARIABLE ) ;
    public final void rule__Input__VAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5032:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5033:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5033:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5034:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVVARIABLETerminalRuleCall_0_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Input__VAssignment_010077); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5043:1: rule__Input__V2Assignment_1_2 : ( RULE_VARIABLE ) ;
    public final void rule__Input__V2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5047:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5048:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5048:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5049:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getV2VARIABLETerminalRuleCall_1_2_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Input__V2Assignment_1_210108); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5058:1: rule__Output__VAssignment_0 : ( RULE_VARIABLE ) ;
    public final void rule__Output__VAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5062:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5063:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5063:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5064:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVVARIABLETerminalRuleCall_0_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Output__VAssignment_010139); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5073:1: rule__Output__V2Assignment_1_2 : ( RULE_VARIABLE ) ;
    public final void rule__Output__V2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5077:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5078:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5078:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5079:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getV2VARIABLETerminalRuleCall_1_2_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Output__V2Assignment_1_210170); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5088:1: rule__Commands__CAssignment_0 : ( ruleCommand ) ;
    public final void rule__Commands__CAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5092:1: ( ( ruleCommand ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5093:1: ( ruleCommand )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5093:1: ( ruleCommand )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5094:1: ruleCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_rule__Commands__CAssignment_010201);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5103:1: rule__Commands__CAssignment_1_2 : ( ruleCommand ) ;
    public final void rule__Commands__CAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5107:1: ( ( ruleCommand ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5108:1: ( ruleCommand )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5108:1: ( ruleCommand )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5109:1: ruleCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_rule__Commands__CAssignment_1_210232);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5118:1: rule__Vars__V1Assignment_0 : ( RULE_VARIABLE ) ;
    public final void rule__Vars__V1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5122:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5123:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5123:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5124:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getV1VARIABLETerminalRuleCall_0_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Vars__V1Assignment_010263); if (state.failed) return ;
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


    // $ANTLR start "rule__Vars__V2Assignment_1_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5133:1: rule__Vars__V2Assignment_1_2 : ( RULE_VARIABLE ) ;
    public final void rule__Vars__V2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5137:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5138:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5138:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5139:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getV2VARIABLETerminalRuleCall_1_2_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Vars__V2Assignment_1_210294); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getV2VARIABLETerminalRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Vars__V2Assignment_1_2"


    // $ANTLR start "rule__Exprs__ExpAssignment_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5148:1: rule__Exprs__ExpAssignment_0 : ( ruleExpr ) ;
    public final void rule__Exprs__ExpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5152:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5153:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5153:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5154:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpExprParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Exprs__ExpAssignment_010325);
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


    // $ANTLR start "rule__Exprs__ExpLAssignment_1_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5163:1: rule__Exprs__ExpLAssignment_1_2 : ( ruleExpr ) ;
    public final void rule__Exprs__ExpLAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5167:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5168:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5168:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5169:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExpLExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Exprs__ExpLAssignment_1_210356);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExpLExprParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__Exprs__ExpLAssignment_1_2"


    // $ANTLR start "rule__Command__VarLAssignment_1_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5178:1: rule__Command__VarLAssignment_1_0 : ( ruleVars ) ;
    public final void rule__Command__VarLAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5182:1: ( ( ruleVars ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5183:1: ( ruleVars )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5183:1: ( ruleVars )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5184:1: ruleVars
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getVarLVarsParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleVars_in_rule__Command__VarLAssignment_1_010387);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5193:1: rule__Command__ExpLAssignment_1_4 : ( ruleExprs ) ;
    public final void rule__Command__ExpLAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5197:1: ( ( ruleExprs ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5198:1: ( ruleExprs )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5198:1: ( ruleExprs )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5199:1: ruleExprs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpLExprsParserRuleCall_1_4_0()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_rule__Command__ExpLAssignment_1_410418);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5208:1: rule__Command__NomAssignment_2_0 : ( ( 'while' ) ) ;
    public final void rule__Command__NomAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5212:1: ( ( ( 'while' ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5213:1: ( ( 'while' ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5213:1: ( ( 'while' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5214:1: ( 'while' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomWhileKeyword_2_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5215:1: ( 'while' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5216:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomWhileKeyword_2_0_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__Command__NomAssignment_2_010454); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5231:1: rule__Command__ExpAssignment_2_2 : ( ruleExpr ) ;
    public final void rule__Command__ExpAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5235:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5236:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5236:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5237:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpExprParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_2_210493);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5246:1: rule__Command__C1Assignment_2_6 : ( ruleCommands ) ;
    public final void rule__Command__C1Assignment_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5250:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5251:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5251:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5252:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_2_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__C1Assignment_2_610524);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5261:1: rule__Command__NomAssignment_3_0 : ( ( 'for' ) ) ;
    public final void rule__Command__NomAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5265:1: ( ( ( 'for' ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5266:1: ( ( 'for' ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5266:1: ( ( 'for' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5267:1: ( 'for' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomForKeyword_3_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5268:1: ( 'for' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5269:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomForKeyword_3_0_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__Command__NomAssignment_3_010560); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5284:1: rule__Command__ExpAssignment_3_2 : ( ruleExpr ) ;
    public final void rule__Command__ExpAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5288:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5289:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5289:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5290:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpExprParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_3_210599);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5299:1: rule__Command__C1Assignment_3_6 : ( ruleCommands ) ;
    public final void rule__Command__C1Assignment_3_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5303:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5304:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5304:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5305:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_3_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__C1Assignment_3_610630);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5314:1: rule__Command__NomAssignment_4_0 : ( ( 'foreach' ) ) ;
    public final void rule__Command__NomAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5318:1: ( ( ( 'foreach' ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5319:1: ( ( 'foreach' ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5319:1: ( ( 'foreach' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5320:1: ( 'foreach' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomForeachKeyword_4_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5321:1: ( 'foreach' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5322:1: 'foreach'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomForeachKeyword_4_0_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__Command__NomAssignment_4_010666); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5337:1: rule__Command__Exp1Assignment_4_2 : ( ruleExpr ) ;
    public final void rule__Command__Exp1Assignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5341:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5342:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5342:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5343:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExp1ExprParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__Exp1Assignment_4_210705);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5352:1: rule__Command__Exp2Assignment_4_6 : ( ruleExpr ) ;
    public final void rule__Command__Exp2Assignment_4_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5356:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5357:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5357:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5358:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExp2ExprParserRuleCall_4_6_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__Exp2Assignment_4_610736);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5367:1: rule__Command__C1Assignment_4_10 : ( ruleCommands ) ;
    public final void rule__Command__C1Assignment_4_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5371:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5372:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5372:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5373:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_4_10_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__C1Assignment_4_1010767);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5382:1: rule__Command__NomAssignment_5_0 : ( ( 'if' ) ) ;
    public final void rule__Command__NomAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5386:1: ( ( ( 'if' ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5387:1: ( ( 'if' ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5387:1: ( ( 'if' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5388:1: ( 'if' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomIfKeyword_5_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5389:1: ( 'if' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5390:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomIfKeyword_5_0_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__Command__NomAssignment_5_010803); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5405:1: rule__Command__ExpAssignment_5_2 : ( ruleExpr ) ;
    public final void rule__Command__ExpAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5409:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5410:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5410:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5411:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpExprParserRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_5_210842);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5420:1: rule__Command__C1Assignment_5_6 : ( ruleCommands ) ;
    public final void rule__Command__C1Assignment_5_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5424:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5425:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5425:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5426:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_5_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__C1Assignment_5_610873);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5435:1: rule__Command__C2Assignment_5_8_2 : ( ruleCommands ) ;
    public final void rule__Command__C2Assignment_5_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5439:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5440:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5440:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5441:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC2CommandsParserRuleCall_5_8_2_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__C2Assignment_5_8_210904);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5450:1: rule__Expr__ExprSimpleAssignment_0 : ( ruleExprSimple ) ;
    public final void rule__Expr__ExprSimpleAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5454:1: ( ( ruleExprSimple ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5455:1: ( ruleExprSimple )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5455:1: ( ruleExprSimple )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5456:1: ruleExprSimple
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExprSimpleExprSimpleParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_rule__Expr__ExprSimpleAssignment_010935);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5465:1: rule__Expr__ExpEtAssignment_1 : ( ruleAnd ) ;
    public final void rule__Expr__ExpEtAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5469:1: ( ( ruleAnd ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5470:1: ( ruleAnd )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5470:1: ( ruleAnd )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5471:1: ruleAnd
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExpEtAndParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_rule__Expr__ExpEtAssignment_110966);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5480:1: rule__Expr__ExpTerminaleAssignment_2 : ( ruleExprTerm ) ;
    public final void rule__Expr__ExpTerminaleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5484:1: ( ( ruleExprTerm ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5485:1: ( ruleExprTerm )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5485:1: ( ruleExprTerm )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5486:1: ruleExprTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprAccess().getExpTerminaleExprTermParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExprTerm_in_rule__Expr__ExpTerminaleAssignment_210997);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5495:1: rule__And__ExpOuAssignment_0 : ( ruleOr ) ;
    public final void rule__And__ExpOuAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5499:1: ( ( ruleOr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5500:1: ( ruleOr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5500:1: ( ruleOr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5501:1: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getExpOuOrParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleOr_in_rule__And__ExpOuAssignment_011028);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5510:1: rule__And__ExpOu2Assignment_1_3 : ( ruleOr ) ;
    public final void rule__And__ExpOu2Assignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5514:1: ( ( ruleOr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5515:1: ( ruleOr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5515:1: ( ruleOr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5516:1: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getExpOu2OrParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleOr_in_rule__And__ExpOu2Assignment_1_311059);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5525:1: rule__Or__ExpNonAssignment_0 : ( ruleNot ) ;
    public final void rule__Or__ExpNonAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5529:1: ( ( ruleNot ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5530:1: ( ruleNot )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5530:1: ( ruleNot )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5531:1: ruleNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getExpNonNotParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleNot_in_rule__Or__ExpNonAssignment_011090);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5540:1: rule__Or__ExpNon2Assignment_1_3 : ( ruleNot ) ;
    public final void rule__Or__ExpNon2Assignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5544:1: ( ( ruleNot ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5545:1: ( ruleNot )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5545:1: ( ruleNot )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5546:1: ruleNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getExpNon2NotParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_ruleNot_in_rule__Or__ExpNon2Assignment_1_311121);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5555:1: rule__Not__NonAssignment_0_0 : ( ( 'not' ) ) ;
    public final void rule__Not__NonAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5559:1: ( ( ( 'not' ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5560:1: ( ( 'not' ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5560:1: ( ( 'not' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5561:1: ( 'not' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getNonNotKeyword_0_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5562:1: ( 'not' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5563:1: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getNonNotKeyword_0_0_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__Not__NonAssignment_0_011157); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5578:1: rule__Not__ExpEqAssignment_1 : ( ruleEq ) ;
    public final void rule__Not__ExpEqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5582:1: ( ( ruleEq ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5583:1: ( ruleEq )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5583:1: ( ruleEq )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5584:1: ruleEq
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getExpEqEqParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleEq_in_rule__Not__ExpEqAssignment_111196);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5593:1: rule__Eq__ExprEq1Assignment_0_0 : ( ( rule__Eq__ExprEq1Alternatives_0_0_0 ) ) ;
    public final void rule__Eq__ExprEq1Assignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5597:1: ( ( ( rule__Eq__ExprEq1Alternatives_0_0_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5598:1: ( ( rule__Eq__ExprEq1Alternatives_0_0_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5598:1: ( ( rule__Eq__ExprEq1Alternatives_0_0_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5599:1: ( rule__Eq__ExprEq1Alternatives_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getExprEq1Alternatives_0_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5600:1: ( rule__Eq__ExprEq1Alternatives_0_0_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5600:2: rule__Eq__ExprEq1Alternatives_0_0_0
            {
            pushFollow(FOLLOW_rule__Eq__ExprEq1Alternatives_0_0_0_in_rule__Eq__ExprEq1Assignment_0_011227);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5609:1: rule__Eq__ExprEq2Assignment_0_4 : ( ( rule__Eq__ExprEq2Alternatives_0_4_0 ) ) ;
    public final void rule__Eq__ExprEq2Assignment_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5613:1: ( ( ( rule__Eq__ExprEq2Alternatives_0_4_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5614:1: ( ( rule__Eq__ExprEq2Alternatives_0_4_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5614:1: ( ( rule__Eq__ExprEq2Alternatives_0_4_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5615:1: ( rule__Eq__ExprEq2Alternatives_0_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getExprEq2Alternatives_0_4_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5616:1: ( rule__Eq__ExprEq2Alternatives_0_4_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5616:2: rule__Eq__ExprEq2Alternatives_0_4_0
            {
            pushFollow(FOLLOW_rule__Eq__ExprEq2Alternatives_0_4_0_in_rule__Eq__ExprEq2Assignment_0_411260);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5625:1: rule__Eq__ExpAssignment_1_1 : ( ( rule__Eq__ExpAlternatives_1_1_0 ) ) ;
    public final void rule__Eq__ExpAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5629:1: ( ( ( rule__Eq__ExpAlternatives_1_1_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5630:1: ( ( rule__Eq__ExpAlternatives_1_1_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5630:1: ( ( rule__Eq__ExpAlternatives_1_1_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5631:1: ( rule__Eq__ExpAlternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getExpAlternatives_1_1_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5632:1: ( rule__Eq__ExpAlternatives_1_1_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5632:2: rule__Eq__ExpAlternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__Eq__ExpAlternatives_1_1_0_in_rule__Eq__ExpAssignment_1_111293);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5641:1: rule__ExprTerm__TermVarAssignment_1 : ( RULE_VARIABLE ) ;
    public final void rule__ExprTerm__TermVarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5645:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5646:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5646:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5647:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTermAccess().getTermVarVARIABLETerminalRuleCall_1_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__ExprTerm__TermVarAssignment_111326); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5656:1: rule__ExprTerm__TermSymAssignment_2 : ( RULE_SYMBOLES ) ;
    public final void rule__ExprTerm__TermSymAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5660:1: ( ( RULE_SYMBOLES ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5661:1: ( RULE_SYMBOLES )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5661:1: ( RULE_SYMBOLES )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5662:1: RULE_SYMBOLES
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprTermAccess().getTermSymSYMBOLESTerminalRuleCall_2_0()); 
            }
            match(input,RULE_SYMBOLES,FOLLOW_RULE_SYMBOLES_in_rule__ExprTerm__TermSymAssignment_211357); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5671:1: rule__ExprSimple__MotAssignment_1_0_0 : ( ( rule__ExprSimple__MotAlternatives_1_0_0_0 ) ) ;
    public final void rule__ExprSimple__MotAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5675:1: ( ( ( rule__ExprSimple__MotAlternatives_1_0_0_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5676:1: ( ( rule__ExprSimple__MotAlternatives_1_0_0_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5676:1: ( ( rule__ExprSimple__MotAlternatives_1_0_0_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5677:1: ( rule__ExprSimple__MotAlternatives_1_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getMotAlternatives_1_0_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5678:1: ( rule__ExprSimple__MotAlternatives_1_0_0_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5678:2: rule__ExprSimple__MotAlternatives_1_0_0_0
            {
            pushFollow(FOLLOW_rule__ExprSimple__MotAlternatives_1_0_0_0_in_rule__ExprSimple__MotAssignment_1_0_011388);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5687:1: rule__ExprSimple__LexprAssignment_1_0_1 : ( ruleLexpr ) ;
    public final void rule__ExprSimple__LexprAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5691:1: ( ( ruleLexpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5692:1: ( ruleLexpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5692:1: ( ruleLexpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5693:1: ruleLexpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLexprLexprParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_ruleLexpr_in_rule__ExprSimple__LexprAssignment_1_0_111421);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5702:1: rule__ExprSimple__MotAssignment_1_1_0 : ( ( rule__ExprSimple__MotAlternatives_1_1_0_0 ) ) ;
    public final void rule__ExprSimple__MotAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5706:1: ( ( ( rule__ExprSimple__MotAlternatives_1_1_0_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5707:1: ( ( rule__ExprSimple__MotAlternatives_1_1_0_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5707:1: ( ( rule__ExprSimple__MotAlternatives_1_1_0_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5708:1: ( rule__ExprSimple__MotAlternatives_1_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getMotAlternatives_1_1_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5709:1: ( rule__ExprSimple__MotAlternatives_1_1_0_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5709:2: rule__ExprSimple__MotAlternatives_1_1_0_0
            {
            pushFollow(FOLLOW_rule__ExprSimple__MotAlternatives_1_1_0_0_in_rule__ExprSimple__MotAssignment_1_1_011452);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5718:1: rule__ExprSimple__ExprAssignment_1_1_2 : ( ruleExpr ) ;
    public final void rule__ExprSimple__ExprAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5722:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5723:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5723:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5724:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprExprParserRuleCall_1_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprSimple__ExprAssignment_1_1_211485);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5733:1: rule__Lexpr__ExpAssignment_1 : ( ruleExpr ) ;
    public final void rule__Lexpr__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5737:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5738:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5738:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5739:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLexprAccess().getExpExprParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Lexpr__ExpAssignment_111516);
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
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA4_eotS =
        "\41\uffff";
    static final String DFA4_eofS =
        "\3\uffff\3\20\33\uffff";
    static final String DFA4_minS =
        "\2\5\1\uffff\3\4\4\0\4\uffff\1\0\5\uffff\1\0\5\uffff\1\0\6\uffff";
    static final String DFA4_maxS =
        "\1\53\1\46\1\uffff\3\45\4\0\4\uffff\1\0\5\uffff\1\0\5\uffff\1\0"+
        "\6\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\15\uffff\1\3\17\uffff\1\1";
    static final String DFA4_specialS =
        "\6\uffff\1\0\1\1\1\2\1\3\4\uffff\1\4\5\uffff\1\5\5\uffff\1\6\6\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\5\1\4\35\uffff\1\1\1\uffff\1\3\4\uffff\1\2",
            "\2\2\7\uffff\1\6\1\7\1\10\1\11\22\uffff\1\2\1\uffff\1\2",
            "",
            "\1\16\22\uffff\2\20\12\uffff\1\2\1\uffff\1\20",
            "\1\24\22\uffff\2\20\12\uffff\1\2\1\uffff\1\20",
            "\1\32\22\uffff\2\20\12\uffff\1\2\1\uffff\1\20",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
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
                        int LA4_6 = input.LA(1);

                         
                        int index4_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 32;}

                        else if ( (synpred9_InternalMyDsl()) ) {s = 2;}

                         
                        input.seek(index4_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_7 = input.LA(1);

                         
                        int index4_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 32;}

                        else if ( (synpred9_InternalMyDsl()) ) {s = 2;}

                         
                        input.seek(index4_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_8 = input.LA(1);

                         
                        int index4_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 32;}

                        else if ( (synpred9_InternalMyDsl()) ) {s = 2;}

                         
                        input.seek(index4_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_9 = input.LA(1);

                         
                        int index4_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred8_InternalMyDsl()) ) {s = 32;}

                        else if ( (synpred9_InternalMyDsl()) ) {s = 2;}

                         
                        input.seek(index4_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_14 = input.LA(1);

                         
                        int index4_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 2;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index4_14);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_20 = input.LA(1);

                         
                        int index4_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 2;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index4_20);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_26 = input.LA(1);

                         
                        int index4_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 2;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index4_26);
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
        "\2\uffff\1\1\2\uffff\1\2\7\uffff";
    static final String DFA5_specialS =
        "\15\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\2\35\uffff\1\1\1\uffff\1\2",
            "\2\5\7\uffff\4\2\22\uffff\1\5\1\uffff\1\5",
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
    static final String DFA27_eotS =
        "\24\uffff";
    static final String DFA27_eofS =
        "\1\1\3\uffff\1\1\17\uffff";
    static final String DFA27_minS =
        "\1\4\3\uffff\1\5\17\uffff";
    static final String DFA27_maxS =
        "\1\45\3\uffff\1\53\17\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\2\7\uffff\1\1\12\uffff";
    static final String DFA27_specialS =
        "\24\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\4\22\uffff\2\1\14\uffff\1\1",
            "",
            "",
            "",
            "\2\1\16\uffff\1\1\5\uffff\6\1\1\11\2\uffff\1\1\1\uffff\1\1"+
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
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "()* loopback of 3863:1: ( rule__And__Group_1__0 )*";
        }
    }
    static final String DFA28_eotS =
        "\25\uffff";
    static final String DFA28_eofS =
        "\1\1\1\uffff\1\1\22\uffff";
    static final String DFA28_minS =
        "\1\4\1\uffff\1\5\22\uffff";
    static final String DFA28_maxS =
        "\1\45\1\uffff\1\53\22\uffff";
    static final String DFA28_acceptS =
        "\1\uffff\1\2\17\uffff\1\1\3\uffff";
    static final String DFA28_specialS =
        "\25\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\2\22\uffff\2\1\14\uffff\1\1",
            "",
            "\2\1\16\uffff\1\1\5\uffff\7\1\1\21\1\uffff\1\1\1\uffff\1\1"+
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

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "()* loopback of 4049:1: ( rule__Or__Group_1__0 )*";
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
    public static final BitSet FOLLOW_rule__Vars__Group_1__0_in_rule__Vars__Group__1__Impl3932 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__0__Impl_in_rule__Vars__Group_1__03967 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__1_in_rule__Vars__Group_1__03970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Vars__Group_1__0__Impl3998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__1__Impl_in_rule__Vars__Group_1__14029 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__2_in_rule__Vars__Group_1__14032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Vars__Group_1__1__Impl4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__2__Impl_in_rule__Vars__Group_1__24091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__V2Assignment_1_2_in_rule__Vars__Group_1__2__Impl4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__04154 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__04157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__ExpAssignment_0_in_rule__Exprs__Group__0__Impl4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__14214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__0_in_rule__Exprs__Group__1__Impl4241 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__0__Impl_in_rule__Exprs__Group_1__04276 = new BitSet(new long[]{0x0000085000000070L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__1_in_rule__Exprs__Group_1__04279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Exprs__Group_1__0__Impl4307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__1__Impl_in_rule__Exprs__Group_1__14338 = new BitSet(new long[]{0x0000085000000070L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__2_in_rule__Exprs__Group_1__14341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Exprs__Group_1__1__Impl4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__2__Impl_in_rule__Exprs__Group_1__24400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__ExpLAssignment_1_2_in_rule__Exprs__Group_1__2__Impl4427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_0__0__Impl_in_rule__Command__Group_0__04463 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Command__Group_0__1_in_rule__Command__Group_0__04466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_0__1__Impl_in_rule__Command__Group_0__14524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Command__Group_0__1__Impl4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__0__Impl_in_rule__Command__Group_1__04587 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Command__Group_1__1_in_rule__Command__Group_1__04590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__VarLAssignment_1_0_in_rule__Command__Group_1__0__Impl4617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__1__Impl_in_rule__Command__Group_1__14647 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_rule__Command__Group_1__2_in_rule__Command__Group_1__14650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_1__1__Impl4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__2__Impl_in_rule__Command__Group_1__24709 = new BitSet(new long[]{0x0000085000000070L});
    public static final BitSet FOLLOW_rule__Command__Group_1__3_in_rule__Command__Group_1__24712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Command__Group_1__2__Impl4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__3__Impl_in_rule__Command__Group_1__34771 = new BitSet(new long[]{0x0000085000000070L});
    public static final BitSet FOLLOW_rule__Command__Group_1__4_in_rule__Command__Group_1__34774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_1__3__Impl4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__4__Impl_in_rule__Command__Group_1__44833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExpLAssignment_1_4_in_rule__Command__Group_1__4__Impl4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__0__Impl_in_rule__Command__Group_2__04900 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_2__1_in_rule__Command__Group_2__04903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NomAssignment_2_0_in_rule__Command__Group_2__0__Impl4930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__1__Impl_in_rule__Command__Group_2__14960 = new BitSet(new long[]{0x0000085000000070L});
    public static final BitSet FOLLOW_rule__Command__Group_2__2_in_rule__Command__Group_2__14963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_2__1__Impl4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__2__Impl_in_rule__Command__Group_2__25019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_2__3_in_rule__Command__Group_2__25022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExpAssignment_2_2_in_rule__Command__Group_2__2__Impl5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__3__Impl_in_rule__Command__Group_2__35079 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Command__Group_2__4_in_rule__Command__Group_2__35082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_2__3__Impl5109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__4__Impl_in_rule__Command__Group_2__45138 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_2__5_in_rule__Command__Group_2__45141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Command__Group_2__4__Impl5169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__5__Impl_in_rule__Command__Group_2__55200 = new BitSet(new long[]{0x0000078002000040L});
    public static final BitSet FOLLOW_rule__Command__Group_2__6_in_rule__Command__Group_2__55203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_2__5__Impl5230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__6__Impl_in_rule__Command__Group_2__65259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_2__7_in_rule__Command__Group_2__65262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__C1Assignment_2_6_in_rule__Command__Group_2__6__Impl5289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__7__Impl_in_rule__Command__Group_2__75319 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Command__Group_2__8_in_rule__Command__Group_2__75322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_2__7__Impl5349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__8__Impl_in_rule__Command__Group_2__85378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Command__Group_2__8__Impl5406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__0__Impl_in_rule__Command__Group_3__05455 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_3__1_in_rule__Command__Group_3__05458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NomAssignment_3_0_in_rule__Command__Group_3__0__Impl5485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__1__Impl_in_rule__Command__Group_3__15515 = new BitSet(new long[]{0x0000085000000070L});
    public static final BitSet FOLLOW_rule__Command__Group_3__2_in_rule__Command__Group_3__15518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_3__1__Impl5545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__2__Impl_in_rule__Command__Group_3__25574 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_3__3_in_rule__Command__Group_3__25577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExpAssignment_3_2_in_rule__Command__Group_3__2__Impl5604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__3__Impl_in_rule__Command__Group_3__35634 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Command__Group_3__4_in_rule__Command__Group_3__35637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_3__3__Impl5664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__4__Impl_in_rule__Command__Group_3__45693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_3__5_in_rule__Command__Group_3__45696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Command__Group_3__4__Impl5724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__5__Impl_in_rule__Command__Group_3__55755 = new BitSet(new long[]{0x0000078002000040L});
    public static final BitSet FOLLOW_rule__Command__Group_3__6_in_rule__Command__Group_3__55758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_3__5__Impl5785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__6__Impl_in_rule__Command__Group_3__65814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_3__7_in_rule__Command__Group_3__65817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__C1Assignment_3_6_in_rule__Command__Group_3__6__Impl5844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__7__Impl_in_rule__Command__Group_3__75874 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Command__Group_3__8_in_rule__Command__Group_3__75877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_3__7__Impl5904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__8__Impl_in_rule__Command__Group_3__85933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Command__Group_3__8__Impl5961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__0__Impl_in_rule__Command__Group_4__06010 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_4__1_in_rule__Command__Group_4__06013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NomAssignment_4_0_in_rule__Command__Group_4__0__Impl6040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__1__Impl_in_rule__Command__Group_4__16070 = new BitSet(new long[]{0x0000085000000070L});
    public static final BitSet FOLLOW_rule__Command__Group_4__2_in_rule__Command__Group_4__16073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__1__Impl6100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__2__Impl_in_rule__Command__Group_4__26129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_4__3_in_rule__Command__Group_4__26132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Exp1Assignment_4_2_in_rule__Command__Group_4__2__Impl6159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__3__Impl_in_rule__Command__Group_4__36189 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Command__Group_4__4_in_rule__Command__Group_4__36192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__3__Impl6219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__4__Impl_in_rule__Command__Group_4__46248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_4__5_in_rule__Command__Group_4__46251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Command__Group_4__4__Impl6279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__5__Impl_in_rule__Command__Group_4__56310 = new BitSet(new long[]{0x0000085000000070L});
    public static final BitSet FOLLOW_rule__Command__Group_4__6_in_rule__Command__Group_4__56313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__5__Impl6340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__6__Impl_in_rule__Command__Group_4__66369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_4__7_in_rule__Command__Group_4__66372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Exp2Assignment_4_6_in_rule__Command__Group_4__6__Impl6399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__7__Impl_in_rule__Command__Group_4__76429 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Command__Group_4__8_in_rule__Command__Group_4__76432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__7__Impl6459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__8__Impl_in_rule__Command__Group_4__86488 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_4__9_in_rule__Command__Group_4__86491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Command__Group_4__8__Impl6519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__9__Impl_in_rule__Command__Group_4__96550 = new BitSet(new long[]{0x0000078002000040L});
    public static final BitSet FOLLOW_rule__Command__Group_4__10_in_rule__Command__Group_4__96553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__9__Impl6580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__10__Impl_in_rule__Command__Group_4__106609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_4__11_in_rule__Command__Group_4__106612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__C1Assignment_4_10_in_rule__Command__Group_4__10__Impl6639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__11__Impl_in_rule__Command__Group_4__116669 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Command__Group_4__12_in_rule__Command__Group_4__116672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__11__Impl6699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__12__Impl_in_rule__Command__Group_4__126728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Command__Group_4__12__Impl6756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__0__Impl_in_rule__Command__Group_5__06813 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_5__1_in_rule__Command__Group_5__06816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NomAssignment_5_0_in_rule__Command__Group_5__0__Impl6843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__1__Impl_in_rule__Command__Group_5__16873 = new BitSet(new long[]{0x0000085000000070L});
    public static final BitSet FOLLOW_rule__Command__Group_5__2_in_rule__Command__Group_5__16876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5__1__Impl6903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__2__Impl_in_rule__Command__Group_5__26932 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_5__3_in_rule__Command__Group_5__26935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExpAssignment_5_2_in_rule__Command__Group_5__2__Impl6962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__3__Impl_in_rule__Command__Group_5__36992 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Command__Group_5__4_in_rule__Command__Group_5__36995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5__3__Impl7022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__4__Impl_in_rule__Command__Group_5__47051 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_5__5_in_rule__Command__Group_5__47054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Command__Group_5__4__Impl7082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__5__Impl_in_rule__Command__Group_5__57113 = new BitSet(new long[]{0x0000078002000040L});
    public static final BitSet FOLLOW_rule__Command__Group_5__6_in_rule__Command__Group_5__57116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5__5__Impl7143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__6__Impl_in_rule__Command__Group_5__67172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_5__7_in_rule__Command__Group_5__67175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__C1Assignment_5_6_in_rule__Command__Group_5__6__Impl7202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__7__Impl_in_rule__Command__Group_5__77232 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__Command__Group_5__8_in_rule__Command__Group_5__77235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5__7__Impl7262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__8__Impl_in_rule__Command__Group_5__87291 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__Command__Group_5__9_in_rule__Command__Group_5__87294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__0_in_rule__Command__Group_5__8__Impl7321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__9__Impl_in_rule__Command__Group_5__97352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Command__Group_5__9__Impl7380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__0__Impl_in_rule__Command__Group_5_8__07431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__1_in_rule__Command__Group_5_8__07434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Command__Group_5_8__0__Impl7462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__1__Impl_in_rule__Command__Group_5_8__17493 = new BitSet(new long[]{0x0000078002000040L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__2_in_rule__Command__Group_5_8__17496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5_8__1__Impl7523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__2__Impl_in_rule__Command__Group_5_8__27552 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__3_in_rule__Command__Group_5_8__27555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__C2Assignment_5_8_2_in_rule__Command__Group_5_8__2__Impl7582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__3__Impl_in_rule__Command__Group_5_8__37612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5_8__3__Impl7639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__07676 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__07679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__ExpOuAssignment_0_in_rule__And__Group__0__Impl7706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__17736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl7763 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__07798 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__07801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__And__Group_1__0__Impl7828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__17857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__17860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__And__Group_1__1__Impl7888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__27919 = new BitSet(new long[]{0x0000085000000060L});
    public static final BitSet FOLLOW_rule__And__Group_1__3_in_rule__And__Group_1__27922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__And__Group_1__2__Impl7949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__3__Impl_in_rule__And__Group_1__37978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__ExpOu2Assignment_1_3_in_rule__And__Group_1__3__Impl8005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__08043 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__08046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__ExpNonAssignment_0_in_rule__Or__Group__0__Impl8073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__18103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl8130 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__08165 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__08168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Or__Group_1__0__Impl8195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__18224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__18227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Or__Group_1__1__Impl8255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__28286 = new BitSet(new long[]{0x0000085000000060L});
    public static final BitSet FOLLOW_rule__Or__Group_1__3_in_rule__Or__Group_1__28289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Or__Group_1__2__Impl8316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__3__Impl_in_rule__Or__Group_1__38345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__ExpNon2Assignment_1_3_in_rule__Or__Group_1__3__Impl8372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__Group__0__Impl_in_rule__Not__Group__08410 = new BitSet(new long[]{0x0000085000000060L});
    public static final BitSet FOLLOW_rule__Not__Group__1_in_rule__Not__Group__08413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__Group_0__0_in_rule__Not__Group__0__Impl8440 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Not__Group__1__Impl_in_rule__Not__Group__18471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__ExpEqAssignment_1_in_rule__Not__Group__1__Impl8498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__Group_0__0__Impl_in_rule__Not__Group_0__08532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Not__Group_0__1_in_rule__Not__Group_0__08535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__NonAssignment_0_0_in_rule__Not__Group_0__0__Impl8562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__Group_0__1__Impl_in_rule__Not__Group_0__18592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Not__Group_0__1__Impl8619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__0__Impl_in_rule__Eq__Group_0__08652 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__1_in_rule__Eq__Group_0__08655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__ExprEq1Assignment_0_0_in_rule__Eq__Group_0__0__Impl8682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__1__Impl_in_rule__Eq__Group_0__18712 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__2_in_rule__Eq__Group_0__18715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Eq__Group_0__1__Impl8743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__2__Impl_in_rule__Eq__Group_0__28774 = new BitSet(new long[]{0x0000005000000070L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__3_in_rule__Eq__Group_0__28777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Eq__Group_0__2__Impl8805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__3__Impl_in_rule__Eq__Group_0__38836 = new BitSet(new long[]{0x0000005000000070L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__4_in_rule__Eq__Group_0__38839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Eq__Group_0__3__Impl8867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__4__Impl_in_rule__Eq__Group_0__48898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__ExprEq2Assignment_0_4_in_rule__Eq__Group_0__4__Impl8925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__0__Impl_in_rule__Eq__Group_1__08965 = new BitSet(new long[]{0x0000005000000060L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__1_in_rule__Eq__Group_1__08968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Eq__Group_1__0__Impl8996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__1__Impl_in_rule__Eq__Group_1__19027 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__2_in_rule__Eq__Group_1__19030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__ExpAssignment_1_1_in_rule__Eq__Group_1__1__Impl9057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__2__Impl_in_rule__Eq__Group_1__29087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Eq__Group_1__2__Impl9115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTerm__Group_0__0__Impl_in_rule__ExprTerm__Group_0__09152 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__ExprTerm__Group_0__1_in_rule__ExprTerm__Group_0__09155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprTerm__Group_0__1__Impl_in_rule__ExprTerm__Group_0__19213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ExprTerm__Group_0__1__Impl9241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__0__Impl_in_rule__ExprSimple__Group__09276 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__1_in_rule__ExprSimple__Group__09279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ExprSimple__Group__0__Impl9307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__1__Impl_in_rule__ExprSimple__Group__19338 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__2_in_rule__ExprSimple__Group__19341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Alternatives_1_in_rule__ExprSimple__Group__1__Impl9368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__2__Impl_in_rule__ExprSimple__Group__29398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ExprSimple__Group__2__Impl9426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_0__0__Impl_in_rule__ExprSimple__Group_1_0__09463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_0__1_in_rule__ExprSimple__Group_1_0__09466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__MotAssignment_1_0_0_in_rule__ExprSimple__Group_1_0__0__Impl9493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_0__1__Impl_in_rule__ExprSimple__Group_1_0__19523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__LexprAssignment_1_0_1_in_rule__ExprSimple__Group_1_0__1__Impl9550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__0__Impl_in_rule__ExprSimple__Group_1_1__09584 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__1_in_rule__ExprSimple__Group_1_1__09587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__MotAssignment_1_1_0_in_rule__ExprSimple__Group_1_1__0__Impl9614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__1__Impl_in_rule__ExprSimple__Group_1_1__19644 = new BitSet(new long[]{0x0000085000000070L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__2_in_rule__ExprSimple__Group_1_1__19647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__ExprSimple__Group_1_1__1__Impl9674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__2__Impl_in_rule__ExprSimple__Group_1_1__29703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__ExprAssignment_1_1_2_in_rule__ExprSimple__Group_1_1__2__Impl9730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lexpr__Group__0__Impl_in_rule__Lexpr__Group__09766 = new BitSet(new long[]{0x0000085000000070L});
    public static final BitSet FOLLOW_rule__Lexpr__Group__1_in_rule__Lexpr__Group__09769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Lexpr__Group__0__Impl9796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lexpr__Group__1__Impl_in_rule__Lexpr__Group__19825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lexpr__ExpAssignment_1_in_rule__Lexpr__Group__1__Impl9852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_rule__Model__ModelAssignment_09891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOLES_in_rule__Function__FunNameAssignment_29922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefiniton_in_rule__Function__DefAssignment_59953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_rule__Definiton__InputVarsAssignment_29984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Definiton__CommandListAssignment_510015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_rule__Definiton__OutputVarsAssignment_1010046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Input__VAssignment_010077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Input__V2Assignment_1_210108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Output__VAssignment_010139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Output__V2Assignment_1_210170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Commands__CAssignment_010201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Commands__CAssignment_1_210232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Vars__V1Assignment_010263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Vars__V2Assignment_1_210294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Exprs__ExpAssignment_010325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Exprs__ExpLAssignment_1_210356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_rule__Command__VarLAssignment_1_010387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_rule__Command__ExpLAssignment_1_410418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Command__NomAssignment_2_010454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_2_210493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__C1Assignment_2_610524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Command__NomAssignment_3_010560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_3_210599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__C1Assignment_3_610630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Command__NomAssignment_4_010666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__Exp1Assignment_4_210705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__Exp2Assignment_4_610736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__C1Assignment_4_1010767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Command__NomAssignment_5_010803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_5_210842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__C1Assignment_5_610873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__C2Assignment_5_8_210904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Expr__ExprSimpleAssignment_010935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Expr__ExpEtAssignment_110966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_rule__Expr__ExpTerminaleAssignment_210997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rule__And__ExpOuAssignment_011028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rule__And__ExpOu2Assignment_1_311059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_rule__Or__ExpNonAssignment_011090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_rule__Or__ExpNon2Assignment_1_311121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Not__NonAssignment_0_011157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEq_in_rule__Not__ExpEqAssignment_111196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__ExprEq1Alternatives_0_0_0_in_rule__Eq__ExprEq1Assignment_0_011227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__ExprEq2Alternatives_0_4_0_in_rule__Eq__ExprEq2Assignment_0_411260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__ExpAlternatives_1_1_0_in_rule__Eq__ExpAssignment_1_111293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__ExprTerm__TermVarAssignment_111326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOLES_in_rule__ExprTerm__TermSymAssignment_211357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__MotAlternatives_1_0_0_0_in_rule__ExprSimple__MotAssignment_1_0_011388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLexpr_in_rule__ExprSimple__LexprAssignment_1_0_111421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__MotAlternatives_1_1_0_0_in_rule__ExprSimple__MotAssignment_1_1_011452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprSimple__ExprAssignment_1_1_211485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Lexpr__ExpAssignment_111516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExprSimpleAssignment_0_in_synpred8_InternalMyDsl1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__ExpEtAssignment_1_in_synpred9_InternalMyDsl1264 = new BitSet(new long[]{0x0000000000000002L});

}