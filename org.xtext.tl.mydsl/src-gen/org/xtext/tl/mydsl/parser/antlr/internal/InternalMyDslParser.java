package org.xtext.tl.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.tl.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LC", "RULE_SYMBOLES", "RULE_VARIABLE", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'function'", "':'", "'read'", "'%'", "'write'", "','", "';'", "'nop'", "':='", "'while'", "'do'", "'od'", "'for'", "'foreach'", "'in'", "'if'", "'then'", "'else'", "'fi'", "'and'", "'or'", "'not'", "'=?'", "'('", "')'", "'nil'", "'cons'", "'list'", "'hd'", "'tl'"
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
    public String getGrammarFileName() { return "../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:75:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:76:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:77:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel90);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel100); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:84:1: ruleModel returns [EObject current=null] : ( ( (lv_model_0_0= rulefunction ) ) (this_LC_1= RULE_LC )? )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token this_LC_1=null;
        EObject lv_model_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:87:28: ( ( ( (lv_model_0_0= rulefunction ) ) (this_LC_1= RULE_LC )? )* )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:88:1: ( ( (lv_model_0_0= rulefunction ) ) (this_LC_1= RULE_LC )? )*
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:88:1: ( ( (lv_model_0_0= rulefunction ) ) (this_LC_1= RULE_LC )? )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:88:2: ( (lv_model_0_0= rulefunction ) ) (this_LC_1= RULE_LC )?
            	    {
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:88:2: ( (lv_model_0_0= rulefunction ) )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:89:1: (lv_model_0_0= rulefunction )
            	    {
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:89:1: (lv_model_0_0= rulefunction )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:90:3: lv_model_0_0= rulefunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getModelFunctionParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulefunction_in_ruleModel146);
            	    lv_model_0_0=rulefunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"model",
            	              		lv_model_0_0, 
            	              		"function");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:106:2: (this_LC_1= RULE_LC )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==RULE_LC) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:106:3: this_LC_1= RULE_LC
            	            {
            	            this_LC_1=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleModel158); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LC_1, grammarAccess.getModelAccess().getLCTerminalRuleCall_1()); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulefunction"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:118:1: entryRulefunction returns [EObject current=null] : iv_rulefunction= rulefunction EOF ;
    public final EObject entryRulefunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunction = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:119:2: (iv_rulefunction= rulefunction EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:120:2: iv_rulefunction= rulefunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_rulefunction_in_entryRulefunction196);
            iv_rulefunction=rulefunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefunction206); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefunction"


    // $ANTLR start "rulefunction"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:127:1: rulefunction returns [EObject current=null] : (otherlv_0= 'function' this_LC_1= RULE_LC ( (lv_funName_2_0= RULE_SYMBOLES ) ) otherlv_3= ':' this_LC_4= RULE_LC ( (lv_def_5_0= ruleDefiniton ) ) ) ;
    public final EObject rulefunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LC_1=null;
        Token lv_funName_2_0=null;
        Token otherlv_3=null;
        Token this_LC_4=null;
        EObject lv_def_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:130:28: ( (otherlv_0= 'function' this_LC_1= RULE_LC ( (lv_funName_2_0= RULE_SYMBOLES ) ) otherlv_3= ':' this_LC_4= RULE_LC ( (lv_def_5_0= ruleDefiniton ) ) ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:131:1: (otherlv_0= 'function' this_LC_1= RULE_LC ( (lv_funName_2_0= RULE_SYMBOLES ) ) otherlv_3= ':' this_LC_4= RULE_LC ( (lv_def_5_0= ruleDefiniton ) ) )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:131:1: (otherlv_0= 'function' this_LC_1= RULE_LC ( (lv_funName_2_0= RULE_SYMBOLES ) ) otherlv_3= ':' this_LC_4= RULE_LC ( (lv_def_5_0= ruleDefiniton ) ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:131:3: otherlv_0= 'function' this_LC_1= RULE_LC ( (lv_funName_2_0= RULE_SYMBOLES ) ) otherlv_3= ':' this_LC_4= RULE_LC ( (lv_def_5_0= ruleDefiniton ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulefunction243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
                  
            }
            this_LC_1=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_rulefunction254); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LC_1, grammarAccess.getFunctionAccess().getLCTerminalRuleCall_1()); 
                  
            }
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:139:1: ( (lv_funName_2_0= RULE_SYMBOLES ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:140:1: (lv_funName_2_0= RULE_SYMBOLES )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:140:1: (lv_funName_2_0= RULE_SYMBOLES )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:141:3: lv_funName_2_0= RULE_SYMBOLES
            {
            lv_funName_2_0=(Token)match(input,RULE_SYMBOLES,FOLLOW_RULE_SYMBOLES_in_rulefunction270); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_funName_2_0, grammarAccess.getFunctionAccess().getFunNameSYMBOLESTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFunctionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"funName",
                      		lv_funName_2_0, 
                      		"SYMBOLES");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_rulefunction287); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getColonKeyword_3());
                  
            }
            this_LC_4=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_rulefunction298); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LC_4, grammarAccess.getFunctionAccess().getLCTerminalRuleCall_4()); 
                  
            }
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:165:1: ( (lv_def_5_0= ruleDefiniton ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:166:1: (lv_def_5_0= ruleDefiniton )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:166:1: (lv_def_5_0= ruleDefiniton )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:167:3: lv_def_5_0= ruleDefiniton
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFunctionAccess().getDefDefinitonParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDefiniton_in_rulefunction318);
            lv_def_5_0=ruleDefiniton();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"def",
                      		lv_def_5_0, 
                      		"Definiton");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefunction"


    // $ANTLR start "entryRuleDefiniton"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:191:1: entryRuleDefiniton returns [EObject current=null] : iv_ruleDefiniton= ruleDefiniton EOF ;
    public final EObject entryRuleDefiniton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefiniton = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:192:2: (iv_ruleDefiniton= ruleDefiniton EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:193:2: iv_ruleDefiniton= ruleDefiniton EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitonRule()); 
            }
            pushFollow(FOLLOW_ruleDefiniton_in_entryRuleDefiniton354);
            iv_ruleDefiniton=ruleDefiniton();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefiniton; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefiniton364); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefiniton"


    // $ANTLR start "ruleDefiniton"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:200:1: ruleDefiniton returns [EObject current=null] : (otherlv_0= 'read' this_LC_1= RULE_LC ( (lv_inputVars_2_0= ruleInput ) ) this_LC_3= RULE_LC otherlv_4= '%' ( (lv_commandList_5_0= ruleCommands ) ) this_LC_6= RULE_LC otherlv_7= '%' otherlv_8= 'write' this_LC_9= RULE_LC ( (lv_outputVars_10_0= ruleOutput ) ) ) ;
    public final EObject ruleDefiniton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LC_1=null;
        Token this_LC_3=null;
        Token otherlv_4=null;
        Token this_LC_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token this_LC_9=null;
        AntlrDatatypeRuleToken lv_inputVars_2_0 = null;

        EObject lv_commandList_5_0 = null;

        AntlrDatatypeRuleToken lv_outputVars_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:203:28: ( (otherlv_0= 'read' this_LC_1= RULE_LC ( (lv_inputVars_2_0= ruleInput ) ) this_LC_3= RULE_LC otherlv_4= '%' ( (lv_commandList_5_0= ruleCommands ) ) this_LC_6= RULE_LC otherlv_7= '%' otherlv_8= 'write' this_LC_9= RULE_LC ( (lv_outputVars_10_0= ruleOutput ) ) ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:204:1: (otherlv_0= 'read' this_LC_1= RULE_LC ( (lv_inputVars_2_0= ruleInput ) ) this_LC_3= RULE_LC otherlv_4= '%' ( (lv_commandList_5_0= ruleCommands ) ) this_LC_6= RULE_LC otherlv_7= '%' otherlv_8= 'write' this_LC_9= RULE_LC ( (lv_outputVars_10_0= ruleOutput ) ) )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:204:1: (otherlv_0= 'read' this_LC_1= RULE_LC ( (lv_inputVars_2_0= ruleInput ) ) this_LC_3= RULE_LC otherlv_4= '%' ( (lv_commandList_5_0= ruleCommands ) ) this_LC_6= RULE_LC otherlv_7= '%' otherlv_8= 'write' this_LC_9= RULE_LC ( (lv_outputVars_10_0= ruleOutput ) ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:204:3: otherlv_0= 'read' this_LC_1= RULE_LC ( (lv_inputVars_2_0= ruleInput ) ) this_LC_3= RULE_LC otherlv_4= '%' ( (lv_commandList_5_0= ruleCommands ) ) this_LC_6= RULE_LC otherlv_7= '%' otherlv_8= 'write' this_LC_9= RULE_LC ( (lv_outputVars_10_0= ruleOutput ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleDefiniton401); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDefinitonAccess().getReadKeyword_0());
                  
            }
            this_LC_1=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleDefiniton412); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LC_1, grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_1()); 
                  
            }
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:212:1: ( (lv_inputVars_2_0= ruleInput ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:213:1: (lv_inputVars_2_0= ruleInput )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:213:1: (lv_inputVars_2_0= ruleInput )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:214:3: lv_inputVars_2_0= ruleInput
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefinitonAccess().getInputVarsInputParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleInput_in_ruleDefiniton432);
            lv_inputVars_2_0=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefinitonRule());
              	        }
                     		set(
                     			current, 
                     			"inputVars",
                      		lv_inputVars_2_0, 
                      		"Input");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_LC_3=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleDefiniton443); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LC_3, grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_3()); 
                  
            }
            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleDefiniton454); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDefinitonAccess().getPercentSignKeyword_4());
                  
            }
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:238:1: ( (lv_commandList_5_0= ruleCommands ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:239:1: (lv_commandList_5_0= ruleCommands )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:239:1: (lv_commandList_5_0= ruleCommands )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:240:3: lv_commandList_5_0= ruleCommands
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefinitonAccess().getCommandListCommandsParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommands_in_ruleDefiniton475);
            lv_commandList_5_0=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefinitonRule());
              	        }
                     		set(
                     			current, 
                     			"commandList",
                      		lv_commandList_5_0, 
                      		"Commands");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            this_LC_6=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleDefiniton486); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LC_6, grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_6()); 
                  
            }
            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleDefiniton497); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getDefinitonAccess().getPercentSignKeyword_7());
                  
            }
            otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleDefiniton509); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getDefinitonAccess().getWriteKeyword_8());
                  
            }
            this_LC_9=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleDefiniton520); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LC_9, grammarAccess.getDefinitonAccess().getLCTerminalRuleCall_9()); 
                  
            }
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:272:1: ( (lv_outputVars_10_0= ruleOutput ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:273:1: (lv_outputVars_10_0= ruleOutput )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:273:1: (lv_outputVars_10_0= ruleOutput )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:274:3: lv_outputVars_10_0= ruleOutput
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefinitonAccess().getOutputVarsOutputParserRuleCall_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOutput_in_ruleDefiniton540);
            lv_outputVars_10_0=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefinitonRule());
              	        }
                     		set(
                     			current, 
                     			"outputVars",
                      		lv_outputVars_10_0, 
                      		"Output");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefiniton"


    // $ANTLR start "entryRuleInput"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:298:1: entryRuleInput returns [String current=null] : iv_ruleInput= ruleInput EOF ;
    public final String entryRuleInput() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInput = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:299:2: (iv_ruleInput= ruleInput EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:300:2: iv_ruleInput= ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput577);
            iv_ruleInput=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInput.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput588); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:307:1: ruleInput returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VARIABLE_0= RULE_VARIABLE (kw= ',' (this_LC_2= RULE_LC )? this_VARIABLE_3= RULE_VARIABLE )* ) ;
    public final AntlrDatatypeRuleToken ruleInput() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VARIABLE_0=null;
        Token kw=null;
        Token this_LC_2=null;
        Token this_VARIABLE_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:310:28: ( (this_VARIABLE_0= RULE_VARIABLE (kw= ',' (this_LC_2= RULE_LC )? this_VARIABLE_3= RULE_VARIABLE )* ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:311:1: (this_VARIABLE_0= RULE_VARIABLE (kw= ',' (this_LC_2= RULE_LC )? this_VARIABLE_3= RULE_VARIABLE )* )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:311:1: (this_VARIABLE_0= RULE_VARIABLE (kw= ',' (this_LC_2= RULE_LC )? this_VARIABLE_3= RULE_VARIABLE )* )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:311:6: this_VARIABLE_0= RULE_VARIABLE (kw= ',' (this_LC_2= RULE_LC )? this_VARIABLE_3= RULE_VARIABLE )*
            {
            this_VARIABLE_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleInput628); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_VARIABLE_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_VARIABLE_0, grammarAccess.getInputAccess().getVARIABLETerminalRuleCall_0()); 
                  
            }
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:318:1: (kw= ',' (this_LC_2= RULE_LC )? this_VARIABLE_3= RULE_VARIABLE )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:319:2: kw= ',' (this_LC_2= RULE_LC )? this_VARIABLE_3= RULE_VARIABLE
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_ruleInput647); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getInputAccess().getCommaKeyword_1_0()); 
            	          
            	    }
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:324:1: (this_LC_2= RULE_LC )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==RULE_LC) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:324:6: this_LC_2= RULE_LC
            	            {
            	            this_LC_2=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleInput663); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LC_2);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LC_2, grammarAccess.getInputAccess().getLCTerminalRuleCall_1_1()); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    this_VARIABLE_3=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleInput685); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_VARIABLE_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_VARIABLE_3, grammarAccess.getInputAccess().getVARIABLETerminalRuleCall_1_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleOutput"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:346:1: entryRuleOutput returns [String current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final String entryRuleOutput() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOutput = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:347:2: (iv_ruleOutput= ruleOutput EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:348:2: iv_ruleOutput= ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_entryRuleOutput733);
            iv_ruleOutput=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutput.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutput744); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutput"


    // $ANTLR start "ruleOutput"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:355:1: ruleOutput returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VARIABLE_0= RULE_VARIABLE (kw= ',' (this_LC_2= RULE_LC )? this_VARIABLE_3= RULE_VARIABLE )* ) ;
    public final AntlrDatatypeRuleToken ruleOutput() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VARIABLE_0=null;
        Token kw=null;
        Token this_LC_2=null;
        Token this_VARIABLE_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:358:28: ( (this_VARIABLE_0= RULE_VARIABLE (kw= ',' (this_LC_2= RULE_LC )? this_VARIABLE_3= RULE_VARIABLE )* ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:359:1: (this_VARIABLE_0= RULE_VARIABLE (kw= ',' (this_LC_2= RULE_LC )? this_VARIABLE_3= RULE_VARIABLE )* )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:359:1: (this_VARIABLE_0= RULE_VARIABLE (kw= ',' (this_LC_2= RULE_LC )? this_VARIABLE_3= RULE_VARIABLE )* )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:359:6: this_VARIABLE_0= RULE_VARIABLE (kw= ',' (this_LC_2= RULE_LC )? this_VARIABLE_3= RULE_VARIABLE )*
            {
            this_VARIABLE_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleOutput784); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_VARIABLE_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_VARIABLE_0, grammarAccess.getOutputAccess().getVARIABLETerminalRuleCall_0()); 
                  
            }
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:366:1: (kw= ',' (this_LC_2= RULE_LC )? this_VARIABLE_3= RULE_VARIABLE )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:367:2: kw= ',' (this_LC_2= RULE_LC )? this_VARIABLE_3= RULE_VARIABLE
            	    {
            	    kw=(Token)match(input,19,FOLLOW_19_in_ruleOutput803); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getOutputAccess().getCommaKeyword_1_0()); 
            	          
            	    }
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:372:1: (this_LC_2= RULE_LC )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==RULE_LC) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:372:6: this_LC_2= RULE_LC
            	            {
            	            this_LC_2=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleOutput819); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              		current.merge(this_LC_2);
            	                  
            	            }
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LC_2, grammarAccess.getOutputAccess().getLCTerminalRuleCall_1_1()); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    this_VARIABLE_3=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleOutput841); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_VARIABLE_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_VARIABLE_3, grammarAccess.getOutputAccess().getVARIABLETerminalRuleCall_1_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutput"


    // $ANTLR start "entryRuleCommands"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:394:1: entryRuleCommands returns [EObject current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final EObject entryRuleCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommands = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:395:2: (iv_ruleCommands= ruleCommands EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:396:2: iv_ruleCommands= ruleCommands EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandsRule()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_entryRuleCommands888);
            iv_ruleCommands=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommands; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommands898); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommands"


    // $ANTLR start "ruleCommands"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:403:1: ruleCommands returns [EObject current=null] : ( ( (lv_c_0_0= ruleCommand ) ) (otherlv_1= ';' (this_LC_2= RULE_LC )? ( (lv_c_3_0= ruleCommand ) ) )* ) ;
    public final EObject ruleCommands() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_LC_2=null;
        EObject lv_c_0_0 = null;

        EObject lv_c_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:406:28: ( ( ( (lv_c_0_0= ruleCommand ) ) (otherlv_1= ';' (this_LC_2= RULE_LC )? ( (lv_c_3_0= ruleCommand ) ) )* ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:407:1: ( ( (lv_c_0_0= ruleCommand ) ) (otherlv_1= ';' (this_LC_2= RULE_LC )? ( (lv_c_3_0= ruleCommand ) ) )* )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:407:1: ( ( (lv_c_0_0= ruleCommand ) ) (otherlv_1= ';' (this_LC_2= RULE_LC )? ( (lv_c_3_0= ruleCommand ) ) )* )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:407:2: ( (lv_c_0_0= ruleCommand ) ) (otherlv_1= ';' (this_LC_2= RULE_LC )? ( (lv_c_3_0= ruleCommand ) ) )*
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:407:2: ( (lv_c_0_0= ruleCommand ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:408:1: (lv_c_0_0= ruleCommand )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:408:1: (lv_c_0_0= ruleCommand )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:409:3: lv_c_0_0= ruleCommand
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommand_in_ruleCommands944);
            lv_c_0_0=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCommandsRule());
              	        }
                     		add(
                     			current, 
                     			"c",
                      		lv_c_0_0, 
                      		"Command");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:425:2: (otherlv_1= ';' (this_LC_2= RULE_LC )? ( (lv_c_3_0= ruleCommand ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:425:4: otherlv_1= ';' (this_LC_2= RULE_LC )? ( (lv_c_3_0= ruleCommand ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleCommands957); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:429:1: (this_LC_2= RULE_LC )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==RULE_LC) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:429:2: this_LC_2= RULE_LC
            	            {
            	            this_LC_2=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommands969); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LC_2, grammarAccess.getCommandsAccess().getLCTerminalRuleCall_1_1()); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:433:3: ( (lv_c_3_0= ruleCommand ) )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:434:1: (lv_c_3_0= ruleCommand )
            	    {
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:434:1: (lv_c_3_0= ruleCommand )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:435:3: lv_c_3_0= ruleCommand
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCommand_in_ruleCommands991);
            	    lv_c_3_0=ruleCommand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCommandsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"c",
            	              		lv_c_3_0, 
            	              		"Command");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommands"


    // $ANTLR start "entryRuleVars"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:459:1: entryRuleVars returns [String current=null] : iv_ruleVars= ruleVars EOF ;
    public final String entryRuleVars() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVars = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:460:2: (iv_ruleVars= ruleVars EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:461:2: iv_ruleVars= ruleVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarsRule()); 
            }
            pushFollow(FOLLOW_ruleVars_in_entryRuleVars1030);
            iv_ruleVars=ruleVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVars.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVars1041); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVars"


    // $ANTLR start "ruleVars"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:468:1: ruleVars returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VARIABLE_0= RULE_VARIABLE (kw= ',' this_Vars_2= ruleVars )? ) ;
    public final AntlrDatatypeRuleToken ruleVars() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VARIABLE_0=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Vars_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:471:28: ( (this_VARIABLE_0= RULE_VARIABLE (kw= ',' this_Vars_2= ruleVars )? ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:472:1: (this_VARIABLE_0= RULE_VARIABLE (kw= ',' this_Vars_2= ruleVars )? )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:472:1: (this_VARIABLE_0= RULE_VARIABLE (kw= ',' this_Vars_2= ruleVars )? )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:472:6: this_VARIABLE_0= RULE_VARIABLE (kw= ',' this_Vars_2= ruleVars )?
            {
            this_VARIABLE_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleVars1081); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_VARIABLE_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_VARIABLE_0, grammarAccess.getVarsAccess().getVARIABLETerminalRuleCall_0()); 
                  
            }
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:479:1: (kw= ',' this_Vars_2= ruleVars )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:480:2: kw= ',' this_Vars_2= ruleVars
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleVars1100); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVarsAccess().getCommaKeyword_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVarsAccess().getVarsParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVars_in_ruleVars1122);
                    this_Vars_2=ruleVars();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Vars_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVars"


    // $ANTLR start "entryRuleExprs"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:504:1: entryRuleExprs returns [String current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final String entryRuleExprs() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprs = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:505:2: (iv_ruleExprs= ruleExprs EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:506:2: iv_ruleExprs= ruleExprs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprsRule()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_entryRuleExprs1170);
            iv_ruleExprs=ruleExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprs.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprs1181); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprs"


    // $ANTLR start "ruleExprs"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:513:1: ruleExprs returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Expr_0= ruleExpr (kw= ',' this_Exprs_2= ruleExprs )? ) ;
    public final AntlrDatatypeRuleToken ruleExprs() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Expr_0 = null;

        AntlrDatatypeRuleToken this_Exprs_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:516:28: ( (this_Expr_0= ruleExpr (kw= ',' this_Exprs_2= ruleExprs )? ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:517:1: (this_Expr_0= ruleExpr (kw= ',' this_Exprs_2= ruleExprs )? )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:517:1: (this_Expr_0= ruleExpr (kw= ',' this_Exprs_2= ruleExprs )? )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:518:5: this_Expr_0= ruleExpr (kw= ',' this_Exprs_2= ruleExprs )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExprsAccess().getExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleExprs1228);
            this_Expr_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Expr_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:528:1: (kw= ',' this_Exprs_2= ruleExprs )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:529:2: kw= ',' this_Exprs_2= ruleExprs
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleExprs1247); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExprsAccess().getCommaKeyword_1_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprsAccess().getExprsParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExprs_in_ruleExprs1269);
                    this_Exprs_2=ruleExprs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Exprs_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleCommand"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:553:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:554:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:555:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand1316);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand1326); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:562:1: ruleCommand returns [EObject current=null] : (otherlv_0= 'nop' | ( ruleVars (this_LC_2= RULE_LC )? otherlv_3= ':=' (this_LC_4= RULE_LC )? ruleExprs ) | (otherlv_6= 'while' this_LC_7= RULE_LC ruleExpr this_LC_9= RULE_LC otherlv_10= 'do' this_LC_11= RULE_LC this_Commands_12= ruleCommands this_LC_13= RULE_LC otherlv_14= 'od' ) | (otherlv_15= 'for' this_LC_16= RULE_LC ruleExpr this_LC_18= RULE_LC otherlv_19= 'do' this_LC_20= RULE_LC this_Commands_21= ruleCommands this_LC_22= RULE_LC otherlv_23= 'od' ) | (otherlv_24= 'foreach' this_LC_25= RULE_LC ruleExpr this_LC_27= RULE_LC otherlv_28= 'in' this_LC_29= RULE_LC ruleExpr this_LC_31= RULE_LC otherlv_32= 'do' this_LC_33= RULE_LC this_Commands_34= ruleCommands this_LC_35= RULE_LC otherlv_36= 'od' ) | (otherlv_37= 'if' this_LC_38= RULE_LC ruleExpr this_LC_40= RULE_LC otherlv_41= 'then' this_LC_42= RULE_LC ( (lv_c_43_0= ruleCommands ) ) this_LC_44= RULE_LC (otherlv_45= 'else' this_LC_46= RULE_LC ( (lv_c2_47_0= ruleCommands ) ) this_LC_48= RULE_LC )? otherlv_49= 'fi' ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LC_2=null;
        Token otherlv_3=null;
        Token this_LC_4=null;
        Token otherlv_6=null;
        Token this_LC_7=null;
        Token this_LC_9=null;
        Token otherlv_10=null;
        Token this_LC_11=null;
        Token this_LC_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token this_LC_16=null;
        Token this_LC_18=null;
        Token otherlv_19=null;
        Token this_LC_20=null;
        Token this_LC_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token this_LC_25=null;
        Token this_LC_27=null;
        Token otherlv_28=null;
        Token this_LC_29=null;
        Token this_LC_31=null;
        Token otherlv_32=null;
        Token this_LC_33=null;
        Token this_LC_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token this_LC_38=null;
        Token this_LC_40=null;
        Token otherlv_41=null;
        Token this_LC_42=null;
        Token this_LC_44=null;
        Token otherlv_45=null;
        Token this_LC_46=null;
        Token this_LC_48=null;
        Token otherlv_49=null;
        EObject this_Commands_12 = null;

        EObject this_Commands_21 = null;

        EObject this_Commands_34 = null;

        EObject lv_c_43_0 = null;

        EObject lv_c2_47_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:565:28: ( (otherlv_0= 'nop' | ( ruleVars (this_LC_2= RULE_LC )? otherlv_3= ':=' (this_LC_4= RULE_LC )? ruleExprs ) | (otherlv_6= 'while' this_LC_7= RULE_LC ruleExpr this_LC_9= RULE_LC otherlv_10= 'do' this_LC_11= RULE_LC this_Commands_12= ruleCommands this_LC_13= RULE_LC otherlv_14= 'od' ) | (otherlv_15= 'for' this_LC_16= RULE_LC ruleExpr this_LC_18= RULE_LC otherlv_19= 'do' this_LC_20= RULE_LC this_Commands_21= ruleCommands this_LC_22= RULE_LC otherlv_23= 'od' ) | (otherlv_24= 'foreach' this_LC_25= RULE_LC ruleExpr this_LC_27= RULE_LC otherlv_28= 'in' this_LC_29= RULE_LC ruleExpr this_LC_31= RULE_LC otherlv_32= 'do' this_LC_33= RULE_LC this_Commands_34= ruleCommands this_LC_35= RULE_LC otherlv_36= 'od' ) | (otherlv_37= 'if' this_LC_38= RULE_LC ruleExpr this_LC_40= RULE_LC otherlv_41= 'then' this_LC_42= RULE_LC ( (lv_c_43_0= ruleCommands ) ) this_LC_44= RULE_LC (otherlv_45= 'else' this_LC_46= RULE_LC ( (lv_c2_47_0= ruleCommands ) ) this_LC_48= RULE_LC )? otherlv_49= 'fi' ) ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:566:1: (otherlv_0= 'nop' | ( ruleVars (this_LC_2= RULE_LC )? otherlv_3= ':=' (this_LC_4= RULE_LC )? ruleExprs ) | (otherlv_6= 'while' this_LC_7= RULE_LC ruleExpr this_LC_9= RULE_LC otherlv_10= 'do' this_LC_11= RULE_LC this_Commands_12= ruleCommands this_LC_13= RULE_LC otherlv_14= 'od' ) | (otherlv_15= 'for' this_LC_16= RULE_LC ruleExpr this_LC_18= RULE_LC otherlv_19= 'do' this_LC_20= RULE_LC this_Commands_21= ruleCommands this_LC_22= RULE_LC otherlv_23= 'od' ) | (otherlv_24= 'foreach' this_LC_25= RULE_LC ruleExpr this_LC_27= RULE_LC otherlv_28= 'in' this_LC_29= RULE_LC ruleExpr this_LC_31= RULE_LC otherlv_32= 'do' this_LC_33= RULE_LC this_Commands_34= ruleCommands this_LC_35= RULE_LC otherlv_36= 'od' ) | (otherlv_37= 'if' this_LC_38= RULE_LC ruleExpr this_LC_40= RULE_LC otherlv_41= 'then' this_LC_42= RULE_LC ( (lv_c_43_0= ruleCommands ) ) this_LC_44= RULE_LC (otherlv_45= 'else' this_LC_46= RULE_LC ( (lv_c2_47_0= ruleCommands ) ) this_LC_48= RULE_LC )? otherlv_49= 'fi' ) )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:566:1: (otherlv_0= 'nop' | ( ruleVars (this_LC_2= RULE_LC )? otherlv_3= ':=' (this_LC_4= RULE_LC )? ruleExprs ) | (otherlv_6= 'while' this_LC_7= RULE_LC ruleExpr this_LC_9= RULE_LC otherlv_10= 'do' this_LC_11= RULE_LC this_Commands_12= ruleCommands this_LC_13= RULE_LC otherlv_14= 'od' ) | (otherlv_15= 'for' this_LC_16= RULE_LC ruleExpr this_LC_18= RULE_LC otherlv_19= 'do' this_LC_20= RULE_LC this_Commands_21= ruleCommands this_LC_22= RULE_LC otherlv_23= 'od' ) | (otherlv_24= 'foreach' this_LC_25= RULE_LC ruleExpr this_LC_27= RULE_LC otherlv_28= 'in' this_LC_29= RULE_LC ruleExpr this_LC_31= RULE_LC otherlv_32= 'do' this_LC_33= RULE_LC this_Commands_34= ruleCommands this_LC_35= RULE_LC otherlv_36= 'od' ) | (otherlv_37= 'if' this_LC_38= RULE_LC ruleExpr this_LC_40= RULE_LC otherlv_41= 'then' this_LC_42= RULE_LC ( (lv_c_43_0= ruleCommands ) ) this_LC_44= RULE_LC (otherlv_45= 'else' this_LC_46= RULE_LC ( (lv_c2_47_0= ruleCommands ) ) this_LC_48= RULE_LC )? otherlv_49= 'fi' ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt14=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt14=2;
                }
                break;
            case 23:
                {
                alt14=3;
                }
                break;
            case 26:
                {
                alt14=4;
                }
                break;
            case 27:
                {
                alt14=5;
                }
                break;
            case 29:
                {
                alt14=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:566:3: otherlv_0= 'nop'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleCommand1363); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCommandAccess().getNopKeyword_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:571:6: ( ruleVars (this_LC_2= RULE_LC )? otherlv_3= ':=' (this_LC_4= RULE_LC )? ruleExprs )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:571:6: ( ruleVars (this_LC_2= RULE_LC )? otherlv_3= ':=' (this_LC_4= RULE_LC )? ruleExprs )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:572:2: ruleVars (this_LC_2= RULE_LC )? otherlv_3= ':=' (this_LC_4= RULE_LC )? ruleExprs
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getVarsParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVars_in_ruleCommand1389);
                    ruleVars();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:582:1: (this_LC_2= RULE_LC )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_LC) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:582:2: this_LC_2= RULE_LC
                            {
                            this_LC_2=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1400); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_LC_2, grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_1()); 
                                  
                            }

                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleCommand1413); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getCommandAccess().getColonEqualsSignKeyword_1_2());
                          
                    }
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:590:1: (this_LC_4= RULE_LC )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_LC) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:590:2: this_LC_4= RULE_LC
                            {
                            this_LC_4=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1425); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_LC_4, grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_3()); 
                                  
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getExprsParserRuleCall_1_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExprs_in_ruleCommand1445);
                    ruleExprs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:606:6: (otherlv_6= 'while' this_LC_7= RULE_LC ruleExpr this_LC_9= RULE_LC otherlv_10= 'do' this_LC_11= RULE_LC this_Commands_12= ruleCommands this_LC_13= RULE_LC otherlv_14= 'od' )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:606:6: (otherlv_6= 'while' this_LC_7= RULE_LC ruleExpr this_LC_9= RULE_LC otherlv_10= 'do' this_LC_11= RULE_LC this_Commands_12= ruleCommands this_LC_13= RULE_LC otherlv_14= 'od' )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:606:8: otherlv_6= 'while' this_LC_7= RULE_LC ruleExpr this_LC_9= RULE_LC otherlv_10= 'do' this_LC_11= RULE_LC this_Commands_12= ruleCommands this_LC_13= RULE_LC otherlv_14= 'od'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleCommand1464); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCommandAccess().getWhileKeyword_2_0());
                          
                    }
                    this_LC_7=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_7, grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getExprParserRuleCall_2_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleCommand1493);
                    ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_LC_9=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1503); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_9, grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_3()); 
                          
                    }
                    otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleCommand1514); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getCommandAccess().getDoKeyword_2_4());
                          
                    }
                    this_LC_11=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_11, grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_5()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getCommandsParserRuleCall_2_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommands_in_ruleCommand1549);
                    this_Commands_12=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Commands_12; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_LC_13=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1559); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_13, grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_7()); 
                          
                    }
                    otherlv_14=(Token)match(input,25,FOLLOW_25_in_ruleCommand1570); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getCommandAccess().getOdKeyword_2_8());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:658:6: (otherlv_15= 'for' this_LC_16= RULE_LC ruleExpr this_LC_18= RULE_LC otherlv_19= 'do' this_LC_20= RULE_LC this_Commands_21= ruleCommands this_LC_22= RULE_LC otherlv_23= 'od' )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:658:6: (otherlv_15= 'for' this_LC_16= RULE_LC ruleExpr this_LC_18= RULE_LC otherlv_19= 'do' this_LC_20= RULE_LC this_Commands_21= ruleCommands this_LC_22= RULE_LC otherlv_23= 'od' )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:658:8: otherlv_15= 'for' this_LC_16= RULE_LC ruleExpr this_LC_18= RULE_LC otherlv_19= 'do' this_LC_20= RULE_LC this_Commands_21= ruleCommands this_LC_22= RULE_LC otherlv_23= 'od'
                    {
                    otherlv_15=(Token)match(input,26,FOLLOW_26_in_ruleCommand1590); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getCommandAccess().getForKeyword_3_0());
                          
                    }
                    this_LC_16=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1601); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_16, grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getExprParserRuleCall_3_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleCommand1619);
                    ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_LC_18=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_18, grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_3()); 
                          
                    }
                    otherlv_19=(Token)match(input,24,FOLLOW_24_in_ruleCommand1640); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getCommandAccess().getDoKeyword_3_4());
                          
                    }
                    this_LC_20=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1651); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_20, grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_5()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getCommandsParserRuleCall_3_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommands_in_ruleCommand1675);
                    this_Commands_21=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Commands_21; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_LC_22=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1685); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_22, grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_7()); 
                          
                    }
                    otherlv_23=(Token)match(input,25,FOLLOW_25_in_ruleCommand1696); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getCommandAccess().getOdKeyword_3_8());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:710:6: (otherlv_24= 'foreach' this_LC_25= RULE_LC ruleExpr this_LC_27= RULE_LC otherlv_28= 'in' this_LC_29= RULE_LC ruleExpr this_LC_31= RULE_LC otherlv_32= 'do' this_LC_33= RULE_LC this_Commands_34= ruleCommands this_LC_35= RULE_LC otherlv_36= 'od' )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:710:6: (otherlv_24= 'foreach' this_LC_25= RULE_LC ruleExpr this_LC_27= RULE_LC otherlv_28= 'in' this_LC_29= RULE_LC ruleExpr this_LC_31= RULE_LC otherlv_32= 'do' this_LC_33= RULE_LC this_Commands_34= ruleCommands this_LC_35= RULE_LC otherlv_36= 'od' )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:710:8: otherlv_24= 'foreach' this_LC_25= RULE_LC ruleExpr this_LC_27= RULE_LC otherlv_28= 'in' this_LC_29= RULE_LC ruleExpr this_LC_31= RULE_LC otherlv_32= 'do' this_LC_33= RULE_LC this_Commands_34= ruleCommands this_LC_35= RULE_LC otherlv_36= 'od'
                    {
                    otherlv_24=(Token)match(input,27,FOLLOW_27_in_ruleCommand1716); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getCommandAccess().getForeachKeyword_4_0());
                          
                    }
                    this_LC_25=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1727); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_25, grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getExprParserRuleCall_4_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleCommand1745);
                    ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_LC_27=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1755); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_27, grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_3()); 
                          
                    }
                    otherlv_28=(Token)match(input,28,FOLLOW_28_in_ruleCommand1766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_28, grammarAccess.getCommandAccess().getInKeyword_4_4());
                          
                    }
                    this_LC_29=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1777); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_29, grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_5()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getExprParserRuleCall_4_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleCommand1795);
                    ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_LC_31=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1805); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_31, grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_7()); 
                          
                    }
                    otherlv_32=(Token)match(input,24,FOLLOW_24_in_ruleCommand1816); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_32, grammarAccess.getCommandAccess().getDoKeyword_4_8());
                          
                    }
                    this_LC_33=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1827); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_33, grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_9()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getCommandsParserRuleCall_4_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommands_in_ruleCommand1851);
                    this_Commands_34=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Commands_34; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_LC_35=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1861); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_35, grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_11()); 
                          
                    }
                    otherlv_36=(Token)match(input,25,FOLLOW_25_in_ruleCommand1872); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_36, grammarAccess.getCommandAccess().getOdKeyword_4_12());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:785:6: (otherlv_37= 'if' this_LC_38= RULE_LC ruleExpr this_LC_40= RULE_LC otherlv_41= 'then' this_LC_42= RULE_LC ( (lv_c_43_0= ruleCommands ) ) this_LC_44= RULE_LC (otherlv_45= 'else' this_LC_46= RULE_LC ( (lv_c2_47_0= ruleCommands ) ) this_LC_48= RULE_LC )? otherlv_49= 'fi' )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:785:6: (otherlv_37= 'if' this_LC_38= RULE_LC ruleExpr this_LC_40= RULE_LC otherlv_41= 'then' this_LC_42= RULE_LC ( (lv_c_43_0= ruleCommands ) ) this_LC_44= RULE_LC (otherlv_45= 'else' this_LC_46= RULE_LC ( (lv_c2_47_0= ruleCommands ) ) this_LC_48= RULE_LC )? otherlv_49= 'fi' )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:785:8: otherlv_37= 'if' this_LC_38= RULE_LC ruleExpr this_LC_40= RULE_LC otherlv_41= 'then' this_LC_42= RULE_LC ( (lv_c_43_0= ruleCommands ) ) this_LC_44= RULE_LC (otherlv_45= 'else' this_LC_46= RULE_LC ( (lv_c2_47_0= ruleCommands ) ) this_LC_48= RULE_LC )? otherlv_49= 'fi'
                    {
                    otherlv_37=(Token)match(input,29,FOLLOW_29_in_ruleCommand1892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_37, grammarAccess.getCommandAccess().getIfKeyword_5_0());
                          
                    }
                    this_LC_38=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1903); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_38, grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCommandAccess().getExprParserRuleCall_5_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleCommand1921);
                    ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_LC_40=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1931); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_40, grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_3()); 
                          
                    }
                    otherlv_41=(Token)match(input,30,FOLLOW_30_in_ruleCommand1942); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_41, grammarAccess.getCommandAccess().getThenKeyword_5_4());
                          
                    }
                    this_LC_42=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1953); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_42, grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_5()); 
                          
                    }
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:816:1: ( (lv_c_43_0= ruleCommands ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:817:1: (lv_c_43_0= ruleCommands )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:817:1: (lv_c_43_0= ruleCommands )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:818:3: lv_c_43_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getCCommandsParserRuleCall_5_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCommands_in_ruleCommand1973);
                    lv_c_43_0=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"c",
                              		lv_c_43_0, 
                              		"Commands");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_LC_44=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1984); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_44, grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_7()); 
                          
                    }
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:838:1: (otherlv_45= 'else' this_LC_46= RULE_LC ( (lv_c2_47_0= ruleCommands ) ) this_LC_48= RULE_LC )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==31) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:838:3: otherlv_45= 'else' this_LC_46= RULE_LC ( (lv_c2_47_0= ruleCommands ) ) this_LC_48= RULE_LC
                            {
                            otherlv_45=(Token)match(input,31,FOLLOW_31_in_ruleCommand1996); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_45, grammarAccess.getCommandAccess().getElseKeyword_5_8_0());
                                  
                            }
                            this_LC_46=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand2007); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_LC_46, grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_8_1()); 
                                  
                            }
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:846:1: ( (lv_c2_47_0= ruleCommands ) )
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:847:1: (lv_c2_47_0= ruleCommands )
                            {
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:847:1: (lv_c2_47_0= ruleCommands )
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:848:3: lv_c2_47_0= ruleCommands
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCommandAccess().getC2CommandsParserRuleCall_5_8_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleCommands_in_ruleCommand2027);
                            lv_c2_47_0=ruleCommands();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getCommandRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"c2",
                                      		lv_c2_47_0, 
                                      		"Commands");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            this_LC_48=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand2038); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_LC_48, grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_8_3()); 
                                  
                            }

                            }
                            break;

                    }

                    otherlv_49=(Token)match(input,32,FOLLOW_32_in_ruleCommand2051); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_49, grammarAccess.getCommandAccess().getFiKeyword_5_9());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleExpr"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:880:1: entryRuleExpr returns [String current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final String entryRuleExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExpr = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:881:2: (iv_ruleExpr= ruleExpr EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:882:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr2089);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr2100); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpr"


    // $ANTLR start "ruleExpr"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:889:1: ruleExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ExprSimple_0= ruleExprSimple | this_And_1= ruleAnd | this_ExprTerm_2= ruleExprTerm ) ;
    public final AntlrDatatypeRuleToken ruleExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_ExprSimple_0 = null;

        AntlrDatatypeRuleToken this_And_1 = null;

        AntlrDatatypeRuleToken this_ExprTerm_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:892:28: ( (this_ExprSimple_0= ruleExprSimple | this_And_1= ruleAnd | this_ExprTerm_2= ruleExprTerm ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:893:1: (this_ExprSimple_0= ruleExprSimple | this_And_1= ruleAnd | this_ExprTerm_2= ruleExprTerm )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:893:1: (this_ExprSimple_0= ruleExprSimple | this_And_1= ruleAnd | this_ExprTerm_2= ruleExprTerm )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:894:5: this_ExprSimple_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprAccess().getExprSimpleParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_ruleExpr2147);
                    this_ExprSimple_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExprSimple_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:906:5: this_And_1= ruleAnd
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprAccess().getAndParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAnd_in_ruleExpr2180);
                    this_And_1=ruleAnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_And_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:918:5: this_ExprTerm_2= ruleExprTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprAccess().getExprTermParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExprTerm_in_ruleExpr2213);
                    this_ExprTerm_2=ruleExprTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ExprTerm_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleAnd"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:936:1: entryRuleAnd returns [String current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final String entryRuleAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnd = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:937:2: (iv_ruleAnd= ruleAnd EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:938:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd2259);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd2270); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:945:1: ruleAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Or_0= ruleOr (this_LC_1= RULE_LC kw= 'and' this_LC_3= RULE_LC this_Or_4= ruleOr )* ) ;
    public final AntlrDatatypeRuleToken ruleAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LC_1=null;
        Token kw=null;
        Token this_LC_3=null;
        AntlrDatatypeRuleToken this_Or_0 = null;

        AntlrDatatypeRuleToken this_Or_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:948:28: ( (this_Or_0= ruleOr (this_LC_1= RULE_LC kw= 'and' this_LC_3= RULE_LC this_Or_4= ruleOr )* ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:949:1: (this_Or_0= ruleOr (this_LC_1= RULE_LC kw= 'and' this_LC_3= RULE_LC this_Or_4= ruleOr )* )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:949:1: (this_Or_0= ruleOr (this_LC_1= RULE_LC kw= 'and' this_LC_3= RULE_LC this_Or_4= ruleOr )* )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:950:5: this_Or_0= ruleOr (this_LC_1= RULE_LC kw= 'and' this_LC_3= RULE_LC this_Or_4= ruleOr )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndAccess().getOrParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleOr_in_ruleAnd2317);
            this_Or_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Or_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:960:1: (this_LC_1= RULE_LC kw= 'and' this_LC_3= RULE_LC this_Or_4= ruleOr )*
            loop16:
            do {
                int alt16=2;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:960:6: this_LC_1= RULE_LC kw= 'and' this_LC_3= RULE_LC this_Or_4= ruleOr
            	    {
            	    this_LC_1=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleAnd2338); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LC_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LC_1, grammarAccess.getAndAccess().getLCTerminalRuleCall_1_0()); 
            	          
            	    }
            	    kw=(Token)match(input,33,FOLLOW_33_in_ruleAnd2356); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getAndAccess().getAndKeyword_1_1()); 
            	          
            	    }
            	    this_LC_3=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleAnd2371); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LC_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LC_3, grammarAccess.getAndAccess().getLCTerminalRuleCall_1_2()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getAndAccess().getOrParserRuleCall_1_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOr_in_ruleAnd2398);
            	    this_Or_4=ruleOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Or_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleOr"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:999:1: entryRuleOr returns [String current=null] : iv_ruleOr= ruleOr EOF ;
    public final String entryRuleOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOr = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1000:2: (iv_ruleOr= ruleOr EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1001:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr2446);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr2457); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1008:1: ruleOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Not_0= ruleNot (this_LC_1= RULE_LC kw= 'or' this_LC_3= RULE_LC this_Not_4= ruleNot )* ) ;
    public final AntlrDatatypeRuleToken ruleOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LC_1=null;
        Token kw=null;
        Token this_LC_3=null;
        AntlrDatatypeRuleToken this_Not_0 = null;

        AntlrDatatypeRuleToken this_Not_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1011:28: ( (this_Not_0= ruleNot (this_LC_1= RULE_LC kw= 'or' this_LC_3= RULE_LC this_Not_4= ruleNot )* ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1012:1: (this_Not_0= ruleNot (this_LC_1= RULE_LC kw= 'or' this_LC_3= RULE_LC this_Not_4= ruleNot )* )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1012:1: (this_Not_0= ruleNot (this_LC_1= RULE_LC kw= 'or' this_LC_3= RULE_LC this_Not_4= ruleNot )* )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1013:5: this_Not_0= ruleNot (this_LC_1= RULE_LC kw= 'or' this_LC_3= RULE_LC this_Not_4= ruleNot )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrAccess().getNotParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNot_in_ruleOr2504);
            this_Not_0=ruleNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Not_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1023:1: (this_LC_1= RULE_LC kw= 'or' this_LC_3= RULE_LC this_Not_4= ruleNot )*
            loop17:
            do {
                int alt17=2;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1023:6: this_LC_1= RULE_LC kw= 'or' this_LC_3= RULE_LC this_Not_4= ruleNot
            	    {
            	    this_LC_1=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleOr2525); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LC_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LC_1, grammarAccess.getOrAccess().getLCTerminalRuleCall_1_0()); 
            	          
            	    }
            	    kw=(Token)match(input,34,FOLLOW_34_in_ruleOr2543); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getOrAccess().getOrKeyword_1_1()); 
            	          
            	    }
            	    this_LC_3=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleOr2558); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LC_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LC_3, grammarAccess.getOrAccess().getLCTerminalRuleCall_1_2()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getOrAccess().getNotParserRuleCall_1_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleNot_in_ruleOr2585);
            	    this_Not_4=ruleNot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Not_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleNot"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1062:1: entryRuleNot returns [String current=null] : iv_ruleNot= ruleNot EOF ;
    public final String entryRuleNot() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNot = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1063:2: (iv_ruleNot= ruleNot EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1064:2: iv_ruleNot= ruleNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotRule()); 
            }
            pushFollow(FOLLOW_ruleNot_in_entryRuleNot2633);
            iv_ruleNot=ruleNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNot.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNot2644); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1071:1: ruleNot returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'not' this_LC_1= RULE_LC )* this_Eq_2= ruleEq ) ;
    public final AntlrDatatypeRuleToken ruleNot() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_LC_1=null;
        AntlrDatatypeRuleToken this_Eq_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1074:28: ( ( (kw= 'not' this_LC_1= RULE_LC )* this_Eq_2= ruleEq ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:1: ( (kw= 'not' this_LC_1= RULE_LC )* this_Eq_2= ruleEq )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:1: ( (kw= 'not' this_LC_1= RULE_LC )* this_Eq_2= ruleEq )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:2: (kw= 'not' this_LC_1= RULE_LC )* this_Eq_2= ruleEq
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1075:2: (kw= 'not' this_LC_1= RULE_LC )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1076:2: kw= 'not' this_LC_1= RULE_LC
            	    {
            	    kw=(Token)match(input,35,FOLLOW_35_in_ruleNot2683); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getNotAccess().getNotKeyword_0_0()); 
            	          
            	    }
            	    this_LC_1=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleNot2698); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LC_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LC_1, grammarAccess.getNotAccess().getLCTerminalRuleCall_0_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNotAccess().getEqParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleEq_in_ruleNot2727);
            this_Eq_2=ruleEq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Eq_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleEq"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1107:1: entryRuleEq returns [String current=null] : iv_ruleEq= ruleEq EOF ;
    public final String entryRuleEq() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEq = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1108:2: (iv_ruleEq= ruleEq EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1109:2: iv_ruleEq= ruleEq EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqRule()); 
            }
            pushFollow(FOLLOW_ruleEq_in_entryRuleEq2773);
            iv_ruleEq=ruleEq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEq.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEq2784); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEq"


    // $ANTLR start "ruleEq"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1116:1: ruleEq returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (this_ExprSimple_0= ruleExprSimple | this_ExprTerm_1= ruleExprTerm ) (this_LC_2= RULE_LC )? kw= '=?' (this_LC_4= RULE_LC )? (this_ExprSimple_5= ruleExprSimple | this_ExprTerm_6= ruleExprTerm ) ) | (kw= '(' (this_ExprTerm_8= ruleExprTerm | this_ExprSimple_9= ruleExprSimple ) kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleEq() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LC_2=null;
        Token kw=null;
        Token this_LC_4=null;
        AntlrDatatypeRuleToken this_ExprSimple_0 = null;

        AntlrDatatypeRuleToken this_ExprTerm_1 = null;

        AntlrDatatypeRuleToken this_ExprSimple_5 = null;

        AntlrDatatypeRuleToken this_ExprTerm_6 = null;

        AntlrDatatypeRuleToken this_ExprTerm_8 = null;

        AntlrDatatypeRuleToken this_ExprSimple_9 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1119:28: ( ( ( (this_ExprSimple_0= ruleExprSimple | this_ExprTerm_1= ruleExprTerm ) (this_LC_2= RULE_LC )? kw= '=?' (this_LC_4= RULE_LC )? (this_ExprSimple_5= ruleExprSimple | this_ExprTerm_6= ruleExprTerm ) ) | (kw= '(' (this_ExprTerm_8= ruleExprTerm | this_ExprSimple_9= ruleExprSimple ) kw= ')' ) ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1120:1: ( ( (this_ExprSimple_0= ruleExprSimple | this_ExprTerm_1= ruleExprTerm ) (this_LC_2= RULE_LC )? kw= '=?' (this_LC_4= RULE_LC )? (this_ExprSimple_5= ruleExprSimple | this_ExprTerm_6= ruleExprTerm ) ) | (kw= '(' (this_ExprTerm_8= ruleExprTerm | this_ExprSimple_9= ruleExprSimple ) kw= ')' ) )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1120:1: ( ( (this_ExprSimple_0= ruleExprSimple | this_ExprTerm_1= ruleExprTerm ) (this_LC_2= RULE_LC )? kw= '=?' (this_LC_4= RULE_LC )? (this_ExprSimple_5= ruleExprSimple | this_ExprTerm_6= ruleExprTerm ) ) | (kw= '(' (this_ExprTerm_8= ruleExprTerm | this_ExprSimple_9= ruleExprSimple ) kw= ')' ) )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1120:2: ( (this_ExprSimple_0= ruleExprSimple | this_ExprTerm_1= ruleExprTerm ) (this_LC_2= RULE_LC )? kw= '=?' (this_LC_4= RULE_LC )? (this_ExprSimple_5= ruleExprSimple | this_ExprTerm_6= ruleExprTerm ) )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1120:2: ( (this_ExprSimple_0= ruleExprSimple | this_ExprTerm_1= ruleExprTerm ) (this_LC_2= RULE_LC )? kw= '=?' (this_LC_4= RULE_LC )? (this_ExprSimple_5= ruleExprSimple | this_ExprTerm_6= ruleExprTerm ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1120:3: (this_ExprSimple_0= ruleExprSimple | this_ExprTerm_1= ruleExprTerm ) (this_LC_2= RULE_LC )? kw= '=?' (this_LC_4= RULE_LC )? (this_ExprSimple_5= ruleExprSimple | this_ExprTerm_6= ruleExprTerm )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1120:3: (this_ExprSimple_0= ruleExprSimple | this_ExprTerm_1= ruleExprTerm )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==37) ) {
                        alt19=1;
                    }
                    else if ( ((LA19_0>=RULE_SYMBOLES && LA19_0<=RULE_VARIABLE)||LA19_0==39) ) {
                        alt19=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1121:5: this_ExprSimple_0= ruleExprSimple
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getEqAccess().getExprSimpleParserRuleCall_0_0_0()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleExprSimple_in_ruleEq2833);
                            this_ExprSimple_0=ruleExprSimple();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_ExprSimple_0);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1133:5: this_ExprTerm_1= ruleExprTerm
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getEqAccess().getExprTermParserRuleCall_0_0_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleExprTerm_in_ruleEq2866);
                            this_ExprTerm_1=ruleExprTerm();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_ExprTerm_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1143:2: (this_LC_2= RULE_LC )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_LC) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1143:7: this_LC_2= RULE_LC
                            {
                            this_LC_2=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleEq2888); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_LC_2);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_LC_2, grammarAccess.getEqAccess().getLCTerminalRuleCall_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,36,FOLLOW_36_in_ruleEq2908); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEqAccess().getEqualsSignQuestionMarkKeyword_0_2()); 
                          
                    }
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1156:1: (this_LC_4= RULE_LC )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_LC) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1156:6: this_LC_4= RULE_LC
                            {
                            this_LC_4=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleEq2924); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_LC_4);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_LC_4, grammarAccess.getEqAccess().getLCTerminalRuleCall_0_3()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1163:3: (this_ExprSimple_5= ruleExprSimple | this_ExprTerm_6= ruleExprTerm )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==37) ) {
                        alt22=1;
                    }
                    else if ( ((LA22_0>=RULE_SYMBOLES && LA22_0<=RULE_VARIABLE)||LA22_0==39) ) {
                        alt22=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1164:5: this_ExprSimple_5= ruleExprSimple
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getEqAccess().getExprSimpleParserRuleCall_0_4_0()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleExprSimple_in_ruleEq2954);
                            this_ExprSimple_5=ruleExprSimple();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_ExprSimple_5);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1176:5: this_ExprTerm_6= ruleExprTerm
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getEqAccess().getExprTermParserRuleCall_0_4_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleExprTerm_in_ruleEq2987);
                            this_ExprTerm_6=ruleExprTerm();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_ExprTerm_6);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1187:6: (kw= '(' (this_ExprTerm_8= ruleExprTerm | this_ExprSimple_9= ruleExprSimple ) kw= ')' )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1187:6: (kw= '(' (this_ExprTerm_8= ruleExprTerm | this_ExprSimple_9= ruleExprSimple ) kw= ')' )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1188:2: kw= '(' (this_ExprTerm_8= ruleExprTerm | this_ExprSimple_9= ruleExprSimple ) kw= ')'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleEq3014); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEqAccess().getLeftParenthesisKeyword_1_0()); 
                          
                    }
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1193:1: (this_ExprTerm_8= ruleExprTerm | this_ExprSimple_9= ruleExprSimple )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( ((LA23_0>=RULE_SYMBOLES && LA23_0<=RULE_VARIABLE)||LA23_0==39) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==37) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1194:5: this_ExprTerm_8= ruleExprTerm
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getEqAccess().getExprTermParserRuleCall_1_1_0()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleExprTerm_in_ruleEq3037);
                            this_ExprTerm_8=ruleExprTerm();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_ExprTerm_8);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1206:5: this_ExprSimple_9= ruleExprSimple
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getEqAccess().getExprSimpleParserRuleCall_1_1_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleExprSimple_in_ruleEq3070);
                            this_ExprSimple_9=ruleExprSimple();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_ExprSimple_9);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }

                    kw=(Token)match(input,38,FOLLOW_38_in_ruleEq3089); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEqAccess().getRightParenthesisKeyword_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEq"


    // $ANTLR start "entryRuleExprTerm"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1230:1: entryRuleExprTerm returns [String current=null] : iv_ruleExprTerm= ruleExprTerm EOF ;
    public final String entryRuleExprTerm() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprTerm = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1231:2: (iv_ruleExprTerm= ruleExprTerm EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1232:2: iv_ruleExprTerm= ruleExprTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprTermRule()); 
            }
            pushFollow(FOLLOW_ruleExprTerm_in_entryRuleExprTerm3131);
            iv_ruleExprTerm=ruleExprTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprTerm.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprTerm3142); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprTerm"


    // $ANTLR start "ruleExprTerm"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1239:1: ruleExprTerm returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'nil' | this_VARIABLE_1= RULE_VARIABLE | this_SYMBOLES_2= RULE_SYMBOLES ) ;
    public final AntlrDatatypeRuleToken ruleExprTerm() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_VARIABLE_1=null;
        Token this_SYMBOLES_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1242:28: ( (kw= 'nil' | this_VARIABLE_1= RULE_VARIABLE | this_SYMBOLES_2= RULE_SYMBOLES ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1243:1: (kw= 'nil' | this_VARIABLE_1= RULE_VARIABLE | this_SYMBOLES_2= RULE_SYMBOLES )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1243:1: (kw= 'nil' | this_VARIABLE_1= RULE_VARIABLE | this_SYMBOLES_2= RULE_SYMBOLES )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt25=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt25=2;
                }
                break;
            case RULE_SYMBOLES:
                {
                alt25=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1244:2: kw= 'nil'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleExprTerm3180); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getExprTermAccess().getNilKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1250:10: this_VARIABLE_1= RULE_VARIABLE
                    {
                    this_VARIABLE_1=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleExprTerm3201); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_VARIABLE_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_VARIABLE_1, grammarAccess.getExprTermAccess().getVARIABLETerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1258:10: this_SYMBOLES_2= RULE_SYMBOLES
                    {
                    this_SYMBOLES_2=(Token)match(input,RULE_SYMBOLES,FOLLOW_RULE_SYMBOLES_in_ruleExprTerm3227); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SYMBOLES_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SYMBOLES_2, grammarAccess.getExprTermAccess().getSYMBOLESTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprTerm"


    // $ANTLR start "entryRuleExprSimple"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1273:1: entryRuleExprSimple returns [String current=null] : iv_ruleExprSimple= ruleExprSimple EOF ;
    public final String entryRuleExprSimple() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleExprSimple = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1274:2: (iv_ruleExprSimple= ruleExprSimple EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1275:2: iv_ruleExprSimple= ruleExprSimple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprSimpleRule()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_entryRuleExprSimple3273);
            iv_ruleExprSimple=ruleExprSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprSimple.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprSimple3284); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprSimple"


    // $ANTLR start "ruleExprSimple"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1282:1: ruleExprSimple returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' ( ( (kw= 'cons' | kw= 'list' ) this_Lexpr_3= ruleLexpr ) | ( (kw= 'hd' | kw= 'tl' ) this_LC_6= RULE_LC this_Expr_7= ruleExpr ) ) kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleExprSimple() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_LC_6=null;
        AntlrDatatypeRuleToken this_Lexpr_3 = null;

        AntlrDatatypeRuleToken this_Expr_7 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1285:28: ( (kw= '(' ( ( (kw= 'cons' | kw= 'list' ) this_Lexpr_3= ruleLexpr ) | ( (kw= 'hd' | kw= 'tl' ) this_LC_6= RULE_LC this_Expr_7= ruleExpr ) ) kw= ')' ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1286:1: (kw= '(' ( ( (kw= 'cons' | kw= 'list' ) this_Lexpr_3= ruleLexpr ) | ( (kw= 'hd' | kw= 'tl' ) this_LC_6= RULE_LC this_Expr_7= ruleExpr ) ) kw= ')' )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1286:1: (kw= '(' ( ( (kw= 'cons' | kw= 'list' ) this_Lexpr_3= ruleLexpr ) | ( (kw= 'hd' | kw= 'tl' ) this_LC_6= RULE_LC this_Expr_7= ruleExpr ) ) kw= ')' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1287:2: kw= '(' ( ( (kw= 'cons' | kw= 'list' ) this_Lexpr_3= ruleLexpr ) | ( (kw= 'hd' | kw= 'tl' ) this_LC_6= RULE_LC this_Expr_7= ruleExpr ) ) kw= ')'
            {
            kw=(Token)match(input,37,FOLLOW_37_in_ruleExprSimple3322); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_0()); 
                  
            }
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1292:1: ( ( (kw= 'cons' | kw= 'list' ) this_Lexpr_3= ruleLexpr ) | ( (kw= 'hd' | kw= 'tl' ) this_LC_6= RULE_LC this_Expr_7= ruleExpr ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=40 && LA28_0<=41)) ) {
                alt28=1;
            }
            else if ( ((LA28_0>=42 && LA28_0<=43)) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1292:2: ( (kw= 'cons' | kw= 'list' ) this_Lexpr_3= ruleLexpr )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1292:2: ( (kw= 'cons' | kw= 'list' ) this_Lexpr_3= ruleLexpr )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1292:3: (kw= 'cons' | kw= 'list' ) this_Lexpr_3= ruleLexpr
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1292:3: (kw= 'cons' | kw= 'list' )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==40) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==41) ) {
                        alt26=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1293:2: kw= 'cons'
                            {
                            kw=(Token)match(input,40,FOLLOW_40_in_ruleExprSimple3338); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getExprSimpleAccess().getConsKeyword_1_0_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1300:2: kw= 'list'
                            {
                            kw=(Token)match(input,41,FOLLOW_41_in_ruleExprSimple3357); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getExprSimpleAccess().getListKeyword_1_0_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprSimpleAccess().getLexprParserRuleCall_1_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLexpr_in_ruleExprSimple3380);
                    this_Lexpr_3=ruleLexpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Lexpr_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1317:6: ( (kw= 'hd' | kw= 'tl' ) this_LC_6= RULE_LC this_Expr_7= ruleExpr )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1317:6: ( (kw= 'hd' | kw= 'tl' ) this_LC_6= RULE_LC this_Expr_7= ruleExpr )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1317:7: (kw= 'hd' | kw= 'tl' ) this_LC_6= RULE_LC this_Expr_7= ruleExpr
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1317:7: (kw= 'hd' | kw= 'tl' )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==42) ) {
                        alt27=1;
                    }
                    else if ( (LA27_0==43) ) {
                        alt27=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1318:2: kw= 'hd'
                            {
                            kw=(Token)match(input,42,FOLLOW_42_in_ruleExprSimple3407); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getExprSimpleAccess().getHdKeyword_1_1_0_0()); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1325:2: kw= 'tl'
                            {
                            kw=(Token)match(input,43,FOLLOW_43_in_ruleExprSimple3426); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      current.merge(kw);
                                      newLeafNode(kw, grammarAccess.getExprSimpleAccess().getTlKeyword_1_1_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    this_LC_6=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleExprSimple3442); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_LC_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_6, grammarAccess.getExprSimpleAccess().getLCTerminalRuleCall_1_1_1()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExprSimpleAccess().getExprParserRuleCall_1_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprSimple3469);
                    this_Expr_7=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Expr_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;

            }

            kw=(Token)match(input,38,FOLLOW_38_in_ruleExprSimple3489); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprSimple"


    // $ANTLR start "entryRuleLexpr"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1362:1: entryRuleLexpr returns [String current=null] : iv_ruleLexpr= ruleLexpr EOF ;
    public final String entryRuleLexpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLexpr = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1363:2: (iv_ruleLexpr= ruleLexpr EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1364:2: iv_ruleLexpr= ruleLexpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLexprRule()); 
            }
            pushFollow(FOLLOW_ruleLexpr_in_entryRuleLexpr3530);
            iv_ruleLexpr=ruleLexpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLexpr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLexpr3541); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLexpr"


    // $ANTLR start "ruleLexpr"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1371:1: ruleLexpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LC_0= RULE_LC this_Expr_1= ruleExpr )+ ;
    public final AntlrDatatypeRuleToken ruleLexpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_LC_0=null;
        AntlrDatatypeRuleToken this_Expr_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1374:28: ( (this_LC_0= RULE_LC this_Expr_1= ruleExpr )+ )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1375:1: (this_LC_0= RULE_LC this_Expr_1= ruleExpr )+
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1375:1: (this_LC_0= RULE_LC this_Expr_1= ruleExpr )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_LC) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1375:6: this_LC_0= RULE_LC this_Expr_1= ruleExpr
            	    {
            	    this_LC_0=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleLexpr3581); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_LC_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LC_0, grammarAccess.getLexprAccess().getLCTerminalRuleCall_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getLexprAccess().getExprParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleExpr_in_ruleLexpr3608);
            	    this_Expr_1=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Expr_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLexpr"

    // $ANTLR start synpred19_InternalMyDsl
    public final void synpred19_InternalMyDsl_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_ExprSimple_0 = null;


        // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:894:5: (this_ExprSimple_0= ruleExprSimple )
        // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:894:5: this_ExprSimple_0= ruleExprSimple
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getExprAccess().getExprSimpleParserRuleCall_0()); 
              
        }
        pushFollow(FOLLOW_ruleExprSimple_in_synpred19_InternalMyDsl2147);
        this_ExprSimple_0=ruleExprSimple();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalMyDsl

    // $ANTLR start synpred20_InternalMyDsl
    public final void synpred20_InternalMyDsl_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_And_1 = null;


        // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:906:5: (this_And_1= ruleAnd )
        // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:906:5: this_And_1= ruleAnd
        {
        if ( state.backtracking==0 ) {
           
                  newCompositeNode(grammarAccess.getExprAccess().getAndParserRuleCall_1()); 
              
        }
        pushFollow(FOLLOW_ruleAnd_in_synpred20_InternalMyDsl2180);
        this_And_1=ruleAnd();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_InternalMyDsl

    // Delegated rules

    public final boolean synpred19_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA15_eotS =
        "\41\uffff";
    static final String DFA15_eofS =
        "\3\uffff\3\16\33\uffff";
    static final String DFA15_minS =
        "\2\5\1\uffff\3\4\4\0\7\uffff\1\0\2\uffff\1\0\10\uffff\1\0\3\uffff";
    static final String DFA15_maxS =
        "\1\47\1\53\1\uffff\3\46\4\0\7\uffff\1\0\2\uffff\1\0\10\uffff\1\0"+
        "\3\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\13\uffff\1\3\21\uffff\1\1";
    static final String DFA15_specialS =
        "\6\uffff\1\0\1\1\1\2\1\3\7\uffff\1\4\2\uffff\1\5\10\uffff\1\6\3"+
        "\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\5\1\4\34\uffff\1\2\1\uffff\1\1\1\uffff\1\3",
            "\2\2\36\uffff\1\2\1\uffff\1\2\1\6\1\7\1\10\1\11",
            "",
            "\1\21\16\uffff\2\16\17\uffff\1\2\1\uffff\1\16",
            "\1\24\16\uffff\2\16\17\uffff\1\2\1\uffff\1\16",
            "\1\35\16\uffff\2\16\17\uffff\1\2\1\uffff\1\16",
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

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "893:1: (this_ExprSimple_0= ruleExprSimple | this_And_1= ruleAnd | this_ExprTerm_2= ruleExprTerm )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_6 = input.LA(1);

                         
                        int index15_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalMyDsl()) ) {s = 32;}

                        else if ( (synpred20_InternalMyDsl()) ) {s = 2;}

                         
                        input.seek(index15_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_7 = input.LA(1);

                         
                        int index15_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalMyDsl()) ) {s = 32;}

                        else if ( (synpred20_InternalMyDsl()) ) {s = 2;}

                         
                        input.seek(index15_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_8 = input.LA(1);

                         
                        int index15_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalMyDsl()) ) {s = 32;}

                        else if ( (synpred20_InternalMyDsl()) ) {s = 2;}

                         
                        input.seek(index15_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA15_9 = input.LA(1);

                         
                        int index15_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalMyDsl()) ) {s = 32;}

                        else if ( (synpred20_InternalMyDsl()) ) {s = 2;}

                         
                        input.seek(index15_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA15_17 = input.LA(1);

                         
                        int index15_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalMyDsl()) ) {s = 2;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_17);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA15_20 = input.LA(1);

                         
                        int index15_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalMyDsl()) ) {s = 2;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_20);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA15_29 = input.LA(1);

                         
                        int index15_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalMyDsl()) ) {s = 2;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index15_29);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA16_eotS =
        "\24\uffff";
    static final String DFA16_eofS =
        "\1\1\3\uffff\1\1\17\uffff";
    static final String DFA16_minS =
        "\1\4\3\uffff\1\5\17\uffff";
    static final String DFA16_maxS =
        "\1\46\3\uffff\1\47\17\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\2\17\uffff\1\1\2\uffff";
    static final String DFA16_specialS =
        "\24\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\4\16\uffff\2\1\21\uffff\1\1",
            "",
            "",
            "",
            "\2\1\12\uffff\1\1\6\uffff\2\1\2\uffff\1\1\1\uffff\3\1\1\21"+
            "\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1",
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

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "()* loopback of 960:1: (this_LC_1= RULE_LC kw= 'and' this_LC_3= RULE_LC this_Or_4= ruleOr )*";
        }
    }
    static final String DFA17_eotS =
        "\25\uffff";
    static final String DFA17_eofS =
        "\2\2\23\uffff";
    static final String DFA17_minS =
        "\1\4\1\5\23\uffff";
    static final String DFA17_maxS =
        "\1\46\1\47\23\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\7\uffff\1\1\12\uffff";
    static final String DFA17_specialS =
        "\25\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1\16\uffff\2\2\21\uffff\1\2",
            "\2\2\12\uffff\1\2\6\uffff\2\2\2\uffff\1\2\1\uffff\4\2\1\12"+
            "\1\2\1\uffff\1\2\1\uffff\1\2",
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
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "()* loopback of 1023:1: (this_LC_1= RULE_LC kw= 'or' this_LC_3= RULE_LC this_Not_4= ruleNot )*";
        }
    }
    static final String DFA24_eotS =
        "\15\uffff";
    static final String DFA24_eofS =
        "\15\uffff";
    static final String DFA24_minS =
        "\2\5\13\uffff";
    static final String DFA24_maxS =
        "\1\47\1\53\13\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\1\6\uffff\1\2\3\uffff";
    static final String DFA24_specialS =
        "\15\uffff}>";
    static final String[] DFA24_transitionS = {
            "\2\2\36\uffff\1\1\1\uffff\1\2",
            "\2\11\36\uffff\1\11\1\uffff\1\11\4\2",
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

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1120:1: ( ( (this_ExprSimple_0= ruleExprSimple | this_ExprTerm_1= ruleExprTerm ) (this_LC_2= RULE_LC )? kw= '=?' (this_LC_4= RULE_LC )? (this_ExprSimple_5= ruleExprSimple | this_ExprTerm_6= ruleExprTerm ) ) | (kw= '(' (this_ExprTerm_8= ruleExprTerm | this_ExprSimple_9= ruleExprSimple ) kw= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel90 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunction_in_ruleModel146 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleModel158 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_rulefunction_in_entryRulefunction196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunction206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulefunction243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_rulefunction254 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SYMBOLES_in_rulefunction270 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulefunction287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_rulefunction298 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleDefiniton_in_rulefunction318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefiniton_in_entryRuleDefiniton354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefiniton364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleDefiniton401 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleDefiniton412 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleInput_in_ruleDefiniton432 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleDefiniton443 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDefiniton454 = new BitSet(new long[]{0x000000002CA00040L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleDefiniton475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleDefiniton486 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleDefiniton497 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDefiniton509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleDefiniton520 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleOutput_in_ruleDefiniton540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleInput628 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleInput647 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleInput663 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleInput685 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutput744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleOutput784 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleOutput803 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleOutput819 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleOutput841 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleCommands_in_entryRuleCommands888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommands898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleCommands944 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleCommands957 = new BitSet(new long[]{0x000000002CA00050L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommands969 = new BitSet(new long[]{0x000000002CA00040L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleCommands991 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleVars_in_entryRuleVars1030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVars1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleVars1081 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleVars1100 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVars_in_ruleVars1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprs_in_entryRuleExprs1170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprs1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprs1228 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleExprs1247 = new BitSet(new long[]{0x000000A800000060L});
    public static final BitSet FOLLOW_ruleExprs_in_ruleExprs1269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand1316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCommand1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_ruleCommand1389 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1400 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCommand1413 = new BitSet(new long[]{0x000000A800000070L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1425 = new BitSet(new long[]{0x000000A800000060L});
    public static final BitSet FOLLOW_ruleExprs_in_ruleCommand1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCommand1464 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1475 = new BitSet(new long[]{0x000000A800000060L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommand1493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1503 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCommand1514 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1525 = new BitSet(new long[]{0x000000002CA00040L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommand1549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1559 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCommand1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCommand1590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1601 = new BitSet(new long[]{0x000000A800000060L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommand1619 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1629 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCommand1640 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1651 = new BitSet(new long[]{0x000000002CA00040L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommand1675 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1685 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCommand1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCommand1716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1727 = new BitSet(new long[]{0x000000A800000060L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommand1745 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1755 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCommand1766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1777 = new BitSet(new long[]{0x000000A800000060L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommand1795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1805 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCommand1816 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1827 = new BitSet(new long[]{0x000000002CA00040L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommand1851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1861 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCommand1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCommand1892 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1903 = new BitSet(new long[]{0x000000A800000060L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommand1921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1931 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleCommand1942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1953 = new BitSet(new long[]{0x000000002CA00040L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommand1973 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1984 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_ruleCommand1996 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand2007 = new BitSet(new long[]{0x000000002CA00040L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommand2027 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand2038 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCommand2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr2089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleExpr2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleExpr2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_ruleExpr2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd2259 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleAnd2317 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleAnd2338 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAnd2356 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleAnd2371 = new BitSet(new long[]{0x000000A800000060L});
    public static final BitSet FOLLOW_ruleOr_in_ruleAnd2398 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr2446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_ruleOr2504 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleOr2525 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleOr2543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleOr2558 = new BitSet(new long[]{0x000000A800000060L});
    public static final BitSet FOLLOW_ruleNot_in_ruleOr2585 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleNot_in_entryRuleNot2633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNot2644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleNot2683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleNot2698 = new BitSet(new long[]{0x000000A800000060L});
    public static final BitSet FOLLOW_ruleEq_in_ruleNot2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEq_in_entryRuleEq2773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEq2784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleEq2833 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_ruleExprTerm_in_ruleEq2866 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleEq2888 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleEq2908 = new BitSet(new long[]{0x000000A000000070L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleEq2924 = new BitSet(new long[]{0x000000A000000060L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleEq2954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_ruleEq2987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleEq3014 = new BitSet(new long[]{0x000000A000000060L});
    public static final BitSet FOLLOW_ruleExprTerm_in_ruleEq3037 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleEq3070 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleEq3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_entryRuleExprTerm3131 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprTerm3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleExprTerm3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleExprTerm3201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOLES_in_ruleExprTerm3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_entryRuleExprSimple3273 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprSimple3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleExprSimple3322 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_40_in_ruleExprSimple3338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_41_in_ruleExprSimple3357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLexpr_in_ruleExprSimple3380 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_42_in_ruleExprSimple3407 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_43_in_ruleExprSimple3426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleExprSimple3442 = new BitSet(new long[]{0x000000A800000060L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprSimple3469 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleExprSimple3489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLexpr_in_entryRuleLexpr3530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLexpr3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleLexpr3581 = new BitSet(new long[]{0x000000A800000060L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleLexpr3608 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleExprSimple_in_synpred19_InternalMyDsl2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_synpred20_InternalMyDsl2180 = new BitSet(new long[]{0x0000000000000002L});

}