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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_VARIABLE", "RULE_SYMBOLES", "RULE_LC", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'nop'", "'nil'", "'cons'", "'list'", "'hd'", "'tl'", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "':='", "'while'", "'do'", "'od'", "'for'", "'foreach'", "'in'", "'if'", "'then'", "'fi'", "'else'", "'and'", "'or'", "'not'", "'=?'", "'('", "')'"
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

                if ( (LA1_0==20) ) {
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:546:1: rule__Command__Alternatives : ( ( 'nop' ) | ( ( rule__Command__Group_1__0 ) ) | ( ( rule__Command__Group_2__0 ) ) | ( ( rule__Command__Group_3__0 ) ) | ( ( rule__Command__Group_4__0 ) ) | ( ( rule__Command__Group_5__0 ) ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:550:1: ( ( 'nop' ) | ( ( rule__Command__Group_1__0 ) ) | ( ( rule__Command__Group_2__0 ) ) | ( ( rule__Command__Group_3__0 ) ) | ( ( rule__Command__Group_4__0 ) ) | ( ( rule__Command__Group_5__0 ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt3=2;
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            case 31:
                {
                alt3=4;
                }
                break;
            case 32:
                {
                alt3=5;
                }
                break;
            case 34:
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( 'nop' )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:551:1: ( 'nop' )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: 'nop'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getNopKeyword_0()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Command__Alternatives1124); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCommandAccess().getNopKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:559:6: ( ( rule__Command__Group_1__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:559:6: ( ( rule__Command__Group_1__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:560:1: ( rule__Command__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getGroup_1()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:561:1: ( rule__Command__Group_1__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:561:2: rule__Command__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_1__0_in_rule__Command__Alternatives1143);
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:565:6: ( ( rule__Command__Group_2__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:565:6: ( ( rule__Command__Group_2__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:566:1: ( rule__Command__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getGroup_2()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:567:1: ( rule__Command__Group_2__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:567:2: rule__Command__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_2__0_in_rule__Command__Alternatives1161);
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:571:6: ( ( rule__Command__Group_3__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:571:6: ( ( rule__Command__Group_3__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:572:1: ( rule__Command__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getGroup_3()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:573:1: ( rule__Command__Group_3__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:573:2: rule__Command__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_3__0_in_rule__Command__Alternatives1179);
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:577:6: ( ( rule__Command__Group_4__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:577:6: ( ( rule__Command__Group_4__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:578:1: ( rule__Command__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getGroup_4()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:579:1: ( rule__Command__Group_4__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:579:2: rule__Command__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_4__0_in_rule__Command__Alternatives1197);
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:583:6: ( ( rule__Command__Group_5__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:583:6: ( ( rule__Command__Group_5__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:584:1: ( rule__Command__Group_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getGroup_5()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:585:1: ( rule__Command__Group_5__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:585:2: rule__Command__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_5__0_in_rule__Command__Alternatives1215);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:594:1: rule__Expr__Alternatives : ( ( ruleExprSimple ) | ( ruleAnd ) | ( ruleExprTerm ) );
    public final void rule__Expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:598:1: ( ( ruleExprSimple ) | ( ruleAnd ) | ( ruleExprTerm ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:599:1: ( ruleExprSimple )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:599:1: ( ruleExprSimple )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:600:1: ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getExprSimpleParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_rule__Expr__Alternatives1248);
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:605:6: ( ruleAnd )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:605:6: ( ruleAnd )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:606:1: ruleAnd
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getAndParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAnd_in_rule__Expr__Alternatives1265);
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:611:6: ( ruleExprTerm )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:611:6: ( ruleExprTerm )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:612:1: ruleExprTerm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprAccess().getExprTermParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleExprTerm_in_rule__Expr__Alternatives1282);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:622:1: rule__Eq__Alternatives : ( ( ( rule__Eq__Group_0__0 ) ) | ( ( rule__Eq__Group_1__0 ) ) );
    public final void rule__Eq__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:626:1: ( ( ( rule__Eq__Group_0__0 ) ) | ( ( rule__Eq__Group_1__0 ) ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:627:1: ( ( rule__Eq__Group_0__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:627:1: ( ( rule__Eq__Group_0__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:628:1: ( rule__Eq__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getGroup_0()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:629:1: ( rule__Eq__Group_0__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:629:2: rule__Eq__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Eq__Group_0__0_in_rule__Eq__Alternatives1314);
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:633:6: ( ( rule__Eq__Group_1__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:633:6: ( ( rule__Eq__Group_1__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:634:1: ( rule__Eq__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getGroup_1()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:635:1: ( rule__Eq__Group_1__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:635:2: rule__Eq__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Eq__Group_1__0_in_rule__Eq__Alternatives1332);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:644:1: rule__Eq__Alternatives_0_0 : ( ( ruleExprSimple ) | ( ruleExprTerm ) );
    public final void rule__Eq__Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:648:1: ( ( ruleExprSimple ) | ( ruleExprTerm ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==42) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_VARIABLE && LA6_0<=RULE_SYMBOLES)||LA6_0==15) ) {
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:649:1: ( ruleExprSimple )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:649:1: ( ruleExprSimple )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:650:1: ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getExprSimpleParserRuleCall_0_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_rule__Eq__Alternatives_0_01365);
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:655:6: ( ruleExprTerm )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:655:6: ( ruleExprTerm )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:656:1: ruleExprTerm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getExprTermParserRuleCall_0_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleExprTerm_in_rule__Eq__Alternatives_0_01382);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:666:1: rule__Eq__Alternatives_0_4 : ( ( ruleExprSimple ) | ( ruleExprTerm ) );
    public final void rule__Eq__Alternatives_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:670:1: ( ( ruleExprSimple ) | ( ruleExprTerm ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==42) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_VARIABLE && LA7_0<=RULE_SYMBOLES)||LA7_0==15) ) {
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:671:1: ( ruleExprSimple )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:671:1: ( ruleExprSimple )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:672:1: ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getExprSimpleParserRuleCall_0_4_0()); 
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_rule__Eq__Alternatives_0_41414);
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:677:6: ( ruleExprTerm )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:677:6: ( ruleExprTerm )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:678:1: ruleExprTerm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getExprTermParserRuleCall_0_4_1()); 
                    }
                    pushFollow(FOLLOW_ruleExprTerm_in_rule__Eq__Alternatives_0_41431);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:688:1: rule__Eq__Alternatives_1_1 : ( ( ruleExprTerm ) | ( ruleExprSimple ) );
    public final void rule__Eq__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:692:1: ( ( ruleExprTerm ) | ( ruleExprSimple ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_VARIABLE && LA8_0<=RULE_SYMBOLES)||LA8_0==15) ) {
                alt8=1;
            }
            else if ( (LA8_0==42) ) {
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:693:1: ( ruleExprTerm )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:693:1: ( ruleExprTerm )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:694:1: ruleExprTerm
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getExprTermParserRuleCall_1_1_0()); 
                    }
                    pushFollow(FOLLOW_ruleExprTerm_in_rule__Eq__Alternatives_1_11463);
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:699:6: ( ruleExprSimple )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:699:6: ( ruleExprSimple )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:700:1: ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEqAccess().getExprSimpleParserRuleCall_1_1_1()); 
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_rule__Eq__Alternatives_1_11480);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:710:1: rule__ExprTerm__Alternatives : ( ( 'nil' ) | ( RULE_VARIABLE ) | ( RULE_SYMBOLES ) );
    public final void rule__ExprTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:714:1: ( ( 'nil' ) | ( RULE_VARIABLE ) | ( RULE_SYMBOLES ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 15:
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:715:1: ( 'nil' )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:715:1: ( 'nil' )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:716:1: 'nil'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprTermAccess().getNilKeyword_0()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__ExprTerm__Alternatives1513); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprTermAccess().getNilKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:723:6: ( RULE_VARIABLE )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:723:6: ( RULE_VARIABLE )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:724:1: RULE_VARIABLE
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprTermAccess().getVARIABLETerminalRuleCall_1()); 
                    }
                    match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__ExprTerm__Alternatives1532); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprTermAccess().getVARIABLETerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:729:6: ( RULE_SYMBOLES )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:729:6: ( RULE_SYMBOLES )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:730:1: RULE_SYMBOLES
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprTermAccess().getSYMBOLESTerminalRuleCall_2()); 
                    }
                    match(input,RULE_SYMBOLES,FOLLOW_RULE_SYMBOLES_in_rule__ExprTerm__Alternatives1549); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:740:1: rule__ExprSimple__Alternatives_1 : ( ( ( rule__ExprSimple__Group_1_0__0 ) ) | ( ( rule__ExprSimple__Group_1_1__0 ) ) );
    public final void rule__ExprSimple__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:744:1: ( ( ( rule__ExprSimple__Group_1_0__0 ) ) | ( ( rule__ExprSimple__Group_1_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=16 && LA10_0<=17)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=18 && LA10_0<=19)) ) {
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:745:1: ( ( rule__ExprSimple__Group_1_0__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:745:1: ( ( rule__ExprSimple__Group_1_0__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:746:1: ( rule__ExprSimple__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_1_0()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:747:1: ( rule__ExprSimple__Group_1_0__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:747:2: rule__ExprSimple__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_1_0__0_in_rule__ExprSimple__Alternatives_11581);
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:751:6: ( ( rule__ExprSimple__Group_1_1__0 ) )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:751:6: ( ( rule__ExprSimple__Group_1_1__0 ) )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:752:1: ( rule__ExprSimple__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getGroup_1_1()); 
                    }
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:753:1: ( rule__ExprSimple__Group_1_1__0 )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:753:2: rule__ExprSimple__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__0_in_rule__ExprSimple__Alternatives_11599);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:762:1: rule__ExprSimple__Alternatives_1_0_0 : ( ( 'cons' ) | ( 'list' ) );
    public final void rule__ExprSimple__Alternatives_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:766:1: ( ( 'cons' ) | ( 'list' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==16) ) {
                alt11=1;
            }
            else if ( (LA11_0==17) ) {
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:767:1: ( 'cons' )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:767:1: ( 'cons' )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: 'cons'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getConsKeyword_1_0_0_0()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__ExprSimple__Alternatives_1_0_01633); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getConsKeyword_1_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:775:6: ( 'list' )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:775:6: ( 'list' )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:776:1: 'list'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getListKeyword_1_0_0_1()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__ExprSimple__Alternatives_1_0_01653); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:788:1: rule__ExprSimple__Alternatives_1_1_0 : ( ( 'hd' ) | ( 'tl' ) );
    public final void rule__ExprSimple__Alternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:792:1: ( ( 'hd' ) | ( 'tl' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==19) ) {
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
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:793:1: ( 'hd' )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:793:1: ( 'hd' )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:794:1: 'hd'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getHdKeyword_1_1_0_0()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__ExprSimple__Alternatives_1_1_01688); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExprSimpleAccess().getHdKeyword_1_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:801:6: ( 'tl' )
                    {
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:801:6: ( 'tl' )
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:802:1: 'tl'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExprSimpleAccess().getTlKeyword_1_1_0_1()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__ExprSimple__Alternatives_1_1_01708); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:816:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:820:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:821:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01740);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01743);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:828:1: rule__Model__Group__0__Impl : ( ( rule__Model__ModelAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: ( ( ( rule__Model__ModelAssignment_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:833:1: ( ( rule__Model__ModelAssignment_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:833:1: ( ( rule__Model__ModelAssignment_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:834:1: ( rule__Model__ModelAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelAssignment_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:835:1: ( rule__Model__ModelAssignment_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:835:2: rule__Model__ModelAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__ModelAssignment_0_in_rule__Model__Group__0__Impl1770);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:845:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:849:1: ( rule__Model__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:850:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11800);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:856:1: rule__Model__Group__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:860:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:861:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:861:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:862:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getLCTerminalRuleCall_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:863:1: ( RULE_LC )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_LC) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:863:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Model__Group__1__Impl1828); if (state.failed) return ;

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:877:1: rule__Function__Group__0 : rule__Function__Group__0__Impl rule__Function__Group__1 ;
    public final void rule__Function__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:881:1: ( rule__Function__Group__0__Impl rule__Function__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:882:2: rule__Function__Group__0__Impl rule__Function__Group__1
            {
            pushFollow(FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__01863);
            rule__Function__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__1_in_rule__Function__Group__01866);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:889:1: rule__Function__Group__0__Impl : ( 'function' ) ;
    public final void rule__Function__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:893:1: ( ( 'function' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:894:1: ( 'function' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:894:1: ( 'function' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:895:1: 'function'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFunctionKeyword_0()); 
            }
            match(input,20,FOLLOW_20_in_rule__Function__Group__0__Impl1894); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:908:1: rule__Function__Group__1 : rule__Function__Group__1__Impl rule__Function__Group__2 ;
    public final void rule__Function__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:912:1: ( rule__Function__Group__1__Impl rule__Function__Group__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:913:2: rule__Function__Group__1__Impl rule__Function__Group__2
            {
            pushFollow(FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__11925);
            rule__Function__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__2_in_rule__Function__Group__11928);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:920:1: rule__Function__Group__1__Impl : ( RULE_LC ) ;
    public final void rule__Function__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:924:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:925:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:925:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:926:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getLCTerminalRuleCall_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Function__Group__1__Impl1955); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:937:1: rule__Function__Group__2 : rule__Function__Group__2__Impl rule__Function__Group__3 ;
    public final void rule__Function__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:941:1: ( rule__Function__Group__2__Impl rule__Function__Group__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:942:2: rule__Function__Group__2__Impl rule__Function__Group__3
            {
            pushFollow(FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__21984);
            rule__Function__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__3_in_rule__Function__Group__21987);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:949:1: rule__Function__Group__2__Impl : ( ( rule__Function__FunNameAssignment_2 ) ) ;
    public final void rule__Function__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:953:1: ( ( ( rule__Function__FunNameAssignment_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:954:1: ( ( rule__Function__FunNameAssignment_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:954:1: ( ( rule__Function__FunNameAssignment_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:955:1: ( rule__Function__FunNameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFunNameAssignment_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:956:1: ( rule__Function__FunNameAssignment_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:956:2: rule__Function__FunNameAssignment_2
            {
            pushFollow(FOLLOW_rule__Function__FunNameAssignment_2_in_rule__Function__Group__2__Impl2014);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:966:1: rule__Function__Group__3 : rule__Function__Group__3__Impl rule__Function__Group__4 ;
    public final void rule__Function__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:970:1: ( rule__Function__Group__3__Impl rule__Function__Group__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:971:2: rule__Function__Group__3__Impl rule__Function__Group__4
            {
            pushFollow(FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__32044);
            rule__Function__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__4_in_rule__Function__Group__32047);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:978:1: rule__Function__Group__3__Impl : ( ':' ) ;
    public final void rule__Function__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:982:1: ( ( ':' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:983:1: ( ':' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:983:1: ( ':' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:984:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getColonKeyword_3()); 
            }
            match(input,21,FOLLOW_21_in_rule__Function__Group__3__Impl2075); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:997:1: rule__Function__Group__4 : rule__Function__Group__4__Impl rule__Function__Group__5 ;
    public final void rule__Function__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1001:1: ( rule__Function__Group__4__Impl rule__Function__Group__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:2: rule__Function__Group__4__Impl rule__Function__Group__5
            {
            pushFollow(FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__42106);
            rule__Function__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Function__Group__5_in_rule__Function__Group__42109);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1009:1: rule__Function__Group__4__Impl : ( RULE_LC ) ;
    public final void rule__Function__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1014:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1014:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1015:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getLCTerminalRuleCall_4()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Function__Group__4__Impl2136); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1026:1: rule__Function__Group__5 : rule__Function__Group__5__Impl ;
    public final void rule__Function__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:1: ( rule__Function__Group__5__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1031:2: rule__Function__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__52165);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1037:1: rule__Function__Group__5__Impl : ( ( rule__Function__DefAssignment_5 ) ) ;
    public final void rule__Function__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1041:1: ( ( ( rule__Function__DefAssignment_5 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:1: ( ( rule__Function__DefAssignment_5 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:1: ( ( rule__Function__DefAssignment_5 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1043:1: ( rule__Function__DefAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getDefAssignment_5()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:1: ( rule__Function__DefAssignment_5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:2: rule__Function__DefAssignment_5
            {
            pushFollow(FOLLOW_rule__Function__DefAssignment_5_in_rule__Function__Group__5__Impl2192);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1066:1: rule__Definiton__Group__0 : rule__Definiton__Group__0__Impl rule__Definiton__Group__1 ;
    public final void rule__Definiton__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1070:1: ( rule__Definiton__Group__0__Impl rule__Definiton__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1071:2: rule__Definiton__Group__0__Impl rule__Definiton__Group__1
            {
            pushFollow(FOLLOW_rule__Definiton__Group__0__Impl_in_rule__Definiton__Group__02234);
            rule__Definiton__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__1_in_rule__Definiton__Group__02237);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1078:1: rule__Definiton__Group__0__Impl : ( 'read' ) ;
    public final void rule__Definiton__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1082:1: ( ( 'read' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1083:1: ( 'read' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1083:1: ( 'read' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1084:1: 'read'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getReadKeyword_0()); 
            }
            match(input,22,FOLLOW_22_in_rule__Definiton__Group__0__Impl2265); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1097:1: rule__Definiton__Group__1 : rule__Definiton__Group__1__Impl rule__Definiton__Group__2 ;
    public final void rule__Definiton__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1101:1: ( rule__Definiton__Group__1__Impl rule__Definiton__Group__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1102:2: rule__Definiton__Group__1__Impl rule__Definiton__Group__2
            {
            pushFollow(FOLLOW_rule__Definiton__Group__1__Impl_in_rule__Definiton__Group__12296);
            rule__Definiton__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__2_in_rule__Definiton__Group__12299);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1109:1: rule__Definiton__Group__1__Impl : ( RULE_LC ) ;
    public final void rule__Definiton__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1113:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1114:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1114:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1115:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Definiton__Group__1__Impl2326); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1126:1: rule__Definiton__Group__2 : rule__Definiton__Group__2__Impl rule__Definiton__Group__3 ;
    public final void rule__Definiton__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1130:1: ( rule__Definiton__Group__2__Impl rule__Definiton__Group__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1131:2: rule__Definiton__Group__2__Impl rule__Definiton__Group__3
            {
            pushFollow(FOLLOW_rule__Definiton__Group__2__Impl_in_rule__Definiton__Group__22355);
            rule__Definiton__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__3_in_rule__Definiton__Group__22358);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:1: rule__Definiton__Group__2__Impl : ( ( rule__Definiton__InputVarsAssignment_2 ) ) ;
    public final void rule__Definiton__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: ( ( ( rule__Definiton__InputVarsAssignment_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1143:1: ( ( rule__Definiton__InputVarsAssignment_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1143:1: ( ( rule__Definiton__InputVarsAssignment_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1144:1: ( rule__Definiton__InputVarsAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getInputVarsAssignment_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1145:1: ( rule__Definiton__InputVarsAssignment_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1145:2: rule__Definiton__InputVarsAssignment_2
            {
            pushFollow(FOLLOW_rule__Definiton__InputVarsAssignment_2_in_rule__Definiton__Group__2__Impl2385);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1155:1: rule__Definiton__Group__3 : rule__Definiton__Group__3__Impl rule__Definiton__Group__4 ;
    public final void rule__Definiton__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1159:1: ( rule__Definiton__Group__3__Impl rule__Definiton__Group__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:2: rule__Definiton__Group__3__Impl rule__Definiton__Group__4
            {
            pushFollow(FOLLOW_rule__Definiton__Group__3__Impl_in_rule__Definiton__Group__32415);
            rule__Definiton__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__4_in_rule__Definiton__Group__32418);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1167:1: rule__Definiton__Group__3__Impl : ( RULE_LC ) ;
    public final void rule__Definiton__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1171:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1172:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1172:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1173:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Definiton__Group__3__Impl2445); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1184:1: rule__Definiton__Group__4 : rule__Definiton__Group__4__Impl rule__Definiton__Group__5 ;
    public final void rule__Definiton__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1188:1: ( rule__Definiton__Group__4__Impl rule__Definiton__Group__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1189:2: rule__Definiton__Group__4__Impl rule__Definiton__Group__5
            {
            pushFollow(FOLLOW_rule__Definiton__Group__4__Impl_in_rule__Definiton__Group__42474);
            rule__Definiton__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__5_in_rule__Definiton__Group__42477);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1196:1: rule__Definiton__Group__4__Impl : ( '%' ) ;
    public final void rule__Definiton__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1200:1: ( ( '%' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:1: ( '%' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1201:1: ( '%' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getPercentSignKeyword_4()); 
            }
            match(input,23,FOLLOW_23_in_rule__Definiton__Group__4__Impl2505); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1215:1: rule__Definiton__Group__5 : rule__Definiton__Group__5__Impl rule__Definiton__Group__6 ;
    public final void rule__Definiton__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1219:1: ( rule__Definiton__Group__5__Impl rule__Definiton__Group__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1220:2: rule__Definiton__Group__5__Impl rule__Definiton__Group__6
            {
            pushFollow(FOLLOW_rule__Definiton__Group__5__Impl_in_rule__Definiton__Group__52536);
            rule__Definiton__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__6_in_rule__Definiton__Group__52539);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1227:1: rule__Definiton__Group__5__Impl : ( ( rule__Definiton__CommandListAssignment_5 ) ) ;
    public final void rule__Definiton__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1231:1: ( ( ( rule__Definiton__CommandListAssignment_5 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1232:1: ( ( rule__Definiton__CommandListAssignment_5 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1232:1: ( ( rule__Definiton__CommandListAssignment_5 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1233:1: ( rule__Definiton__CommandListAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getCommandListAssignment_5()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1234:1: ( rule__Definiton__CommandListAssignment_5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1234:2: rule__Definiton__CommandListAssignment_5
            {
            pushFollow(FOLLOW_rule__Definiton__CommandListAssignment_5_in_rule__Definiton__Group__5__Impl2566);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1244:1: rule__Definiton__Group__6 : rule__Definiton__Group__6__Impl rule__Definiton__Group__7 ;
    public final void rule__Definiton__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1248:1: ( rule__Definiton__Group__6__Impl rule__Definiton__Group__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1249:2: rule__Definiton__Group__6__Impl rule__Definiton__Group__7
            {
            pushFollow(FOLLOW_rule__Definiton__Group__6__Impl_in_rule__Definiton__Group__62596);
            rule__Definiton__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__7_in_rule__Definiton__Group__62599);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1256:1: rule__Definiton__Group__6__Impl : ( RULE_LC ) ;
    public final void rule__Definiton__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1260:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1261:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1261:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1262:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_6()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Definiton__Group__6__Impl2626); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1273:1: rule__Definiton__Group__7 : rule__Definiton__Group__7__Impl rule__Definiton__Group__8 ;
    public final void rule__Definiton__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1277:1: ( rule__Definiton__Group__7__Impl rule__Definiton__Group__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1278:2: rule__Definiton__Group__7__Impl rule__Definiton__Group__8
            {
            pushFollow(FOLLOW_rule__Definiton__Group__7__Impl_in_rule__Definiton__Group__72655);
            rule__Definiton__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__8_in_rule__Definiton__Group__72658);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:1: rule__Definiton__Group__7__Impl : ( '%' ) ;
    public final void rule__Definiton__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1289:1: ( ( '%' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1290:1: ( '%' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1290:1: ( '%' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1291:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getPercentSignKeyword_7()); 
            }
            match(input,23,FOLLOW_23_in_rule__Definiton__Group__7__Impl2686); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1304:1: rule__Definiton__Group__8 : rule__Definiton__Group__8__Impl rule__Definiton__Group__9 ;
    public final void rule__Definiton__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1308:1: ( rule__Definiton__Group__8__Impl rule__Definiton__Group__9 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1309:2: rule__Definiton__Group__8__Impl rule__Definiton__Group__9
            {
            pushFollow(FOLLOW_rule__Definiton__Group__8__Impl_in_rule__Definiton__Group__82717);
            rule__Definiton__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__9_in_rule__Definiton__Group__82720);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1316:1: rule__Definiton__Group__8__Impl : ( 'write' ) ;
    public final void rule__Definiton__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1320:1: ( ( 'write' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1321:1: ( 'write' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1321:1: ( 'write' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1322:1: 'write'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getWriteKeyword_8()); 
            }
            match(input,24,FOLLOW_24_in_rule__Definiton__Group__8__Impl2748); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1335:1: rule__Definiton__Group__9 : rule__Definiton__Group__9__Impl rule__Definiton__Group__10 ;
    public final void rule__Definiton__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1339:1: ( rule__Definiton__Group__9__Impl rule__Definiton__Group__10 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1340:2: rule__Definiton__Group__9__Impl rule__Definiton__Group__10
            {
            pushFollow(FOLLOW_rule__Definiton__Group__9__Impl_in_rule__Definiton__Group__92779);
            rule__Definiton__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Definiton__Group__10_in_rule__Definiton__Group__92782);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1347:1: rule__Definiton__Group__9__Impl : ( RULE_LC ) ;
    public final void rule__Definiton__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1351:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1352:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1352:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1353:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_9()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Definiton__Group__9__Impl2809); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1364:1: rule__Definiton__Group__10 : rule__Definiton__Group__10__Impl ;
    public final void rule__Definiton__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1368:1: ( rule__Definiton__Group__10__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1369:2: rule__Definiton__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__Definiton__Group__10__Impl_in_rule__Definiton__Group__102838);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1375:1: rule__Definiton__Group__10__Impl : ( ( rule__Definiton__OutputVarsAssignment_10 ) ) ;
    public final void rule__Definiton__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1379:1: ( ( ( rule__Definiton__OutputVarsAssignment_10 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1380:1: ( ( rule__Definiton__OutputVarsAssignment_10 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1380:1: ( ( rule__Definiton__OutputVarsAssignment_10 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1381:1: ( rule__Definiton__OutputVarsAssignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getOutputVarsAssignment_10()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1382:1: ( rule__Definiton__OutputVarsAssignment_10 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1382:2: rule__Definiton__OutputVarsAssignment_10
            {
            pushFollow(FOLLOW_rule__Definiton__OutputVarsAssignment_10_in_rule__Definiton__Group__10__Impl2865);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1414:1: rule__Input__Group__0 : rule__Input__Group__0__Impl rule__Input__Group__1 ;
    public final void rule__Input__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1418:1: ( rule__Input__Group__0__Impl rule__Input__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1419:2: rule__Input__Group__0__Impl rule__Input__Group__1
            {
            pushFollow(FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__02917);
            rule__Input__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group__1_in_rule__Input__Group__02920);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1426:1: rule__Input__Group__0__Impl : ( RULE_VARIABLE ) ;
    public final void rule__Input__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1430:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1431:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1431:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1432:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVARIABLETerminalRuleCall_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Input__Group__0__Impl2947); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1443:1: rule__Input__Group__1 : rule__Input__Group__1__Impl ;
    public final void rule__Input__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1447:1: ( rule__Input__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1448:2: rule__Input__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__12976);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:1: rule__Input__Group__1__Impl : ( ( rule__Input__Group_1__0 )* ) ;
    public final void rule__Input__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1458:1: ( ( ( rule__Input__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1459:1: ( ( rule__Input__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1459:1: ( ( rule__Input__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1460:1: ( rule__Input__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1461:1: ( rule__Input__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1461:2: rule__Input__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Input__Group_1__0_in_rule__Input__Group__1__Impl3003);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1475:1: rule__Input__Group_1__0 : rule__Input__Group_1__0__Impl rule__Input__Group_1__1 ;
    public final void rule__Input__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1479:1: ( rule__Input__Group_1__0__Impl rule__Input__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1480:2: rule__Input__Group_1__0__Impl rule__Input__Group_1__1
            {
            pushFollow(FOLLOW_rule__Input__Group_1__0__Impl_in_rule__Input__Group_1__03038);
            rule__Input__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_1__1_in_rule__Input__Group_1__03041);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1487:1: rule__Input__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Input__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1491:1: ( ( ',' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1492:1: ( ',' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1492:1: ( ',' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1493:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getCommaKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Input__Group_1__0__Impl3069); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1506:1: rule__Input__Group_1__1 : rule__Input__Group_1__1__Impl rule__Input__Group_1__2 ;
    public final void rule__Input__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1510:1: ( rule__Input__Group_1__1__Impl rule__Input__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1511:2: rule__Input__Group_1__1__Impl rule__Input__Group_1__2
            {
            pushFollow(FOLLOW_rule__Input__Group_1__1__Impl_in_rule__Input__Group_1__13100);
            rule__Input__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Input__Group_1__2_in_rule__Input__Group_1__13103);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:1: rule__Input__Group_1__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Input__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1522:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1523:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1523:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1524:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getLCTerminalRuleCall_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1525:1: ( RULE_LC )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_LC) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1525:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Input__Group_1__1__Impl3131); if (state.failed) return ;

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1535:1: rule__Input__Group_1__2 : rule__Input__Group_1__2__Impl ;
    public final void rule__Input__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1539:1: ( rule__Input__Group_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1540:2: rule__Input__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Input__Group_1__2__Impl_in_rule__Input__Group_1__23162);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1546:1: rule__Input__Group_1__2__Impl : ( RULE_VARIABLE ) ;
    public final void rule__Input__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1550:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1551:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1551:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1552:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInputAccess().getVARIABLETerminalRuleCall_1_2()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Input__Group_1__2__Impl3189); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1569:1: rule__Output__Group__0 : rule__Output__Group__0__Impl rule__Output__Group__1 ;
    public final void rule__Output__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1573:1: ( rule__Output__Group__0__Impl rule__Output__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1574:2: rule__Output__Group__0__Impl rule__Output__Group__1
            {
            pushFollow(FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__03224);
            rule__Output__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group__1_in_rule__Output__Group__03227);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1581:1: rule__Output__Group__0__Impl : ( RULE_VARIABLE ) ;
    public final void rule__Output__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1585:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1586:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1587:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVARIABLETerminalRuleCall_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Output__Group__0__Impl3254); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1598:1: rule__Output__Group__1 : rule__Output__Group__1__Impl ;
    public final void rule__Output__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1602:1: ( rule__Output__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1603:2: rule__Output__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__13283);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1609:1: rule__Output__Group__1__Impl : ( ( rule__Output__Group_1__0 )* ) ;
    public final void rule__Output__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1613:1: ( ( ( rule__Output__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:1: ( ( rule__Output__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1614:1: ( ( rule__Output__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1615:1: ( rule__Output__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1616:1: ( rule__Output__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1616:2: rule__Output__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Output__Group_1__0_in_rule__Output__Group__1__Impl3310);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1630:1: rule__Output__Group_1__0 : rule__Output__Group_1__0__Impl rule__Output__Group_1__1 ;
    public final void rule__Output__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1634:1: ( rule__Output__Group_1__0__Impl rule__Output__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1635:2: rule__Output__Group_1__0__Impl rule__Output__Group_1__1
            {
            pushFollow(FOLLOW_rule__Output__Group_1__0__Impl_in_rule__Output__Group_1__03345);
            rule__Output__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group_1__1_in_rule__Output__Group_1__03348);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1642:1: rule__Output__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Output__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1646:1: ( ( ',' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1647:1: ( ',' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1647:1: ( ',' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1648:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getCommaKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Output__Group_1__0__Impl3376); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1661:1: rule__Output__Group_1__1 : rule__Output__Group_1__1__Impl rule__Output__Group_1__2 ;
    public final void rule__Output__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1665:1: ( rule__Output__Group_1__1__Impl rule__Output__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1666:2: rule__Output__Group_1__1__Impl rule__Output__Group_1__2
            {
            pushFollow(FOLLOW_rule__Output__Group_1__1__Impl_in_rule__Output__Group_1__13407);
            rule__Output__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Output__Group_1__2_in_rule__Output__Group_1__13410);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1673:1: rule__Output__Group_1__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Output__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1677:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1679:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getLCTerminalRuleCall_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1680:1: ( RULE_LC )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_LC) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1680:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Output__Group_1__1__Impl3438); if (state.failed) return ;

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1690:1: rule__Output__Group_1__2 : rule__Output__Group_1__2__Impl ;
    public final void rule__Output__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1694:1: ( rule__Output__Group_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1695:2: rule__Output__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Output__Group_1__2__Impl_in_rule__Output__Group_1__23469);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1701:1: rule__Output__Group_1__2__Impl : ( RULE_VARIABLE ) ;
    public final void rule__Output__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1705:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1706:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1706:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1707:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOutputAccess().getVARIABLETerminalRuleCall_1_2()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Output__Group_1__2__Impl3496); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:1: rule__Commands__Group__0 : rule__Commands__Group__0__Impl rule__Commands__Group__1 ;
    public final void rule__Commands__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1728:1: ( rule__Commands__Group__0__Impl rule__Commands__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1729:2: rule__Commands__Group__0__Impl rule__Commands__Group__1
            {
            pushFollow(FOLLOW_rule__Commands__Group__0__Impl_in_rule__Commands__Group__03531);
            rule__Commands__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group__1_in_rule__Commands__Group__03534);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1736:1: rule__Commands__Group__0__Impl : ( ( rule__Commands__CAssignment_0 ) ) ;
    public final void rule__Commands__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1740:1: ( ( ( rule__Commands__CAssignment_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:1: ( ( rule__Commands__CAssignment_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1741:1: ( ( rule__Commands__CAssignment_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1742:1: ( rule__Commands__CAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCAssignment_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1743:1: ( rule__Commands__CAssignment_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1743:2: rule__Commands__CAssignment_0
            {
            pushFollow(FOLLOW_rule__Commands__CAssignment_0_in_rule__Commands__Group__0__Impl3561);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1753:1: rule__Commands__Group__1 : rule__Commands__Group__1__Impl ;
    public final void rule__Commands__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1757:1: ( rule__Commands__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1758:2: rule__Commands__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Commands__Group__1__Impl_in_rule__Commands__Group__13591);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1764:1: rule__Commands__Group__1__Impl : ( ( rule__Commands__Group_1__0 )* ) ;
    public final void rule__Commands__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1768:1: ( ( ( rule__Commands__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1769:1: ( ( rule__Commands__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1769:1: ( ( rule__Commands__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1770:1: ( rule__Commands__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1771:1: ( rule__Commands__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1771:2: rule__Commands__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Commands__Group_1__0_in_rule__Commands__Group__1__Impl3618);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1785:1: rule__Commands__Group_1__0 : rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1 ;
    public final void rule__Commands__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1789:1: ( rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1790:2: rule__Commands__Group_1__0__Impl rule__Commands__Group_1__1
            {
            pushFollow(FOLLOW_rule__Commands__Group_1__0__Impl_in_rule__Commands__Group_1__03653);
            rule__Commands__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group_1__1_in_rule__Commands__Group_1__03656);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1797:1: rule__Commands__Group_1__0__Impl : ( ';' ) ;
    public final void rule__Commands__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1801:1: ( ( ';' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1802:1: ( ';' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1802:1: ( ';' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1803:1: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__Commands__Group_1__0__Impl3684); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1816:1: rule__Commands__Group_1__1 : rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2 ;
    public final void rule__Commands__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1820:1: ( rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1821:2: rule__Commands__Group_1__1__Impl rule__Commands__Group_1__2
            {
            pushFollow(FOLLOW_rule__Commands__Group_1__1__Impl_in_rule__Commands__Group_1__13715);
            rule__Commands__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Commands__Group_1__2_in_rule__Commands__Group_1__13718);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1828:1: rule__Commands__Group_1__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Commands__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1832:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1833:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1833:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1834:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getLCTerminalRuleCall_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1835:1: ( RULE_LC )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_LC) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1835:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Commands__Group_1__1__Impl3746); if (state.failed) return ;

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1845:1: rule__Commands__Group_1__2 : rule__Commands__Group_1__2__Impl ;
    public final void rule__Commands__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1849:1: ( rule__Commands__Group_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1850:2: rule__Commands__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Commands__Group_1__2__Impl_in_rule__Commands__Group_1__23777);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1856:1: rule__Commands__Group_1__2__Impl : ( ( rule__Commands__CAssignment_1_2 ) ) ;
    public final void rule__Commands__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:1: ( ( ( rule__Commands__CAssignment_1_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1861:1: ( ( rule__Commands__CAssignment_1_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1861:1: ( ( rule__Commands__CAssignment_1_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1862:1: ( rule__Commands__CAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCAssignment_1_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1863:1: ( rule__Commands__CAssignment_1_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1863:2: rule__Commands__CAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Commands__CAssignment_1_2_in_rule__Commands__Group_1__2__Impl3804);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:1: rule__Vars__Group__0 : rule__Vars__Group__0__Impl rule__Vars__Group__1 ;
    public final void rule__Vars__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1883:1: ( rule__Vars__Group__0__Impl rule__Vars__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1884:2: rule__Vars__Group__0__Impl rule__Vars__Group__1
            {
            pushFollow(FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__03840);
            rule__Vars__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__03843);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1891:1: rule__Vars__Group__0__Impl : ( RULE_VARIABLE ) ;
    public final void rule__Vars__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1895:1: ( ( RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1896:1: ( RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1896:1: ( RULE_VARIABLE )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1897:1: RULE_VARIABLE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVARIABLETerminalRuleCall_0()); 
            }
            match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_rule__Vars__Group__0__Impl3870); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1908:1: rule__Vars__Group__1 : rule__Vars__Group__1__Impl ;
    public final void rule__Vars__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1912:1: ( rule__Vars__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1913:2: rule__Vars__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__13899);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1919:1: rule__Vars__Group__1__Impl : ( ( rule__Vars__Group_1__0 )? ) ;
    public final void rule__Vars__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1923:1: ( ( ( rule__Vars__Group_1__0 )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1924:1: ( ( rule__Vars__Group_1__0 )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1924:1: ( ( rule__Vars__Group_1__0 )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1925:1: ( rule__Vars__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1926:1: ( rule__Vars__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1926:2: rule__Vars__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Vars__Group_1__0_in_rule__Vars__Group__1__Impl3926);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1940:1: rule__Vars__Group_1__0 : rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 ;
    public final void rule__Vars__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1944:1: ( rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1945:2: rule__Vars__Group_1__0__Impl rule__Vars__Group_1__1
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__0__Impl_in_rule__Vars__Group_1__03961);
            rule__Vars__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Vars__Group_1__1_in_rule__Vars__Group_1__03964);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1952:1: rule__Vars__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Vars__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1956:1: ( ( ',' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1957:1: ( ',' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1957:1: ( ',' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1958:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getCommaKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Vars__Group_1__0__Impl3992); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1971:1: rule__Vars__Group_1__1 : rule__Vars__Group_1__1__Impl ;
    public final void rule__Vars__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1975:1: ( rule__Vars__Group_1__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1976:2: rule__Vars__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Vars__Group_1__1__Impl_in_rule__Vars__Group_1__14023);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1982:1: rule__Vars__Group_1__1__Impl : ( ruleVars ) ;
    public final void rule__Vars__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1986:1: ( ( ruleVars ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1987:1: ( ruleVars )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1987:1: ( ruleVars )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:1988:1: ruleVars
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVarsAccess().getVarsParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleVars_in_rule__Vars__Group_1__1__Impl4050);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2003:1: rule__Exprs__Group__0 : rule__Exprs__Group__0__Impl rule__Exprs__Group__1 ;
    public final void rule__Exprs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2007:1: ( rule__Exprs__Group__0__Impl rule__Exprs__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2008:2: rule__Exprs__Group__0__Impl rule__Exprs__Group__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__04083);
            rule__Exprs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__04086);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2015:1: rule__Exprs__Group__0__Impl : ( ruleExpr ) ;
    public final void rule__Exprs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2019:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2020:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2020:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2021:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Exprs__Group__0__Impl4113);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2032:1: rule__Exprs__Group__1 : rule__Exprs__Group__1__Impl ;
    public final void rule__Exprs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2036:1: ( rule__Exprs__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2037:2: rule__Exprs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__14142);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2043:1: rule__Exprs__Group__1__Impl : ( ( rule__Exprs__Group_1__0 )? ) ;
    public final void rule__Exprs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2047:1: ( ( ( rule__Exprs__Group_1__0 )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2048:1: ( ( rule__Exprs__Group_1__0 )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2048:1: ( ( rule__Exprs__Group_1__0 )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2049:1: ( rule__Exprs__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2050:1: ( rule__Exprs__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2050:2: rule__Exprs__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Exprs__Group_1__0_in_rule__Exprs__Group__1__Impl4169);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2064:1: rule__Exprs__Group_1__0 : rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1 ;
    public final void rule__Exprs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2068:1: ( rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:2: rule__Exprs__Group_1__0__Impl rule__Exprs__Group_1__1
            {
            pushFollow(FOLLOW_rule__Exprs__Group_1__0__Impl_in_rule__Exprs__Group_1__04204);
            rule__Exprs__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Exprs__Group_1__1_in_rule__Exprs__Group_1__04207);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2076:1: rule__Exprs__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Exprs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2080:1: ( ( ',' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2081:1: ( ',' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2081:1: ( ',' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2082:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getCommaKeyword_1_0()); 
            }
            match(input,25,FOLLOW_25_in_rule__Exprs__Group_1__0__Impl4235); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2095:1: rule__Exprs__Group_1__1 : rule__Exprs__Group_1__1__Impl ;
    public final void rule__Exprs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2099:1: ( rule__Exprs__Group_1__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2100:2: rule__Exprs__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Exprs__Group_1__1__Impl_in_rule__Exprs__Group_1__14266);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2106:1: rule__Exprs__Group_1__1__Impl : ( ruleExprs ) ;
    public final void rule__Exprs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2110:1: ( ( ruleExprs ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:1: ( ruleExprs )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:1: ( ruleExprs )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2112:1: ruleExprs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprsAccess().getExprsParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_rule__Exprs__Group_1__1__Impl4293);
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


    // $ANTLR start "rule__Command__Group_1__0"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2127:1: rule__Command__Group_1__0 : rule__Command__Group_1__0__Impl rule__Command__Group_1__1 ;
    public final void rule__Command__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2131:1: ( rule__Command__Group_1__0__Impl rule__Command__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2132:2: rule__Command__Group_1__0__Impl rule__Command__Group_1__1
            {
            pushFollow(FOLLOW_rule__Command__Group_1__0__Impl_in_rule__Command__Group_1__04326);
            rule__Command__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__1_in_rule__Command__Group_1__04329);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2139:1: rule__Command__Group_1__0__Impl : ( ruleVars ) ;
    public final void rule__Command__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2143:1: ( ( ruleVars ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:1: ( ruleVars )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:1: ( ruleVars )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2145:1: ruleVars
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getVarsParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleVars_in_rule__Command__Group_1__0__Impl4356);
            ruleVars();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getVarsParserRuleCall_1_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2156:1: rule__Command__Group_1__1 : rule__Command__Group_1__1__Impl rule__Command__Group_1__2 ;
    public final void rule__Command__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2160:1: ( rule__Command__Group_1__1__Impl rule__Command__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2161:2: rule__Command__Group_1__1__Impl rule__Command__Group_1__2
            {
            pushFollow(FOLLOW_rule__Command__Group_1__1__Impl_in_rule__Command__Group_1__14385);
            rule__Command__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__2_in_rule__Command__Group_1__14388);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2168:1: rule__Command__Group_1__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Command__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2172:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2173:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2173:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2174:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2175:1: ( RULE_LC )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_LC) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2175:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_1__1__Impl4416); if (state.failed) return ;

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2185:1: rule__Command__Group_1__2 : rule__Command__Group_1__2__Impl rule__Command__Group_1__3 ;
    public final void rule__Command__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2189:1: ( rule__Command__Group_1__2__Impl rule__Command__Group_1__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2190:2: rule__Command__Group_1__2__Impl rule__Command__Group_1__3
            {
            pushFollow(FOLLOW_rule__Command__Group_1__2__Impl_in_rule__Command__Group_1__24447);
            rule__Command__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__3_in_rule__Command__Group_1__24450);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2197:1: rule__Command__Group_1__2__Impl : ( ':=' ) ;
    public final void rule__Command__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2201:1: ( ( ':=' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2202:1: ( ':=' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2202:1: ( ':=' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2203:1: ':='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getColonEqualsSignKeyword_1_2()); 
            }
            match(input,27,FOLLOW_27_in_rule__Command__Group_1__2__Impl4478); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2216:1: rule__Command__Group_1__3 : rule__Command__Group_1__3__Impl rule__Command__Group_1__4 ;
    public final void rule__Command__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2220:1: ( rule__Command__Group_1__3__Impl rule__Command__Group_1__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2221:2: rule__Command__Group_1__3__Impl rule__Command__Group_1__4
            {
            pushFollow(FOLLOW_rule__Command__Group_1__3__Impl_in_rule__Command__Group_1__34509);
            rule__Command__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_1__4_in_rule__Command__Group_1__34512);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2228:1: rule__Command__Group_1__3__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Command__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2232:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2233:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2233:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2234:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_3()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2235:1: ( RULE_LC )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_LC) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2235:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_1__3__Impl4540); if (state.failed) return ;

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2245:1: rule__Command__Group_1__4 : rule__Command__Group_1__4__Impl ;
    public final void rule__Command__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2249:1: ( rule__Command__Group_1__4__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2250:2: rule__Command__Group_1__4__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_1__4__Impl_in_rule__Command__Group_1__44571);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2256:1: rule__Command__Group_1__4__Impl : ( ruleExprs ) ;
    public final void rule__Command__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2260:1: ( ( ruleExprs ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2261:1: ( ruleExprs )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2261:1: ( ruleExprs )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2262:1: ruleExprs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExprsParserRuleCall_1_4()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_rule__Command__Group_1__4__Impl4598);
            ruleExprs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExprsParserRuleCall_1_4()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2283:1: rule__Command__Group_2__0 : rule__Command__Group_2__0__Impl rule__Command__Group_2__1 ;
    public final void rule__Command__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2287:1: ( rule__Command__Group_2__0__Impl rule__Command__Group_2__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2288:2: rule__Command__Group_2__0__Impl rule__Command__Group_2__1
            {
            pushFollow(FOLLOW_rule__Command__Group_2__0__Impl_in_rule__Command__Group_2__04637);
            rule__Command__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__1_in_rule__Command__Group_2__04640);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2295:1: rule__Command__Group_2__0__Impl : ( 'while' ) ;
    public final void rule__Command__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2299:1: ( ( 'while' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2300:1: ( 'while' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2300:1: ( 'while' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2301:1: 'while'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getWhileKeyword_2_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Command__Group_2__0__Impl4668); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getWhileKeyword_2_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2314:1: rule__Command__Group_2__1 : rule__Command__Group_2__1__Impl rule__Command__Group_2__2 ;
    public final void rule__Command__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2318:1: ( rule__Command__Group_2__1__Impl rule__Command__Group_2__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2319:2: rule__Command__Group_2__1__Impl rule__Command__Group_2__2
            {
            pushFollow(FOLLOW_rule__Command__Group_2__1__Impl_in_rule__Command__Group_2__14699);
            rule__Command__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__2_in_rule__Command__Group_2__14702);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2326:1: rule__Command__Group_2__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2330:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2331:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2331:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2332:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_2__1__Impl4729); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2343:1: rule__Command__Group_2__2 : rule__Command__Group_2__2__Impl rule__Command__Group_2__3 ;
    public final void rule__Command__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2347:1: ( rule__Command__Group_2__2__Impl rule__Command__Group_2__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2348:2: rule__Command__Group_2__2__Impl rule__Command__Group_2__3
            {
            pushFollow(FOLLOW_rule__Command__Group_2__2__Impl_in_rule__Command__Group_2__24758);
            rule__Command__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__3_in_rule__Command__Group_2__24761);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2355:1: rule__Command__Group_2__2__Impl : ( ruleExpr ) ;
    public final void rule__Command__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2359:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2360:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2360:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2361:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExprParserRuleCall_2_2()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__Group_2__2__Impl4788);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExprParserRuleCall_2_2()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2372:1: rule__Command__Group_2__3 : rule__Command__Group_2__3__Impl rule__Command__Group_2__4 ;
    public final void rule__Command__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2376:1: ( rule__Command__Group_2__3__Impl rule__Command__Group_2__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2377:2: rule__Command__Group_2__3__Impl rule__Command__Group_2__4
            {
            pushFollow(FOLLOW_rule__Command__Group_2__3__Impl_in_rule__Command__Group_2__34817);
            rule__Command__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__4_in_rule__Command__Group_2__34820);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2384:1: rule__Command__Group_2__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2388:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2389:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2389:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2390:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_2__3__Impl4847); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2401:1: rule__Command__Group_2__4 : rule__Command__Group_2__4__Impl rule__Command__Group_2__5 ;
    public final void rule__Command__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2405:1: ( rule__Command__Group_2__4__Impl rule__Command__Group_2__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2406:2: rule__Command__Group_2__4__Impl rule__Command__Group_2__5
            {
            pushFollow(FOLLOW_rule__Command__Group_2__4__Impl_in_rule__Command__Group_2__44876);
            rule__Command__Group_2__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__5_in_rule__Command__Group_2__44879);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2413:1: rule__Command__Group_2__4__Impl : ( 'do' ) ;
    public final void rule__Command__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2417:1: ( ( 'do' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2418:1: ( 'do' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2418:1: ( 'do' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2419:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getDoKeyword_2_4()); 
            }
            match(input,29,FOLLOW_29_in_rule__Command__Group_2__4__Impl4907); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2432:1: rule__Command__Group_2__5 : rule__Command__Group_2__5__Impl rule__Command__Group_2__6 ;
    public final void rule__Command__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2436:1: ( rule__Command__Group_2__5__Impl rule__Command__Group_2__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2437:2: rule__Command__Group_2__5__Impl rule__Command__Group_2__6
            {
            pushFollow(FOLLOW_rule__Command__Group_2__5__Impl_in_rule__Command__Group_2__54938);
            rule__Command__Group_2__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__6_in_rule__Command__Group_2__54941);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2444:1: rule__Command__Group_2__5__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2448:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2449:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2449:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2450:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_5()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_2__5__Impl4968); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2461:1: rule__Command__Group_2__6 : rule__Command__Group_2__6__Impl rule__Command__Group_2__7 ;
    public final void rule__Command__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2465:1: ( rule__Command__Group_2__6__Impl rule__Command__Group_2__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2466:2: rule__Command__Group_2__6__Impl rule__Command__Group_2__7
            {
            pushFollow(FOLLOW_rule__Command__Group_2__6__Impl_in_rule__Command__Group_2__64997);
            rule__Command__Group_2__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__7_in_rule__Command__Group_2__65000);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2473:1: rule__Command__Group_2__6__Impl : ( ruleCommands ) ;
    public final void rule__Command__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2477:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2478:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2478:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2479:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCommandsParserRuleCall_2_6()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__Group_2__6__Impl5027);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getCommandsParserRuleCall_2_6()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2490:1: rule__Command__Group_2__7 : rule__Command__Group_2__7__Impl rule__Command__Group_2__8 ;
    public final void rule__Command__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2494:1: ( rule__Command__Group_2__7__Impl rule__Command__Group_2__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2495:2: rule__Command__Group_2__7__Impl rule__Command__Group_2__8
            {
            pushFollow(FOLLOW_rule__Command__Group_2__7__Impl_in_rule__Command__Group_2__75056);
            rule__Command__Group_2__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_2__8_in_rule__Command__Group_2__75059);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2502:1: rule__Command__Group_2__7__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2506:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2507:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2507:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2508:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_7()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_2__7__Impl5086); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2519:1: rule__Command__Group_2__8 : rule__Command__Group_2__8__Impl ;
    public final void rule__Command__Group_2__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2523:1: ( rule__Command__Group_2__8__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2524:2: rule__Command__Group_2__8__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_2__8__Impl_in_rule__Command__Group_2__85115);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2530:1: rule__Command__Group_2__8__Impl : ( 'od' ) ;
    public final void rule__Command__Group_2__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2534:1: ( ( 'od' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2535:1: ( 'od' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2535:1: ( 'od' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2536:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getOdKeyword_2_8()); 
            }
            match(input,30,FOLLOW_30_in_rule__Command__Group_2__8__Impl5143); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2567:1: rule__Command__Group_3__0 : rule__Command__Group_3__0__Impl rule__Command__Group_3__1 ;
    public final void rule__Command__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2571:1: ( rule__Command__Group_3__0__Impl rule__Command__Group_3__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2572:2: rule__Command__Group_3__0__Impl rule__Command__Group_3__1
            {
            pushFollow(FOLLOW_rule__Command__Group_3__0__Impl_in_rule__Command__Group_3__05192);
            rule__Command__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__1_in_rule__Command__Group_3__05195);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2579:1: rule__Command__Group_3__0__Impl : ( 'for' ) ;
    public final void rule__Command__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2583:1: ( ( 'for' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2584:1: ( 'for' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2584:1: ( 'for' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2585:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getForKeyword_3_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__Command__Group_3__0__Impl5223); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getForKeyword_3_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2598:1: rule__Command__Group_3__1 : rule__Command__Group_3__1__Impl rule__Command__Group_3__2 ;
    public final void rule__Command__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2602:1: ( rule__Command__Group_3__1__Impl rule__Command__Group_3__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2603:2: rule__Command__Group_3__1__Impl rule__Command__Group_3__2
            {
            pushFollow(FOLLOW_rule__Command__Group_3__1__Impl_in_rule__Command__Group_3__15254);
            rule__Command__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__2_in_rule__Command__Group_3__15257);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2610:1: rule__Command__Group_3__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2614:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2615:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2615:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2616:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_3__1__Impl5284); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2627:1: rule__Command__Group_3__2 : rule__Command__Group_3__2__Impl rule__Command__Group_3__3 ;
    public final void rule__Command__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2631:1: ( rule__Command__Group_3__2__Impl rule__Command__Group_3__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2632:2: rule__Command__Group_3__2__Impl rule__Command__Group_3__3
            {
            pushFollow(FOLLOW_rule__Command__Group_3__2__Impl_in_rule__Command__Group_3__25313);
            rule__Command__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__3_in_rule__Command__Group_3__25316);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2639:1: rule__Command__Group_3__2__Impl : ( ruleExpr ) ;
    public final void rule__Command__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2643:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2644:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2644:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2645:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExprParserRuleCall_3_2()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__Group_3__2__Impl5343);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExprParserRuleCall_3_2()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2656:1: rule__Command__Group_3__3 : rule__Command__Group_3__3__Impl rule__Command__Group_3__4 ;
    public final void rule__Command__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2660:1: ( rule__Command__Group_3__3__Impl rule__Command__Group_3__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2661:2: rule__Command__Group_3__3__Impl rule__Command__Group_3__4
            {
            pushFollow(FOLLOW_rule__Command__Group_3__3__Impl_in_rule__Command__Group_3__35372);
            rule__Command__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__4_in_rule__Command__Group_3__35375);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2668:1: rule__Command__Group_3__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2672:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2673:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2673:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2674:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_3__3__Impl5402); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2685:1: rule__Command__Group_3__4 : rule__Command__Group_3__4__Impl rule__Command__Group_3__5 ;
    public final void rule__Command__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2689:1: ( rule__Command__Group_3__4__Impl rule__Command__Group_3__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2690:2: rule__Command__Group_3__4__Impl rule__Command__Group_3__5
            {
            pushFollow(FOLLOW_rule__Command__Group_3__4__Impl_in_rule__Command__Group_3__45431);
            rule__Command__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__5_in_rule__Command__Group_3__45434);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2697:1: rule__Command__Group_3__4__Impl : ( 'do' ) ;
    public final void rule__Command__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2701:1: ( ( 'do' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2702:1: ( 'do' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2702:1: ( 'do' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2703:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getDoKeyword_3_4()); 
            }
            match(input,29,FOLLOW_29_in_rule__Command__Group_3__4__Impl5462); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2716:1: rule__Command__Group_3__5 : rule__Command__Group_3__5__Impl rule__Command__Group_3__6 ;
    public final void rule__Command__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2720:1: ( rule__Command__Group_3__5__Impl rule__Command__Group_3__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2721:2: rule__Command__Group_3__5__Impl rule__Command__Group_3__6
            {
            pushFollow(FOLLOW_rule__Command__Group_3__5__Impl_in_rule__Command__Group_3__55493);
            rule__Command__Group_3__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__6_in_rule__Command__Group_3__55496);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2728:1: rule__Command__Group_3__5__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2732:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2733:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2733:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2734:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_5()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_3__5__Impl5523); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2745:1: rule__Command__Group_3__6 : rule__Command__Group_3__6__Impl rule__Command__Group_3__7 ;
    public final void rule__Command__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2749:1: ( rule__Command__Group_3__6__Impl rule__Command__Group_3__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2750:2: rule__Command__Group_3__6__Impl rule__Command__Group_3__7
            {
            pushFollow(FOLLOW_rule__Command__Group_3__6__Impl_in_rule__Command__Group_3__65552);
            rule__Command__Group_3__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__7_in_rule__Command__Group_3__65555);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2757:1: rule__Command__Group_3__6__Impl : ( ruleCommands ) ;
    public final void rule__Command__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2761:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2762:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2762:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2763:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCommandsParserRuleCall_3_6()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__Group_3__6__Impl5582);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getCommandsParserRuleCall_3_6()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2774:1: rule__Command__Group_3__7 : rule__Command__Group_3__7__Impl rule__Command__Group_3__8 ;
    public final void rule__Command__Group_3__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2778:1: ( rule__Command__Group_3__7__Impl rule__Command__Group_3__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2779:2: rule__Command__Group_3__7__Impl rule__Command__Group_3__8
            {
            pushFollow(FOLLOW_rule__Command__Group_3__7__Impl_in_rule__Command__Group_3__75611);
            rule__Command__Group_3__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_3__8_in_rule__Command__Group_3__75614);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2786:1: rule__Command__Group_3__7__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_3__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2790:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2791:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2791:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2792:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_7()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_3__7__Impl5641); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2803:1: rule__Command__Group_3__8 : rule__Command__Group_3__8__Impl ;
    public final void rule__Command__Group_3__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2807:1: ( rule__Command__Group_3__8__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2808:2: rule__Command__Group_3__8__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_3__8__Impl_in_rule__Command__Group_3__85670);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2814:1: rule__Command__Group_3__8__Impl : ( 'od' ) ;
    public final void rule__Command__Group_3__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2818:1: ( ( 'od' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:1: ( 'od' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:1: ( 'od' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2820:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getOdKeyword_3_8()); 
            }
            match(input,30,FOLLOW_30_in_rule__Command__Group_3__8__Impl5698); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2851:1: rule__Command__Group_4__0 : rule__Command__Group_4__0__Impl rule__Command__Group_4__1 ;
    public final void rule__Command__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2855:1: ( rule__Command__Group_4__0__Impl rule__Command__Group_4__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2856:2: rule__Command__Group_4__0__Impl rule__Command__Group_4__1
            {
            pushFollow(FOLLOW_rule__Command__Group_4__0__Impl_in_rule__Command__Group_4__05747);
            rule__Command__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__1_in_rule__Command__Group_4__05750);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2863:1: rule__Command__Group_4__0__Impl : ( 'foreach' ) ;
    public final void rule__Command__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2867:1: ( ( 'foreach' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2868:1: ( 'foreach' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2868:1: ( 'foreach' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2869:1: 'foreach'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getForeachKeyword_4_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__Command__Group_4__0__Impl5778); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getForeachKeyword_4_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2882:1: rule__Command__Group_4__1 : rule__Command__Group_4__1__Impl rule__Command__Group_4__2 ;
    public final void rule__Command__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2886:1: ( rule__Command__Group_4__1__Impl rule__Command__Group_4__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2887:2: rule__Command__Group_4__1__Impl rule__Command__Group_4__2
            {
            pushFollow(FOLLOW_rule__Command__Group_4__1__Impl_in_rule__Command__Group_4__15809);
            rule__Command__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__2_in_rule__Command__Group_4__15812);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2894:1: rule__Command__Group_4__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2898:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2899:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2899:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2900:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__1__Impl5839); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2911:1: rule__Command__Group_4__2 : rule__Command__Group_4__2__Impl rule__Command__Group_4__3 ;
    public final void rule__Command__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2915:1: ( rule__Command__Group_4__2__Impl rule__Command__Group_4__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2916:2: rule__Command__Group_4__2__Impl rule__Command__Group_4__3
            {
            pushFollow(FOLLOW_rule__Command__Group_4__2__Impl_in_rule__Command__Group_4__25868);
            rule__Command__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__3_in_rule__Command__Group_4__25871);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2923:1: rule__Command__Group_4__2__Impl : ( ruleExpr ) ;
    public final void rule__Command__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2928:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2928:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2929:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExprParserRuleCall_4_2()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__Group_4__2__Impl5898);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExprParserRuleCall_4_2()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2940:1: rule__Command__Group_4__3 : rule__Command__Group_4__3__Impl rule__Command__Group_4__4 ;
    public final void rule__Command__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2944:1: ( rule__Command__Group_4__3__Impl rule__Command__Group_4__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2945:2: rule__Command__Group_4__3__Impl rule__Command__Group_4__4
            {
            pushFollow(FOLLOW_rule__Command__Group_4__3__Impl_in_rule__Command__Group_4__35927);
            rule__Command__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__4_in_rule__Command__Group_4__35930);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2952:1: rule__Command__Group_4__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2956:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2957:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2957:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2958:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__3__Impl5957); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2969:1: rule__Command__Group_4__4 : rule__Command__Group_4__4__Impl rule__Command__Group_4__5 ;
    public final void rule__Command__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2973:1: ( rule__Command__Group_4__4__Impl rule__Command__Group_4__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2974:2: rule__Command__Group_4__4__Impl rule__Command__Group_4__5
            {
            pushFollow(FOLLOW_rule__Command__Group_4__4__Impl_in_rule__Command__Group_4__45986);
            rule__Command__Group_4__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__5_in_rule__Command__Group_4__45989);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2981:1: rule__Command__Group_4__4__Impl : ( 'in' ) ;
    public final void rule__Command__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2985:1: ( ( 'in' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2986:1: ( 'in' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2986:1: ( 'in' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:2987:1: 'in'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getInKeyword_4_4()); 
            }
            match(input,33,FOLLOW_33_in_rule__Command__Group_4__4__Impl6017); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3000:1: rule__Command__Group_4__5 : rule__Command__Group_4__5__Impl rule__Command__Group_4__6 ;
    public final void rule__Command__Group_4__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3004:1: ( rule__Command__Group_4__5__Impl rule__Command__Group_4__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3005:2: rule__Command__Group_4__5__Impl rule__Command__Group_4__6
            {
            pushFollow(FOLLOW_rule__Command__Group_4__5__Impl_in_rule__Command__Group_4__56048);
            rule__Command__Group_4__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__6_in_rule__Command__Group_4__56051);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3012:1: rule__Command__Group_4__5__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3016:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3017:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3017:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3018:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_5()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__5__Impl6078); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3029:1: rule__Command__Group_4__6 : rule__Command__Group_4__6__Impl rule__Command__Group_4__7 ;
    public final void rule__Command__Group_4__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3033:1: ( rule__Command__Group_4__6__Impl rule__Command__Group_4__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3034:2: rule__Command__Group_4__6__Impl rule__Command__Group_4__7
            {
            pushFollow(FOLLOW_rule__Command__Group_4__6__Impl_in_rule__Command__Group_4__66107);
            rule__Command__Group_4__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__7_in_rule__Command__Group_4__66110);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3041:1: rule__Command__Group_4__6__Impl : ( ruleExpr ) ;
    public final void rule__Command__Group_4__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3045:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3046:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3046:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3047:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExprParserRuleCall_4_6()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__Group_4__6__Impl6137);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExprParserRuleCall_4_6()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3058:1: rule__Command__Group_4__7 : rule__Command__Group_4__7__Impl rule__Command__Group_4__8 ;
    public final void rule__Command__Group_4__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3062:1: ( rule__Command__Group_4__7__Impl rule__Command__Group_4__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3063:2: rule__Command__Group_4__7__Impl rule__Command__Group_4__8
            {
            pushFollow(FOLLOW_rule__Command__Group_4__7__Impl_in_rule__Command__Group_4__76166);
            rule__Command__Group_4__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__8_in_rule__Command__Group_4__76169);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3070:1: rule__Command__Group_4__7__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3074:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3075:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3075:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3076:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_7()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__7__Impl6196); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3087:1: rule__Command__Group_4__8 : rule__Command__Group_4__8__Impl rule__Command__Group_4__9 ;
    public final void rule__Command__Group_4__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3091:1: ( rule__Command__Group_4__8__Impl rule__Command__Group_4__9 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3092:2: rule__Command__Group_4__8__Impl rule__Command__Group_4__9
            {
            pushFollow(FOLLOW_rule__Command__Group_4__8__Impl_in_rule__Command__Group_4__86225);
            rule__Command__Group_4__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__9_in_rule__Command__Group_4__86228);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3099:1: rule__Command__Group_4__8__Impl : ( 'do' ) ;
    public final void rule__Command__Group_4__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3103:1: ( ( 'do' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3104:1: ( 'do' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3104:1: ( 'do' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3105:1: 'do'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getDoKeyword_4_8()); 
            }
            match(input,29,FOLLOW_29_in_rule__Command__Group_4__8__Impl6256); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3118:1: rule__Command__Group_4__9 : rule__Command__Group_4__9__Impl rule__Command__Group_4__10 ;
    public final void rule__Command__Group_4__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3122:1: ( rule__Command__Group_4__9__Impl rule__Command__Group_4__10 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3123:2: rule__Command__Group_4__9__Impl rule__Command__Group_4__10
            {
            pushFollow(FOLLOW_rule__Command__Group_4__9__Impl_in_rule__Command__Group_4__96287);
            rule__Command__Group_4__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__10_in_rule__Command__Group_4__96290);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3130:1: rule__Command__Group_4__9__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3134:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3135:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3135:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3136:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_9()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__9__Impl6317); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3147:1: rule__Command__Group_4__10 : rule__Command__Group_4__10__Impl rule__Command__Group_4__11 ;
    public final void rule__Command__Group_4__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3151:1: ( rule__Command__Group_4__10__Impl rule__Command__Group_4__11 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3152:2: rule__Command__Group_4__10__Impl rule__Command__Group_4__11
            {
            pushFollow(FOLLOW_rule__Command__Group_4__10__Impl_in_rule__Command__Group_4__106346);
            rule__Command__Group_4__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__11_in_rule__Command__Group_4__106349);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3159:1: rule__Command__Group_4__10__Impl : ( ruleCommands ) ;
    public final void rule__Command__Group_4__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3163:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3164:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3164:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3165:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCommandsParserRuleCall_4_10()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__Group_4__10__Impl6376);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getCommandsParserRuleCall_4_10()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3176:1: rule__Command__Group_4__11 : rule__Command__Group_4__11__Impl rule__Command__Group_4__12 ;
    public final void rule__Command__Group_4__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3180:1: ( rule__Command__Group_4__11__Impl rule__Command__Group_4__12 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3181:2: rule__Command__Group_4__11__Impl rule__Command__Group_4__12
            {
            pushFollow(FOLLOW_rule__Command__Group_4__11__Impl_in_rule__Command__Group_4__116405);
            rule__Command__Group_4__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_4__12_in_rule__Command__Group_4__116408);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3188:1: rule__Command__Group_4__11__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_4__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3192:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3193:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3193:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3194:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_11()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_4__11__Impl6435); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3205:1: rule__Command__Group_4__12 : rule__Command__Group_4__12__Impl ;
    public final void rule__Command__Group_4__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3209:1: ( rule__Command__Group_4__12__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3210:2: rule__Command__Group_4__12__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_4__12__Impl_in_rule__Command__Group_4__126464);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3216:1: rule__Command__Group_4__12__Impl : ( 'od' ) ;
    public final void rule__Command__Group_4__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3220:1: ( ( 'od' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:1: ( 'od' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:1: ( 'od' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3222:1: 'od'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getOdKeyword_4_12()); 
            }
            match(input,30,FOLLOW_30_in_rule__Command__Group_4__12__Impl6492); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3261:1: rule__Command__Group_5__0 : rule__Command__Group_5__0__Impl rule__Command__Group_5__1 ;
    public final void rule__Command__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3265:1: ( rule__Command__Group_5__0__Impl rule__Command__Group_5__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3266:2: rule__Command__Group_5__0__Impl rule__Command__Group_5__1
            {
            pushFollow(FOLLOW_rule__Command__Group_5__0__Impl_in_rule__Command__Group_5__06549);
            rule__Command__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__1_in_rule__Command__Group_5__06552);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3273:1: rule__Command__Group_5__0__Impl : ( 'if' ) ;
    public final void rule__Command__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3277:1: ( ( 'if' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3278:1: ( 'if' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3278:1: ( 'if' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3279:1: 'if'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getIfKeyword_5_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Command__Group_5__0__Impl6580); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getIfKeyword_5_0()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3292:1: rule__Command__Group_5__1 : rule__Command__Group_5__1__Impl rule__Command__Group_5__2 ;
    public final void rule__Command__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3296:1: ( rule__Command__Group_5__1__Impl rule__Command__Group_5__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3297:2: rule__Command__Group_5__1__Impl rule__Command__Group_5__2
            {
            pushFollow(FOLLOW_rule__Command__Group_5__1__Impl_in_rule__Command__Group_5__16611);
            rule__Command__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__2_in_rule__Command__Group_5__16614);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3304:1: rule__Command__Group_5__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3308:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3309:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3309:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3310:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5__1__Impl6641); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3321:1: rule__Command__Group_5__2 : rule__Command__Group_5__2__Impl rule__Command__Group_5__3 ;
    public final void rule__Command__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3325:1: ( rule__Command__Group_5__2__Impl rule__Command__Group_5__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3326:2: rule__Command__Group_5__2__Impl rule__Command__Group_5__3
            {
            pushFollow(FOLLOW_rule__Command__Group_5__2__Impl_in_rule__Command__Group_5__26670);
            rule__Command__Group_5__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__3_in_rule__Command__Group_5__26673);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3333:1: rule__Command__Group_5__2__Impl : ( ruleExpr ) ;
    public final void rule__Command__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3337:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3338:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3338:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3339:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getExprParserRuleCall_5_2()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Command__Group_5__2__Impl6700);
            ruleExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getExprParserRuleCall_5_2()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3350:1: rule__Command__Group_5__3 : rule__Command__Group_5__3__Impl rule__Command__Group_5__4 ;
    public final void rule__Command__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3354:1: ( rule__Command__Group_5__3__Impl rule__Command__Group_5__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3355:2: rule__Command__Group_5__3__Impl rule__Command__Group_5__4
            {
            pushFollow(FOLLOW_rule__Command__Group_5__3__Impl_in_rule__Command__Group_5__36729);
            rule__Command__Group_5__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__4_in_rule__Command__Group_5__36732);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3362:1: rule__Command__Group_5__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3366:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3367:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3367:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3368:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5__3__Impl6759); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3379:1: rule__Command__Group_5__4 : rule__Command__Group_5__4__Impl rule__Command__Group_5__5 ;
    public final void rule__Command__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3383:1: ( rule__Command__Group_5__4__Impl rule__Command__Group_5__5 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3384:2: rule__Command__Group_5__4__Impl rule__Command__Group_5__5
            {
            pushFollow(FOLLOW_rule__Command__Group_5__4__Impl_in_rule__Command__Group_5__46788);
            rule__Command__Group_5__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__5_in_rule__Command__Group_5__46791);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3391:1: rule__Command__Group_5__4__Impl : ( 'then' ) ;
    public final void rule__Command__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3395:1: ( ( 'then' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3396:1: ( 'then' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3396:1: ( 'then' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3397:1: 'then'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getThenKeyword_5_4()); 
            }
            match(input,35,FOLLOW_35_in_rule__Command__Group_5__4__Impl6819); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3410:1: rule__Command__Group_5__5 : rule__Command__Group_5__5__Impl rule__Command__Group_5__6 ;
    public final void rule__Command__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3414:1: ( rule__Command__Group_5__5__Impl rule__Command__Group_5__6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3415:2: rule__Command__Group_5__5__Impl rule__Command__Group_5__6
            {
            pushFollow(FOLLOW_rule__Command__Group_5__5__Impl_in_rule__Command__Group_5__56850);
            rule__Command__Group_5__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__6_in_rule__Command__Group_5__56853);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3422:1: rule__Command__Group_5__5__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3426:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3427:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3427:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3428:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_5()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5__5__Impl6880); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3439:1: rule__Command__Group_5__6 : rule__Command__Group_5__6__Impl rule__Command__Group_5__7 ;
    public final void rule__Command__Group_5__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3443:1: ( rule__Command__Group_5__6__Impl rule__Command__Group_5__7 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3444:2: rule__Command__Group_5__6__Impl rule__Command__Group_5__7
            {
            pushFollow(FOLLOW_rule__Command__Group_5__6__Impl_in_rule__Command__Group_5__66909);
            rule__Command__Group_5__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__7_in_rule__Command__Group_5__66912);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3451:1: rule__Command__Group_5__6__Impl : ( ( rule__Command__CAssignment_5_6 ) ) ;
    public final void rule__Command__Group_5__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3455:1: ( ( ( rule__Command__CAssignment_5_6 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3456:1: ( ( rule__Command__CAssignment_5_6 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3456:1: ( ( rule__Command__CAssignment_5_6 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3457:1: ( rule__Command__CAssignment_5_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCAssignment_5_6()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3458:1: ( rule__Command__CAssignment_5_6 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3458:2: rule__Command__CAssignment_5_6
            {
            pushFollow(FOLLOW_rule__Command__CAssignment_5_6_in_rule__Command__Group_5__6__Impl6939);
            rule__Command__CAssignment_5_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getCAssignment_5_6()); 
            }

            }


            }

        }
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3468:1: rule__Command__Group_5__7 : rule__Command__Group_5__7__Impl rule__Command__Group_5__8 ;
    public final void rule__Command__Group_5__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3472:1: ( rule__Command__Group_5__7__Impl rule__Command__Group_5__8 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3473:2: rule__Command__Group_5__7__Impl rule__Command__Group_5__8
            {
            pushFollow(FOLLOW_rule__Command__Group_5__7__Impl_in_rule__Command__Group_5__76969);
            rule__Command__Group_5__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__8_in_rule__Command__Group_5__76972);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3480:1: rule__Command__Group_5__7__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3484:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3485:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3485:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3486:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_7()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5__7__Impl6999); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3497:1: rule__Command__Group_5__8 : rule__Command__Group_5__8__Impl rule__Command__Group_5__9 ;
    public final void rule__Command__Group_5__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3501:1: ( rule__Command__Group_5__8__Impl rule__Command__Group_5__9 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3502:2: rule__Command__Group_5__8__Impl rule__Command__Group_5__9
            {
            pushFollow(FOLLOW_rule__Command__Group_5__8__Impl_in_rule__Command__Group_5__87028);
            rule__Command__Group_5__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5__9_in_rule__Command__Group_5__87031);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3509:1: rule__Command__Group_5__8__Impl : ( ( rule__Command__Group_5_8__0 )? ) ;
    public final void rule__Command__Group_5__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3513:1: ( ( ( rule__Command__Group_5_8__0 )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3514:1: ( ( rule__Command__Group_5_8__0 )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3514:1: ( ( rule__Command__Group_5_8__0 )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3515:1: ( rule__Command__Group_5_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getGroup_5_8()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3516:1: ( rule__Command__Group_5_8__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3516:2: rule__Command__Group_5_8__0
                    {
                    pushFollow(FOLLOW_rule__Command__Group_5_8__0_in_rule__Command__Group_5__8__Impl7058);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3526:1: rule__Command__Group_5__9 : rule__Command__Group_5__9__Impl ;
    public final void rule__Command__Group_5__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3530:1: ( rule__Command__Group_5__9__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3531:2: rule__Command__Group_5__9__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_5__9__Impl_in_rule__Command__Group_5__97089);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3537:1: rule__Command__Group_5__9__Impl : ( 'fi' ) ;
    public final void rule__Command__Group_5__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3541:1: ( ( 'fi' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3542:1: ( 'fi' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3542:1: ( 'fi' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3543:1: 'fi'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getFiKeyword_5_9()); 
            }
            match(input,36,FOLLOW_36_in_rule__Command__Group_5__9__Impl7117); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3576:1: rule__Command__Group_5_8__0 : rule__Command__Group_5_8__0__Impl rule__Command__Group_5_8__1 ;
    public final void rule__Command__Group_5_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3580:1: ( rule__Command__Group_5_8__0__Impl rule__Command__Group_5_8__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3581:2: rule__Command__Group_5_8__0__Impl rule__Command__Group_5_8__1
            {
            pushFollow(FOLLOW_rule__Command__Group_5_8__0__Impl_in_rule__Command__Group_5_8__07168);
            rule__Command__Group_5_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5_8__1_in_rule__Command__Group_5_8__07171);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3588:1: rule__Command__Group_5_8__0__Impl : ( 'else' ) ;
    public final void rule__Command__Group_5_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3592:1: ( ( 'else' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3593:1: ( 'else' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3593:1: ( 'else' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3594:1: 'else'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getElseKeyword_5_8_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__Command__Group_5_8__0__Impl7199); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3607:1: rule__Command__Group_5_8__1 : rule__Command__Group_5_8__1__Impl rule__Command__Group_5_8__2 ;
    public final void rule__Command__Group_5_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3611:1: ( rule__Command__Group_5_8__1__Impl rule__Command__Group_5_8__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3612:2: rule__Command__Group_5_8__1__Impl rule__Command__Group_5_8__2
            {
            pushFollow(FOLLOW_rule__Command__Group_5_8__1__Impl_in_rule__Command__Group_5_8__17230);
            rule__Command__Group_5_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5_8__2_in_rule__Command__Group_5_8__17233);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3619:1: rule__Command__Group_5_8__1__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3623:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3624:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3624:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3625:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_8_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5_8__1__Impl7260); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3636:1: rule__Command__Group_5_8__2 : rule__Command__Group_5_8__2__Impl rule__Command__Group_5_8__3 ;
    public final void rule__Command__Group_5_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3640:1: ( rule__Command__Group_5_8__2__Impl rule__Command__Group_5_8__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3641:2: rule__Command__Group_5_8__2__Impl rule__Command__Group_5_8__3
            {
            pushFollow(FOLLOW_rule__Command__Group_5_8__2__Impl_in_rule__Command__Group_5_8__27289);
            rule__Command__Group_5_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Command__Group_5_8__3_in_rule__Command__Group_5_8__27292);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3648:1: rule__Command__Group_5_8__2__Impl : ( ( rule__Command__C2Assignment_5_8_2 ) ) ;
    public final void rule__Command__Group_5_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3652:1: ( ( ( rule__Command__C2Assignment_5_8_2 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3653:1: ( ( rule__Command__C2Assignment_5_8_2 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3653:1: ( ( rule__Command__C2Assignment_5_8_2 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3654:1: ( rule__Command__C2Assignment_5_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC2Assignment_5_8_2()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3655:1: ( rule__Command__C2Assignment_5_8_2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3655:2: rule__Command__C2Assignment_5_8_2
            {
            pushFollow(FOLLOW_rule__Command__C2Assignment_5_8_2_in_rule__Command__Group_5_8__2__Impl7319);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3665:1: rule__Command__Group_5_8__3 : rule__Command__Group_5_8__3__Impl ;
    public final void rule__Command__Group_5_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3669:1: ( rule__Command__Group_5_8__3__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3670:2: rule__Command__Group_5_8__3__Impl
            {
            pushFollow(FOLLOW_rule__Command__Group_5_8__3__Impl_in_rule__Command__Group_5_8__37349);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3676:1: rule__Command__Group_5_8__3__Impl : ( RULE_LC ) ;
    public final void rule__Command__Group_5_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3680:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3681:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3681:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3682:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_8_3()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Command__Group_5_8__3__Impl7376); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3701:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3705:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3706:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__07413);
            rule__And__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group__1_in_rule__And__Group__07416);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3713:1: rule__And__Group__0__Impl : ( ruleOr ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3717:1: ( ( ruleOr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3718:1: ( ruleOr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3718:1: ( ruleOr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3719:1: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getOrParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleOr_in_rule__And__Group__0__Impl7443);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3730:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3734:1: ( rule__And__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3735:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__17472);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3741:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3745:1: ( ( ( rule__And__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3746:1: ( ( rule__And__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3746:1: ( ( rule__And__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3747:1: ( rule__And__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3748:1: ( rule__And__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3748:2: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl7499);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3762:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3766:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3767:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__07534);
            rule__And__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__07537);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3774:1: rule__And__Group_1__0__Impl : ( RULE_LC ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3778:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3779:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3779:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3780:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getLCTerminalRuleCall_1_0()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__And__Group_1__0__Impl7564); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3791:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3795:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3796:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__17593);
            rule__And__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__17596);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3803:1: rule__And__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3807:1: ( ( 'and' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3808:1: ( 'and' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3808:1: ( 'and' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3809:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAndKeyword_1_1()); 
            }
            match(input,38,FOLLOW_38_in_rule__And__Group_1__1__Impl7624); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3822:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl rule__And__Group_1__3 ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3826:1: ( rule__And__Group_1__2__Impl rule__And__Group_1__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3827:2: rule__And__Group_1__2__Impl rule__And__Group_1__3
            {
            pushFollow(FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__27655);
            rule__And__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group_1__3_in_rule__And__Group_1__27658);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3834:1: rule__And__Group_1__2__Impl : ( RULE_LC ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3838:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3839:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3839:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3840:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getLCTerminalRuleCall_1_2()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__And__Group_1__2__Impl7685); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3851:1: rule__And__Group_1__3 : rule__And__Group_1__3__Impl ;
    public final void rule__And__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3855:1: ( rule__And__Group_1__3__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3856:2: rule__And__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__And__Group_1__3__Impl_in_rule__And__Group_1__37714);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3862:1: rule__And__Group_1__3__Impl : ( ruleOr ) ;
    public final void rule__And__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3866:1: ( ( ruleOr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3867:1: ( ruleOr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3867:1: ( ruleOr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3868:1: ruleOr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getOrParserRuleCall_1_3()); 
            }
            pushFollow(FOLLOW_ruleOr_in_rule__And__Group_1__3__Impl7741);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3887:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3891:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3892:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__07778);
            rule__Or__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__07781);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3899:1: rule__Or__Group__0__Impl : ( ruleNot ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3903:1: ( ( ruleNot ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3904:1: ( ruleNot )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3904:1: ( ruleNot )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3905:1: ruleNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getNotParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleNot_in_rule__Or__Group__0__Impl7808);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3916:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3920:1: ( rule__Or__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3921:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__17837);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3927:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3931:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3932:1: ( ( rule__Or__Group_1__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3932:1: ( ( rule__Or__Group_1__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3933:1: ( rule__Or__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3934:1: ( rule__Or__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3934:2: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl7864);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3948:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3952:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3953:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__07899);
            rule__Or__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__07902);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3960:1: rule__Or__Group_1__0__Impl : ( RULE_LC ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3964:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3965:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3965:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3966:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getLCTerminalRuleCall_1_0()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Or__Group_1__0__Impl7929); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3977:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3981:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3982:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__17958);
            rule__Or__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__17961);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3989:1: rule__Or__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3993:1: ( ( 'or' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3994:1: ( 'or' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3994:1: ( 'or' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:3995:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getOrKeyword_1_1()); 
            }
            match(input,39,FOLLOW_39_in_rule__Or__Group_1__1__Impl7989); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4008:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl rule__Or__Group_1__3 ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4012:1: ( rule__Or__Group_1__2__Impl rule__Or__Group_1__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4013:2: rule__Or__Group_1__2__Impl rule__Or__Group_1__3
            {
            pushFollow(FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__28020);
            rule__Or__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group_1__3_in_rule__Or__Group_1__28023);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4020:1: rule__Or__Group_1__2__Impl : ( RULE_LC ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4024:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4025:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4025:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4026:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getLCTerminalRuleCall_1_2()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Or__Group_1__2__Impl8050); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4037:1: rule__Or__Group_1__3 : rule__Or__Group_1__3__Impl ;
    public final void rule__Or__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4041:1: ( rule__Or__Group_1__3__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4042:2: rule__Or__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group_1__3__Impl_in_rule__Or__Group_1__38079);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4048:1: rule__Or__Group_1__3__Impl : ( ruleNot ) ;
    public final void rule__Or__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4052:1: ( ( ruleNot ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4053:1: ( ruleNot )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4053:1: ( ruleNot )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4054:1: ruleNot
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getNotParserRuleCall_1_3()); 
            }
            pushFollow(FOLLOW_ruleNot_in_rule__Or__Group_1__3__Impl8106);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4073:1: rule__Not__Group__0 : rule__Not__Group__0__Impl rule__Not__Group__1 ;
    public final void rule__Not__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4077:1: ( rule__Not__Group__0__Impl rule__Not__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4078:2: rule__Not__Group__0__Impl rule__Not__Group__1
            {
            pushFollow(FOLLOW_rule__Not__Group__0__Impl_in_rule__Not__Group__08143);
            rule__Not__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Not__Group__1_in_rule__Not__Group__08146);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4085:1: rule__Not__Group__0__Impl : ( ( rule__Not__Group_0__0 )* ) ;
    public final void rule__Not__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4089:1: ( ( ( rule__Not__Group_0__0 )* ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4090:1: ( ( rule__Not__Group_0__0 )* )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4090:1: ( ( rule__Not__Group_0__0 )* )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4091:1: ( rule__Not__Group_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getGroup_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4092:1: ( rule__Not__Group_0__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==40) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4092:2: rule__Not__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Not__Group_0__0_in_rule__Not__Group__0__Impl8173);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4102:1: rule__Not__Group__1 : rule__Not__Group__1__Impl ;
    public final void rule__Not__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4106:1: ( rule__Not__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4107:2: rule__Not__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Not__Group__1__Impl_in_rule__Not__Group__18204);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4113:1: rule__Not__Group__1__Impl : ( ruleEq ) ;
    public final void rule__Not__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4117:1: ( ( ruleEq ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4118:1: ( ruleEq )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4118:1: ( ruleEq )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4119:1: ruleEq
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getEqParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleEq_in_rule__Not__Group__1__Impl8231);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4134:1: rule__Not__Group_0__0 : rule__Not__Group_0__0__Impl rule__Not__Group_0__1 ;
    public final void rule__Not__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4138:1: ( rule__Not__Group_0__0__Impl rule__Not__Group_0__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4139:2: rule__Not__Group_0__0__Impl rule__Not__Group_0__1
            {
            pushFollow(FOLLOW_rule__Not__Group_0__0__Impl_in_rule__Not__Group_0__08264);
            rule__Not__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Not__Group_0__1_in_rule__Not__Group_0__08267);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4146:1: rule__Not__Group_0__0__Impl : ( 'not' ) ;
    public final void rule__Not__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4150:1: ( ( 'not' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4151:1: ( 'not' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4151:1: ( 'not' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4152:1: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getNotKeyword_0_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__Not__Group_0__0__Impl8295); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4165:1: rule__Not__Group_0__1 : rule__Not__Group_0__1__Impl ;
    public final void rule__Not__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4169:1: ( rule__Not__Group_0__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4170:2: rule__Not__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Not__Group_0__1__Impl_in_rule__Not__Group_0__18326);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4176:1: rule__Not__Group_0__1__Impl : ( RULE_LC ) ;
    public final void rule__Not__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4180:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4181:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4181:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4182:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNotAccess().getLCTerminalRuleCall_0_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Not__Group_0__1__Impl8353); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4197:1: rule__Eq__Group_0__0 : rule__Eq__Group_0__0__Impl rule__Eq__Group_0__1 ;
    public final void rule__Eq__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4201:1: ( rule__Eq__Group_0__0__Impl rule__Eq__Group_0__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4202:2: rule__Eq__Group_0__0__Impl rule__Eq__Group_0__1
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__0__Impl_in_rule__Eq__Group_0__08386);
            rule__Eq__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_0__1_in_rule__Eq__Group_0__08389);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4209:1: rule__Eq__Group_0__0__Impl : ( ( rule__Eq__Alternatives_0_0 ) ) ;
    public final void rule__Eq__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4213:1: ( ( ( rule__Eq__Alternatives_0_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4214:1: ( ( rule__Eq__Alternatives_0_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4214:1: ( ( rule__Eq__Alternatives_0_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4215:1: ( rule__Eq__Alternatives_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getAlternatives_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4216:1: ( rule__Eq__Alternatives_0_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4216:2: rule__Eq__Alternatives_0_0
            {
            pushFollow(FOLLOW_rule__Eq__Alternatives_0_0_in_rule__Eq__Group_0__0__Impl8416);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4226:1: rule__Eq__Group_0__1 : rule__Eq__Group_0__1__Impl rule__Eq__Group_0__2 ;
    public final void rule__Eq__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4230:1: ( rule__Eq__Group_0__1__Impl rule__Eq__Group_0__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4231:2: rule__Eq__Group_0__1__Impl rule__Eq__Group_0__2
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__1__Impl_in_rule__Eq__Group_0__18446);
            rule__Eq__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_0__2_in_rule__Eq__Group_0__18449);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4238:1: rule__Eq__Group_0__1__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Eq__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4242:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4243:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4243:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4244:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getLCTerminalRuleCall_0_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4245:1: ( RULE_LC )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_LC) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4245:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Eq__Group_0__1__Impl8477); if (state.failed) return ;

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4255:1: rule__Eq__Group_0__2 : rule__Eq__Group_0__2__Impl rule__Eq__Group_0__3 ;
    public final void rule__Eq__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4259:1: ( rule__Eq__Group_0__2__Impl rule__Eq__Group_0__3 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4260:2: rule__Eq__Group_0__2__Impl rule__Eq__Group_0__3
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__2__Impl_in_rule__Eq__Group_0__28508);
            rule__Eq__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_0__3_in_rule__Eq__Group_0__28511);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4267:1: rule__Eq__Group_0__2__Impl : ( '=?' ) ;
    public final void rule__Eq__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4271:1: ( ( '=?' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4272:1: ( '=?' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4272:1: ( '=?' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4273:1: '=?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getEqualsSignQuestionMarkKeyword_0_2()); 
            }
            match(input,41,FOLLOW_41_in_rule__Eq__Group_0__2__Impl8539); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4286:1: rule__Eq__Group_0__3 : rule__Eq__Group_0__3__Impl rule__Eq__Group_0__4 ;
    public final void rule__Eq__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4290:1: ( rule__Eq__Group_0__3__Impl rule__Eq__Group_0__4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4291:2: rule__Eq__Group_0__3__Impl rule__Eq__Group_0__4
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__3__Impl_in_rule__Eq__Group_0__38570);
            rule__Eq__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_0__4_in_rule__Eq__Group_0__38573);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4298:1: rule__Eq__Group_0__3__Impl : ( ( RULE_LC )? ) ;
    public final void rule__Eq__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4302:1: ( ( ( RULE_LC )? ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4303:1: ( ( RULE_LC )? )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4303:1: ( ( RULE_LC )? )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4304:1: ( RULE_LC )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getLCTerminalRuleCall_0_3()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4305:1: ( RULE_LC )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_LC) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4305:3: RULE_LC
                    {
                    match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Eq__Group_0__3__Impl8601); if (state.failed) return ;

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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4315:1: rule__Eq__Group_0__4 : rule__Eq__Group_0__4__Impl ;
    public final void rule__Eq__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4319:1: ( rule__Eq__Group_0__4__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4320:2: rule__Eq__Group_0__4__Impl
            {
            pushFollow(FOLLOW_rule__Eq__Group_0__4__Impl_in_rule__Eq__Group_0__48632);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4326:1: rule__Eq__Group_0__4__Impl : ( ( rule__Eq__Alternatives_0_4 ) ) ;
    public final void rule__Eq__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4330:1: ( ( ( rule__Eq__Alternatives_0_4 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4331:1: ( ( rule__Eq__Alternatives_0_4 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4331:1: ( ( rule__Eq__Alternatives_0_4 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4332:1: ( rule__Eq__Alternatives_0_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getAlternatives_0_4()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4333:1: ( rule__Eq__Alternatives_0_4 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4333:2: rule__Eq__Alternatives_0_4
            {
            pushFollow(FOLLOW_rule__Eq__Alternatives_0_4_in_rule__Eq__Group_0__4__Impl8659);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4353:1: rule__Eq__Group_1__0 : rule__Eq__Group_1__0__Impl rule__Eq__Group_1__1 ;
    public final void rule__Eq__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4357:1: ( rule__Eq__Group_1__0__Impl rule__Eq__Group_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4358:2: rule__Eq__Group_1__0__Impl rule__Eq__Group_1__1
            {
            pushFollow(FOLLOW_rule__Eq__Group_1__0__Impl_in_rule__Eq__Group_1__08699);
            rule__Eq__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_1__1_in_rule__Eq__Group_1__08702);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4365:1: rule__Eq__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Eq__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4369:1: ( ( '(' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4370:1: ( '(' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4370:1: ( '(' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4371:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__Eq__Group_1__0__Impl8730); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4384:1: rule__Eq__Group_1__1 : rule__Eq__Group_1__1__Impl rule__Eq__Group_1__2 ;
    public final void rule__Eq__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4388:1: ( rule__Eq__Group_1__1__Impl rule__Eq__Group_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4389:2: rule__Eq__Group_1__1__Impl rule__Eq__Group_1__2
            {
            pushFollow(FOLLOW_rule__Eq__Group_1__1__Impl_in_rule__Eq__Group_1__18761);
            rule__Eq__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Eq__Group_1__2_in_rule__Eq__Group_1__18764);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4396:1: rule__Eq__Group_1__1__Impl : ( ( rule__Eq__Alternatives_1_1 ) ) ;
    public final void rule__Eq__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4400:1: ( ( ( rule__Eq__Alternatives_1_1 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4401:1: ( ( rule__Eq__Alternatives_1_1 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4401:1: ( ( rule__Eq__Alternatives_1_1 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4402:1: ( rule__Eq__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getAlternatives_1_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4403:1: ( rule__Eq__Alternatives_1_1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4403:2: rule__Eq__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__Eq__Alternatives_1_1_in_rule__Eq__Group_1__1__Impl8791);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4413:1: rule__Eq__Group_1__2 : rule__Eq__Group_1__2__Impl ;
    public final void rule__Eq__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4417:1: ( rule__Eq__Group_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4418:2: rule__Eq__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Eq__Group_1__2__Impl_in_rule__Eq__Group_1__28821);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4424:1: rule__Eq__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Eq__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4428:1: ( ( ')' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4429:1: ( ')' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4429:1: ( ')' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4430:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEqAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,43,FOLLOW_43_in_rule__Eq__Group_1__2__Impl8849); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4449:1: rule__ExprSimple__Group__0 : rule__ExprSimple__Group__0__Impl rule__ExprSimple__Group__1 ;
    public final void rule__ExprSimple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4453:1: ( rule__ExprSimple__Group__0__Impl rule__ExprSimple__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4454:2: rule__ExprSimple__Group__0__Impl rule__ExprSimple__Group__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group__0__Impl_in_rule__ExprSimple__Group__08886);
            rule__ExprSimple__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group__1_in_rule__ExprSimple__Group__08889);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4461:1: rule__ExprSimple__Group__0__Impl : ( '(' ) ;
    public final void rule__ExprSimple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4465:1: ( ( '(' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4466:1: ( '(' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4466:1: ( '(' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4467:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__ExprSimple__Group__0__Impl8917); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4480:1: rule__ExprSimple__Group__1 : rule__ExprSimple__Group__1__Impl rule__ExprSimple__Group__2 ;
    public final void rule__ExprSimple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4484:1: ( rule__ExprSimple__Group__1__Impl rule__ExprSimple__Group__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4485:2: rule__ExprSimple__Group__1__Impl rule__ExprSimple__Group__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group__1__Impl_in_rule__ExprSimple__Group__18948);
            rule__ExprSimple__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group__2_in_rule__ExprSimple__Group__18951);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4492:1: rule__ExprSimple__Group__1__Impl : ( ( rule__ExprSimple__Alternatives_1 ) ) ;
    public final void rule__ExprSimple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4496:1: ( ( ( rule__ExprSimple__Alternatives_1 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4497:1: ( ( rule__ExprSimple__Alternatives_1 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4497:1: ( ( rule__ExprSimple__Alternatives_1 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4498:1: ( rule__ExprSimple__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getAlternatives_1()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4499:1: ( rule__ExprSimple__Alternatives_1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4499:2: rule__ExprSimple__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Alternatives_1_in_rule__ExprSimple__Group__1__Impl8978);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4509:1: rule__ExprSimple__Group__2 : rule__ExprSimple__Group__2__Impl ;
    public final void rule__ExprSimple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4513:1: ( rule__ExprSimple__Group__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4514:2: rule__ExprSimple__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group__2__Impl_in_rule__ExprSimple__Group__29008);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4520:1: rule__ExprSimple__Group__2__Impl : ( ')' ) ;
    public final void rule__ExprSimple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4524:1: ( ( ')' ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4525:1: ( ')' )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4525:1: ( ')' )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4526:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_2()); 
            }
            match(input,43,FOLLOW_43_in_rule__ExprSimple__Group__2__Impl9036); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4545:1: rule__ExprSimple__Group_1_0__0 : rule__ExprSimple__Group_1_0__0__Impl rule__ExprSimple__Group_1_0__1 ;
    public final void rule__ExprSimple__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4549:1: ( rule__ExprSimple__Group_1_0__0__Impl rule__ExprSimple__Group_1_0__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4550:2: rule__ExprSimple__Group_1_0__0__Impl rule__ExprSimple__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_0__0__Impl_in_rule__ExprSimple__Group_1_0__09073);
            rule__ExprSimple__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_0__1_in_rule__ExprSimple__Group_1_0__09076);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4557:1: rule__ExprSimple__Group_1_0__0__Impl : ( ( rule__ExprSimple__Alternatives_1_0_0 ) ) ;
    public final void rule__ExprSimple__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4561:1: ( ( ( rule__ExprSimple__Alternatives_1_0_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4562:1: ( ( rule__ExprSimple__Alternatives_1_0_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4562:1: ( ( rule__ExprSimple__Alternatives_1_0_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4563:1: ( rule__ExprSimple__Alternatives_1_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getAlternatives_1_0_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4564:1: ( rule__ExprSimple__Alternatives_1_0_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4564:2: rule__ExprSimple__Alternatives_1_0_0
            {
            pushFollow(FOLLOW_rule__ExprSimple__Alternatives_1_0_0_in_rule__ExprSimple__Group_1_0__0__Impl9103);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4574:1: rule__ExprSimple__Group_1_0__1 : rule__ExprSimple__Group_1_0__1__Impl ;
    public final void rule__ExprSimple__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4578:1: ( rule__ExprSimple__Group_1_0__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4579:2: rule__ExprSimple__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_0__1__Impl_in_rule__ExprSimple__Group_1_0__19133);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4585:1: rule__ExprSimple__Group_1_0__1__Impl : ( ruleLexpr ) ;
    public final void rule__ExprSimple__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4589:1: ( ( ruleLexpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4590:1: ( ruleLexpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4590:1: ( ruleLexpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4591:1: ruleLexpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLexprParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleLexpr_in_rule__ExprSimple__Group_1_0__1__Impl9160);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4606:1: rule__ExprSimple__Group_1_1__0 : rule__ExprSimple__Group_1_1__0__Impl rule__ExprSimple__Group_1_1__1 ;
    public final void rule__ExprSimple__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4610:1: ( rule__ExprSimple__Group_1_1__0__Impl rule__ExprSimple__Group_1_1__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4611:2: rule__ExprSimple__Group_1_1__0__Impl rule__ExprSimple__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__0__Impl_in_rule__ExprSimple__Group_1_1__09193);
            rule__ExprSimple__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__1_in_rule__ExprSimple__Group_1_1__09196);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4618:1: rule__ExprSimple__Group_1_1__0__Impl : ( ( rule__ExprSimple__Alternatives_1_1_0 ) ) ;
    public final void rule__ExprSimple__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4622:1: ( ( ( rule__ExprSimple__Alternatives_1_1_0 ) ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4623:1: ( ( rule__ExprSimple__Alternatives_1_1_0 ) )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4623:1: ( ( rule__ExprSimple__Alternatives_1_1_0 ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4624:1: ( rule__ExprSimple__Alternatives_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getAlternatives_1_1_0()); 
            }
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4625:1: ( rule__ExprSimple__Alternatives_1_1_0 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4625:2: rule__ExprSimple__Alternatives_1_1_0
            {
            pushFollow(FOLLOW_rule__ExprSimple__Alternatives_1_1_0_in_rule__ExprSimple__Group_1_1__0__Impl9223);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4635:1: rule__ExprSimple__Group_1_1__1 : rule__ExprSimple__Group_1_1__1__Impl rule__ExprSimple__Group_1_1__2 ;
    public final void rule__ExprSimple__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4639:1: ( rule__ExprSimple__Group_1_1__1__Impl rule__ExprSimple__Group_1_1__2 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4640:2: rule__ExprSimple__Group_1_1__1__Impl rule__ExprSimple__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__1__Impl_in_rule__ExprSimple__Group_1_1__19253);
            rule__ExprSimple__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__2_in_rule__ExprSimple__Group_1_1__19256);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4647:1: rule__ExprSimple__Group_1_1__1__Impl : ( RULE_LC ) ;
    public final void rule__ExprSimple__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4651:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4652:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4652:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4653:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getLCTerminalRuleCall_1_1_1()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__ExprSimple__Group_1_1__1__Impl9283); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4664:1: rule__ExprSimple__Group_1_1__2 : rule__ExprSimple__Group_1_1__2__Impl ;
    public final void rule__ExprSimple__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4668:1: ( rule__ExprSimple__Group_1_1__2__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4669:2: rule__ExprSimple__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__ExprSimple__Group_1_1__2__Impl_in_rule__ExprSimple__Group_1_1__29312);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4675:1: rule__ExprSimple__Group_1_1__2__Impl : ( ruleExpr ) ;
    public final void rule__ExprSimple__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4679:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4680:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4680:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4681:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExprSimpleAccess().getExprParserRuleCall_1_1_2()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__ExprSimple__Group_1_1__2__Impl9339);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4698:1: rule__Lexpr__Group__0 : rule__Lexpr__Group__0__Impl rule__Lexpr__Group__1 ;
    public final void rule__Lexpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4702:1: ( rule__Lexpr__Group__0__Impl rule__Lexpr__Group__1 )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4703:2: rule__Lexpr__Group__0__Impl rule__Lexpr__Group__1
            {
            pushFollow(FOLLOW_rule__Lexpr__Group__0__Impl_in_rule__Lexpr__Group__09374);
            rule__Lexpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Lexpr__Group__1_in_rule__Lexpr__Group__09377);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4710:1: rule__Lexpr__Group__0__Impl : ( RULE_LC ) ;
    public final void rule__Lexpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4714:1: ( ( RULE_LC ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4715:1: ( RULE_LC )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4715:1: ( RULE_LC )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4716:1: RULE_LC
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLexprAccess().getLCTerminalRuleCall_0()); 
            }
            match(input,RULE_LC,FOLLOW_RULE_LC_in_rule__Lexpr__Group__0__Impl9404); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4727:1: rule__Lexpr__Group__1 : rule__Lexpr__Group__1__Impl ;
    public final void rule__Lexpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4731:1: ( rule__Lexpr__Group__1__Impl )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4732:2: rule__Lexpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Lexpr__Group__1__Impl_in_rule__Lexpr__Group__19433);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4738:1: rule__Lexpr__Group__1__Impl : ( ruleExpr ) ;
    public final void rule__Lexpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4742:1: ( ( ruleExpr ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4743:1: ( ruleExpr )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4743:1: ( ruleExpr )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4744:1: ruleExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLexprAccess().getExprParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_rule__Lexpr__Group__1__Impl9460);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4760:1: rule__Model__ModelAssignment_0 : ( rulefunction ) ;
    public final void rule__Model__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4764:1: ( ( rulefunction ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4765:1: ( rulefunction )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4765:1: ( rulefunction )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4766:1: rulefunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getModelFunctionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulefunction_in_rule__Model__ModelAssignment_09498);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4775:1: rule__Function__FunNameAssignment_2 : ( RULE_SYMBOLES ) ;
    public final void rule__Function__FunNameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4779:1: ( ( RULE_SYMBOLES ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4780:1: ( RULE_SYMBOLES )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4780:1: ( RULE_SYMBOLES )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4781:1: RULE_SYMBOLES
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getFunNameSYMBOLESTerminalRuleCall_2_0()); 
            }
            match(input,RULE_SYMBOLES,FOLLOW_RULE_SYMBOLES_in_rule__Function__FunNameAssignment_29529); if (state.failed) return ;
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4790:1: rule__Function__DefAssignment_5 : ( ruleDefiniton ) ;
    public final void rule__Function__DefAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4794:1: ( ( ruleDefiniton ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4795:1: ( ruleDefiniton )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4795:1: ( ruleDefiniton )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4796:1: ruleDefiniton
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionAccess().getDefDefinitonParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleDefiniton_in_rule__Function__DefAssignment_59560);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4805:1: rule__Definiton__InputVarsAssignment_2 : ( ruleInput ) ;
    public final void rule__Definiton__InputVarsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4809:1: ( ( ruleInput ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4810:1: ( ruleInput )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4810:1: ( ruleInput )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4811:1: ruleInput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getInputVarsInputParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleInput_in_rule__Definiton__InputVarsAssignment_29591);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4820:1: rule__Definiton__CommandListAssignment_5 : ( ruleCommands ) ;
    public final void rule__Definiton__CommandListAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4824:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4825:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4825:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4826:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getCommandListCommandsParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Definiton__CommandListAssignment_59622);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4835:1: rule__Definiton__OutputVarsAssignment_10 : ( ruleOutput ) ;
    public final void rule__Definiton__OutputVarsAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4839:1: ( ( ruleOutput ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4840:1: ( ruleOutput )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4840:1: ( ruleOutput )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4841:1: ruleOutput
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefinitonAccess().getOutputVarsOutputParserRuleCall_10_0()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_rule__Definiton__OutputVarsAssignment_109653);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4850:1: rule__Commands__CAssignment_0 : ( ruleCommand ) ;
    public final void rule__Commands__CAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4854:1: ( ( ruleCommand ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4855:1: ( ruleCommand )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4855:1: ( ruleCommand )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4856:1: ruleCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_rule__Commands__CAssignment_09684);
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
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4865:1: rule__Commands__CAssignment_1_2 : ( ruleCommand ) ;
    public final void rule__Commands__CAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4869:1: ( ( ruleCommand ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4870:1: ( ruleCommand )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4870:1: ( ruleCommand )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4871:1: ruleCommand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_rule__Commands__CAssignment_1_29715);
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


    // $ANTLR start "rule__Command__CAssignment_5_6"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4880:1: rule__Command__CAssignment_5_6 : ( ruleCommands ) ;
    public final void rule__Command__CAssignment_5_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4884:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4885:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4885:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4886:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getCCommandsParserRuleCall_5_6_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__CAssignment_5_69746);
            ruleCommands();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommandAccess().getCCommandsParserRuleCall_5_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Command__CAssignment_5_6"


    // $ANTLR start "rule__Command__C2Assignment_5_8_2"
    // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4895:1: rule__Command__C2Assignment_5_8_2 : ( ruleCommands ) ;
    public final void rule__Command__C2Assignment_5_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4899:1: ( ( ruleCommands ) )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4900:1: ( ruleCommands )
            {
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4900:1: ( ruleCommands )
            // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:4901:1: ruleCommands
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getC2CommandsParserRuleCall_5_8_2_0()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_rule__Command__C2Assignment_5_8_29777);
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
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:599:1: ( ( ruleExprSimple ) )
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:599:1: ( ruleExprSimple )
        {
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:599:1: ( ruleExprSimple )
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:600:1: ruleExprSimple
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprAccess().getExprSimpleParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_ruleExprSimple_in_synpred8_InternalMyDsl1248);
        ruleExprSimple();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalMyDsl

    // $ANTLR start synpred9_InternalMyDsl
    public final void synpred9_InternalMyDsl_fragment() throws RecognitionException {   
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:605:6: ( ( ruleAnd ) )
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:605:6: ( ruleAnd )
        {
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:605:6: ( ruleAnd )
        // ../org.xtext.tl.mydsl.ui/src-gen/org/xtext/tl/mydsl/ui/contentassist/antlr/internal/InternalMyDsl.g:606:1: ruleAnd
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExprAccess().getAndParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_ruleAnd_in_synpred9_InternalMyDsl1265);
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
        "\3\uffff\3\16\33\uffff";
    static final String DFA4_minS =
        "\2\4\1\uffff\3\6\4\0\7\uffff\1\0\2\uffff\1\0\10\uffff\1\0\3\uffff";
    static final String DFA4_maxS =
        "\2\52\1\uffff\3\53\4\0\7\uffff\1\0\2\uffff\1\0\10\uffff\1\0\3\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\13\uffff\1\3\21\uffff\1\1";
    static final String DFA4_specialS =
        "\6\uffff\1\0\1\1\1\2\1\3\7\uffff\1\4\2\uffff\1\5\10\uffff\1\6\3"+
        "\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\4\1\5\11\uffff\1\3\30\uffff\1\2\1\uffff\1\1",
            "\2\2\11\uffff\1\2\1\6\1\7\1\10\1\11\26\uffff\1\2",
            "",
            "\1\21\22\uffff\2\16\16\uffff\1\2\1\uffff\1\16",
            "\1\24\22\uffff\2\16\16\uffff\1\2\1\uffff\1\16",
            "\1\35\22\uffff\2\16\16\uffff\1\2\1\uffff\1\16",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            return "594:1: rule__Expr__Alternatives : ( ( ruleExprSimple ) | ( ruleAnd ) | ( ruleExprTerm ) );";
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
        "\2\4\13\uffff";
    static final String DFA5_maxS =
        "\2\52\13\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\1\2\uffff\1\2\7\uffff";
    static final String DFA5_specialS =
        "\15\uffff}>";
    static final String[] DFA5_transitionS = {
            "\2\2\11\uffff\1\2\32\uffff\1\1",
            "\2\5\11\uffff\1\5\4\2\26\uffff\1\5",
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
            return "622:1: rule__Eq__Alternatives : ( ( ( rule__Eq__Group_0__0 ) ) | ( ( rule__Eq__Group_1__0 ) ) );";
        }
    }
    static final String DFA25_eotS =
        "\24\uffff";
    static final String DFA25_eofS =
        "\1\1\3\uffff\1\1\17\uffff";
    static final String DFA25_minS =
        "\1\6\3\uffff\1\4\17\uffff";
    static final String DFA25_maxS =
        "\1\53\3\uffff\1\52\17\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\2\13\uffff\1\1\6\uffff";
    static final String DFA25_specialS =
        "\24\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\4\22\uffff\2\1\20\uffff\1\1",
            "",
            "",
            "",
            "\2\1\11\uffff\1\1\7\uffff\1\1\5\uffff\2\1\2\uffff\1\1\1\uffff"+
            "\3\1\1\15\1\uffff\1\1\1\uffff\1\1",
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
            return "()* loopback of 3748:1: ( rule__And__Group_1__0 )*";
        }
    }
    static final String DFA26_eotS =
        "\25\uffff";
    static final String DFA26_eofS =
        "\1\1\1\uffff\1\1\22\uffff";
    static final String DFA26_minS =
        "\1\6\1\uffff\1\4\22\uffff";
    static final String DFA26_maxS =
        "\1\53\1\uffff\1\52\22\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\2\15\uffff\1\1\5\uffff";
    static final String DFA26_specialS =
        "\25\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\2\22\uffff\2\1\20\uffff\1\1",
            "",
            "\2\1\11\uffff\1\1\7\uffff\1\1\5\uffff\2\1\2\uffff\1\1\1\uffff"+
            "\4\1\1\17\1\1\1\uffff\1\1",
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
            return "()* loopback of 3934:1: ( rule__Or__Group_1__0 )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel76 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel109 = new BitSet(new long[]{0x0000000000100002L});
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
    public static final BitSet FOLLOW_14_in_rule__Command__Alternatives1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__0_in_rule__Command__Alternatives1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__0_in_rule__Command__Alternatives1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__0_in_rule__Command__Alternatives1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__0_in_rule__Command__Alternatives1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__0_in_rule__Command__Alternatives1215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Expr__Alternatives1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Expr__Alternatives1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_rule__Expr__Alternatives1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__0_in_rule__Eq__Alternatives1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__0_in_rule__Eq__Alternatives1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Eq__Alternatives_0_01365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_rule__Eq__Alternatives_0_01382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Eq__Alternatives_0_41414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_rule__Eq__Alternatives_0_41431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_rule__Eq__Alternatives_1_11463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_rule__Eq__Alternatives_1_11480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ExprTerm__Alternatives1513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__ExprTerm__Alternatives1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOLES_in_rule__ExprTerm__Alternatives1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_0__0_in_rule__ExprSimple__Alternatives_11581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__0_in_rule__ExprSimple__Alternatives_11599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ExprSimple__Alternatives_1_0_01633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ExprSimple__Alternatives_1_0_01653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ExprSimple__Alternatives_1_1_01688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ExprSimple__Alternatives_1_1_01708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__01740 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__01743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ModelAssignment_0_in_rule__Model__Group__0__Impl1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__11800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Model__Group__1__Impl1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__0__Impl_in_rule__Function__Group__01863 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Function__Group__1_in_rule__Function__Group__01866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Function__Group__0__Impl1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__1__Impl_in_rule__Function__Group__11925 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Function__Group__2_in_rule__Function__Group__11928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Function__Group__1__Impl1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__2__Impl_in_rule__Function__Group__21984 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Function__Group__3_in_rule__Function__Group__21987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__FunNameAssignment_2_in_rule__Function__Group__2__Impl2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__3__Impl_in_rule__Function__Group__32044 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Function__Group__4_in_rule__Function__Group__32047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Function__Group__3__Impl2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__4__Impl_in_rule__Function__Group__42106 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Function__Group__5_in_rule__Function__Group__42109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Function__Group__4__Impl2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__Group__5__Impl_in_rule__Function__Group__52165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Function__DefAssignment_5_in_rule__Function__Group__5__Impl2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__0__Impl_in_rule__Definiton__Group__02234 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Definiton__Group__1_in_rule__Definiton__Group__02237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Definiton__Group__0__Impl2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__1__Impl_in_rule__Definiton__Group__12296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definiton__Group__2_in_rule__Definiton__Group__12299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Definiton__Group__1__Impl2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__2__Impl_in_rule__Definiton__Group__22355 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Definiton__Group__3_in_rule__Definiton__Group__22358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__InputVarsAssignment_2_in_rule__Definiton__Group__2__Impl2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__3__Impl_in_rule__Definiton__Group__32415 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Definiton__Group__4_in_rule__Definiton__Group__32418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Definiton__Group__3__Impl2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__4__Impl_in_rule__Definiton__Group__42474 = new BitSet(new long[]{0x0000000590004010L});
    public static final BitSet FOLLOW_rule__Definiton__Group__5_in_rule__Definiton__Group__42477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Definiton__Group__4__Impl2505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__5__Impl_in_rule__Definiton__Group__52536 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Definiton__Group__6_in_rule__Definiton__Group__52539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__CommandListAssignment_5_in_rule__Definiton__Group__5__Impl2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__6__Impl_in_rule__Definiton__Group__62596 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Definiton__Group__7_in_rule__Definiton__Group__62599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Definiton__Group__6__Impl2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__7__Impl_in_rule__Definiton__Group__72655 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Definiton__Group__8_in_rule__Definiton__Group__72658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Definiton__Group__7__Impl2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__8__Impl_in_rule__Definiton__Group__82717 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Definiton__Group__9_in_rule__Definiton__Group__82720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Definiton__Group__8__Impl2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__9__Impl_in_rule__Definiton__Group__92779 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Definiton__Group__10_in_rule__Definiton__Group__92782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Definiton__Group__9__Impl2809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__Group__10__Impl_in_rule__Definiton__Group__102838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definiton__OutputVarsAssignment_10_in_rule__Definiton__Group__10__Impl2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__0__Impl_in_rule__Input__Group__02917 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Input__Group__1_in_rule__Input__Group__02920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Input__Group__0__Impl2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group__1__Impl_in_rule__Input__Group__12976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__0_in_rule__Input__Group__1__Impl3003 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__0__Impl_in_rule__Input__Group_1__03038 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Input__Group_1__1_in_rule__Input__Group_1__03041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Input__Group_1__0__Impl3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__1__Impl_in_rule__Input__Group_1__13100 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Input__Group_1__2_in_rule__Input__Group_1__13103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Input__Group_1__1__Impl3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Input__Group_1__2__Impl_in_rule__Input__Group_1__23162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Input__Group_1__2__Impl3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__0__Impl_in_rule__Output__Group__03224 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Output__Group__1_in_rule__Output__Group__03227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Output__Group__0__Impl3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group__1__Impl_in_rule__Output__Group__13283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__0_in_rule__Output__Group__1__Impl3310 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__0__Impl_in_rule__Output__Group_1__03345 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Output__Group_1__1_in_rule__Output__Group_1__03348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Output__Group_1__0__Impl3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__1__Impl_in_rule__Output__Group_1__13407 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_rule__Output__Group_1__2_in_rule__Output__Group_1__13410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Output__Group_1__1__Impl3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Output__Group_1__2__Impl_in_rule__Output__Group_1__23469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Output__Group_1__2__Impl3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group__0__Impl_in_rule__Commands__Group__03531 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Commands__Group__1_in_rule__Commands__Group__03534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__CAssignment_0_in_rule__Commands__Group__0__Impl3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group__1__Impl_in_rule__Commands__Group__13591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__0_in_rule__Commands__Group__1__Impl3618 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__0__Impl_in_rule__Commands__Group_1__03653 = new BitSet(new long[]{0x0000000590004050L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__1_in_rule__Commands__Group_1__03656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Commands__Group_1__0__Impl3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__1__Impl_in_rule__Commands__Group_1__13715 = new BitSet(new long[]{0x0000000590004050L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__2_in_rule__Commands__Group_1__13718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Commands__Group_1__1__Impl3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__Group_1__2__Impl_in_rule__Commands__Group_1__23777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Commands__CAssignment_1_2_in_rule__Commands__Group_1__2__Impl3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__0__Impl_in_rule__Vars__Group__03840 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Vars__Group__1_in_rule__Vars__Group__03843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_rule__Vars__Group__0__Impl3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group__1__Impl_in_rule__Vars__Group__13899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__0_in_rule__Vars__Group__1__Impl3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__0__Impl_in_rule__Vars__Group_1__03961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__1_in_rule__Vars__Group_1__03964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Vars__Group_1__0__Impl3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Vars__Group_1__1__Impl_in_rule__Vars__Group_1__14023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_rule__Vars__Group_1__1__Impl4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__0__Impl_in_rule__Exprs__Group__04083 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1_in_rule__Exprs__Group__04086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Exprs__Group__0__Impl4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group__1__Impl_in_rule__Exprs__Group__14142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__0_in_rule__Exprs__Group__1__Impl4169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__0__Impl_in_rule__Exprs__Group_1__04204 = new BitSet(new long[]{0x0000050000008030L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__1_in_rule__Exprs__Group_1__04207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Exprs__Group_1__0__Impl4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exprs__Group_1__1__Impl_in_rule__Exprs__Group_1__14266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_rule__Exprs__Group_1__1__Impl4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__0__Impl_in_rule__Command__Group_1__04326 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_rule__Command__Group_1__1_in_rule__Command__Group_1__04329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_rule__Command__Group_1__0__Impl4356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__1__Impl_in_rule__Command__Group_1__14385 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_rule__Command__Group_1__2_in_rule__Command__Group_1__14388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_1__1__Impl4416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__2__Impl_in_rule__Command__Group_1__24447 = new BitSet(new long[]{0x0000050000008070L});
    public static final BitSet FOLLOW_rule__Command__Group_1__3_in_rule__Command__Group_1__24450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Command__Group_1__2__Impl4478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__3__Impl_in_rule__Command__Group_1__34509 = new BitSet(new long[]{0x0000050000008070L});
    public static final BitSet FOLLOW_rule__Command__Group_1__4_in_rule__Command__Group_1__34512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_1__3__Impl4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_1__4__Impl_in_rule__Command__Group_1__44571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_rule__Command__Group_1__4__Impl4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__0__Impl_in_rule__Command__Group_2__04637 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_2__1_in_rule__Command__Group_2__04640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Command__Group_2__0__Impl4668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__1__Impl_in_rule__Command__Group_2__14699 = new BitSet(new long[]{0x0000050000008030L});
    public static final BitSet FOLLOW_rule__Command__Group_2__2_in_rule__Command__Group_2__14702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_2__1__Impl4729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__2__Impl_in_rule__Command__Group_2__24758 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_2__3_in_rule__Command__Group_2__24761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__Group_2__2__Impl4788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__3__Impl_in_rule__Command__Group_2__34817 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Command__Group_2__4_in_rule__Command__Group_2__34820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_2__3__Impl4847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__4__Impl_in_rule__Command__Group_2__44876 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_2__5_in_rule__Command__Group_2__44879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Command__Group_2__4__Impl4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__5__Impl_in_rule__Command__Group_2__54938 = new BitSet(new long[]{0x0000000590004010L});
    public static final BitSet FOLLOW_rule__Command__Group_2__6_in_rule__Command__Group_2__54941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_2__5__Impl4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__6__Impl_in_rule__Command__Group_2__64997 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_2__7_in_rule__Command__Group_2__65000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__Group_2__6__Impl5027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__7__Impl_in_rule__Command__Group_2__75056 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Command__Group_2__8_in_rule__Command__Group_2__75059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_2__7__Impl5086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_2__8__Impl_in_rule__Command__Group_2__85115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Command__Group_2__8__Impl5143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__0__Impl_in_rule__Command__Group_3__05192 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_3__1_in_rule__Command__Group_3__05195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Command__Group_3__0__Impl5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__1__Impl_in_rule__Command__Group_3__15254 = new BitSet(new long[]{0x0000050000008030L});
    public static final BitSet FOLLOW_rule__Command__Group_3__2_in_rule__Command__Group_3__15257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_3__1__Impl5284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__2__Impl_in_rule__Command__Group_3__25313 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_3__3_in_rule__Command__Group_3__25316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__Group_3__2__Impl5343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__3__Impl_in_rule__Command__Group_3__35372 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Command__Group_3__4_in_rule__Command__Group_3__35375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_3__3__Impl5402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__4__Impl_in_rule__Command__Group_3__45431 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_3__5_in_rule__Command__Group_3__45434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Command__Group_3__4__Impl5462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__5__Impl_in_rule__Command__Group_3__55493 = new BitSet(new long[]{0x0000000590004010L});
    public static final BitSet FOLLOW_rule__Command__Group_3__6_in_rule__Command__Group_3__55496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_3__5__Impl5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__6__Impl_in_rule__Command__Group_3__65552 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_3__7_in_rule__Command__Group_3__65555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__Group_3__6__Impl5582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__7__Impl_in_rule__Command__Group_3__75611 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Command__Group_3__8_in_rule__Command__Group_3__75614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_3__7__Impl5641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_3__8__Impl_in_rule__Command__Group_3__85670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Command__Group_3__8__Impl5698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__0__Impl_in_rule__Command__Group_4__05747 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_4__1_in_rule__Command__Group_4__05750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Command__Group_4__0__Impl5778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__1__Impl_in_rule__Command__Group_4__15809 = new BitSet(new long[]{0x0000050000008030L});
    public static final BitSet FOLLOW_rule__Command__Group_4__2_in_rule__Command__Group_4__15812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__1__Impl5839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__2__Impl_in_rule__Command__Group_4__25868 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_4__3_in_rule__Command__Group_4__25871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__Group_4__2__Impl5898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__3__Impl_in_rule__Command__Group_4__35927 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Command__Group_4__4_in_rule__Command__Group_4__35930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__3__Impl5957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__4__Impl_in_rule__Command__Group_4__45986 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_4__5_in_rule__Command__Group_4__45989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Command__Group_4__4__Impl6017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__5__Impl_in_rule__Command__Group_4__56048 = new BitSet(new long[]{0x0000050000008030L});
    public static final BitSet FOLLOW_rule__Command__Group_4__6_in_rule__Command__Group_4__56051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__5__Impl6078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__6__Impl_in_rule__Command__Group_4__66107 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_4__7_in_rule__Command__Group_4__66110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__Group_4__6__Impl6137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__7__Impl_in_rule__Command__Group_4__76166 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Command__Group_4__8_in_rule__Command__Group_4__76169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__7__Impl6196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__8__Impl_in_rule__Command__Group_4__86225 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_4__9_in_rule__Command__Group_4__86228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Command__Group_4__8__Impl6256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__9__Impl_in_rule__Command__Group_4__96287 = new BitSet(new long[]{0x0000000590004010L});
    public static final BitSet FOLLOW_rule__Command__Group_4__10_in_rule__Command__Group_4__96290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__9__Impl6317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__10__Impl_in_rule__Command__Group_4__106346 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_4__11_in_rule__Command__Group_4__106349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__Group_4__10__Impl6376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__11__Impl_in_rule__Command__Group_4__116405 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Command__Group_4__12_in_rule__Command__Group_4__116408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_4__11__Impl6435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_4__12__Impl_in_rule__Command__Group_4__126464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Command__Group_4__12__Impl6492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__0__Impl_in_rule__Command__Group_5__06549 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_5__1_in_rule__Command__Group_5__06552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Command__Group_5__0__Impl6580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__1__Impl_in_rule__Command__Group_5__16611 = new BitSet(new long[]{0x0000050000008030L});
    public static final BitSet FOLLOW_rule__Command__Group_5__2_in_rule__Command__Group_5__16614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5__1__Impl6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__2__Impl_in_rule__Command__Group_5__26670 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_5__3_in_rule__Command__Group_5__26673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Command__Group_5__2__Impl6700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__3__Impl_in_rule__Command__Group_5__36729 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Command__Group_5__4_in_rule__Command__Group_5__36732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5__3__Impl6759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__4__Impl_in_rule__Command__Group_5__46788 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_5__5_in_rule__Command__Group_5__46791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Command__Group_5__4__Impl6819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__5__Impl_in_rule__Command__Group_5__56850 = new BitSet(new long[]{0x0000000590004010L});
    public static final BitSet FOLLOW_rule__Command__Group_5__6_in_rule__Command__Group_5__56853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5__5__Impl6880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__6__Impl_in_rule__Command__Group_5__66909 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_5__7_in_rule__Command__Group_5__66912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__CAssignment_5_6_in_rule__Command__Group_5__6__Impl6939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__7__Impl_in_rule__Command__Group_5__76969 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_rule__Command__Group_5__8_in_rule__Command__Group_5__76972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5__7__Impl6999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__8__Impl_in_rule__Command__Group_5__87028 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_rule__Command__Group_5__9_in_rule__Command__Group_5__87031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__0_in_rule__Command__Group_5__8__Impl7058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5__9__Impl_in_rule__Command__Group_5__97089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Command__Group_5__9__Impl7117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__0__Impl_in_rule__Command__Group_5_8__07168 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__1_in_rule__Command__Group_5_8__07171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Command__Group_5_8__0__Impl7199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__1__Impl_in_rule__Command__Group_5_8__17230 = new BitSet(new long[]{0x0000000590004010L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__2_in_rule__Command__Group_5_8__17233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5_8__1__Impl7260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__2__Impl_in_rule__Command__Group_5_8__27289 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__3_in_rule__Command__Group_5_8__27292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__C2Assignment_5_8_2_in_rule__Command__Group_5_8__2__Impl7319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Command__Group_5_8__3__Impl_in_rule__Command__Group_5_8__37349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Command__Group_5_8__3__Impl7376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__07413 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__07416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rule__And__Group__0__Impl7443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__17472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__0_in_rule__And__Group__1__Impl7499 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__And__Group_1__0__Impl_in_rule__And__Group_1__07534 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__And__Group_1__1_in_rule__And__Group_1__07537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__And__Group_1__0__Impl7564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__1__Impl_in_rule__And__Group_1__17593 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__And__Group_1__2_in_rule__And__Group_1__17596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__And__Group_1__1__Impl7624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__2__Impl_in_rule__And__Group_1__27655 = new BitSet(new long[]{0x0000050000008030L});
    public static final BitSet FOLLOW_rule__And__Group_1__3_in_rule__And__Group_1__27658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__And__Group_1__2__Impl7685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group_1__3__Impl_in_rule__And__Group_1__37714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rule__And__Group_1__3__Impl7741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__07778 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__07781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_rule__Or__Group__0__Impl7808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__17837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0_in_rule__Or__Group__1__Impl7864 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Or__Group_1__0__Impl_in_rule__Or__Group_1__07899 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1_in_rule__Or__Group_1__07902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Or__Group_1__0__Impl7929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__1__Impl_in_rule__Or__Group_1__17958 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2_in_rule__Or__Group_1__17961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Or__Group_1__1__Impl7989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__2__Impl_in_rule__Or__Group_1__28020 = new BitSet(new long[]{0x0000050000008030L});
    public static final BitSet FOLLOW_rule__Or__Group_1__3_in_rule__Or__Group_1__28023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Or__Group_1__2__Impl8050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group_1__3__Impl_in_rule__Or__Group_1__38079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_rule__Or__Group_1__3__Impl8106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__Group__0__Impl_in_rule__Not__Group__08143 = new BitSet(new long[]{0x0000050000008030L});
    public static final BitSet FOLLOW_rule__Not__Group__1_in_rule__Not__Group__08146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__Group_0__0_in_rule__Not__Group__0__Impl8173 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Not__Group__1__Impl_in_rule__Not__Group__18204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEq_in_rule__Not__Group__1__Impl8231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__Group_0__0__Impl_in_rule__Not__Group_0__08264 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Not__Group_0__1_in_rule__Not__Group_0__08267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Not__Group_0__0__Impl8295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Not__Group_0__1__Impl_in_rule__Not__Group_0__18326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Not__Group_0__1__Impl8353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__0__Impl_in_rule__Eq__Group_0__08386 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__1_in_rule__Eq__Group_0__08389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Alternatives_0_0_in_rule__Eq__Group_0__0__Impl8416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__1__Impl_in_rule__Eq__Group_0__18446 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__2_in_rule__Eq__Group_0__18449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Eq__Group_0__1__Impl8477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__2__Impl_in_rule__Eq__Group_0__28508 = new BitSet(new long[]{0x0000040000008070L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__3_in_rule__Eq__Group_0__28511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Eq__Group_0__2__Impl8539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__3__Impl_in_rule__Eq__Group_0__38570 = new BitSet(new long[]{0x0000040000008070L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__4_in_rule__Eq__Group_0__38573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Eq__Group_0__3__Impl8601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_0__4__Impl_in_rule__Eq__Group_0__48632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Alternatives_0_4_in_rule__Eq__Group_0__4__Impl8659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__0__Impl_in_rule__Eq__Group_1__08699 = new BitSet(new long[]{0x0000040000008030L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__1_in_rule__Eq__Group_1__08702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Eq__Group_1__0__Impl8730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__1__Impl_in_rule__Eq__Group_1__18761 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__2_in_rule__Eq__Group_1__18764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Alternatives_1_1_in_rule__Eq__Group_1__1__Impl8791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Eq__Group_1__2__Impl_in_rule__Eq__Group_1__28821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Eq__Group_1__2__Impl8849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__0__Impl_in_rule__ExprSimple__Group__08886 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__1_in_rule__ExprSimple__Group__08889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ExprSimple__Group__0__Impl8917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__1__Impl_in_rule__ExprSimple__Group__18948 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__2_in_rule__ExprSimple__Group__18951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Alternatives_1_in_rule__ExprSimple__Group__1__Impl8978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group__2__Impl_in_rule__ExprSimple__Group__29008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ExprSimple__Group__2__Impl9036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_0__0__Impl_in_rule__ExprSimple__Group_1_0__09073 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_0__1_in_rule__ExprSimple__Group_1_0__09076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Alternatives_1_0_0_in_rule__ExprSimple__Group_1_0__0__Impl9103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_0__1__Impl_in_rule__ExprSimple__Group_1_0__19133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLexpr_in_rule__ExprSimple__Group_1_0__1__Impl9160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__0__Impl_in_rule__ExprSimple__Group_1_1__09193 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__1_in_rule__ExprSimple__Group_1_1__09196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Alternatives_1_1_0_in_rule__ExprSimple__Group_1_1__0__Impl9223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__1__Impl_in_rule__ExprSimple__Group_1_1__19253 = new BitSet(new long[]{0x0000050000008030L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__2_in_rule__ExprSimple__Group_1_1__19256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__ExprSimple__Group_1_1__1__Impl9283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExprSimple__Group_1_1__2__Impl_in_rule__ExprSimple__Group_1_1__29312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__ExprSimple__Group_1_1__2__Impl9339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lexpr__Group__0__Impl_in_rule__Lexpr__Group__09374 = new BitSet(new long[]{0x0000050000008030L});
    public static final BitSet FOLLOW_rule__Lexpr__Group__1_in_rule__Lexpr__Group__09377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_rule__Lexpr__Group__0__Impl9404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Lexpr__Group__1__Impl_in_rule__Lexpr__Group__19433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_rule__Lexpr__Group__1__Impl9460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_rule__Model__ModelAssignment_09498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOLES_in_rule__Function__FunNameAssignment_29529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefiniton_in_rule__Function__DefAssignment_59560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_rule__Definiton__InputVarsAssignment_29591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Definiton__CommandListAssignment_59622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOutput_in_rule__Definiton__OutputVarsAssignment_109653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Commands__CAssignment_09684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__Commands__CAssignment_1_29715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__CAssignment_5_69746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommands_in_rule__Command__C2Assignment_5_8_29777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_synpred8_InternalMyDsl1248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_synpred9_InternalMyDsl1265 = new BitSet(new long[]{0x0000000000000002L});

}