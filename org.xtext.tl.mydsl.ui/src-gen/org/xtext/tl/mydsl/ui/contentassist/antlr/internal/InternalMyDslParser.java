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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VARIABLE", "RULE_SYMBOLES", "RULE_LC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'nil'", "'cons'", "'list'", "'hd'", "'tl'", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'do'", "'od'", "'in'", "'then'", "'fi'", "'else'", "'and'", "'or'", "'not'", "'=?'", "'('", "')'", "'while'", "'for'", "'foreach'", "'if'"
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
    public static final int RULE_LC=6;
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
    public static final int RULE_VARIABLE=4;
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

                if ( (LA1_0==19) ) {
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


    // $ANTLR start "entryRulefunction"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:91:1: entryRulefunction : rulefunction EOF ;
    public final void entryRulefunction() throws RecognitionException {
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:92:1: ( rulefunction EOF )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:93:1: rulefunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_rulefunction_in_entryRulefunction137);
            rulefunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction144); if (state.failed) return ;

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
    // $ANTLR end "entryRulefunction"


    // $ANTLR start "rulefunction"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:100:1: rulefunction : ( ( rule__Function__Group__0 ) ) ;
    public final void rulefunction() throws RecognitionException {

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
            pushFollow(FOLLOW_rule__Function__Group__0_in_rulefunction170);
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
    // $ANTLR end "rulefunction"


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
            case 26:
                {
                alt3=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt3=2;
                }
                break;
            case 40:
                {
                alt3=3;
                }
                break;
            case 41:
                {
                alt3=4;
                }
                break;
            case 42:
                {
                alt3=5;
                }
                break;
            case 43:
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:592:1: rule__Expr__Alternatives : ( ( ruleExprSimple ) | ( ruleAnd ) | ( ruleExprTerm ) );
    public final void rule__Expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:596:1: ( ( ruleExprSimple ) | ( ruleAnd ) | ( ruleExprTerm ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ( ruleExprSimple )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ( ruleExprSimple )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:598:1: ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getExprSimpleParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_rule__Expr__Alternatives1246);
                    ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprAccess().getExprSimpleParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:603:6: ( ruleAnd )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:603:6: ( ruleAnd )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:604:1: ruleAnd
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getAndParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAnd_in_rule__Expr__Alternatives1263);
                    ruleAnd();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprAccess().getAndParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:609:6: ( ruleExprTerm )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:609:6: ( ruleExprTerm )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:610:1: ruleExprTerm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getExprTermParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleExprTerm_in_rule__Expr__Alternatives1280);
                    ruleExprTerm();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprAccess().getExprTermParserRuleCall_2()); 
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
                    pushFollow(FOLLOW_rule__Eq__Group_0__0_in_rule__Eq__Alternatives1312);
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
                    pushFollow(FOLLOW_rule__Eq__Group_1__0_in_rule__Eq__Alternatives1330);
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


    // $ANTLR start "rule__Eq__Alternatives_0_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:642:1: rule__Eq__Alternatives_0_0 : ( ( ruleExprSimple ) | ( ruleExprTerm ) );
    public final void rule__Eq__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:646:1: ( ( ruleExprSimple ) | ( ruleExprTerm ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==38) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_VARIABLE && LA6_0<=RULE_SYMBOLES)||LA6_0==14) ) {
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
                       before(grammarAccess.getEqAccess().getExprSimpleParserRuleCall_0_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_rule__Eq__Alternatives_0_01363);
                    ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqAccess().getExprSimpleParserRuleCall_0_0_0()); 
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
                       before(grammarAccess.getEqAccess().getExprTermParserRuleCall_0_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleExprTerm_in_rule__Eq__Alternatives_0_01380);
                    ruleExprTerm();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqAccess().getExprTermParserRuleCall_0_0_1()); 
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
    // $ANTLR end "rule__Eq__Alternatives_0_0"


    // $ANTLR start "rule__Eq__Alternatives_0_4"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: rule__Eq__Alternatives_0_4 : ( ( ruleExprSimple ) | ( ruleExprTerm ) );
    public final void rule__Eq__Alternatives_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:668:1: ( ( ruleExprSimple ) | ( ruleExprTerm ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==38) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_VARIABLE && LA7_0<=RULE_SYMBOLES)||LA7_0==14) ) {
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
                       before(grammarAccess.getEqAccess().getExprSimpleParserRuleCall_0_4_0()); 
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_rule__Eq__Alternatives_0_41412);
                    ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqAccess().getExprSimpleParserRuleCall_0_4_0()); 
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
                       before(grammarAccess.getEqAccess().getExprTermParserRuleCall_0_4_1()); 
                    }
                    pushFollow(FOLLOW_ruleExprTerm_in_rule__Eq__Alternatives_0_41429);
                    ruleExprTerm();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqAccess().getExprTermParserRuleCall_0_4_1()); 
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
    // $ANTLR end "rule__Eq__Alternatives_0_4"


    // $ANTLR start "rule__Eq__Alternatives_1_1"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:686:1: rule__Eq__Alternatives_1_1 : ( ( ruleExprTerm ) | ( ruleExprSimple ) );
    public final void rule__Eq__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:690:1: ( ( ruleExprTerm ) | ( ruleExprSimple ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_VARIABLE && LA8_0<=RULE_SYMBOLES)||LA8_0==14) ) {
                alt8=1;
            }
            else if ( (LA8_0==38) ) {
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
                       before(grammarAccess.getEqAccess().getExprTermParserRuleCall_1_1_0()); 
                    }
                    pushFollow(FOLLOW_ruleExprTerm_in_rule__Eq__Alternatives_1_11461);
                    ruleExprTerm();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqAccess().getExprTermParserRuleCall_1_1_0()); 
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
                       before(grammarAccess.getEqAccess().getExprSimpleParserRuleCall_1_1_1()); 
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_rule__Eq__Alternatives_1_11478);
                    ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEqAccess().getExprSimpleParserRuleCall_1_1_1()); 
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
    // $ANTLR end "rule__Eq__Alternatives_1_1"


    // $ANTLR start "rule__ExprTerm__Alternatives"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: rule__ExprTerm__Alternatives : ( ( 'nil' ) | ( RULE_VARIABLE ) | ( RULE_SYMBOLES ) );
    public final void rule__ExprTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:712:1: ( ( 'nil' ) | ( RULE_VARIABLE ) | ( RULE_SYMBOLES ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 14:
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:713:1: ( 'nil' )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:713:1: ( 'nil' )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:714:1: 'nil'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprTermAccess().getNilKeyword_0()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__ExprTerm__Alternatives1511); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprTermAccess().getNilKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:721:6: ( RULE_VARIABLE )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:721:6: ( RULE_VARIABLE )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:722:1: RULE_VARIABLE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprTermAccess().getVARIABLETerminalRuleCall_1()); 
                    }
                    match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__ExprTerm__Alternatives1530); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprTermAccess().getVARIABLETerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:727:6: ( RULE_SYMBOLES )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:727:6: ( RULE_SYMBOLES )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:728:1: RULE_SYMBOLES
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprTermAccess().getSYMBOLESTerminalRuleCall_2()); 
                    }
                    match(input,RULE_SYMBOLES,FOLLOW_RULE_SYMBOLES_in_rule__ExprTerm__Alternatives1547); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprTermAccess().getSYMBOLESTerminalRuleCall_2()); 
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:738:1: rule__ExprSimple__Alternatives_1 : ( ( ( rule__ExprSimple__Group_1_0__0 ) ) | ( ( rule__ExprSimple__Group_1_1__0 ) ) );
    public final void rule__ExprSimple__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:742:1: ( ( ( rule__ExprSimple__Group_1_0__0 ) ) | ( ( rule__ExprSimple__Group_1_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=15 && LA10_0<=16)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=17 && LA10_0<=18)) ) {
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:743:1: ( ( rule__ExprSimple__Group_1_0__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:743:1: ( ( rule__ExprSimple__Group_1_0__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:744:1: ( rule__ExprSimple__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_1_0()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:745:1: ( rule__ExprSimple__Group_1_0__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:745:2: rule__ExprSimple__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_1_0__0_in_rule__ExprSimple__Alternatives_11579);
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:749:6: ( ( rule__ExprSimple__Group_1_1__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:749:6: ( ( rule__ExprSimple__Group_1_1__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:750:1: ( rule__ExprSimple__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_1_1()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:751:1: ( rule__ExprSimple__Group_1_1__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:751:2: rule__ExprSimple__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__0_in_rule__ExprSimple__Alternatives_11597);
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


    // $ANTLR start "rule__ExprSimple__Alternatives_1_0_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:760:1: rule__ExprSimple__Alternatives_1_0_0 : ( ( 'cons' ) | ( 'list' ) );
    public final void rule__ExprSimple__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:764:1: ( ( 'cons' ) | ( 'list' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            else if ( (LA11_0==16) ) {
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:765:1: ( 'cons' )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:765:1: ( 'cons' )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:766:1: 'cons'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getConsKeyword_1_0_0_0()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__ExprSimple__Alternatives_1_0_01631); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getConsKeyword_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:773:6: ( 'list' )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:773:6: ( 'list' )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:774:1: 'list'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getListKeyword_1_0_0_1()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__ExprSimple__Alternatives_1_0_01651); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getListKeyword_1_0_0_1()); 
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
    // $ANTLR end "rule__ExprSimple__Alternatives_1_0_0"


    // $ANTLR start "rule__ExprSimple__Alternatives_1_1_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:786:1: rule__ExprSimple__Alternatives_1_1_0 : ( ( 'hd' ) | ( 'tl' ) );
    public final void rule__ExprSimple__Alternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: ( ( 'hd' ) | ( 'tl' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            else if ( (LA12_0==18) ) {
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:791:1: ( 'hd' )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:791:1: ( 'hd' )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:792:1: 'hd'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getHdKeyword_1_1_0_0()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__ExprSimple__Alternatives_1_1_01686); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getHdKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:799:6: ( 'tl' )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:799:6: ( 'tl' )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:800:1: 'tl'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getTlKeyword_1_1_0_1()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__ExprSimple__Alternatives_1_1_01706); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getTlKeyword_1_1_0_1()); 
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
    // $ANTLR end "rule__ExprSimple__Alternatives_1_1_0"


    // $ANTLR start "rule__Model__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:814:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:818:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:819:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01738);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01741);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:826:1: rule__Model__Group__0__Impl : ( ( rule__Model__ModelAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:830:1: ( ( ( rule__Model__ModelAssignment_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( ( rule__Model__ModelAssignment_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( ( rule__Model__ModelAssignment_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: ( rule__Model__ModelAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelAssignment_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:833:1: ( rule__Model__ModelAssignment_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:833:2: rule__Model__ModelAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__ModelAssignment_0_in_rule__Model__Group__0__Impl1768);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:843:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:847:1: ( rule__Model__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:848:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11798);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:854:1: rule__Model__Group__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:859:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:859:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:860:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getLCTerminalRuleCall_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:861:1: ( RULE_LC )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_LC) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:861:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Model__Group__1__Impl1826); if (state.failed) return ;

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:875:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:879:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:880:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__01861);
            rule__Function__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__01864);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:887:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:891:1: ( ( 'function' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:892:1: ( 'function' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:892:1: ( 'function' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:893:1: 'function'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            }
            match(input,19,FOLLOW_19_in_rule__Function__Group__0__Impl1892); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:906:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:910:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:911:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__11923);
            rule__Function__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__11926);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:918:1: rule__Function__Group__1__Impl : ( RULE_LC ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:922:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:923:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:923:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:924:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getLCTerminalRuleCall_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Function__Group__1__Impl1953); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:935:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:939:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:940:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__21982);
            rule__Function__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__21985);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:947:1: rule__Function__Group__2__Impl : ( ( rule__Function__FunNameAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:951:1: ( ( ( rule__Function__FunNameAssignment_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:952:1: ( ( rule__Function__FunNameAssignment_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:952:1: ( ( rule__Function__FunNameAssignment_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:953:1: ( rule__Function__FunNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFunNameAssignment_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:954:1: ( rule__Function__FunNameAssignment_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:954:2: rule__Function__FunNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Function__FunNameAssignment_2_in_rule__Function__Group__2__Impl2012);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:964:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:968:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:969:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__32042);
            rule__Function__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__32045);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:976:1: rule__Function__Group__3__Impl : ( ':' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:980:1: ( ( ':' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:981:1: ( ':' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:981:1: ( ':' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:982:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getColonKeyword_3()); 
            }
            match(input,20,FOLLOW_20_in_rule__Function__Group__3__Impl2073); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:995:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:999:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1000:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__42104);
            rule__Function__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__5_in_rule__Function__Group__42107);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:1: rule__Function__Group__4__Impl : ( RULE_LC ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1011:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1012:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1012:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getLCTerminalRuleCall_4()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Function__Group__4__Impl2134); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1024:1: rule__Function__Group__5 : rule__Function__Group__5__Impl ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1028:1: ( rule__Function__Group__5__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:2: rule__Function__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__52163);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1035:1: rule__Function__Group__5__Impl : ( ( rule__Function__DefAssignment_5 ) ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1039:1: ( ( ( rule__Function__DefAssignment_5 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1040:1: ( ( rule__Function__DefAssignment_5 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1040:1: ( ( rule__Function__DefAssignment_5 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1041:1: ( rule__Function__DefAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getDefAssignment_5()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:1: ( rule__Function__DefAssignment_5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:2: rule__Function__DefAssignment_5
            {
            pushFollow(FOLLOW_rule__Function__DefAssignment_5_in_rule__Function__Group__5__Impl2190);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1064:1: rule__Definiton__Group__0 : rule__Definiton__Group__0__Impl rule__Definiton__Group__1 ;
    public final void rule__Definiton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:1: ( rule__Definiton__Group__0__Impl rule__Definiton__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1069:2: rule__Definiton__Group__0__Impl rule__Definiton__Group__1
            {
            pushFollow(FOLLOW_rule__Definiton__Group__0__Impl_in_rule__Definiton__Group__02232);
            rule__Definiton__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__1_in_rule__Definiton__Group__02235);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1076:1: rule__Definiton__Group__0__Impl : ( 'read' ) ;
    public final void rule__Definiton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1080:1: ( ( 'read' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:1: ( 'read' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:1: ( 'read' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1082:1: 'read'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getReadKeyword_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Definiton__Group__0__Impl2263); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1095:1: rule__Definiton__Group__1 : rule__Definiton__Group__1__Impl rule__Definiton__Group__2 ;
    public final void rule__Definiton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1099:1: ( rule__Definiton__Group__1__Impl rule__Definiton__Group__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1100:2: rule__Definiton__Group__1__Impl rule__Definiton__Group__2
            {
            pushFollow(FOLLOW_rule__Definiton__Group__1__Impl_in_rule__Definiton__Group__12294);
            rule__Definiton__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__2_in_rule__Definiton__Group__12297);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1107:1: rule__Definiton__Group__1__Impl : ( RULE_LC ) ;
    public final void rule__Definiton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1111:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1112:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1113:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Definiton__Group__1__Impl2324); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1124:1: rule__Definiton__Group__2 : rule__Definiton__Group__2__Impl rule__Definiton__Group__3 ;
    public final void rule__Definiton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1128:1: ( rule__Definiton__Group__2__Impl rule__Definiton__Group__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1129:2: rule__Definiton__Group__2__Impl rule__Definiton__Group__3
            {
            pushFollow(FOLLOW_rule__Definiton__Group__2__Impl_in_rule__Definiton__Group__22353);
            rule__Definiton__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__3_in_rule__Definiton__Group__22356);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1136:1: rule__Definiton__Group__2__Impl : ( ( rule__Definiton__InputVarsAssignment_2 ) ) ;
    public final void rule__Definiton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1140:1: ( ( ( rule__Definiton__InputVarsAssignment_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1141:1: ( ( rule__Definiton__InputVarsAssignment_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1141:1: ( ( rule__Definiton__InputVarsAssignment_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: ( rule__Definiton__InputVarsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getInputVarsAssignment_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1143:1: ( rule__Definiton__InputVarsAssignment_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1143:2: rule__Definiton__InputVarsAssignment_2
            {
            pushFollow(FOLLOW_rule__Definiton__InputVarsAssignment_2_in_rule__Definiton__Group__2__Impl2383);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1153:1: rule__Definiton__Group__3 : rule__Definiton__Group__3__Impl rule__Definiton__Group__4 ;
    public final void rule__Definiton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1157:1: ( rule__Definiton__Group__3__Impl rule__Definiton__Group__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1158:2: rule__Definiton__Group__3__Impl rule__Definiton__Group__4
            {
            pushFollow(FOLLOW_rule__Definiton__Group__3__Impl_in_rule__Definiton__Group__32413);
            rule__Definiton__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__4_in_rule__Definiton__Group__32416);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1165:1: rule__Definiton__Group__3__Impl : ( RULE_LC ) ;
    public final void rule__Definiton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1171:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Definiton__Group__3__Impl2443); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1182:1: rule__Definiton__Group__4 : rule__Definiton__Group__4__Impl rule__Definiton__Group__5 ;
    public final void rule__Definiton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1186:1: ( rule__Definiton__Group__4__Impl rule__Definiton__Group__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1187:2: rule__Definiton__Group__4__Impl rule__Definiton__Group__5
            {
            pushFollow(FOLLOW_rule__Definiton__Group__4__Impl_in_rule__Definiton__Group__42472);
            rule__Definiton__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__5_in_rule__Definiton__Group__42475);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1194:1: rule__Definiton__Group__4__Impl : ( '%' ) ;
    public final void rule__Definiton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1198:1: ( ( '%' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1199:1: ( '%' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1199:1: ( '%' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1200:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getPercentSignKeyword_4()); 
            }
            match(input,22,FOLLOW_22_in_rule__Definiton__Group__4__Impl2503); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1213:1: rule__Definiton__Group__5 : rule__Definiton__Group__5__Impl rule__Definiton__Group__6 ;
    public final void rule__Definiton__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1217:1: ( rule__Definiton__Group__5__Impl rule__Definiton__Group__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1218:2: rule__Definiton__Group__5__Impl rule__Definiton__Group__6
            {
            pushFollow(FOLLOW_rule__Definiton__Group__5__Impl_in_rule__Definiton__Group__52534);
            rule__Definiton__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__6_in_rule__Definiton__Group__52537);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1225:1: rule__Definiton__Group__5__Impl : ( ( rule__Definiton__CommandListAssignment_5 ) ) ;
    public final void rule__Definiton__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:1: ( ( ( rule__Definiton__CommandListAssignment_5 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:1: ( ( rule__Definiton__CommandListAssignment_5 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:1: ( ( rule__Definiton__CommandListAssignment_5 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:1: ( rule__Definiton__CommandListAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getCommandListAssignment_5()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1232:1: ( rule__Definiton__CommandListAssignment_5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1232:2: rule__Definiton__CommandListAssignment_5
            {
            pushFollow(FOLLOW_rule__Definiton__CommandListAssignment_5_in_rule__Definiton__Group__5__Impl2564);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1242:1: rule__Definiton__Group__6 : rule__Definiton__Group__6__Impl rule__Definiton__Group__7 ;
    public final void rule__Definiton__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1246:1: ( rule__Definiton__Group__6__Impl rule__Definiton__Group__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1247:2: rule__Definiton__Group__6__Impl rule__Definiton__Group__7
            {
            pushFollow(FOLLOW_rule__Definiton__Group__6__Impl_in_rule__Definiton__Group__62594);
            rule__Definiton__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__7_in_rule__Definiton__Group__62597);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1254:1: rule__Definiton__Group__6__Impl : ( RULE_LC ) ;
    public final void rule__Definiton__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1258:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1260:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_6()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Definiton__Group__6__Impl2624); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1271:1: rule__Definiton__Group__7 : rule__Definiton__Group__7__Impl rule__Definiton__Group__8 ;
    public final void rule__Definiton__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1275:1: ( rule__Definiton__Group__7__Impl rule__Definiton__Group__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1276:2: rule__Definiton__Group__7__Impl rule__Definiton__Group__8
            {
            pushFollow(FOLLOW_rule__Definiton__Group__7__Impl_in_rule__Definiton__Group__72653);
            rule__Definiton__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__8_in_rule__Definiton__Group__72656);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1283:1: rule__Definiton__Group__7__Impl : ( '%' ) ;
    public final void rule__Definiton__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1287:1: ( ( '%' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:1: ( '%' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1288:1: ( '%' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1289:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getPercentSignKeyword_7()); 
            }
            match(input,22,FOLLOW_22_in_rule__Definiton__Group__7__Impl2684); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1302:1: rule__Definiton__Group__8 : rule__Definiton__Group__8__Impl rule__Definiton__Group__9 ;
    public final void rule__Definiton__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1306:1: ( rule__Definiton__Group__8__Impl rule__Definiton__Group__9 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1307:2: rule__Definiton__Group__8__Impl rule__Definiton__Group__9
            {
            pushFollow(FOLLOW_rule__Definiton__Group__8__Impl_in_rule__Definiton__Group__82715);
            rule__Definiton__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__9_in_rule__Definiton__Group__82718);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1314:1: rule__Definiton__Group__8__Impl : ( 'write' ) ;
    public final void rule__Definiton__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1318:1: ( ( 'write' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:1: ( 'write' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:1: ( 'write' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1320:1: 'write'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getWriteKeyword_8()); 
            }
            match(input,23,FOLLOW_23_in_rule__Definiton__Group__8__Impl2746); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1333:1: rule__Definiton__Group__9 : rule__Definiton__Group__9__Impl rule__Definiton__Group__10 ;
    public final void rule__Definiton__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1337:1: ( rule__Definiton__Group__9__Impl rule__Definiton__Group__10 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1338:2: rule__Definiton__Group__9__Impl rule__Definiton__Group__10
            {
            pushFollow(FOLLOW_rule__Definiton__Group__9__Impl_in_rule__Definiton__Group__92777);
            rule__Definiton__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__10_in_rule__Definiton__Group__92780);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1345:1: rule__Definiton__Group__9__Impl : ( RULE_LC ) ;
    public final void rule__Definiton__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1349:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1350:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1350:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1351:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_9()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Definiton__Group__9__Impl2807); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1362:1: rule__Definiton__Group__10 : rule__Definiton__Group__10__Impl ;
    public final void rule__Definiton__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1366:1: ( rule__Definiton__Group__10__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1367:2: rule__Definiton__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Definiton__Group__10__Impl_in_rule__Definiton__Group__102836);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1373:1: rule__Definiton__Group__10__Impl : ( ( rule__Definiton__OutputVarsAssignment_10 ) ) ;
    public final void rule__Definiton__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1377:1: ( ( ( rule__Definiton__OutputVarsAssignment_10 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1378:1: ( ( rule__Definiton__OutputVarsAssignment_10 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1378:1: ( ( rule__Definiton__OutputVarsAssignment_10 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1379:1: ( rule__Definiton__OutputVarsAssignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getOutputVarsAssignment_10()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1380:1: ( rule__Definiton__OutputVarsAssignment_10 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1380:2: rule__Definiton__OutputVarsAssignment_10
            {
            pushFollow(FOLLOW_rule__Definiton__OutputVarsAssignment_10_in_rule__Definiton__Group__10__Impl2863);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1412:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1416:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1417:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__02915);
            rule__Input__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group__1_in_rule__Input__Group__02918);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1424:1: rule__Input__Group__0__Impl : ( RULE_VARIABLE ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1428:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1430:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVARIABLETerminalRuleCall_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Input__Group__0__Impl2945); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVARIABLETerminalRuleCall_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1441:1: rule__Input__Group__1 : rule__Input__Group__1__Impl ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1445:1: ( rule__Input__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1446:2: rule__Input__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__12974);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1452:1: rule__Input__Group__1__Impl : ( ( rule__Input__Group_1__0 )* ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1456:1: ( ( ( rule__Input__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:1: ( ( rule__Input__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1457:1: ( ( rule__Input__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1458:1: ( rule__Input__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1459:1: ( rule__Input__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1459:2: rule__Input__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Input__Group_1__0_in_rule__Input__Group__1__Impl3001);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1473:1: rule__Input__Group_1__0 : rule__Input__Group_1__0__Impl rule__Input__Group_1__1 ;
    public final void rule__Input__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1477:1: ( rule__Input__Group_1__0__Impl rule__Input__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1478:2: rule__Input__Group_1__0__Impl rule__Input__Group_1__1
            {
            pushFollow(FOLLOW_rule__Input__Group_1__0__Impl_in_rule__Input__Group_1__03036);
            rule__Input__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_1__1_in_rule__Input__Group_1__03039);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1485:1: rule__Input__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Input__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1489:1: ( ( ',' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1490:1: ( ',' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1490:1: ( ',' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1491:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getCommaKeyword_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Input__Group_1__0__Impl3067); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1504:1: rule__Input__Group_1__1 : rule__Input__Group_1__1__Impl rule__Input__Group_1__2 ;
    public final void rule__Input__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1508:1: ( rule__Input__Group_1__1__Impl rule__Input__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1509:2: rule__Input__Group_1__1__Impl rule__Input__Group_1__2
            {
            pushFollow(FOLLOW_rule__Input__Group_1__1__Impl_in_rule__Input__Group_1__13098);
            rule__Input__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_1__2_in_rule__Input__Group_1__13101);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1516:1: rule__Input__Group_1__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Input__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1520:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1521:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1521:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1522:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getLCTerminalRuleCall_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1523:1: ( RULE_LC )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_LC) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1523:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Input__Group_1__1__Impl3129); if (state.failed) return ;

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1533:1: rule__Input__Group_1__2 : rule__Input__Group_1__2__Impl ;
    public final void rule__Input__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1537:1: ( rule__Input__Group_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1538:2: rule__Input__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_1__2__Impl_in_rule__Input__Group_1__23160);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1544:1: rule__Input__Group_1__2__Impl : ( RULE_VARIABLE ) ;
    public final void rule__Input__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1548:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1550:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVARIABLETerminalRuleCall_1_2()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Input__Group_1__2__Impl3187); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInputAccess().getVARIABLETerminalRuleCall_1_2()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1567:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1571:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1572:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__03222);
            rule__Output__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group__1_in_rule__Output__Group__03225);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1579:1: rule__Output__Group__0__Impl : ( RULE_VARIABLE ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1583:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1584:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1584:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1585:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVARIABLETerminalRuleCall_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Output__Group__0__Impl3252); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getVARIABLETerminalRuleCall_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1596:1: rule__Output__Group__1 : rule__Output__Group__1__Impl ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1600:1: ( rule__Output__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1601:2: rule__Output__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__13281);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1607:1: rule__Output__Group__1__Impl : ( ( rule__Output__Group_1__0 )* ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1611:1: ( ( ( rule__Output__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1612:1: ( ( rule__Output__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1612:1: ( ( rule__Output__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1613:1: ( rule__Output__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:1: ( rule__Output__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:2: rule__Output__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Output__Group_1__0_in_rule__Output__Group__1__Impl3308);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1628:1: rule__Output__Group_1__0 : rule__Output__Group_1__0__Impl rule__Output__Group_1__1 ;
    public final void rule__Output__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1632:1: ( rule__Output__Group_1__0__Impl rule__Output__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1633:2: rule__Output__Group_1__0__Impl rule__Output__Group_1__1
            {
            pushFollow(FOLLOW_rule__Output__Group_1__0__Impl_in_rule__Output__Group_1__03343);
            rule__Output__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group_1__1_in_rule__Output__Group_1__03346);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1640:1: rule__Output__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Output__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1644:1: ( ( ',' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:1: ( ',' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1645:1: ( ',' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1646:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getCommaKeyword_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Output__Group_1__0__Impl3374); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1659:1: rule__Output__Group_1__1 : rule__Output__Group_1__1__Impl rule__Output__Group_1__2 ;
    public final void rule__Output__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1663:1: ( rule__Output__Group_1__1__Impl rule__Output__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1664:2: rule__Output__Group_1__1__Impl rule__Output__Group_1__2
            {
            pushFollow(FOLLOW_rule__Output__Group_1__1__Impl_in_rule__Output__Group_1__13405);
            rule__Output__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group_1__2_in_rule__Output__Group_1__13408);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1671:1: rule__Output__Group_1__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Output__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1675:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1676:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1676:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1677:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getLCTerminalRuleCall_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:1: ( RULE_LC )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_LC) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Output__Group_1__1__Impl3436); if (state.failed) return ;

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1688:1: rule__Output__Group_1__2 : rule__Output__Group_1__2__Impl ;
    public final void rule__Output__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1692:1: ( rule__Output__Group_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1693:2: rule__Output__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group_1__2__Impl_in_rule__Output__Group_1__23467);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1699:1: rule__Output__Group_1__2__Impl : ( RULE_VARIABLE ) ;
    public final void rule__Output__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1703:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1704:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1704:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1705:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVARIABLETerminalRuleCall_1_2()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Output__Group_1__2__Impl3494); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOutputAccess().getVARIABLETerminalRuleCall_1_2()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1722:1: rule__Commands__Group__0 : rule__Commands__Group__0__Impl rule__Commands__Group__1 ;
    public final void rule__Commands__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1726:1: ( rule__Commands__Group__0__Impl rule__Commands__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1727:2: rule__Commands__Group__0__Impl rule__Commands__Group__1
            {
            pushFollow(FOLLOW_rule__Commands__Group__0__Impl_in_rule__Commands__Group__03529);
            rule__Commands__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group__1_in_rule__Commands__Group__03532);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1734:1: rule__Commands__Group__0__Impl : ( ( rule__Commands__CAssignment_0 ) ) ;
    public final void rule__Commands__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1738:1: ( ( ( rule__Commands__CAssignment_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:1: ( ( rule__Commands__CAssignment_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:1: ( ( rule__Commands__CAssignment_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1740:1: ( rule__Commands__CAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCAssignment_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:1: ( rule__Commands__CAssignment_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:2: rule__Commands__CAssignment_0
            {
            pushFollow(FOLLOW_rule__Commands__CAssignment_0_in_rule__Commands__Group__0__Impl3559);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1751:1: rule__Commands__Group__1 : rule__Commands__Group__1__Impl ;
    public final void rule__Commands__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1755:1: ( rule__Commands__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1756:2: rule__Commands__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Commands__Group__1__Impl_in_rule__Commands__Group__13589);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1762:1: rule__Commands__Group__1__Impl : ( ( rule__Commands__Group_1__0 )* ) ;
    public final void rule__Commands__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1766:1: ( ( ( rule__Commands__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:1: ( ( rule__Commands__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:1: ( ( rule__Commands__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: ( rule__Commands__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1769:1: ( rule__Commands__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==25) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1769:2: rule__Commands__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Commands__Group_1__0_in_rule__Commands__Group__1__Impl3616);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1783:1: rule__Commands__Group_1__0 : rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1 ;
    public final void rule__Commands__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1787:1: ( rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1788:2: rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1
            {
            pushFollow(FOLLOW_rule__Commands__Group_1__0__Impl_in_rule__Commands__Group_1__03651);
            rule__Commands__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group_1__1_in_rule__Commands__Group_1__03654);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1795:1: rule__Commands__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Commands__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1799:1: ( ( ';' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: ( ';' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1800:1: ( ';' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1801:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Commands__Group_1__0__Impl3682); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1814:1: rule__Commands__Group_1__1 : rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2 ;
    public final void rule__Commands__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1818:1: ( rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1819:2: rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2
            {
            pushFollow(FOLLOW_rule__Commands__Group_1__1__Impl_in_rule__Commands__Group_1__13713);
            rule__Commands__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group_1__2_in_rule__Commands__Group_1__13716);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1826:1: rule__Commands__Group_1__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Commands__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1830:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1831:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1832:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getLCTerminalRuleCall_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1833:1: ( RULE_LC )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_LC) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1833:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Commands__Group_1__1__Impl3744); if (state.failed) return ;

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1843:1: rule__Commands__Group_1__2 : rule__Commands__Group_1__2__Impl ;
    public final void rule__Commands__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1847:1: ( rule__Commands__Group_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1848:2: rule__Commands__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Commands__Group_1__2__Impl_in_rule__Commands__Group_1__23775);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1854:1: rule__Commands__Group_1__2__Impl : ( ( rule__Commands__CAssignment_1_2 ) ) ;
    public final void rule__Commands__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1858:1: ( ( ( rule__Commands__CAssignment_1_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:1: ( ( rule__Commands__CAssignment_1_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1859:1: ( ( rule__Commands__CAssignment_1_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:1: ( rule__Commands__CAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCAssignment_1_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1861:1: ( rule__Commands__CAssignment_1_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1861:2: rule__Commands__CAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Commands__CAssignment_1_2_in_rule__Commands__Group_1__2__Impl3802);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1877:1: rule__Vars__Group__0 : rule__Vars__Group__0__Impl rule__Vars__Group__1 ;
    public final void rule__Vars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1881:1: ( rule__Vars__Group__0__Impl rule__Vars__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1882:2: rule__Vars__Group__0__Impl rule__Vars__Group__1
            {
            pushFollow(FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__03838);
            rule__Vars__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__03841);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1889:1: rule__Vars__Group__0__Impl : ( RULE_VARIABLE ) ;
    public final void rule__Vars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1893:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1894:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1894:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1895:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVARIABLETerminalRuleCall_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Vars__Group__0__Impl3868); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getVARIABLETerminalRuleCall_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1906:1: rule__Vars__Group__1 : rule__Vars__Group__1__Impl ;
    public final void rule__Vars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1910:1: ( rule__Vars__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1911:2: rule__Vars__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__13897);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1917:1: rule__Vars__Group__1__Impl : ( ( rule__Vars__Group_1__0 )? ) ;
    public final void rule__Vars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1921:1: ( ( ( rule__Vars__Group_1__0 )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:1: ( ( rule__Vars__Group_1__0 )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1922:1: ( ( rule__Vars__Group_1__0 )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1923:1: ( rule__Vars__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1924:1: ( rule__Vars__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==24) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1924:2: rule__Vars__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Vars__Group_1__0_in_rule__Vars__Group__1__Impl3924);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1938:1: rule__Vars__Group_1__0 : rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 ;
    public final void rule__Vars__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1942:1: ( rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1943:2: rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__0__Impl_in_rule__Vars__Group_1__03959);
            rule__Vars__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group_1__1_in_rule__Vars__Group_1__03962);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1950:1: rule__Vars__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Vars__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1954:1: ( ( ',' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1955:1: ( ',' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1955:1: ( ',' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1956:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getCommaKeyword_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Vars__Group_1__0__Impl3990); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1969:1: rule__Vars__Group_1__1 : rule__Vars__Group_1__1__Impl ;
    public final void rule__Vars__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1973:1: ( rule__Vars__Group_1__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1974:2: rule__Vars__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__1__Impl_in_rule__Vars__Group_1__14021);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1980:1: rule__Vars__Group_1__1__Impl : ( ruleVars ) ;
    public final void rule__Vars__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:1: ( ( ruleVars ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:1: ( ruleVars )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1985:1: ( ruleVars )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1986:1: ruleVars
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVarsParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleVars_in_rule__Vars__Group_1__1__Impl4048);
            ruleVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVarsAccess().getVarsParserRuleCall_1_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2001:1: rule__Exprs__Group__0 : rule__Exprs__Group__0__Impl rule__Exprs__Group__1 ;
    public final void rule__Exprs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2005:1: ( rule__Exprs__Group__0__Impl rule__Exprs__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2006:2: rule__Exprs__Group__0__Impl rule__Exprs__Group__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__04081);
            rule__Exprs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__04084);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:1: rule__Exprs__Group__0__Impl : ( ruleExpr ) ;
    public final void rule__Exprs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2017:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2018:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2018:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2019:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Exprs__Group__0__Impl4111);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExprParserRuleCall_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2030:1: rule__Exprs__Group__1 : rule__Exprs__Group__1__Impl ;
    public final void rule__Exprs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2034:1: ( rule__Exprs__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2035:2: rule__Exprs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__14140);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2041:1: rule__Exprs__Group__1__Impl : ( ( rule__Exprs__Group_1__0 )? ) ;
    public final void rule__Exprs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2045:1: ( ( ( rule__Exprs__Group_1__0 )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2046:1: ( ( rule__Exprs__Group_1__0 )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2046:1: ( ( rule__Exprs__Group_1__0 )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2047:1: ( rule__Exprs__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2048:1: ( rule__Exprs__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2048:2: rule__Exprs__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Exprs__Group_1__0_in_rule__Exprs__Group__1__Impl4167);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2062:1: rule__Exprs__Group_1__0 : rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1 ;
    public final void rule__Exprs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2066:1: ( rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2067:2: rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group_1__0__Impl_in_rule__Exprs__Group_1__04202);
            rule__Exprs__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group_1__1_in_rule__Exprs__Group_1__04205);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2074:1: rule__Exprs__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Exprs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2078:1: ( ( ',' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2079:1: ( ',' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2079:1: ( ',' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2080:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getCommaKeyword_1_0()); 
            }
            match(input,24,FOLLOW_24_in_rule__Exprs__Group_1__0__Impl4233); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2093:1: rule__Exprs__Group_1__1 : rule__Exprs__Group_1__1__Impl ;
    public final void rule__Exprs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2097:1: ( rule__Exprs__Group_1__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2098:2: rule__Exprs__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group_1__1__Impl_in_rule__Exprs__Group_1__14264);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2104:1: rule__Exprs__Group_1__1__Impl : ( ruleExprs ) ;
    public final void rule__Exprs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2108:1: ( ( ruleExprs ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2109:1: ( ruleExprs )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2109:1: ( ruleExprs )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2110:1: ruleExprs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExprsParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_rule__Exprs__Group_1__1__Impl4291);
            ruleExprs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprsAccess().getExprsParserRuleCall_1_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2125:1: rule__Command__Group_0__0 : rule__Command__Group_0__0__Impl rule__Command__Group_0__1 ;
    public final void rule__Command__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2129:1: ( rule__Command__Group_0__0__Impl rule__Command__Group_0__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2130:2: rule__Command__Group_0__0__Impl rule__Command__Group_0__1
            {
            pushFollow(FOLLOW_rule__Command__Group_0__0__Impl_in_rule__Command__Group_0__04324);
            rule__Command__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_0__1_in_rule__Command__Group_0__04327);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2137:1: rule__Command__Group_0__0__Impl : ( () ) ;
    public final void rule__Command__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2141:1: ( ( () ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2142:1: ( () )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2142:1: ( () )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2143:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCommandAction_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:1: ()
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2146:1: 
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2156:1: rule__Command__Group_0__1 : rule__Command__Group_0__1__Impl ;
    public final void rule__Command__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2160:1: ( rule__Command__Group_0__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2161:2: rule__Command__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_0__1__Impl_in_rule__Command__Group_0__14385);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2167:1: rule__Command__Group_0__1__Impl : ( 'nop' ) ;
    public final void rule__Command__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2171:1: ( ( 'nop' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2172:1: ( 'nop' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2172:1: ( 'nop' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2173:1: 'nop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNopKeyword_0_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__Command__Group_0__1__Impl4413); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2190:1: rule__Command__Group_1__0 : rule__Command__Group_1__0__Impl rule__Command__Group_1__1 ;
    public final void rule__Command__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2194:1: ( rule__Command__Group_1__0__Impl rule__Command__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2195:2: rule__Command__Group_1__0__Impl rule__Command__Group_1__1
            {
            pushFollow(FOLLOW_rule__Command__Group_1__0__Impl_in_rule__Command__Group_1__04448);
            rule__Command__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__1_in_rule__Command__Group_1__04451);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2202:1: rule__Command__Group_1__0__Impl : ( ( rule__Command__VarLAssignment_1_0 ) ) ;
    public final void rule__Command__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2206:1: ( ( ( rule__Command__VarLAssignment_1_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2207:1: ( ( rule__Command__VarLAssignment_1_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2207:1: ( ( rule__Command__VarLAssignment_1_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2208:1: ( rule__Command__VarLAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getVarLAssignment_1_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2209:1: ( rule__Command__VarLAssignment_1_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2209:2: rule__Command__VarLAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Command__VarLAssignment_1_0_in_rule__Command__Group_1__0__Impl4478);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2219:1: rule__Command__Group_1__1 : rule__Command__Group_1__1__Impl rule__Command__Group_1__2 ;
    public final void rule__Command__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2223:1: ( rule__Command__Group_1__1__Impl rule__Command__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2224:2: rule__Command__Group_1__1__Impl rule__Command__Group_1__2
            {
            pushFollow(FOLLOW_rule__Command__Group_1__1__Impl_in_rule__Command__Group_1__14508);
            rule__Command__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__2_in_rule__Command__Group_1__14511);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:1: rule__Command__Group_1__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Command__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2235:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2237:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2238:1: ( RULE_LC )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_LC) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2238:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_1__1__Impl4539); if (state.failed) return ;

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:1: rule__Command__Group_1__2 : rule__Command__Group_1__2__Impl rule__Command__Group_1__3 ;
    public final void rule__Command__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2252:1: ( rule__Command__Group_1__2__Impl rule__Command__Group_1__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2253:2: rule__Command__Group_1__2__Impl rule__Command__Group_1__3
            {
            pushFollow(FOLLOW_rule__Command__Group_1__2__Impl_in_rule__Command__Group_1__24570);
            rule__Command__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__3_in_rule__Command__Group_1__24573);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2260:1: rule__Command__Group_1__2__Impl : ( ':=' ) ;
    public final void rule__Command__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2264:1: ( ( ':=' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2265:1: ( ':=' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2265:1: ( ':=' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2266:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getColonEqualsSignKeyword_1_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__Command__Group_1__2__Impl4601); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:1: rule__Command__Group_1__3 : rule__Command__Group_1__3__Impl rule__Command__Group_1__4 ;
    public final void rule__Command__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2283:1: ( rule__Command__Group_1__3__Impl rule__Command__Group_1__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2284:2: rule__Command__Group_1__3__Impl rule__Command__Group_1__4
            {
            pushFollow(FOLLOW_rule__Command__Group_1__3__Impl_in_rule__Command__Group_1__34632);
            rule__Command__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__4_in_rule__Command__Group_1__34635);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2291:1: rule__Command__Group_1__3__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Command__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2295:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2297:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_3()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2298:1: ( RULE_LC )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_LC) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2298:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_1__3__Impl4663); if (state.failed) return ;

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2308:1: rule__Command__Group_1__4 : rule__Command__Group_1__4__Impl ;
    public final void rule__Command__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2312:1: ( rule__Command__Group_1__4__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2313:2: rule__Command__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_1__4__Impl_in_rule__Command__Group_1__44694);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2319:1: rule__Command__Group_1__4__Impl : ( ( rule__Command__ExpLAssignment_1_4 ) ) ;
    public final void rule__Command__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2323:1: ( ( ( rule__Command__ExpLAssignment_1_4 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2324:1: ( ( rule__Command__ExpLAssignment_1_4 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2324:1: ( ( rule__Command__ExpLAssignment_1_4 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2325:1: ( rule__Command__ExpLAssignment_1_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpLAssignment_1_4()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2326:1: ( rule__Command__ExpLAssignment_1_4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2326:2: rule__Command__ExpLAssignment_1_4
            {
            pushFollow(FOLLOW_rule__Command__ExpLAssignment_1_4_in_rule__Command__Group_1__4__Impl4721);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2346:1: rule__Command__Group_2__0 : rule__Command__Group_2__0__Impl rule__Command__Group_2__1 ;
    public final void rule__Command__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2350:1: ( rule__Command__Group_2__0__Impl rule__Command__Group_2__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2351:2: rule__Command__Group_2__0__Impl rule__Command__Group_2__1
            {
            pushFollow(FOLLOW_rule__Command__Group_2__0__Impl_in_rule__Command__Group_2__04761);
            rule__Command__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__1_in_rule__Command__Group_2__04764);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2358:1: rule__Command__Group_2__0__Impl : ( ( rule__Command__NomAssignment_2_0 ) ) ;
    public final void rule__Command__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2362:1: ( ( ( rule__Command__NomAssignment_2_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2363:1: ( ( rule__Command__NomAssignment_2_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2363:1: ( ( rule__Command__NomAssignment_2_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2364:1: ( rule__Command__NomAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomAssignment_2_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2365:1: ( rule__Command__NomAssignment_2_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2365:2: rule__Command__NomAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Command__NomAssignment_2_0_in_rule__Command__Group_2__0__Impl4791);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2375:1: rule__Command__Group_2__1 : rule__Command__Group_2__1__Impl rule__Command__Group_2__2 ;
    public final void rule__Command__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2379:1: ( rule__Command__Group_2__1__Impl rule__Command__Group_2__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2380:2: rule__Command__Group_2__1__Impl rule__Command__Group_2__2
            {
            pushFollow(FOLLOW_rule__Command__Group_2__1__Impl_in_rule__Command__Group_2__14821);
            rule__Command__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__2_in_rule__Command__Group_2__14824);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2387:1: rule__Command__Group_2__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2391:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2392:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2392:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2393:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_2__1__Impl4851); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2404:1: rule__Command__Group_2__2 : rule__Command__Group_2__2__Impl rule__Command__Group_2__3 ;
    public final void rule__Command__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2408:1: ( rule__Command__Group_2__2__Impl rule__Command__Group_2__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2409:2: rule__Command__Group_2__2__Impl rule__Command__Group_2__3
            {
            pushFollow(FOLLOW_rule__Command__Group_2__2__Impl_in_rule__Command__Group_2__24880);
            rule__Command__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__3_in_rule__Command__Group_2__24883);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2416:1: rule__Command__Group_2__2__Impl : ( ( rule__Command__ExpAssignment_2_2 ) ) ;
    public final void rule__Command__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2420:1: ( ( ( rule__Command__ExpAssignment_2_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2421:1: ( ( rule__Command__ExpAssignment_2_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2421:1: ( ( rule__Command__ExpAssignment_2_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2422:1: ( rule__Command__ExpAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpAssignment_2_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2423:1: ( rule__Command__ExpAssignment_2_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2423:2: rule__Command__ExpAssignment_2_2
            {
            pushFollow(FOLLOW_rule__Command__ExpAssignment_2_2_in_rule__Command__Group_2__2__Impl4910);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2433:1: rule__Command__Group_2__3 : rule__Command__Group_2__3__Impl rule__Command__Group_2__4 ;
    public final void rule__Command__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2437:1: ( rule__Command__Group_2__3__Impl rule__Command__Group_2__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2438:2: rule__Command__Group_2__3__Impl rule__Command__Group_2__4
            {
            pushFollow(FOLLOW_rule__Command__Group_2__3__Impl_in_rule__Command__Group_2__34940);
            rule__Command__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__4_in_rule__Command__Group_2__34943);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2445:1: rule__Command__Group_2__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2449:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2450:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2450:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2451:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_2__3__Impl4970); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2462:1: rule__Command__Group_2__4 : rule__Command__Group_2__4__Impl rule__Command__Group_2__5 ;
    public final void rule__Command__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2466:1: ( rule__Command__Group_2__4__Impl rule__Command__Group_2__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2467:2: rule__Command__Group_2__4__Impl rule__Command__Group_2__5
            {
            pushFollow(FOLLOW_rule__Command__Group_2__4__Impl_in_rule__Command__Group_2__44999);
            rule__Command__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__5_in_rule__Command__Group_2__45002);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2474:1: rule__Command__Group_2__4__Impl : ( 'do' ) ;
    public final void rule__Command__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2478:1: ( ( 'do' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2479:1: ( 'do' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2479:1: ( 'do' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2480:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getDoKeyword_2_4()); 
            }
            match(input,28,FOLLOW_28_in_rule__Command__Group_2__4__Impl5030); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2493:1: rule__Command__Group_2__5 : rule__Command__Group_2__5__Impl rule__Command__Group_2__6 ;
    public final void rule__Command__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2497:1: ( rule__Command__Group_2__5__Impl rule__Command__Group_2__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2498:2: rule__Command__Group_2__5__Impl rule__Command__Group_2__6
            {
            pushFollow(FOLLOW_rule__Command__Group_2__5__Impl_in_rule__Command__Group_2__55061);
            rule__Command__Group_2__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__6_in_rule__Command__Group_2__55064);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2505:1: rule__Command__Group_2__5__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2509:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2510:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2510:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2511:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_5()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_2__5__Impl5091); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2522:1: rule__Command__Group_2__6 : rule__Command__Group_2__6__Impl rule__Command__Group_2__7 ;
    public final void rule__Command__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2526:1: ( rule__Command__Group_2__6__Impl rule__Command__Group_2__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2527:2: rule__Command__Group_2__6__Impl rule__Command__Group_2__7
            {
            pushFollow(FOLLOW_rule__Command__Group_2__6__Impl_in_rule__Command__Group_2__65120);
            rule__Command__Group_2__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__7_in_rule__Command__Group_2__65123);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2534:1: rule__Command__Group_2__6__Impl : ( ( rule__Command__C1Assignment_2_6 ) ) ;
    public final void rule__Command__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2538:1: ( ( ( rule__Command__C1Assignment_2_6 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2539:1: ( ( rule__Command__C1Assignment_2_6 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2539:1: ( ( rule__Command__C1Assignment_2_6 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2540:1: ( rule__Command__C1Assignment_2_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1Assignment_2_6()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2541:1: ( rule__Command__C1Assignment_2_6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2541:2: rule__Command__C1Assignment_2_6
            {
            pushFollow(FOLLOW_rule__Command__C1Assignment_2_6_in_rule__Command__Group_2__6__Impl5150);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2551:1: rule__Command__Group_2__7 : rule__Command__Group_2__7__Impl rule__Command__Group_2__8 ;
    public final void rule__Command__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2555:1: ( rule__Command__Group_2__7__Impl rule__Command__Group_2__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2556:2: rule__Command__Group_2__7__Impl rule__Command__Group_2__8
            {
            pushFollow(FOLLOW_rule__Command__Group_2__7__Impl_in_rule__Command__Group_2__75180);
            rule__Command__Group_2__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__8_in_rule__Command__Group_2__75183);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2563:1: rule__Command__Group_2__7__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2567:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2568:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2568:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2569:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_7()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_2__7__Impl5210); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2580:1: rule__Command__Group_2__8 : rule__Command__Group_2__8__Impl ;
    public final void rule__Command__Group_2__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2584:1: ( rule__Command__Group_2__8__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2585:2: rule__Command__Group_2__8__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_2__8__Impl_in_rule__Command__Group_2__85239);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2591:1: rule__Command__Group_2__8__Impl : ( 'od' ) ;
    public final void rule__Command__Group_2__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2595:1: ( ( 'od' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2596:1: ( 'od' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2596:1: ( 'od' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2597:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getOdKeyword_2_8()); 
            }
            match(input,29,FOLLOW_29_in_rule__Command__Group_2__8__Impl5267); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2628:1: rule__Command__Group_3__0 : rule__Command__Group_3__0__Impl rule__Command__Group_3__1 ;
    public final void rule__Command__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2632:1: ( rule__Command__Group_3__0__Impl rule__Command__Group_3__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2633:2: rule__Command__Group_3__0__Impl rule__Command__Group_3__1
            {
            pushFollow(FOLLOW_rule__Command__Group_3__0__Impl_in_rule__Command__Group_3__05316);
            rule__Command__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__1_in_rule__Command__Group_3__05319);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2640:1: rule__Command__Group_3__0__Impl : ( ( rule__Command__NomAssignment_3_0 ) ) ;
    public final void rule__Command__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2644:1: ( ( ( rule__Command__NomAssignment_3_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2645:1: ( ( rule__Command__NomAssignment_3_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2645:1: ( ( rule__Command__NomAssignment_3_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2646:1: ( rule__Command__NomAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomAssignment_3_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2647:1: ( rule__Command__NomAssignment_3_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2647:2: rule__Command__NomAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Command__NomAssignment_3_0_in_rule__Command__Group_3__0__Impl5346);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2657:1: rule__Command__Group_3__1 : rule__Command__Group_3__1__Impl rule__Command__Group_3__2 ;
    public final void rule__Command__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2661:1: ( rule__Command__Group_3__1__Impl rule__Command__Group_3__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2662:2: rule__Command__Group_3__1__Impl rule__Command__Group_3__2
            {
            pushFollow(FOLLOW_rule__Command__Group_3__1__Impl_in_rule__Command__Group_3__15376);
            rule__Command__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__2_in_rule__Command__Group_3__15379);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2669:1: rule__Command__Group_3__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2673:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2674:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2674:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2675:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_3__1__Impl5406); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2686:1: rule__Command__Group_3__2 : rule__Command__Group_3__2__Impl rule__Command__Group_3__3 ;
    public final void rule__Command__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2690:1: ( rule__Command__Group_3__2__Impl rule__Command__Group_3__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2691:2: rule__Command__Group_3__2__Impl rule__Command__Group_3__3
            {
            pushFollow(FOLLOW_rule__Command__Group_3__2__Impl_in_rule__Command__Group_3__25435);
            rule__Command__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__3_in_rule__Command__Group_3__25438);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2698:1: rule__Command__Group_3__2__Impl : ( ( rule__Command__ExpAssignment_3_2 ) ) ;
    public final void rule__Command__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2702:1: ( ( ( rule__Command__ExpAssignment_3_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2703:1: ( ( rule__Command__ExpAssignment_3_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2703:1: ( ( rule__Command__ExpAssignment_3_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2704:1: ( rule__Command__ExpAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpAssignment_3_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2705:1: ( rule__Command__ExpAssignment_3_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2705:2: rule__Command__ExpAssignment_3_2
            {
            pushFollow(FOLLOW_rule__Command__ExpAssignment_3_2_in_rule__Command__Group_3__2__Impl5465);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2715:1: rule__Command__Group_3__3 : rule__Command__Group_3__3__Impl rule__Command__Group_3__4 ;
    public final void rule__Command__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2719:1: ( rule__Command__Group_3__3__Impl rule__Command__Group_3__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2720:2: rule__Command__Group_3__3__Impl rule__Command__Group_3__4
            {
            pushFollow(FOLLOW_rule__Command__Group_3__3__Impl_in_rule__Command__Group_3__35495);
            rule__Command__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__4_in_rule__Command__Group_3__35498);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2727:1: rule__Command__Group_3__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2731:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2732:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2732:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2733:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_3__3__Impl5525); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2744:1: rule__Command__Group_3__4 : rule__Command__Group_3__4__Impl rule__Command__Group_3__5 ;
    public final void rule__Command__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2748:1: ( rule__Command__Group_3__4__Impl rule__Command__Group_3__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2749:2: rule__Command__Group_3__4__Impl rule__Command__Group_3__5
            {
            pushFollow(FOLLOW_rule__Command__Group_3__4__Impl_in_rule__Command__Group_3__45554);
            rule__Command__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__5_in_rule__Command__Group_3__45557);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2756:1: rule__Command__Group_3__4__Impl : ( 'do' ) ;
    public final void rule__Command__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2760:1: ( ( 'do' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2761:1: ( 'do' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2761:1: ( 'do' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2762:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getDoKeyword_3_4()); 
            }
            match(input,28,FOLLOW_28_in_rule__Command__Group_3__4__Impl5585); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2775:1: rule__Command__Group_3__5 : rule__Command__Group_3__5__Impl rule__Command__Group_3__6 ;
    public final void rule__Command__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2779:1: ( rule__Command__Group_3__5__Impl rule__Command__Group_3__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2780:2: rule__Command__Group_3__5__Impl rule__Command__Group_3__6
            {
            pushFollow(FOLLOW_rule__Command__Group_3__5__Impl_in_rule__Command__Group_3__55616);
            rule__Command__Group_3__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__6_in_rule__Command__Group_3__55619);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2787:1: rule__Command__Group_3__5__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2791:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2792:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2792:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2793:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_5()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_3__5__Impl5646); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2804:1: rule__Command__Group_3__6 : rule__Command__Group_3__6__Impl rule__Command__Group_3__7 ;
    public final void rule__Command__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2808:1: ( rule__Command__Group_3__6__Impl rule__Command__Group_3__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2809:2: rule__Command__Group_3__6__Impl rule__Command__Group_3__7
            {
            pushFollow(FOLLOW_rule__Command__Group_3__6__Impl_in_rule__Command__Group_3__65675);
            rule__Command__Group_3__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__7_in_rule__Command__Group_3__65678);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2816:1: rule__Command__Group_3__6__Impl : ( ( rule__Command__C1Assignment_3_6 ) ) ;
    public final void rule__Command__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2820:1: ( ( ( rule__Command__C1Assignment_3_6 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2821:1: ( ( rule__Command__C1Assignment_3_6 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2821:1: ( ( rule__Command__C1Assignment_3_6 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2822:1: ( rule__Command__C1Assignment_3_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1Assignment_3_6()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2823:1: ( rule__Command__C1Assignment_3_6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2823:2: rule__Command__C1Assignment_3_6
            {
            pushFollow(FOLLOW_rule__Command__C1Assignment_3_6_in_rule__Command__Group_3__6__Impl5705);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2833:1: rule__Command__Group_3__7 : rule__Command__Group_3__7__Impl rule__Command__Group_3__8 ;
    public final void rule__Command__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2837:1: ( rule__Command__Group_3__7__Impl rule__Command__Group_3__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2838:2: rule__Command__Group_3__7__Impl rule__Command__Group_3__8
            {
            pushFollow(FOLLOW_rule__Command__Group_3__7__Impl_in_rule__Command__Group_3__75735);
            rule__Command__Group_3__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__8_in_rule__Command__Group_3__75738);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2845:1: rule__Command__Group_3__7__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2849:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2850:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2850:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2851:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_7()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_3__7__Impl5765); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2862:1: rule__Command__Group_3__8 : rule__Command__Group_3__8__Impl ;
    public final void rule__Command__Group_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2866:1: ( rule__Command__Group_3__8__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2867:2: rule__Command__Group_3__8__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_3__8__Impl_in_rule__Command__Group_3__85794);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2873:1: rule__Command__Group_3__8__Impl : ( 'od' ) ;
    public final void rule__Command__Group_3__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2877:1: ( ( 'od' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2878:1: ( 'od' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2878:1: ( 'od' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2879:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getOdKeyword_3_8()); 
            }
            match(input,29,FOLLOW_29_in_rule__Command__Group_3__8__Impl5822); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2910:1: rule__Command__Group_4__0 : rule__Command__Group_4__0__Impl rule__Command__Group_4__1 ;
    public final void rule__Command__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2914:1: ( rule__Command__Group_4__0__Impl rule__Command__Group_4__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2915:2: rule__Command__Group_4__0__Impl rule__Command__Group_4__1
            {
            pushFollow(FOLLOW_rule__Command__Group_4__0__Impl_in_rule__Command__Group_4__05871);
            rule__Command__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__1_in_rule__Command__Group_4__05874);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2922:1: rule__Command__Group_4__0__Impl : ( ( rule__Command__NomAssignment_4_0 ) ) ;
    public final void rule__Command__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2926:1: ( ( ( rule__Command__NomAssignment_4_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:1: ( ( rule__Command__NomAssignment_4_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:1: ( ( rule__Command__NomAssignment_4_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2928:1: ( rule__Command__NomAssignment_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomAssignment_4_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2929:1: ( rule__Command__NomAssignment_4_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2929:2: rule__Command__NomAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Command__NomAssignment_4_0_in_rule__Command__Group_4__0__Impl5901);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2939:1: rule__Command__Group_4__1 : rule__Command__Group_4__1__Impl rule__Command__Group_4__2 ;
    public final void rule__Command__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2943:1: ( rule__Command__Group_4__1__Impl rule__Command__Group_4__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2944:2: rule__Command__Group_4__1__Impl rule__Command__Group_4__2
            {
            pushFollow(FOLLOW_rule__Command__Group_4__1__Impl_in_rule__Command__Group_4__15931);
            rule__Command__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__2_in_rule__Command__Group_4__15934);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2951:1: rule__Command__Group_4__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2955:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2956:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2956:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2957:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__1__Impl5961); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2968:1: rule__Command__Group_4__2 : rule__Command__Group_4__2__Impl rule__Command__Group_4__3 ;
    public final void rule__Command__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2972:1: ( rule__Command__Group_4__2__Impl rule__Command__Group_4__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2973:2: rule__Command__Group_4__2__Impl rule__Command__Group_4__3
            {
            pushFollow(FOLLOW_rule__Command__Group_4__2__Impl_in_rule__Command__Group_4__25990);
            rule__Command__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__3_in_rule__Command__Group_4__25993);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2980:1: rule__Command__Group_4__2__Impl : ( ( rule__Command__Exp1Assignment_4_2 ) ) ;
    public final void rule__Command__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2984:1: ( ( ( rule__Command__Exp1Assignment_4_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2985:1: ( ( rule__Command__Exp1Assignment_4_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2985:1: ( ( rule__Command__Exp1Assignment_4_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2986:1: ( rule__Command__Exp1Assignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExp1Assignment_4_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2987:1: ( rule__Command__Exp1Assignment_4_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2987:2: rule__Command__Exp1Assignment_4_2
            {
            pushFollow(FOLLOW_rule__Command__Exp1Assignment_4_2_in_rule__Command__Group_4__2__Impl6020);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2997:1: rule__Command__Group_4__3 : rule__Command__Group_4__3__Impl rule__Command__Group_4__4 ;
    public final void rule__Command__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3001:1: ( rule__Command__Group_4__3__Impl rule__Command__Group_4__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3002:2: rule__Command__Group_4__3__Impl rule__Command__Group_4__4
            {
            pushFollow(FOLLOW_rule__Command__Group_4__3__Impl_in_rule__Command__Group_4__36050);
            rule__Command__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__4_in_rule__Command__Group_4__36053);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3009:1: rule__Command__Group_4__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3013:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3014:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3014:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3015:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__3__Impl6080); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3026:1: rule__Command__Group_4__4 : rule__Command__Group_4__4__Impl rule__Command__Group_4__5 ;
    public final void rule__Command__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3030:1: ( rule__Command__Group_4__4__Impl rule__Command__Group_4__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3031:2: rule__Command__Group_4__4__Impl rule__Command__Group_4__5
            {
            pushFollow(FOLLOW_rule__Command__Group_4__4__Impl_in_rule__Command__Group_4__46109);
            rule__Command__Group_4__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__5_in_rule__Command__Group_4__46112);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3038:1: rule__Command__Group_4__4__Impl : ( 'in' ) ;
    public final void rule__Command__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3042:1: ( ( 'in' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3043:1: ( 'in' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3043:1: ( 'in' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3044:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getInKeyword_4_4()); 
            }
            match(input,30,FOLLOW_30_in_rule__Command__Group_4__4__Impl6140); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3057:1: rule__Command__Group_4__5 : rule__Command__Group_4__5__Impl rule__Command__Group_4__6 ;
    public final void rule__Command__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3061:1: ( rule__Command__Group_4__5__Impl rule__Command__Group_4__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3062:2: rule__Command__Group_4__5__Impl rule__Command__Group_4__6
            {
            pushFollow(FOLLOW_rule__Command__Group_4__5__Impl_in_rule__Command__Group_4__56171);
            rule__Command__Group_4__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__6_in_rule__Command__Group_4__56174);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3069:1: rule__Command__Group_4__5__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3073:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3074:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3074:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3075:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_5()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__5__Impl6201); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3086:1: rule__Command__Group_4__6 : rule__Command__Group_4__6__Impl rule__Command__Group_4__7 ;
    public final void rule__Command__Group_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3090:1: ( rule__Command__Group_4__6__Impl rule__Command__Group_4__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3091:2: rule__Command__Group_4__6__Impl rule__Command__Group_4__7
            {
            pushFollow(FOLLOW_rule__Command__Group_4__6__Impl_in_rule__Command__Group_4__66230);
            rule__Command__Group_4__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__7_in_rule__Command__Group_4__66233);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3098:1: rule__Command__Group_4__6__Impl : ( ( rule__Command__Exp2Assignment_4_6 ) ) ;
    public final void rule__Command__Group_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3102:1: ( ( ( rule__Command__Exp2Assignment_4_6 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3103:1: ( ( rule__Command__Exp2Assignment_4_6 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3103:1: ( ( rule__Command__Exp2Assignment_4_6 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3104:1: ( rule__Command__Exp2Assignment_4_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExp2Assignment_4_6()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3105:1: ( rule__Command__Exp2Assignment_4_6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3105:2: rule__Command__Exp2Assignment_4_6
            {
            pushFollow(FOLLOW_rule__Command__Exp2Assignment_4_6_in_rule__Command__Group_4__6__Impl6260);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3115:1: rule__Command__Group_4__7 : rule__Command__Group_4__7__Impl rule__Command__Group_4__8 ;
    public final void rule__Command__Group_4__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3119:1: ( rule__Command__Group_4__7__Impl rule__Command__Group_4__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3120:2: rule__Command__Group_4__7__Impl rule__Command__Group_4__8
            {
            pushFollow(FOLLOW_rule__Command__Group_4__7__Impl_in_rule__Command__Group_4__76290);
            rule__Command__Group_4__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__8_in_rule__Command__Group_4__76293);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3127:1: rule__Command__Group_4__7__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3131:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3132:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3132:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3133:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_7()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__7__Impl6320); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3144:1: rule__Command__Group_4__8 : rule__Command__Group_4__8__Impl rule__Command__Group_4__9 ;
    public final void rule__Command__Group_4__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3148:1: ( rule__Command__Group_4__8__Impl rule__Command__Group_4__9 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3149:2: rule__Command__Group_4__8__Impl rule__Command__Group_4__9
            {
            pushFollow(FOLLOW_rule__Command__Group_4__8__Impl_in_rule__Command__Group_4__86349);
            rule__Command__Group_4__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__9_in_rule__Command__Group_4__86352);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3156:1: rule__Command__Group_4__8__Impl : ( 'do' ) ;
    public final void rule__Command__Group_4__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3160:1: ( ( 'do' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3161:1: ( 'do' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3161:1: ( 'do' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3162:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getDoKeyword_4_8()); 
            }
            match(input,28,FOLLOW_28_in_rule__Command__Group_4__8__Impl6380); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3175:1: rule__Command__Group_4__9 : rule__Command__Group_4__9__Impl rule__Command__Group_4__10 ;
    public final void rule__Command__Group_4__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3179:1: ( rule__Command__Group_4__9__Impl rule__Command__Group_4__10 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3180:2: rule__Command__Group_4__9__Impl rule__Command__Group_4__10
            {
            pushFollow(FOLLOW_rule__Command__Group_4__9__Impl_in_rule__Command__Group_4__96411);
            rule__Command__Group_4__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__10_in_rule__Command__Group_4__96414);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3187:1: rule__Command__Group_4__9__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3191:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3192:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3192:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3193:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_9()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__9__Impl6441); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3204:1: rule__Command__Group_4__10 : rule__Command__Group_4__10__Impl rule__Command__Group_4__11 ;
    public final void rule__Command__Group_4__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3208:1: ( rule__Command__Group_4__10__Impl rule__Command__Group_4__11 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3209:2: rule__Command__Group_4__10__Impl rule__Command__Group_4__11
            {
            pushFollow(FOLLOW_rule__Command__Group_4__10__Impl_in_rule__Command__Group_4__106470);
            rule__Command__Group_4__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__11_in_rule__Command__Group_4__106473);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3216:1: rule__Command__Group_4__10__Impl : ( ( rule__Command__C1Assignment_4_10 ) ) ;
    public final void rule__Command__Group_4__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3220:1: ( ( ( rule__Command__C1Assignment_4_10 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:1: ( ( rule__Command__C1Assignment_4_10 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:1: ( ( rule__Command__C1Assignment_4_10 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3222:1: ( rule__Command__C1Assignment_4_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1Assignment_4_10()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3223:1: ( rule__Command__C1Assignment_4_10 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3223:2: rule__Command__C1Assignment_4_10
            {
            pushFollow(FOLLOW_rule__Command__C1Assignment_4_10_in_rule__Command__Group_4__10__Impl6500);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3233:1: rule__Command__Group_4__11 : rule__Command__Group_4__11__Impl rule__Command__Group_4__12 ;
    public final void rule__Command__Group_4__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3237:1: ( rule__Command__Group_4__11__Impl rule__Command__Group_4__12 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3238:2: rule__Command__Group_4__11__Impl rule__Command__Group_4__12
            {
            pushFollow(FOLLOW_rule__Command__Group_4__11__Impl_in_rule__Command__Group_4__116530);
            rule__Command__Group_4__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__12_in_rule__Command__Group_4__116533);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3245:1: rule__Command__Group_4__11__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3249:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3250:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3250:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3251:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_11()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__11__Impl6560); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3262:1: rule__Command__Group_4__12 : rule__Command__Group_4__12__Impl ;
    public final void rule__Command__Group_4__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3266:1: ( rule__Command__Group_4__12__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3267:2: rule__Command__Group_4__12__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_4__12__Impl_in_rule__Command__Group_4__126589);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3273:1: rule__Command__Group_4__12__Impl : ( 'od' ) ;
    public final void rule__Command__Group_4__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3277:1: ( ( 'od' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3278:1: ( 'od' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3278:1: ( 'od' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3279:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getOdKeyword_4_12()); 
            }
            match(input,29,FOLLOW_29_in_rule__Command__Group_4__12__Impl6617); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3318:1: rule__Command__Group_5__0 : rule__Command__Group_5__0__Impl rule__Command__Group_5__1 ;
    public final void rule__Command__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3322:1: ( rule__Command__Group_5__0__Impl rule__Command__Group_5__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3323:2: rule__Command__Group_5__0__Impl rule__Command__Group_5__1
            {
            pushFollow(FOLLOW_rule__Command__Group_5__0__Impl_in_rule__Command__Group_5__06674);
            rule__Command__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__1_in_rule__Command__Group_5__06677);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3330:1: rule__Command__Group_5__0__Impl : ( ( rule__Command__NomAssignment_5_0 ) ) ;
    public final void rule__Command__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3334:1: ( ( ( rule__Command__NomAssignment_5_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3335:1: ( ( rule__Command__NomAssignment_5_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3335:1: ( ( rule__Command__NomAssignment_5_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3336:1: ( rule__Command__NomAssignment_5_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomAssignment_5_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3337:1: ( rule__Command__NomAssignment_5_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3337:2: rule__Command__NomAssignment_5_0
            {
            pushFollow(FOLLOW_rule__Command__NomAssignment_5_0_in_rule__Command__Group_5__0__Impl6704);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3347:1: rule__Command__Group_5__1 : rule__Command__Group_5__1__Impl rule__Command__Group_5__2 ;
    public final void rule__Command__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3351:1: ( rule__Command__Group_5__1__Impl rule__Command__Group_5__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3352:2: rule__Command__Group_5__1__Impl rule__Command__Group_5__2
            {
            pushFollow(FOLLOW_rule__Command__Group_5__1__Impl_in_rule__Command__Group_5__16734);
            rule__Command__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__2_in_rule__Command__Group_5__16737);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3359:1: rule__Command__Group_5__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3363:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3364:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3364:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3365:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5__1__Impl6764); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3376:1: rule__Command__Group_5__2 : rule__Command__Group_5__2__Impl rule__Command__Group_5__3 ;
    public final void rule__Command__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3380:1: ( rule__Command__Group_5__2__Impl rule__Command__Group_5__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3381:2: rule__Command__Group_5__2__Impl rule__Command__Group_5__3
            {
            pushFollow(FOLLOW_rule__Command__Group_5__2__Impl_in_rule__Command__Group_5__26793);
            rule__Command__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__3_in_rule__Command__Group_5__26796);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3388:1: rule__Command__Group_5__2__Impl : ( ( rule__Command__ExpAssignment_5_2 ) ) ;
    public final void rule__Command__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3392:1: ( ( ( rule__Command__ExpAssignment_5_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3393:1: ( ( rule__Command__ExpAssignment_5_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3393:1: ( ( rule__Command__ExpAssignment_5_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3394:1: ( rule__Command__ExpAssignment_5_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpAssignment_5_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3395:1: ( rule__Command__ExpAssignment_5_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3395:2: rule__Command__ExpAssignment_5_2
            {
            pushFollow(FOLLOW_rule__Command__ExpAssignment_5_2_in_rule__Command__Group_5__2__Impl6823);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3405:1: rule__Command__Group_5__3 : rule__Command__Group_5__3__Impl rule__Command__Group_5__4 ;
    public final void rule__Command__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3409:1: ( rule__Command__Group_5__3__Impl rule__Command__Group_5__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3410:2: rule__Command__Group_5__3__Impl rule__Command__Group_5__4
            {
            pushFollow(FOLLOW_rule__Command__Group_5__3__Impl_in_rule__Command__Group_5__36853);
            rule__Command__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__4_in_rule__Command__Group_5__36856);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3417:1: rule__Command__Group_5__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3421:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3422:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3422:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3423:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5__3__Impl6883); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3434:1: rule__Command__Group_5__4 : rule__Command__Group_5__4__Impl rule__Command__Group_5__5 ;
    public final void rule__Command__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3438:1: ( rule__Command__Group_5__4__Impl rule__Command__Group_5__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3439:2: rule__Command__Group_5__4__Impl rule__Command__Group_5__5
            {
            pushFollow(FOLLOW_rule__Command__Group_5__4__Impl_in_rule__Command__Group_5__46912);
            rule__Command__Group_5__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__5_in_rule__Command__Group_5__46915);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3446:1: rule__Command__Group_5__4__Impl : ( 'then' ) ;
    public final void rule__Command__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3450:1: ( ( 'then' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3451:1: ( 'then' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3451:1: ( 'then' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3452:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getThenKeyword_5_4()); 
            }
            match(input,31,FOLLOW_31_in_rule__Command__Group_5__4__Impl6943); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3465:1: rule__Command__Group_5__5 : rule__Command__Group_5__5__Impl rule__Command__Group_5__6 ;
    public final void rule__Command__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3469:1: ( rule__Command__Group_5__5__Impl rule__Command__Group_5__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3470:2: rule__Command__Group_5__5__Impl rule__Command__Group_5__6
            {
            pushFollow(FOLLOW_rule__Command__Group_5__5__Impl_in_rule__Command__Group_5__56974);
            rule__Command__Group_5__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__6_in_rule__Command__Group_5__56977);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3477:1: rule__Command__Group_5__5__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3481:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3482:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3482:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3483:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_5()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5__5__Impl7004); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3494:1: rule__Command__Group_5__6 : rule__Command__Group_5__6__Impl rule__Command__Group_5__7 ;
    public final void rule__Command__Group_5__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3498:1: ( rule__Command__Group_5__6__Impl rule__Command__Group_5__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3499:2: rule__Command__Group_5__6__Impl rule__Command__Group_5__7
            {
            pushFollow(FOLLOW_rule__Command__Group_5__6__Impl_in_rule__Command__Group_5__67033);
            rule__Command__Group_5__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__7_in_rule__Command__Group_5__67036);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3506:1: rule__Command__Group_5__6__Impl : ( ( rule__Command__C1Assignment_5_6 ) ) ;
    public final void rule__Command__Group_5__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3510:1: ( ( ( rule__Command__C1Assignment_5_6 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3511:1: ( ( rule__Command__C1Assignment_5_6 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3511:1: ( ( rule__Command__C1Assignment_5_6 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3512:1: ( rule__Command__C1Assignment_5_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1Assignment_5_6()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3513:1: ( rule__Command__C1Assignment_5_6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3513:2: rule__Command__C1Assignment_5_6
            {
            pushFollow(FOLLOW_rule__Command__C1Assignment_5_6_in_rule__Command__Group_5__6__Impl7063);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3523:1: rule__Command__Group_5__7 : rule__Command__Group_5__7__Impl rule__Command__Group_5__8 ;
    public final void rule__Command__Group_5__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3527:1: ( rule__Command__Group_5__7__Impl rule__Command__Group_5__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3528:2: rule__Command__Group_5__7__Impl rule__Command__Group_5__8
            {
            pushFollow(FOLLOW_rule__Command__Group_5__7__Impl_in_rule__Command__Group_5__77093);
            rule__Command__Group_5__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__8_in_rule__Command__Group_5__77096);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3535:1: rule__Command__Group_5__7__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3539:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3540:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3540:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3541:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_7()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5__7__Impl7123); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3552:1: rule__Command__Group_5__8 : rule__Command__Group_5__8__Impl rule__Command__Group_5__9 ;
    public final void rule__Command__Group_5__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3556:1: ( rule__Command__Group_5__8__Impl rule__Command__Group_5__9 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3557:2: rule__Command__Group_5__8__Impl rule__Command__Group_5__9
            {
            pushFollow(FOLLOW_rule__Command__Group_5__8__Impl_in_rule__Command__Group_5__87152);
            rule__Command__Group_5__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__9_in_rule__Command__Group_5__87155);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3564:1: rule__Command__Group_5__8__Impl : ( ( rule__Command__Group_5_8__0 )? ) ;
    public final void rule__Command__Group_5__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3568:1: ( ( ( rule__Command__Group_5_8__0 )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3569:1: ( ( rule__Command__Group_5_8__0 )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3569:1: ( ( rule__Command__Group_5_8__0 )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3570:1: ( rule__Command__Group_5_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getGroup_5_8()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3571:1: ( rule__Command__Group_5_8__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3571:2: rule__Command__Group_5_8__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_5_8__0_in_rule__Command__Group_5__8__Impl7182);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3581:1: rule__Command__Group_5__9 : rule__Command__Group_5__9__Impl ;
    public final void rule__Command__Group_5__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3585:1: ( rule__Command__Group_5__9__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3586:2: rule__Command__Group_5__9__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_5__9__Impl_in_rule__Command__Group_5__97213);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3592:1: rule__Command__Group_5__9__Impl : ( 'fi' ) ;
    public final void rule__Command__Group_5__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3596:1: ( ( 'fi' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3597:1: ( 'fi' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3597:1: ( 'fi' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3598:1: 'fi'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getFiKeyword_5_9()); 
            }
            match(input,32,FOLLOW_32_in_rule__Command__Group_5__9__Impl7241); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3631:1: rule__Command__Group_5_8__0 : rule__Command__Group_5_8__0__Impl rule__Command__Group_5_8__1 ;
    public final void rule__Command__Group_5_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3635:1: ( rule__Command__Group_5_8__0__Impl rule__Command__Group_5_8__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3636:2: rule__Command__Group_5_8__0__Impl rule__Command__Group_5_8__1
            {
            pushFollow(FOLLOW_rule__Command__Group_5_8__0__Impl_in_rule__Command__Group_5_8__07292);
            rule__Command__Group_5_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5_8__1_in_rule__Command__Group_5_8__07295);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3643:1: rule__Command__Group_5_8__0__Impl : ( 'else' ) ;
    public final void rule__Command__Group_5_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3647:1: ( ( 'else' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3648:1: ( 'else' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3648:1: ( 'else' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3649:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getElseKeyword_5_8_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__Command__Group_5_8__0__Impl7323); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3662:1: rule__Command__Group_5_8__1 : rule__Command__Group_5_8__1__Impl rule__Command__Group_5_8__2 ;
    public final void rule__Command__Group_5_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3666:1: ( rule__Command__Group_5_8__1__Impl rule__Command__Group_5_8__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3667:2: rule__Command__Group_5_8__1__Impl rule__Command__Group_5_8__2
            {
            pushFollow(FOLLOW_rule__Command__Group_5_8__1__Impl_in_rule__Command__Group_5_8__17354);
            rule__Command__Group_5_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5_8__2_in_rule__Command__Group_5_8__17357);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3674:1: rule__Command__Group_5_8__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3678:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3679:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3679:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3680:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_8_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5_8__1__Impl7384); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3691:1: rule__Command__Group_5_8__2 : rule__Command__Group_5_8__2__Impl rule__Command__Group_5_8__3 ;
    public final void rule__Command__Group_5_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3695:1: ( rule__Command__Group_5_8__2__Impl rule__Command__Group_5_8__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3696:2: rule__Command__Group_5_8__2__Impl rule__Command__Group_5_8__3
            {
            pushFollow(FOLLOW_rule__Command__Group_5_8__2__Impl_in_rule__Command__Group_5_8__27413);
            rule__Command__Group_5_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5_8__3_in_rule__Command__Group_5_8__27416);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3703:1: rule__Command__Group_5_8__2__Impl : ( ( rule__Command__C2Assignment_5_8_2 ) ) ;
    public final void rule__Command__Group_5_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3707:1: ( ( ( rule__Command__C2Assignment_5_8_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3708:1: ( ( rule__Command__C2Assignment_5_8_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3708:1: ( ( rule__Command__C2Assignment_5_8_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3709:1: ( rule__Command__C2Assignment_5_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC2Assignment_5_8_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3710:1: ( rule__Command__C2Assignment_5_8_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3710:2: rule__Command__C2Assignment_5_8_2
            {
            pushFollow(FOLLOW_rule__Command__C2Assignment_5_8_2_in_rule__Command__Group_5_8__2__Impl7443);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3720:1: rule__Command__Group_5_8__3 : rule__Command__Group_5_8__3__Impl ;
    public final void rule__Command__Group_5_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3724:1: ( rule__Command__Group_5_8__3__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3725:2: rule__Command__Group_5_8__3__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_5_8__3__Impl_in_rule__Command__Group_5_8__37473);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3731:1: rule__Command__Group_5_8__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3735:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3736:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3736:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3737:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_8_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5_8__3__Impl7500); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3756:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3760:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3761:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__07537);
            rule__And__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group__1_in_rule__And__Group__07540);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3768:1: rule__And__Group__0__Impl : ( ruleOr ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3772:1: ( ( ruleOr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3773:1: ( ruleOr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3773:1: ( ruleOr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3774:1: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getOrParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleOr_in_rule__And__Group__0__Impl7567);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getOrParserRuleCall_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3785:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3789:1: ( rule__And__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3790:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__17596);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3796:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3800:1: ( ( ( rule__And__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3801:1: ( ( rule__And__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3801:1: ( ( rule__And__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3802:1: ( rule__And__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3803:1: ( rule__And__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3803:2: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl7623);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3817:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3821:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3822:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__07658);
            rule__And__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__07661);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3829:1: rule__And__Group_1__0__Impl : ( RULE_LC ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3833:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3834:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3834:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3835:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getLCTerminalRuleCall_1_0()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__And__Group_1__0__Impl7688); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3846:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3850:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3851:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__17717);
            rule__And__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__17720);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3858:1: rule__And__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3862:1: ( ( 'and' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3863:1: ( 'and' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3863:1: ( 'and' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3864:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndKeyword_1_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__And__Group_1__1__Impl7748); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3877:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl rule__And__Group_1__3 ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3881:1: ( rule__And__Group_1__2__Impl rule__And__Group_1__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3882:2: rule__And__Group_1__2__Impl rule__And__Group_1__3
            {
            pushFollow(FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__27779);
            rule__And__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1__3_in_rule__And__Group_1__27782);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3889:1: rule__And__Group_1__2__Impl : ( RULE_LC ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3893:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3894:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3894:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3895:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getLCTerminalRuleCall_1_2()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__And__Group_1__2__Impl7809); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3906:1: rule__And__Group_1__3 : rule__And__Group_1__3__Impl ;
    public final void rule__And__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3910:1: ( rule__And__Group_1__3__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3911:2: rule__And__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_1__3__Impl_in_rule__And__Group_1__37838);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3917:1: rule__And__Group_1__3__Impl : ( ruleOr ) ;
    public final void rule__And__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3921:1: ( ( ruleOr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3922:1: ( ruleOr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3922:1: ( ruleOr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3923:1: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getOrParserRuleCall_1_3()); 
            }
            pushFollow(FOLLOW_ruleOr_in_rule__And__Group_1__3__Impl7865);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getOrParserRuleCall_1_3()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3942:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3946:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3947:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__07902);
            rule__Or__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__07905);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3954:1: rule__Or__Group__0__Impl : ( ruleNot ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3958:1: ( ( ruleNot ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3959:1: ( ruleNot )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3959:1: ( ruleNot )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3960:1: ruleNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getNotParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleNot_in_rule__Or__Group__0__Impl7932);
            ruleNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getNotParserRuleCall_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3971:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3975:1: ( rule__Or__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3976:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__17961);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3982:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3986:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3987:1: ( ( rule__Or__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3987:1: ( ( rule__Or__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3988:1: ( rule__Or__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3989:1: ( rule__Or__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3989:2: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl7988);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4003:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4007:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4008:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__08023);
            rule__Or__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__08026);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4015:1: rule__Or__Group_1__0__Impl : ( RULE_LC ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4019:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4020:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4020:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4021:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getLCTerminalRuleCall_1_0()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Or__Group_1__0__Impl8053); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4032:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4036:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4037:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__18082);
            rule__Or__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__18085);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4044:1: rule__Or__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4048:1: ( ( 'or' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4049:1: ( 'or' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4049:1: ( 'or' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4050:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrKeyword_1_1()); 
            }
            match(input,35,FOLLOW_35_in_rule__Or__Group_1__1__Impl8113); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4063:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl rule__Or__Group_1__3 ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4067:1: ( rule__Or__Group_1__2__Impl rule__Or__Group_1__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4068:2: rule__Or__Group_1__2__Impl rule__Or__Group_1__3
            {
            pushFollow(FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__28144);
            rule__Or__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group_1__3_in_rule__Or__Group_1__28147);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4075:1: rule__Or__Group_1__2__Impl : ( RULE_LC ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4079:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4080:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4080:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4081:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getLCTerminalRuleCall_1_2()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Or__Group_1__2__Impl8174); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4092:1: rule__Or__Group_1__3 : rule__Or__Group_1__3__Impl ;
    public final void rule__Or__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4096:1: ( rule__Or__Group_1__3__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4097:2: rule__Or__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_1__3__Impl_in_rule__Or__Group_1__38203);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4103:1: rule__Or__Group_1__3__Impl : ( ruleNot ) ;
    public final void rule__Or__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4107:1: ( ( ruleNot ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4108:1: ( ruleNot )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4108:1: ( ruleNot )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4109:1: ruleNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getNotParserRuleCall_1_3()); 
            }
            pushFollow(FOLLOW_ruleNot_in_rule__Or__Group_1__3__Impl8230);
            ruleNot();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getNotParserRuleCall_1_3()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4128:1: rule__Not__Group__0 : rule__Not__Group__0__Impl rule__Not__Group__1 ;
    public final void rule__Not__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4132:1: ( rule__Not__Group__0__Impl rule__Not__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4133:2: rule__Not__Group__0__Impl rule__Not__Group__1
            {
            pushFollow(FOLLOW_rule__Not__Group__0__Impl_in_rule__Not__Group__08267);
            rule__Not__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Not__Group__1_in_rule__Not__Group__08270);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4140:1: rule__Not__Group__0__Impl : ( ( rule__Not__Group_0__0 )* ) ;
    public final void rule__Not__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4144:1: ( ( ( rule__Not__Group_0__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4145:1: ( ( rule__Not__Group_0__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4145:1: ( ( rule__Not__Group_0__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4146:1: ( rule__Not__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getGroup_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4147:1: ( rule__Not__Group_0__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==36) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4147:2: rule__Not__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Not__Group_0__0_in_rule__Not__Group__0__Impl8297);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4157:1: rule__Not__Group__1 : rule__Not__Group__1__Impl ;
    public final void rule__Not__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4161:1: ( rule__Not__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4162:2: rule__Not__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Not__Group__1__Impl_in_rule__Not__Group__18328);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4168:1: rule__Not__Group__1__Impl : ( ruleEq ) ;
    public final void rule__Not__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4172:1: ( ( ruleEq ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4173:1: ( ruleEq )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4173:1: ( ruleEq )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4174:1: ruleEq
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getEqParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleEq_in_rule__Not__Group__1__Impl8355);
            ruleEq();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getEqParserRuleCall_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4189:1: rule__Not__Group_0__0 : rule__Not__Group_0__0__Impl rule__Not__Group_0__1 ;
    public final void rule__Not__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4193:1: ( rule__Not__Group_0__0__Impl rule__Not__Group_0__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4194:2: rule__Not__Group_0__0__Impl rule__Not__Group_0__1
            {
            pushFollow(FOLLOW_rule__Not__Group_0__0__Impl_in_rule__Not__Group_0__08388);
            rule__Not__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Not__Group_0__1_in_rule__Not__Group_0__08391);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4201:1: rule__Not__Group_0__0__Impl : ( 'not' ) ;
    public final void rule__Not__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4205:1: ( ( 'not' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4206:1: ( 'not' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4206:1: ( 'not' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4207:1: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getNotKeyword_0_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Not__Group_0__0__Impl8419); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNotAccess().getNotKeyword_0_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4220:1: rule__Not__Group_0__1 : rule__Not__Group_0__1__Impl ;
    public final void rule__Not__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4224:1: ( rule__Not__Group_0__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4225:2: rule__Not__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Not__Group_0__1__Impl_in_rule__Not__Group_0__18450);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4231:1: rule__Not__Group_0__1__Impl : ( RULE_LC ) ;
    public final void rule__Not__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4235:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4236:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4236:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4237:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getLCTerminalRuleCall_0_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Not__Group_0__1__Impl8477); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4252:1: rule__Eq__Group_0__0 : rule__Eq__Group_0__0__Impl rule__Eq__Group_0__1 ;
    public final void rule__Eq__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4256:1: ( rule__Eq__Group_0__0__Impl rule__Eq__Group_0__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4257:2: rule__Eq__Group_0__0__Impl rule__Eq__Group_0__1
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__0__Impl_in_rule__Eq__Group_0__08510);
            rule__Eq__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_0__1_in_rule__Eq__Group_0__08513);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4264:1: rule__Eq__Group_0__0__Impl : ( ( rule__Eq__Alternatives_0_0 ) ) ;
    public final void rule__Eq__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4268:1: ( ( ( rule__Eq__Alternatives_0_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4269:1: ( ( rule__Eq__Alternatives_0_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4269:1: ( ( rule__Eq__Alternatives_0_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4270:1: ( rule__Eq__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getAlternatives_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4271:1: ( rule__Eq__Alternatives_0_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4271:2: rule__Eq__Alternatives_0_0
            {
            pushFollow(FOLLOW_rule__Eq__Alternatives_0_0_in_rule__Eq__Group_0__0__Impl8540);
            rule__Eq__Alternatives_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getAlternatives_0_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4281:1: rule__Eq__Group_0__1 : rule__Eq__Group_0__1__Impl rule__Eq__Group_0__2 ;
    public final void rule__Eq__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4285:1: ( rule__Eq__Group_0__1__Impl rule__Eq__Group_0__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4286:2: rule__Eq__Group_0__1__Impl rule__Eq__Group_0__2
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__1__Impl_in_rule__Eq__Group_0__18570);
            rule__Eq__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_0__2_in_rule__Eq__Group_0__18573);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4293:1: rule__Eq__Group_0__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Eq__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4297:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4298:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4298:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4299:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getLCTerminalRuleCall_0_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4300:1: ( RULE_LC )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_LC) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4300:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Eq__Group_0__1__Impl8601); if (state.failed) return ;

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4310:1: rule__Eq__Group_0__2 : rule__Eq__Group_0__2__Impl rule__Eq__Group_0__3 ;
    public final void rule__Eq__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4314:1: ( rule__Eq__Group_0__2__Impl rule__Eq__Group_0__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4315:2: rule__Eq__Group_0__2__Impl rule__Eq__Group_0__3
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__2__Impl_in_rule__Eq__Group_0__28632);
            rule__Eq__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_0__3_in_rule__Eq__Group_0__28635);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4322:1: rule__Eq__Group_0__2__Impl : ( '=?' ) ;
    public final void rule__Eq__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4326:1: ( ( '=?' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4327:1: ( '=?' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4327:1: ( '=?' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4328:1: '=?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getEqualsSignQuestionMarkKeyword_0_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__Eq__Group_0__2__Impl8663); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4341:1: rule__Eq__Group_0__3 : rule__Eq__Group_0__3__Impl rule__Eq__Group_0__4 ;
    public final void rule__Eq__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4345:1: ( rule__Eq__Group_0__3__Impl rule__Eq__Group_0__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4346:2: rule__Eq__Group_0__3__Impl rule__Eq__Group_0__4
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__3__Impl_in_rule__Eq__Group_0__38694);
            rule__Eq__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_0__4_in_rule__Eq__Group_0__38697);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4353:1: rule__Eq__Group_0__3__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Eq__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4357:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4358:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4358:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4359:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getLCTerminalRuleCall_0_3()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4360:1: ( RULE_LC )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_LC) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4360:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Eq__Group_0__3__Impl8725); if (state.failed) return ;

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4370:1: rule__Eq__Group_0__4 : rule__Eq__Group_0__4__Impl ;
    public final void rule__Eq__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4374:1: ( rule__Eq__Group_0__4__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4375:2: rule__Eq__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__4__Impl_in_rule__Eq__Group_0__48756);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4381:1: rule__Eq__Group_0__4__Impl : ( ( rule__Eq__Alternatives_0_4 ) ) ;
    public final void rule__Eq__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4385:1: ( ( ( rule__Eq__Alternatives_0_4 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4386:1: ( ( rule__Eq__Alternatives_0_4 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4386:1: ( ( rule__Eq__Alternatives_0_4 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4387:1: ( rule__Eq__Alternatives_0_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getAlternatives_0_4()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4388:1: ( rule__Eq__Alternatives_0_4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4388:2: rule__Eq__Alternatives_0_4
            {
            pushFollow(FOLLOW_rule__Eq__Alternatives_0_4_in_rule__Eq__Group_0__4__Impl8783);
            rule__Eq__Alternatives_0_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getAlternatives_0_4()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4408:1: rule__Eq__Group_1__0 : rule__Eq__Group_1__0__Impl rule__Eq__Group_1__1 ;
    public final void rule__Eq__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4412:1: ( rule__Eq__Group_1__0__Impl rule__Eq__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4413:2: rule__Eq__Group_1__0__Impl rule__Eq__Group_1__1
            {
            pushFollow(FOLLOW_rule__Eq__Group_1__0__Impl_in_rule__Eq__Group_1__08823);
            rule__Eq__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_1__1_in_rule__Eq__Group_1__08826);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4420:1: rule__Eq__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Eq__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4424:1: ( ( '(' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4425:1: ( '(' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4425:1: ( '(' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4426:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Eq__Group_1__0__Impl8854); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4439:1: rule__Eq__Group_1__1 : rule__Eq__Group_1__1__Impl rule__Eq__Group_1__2 ;
    public final void rule__Eq__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4443:1: ( rule__Eq__Group_1__1__Impl rule__Eq__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4444:2: rule__Eq__Group_1__1__Impl rule__Eq__Group_1__2
            {
            pushFollow(FOLLOW_rule__Eq__Group_1__1__Impl_in_rule__Eq__Group_1__18885);
            rule__Eq__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_1__2_in_rule__Eq__Group_1__18888);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4451:1: rule__Eq__Group_1__1__Impl : ( ( rule__Eq__Alternatives_1_1 ) ) ;
    public final void rule__Eq__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4455:1: ( ( ( rule__Eq__Alternatives_1_1 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4456:1: ( ( rule__Eq__Alternatives_1_1 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4456:1: ( ( rule__Eq__Alternatives_1_1 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4457:1: ( rule__Eq__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getAlternatives_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4458:1: ( rule__Eq__Alternatives_1_1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4458:2: rule__Eq__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__Eq__Alternatives_1_1_in_rule__Eq__Group_1__1__Impl8915);
            rule__Eq__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEqAccess().getAlternatives_1_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4468:1: rule__Eq__Group_1__2 : rule__Eq__Group_1__2__Impl ;
    public final void rule__Eq__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4472:1: ( rule__Eq__Group_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4473:2: rule__Eq__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Eq__Group_1__2__Impl_in_rule__Eq__Group_1__28945);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4479:1: rule__Eq__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Eq__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4483:1: ( ( ')' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4484:1: ( ')' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4484:1: ( ')' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4485:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,39,FOLLOW_39_in_rule__Eq__Group_1__2__Impl8973); if (state.failed) return ;
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


    // $ANTLR start "rule__ExprSimple__Group__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4504:1: rule__ExprSimple__Group__0 : rule__ExprSimple__Group__0__Impl rule__ExprSimple__Group__1 ;
    public final void rule__ExprSimple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4508:1: ( rule__ExprSimple__Group__0__Impl rule__ExprSimple__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4509:2: rule__ExprSimple__Group__0__Impl rule__ExprSimple__Group__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group__0__Impl_in_rule__ExprSimple__Group__09010);
            rule__ExprSimple__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group__1_in_rule__ExprSimple__Group__09013);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4516:1: rule__ExprSimple__Group__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4520:1: ( ( '(' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4521:1: ( '(' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4521:1: ( '(' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4522:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__ExprSimple__Group__0__Impl9041); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4535:1: rule__ExprSimple__Group__1 : rule__ExprSimple__Group__1__Impl rule__ExprSimple__Group__2 ;
    public final void rule__ExprSimple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4539:1: ( rule__ExprSimple__Group__1__Impl rule__ExprSimple__Group__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4540:2: rule__ExprSimple__Group__1__Impl rule__ExprSimple__Group__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group__1__Impl_in_rule__ExprSimple__Group__19072);
            rule__ExprSimple__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group__2_in_rule__ExprSimple__Group__19075);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4547:1: rule__ExprSimple__Group__1__Impl : ( ( rule__ExprSimple__Alternatives_1 ) ) ;
    public final void rule__ExprSimple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4551:1: ( ( ( rule__ExprSimple__Alternatives_1 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4552:1: ( ( rule__ExprSimple__Alternatives_1 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4552:1: ( ( rule__ExprSimple__Alternatives_1 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4553:1: ( rule__ExprSimple__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getAlternatives_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4554:1: ( rule__ExprSimple__Alternatives_1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4554:2: rule__ExprSimple__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Alternatives_1_in_rule__ExprSimple__Group__1__Impl9102);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4564:1: rule__ExprSimple__Group__2 : rule__ExprSimple__Group__2__Impl ;
    public final void rule__ExprSimple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4568:1: ( rule__ExprSimple__Group__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4569:2: rule__ExprSimple__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group__2__Impl_in_rule__ExprSimple__Group__29132);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4575:1: rule__ExprSimple__Group__2__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4579:1: ( ( ')' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4580:1: ( ')' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4580:1: ( ')' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4581:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,39,FOLLOW_39_in_rule__ExprSimple__Group__2__Impl9160); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4600:1: rule__ExprSimple__Group_1_0__0 : rule__ExprSimple__Group_1_0__0__Impl rule__ExprSimple__Group_1_0__1 ;
    public final void rule__ExprSimple__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4604:1: ( rule__ExprSimple__Group_1_0__0__Impl rule__ExprSimple__Group_1_0__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4605:2: rule__ExprSimple__Group_1_0__0__Impl rule__ExprSimple__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_0__0__Impl_in_rule__ExprSimple__Group_1_0__09197);
            rule__ExprSimple__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_0__1_in_rule__ExprSimple__Group_1_0__09200);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4612:1: rule__ExprSimple__Group_1_0__0__Impl : ( ( rule__ExprSimple__Alternatives_1_0_0 ) ) ;
    public final void rule__ExprSimple__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4616:1: ( ( ( rule__ExprSimple__Alternatives_1_0_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4617:1: ( ( rule__ExprSimple__Alternatives_1_0_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4617:1: ( ( rule__ExprSimple__Alternatives_1_0_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4618:1: ( rule__ExprSimple__Alternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getAlternatives_1_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4619:1: ( rule__ExprSimple__Alternatives_1_0_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4619:2: rule__ExprSimple__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_rule__ExprSimple__Alternatives_1_0_0_in_rule__ExprSimple__Group_1_0__0__Impl9227);
            rule__ExprSimple__Alternatives_1_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getAlternatives_1_0_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4629:1: rule__ExprSimple__Group_1_0__1 : rule__ExprSimple__Group_1_0__1__Impl ;
    public final void rule__ExprSimple__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4633:1: ( rule__ExprSimple__Group_1_0__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4634:2: rule__ExprSimple__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_0__1__Impl_in_rule__ExprSimple__Group_1_0__19257);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4640:1: rule__ExprSimple__Group_1_0__1__Impl : ( ruleLexpr ) ;
    public final void rule__ExprSimple__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4644:1: ( ( ruleLexpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4645:1: ( ruleLexpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4645:1: ( ruleLexpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4646:1: ruleLexpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLexprParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleLexpr_in_rule__ExprSimple__Group_1_0__1__Impl9284);
            ruleLexpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getLexprParserRuleCall_1_0_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4661:1: rule__ExprSimple__Group_1_1__0 : rule__ExprSimple__Group_1_1__0__Impl rule__ExprSimple__Group_1_1__1 ;
    public final void rule__ExprSimple__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4665:1: ( rule__ExprSimple__Group_1_1__0__Impl rule__ExprSimple__Group_1_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4666:2: rule__ExprSimple__Group_1_1__0__Impl rule__ExprSimple__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__0__Impl_in_rule__ExprSimple__Group_1_1__09317);
            rule__ExprSimple__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__1_in_rule__ExprSimple__Group_1_1__09320);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4673:1: rule__ExprSimple__Group_1_1__0__Impl : ( ( rule__ExprSimple__Alternatives_1_1_0 ) ) ;
    public final void rule__ExprSimple__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4677:1: ( ( ( rule__ExprSimple__Alternatives_1_1_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4678:1: ( ( rule__ExprSimple__Alternatives_1_1_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4678:1: ( ( rule__ExprSimple__Alternatives_1_1_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4679:1: ( rule__ExprSimple__Alternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getAlternatives_1_1_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4680:1: ( rule__ExprSimple__Alternatives_1_1_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4680:2: rule__ExprSimple__Alternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__ExprSimple__Alternatives_1_1_0_in_rule__ExprSimple__Group_1_1__0__Impl9347);
            rule__ExprSimple__Alternatives_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getAlternatives_1_1_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4690:1: rule__ExprSimple__Group_1_1__1 : rule__ExprSimple__Group_1_1__1__Impl rule__ExprSimple__Group_1_1__2 ;
    public final void rule__ExprSimple__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4694:1: ( rule__ExprSimple__Group_1_1__1__Impl rule__ExprSimple__Group_1_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4695:2: rule__ExprSimple__Group_1_1__1__Impl rule__ExprSimple__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__1__Impl_in_rule__ExprSimple__Group_1_1__19377);
            rule__ExprSimple__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__2_in_rule__ExprSimple__Group_1_1__19380);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4702:1: rule__ExprSimple__Group_1_1__1__Impl : ( RULE_LC ) ;
    public final void rule__ExprSimple__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4706:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4707:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4707:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4708:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLCTerminalRuleCall_1_1_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__ExprSimple__Group_1_1__1__Impl9407); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4719:1: rule__ExprSimple__Group_1_1__2 : rule__ExprSimple__Group_1_1__2__Impl ;
    public final void rule__ExprSimple__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4723:1: ( rule__ExprSimple__Group_1_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4724:2: rule__ExprSimple__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__2__Impl_in_rule__ExprSimple__Group_1_1__29436);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4730:1: rule__ExprSimple__Group_1_1__2__Impl : ( ruleExpr ) ;
    public final void rule__ExprSimple__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4734:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4735:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4735:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4736:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprParserRuleCall_1_1_2()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprSimple__Group_1_1__2__Impl9463);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExprSimpleAccess().getExprParserRuleCall_1_1_2()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4753:1: rule__Lexpr__Group__0 : rule__Lexpr__Group__0__Impl rule__Lexpr__Group__1 ;
    public final void rule__Lexpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4757:1: ( rule__Lexpr__Group__0__Impl rule__Lexpr__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4758:2: rule__Lexpr__Group__0__Impl rule__Lexpr__Group__1
            {
            pushFollow(FOLLOW_rule__Lexpr__Group__0__Impl_in_rule__Lexpr__Group__09498);
            rule__Lexpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Lexpr__Group__1_in_rule__Lexpr__Group__09501);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4765:1: rule__Lexpr__Group__0__Impl : ( RULE_LC ) ;
    public final void rule__Lexpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4769:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4770:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4770:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4771:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLexprAccess().getLCTerminalRuleCall_0()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Lexpr__Group__0__Impl9528); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4782:1: rule__Lexpr__Group__1 : rule__Lexpr__Group__1__Impl ;
    public final void rule__Lexpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4786:1: ( rule__Lexpr__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4787:2: rule__Lexpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Lexpr__Group__1__Impl_in_rule__Lexpr__Group__19557);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4793:1: rule__Lexpr__Group__1__Impl : ( ruleExpr ) ;
    public final void rule__Lexpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4797:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4798:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4798:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4799:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLexprAccess().getExprParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Lexpr__Group__1__Impl9584);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLexprAccess().getExprParserRuleCall_1()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4815:1: rule__Model__ModelAssignment_0 : ( rulefunction ) ;
    public final void rule__Model__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4819:1: ( ( rulefunction ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4820:1: ( rulefunction )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4820:1: ( rulefunction )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4821:1: rulefunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelFunctionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulefunction_in_rule__Model__ModelAssignment_09622);
            rulefunction();

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4830:1: rule__Function__FunNameAssignment_2 : ( RULE_SYMBOLES ) ;
    public final void rule__Function__FunNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4834:1: ( ( RULE_SYMBOLES ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4835:1: ( RULE_SYMBOLES )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4835:1: ( RULE_SYMBOLES )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4836:1: RULE_SYMBOLES
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFunNameSYMBOLESTerminalRuleCall_2_0()); 
            }
            match(input,RULE_SYMBOLES,FOLLOW_RULE_SYMBOLES_in_rule__Function__FunNameAssignment_29653); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4845:1: rule__Function__DefAssignment_5 : ( ruleDefiniton ) ;
    public final void rule__Function__DefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4849:1: ( ( ruleDefiniton ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4850:1: ( ruleDefiniton )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4850:1: ( ruleDefiniton )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4851:1: ruleDefiniton
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getDefDefinitonParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleDefiniton_in_rule__Function__DefAssignment_59684);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4860:1: rule__Definiton__InputVarsAssignment_2 : ( ruleInput ) ;
    public final void rule__Definiton__InputVarsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4864:1: ( ( ruleInput ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4865:1: ( ruleInput )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4865:1: ( ruleInput )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4866:1: ruleInput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getInputVarsInputParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleInput_in_rule__Definiton__InputVarsAssignment_29715);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4875:1: rule__Definiton__CommandListAssignment_5 : ( ruleCommands ) ;
    public final void rule__Definiton__CommandListAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4879:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4880:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4880:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4881:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getCommandListCommandsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Definiton__CommandListAssignment_59746);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4890:1: rule__Definiton__OutputVarsAssignment_10 : ( ruleOutput ) ;
    public final void rule__Definiton__OutputVarsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4894:1: ( ( ruleOutput ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4895:1: ( ruleOutput )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4895:1: ( ruleOutput )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4896:1: ruleOutput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getOutputVarsOutputParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_rule__Definiton__OutputVarsAssignment_109777);
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


    // $ANTLR start "rule__Commands__CAssignment_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4905:1: rule__Commands__CAssignment_0 : ( ruleCommand ) ;
    public final void rule__Commands__CAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4909:1: ( ( ruleCommand ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4910:1: ( ruleCommand )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4910:1: ( ruleCommand )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4911:1: ruleCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_rule__Commands__CAssignment_09808);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4920:1: rule__Commands__CAssignment_1_2 : ( ruleCommand ) ;
    public final void rule__Commands__CAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4924:1: ( ( ruleCommand ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4925:1: ( ruleCommand )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4925:1: ( ruleCommand )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4926:1: ruleCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_rule__Commands__CAssignment_1_29839);
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


    // $ANTLR start "rule__Command__VarLAssignment_1_0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4935:1: rule__Command__VarLAssignment_1_0 : ( ruleVars ) ;
    public final void rule__Command__VarLAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4939:1: ( ( ruleVars ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4940:1: ( ruleVars )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4940:1: ( ruleVars )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4941:1: ruleVars
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getVarLVarsParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleVars_in_rule__Command__VarLAssignment_1_09870);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4950:1: rule__Command__ExpLAssignment_1_4 : ( ruleExprs ) ;
    public final void rule__Command__ExpLAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4954:1: ( ( ruleExprs ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4955:1: ( ruleExprs )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4955:1: ( ruleExprs )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4956:1: ruleExprs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpLExprsParserRuleCall_1_4_0()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_rule__Command__ExpLAssignment_1_49901);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4965:1: rule__Command__NomAssignment_2_0 : ( ( 'while' ) ) ;
    public final void rule__Command__NomAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4969:1: ( ( ( 'while' ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4970:1: ( ( 'while' ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4970:1: ( ( 'while' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4971:1: ( 'while' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomWhileKeyword_2_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4972:1: ( 'while' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4973:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomWhileKeyword_2_0_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__Command__NomAssignment_2_09937); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4988:1: rule__Command__ExpAssignment_2_2 : ( ruleExpr ) ;
    public final void rule__Command__ExpAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4992:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4993:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4993:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4994:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpExprParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_2_29976);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5003:1: rule__Command__C1Assignment_2_6 : ( ruleCommands ) ;
    public final void rule__Command__C1Assignment_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5007:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5008:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5008:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5009:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_2_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__C1Assignment_2_610007);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5018:1: rule__Command__NomAssignment_3_0 : ( ( 'for' ) ) ;
    public final void rule__Command__NomAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5022:1: ( ( ( 'for' ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5023:1: ( ( 'for' ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5023:1: ( ( 'for' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5024:1: ( 'for' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomForKeyword_3_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5025:1: ( 'for' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5026:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomForKeyword_3_0_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__Command__NomAssignment_3_010043); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5041:1: rule__Command__ExpAssignment_3_2 : ( ruleExpr ) ;
    public final void rule__Command__ExpAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5045:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5046:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5046:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5047:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpExprParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_3_210082);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5056:1: rule__Command__C1Assignment_3_6 : ( ruleCommands ) ;
    public final void rule__Command__C1Assignment_3_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5060:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5061:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5061:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5062:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_3_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__C1Assignment_3_610113);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5071:1: rule__Command__NomAssignment_4_0 : ( ( 'foreach' ) ) ;
    public final void rule__Command__NomAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5075:1: ( ( ( 'foreach' ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5076:1: ( ( 'foreach' ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5076:1: ( ( 'foreach' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5077:1: ( 'foreach' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomForeachKeyword_4_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5078:1: ( 'foreach' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5079:1: 'foreach'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomForeachKeyword_4_0_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__Command__NomAssignment_4_010149); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5094:1: rule__Command__Exp1Assignment_4_2 : ( ruleExpr ) ;
    public final void rule__Command__Exp1Assignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5098:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5099:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5099:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5100:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExp1ExprParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__Exp1Assignment_4_210188);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5109:1: rule__Command__Exp2Assignment_4_6 : ( ruleExpr ) ;
    public final void rule__Command__Exp2Assignment_4_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5113:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5114:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5114:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5115:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExp2ExprParserRuleCall_4_6_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__Exp2Assignment_4_610219);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5124:1: rule__Command__C1Assignment_4_10 : ( ruleCommands ) ;
    public final void rule__Command__C1Assignment_4_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5128:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5129:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5129:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5130:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_4_10_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__C1Assignment_4_1010250);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5139:1: rule__Command__NomAssignment_5_0 : ( ( 'if' ) ) ;
    public final void rule__Command__NomAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5143:1: ( ( ( 'if' ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5144:1: ( ( 'if' ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5144:1: ( ( 'if' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5145:1: ( 'if' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomIfKeyword_5_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5146:1: ( 'if' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5147:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getNomIfKeyword_5_0_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__Command__NomAssignment_5_010286); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5162:1: rule__Command__ExpAssignment_5_2 : ( ruleExpr ) ;
    public final void rule__Command__ExpAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5166:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5167:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5167:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5168:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExpExprParserRuleCall_5_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_5_210325);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5177:1: rule__Command__C1Assignment_5_6 : ( ruleCommands ) ;
    public final void rule__Command__C1Assignment_5_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5181:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5182:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5182:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5183:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_5_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__C1Assignment_5_610356);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5192:1: rule__Command__C2Assignment_5_8_2 : ( ruleCommands ) ;
    public final void rule__Command__C2Assignment_5_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5196:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5197:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5197:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:5198:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC2CommandsParserRuleCall_5_8_2_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__C2Assignment_5_8_210387);
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

    // $ANTLR start synpred8_InternalMyDsl
    public final void synpred8_InternalMyDsl_fragment() throws RecognitionException {   
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ( ( ruleExprSimple ) )
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ( ruleExprSimple )
        {
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:597:1: ( ruleExprSimple )
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:598:1: ruleExprSimple
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprAccess().getExprSimpleParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_ruleExprSimple_in_synpred8_InternalMyDsl1246);
        ruleExprSimple();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalMyDsl

    // $ANTLR start synpred9_InternalMyDsl
    public final void synpred9_InternalMyDsl_fragment() throws RecognitionException {   
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:603:6: ( ( ruleAnd ) )
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:603:6: ( ruleAnd )
        {
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:603:6: ( ruleAnd )
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:604:1: ruleAnd
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprAccess().getAndParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_ruleAnd_in_synpred9_InternalMyDsl1263);
        ruleAnd();

        state._fsp--;
        if (state.failed) return ;

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
        "\3\uffff\3\20\33\uffff";
    static final String DFA4_minS =
        "\2\4\1\uffff\3\6\4\0\4\uffff\1\0\10\uffff\1\0\2\uffff\1\0\6\uffff";
    static final String DFA4_maxS =
        "\2\46\1\uffff\3\47\4\0\4\uffff\1\0\10\uffff\1\0\2\uffff\1\0\6\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\15\uffff\1\3\17\uffff\1\1";
    static final String DFA4_specialS =
        "\6\uffff\1\0\1\1\1\2\1\3\4\uffff\1\4\10\uffff\1\5\2\uffff\1\6\6"+
        "\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\4\1\5\10\uffff\1\3\25\uffff\1\2\1\uffff\1\1",
            "\2\2\10\uffff\1\2\1\6\1\7\1\10\1\11\23\uffff\1\2",
            "",
            "\1\16\21\uffff\2\20\13\uffff\1\2\1\uffff\1\20",
            "\1\27\21\uffff\2\20\13\uffff\1\2\1\uffff\1\20",
            "\1\32\21\uffff\2\20\13\uffff\1\2\1\uffff\1\20",
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
            return "592:1: rule__Expr__Alternatives : ( ( ruleExprSimple ) | ( ruleAnd ) | ( ruleExprTerm ) );";
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
                        int LA4_23 = input.LA(1);

                         
                        int index4_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred9_InternalMyDsl()) ) {s = 2;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index4_23);
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
        "\2\4\13\uffff";
    static final String DFA5_maxS =
        "\2\46\13\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\1\2\uffff\1\2\7\uffff";
    static final String DFA5_specialS =
        "\15\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\2\10\uffff\1\2\27\uffff\1\1",
            "\2\5\10\uffff\1\5\4\2\23\uffff\1\5",
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
        "\1\6\3\uffff\1\4\17\uffff";
    static final String DFA25_maxS =
        "\1\47\3\uffff\1\46\17\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\2\21\uffff\1\1";
    static final String DFA25_specialS =
        "\24\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\4\21\uffff\2\1\15\uffff\1\1",
            "",
            "",
            "",
            "\2\1\10\uffff\1\1\7\uffff\1\1\5\uffff\6\1\1\23\1\uffff\1\1"+
            "\1\uffff\1\1",
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
            return "()* loopback of 3803:1: ( rule__And__Group_1__0 )*";
        }
    }
    static final String DFA26_eotS =
        "\25\uffff";
    static final String DFA26_eofS =
        "\1\1\1\uffff\1\1\22\uffff";
    static final String DFA26_minS =
        "\1\6\1\uffff\1\4\22\uffff";
    static final String DFA26_maxS =
        "\1\47\1\uffff\1\46\22\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\2\20\uffff\1\1\2\uffff";
    static final String DFA26_specialS =
        "\25\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\2\21\uffff\2\1\15\uffff\1\1",
            "",
            "\2\1\10\uffff\1\1\7\uffff\1\1\5\uffff\7\1\1\22\1\1\1\uffff"+
            "\1\1",
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
            return "()* loopback of 3989:1: ( rule__Or__Group_1__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel76 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel109 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rulefunction_in_entryRulefunction137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0_in_rulefunction170 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__Lexpr__Group__0_in_ruleLexpr1072 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Lexpr__Group__0_in_ruleLexpr1084 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Command__Group_0__0_in_rule__Command__Alternatives1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__0_in_rule__Command__Alternatives1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__0_in_rule__Command__Alternatives1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__0_in_rule__Command__Alternatives1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__0_in_rule__Command__Alternatives1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__0_in_rule__Command__Alternatives1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Expr__Alternatives1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Expr__Alternatives1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_rule__Expr__Alternatives1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__0_in_rule__Eq__Alternatives1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__0_in_rule__Eq__Alternatives1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Eq__Alternatives_0_01363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_rule__Eq__Alternatives_0_01380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Eq__Alternatives_0_41412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_rule__Eq__Alternatives_0_41429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_rule__Eq__Alternatives_1_11461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Eq__Alternatives_1_11478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ExprTerm__Alternatives1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__ExprTerm__Alternatives1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOLES_in_rule__ExprTerm__Alternatives1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_0__0_in_rule__ExprSimple__Alternatives_11579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__0_in_rule__ExprSimple__Alternatives_11597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ExprSimple__Alternatives_1_0_01631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ExprSimple__Alternatives_1_0_01651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ExprSimple__Alternatives_1_1_01686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ExprSimple__Alternatives_1_1_01706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01738 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ModelAssignment_0_in_rule__Model__Group__0__Impl1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Model__Group__1__Impl1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__01861 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__01864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Function__Group__0__Impl1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__11923 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__11926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Function__Group__1__Impl1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__21982 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__21985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__FunNameAssignment_2_in_rule__Function__Group__2__Impl2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__32042 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__32045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Function__Group__3__Impl2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__42104 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Function__Group__5_in_rule__Function__Group__42107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Function__Group__4__Impl2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__52163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__DefAssignment_5_in_rule__Function__Group__5__Impl2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__0__Impl_in_rule__Definiton__Group__02232 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Definiton__Group__1_in_rule__Definiton__Group__02235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Definiton__Group__0__Impl2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__1__Impl_in_rule__Definiton__Group__12294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definiton__Group__2_in_rule__Definiton__Group__12297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Definiton__Group__1__Impl2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__2__Impl_in_rule__Definiton__Group__22353 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Definiton__Group__3_in_rule__Definiton__Group__22356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__InputVarsAssignment_2_in_rule__Definiton__Group__2__Impl2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__3__Impl_in_rule__Definiton__Group__32413 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Definiton__Group__4_in_rule__Definiton__Group__32416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Definiton__Group__3__Impl2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__4__Impl_in_rule__Definiton__Group__42472 = new BitSet(new long[]{0x00000F0004000010L});
    public static final BitSet FOLLOW_rule__Definiton__Group__5_in_rule__Definiton__Group__42475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Definiton__Group__4__Impl2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__5__Impl_in_rule__Definiton__Group__52534 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Definiton__Group__6_in_rule__Definiton__Group__52537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__CommandListAssignment_5_in_rule__Definiton__Group__5__Impl2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__6__Impl_in_rule__Definiton__Group__62594 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Definiton__Group__7_in_rule__Definiton__Group__62597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Definiton__Group__6__Impl2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__7__Impl_in_rule__Definiton__Group__72653 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Definiton__Group__8_in_rule__Definiton__Group__72656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Definiton__Group__7__Impl2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__8__Impl_in_rule__Definiton__Group__82715 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Definiton__Group__9_in_rule__Definiton__Group__82718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Definiton__Group__8__Impl2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__9__Impl_in_rule__Definiton__Group__92777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definiton__Group__10_in_rule__Definiton__Group__92780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Definiton__Group__9__Impl2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__10__Impl_in_rule__Definiton__Group__102836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__OutputVarsAssignment_10_in_rule__Definiton__Group__10__Impl2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__02915 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Input__Group__1_in_rule__Input__Group__02918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Input__Group__0__Impl2945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__12974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__0_in_rule__Input__Group__1__Impl3001 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__0__Impl_in_rule__Input__Group_1__03036 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Input__Group_1__1_in_rule__Input__Group_1__03039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Input__Group_1__0__Impl3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__1__Impl_in_rule__Input__Group_1__13098 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Input__Group_1__2_in_rule__Input__Group_1__13101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Input__Group_1__1__Impl3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__2__Impl_in_rule__Input__Group_1__23160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Input__Group_1__2__Impl3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__03222 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Output__Group__1_in_rule__Output__Group__03225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Output__Group__0__Impl3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__13281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__0_in_rule__Output__Group__1__Impl3308 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__0__Impl_in_rule__Output__Group_1__03343 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Output__Group_1__1_in_rule__Output__Group_1__03346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Output__Group_1__0__Impl3374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__1__Impl_in_rule__Output__Group_1__13405 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Output__Group_1__2_in_rule__Output__Group_1__13408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Output__Group_1__1__Impl3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__2__Impl_in_rule__Output__Group_1__23467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Output__Group_1__2__Impl3494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group__0__Impl_in_rule__Commands__Group__03529 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Commands__Group__1_in_rule__Commands__Group__03532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__CAssignment_0_in_rule__Commands__Group__0__Impl3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group__1__Impl_in_rule__Commands__Group__13589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__0_in_rule__Commands__Group__1__Impl3616 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__0__Impl_in_rule__Commands__Group_1__03651 = new BitSet(new long[]{0x00000F0004000050L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__1_in_rule__Commands__Group_1__03654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Commands__Group_1__0__Impl3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__1__Impl_in_rule__Commands__Group_1__13713 = new BitSet(new long[]{0x00000F0004000050L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__2_in_rule__Commands__Group_1__13716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Commands__Group_1__1__Impl3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__2__Impl_in_rule__Commands__Group_1__23775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__CAssignment_1_2_in_rule__Commands__Group_1__2__Impl3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__03838 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__03841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Vars__Group__0__Impl3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__13897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__0_in_rule__Vars__Group__1__Impl3924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__0__Impl_in_rule__Vars__Group_1__03959 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__1_in_rule__Vars__Group_1__03962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Vars__Group_1__0__Impl3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__1__Impl_in_rule__Vars__Group_1__14021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_rule__Vars__Group_1__1__Impl4048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__04081 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__04084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Exprs__Group__0__Impl4111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__14140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__0_in_rule__Exprs__Group__1__Impl4167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__0__Impl_in_rule__Exprs__Group_1__04202 = new BitSet(new long[]{0x0000005000004030L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__1_in_rule__Exprs__Group_1__04205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Exprs__Group_1__0__Impl4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__1__Impl_in_rule__Exprs__Group_1__14264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_rule__Exprs__Group_1__1__Impl4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_0__0__Impl_in_rule__Command__Group_0__04324 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Command__Group_0__1_in_rule__Command__Group_0__04327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_0__1__Impl_in_rule__Command__Group_0__14385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Command__Group_0__1__Impl4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__0__Impl_in_rule__Command__Group_1__04448 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_rule__Command__Group_1__1_in_rule__Command__Group_1__04451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__VarLAssignment_1_0_in_rule__Command__Group_1__0__Impl4478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__1__Impl_in_rule__Command__Group_1__14508 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_rule__Command__Group_1__2_in_rule__Command__Group_1__14511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_1__1__Impl4539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__2__Impl_in_rule__Command__Group_1__24570 = new BitSet(new long[]{0x0000005000004070L});
    public static final BitSet FOLLOW_rule__Command__Group_1__3_in_rule__Command__Group_1__24573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Command__Group_1__2__Impl4601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__3__Impl_in_rule__Command__Group_1__34632 = new BitSet(new long[]{0x0000005000004070L});
    public static final BitSet FOLLOW_rule__Command__Group_1__4_in_rule__Command__Group_1__34635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_1__3__Impl4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__4__Impl_in_rule__Command__Group_1__44694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExpLAssignment_1_4_in_rule__Command__Group_1__4__Impl4721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__0__Impl_in_rule__Command__Group_2__04761 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_2__1_in_rule__Command__Group_2__04764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NomAssignment_2_0_in_rule__Command__Group_2__0__Impl4791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__1__Impl_in_rule__Command__Group_2__14821 = new BitSet(new long[]{0x0000005000004030L});
    public static final BitSet FOLLOW_rule__Command__Group_2__2_in_rule__Command__Group_2__14824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_2__1__Impl4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__2__Impl_in_rule__Command__Group_2__24880 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_2__3_in_rule__Command__Group_2__24883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExpAssignment_2_2_in_rule__Command__Group_2__2__Impl4910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__3__Impl_in_rule__Command__Group_2__34940 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Command__Group_2__4_in_rule__Command__Group_2__34943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_2__3__Impl4970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__4__Impl_in_rule__Command__Group_2__44999 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_2__5_in_rule__Command__Group_2__45002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Command__Group_2__4__Impl5030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__5__Impl_in_rule__Command__Group_2__55061 = new BitSet(new long[]{0x00000F0004000010L});
    public static final BitSet FOLLOW_rule__Command__Group_2__6_in_rule__Command__Group_2__55064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_2__5__Impl5091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__6__Impl_in_rule__Command__Group_2__65120 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_2__7_in_rule__Command__Group_2__65123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__C1Assignment_2_6_in_rule__Command__Group_2__6__Impl5150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__7__Impl_in_rule__Command__Group_2__75180 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Command__Group_2__8_in_rule__Command__Group_2__75183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_2__7__Impl5210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__8__Impl_in_rule__Command__Group_2__85239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Command__Group_2__8__Impl5267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__0__Impl_in_rule__Command__Group_3__05316 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_3__1_in_rule__Command__Group_3__05319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NomAssignment_3_0_in_rule__Command__Group_3__0__Impl5346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__1__Impl_in_rule__Command__Group_3__15376 = new BitSet(new long[]{0x0000005000004030L});
    public static final BitSet FOLLOW_rule__Command__Group_3__2_in_rule__Command__Group_3__15379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_3__1__Impl5406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__2__Impl_in_rule__Command__Group_3__25435 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_3__3_in_rule__Command__Group_3__25438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExpAssignment_3_2_in_rule__Command__Group_3__2__Impl5465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__3__Impl_in_rule__Command__Group_3__35495 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Command__Group_3__4_in_rule__Command__Group_3__35498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_3__3__Impl5525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__4__Impl_in_rule__Command__Group_3__45554 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_3__5_in_rule__Command__Group_3__45557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Command__Group_3__4__Impl5585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__5__Impl_in_rule__Command__Group_3__55616 = new BitSet(new long[]{0x00000F0004000010L});
    public static final BitSet FOLLOW_rule__Command__Group_3__6_in_rule__Command__Group_3__55619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_3__5__Impl5646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__6__Impl_in_rule__Command__Group_3__65675 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_3__7_in_rule__Command__Group_3__65678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__C1Assignment_3_6_in_rule__Command__Group_3__6__Impl5705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__7__Impl_in_rule__Command__Group_3__75735 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Command__Group_3__8_in_rule__Command__Group_3__75738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_3__7__Impl5765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__8__Impl_in_rule__Command__Group_3__85794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Command__Group_3__8__Impl5822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__0__Impl_in_rule__Command__Group_4__05871 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_4__1_in_rule__Command__Group_4__05874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NomAssignment_4_0_in_rule__Command__Group_4__0__Impl5901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__1__Impl_in_rule__Command__Group_4__15931 = new BitSet(new long[]{0x0000005000004030L});
    public static final BitSet FOLLOW_rule__Command__Group_4__2_in_rule__Command__Group_4__15934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__1__Impl5961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__2__Impl_in_rule__Command__Group_4__25990 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_4__3_in_rule__Command__Group_4__25993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Exp1Assignment_4_2_in_rule__Command__Group_4__2__Impl6020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__3__Impl_in_rule__Command__Group_4__36050 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Command__Group_4__4_in_rule__Command__Group_4__36053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__3__Impl6080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__4__Impl_in_rule__Command__Group_4__46109 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_4__5_in_rule__Command__Group_4__46112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Command__Group_4__4__Impl6140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__5__Impl_in_rule__Command__Group_4__56171 = new BitSet(new long[]{0x0000005000004030L});
    public static final BitSet FOLLOW_rule__Command__Group_4__6_in_rule__Command__Group_4__56174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__5__Impl6201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__6__Impl_in_rule__Command__Group_4__66230 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_4__7_in_rule__Command__Group_4__66233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Exp2Assignment_4_6_in_rule__Command__Group_4__6__Impl6260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__7__Impl_in_rule__Command__Group_4__76290 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Command__Group_4__8_in_rule__Command__Group_4__76293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__7__Impl6320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__8__Impl_in_rule__Command__Group_4__86349 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_4__9_in_rule__Command__Group_4__86352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Command__Group_4__8__Impl6380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__9__Impl_in_rule__Command__Group_4__96411 = new BitSet(new long[]{0x00000F0004000010L});
    public static final BitSet FOLLOW_rule__Command__Group_4__10_in_rule__Command__Group_4__96414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__9__Impl6441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__10__Impl_in_rule__Command__Group_4__106470 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_4__11_in_rule__Command__Group_4__106473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__C1Assignment_4_10_in_rule__Command__Group_4__10__Impl6500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__11__Impl_in_rule__Command__Group_4__116530 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Command__Group_4__12_in_rule__Command__Group_4__116533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__11__Impl6560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__12__Impl_in_rule__Command__Group_4__126589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Command__Group_4__12__Impl6617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__0__Impl_in_rule__Command__Group_5__06674 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_5__1_in_rule__Command__Group_5__06677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__NomAssignment_5_0_in_rule__Command__Group_5__0__Impl6704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__1__Impl_in_rule__Command__Group_5__16734 = new BitSet(new long[]{0x0000005000004030L});
    public static final BitSet FOLLOW_rule__Command__Group_5__2_in_rule__Command__Group_5__16737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5__1__Impl6764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__2__Impl_in_rule__Command__Group_5__26793 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_5__3_in_rule__Command__Group_5__26796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__ExpAssignment_5_2_in_rule__Command__Group_5__2__Impl6823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__3__Impl_in_rule__Command__Group_5__36853 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Command__Group_5__4_in_rule__Command__Group_5__36856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5__3__Impl6883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__4__Impl_in_rule__Command__Group_5__46912 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_5__5_in_rule__Command__Group_5__46915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Command__Group_5__4__Impl6943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__5__Impl_in_rule__Command__Group_5__56974 = new BitSet(new long[]{0x00000F0004000010L});
    public static final BitSet FOLLOW_rule__Command__Group_5__6_in_rule__Command__Group_5__56977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5__5__Impl7004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__6__Impl_in_rule__Command__Group_5__67033 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_5__7_in_rule__Command__Group_5__67036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__C1Assignment_5_6_in_rule__Command__Group_5__6__Impl7063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__7__Impl_in_rule__Command__Group_5__77093 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__Command__Group_5__8_in_rule__Command__Group_5__77096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5__7__Impl7123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__8__Impl_in_rule__Command__Group_5__87152 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__Command__Group_5__9_in_rule__Command__Group_5__87155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__0_in_rule__Command__Group_5__8__Impl7182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__9__Impl_in_rule__Command__Group_5__97213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Command__Group_5__9__Impl7241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__0__Impl_in_rule__Command__Group_5_8__07292 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__1_in_rule__Command__Group_5_8__07295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Command__Group_5_8__0__Impl7323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__1__Impl_in_rule__Command__Group_5_8__17354 = new BitSet(new long[]{0x00000F0004000010L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__2_in_rule__Command__Group_5_8__17357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5_8__1__Impl7384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__2__Impl_in_rule__Command__Group_5_8__27413 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__3_in_rule__Command__Group_5_8__27416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__C2Assignment_5_8_2_in_rule__Command__Group_5_8__2__Impl7443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__3__Impl_in_rule__Command__Group_5_8__37473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5_8__3__Impl7500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__07537 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__07540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rule__And__Group__0__Impl7567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__17596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl7623 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__07658 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__07661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__And__Group_1__0__Impl7688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__17717 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__17720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__And__Group_1__1__Impl7748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__27779 = new BitSet(new long[]{0x0000005000004030L});
    public static final BitSet FOLLOW_rule__And__Group_1__3_in_rule__And__Group_1__27782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__And__Group_1__2__Impl7809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__3__Impl_in_rule__And__Group_1__37838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rule__And__Group_1__3__Impl7865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__07902 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__07905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_rule__Or__Group__0__Impl7932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__17961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl7988 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__08023 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__08026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Or__Group_1__0__Impl8053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__18082 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__18085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Or__Group_1__1__Impl8113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__28144 = new BitSet(new long[]{0x0000005000004030L});
    public static final BitSet FOLLOW_rule__Or__Group_1__3_in_rule__Or__Group_1__28147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Or__Group_1__2__Impl8174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__3__Impl_in_rule__Or__Group_1__38203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_rule__Or__Group_1__3__Impl8230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__Group__0__Impl_in_rule__Not__Group__08267 = new BitSet(new long[]{0x0000005000004030L});
    public static final BitSet FOLLOW_rule__Not__Group__1_in_rule__Not__Group__08270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__Group_0__0_in_rule__Not__Group__0__Impl8297 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__Not__Group__1__Impl_in_rule__Not__Group__18328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEq_in_rule__Not__Group__1__Impl8355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__Group_0__0__Impl_in_rule__Not__Group_0__08388 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Not__Group_0__1_in_rule__Not__Group_0__08391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Not__Group_0__0__Impl8419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__Group_0__1__Impl_in_rule__Not__Group_0__18450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Not__Group_0__1__Impl8477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__0__Impl_in_rule__Eq__Group_0__08510 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__1_in_rule__Eq__Group_0__08513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Alternatives_0_0_in_rule__Eq__Group_0__0__Impl8540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__1__Impl_in_rule__Eq__Group_0__18570 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__2_in_rule__Eq__Group_0__18573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Eq__Group_0__1__Impl8601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__2__Impl_in_rule__Eq__Group_0__28632 = new BitSet(new long[]{0x0000004000004070L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__3_in_rule__Eq__Group_0__28635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Eq__Group_0__2__Impl8663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__3__Impl_in_rule__Eq__Group_0__38694 = new BitSet(new long[]{0x0000004000004070L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__4_in_rule__Eq__Group_0__38697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Eq__Group_0__3__Impl8725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__4__Impl_in_rule__Eq__Group_0__48756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Alternatives_0_4_in_rule__Eq__Group_0__4__Impl8783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__0__Impl_in_rule__Eq__Group_1__08823 = new BitSet(new long[]{0x0000004000004030L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__1_in_rule__Eq__Group_1__08826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Eq__Group_1__0__Impl8854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__1__Impl_in_rule__Eq__Group_1__18885 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__2_in_rule__Eq__Group_1__18888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Alternatives_1_1_in_rule__Eq__Group_1__1__Impl8915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__2__Impl_in_rule__Eq__Group_1__28945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Eq__Group_1__2__Impl8973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__0__Impl_in_rule__ExprSimple__Group__09010 = new BitSet(new long[]{0x0000000000078000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__1_in_rule__ExprSimple__Group__09013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__ExprSimple__Group__0__Impl9041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__1__Impl_in_rule__ExprSimple__Group__19072 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__2_in_rule__ExprSimple__Group__19075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Alternatives_1_in_rule__ExprSimple__Group__1__Impl9102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__2__Impl_in_rule__ExprSimple__Group__29132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ExprSimple__Group__2__Impl9160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_0__0__Impl_in_rule__ExprSimple__Group_1_0__09197 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_0__1_in_rule__ExprSimple__Group_1_0__09200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Alternatives_1_0_0_in_rule__ExprSimple__Group_1_0__0__Impl9227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_0__1__Impl_in_rule__ExprSimple__Group_1_0__19257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLexpr_in_rule__ExprSimple__Group_1_0__1__Impl9284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__0__Impl_in_rule__ExprSimple__Group_1_1__09317 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__1_in_rule__ExprSimple__Group_1_1__09320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Alternatives_1_1_0_in_rule__ExprSimple__Group_1_1__0__Impl9347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__1__Impl_in_rule__ExprSimple__Group_1_1__19377 = new BitSet(new long[]{0x0000005000004030L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__2_in_rule__ExprSimple__Group_1_1__19380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__ExprSimple__Group_1_1__1__Impl9407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__2__Impl_in_rule__ExprSimple__Group_1_1__29436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprSimple__Group_1_1__2__Impl9463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lexpr__Group__0__Impl_in_rule__Lexpr__Group__09498 = new BitSet(new long[]{0x0000005000004030L});
    public static final BitSet FOLLOW_rule__Lexpr__Group__1_in_rule__Lexpr__Group__09501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Lexpr__Group__0__Impl9528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lexpr__Group__1__Impl_in_rule__Lexpr__Group__19557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Lexpr__Group__1__Impl9584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_rule__Model__ModelAssignment_09622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOLES_in_rule__Function__FunNameAssignment_29653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefiniton_in_rule__Function__DefAssignment_59684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_rule__Definiton__InputVarsAssignment_29715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Definiton__CommandListAssignment_59746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_rule__Definiton__OutputVarsAssignment_109777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Commands__CAssignment_09808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Commands__CAssignment_1_29839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_rule__Command__VarLAssignment_1_09870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_rule__Command__ExpLAssignment_1_49901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Command__NomAssignment_2_09937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_2_29976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__C1Assignment_2_610007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Command__NomAssignment_3_010043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_3_210082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__C1Assignment_3_610113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Command__NomAssignment_4_010149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__Exp1Assignment_4_210188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__Exp2Assignment_4_610219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__C1Assignment_4_1010250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Command__NomAssignment_5_010286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__ExpAssignment_5_210325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__C1Assignment_5_610356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__C2Assignment_5_8_210387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_synpred8_InternalMyDsl1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_synpred9_InternalMyDsl1263 = new BitSet(new long[]{0x0000000000000002L});

}