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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:84:1: ruleModel returns [EObject current=null] : ( ( (lv_model_0_0= ruleFunction ) ) (this_LC_1= RULE_LC )? )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token this_LC_1=null;
        EObject lv_model_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:87:28: ( ( ( (lv_model_0_0= ruleFunction ) ) (this_LC_1= RULE_LC )? )* )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:88:1: ( ( (lv_model_0_0= ruleFunction ) ) (this_LC_1= RULE_LC )? )*
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:88:1: ( ( (lv_model_0_0= ruleFunction ) ) (this_LC_1= RULE_LC )? )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:88:2: ( (lv_model_0_0= ruleFunction ) ) (this_LC_1= RULE_LC )?
            	    {
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:88:2: ( (lv_model_0_0= ruleFunction ) )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:89:1: (lv_model_0_0= ruleFunction )
            	    {
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:89:1: (lv_model_0_0= ruleFunction )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:90:3: lv_model_0_0= ruleFunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getModelFunctionParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleFunction_in_ruleModel146);
            	    lv_model_0_0=ruleFunction();

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
            	              		"Function");
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


    // $ANTLR start "entryRuleFunction"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:118:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:119:2: (iv_ruleFunction= ruleFunction EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:120:2: iv_ruleFunction= ruleFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleFunction_in_entryRuleFunction196);
            iv_ruleFunction=ruleFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunction206); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:127:1: ruleFunction returns [EObject current=null] : (otherlv_0= 'function' this_LC_1= RULE_LC ( (lv_funName_2_0= RULE_SYMBOLES ) ) otherlv_3= ':' this_LC_4= RULE_LC ( (lv_def_5_0= ruleDefiniton ) ) ) ;
    public final EObject ruleFunction() throws RecognitionException {
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
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleFunction243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
                  
            }
            this_LC_1=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleFunction254); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_LC_1, grammarAccess.getFunctionAccess().getLCTerminalRuleCall_1()); 
                  
            }
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:139:1: ( (lv_funName_2_0= RULE_SYMBOLES ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:140:1: (lv_funName_2_0= RULE_SYMBOLES )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:140:1: (lv_funName_2_0= RULE_SYMBOLES )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:141:3: lv_funName_2_0= RULE_SYMBOLES
            {
            lv_funName_2_0=(Token)match(input,RULE_SYMBOLES,FOLLOW_RULE_SYMBOLES_in_ruleFunction270); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleFunction287); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getColonKeyword_3());
                  
            }
            this_LC_4=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleFunction298); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleDefiniton_in_ruleFunction318);
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
    // $ANTLR end "ruleFunction"


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
        EObject lv_inputVars_2_0 = null;

        EObject lv_commandList_5_0 = null;

        EObject lv_outputVars_10_0 = null;


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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:298:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:299:2: (iv_ruleInput= ruleInput EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:300:2: iv_ruleInput= ruleInput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputRule()); 
            }
            pushFollow(FOLLOW_ruleInput_in_entryRuleInput576);
            iv_ruleInput=ruleInput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInput; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInput586); if (state.failed) return current;

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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:307:1: ruleInput returns [EObject current=null] : ( ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_v2_3_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token lv_v_0_0=null;
        Token otherlv_1=null;
        Token this_LC_2=null;
        Token lv_v2_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:310:28: ( ( ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_v2_3_0= RULE_VARIABLE ) ) )* ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:311:1: ( ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_v2_3_0= RULE_VARIABLE ) ) )* )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:311:1: ( ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_v2_3_0= RULE_VARIABLE ) ) )* )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:311:2: ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_v2_3_0= RULE_VARIABLE ) ) )*
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:311:2: ( (lv_v_0_0= RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:312:1: (lv_v_0_0= RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:312:1: (lv_v_0_0= RULE_VARIABLE )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:313:3: lv_v_0_0= RULE_VARIABLE
            {
            lv_v_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleInput628); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_v_0_0, grammarAccess.getInputAccess().getVVARIABLETerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInputRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"v",
                      		lv_v_0_0, 
                      		"VARIABLE");
              	    
            }

            }


            }

            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:329:2: (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_v2_3_0= RULE_VARIABLE ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:329:4: otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_v2_3_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleInput646); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getInputAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:333:1: (this_LC_2= RULE_LC )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==RULE_LC) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:333:2: this_LC_2= RULE_LC
            	            {
            	            this_LC_2=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleInput658); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LC_2, grammarAccess.getInputAccess().getLCTerminalRuleCall_1_1()); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:337:3: ( (lv_v2_3_0= RULE_VARIABLE ) )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:338:1: (lv_v2_3_0= RULE_VARIABLE )
            	    {
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:338:1: (lv_v2_3_0= RULE_VARIABLE )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:339:3: lv_v2_3_0= RULE_VARIABLE
            	    {
            	    lv_v2_3_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleInput676); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_v2_3_0, grammarAccess.getInputAccess().getV2VARIABLETerminalRuleCall_1_2_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getInputRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"v2",
            	              		lv_v2_3_0, 
            	              		"VARIABLE");
            	      	    
            	    }

            	    }


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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:363:1: entryRuleOutput returns [EObject current=null] : iv_ruleOutput= ruleOutput EOF ;
    public final EObject entryRuleOutput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutput = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:364:2: (iv_ruleOutput= ruleOutput EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:365:2: iv_ruleOutput= ruleOutput EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputRule()); 
            }
            pushFollow(FOLLOW_ruleOutput_in_entryRuleOutput719);
            iv_ruleOutput=ruleOutput();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutput; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOutput729); if (state.failed) return current;

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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:372:1: ruleOutput returns [EObject current=null] : ( ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_v2_3_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleOutput() throws RecognitionException {
        EObject current = null;

        Token lv_v_0_0=null;
        Token otherlv_1=null;
        Token this_LC_2=null;
        Token lv_v2_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:375:28: ( ( ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_v2_3_0= RULE_VARIABLE ) ) )* ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:376:1: ( ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_v2_3_0= RULE_VARIABLE ) ) )* )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:376:1: ( ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_v2_3_0= RULE_VARIABLE ) ) )* )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:376:2: ( (lv_v_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_v2_3_0= RULE_VARIABLE ) ) )*
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:376:2: ( (lv_v_0_0= RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:377:1: (lv_v_0_0= RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:377:1: (lv_v_0_0= RULE_VARIABLE )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:378:3: lv_v_0_0= RULE_VARIABLE
            {
            lv_v_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleOutput771); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_v_0_0, grammarAccess.getOutputAccess().getVVARIABLETerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOutputRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"v",
                      		lv_v_0_0, 
                      		"VARIABLE");
              	    
            }

            }


            }

            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:394:2: (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_v2_3_0= RULE_VARIABLE ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:394:4: otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_v2_3_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleOutput789); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getOutputAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:398:1: (this_LC_2= RULE_LC )?
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==RULE_LC) ) {
            	        alt5=1;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:398:2: this_LC_2= RULE_LC
            	            {
            	            this_LC_2=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleOutput801); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LC_2, grammarAccess.getOutputAccess().getLCTerminalRuleCall_1_1()); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:402:3: ( (lv_v2_3_0= RULE_VARIABLE ) )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:403:1: (lv_v2_3_0= RULE_VARIABLE )
            	    {
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:403:1: (lv_v2_3_0= RULE_VARIABLE )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:404:3: lv_v2_3_0= RULE_VARIABLE
            	    {
            	    lv_v2_3_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleOutput819); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_v2_3_0, grammarAccess.getOutputAccess().getV2VARIABLETerminalRuleCall_1_2_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getOutputRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"v2",
            	              		lv_v2_3_0, 
            	              		"VARIABLE");
            	      	    
            	    }

            	    }


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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:428:1: entryRuleCommands returns [EObject current=null] : iv_ruleCommands= ruleCommands EOF ;
    public final EObject entryRuleCommands() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommands = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:429:2: (iv_ruleCommands= ruleCommands EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:430:2: iv_ruleCommands= ruleCommands EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandsRule()); 
            }
            pushFollow(FOLLOW_ruleCommands_in_entryRuleCommands862);
            iv_ruleCommands=ruleCommands();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommands; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommands872); if (state.failed) return current;

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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:437:1: ruleCommands returns [EObject current=null] : ( ( (lv_c_0_0= ruleCommand ) ) (otherlv_1= ';' (this_LC_2= RULE_LC )? ( (lv_c_3_0= ruleCommand ) ) )* ) ;
    public final EObject ruleCommands() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_LC_2=null;
        EObject lv_c_0_0 = null;

        EObject lv_c_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:440:28: ( ( ( (lv_c_0_0= ruleCommand ) ) (otherlv_1= ';' (this_LC_2= RULE_LC )? ( (lv_c_3_0= ruleCommand ) ) )* ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:441:1: ( ( (lv_c_0_0= ruleCommand ) ) (otherlv_1= ';' (this_LC_2= RULE_LC )? ( (lv_c_3_0= ruleCommand ) ) )* )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:441:1: ( ( (lv_c_0_0= ruleCommand ) ) (otherlv_1= ';' (this_LC_2= RULE_LC )? ( (lv_c_3_0= ruleCommand ) ) )* )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:441:2: ( (lv_c_0_0= ruleCommand ) ) (otherlv_1= ';' (this_LC_2= RULE_LC )? ( (lv_c_3_0= ruleCommand ) ) )*
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:441:2: ( (lv_c_0_0= ruleCommand ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:442:1: (lv_c_0_0= ruleCommand )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:442:1: (lv_c_0_0= ruleCommand )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:443:3: lv_c_0_0= ruleCommand
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommand_in_ruleCommands918);
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

            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:459:2: (otherlv_1= ';' (this_LC_2= RULE_LC )? ( (lv_c_3_0= ruleCommand ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:459:4: otherlv_1= ';' (this_LC_2= RULE_LC )? ( (lv_c_3_0= ruleCommand ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleCommands931); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getCommandsAccess().getSemicolonKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:463:1: (this_LC_2= RULE_LC )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==RULE_LC) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:463:2: this_LC_2= RULE_LC
            	            {
            	            this_LC_2=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommands943); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LC_2, grammarAccess.getCommandsAccess().getLCTerminalRuleCall_1_1()); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:467:3: ( (lv_c_3_0= ruleCommand ) )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:468:1: (lv_c_3_0= ruleCommand )
            	    {
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:468:1: (lv_c_3_0= ruleCommand )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:469:3: lv_c_3_0= ruleCommand
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCommandsAccess().getCCommandParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCommand_in_ruleCommands965);
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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:493:1: entryRuleVars returns [EObject current=null] : iv_ruleVars= ruleVars EOF ;
    public final EObject entryRuleVars() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVars = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:494:2: (iv_ruleVars= ruleVars EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:495:2: iv_ruleVars= ruleVars EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarsRule()); 
            }
            pushFollow(FOLLOW_ruleVars_in_entryRuleVars1003);
            iv_ruleVars=ruleVars();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVars; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVars1013); if (state.failed) return current;

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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:502:1: ruleVars returns [EObject current=null] : ( ( (lv_v1_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_v2_3_0= RULE_VARIABLE ) ) )* ) ;
    public final EObject ruleVars() throws RecognitionException {
        EObject current = null;

        Token lv_v1_0_0=null;
        Token otherlv_1=null;
        Token this_LC_2=null;
        Token lv_v2_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:505:28: ( ( ( (lv_v1_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_v2_3_0= RULE_VARIABLE ) ) )* ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:506:1: ( ( (lv_v1_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_v2_3_0= RULE_VARIABLE ) ) )* )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:506:1: ( ( (lv_v1_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_v2_3_0= RULE_VARIABLE ) ) )* )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:506:2: ( (lv_v1_0_0= RULE_VARIABLE ) ) (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_v2_3_0= RULE_VARIABLE ) ) )*
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:506:2: ( (lv_v1_0_0= RULE_VARIABLE ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:507:1: (lv_v1_0_0= RULE_VARIABLE )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:507:1: (lv_v1_0_0= RULE_VARIABLE )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:508:3: lv_v1_0_0= RULE_VARIABLE
            {
            lv_v1_0_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleVars1055); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_v1_0_0, grammarAccess.getVarsAccess().getV1VARIABLETerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVarsRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"v1",
                      		lv_v1_0_0, 
                      		"VARIABLE");
              	    
            }

            }


            }

            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:524:2: (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_v2_3_0= RULE_VARIABLE ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==19) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:524:4: otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_v2_3_0= RULE_VARIABLE ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleVars1073); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getVarsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:528:1: (this_LC_2= RULE_LC )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==RULE_LC) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:528:2: this_LC_2= RULE_LC
            	            {
            	            this_LC_2=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleVars1085); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LC_2, grammarAccess.getVarsAccess().getLCTerminalRuleCall_1_1()); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:532:3: ( (lv_v2_3_0= RULE_VARIABLE ) )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:533:1: (lv_v2_3_0= RULE_VARIABLE )
            	    {
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:533:1: (lv_v2_3_0= RULE_VARIABLE )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:534:3: lv_v2_3_0= RULE_VARIABLE
            	    {
            	    lv_v2_3_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleVars1103); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(lv_v2_3_0, grammarAccess.getVarsAccess().getV2VARIABLETerminalRuleCall_1_2_0()); 
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getVarsRule());
            	      	        }
            	             		addWithLastConsumed(
            	             			current, 
            	             			"v2",
            	              		lv_v2_3_0, 
            	              		"VARIABLE");
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleVars"


    // $ANTLR start "entryRuleExprs"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:558:1: entryRuleExprs returns [EObject current=null] : iv_ruleExprs= ruleExprs EOF ;
    public final EObject entryRuleExprs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprs = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:559:2: (iv_ruleExprs= ruleExprs EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:560:2: iv_ruleExprs= ruleExprs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprsRule()); 
            }
            pushFollow(FOLLOW_ruleExprs_in_entryRuleExprs1146);
            iv_ruleExprs=ruleExprs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprs; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprs1156); if (state.failed) return current;

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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:567:1: ruleExprs returns [EObject current=null] : ( ( (lv_exp_0_0= ruleExpr ) ) (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_expL_3_0= ruleExpr ) ) )* ) ;
    public final EObject ruleExprs() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_LC_2=null;
        EObject lv_exp_0_0 = null;

        EObject lv_expL_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:570:28: ( ( ( (lv_exp_0_0= ruleExpr ) ) (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_expL_3_0= ruleExpr ) ) )* ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:571:1: ( ( (lv_exp_0_0= ruleExpr ) ) (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_expL_3_0= ruleExpr ) ) )* )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:571:1: ( ( (lv_exp_0_0= ruleExpr ) ) (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_expL_3_0= ruleExpr ) ) )* )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:571:2: ( (lv_exp_0_0= ruleExpr ) ) (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_expL_3_0= ruleExpr ) ) )*
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:571:2: ( (lv_exp_0_0= ruleExpr ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:572:1: (lv_exp_0_0= ruleExpr )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:572:1: (lv_exp_0_0= ruleExpr )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:573:3: lv_exp_0_0= ruleExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExprsAccess().getExpExprParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpr_in_ruleExprs1202);
            lv_exp_0_0=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExprsRule());
              	        }
                     		set(
                     			current, 
                     			"exp",
                      		lv_exp_0_0, 
                      		"Expr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:589:2: (otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_expL_3_0= ruleExpr ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==19) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:589:4: otherlv_1= ',' (this_LC_2= RULE_LC )? ( (lv_expL_3_0= ruleExpr ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleExprs1215); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getExprsAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:593:1: (this_LC_2= RULE_LC )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==RULE_LC) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:593:2: this_LC_2= RULE_LC
            	            {
            	            this_LC_2=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleExprs1227); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {
            	               
            	                  newLeafNode(this_LC_2, grammarAccess.getExprsAccess().getLCTerminalRuleCall_1_1()); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:597:3: ( (lv_expL_3_0= ruleExpr ) )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:598:1: (lv_expL_3_0= ruleExpr )
            	    {
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:598:1: (lv_expL_3_0= ruleExpr )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:599:3: lv_expL_3_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExprsAccess().getExpLExprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpr_in_ruleExprs1249);
            	    lv_expL_3_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExprsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expL",
            	              		lv_expL_3_0, 
            	              		"Expr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleExprs"


    // $ANTLR start "entryRuleCommand"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:623:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:624:2: (iv_ruleCommand= ruleCommand EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:625:2: iv_ruleCommand= ruleCommand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommandRule()); 
            }
            pushFollow(FOLLOW_ruleCommand_in_entryRuleCommand1287);
            iv_ruleCommand=ruleCommand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommand; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommand1297); if (state.failed) return current;

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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:632:1: ruleCommand returns [EObject current=null] : ( ( () otherlv_1= 'nop' ) | ( ( (lv_varL_2_0= ruleVars ) ) (this_LC_3= RULE_LC )? otherlv_4= ':=' (this_LC_5= RULE_LC )? ( (lv_expL_6_0= ruleExprs ) ) ) | ( ( (lv_nom_7_0= 'while' ) ) this_LC_8= RULE_LC ( (lv_exp_9_0= ruleExpr ) ) this_LC_10= RULE_LC otherlv_11= 'do' this_LC_12= RULE_LC ( (lv_c1_13_0= ruleCommands ) ) this_LC_14= RULE_LC otherlv_15= 'od' ) | ( ( (lv_nom_16_0= 'for' ) ) this_LC_17= RULE_LC ( (lv_exp_18_0= ruleExpr ) ) this_LC_19= RULE_LC otherlv_20= 'do' this_LC_21= RULE_LC ( (lv_c1_22_0= ruleCommands ) ) this_LC_23= RULE_LC otherlv_24= 'od' ) | ( ( (lv_nom_25_0= 'foreach' ) ) this_LC_26= RULE_LC ( (lv_exp1_27_0= ruleExpr ) ) this_LC_28= RULE_LC otherlv_29= 'in' this_LC_30= RULE_LC ( (lv_exp2_31_0= ruleExpr ) ) this_LC_32= RULE_LC otherlv_33= 'do' this_LC_34= RULE_LC ( (lv_c1_35_0= ruleCommands ) ) this_LC_36= RULE_LC otherlv_37= 'od' ) | ( ( (lv_nom_38_0= 'if' ) ) this_LC_39= RULE_LC ( (lv_exp_40_0= ruleExpr ) ) this_LC_41= RULE_LC otherlv_42= 'then' this_LC_43= RULE_LC ( (lv_c1_44_0= ruleCommands ) ) this_LC_45= RULE_LC (otherlv_46= 'else' this_LC_47= RULE_LC ( (lv_c2_48_0= ruleCommands ) ) this_LC_49= RULE_LC )? otherlv_50= 'fi' ) ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_LC_3=null;
        Token otherlv_4=null;
        Token this_LC_5=null;
        Token lv_nom_7_0=null;
        Token this_LC_8=null;
        Token this_LC_10=null;
        Token otherlv_11=null;
        Token this_LC_12=null;
        Token this_LC_14=null;
        Token otherlv_15=null;
        Token lv_nom_16_0=null;
        Token this_LC_17=null;
        Token this_LC_19=null;
        Token otherlv_20=null;
        Token this_LC_21=null;
        Token this_LC_23=null;
        Token otherlv_24=null;
        Token lv_nom_25_0=null;
        Token this_LC_26=null;
        Token this_LC_28=null;
        Token otherlv_29=null;
        Token this_LC_30=null;
        Token this_LC_32=null;
        Token otherlv_33=null;
        Token this_LC_34=null;
        Token this_LC_36=null;
        Token otherlv_37=null;
        Token lv_nom_38_0=null;
        Token this_LC_39=null;
        Token this_LC_41=null;
        Token otherlv_42=null;
        Token this_LC_43=null;
        Token this_LC_45=null;
        Token otherlv_46=null;
        Token this_LC_47=null;
        Token this_LC_49=null;
        Token otherlv_50=null;
        EObject lv_varL_2_0 = null;

        EObject lv_expL_6_0 = null;

        EObject lv_exp_9_0 = null;

        EObject lv_c1_13_0 = null;

        EObject lv_exp_18_0 = null;

        EObject lv_c1_22_0 = null;

        EObject lv_exp1_27_0 = null;

        EObject lv_exp2_31_0 = null;

        EObject lv_c1_35_0 = null;

        EObject lv_exp_40_0 = null;

        EObject lv_c1_44_0 = null;

        EObject lv_c2_48_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:635:28: ( ( ( () otherlv_1= 'nop' ) | ( ( (lv_varL_2_0= ruleVars ) ) (this_LC_3= RULE_LC )? otherlv_4= ':=' (this_LC_5= RULE_LC )? ( (lv_expL_6_0= ruleExprs ) ) ) | ( ( (lv_nom_7_0= 'while' ) ) this_LC_8= RULE_LC ( (lv_exp_9_0= ruleExpr ) ) this_LC_10= RULE_LC otherlv_11= 'do' this_LC_12= RULE_LC ( (lv_c1_13_0= ruleCommands ) ) this_LC_14= RULE_LC otherlv_15= 'od' ) | ( ( (lv_nom_16_0= 'for' ) ) this_LC_17= RULE_LC ( (lv_exp_18_0= ruleExpr ) ) this_LC_19= RULE_LC otherlv_20= 'do' this_LC_21= RULE_LC ( (lv_c1_22_0= ruleCommands ) ) this_LC_23= RULE_LC otherlv_24= 'od' ) | ( ( (lv_nom_25_0= 'foreach' ) ) this_LC_26= RULE_LC ( (lv_exp1_27_0= ruleExpr ) ) this_LC_28= RULE_LC otherlv_29= 'in' this_LC_30= RULE_LC ( (lv_exp2_31_0= ruleExpr ) ) this_LC_32= RULE_LC otherlv_33= 'do' this_LC_34= RULE_LC ( (lv_c1_35_0= ruleCommands ) ) this_LC_36= RULE_LC otherlv_37= 'od' ) | ( ( (lv_nom_38_0= 'if' ) ) this_LC_39= RULE_LC ( (lv_exp_40_0= ruleExpr ) ) this_LC_41= RULE_LC otherlv_42= 'then' this_LC_43= RULE_LC ( (lv_c1_44_0= ruleCommands ) ) this_LC_45= RULE_LC (otherlv_46= 'else' this_LC_47= RULE_LC ( (lv_c2_48_0= ruleCommands ) ) this_LC_49= RULE_LC )? otherlv_50= 'fi' ) ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:636:1: ( ( () otherlv_1= 'nop' ) | ( ( (lv_varL_2_0= ruleVars ) ) (this_LC_3= RULE_LC )? otherlv_4= ':=' (this_LC_5= RULE_LC )? ( (lv_expL_6_0= ruleExprs ) ) ) | ( ( (lv_nom_7_0= 'while' ) ) this_LC_8= RULE_LC ( (lv_exp_9_0= ruleExpr ) ) this_LC_10= RULE_LC otherlv_11= 'do' this_LC_12= RULE_LC ( (lv_c1_13_0= ruleCommands ) ) this_LC_14= RULE_LC otherlv_15= 'od' ) | ( ( (lv_nom_16_0= 'for' ) ) this_LC_17= RULE_LC ( (lv_exp_18_0= ruleExpr ) ) this_LC_19= RULE_LC otherlv_20= 'do' this_LC_21= RULE_LC ( (lv_c1_22_0= ruleCommands ) ) this_LC_23= RULE_LC otherlv_24= 'od' ) | ( ( (lv_nom_25_0= 'foreach' ) ) this_LC_26= RULE_LC ( (lv_exp1_27_0= ruleExpr ) ) this_LC_28= RULE_LC otherlv_29= 'in' this_LC_30= RULE_LC ( (lv_exp2_31_0= ruleExpr ) ) this_LC_32= RULE_LC otherlv_33= 'do' this_LC_34= RULE_LC ( (lv_c1_35_0= ruleCommands ) ) this_LC_36= RULE_LC otherlv_37= 'od' ) | ( ( (lv_nom_38_0= 'if' ) ) this_LC_39= RULE_LC ( (lv_exp_40_0= ruleExpr ) ) this_LC_41= RULE_LC otherlv_42= 'then' this_LC_43= RULE_LC ( (lv_c1_44_0= ruleCommands ) ) this_LC_45= RULE_LC (otherlv_46= 'else' this_LC_47= RULE_LC ( (lv_c2_48_0= ruleCommands ) ) this_LC_49= RULE_LC )? otherlv_50= 'fi' ) )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:636:1: ( ( () otherlv_1= 'nop' ) | ( ( (lv_varL_2_0= ruleVars ) ) (this_LC_3= RULE_LC )? otherlv_4= ':=' (this_LC_5= RULE_LC )? ( (lv_expL_6_0= ruleExprs ) ) ) | ( ( (lv_nom_7_0= 'while' ) ) this_LC_8= RULE_LC ( (lv_exp_9_0= ruleExpr ) ) this_LC_10= RULE_LC otherlv_11= 'do' this_LC_12= RULE_LC ( (lv_c1_13_0= ruleCommands ) ) this_LC_14= RULE_LC otherlv_15= 'od' ) | ( ( (lv_nom_16_0= 'for' ) ) this_LC_17= RULE_LC ( (lv_exp_18_0= ruleExpr ) ) this_LC_19= RULE_LC otherlv_20= 'do' this_LC_21= RULE_LC ( (lv_c1_22_0= ruleCommands ) ) this_LC_23= RULE_LC otherlv_24= 'od' ) | ( ( (lv_nom_25_0= 'foreach' ) ) this_LC_26= RULE_LC ( (lv_exp1_27_0= ruleExpr ) ) this_LC_28= RULE_LC otherlv_29= 'in' this_LC_30= RULE_LC ( (lv_exp2_31_0= ruleExpr ) ) this_LC_32= RULE_LC otherlv_33= 'do' this_LC_34= RULE_LC ( (lv_c1_35_0= ruleCommands ) ) this_LC_36= RULE_LC otherlv_37= 'od' ) | ( ( (lv_nom_38_0= 'if' ) ) this_LC_39= RULE_LC ( (lv_exp_40_0= ruleExpr ) ) this_LC_41= RULE_LC otherlv_42= 'then' this_LC_43= RULE_LC ( (lv_c1_44_0= ruleCommands ) ) this_LC_45= RULE_LC (otherlv_46= 'else' this_LC_47= RULE_LC ( (lv_c2_48_0= ruleCommands ) ) this_LC_49= RULE_LC )? otherlv_50= 'fi' ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt16=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt16=2;
                }
                break;
            case 23:
                {
                alt16=3;
                }
                break;
            case 26:
                {
                alt16=4;
                }
                break;
            case 27:
                {
                alt16=5;
                }
                break;
            case 29:
                {
                alt16=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:636:2: ( () otherlv_1= 'nop' )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:636:2: ( () otherlv_1= 'nop' )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:636:3: () otherlv_1= 'nop'
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:636:3: ()
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:637:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getCommandAccess().getCommandAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleCommand1347); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getCommandAccess().getNopKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:650:6: ( ( (lv_varL_2_0= ruleVars ) ) (this_LC_3= RULE_LC )? otherlv_4= ':=' (this_LC_5= RULE_LC )? ( (lv_expL_6_0= ruleExprs ) ) )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:650:6: ( ( (lv_varL_2_0= ruleVars ) ) (this_LC_3= RULE_LC )? otherlv_4= ':=' (this_LC_5= RULE_LC )? ( (lv_expL_6_0= ruleExprs ) ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:650:7: ( (lv_varL_2_0= ruleVars ) ) (this_LC_3= RULE_LC )? otherlv_4= ':=' (this_LC_5= RULE_LC )? ( (lv_expL_6_0= ruleExprs ) )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:650:7: ( (lv_varL_2_0= ruleVars ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:651:1: (lv_varL_2_0= ruleVars )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:651:1: (lv_varL_2_0= ruleVars )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:652:3: lv_varL_2_0= ruleVars
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getVarLVarsParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleVars_in_ruleCommand1376);
                    lv_varL_2_0=ruleVars();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"varL",
                              		lv_varL_2_0, 
                              		"Vars");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:668:2: (this_LC_3= RULE_LC )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_LC) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:668:3: this_LC_3= RULE_LC
                            {
                            this_LC_3=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1388); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_LC_3, grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_1()); 
                                  
                            }

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleCommand1401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getCommandAccess().getColonEqualsSignKeyword_1_2());
                          
                    }
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:676:1: (this_LC_5= RULE_LC )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_LC) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:676:2: this_LC_5= RULE_LC
                            {
                            this_LC_5=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1413); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_LC_5, grammarAccess.getCommandAccess().getLCTerminalRuleCall_1_3()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:680:3: ( (lv_expL_6_0= ruleExprs ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:681:1: (lv_expL_6_0= ruleExprs )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:681:1: (lv_expL_6_0= ruleExprs )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:682:3: lv_expL_6_0= ruleExprs
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getExpLExprsParserRuleCall_1_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprs_in_ruleCommand1435);
                    lv_expL_6_0=ruleExprs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"expL",
                              		lv_expL_6_0, 
                              		"Exprs");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:699:6: ( ( (lv_nom_7_0= 'while' ) ) this_LC_8= RULE_LC ( (lv_exp_9_0= ruleExpr ) ) this_LC_10= RULE_LC otherlv_11= 'do' this_LC_12= RULE_LC ( (lv_c1_13_0= ruleCommands ) ) this_LC_14= RULE_LC otherlv_15= 'od' )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:699:6: ( ( (lv_nom_7_0= 'while' ) ) this_LC_8= RULE_LC ( (lv_exp_9_0= ruleExpr ) ) this_LC_10= RULE_LC otherlv_11= 'do' this_LC_12= RULE_LC ( (lv_c1_13_0= ruleCommands ) ) this_LC_14= RULE_LC otherlv_15= 'od' )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:699:7: ( (lv_nom_7_0= 'while' ) ) this_LC_8= RULE_LC ( (lv_exp_9_0= ruleExpr ) ) this_LC_10= RULE_LC otherlv_11= 'do' this_LC_12= RULE_LC ( (lv_c1_13_0= ruleCommands ) ) this_LC_14= RULE_LC otherlv_15= 'od'
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:699:7: ( (lv_nom_7_0= 'while' ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:700:1: (lv_nom_7_0= 'while' )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:700:1: (lv_nom_7_0= 'while' )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:701:3: lv_nom_7_0= 'while'
                    {
                    lv_nom_7_0=(Token)match(input,23,FOLLOW_23_in_ruleCommand1461); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_nom_7_0, grammarAccess.getCommandAccess().getNomWhileKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCommandRule());
                      	        }
                             		setWithLastConsumed(current, "nom", lv_nom_7_0, "while");
                      	    
                    }

                    }


                    }

                    this_LC_8=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1485); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_8, grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_1()); 
                          
                    }
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:718:1: ( (lv_exp_9_0= ruleExpr ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:719:1: (lv_exp_9_0= ruleExpr )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:719:1: (lv_exp_9_0= ruleExpr )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:720:3: lv_exp_9_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getExpExprParserRuleCall_2_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleCommand1505);
                    lv_exp_9_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"exp",
                              		lv_exp_9_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_LC_10=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1516); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_10, grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_3()); 
                          
                    }
                    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleCommand1527); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getCommandAccess().getDoKeyword_2_4());
                          
                    }
                    this_LC_12=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1538); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_12, grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_5()); 
                          
                    }
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:748:1: ( (lv_c1_13_0= ruleCommands ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:749:1: (lv_c1_13_0= ruleCommands )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:749:1: (lv_c1_13_0= ruleCommands )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:750:3: lv_c1_13_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_2_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCommands_in_ruleCommand1558);
                    lv_c1_13_0=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"c1",
                              		lv_c1_13_0, 
                              		"Commands");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_LC_14=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1569); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_14, grammarAccess.getCommandAccess().getLCTerminalRuleCall_2_7()); 
                          
                    }
                    otherlv_15=(Token)match(input,25,FOLLOW_25_in_ruleCommand1580); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getCommandAccess().getOdKeyword_2_8());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:775:6: ( ( (lv_nom_16_0= 'for' ) ) this_LC_17= RULE_LC ( (lv_exp_18_0= ruleExpr ) ) this_LC_19= RULE_LC otherlv_20= 'do' this_LC_21= RULE_LC ( (lv_c1_22_0= ruleCommands ) ) this_LC_23= RULE_LC otherlv_24= 'od' )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:775:6: ( ( (lv_nom_16_0= 'for' ) ) this_LC_17= RULE_LC ( (lv_exp_18_0= ruleExpr ) ) this_LC_19= RULE_LC otherlv_20= 'do' this_LC_21= RULE_LC ( (lv_c1_22_0= ruleCommands ) ) this_LC_23= RULE_LC otherlv_24= 'od' )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:775:7: ( (lv_nom_16_0= 'for' ) ) this_LC_17= RULE_LC ( (lv_exp_18_0= ruleExpr ) ) this_LC_19= RULE_LC otherlv_20= 'do' this_LC_21= RULE_LC ( (lv_c1_22_0= ruleCommands ) ) this_LC_23= RULE_LC otherlv_24= 'od'
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:775:7: ( (lv_nom_16_0= 'for' ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:776:1: (lv_nom_16_0= 'for' )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:776:1: (lv_nom_16_0= 'for' )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:777:3: lv_nom_16_0= 'for'
                    {
                    lv_nom_16_0=(Token)match(input,26,FOLLOW_26_in_ruleCommand1606); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_nom_16_0, grammarAccess.getCommandAccess().getNomForKeyword_3_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCommandRule());
                      	        }
                             		setWithLastConsumed(current, "nom", lv_nom_16_0, "for");
                      	    
                    }

                    }


                    }

                    this_LC_17=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1630); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_17, grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_1()); 
                          
                    }
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:794:1: ( (lv_exp_18_0= ruleExpr ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:795:1: (lv_exp_18_0= ruleExpr )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:795:1: (lv_exp_18_0= ruleExpr )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:796:3: lv_exp_18_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getExpExprParserRuleCall_3_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleCommand1650);
                    lv_exp_18_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"exp",
                              		lv_exp_18_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_LC_19=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1661); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_19, grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_3()); 
                          
                    }
                    otherlv_20=(Token)match(input,24,FOLLOW_24_in_ruleCommand1672); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getCommandAccess().getDoKeyword_3_4());
                          
                    }
                    this_LC_21=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1683); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_21, grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_5()); 
                          
                    }
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:824:1: ( (lv_c1_22_0= ruleCommands ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:825:1: (lv_c1_22_0= ruleCommands )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:825:1: (lv_c1_22_0= ruleCommands )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:826:3: lv_c1_22_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_3_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCommands_in_ruleCommand1703);
                    lv_c1_22_0=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"c1",
                              		lv_c1_22_0, 
                              		"Commands");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_LC_23=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1714); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_23, grammarAccess.getCommandAccess().getLCTerminalRuleCall_3_7()); 
                          
                    }
                    otherlv_24=(Token)match(input,25,FOLLOW_25_in_ruleCommand1725); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getCommandAccess().getOdKeyword_3_8());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:851:6: ( ( (lv_nom_25_0= 'foreach' ) ) this_LC_26= RULE_LC ( (lv_exp1_27_0= ruleExpr ) ) this_LC_28= RULE_LC otherlv_29= 'in' this_LC_30= RULE_LC ( (lv_exp2_31_0= ruleExpr ) ) this_LC_32= RULE_LC otherlv_33= 'do' this_LC_34= RULE_LC ( (lv_c1_35_0= ruleCommands ) ) this_LC_36= RULE_LC otherlv_37= 'od' )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:851:6: ( ( (lv_nom_25_0= 'foreach' ) ) this_LC_26= RULE_LC ( (lv_exp1_27_0= ruleExpr ) ) this_LC_28= RULE_LC otherlv_29= 'in' this_LC_30= RULE_LC ( (lv_exp2_31_0= ruleExpr ) ) this_LC_32= RULE_LC otherlv_33= 'do' this_LC_34= RULE_LC ( (lv_c1_35_0= ruleCommands ) ) this_LC_36= RULE_LC otherlv_37= 'od' )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:851:7: ( (lv_nom_25_0= 'foreach' ) ) this_LC_26= RULE_LC ( (lv_exp1_27_0= ruleExpr ) ) this_LC_28= RULE_LC otherlv_29= 'in' this_LC_30= RULE_LC ( (lv_exp2_31_0= ruleExpr ) ) this_LC_32= RULE_LC otherlv_33= 'do' this_LC_34= RULE_LC ( (lv_c1_35_0= ruleCommands ) ) this_LC_36= RULE_LC otherlv_37= 'od'
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:851:7: ( (lv_nom_25_0= 'foreach' ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:852:1: (lv_nom_25_0= 'foreach' )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:852:1: (lv_nom_25_0= 'foreach' )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:853:3: lv_nom_25_0= 'foreach'
                    {
                    lv_nom_25_0=(Token)match(input,27,FOLLOW_27_in_ruleCommand1751); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_nom_25_0, grammarAccess.getCommandAccess().getNomForeachKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCommandRule());
                      	        }
                             		setWithLastConsumed(current, "nom", lv_nom_25_0, "foreach");
                      	    
                    }

                    }


                    }

                    this_LC_26=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1775); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_26, grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_1()); 
                          
                    }
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:870:1: ( (lv_exp1_27_0= ruleExpr ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:871:1: (lv_exp1_27_0= ruleExpr )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:871:1: (lv_exp1_27_0= ruleExpr )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:872:3: lv_exp1_27_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getExp1ExprParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleCommand1795);
                    lv_exp1_27_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"exp1",
                              		lv_exp1_27_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_LC_28=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1806); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_28, grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_3()); 
                          
                    }
                    otherlv_29=(Token)match(input,28,FOLLOW_28_in_ruleCommand1817); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_29, grammarAccess.getCommandAccess().getInKeyword_4_4());
                          
                    }
                    this_LC_30=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1828); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_30, grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_5()); 
                          
                    }
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:900:1: ( (lv_exp2_31_0= ruleExpr ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:901:1: (lv_exp2_31_0= ruleExpr )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:901:1: (lv_exp2_31_0= ruleExpr )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:902:3: lv_exp2_31_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getExp2ExprParserRuleCall_4_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleCommand1848);
                    lv_exp2_31_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"exp2",
                              		lv_exp2_31_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_LC_32=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1859); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_32, grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_7()); 
                          
                    }
                    otherlv_33=(Token)match(input,24,FOLLOW_24_in_ruleCommand1870); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_33, grammarAccess.getCommandAccess().getDoKeyword_4_8());
                          
                    }
                    this_LC_34=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1881); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_34, grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_9()); 
                          
                    }
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:930:1: ( (lv_c1_35_0= ruleCommands ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:931:1: (lv_c1_35_0= ruleCommands )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:931:1: (lv_c1_35_0= ruleCommands )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:932:3: lv_c1_35_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_4_10_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCommands_in_ruleCommand1901);
                    lv_c1_35_0=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"c1",
                              		lv_c1_35_0, 
                              		"Commands");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_LC_36=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1912); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_36, grammarAccess.getCommandAccess().getLCTerminalRuleCall_4_11()); 
                          
                    }
                    otherlv_37=(Token)match(input,25,FOLLOW_25_in_ruleCommand1923); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_37, grammarAccess.getCommandAccess().getOdKeyword_4_12());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:957:6: ( ( (lv_nom_38_0= 'if' ) ) this_LC_39= RULE_LC ( (lv_exp_40_0= ruleExpr ) ) this_LC_41= RULE_LC otherlv_42= 'then' this_LC_43= RULE_LC ( (lv_c1_44_0= ruleCommands ) ) this_LC_45= RULE_LC (otherlv_46= 'else' this_LC_47= RULE_LC ( (lv_c2_48_0= ruleCommands ) ) this_LC_49= RULE_LC )? otherlv_50= 'fi' )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:957:6: ( ( (lv_nom_38_0= 'if' ) ) this_LC_39= RULE_LC ( (lv_exp_40_0= ruleExpr ) ) this_LC_41= RULE_LC otherlv_42= 'then' this_LC_43= RULE_LC ( (lv_c1_44_0= ruleCommands ) ) this_LC_45= RULE_LC (otherlv_46= 'else' this_LC_47= RULE_LC ( (lv_c2_48_0= ruleCommands ) ) this_LC_49= RULE_LC )? otherlv_50= 'fi' )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:957:7: ( (lv_nom_38_0= 'if' ) ) this_LC_39= RULE_LC ( (lv_exp_40_0= ruleExpr ) ) this_LC_41= RULE_LC otherlv_42= 'then' this_LC_43= RULE_LC ( (lv_c1_44_0= ruleCommands ) ) this_LC_45= RULE_LC (otherlv_46= 'else' this_LC_47= RULE_LC ( (lv_c2_48_0= ruleCommands ) ) this_LC_49= RULE_LC )? otherlv_50= 'fi'
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:957:7: ( (lv_nom_38_0= 'if' ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:958:1: (lv_nom_38_0= 'if' )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:958:1: (lv_nom_38_0= 'if' )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:959:3: lv_nom_38_0= 'if'
                    {
                    lv_nom_38_0=(Token)match(input,29,FOLLOW_29_in_ruleCommand1949); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_nom_38_0, grammarAccess.getCommandAccess().getNomIfKeyword_5_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getCommandRule());
                      	        }
                             		setWithLastConsumed(current, "nom", lv_nom_38_0, "if");
                      	    
                    }

                    }


                    }

                    this_LC_39=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand1973); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_39, grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_1()); 
                          
                    }
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:976:1: ( (lv_exp_40_0= ruleExpr ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:977:1: (lv_exp_40_0= ruleExpr )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:977:1: (lv_exp_40_0= ruleExpr )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:978:3: lv_exp_40_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getExpExprParserRuleCall_5_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleCommand1993);
                    lv_exp_40_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"exp",
                              		lv_exp_40_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_LC_41=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand2004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_41, grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_3()); 
                          
                    }
                    otherlv_42=(Token)match(input,30,FOLLOW_30_in_ruleCommand2015); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_42, grammarAccess.getCommandAccess().getThenKeyword_5_4());
                          
                    }
                    this_LC_43=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand2026); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_43, grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_5()); 
                          
                    }
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1006:1: ( (lv_c1_44_0= ruleCommands ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1007:1: (lv_c1_44_0= ruleCommands )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1007:1: (lv_c1_44_0= ruleCommands )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1008:3: lv_c1_44_0= ruleCommands
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCommandAccess().getC1CommandsParserRuleCall_5_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCommands_in_ruleCommand2046);
                    lv_c1_44_0=ruleCommands();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCommandRule());
                      	        }
                             		set(
                             			current, 
                             			"c1",
                              		lv_c1_44_0, 
                              		"Commands");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    this_LC_45=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand2057); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_45, grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_7()); 
                          
                    }
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1028:1: (otherlv_46= 'else' this_LC_47= RULE_LC ( (lv_c2_48_0= ruleCommands ) ) this_LC_49= RULE_LC )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==31) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1028:3: otherlv_46= 'else' this_LC_47= RULE_LC ( (lv_c2_48_0= ruleCommands ) ) this_LC_49= RULE_LC
                            {
                            otherlv_46=(Token)match(input,31,FOLLOW_31_in_ruleCommand2069); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_46, grammarAccess.getCommandAccess().getElseKeyword_5_8_0());
                                  
                            }
                            this_LC_47=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand2080); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_LC_47, grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_8_1()); 
                                  
                            }
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1036:1: ( (lv_c2_48_0= ruleCommands ) )
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1037:1: (lv_c2_48_0= ruleCommands )
                            {
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1037:1: (lv_c2_48_0= ruleCommands )
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1038:3: lv_c2_48_0= ruleCommands
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getCommandAccess().getC2CommandsParserRuleCall_5_8_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleCommands_in_ruleCommand2100);
                            lv_c2_48_0=ruleCommands();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getCommandRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"c2",
                                      		lv_c2_48_0, 
                                      		"Commands");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            this_LC_49=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleCommand2111); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_LC_49, grammarAccess.getCommandAccess().getLCTerminalRuleCall_5_8_3()); 
                                  
                            }

                            }
                            break;

                    }

                    otherlv_50=(Token)match(input,32,FOLLOW_32_in_ruleCommand2124); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_50, grammarAccess.getCommandAccess().getFiKeyword_5_9());
                          
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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1070:1: entryRuleExpr returns [EObject current=null] : iv_ruleExpr= ruleExpr EOF ;
    public final EObject entryRuleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpr = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1071:2: (iv_ruleExpr= ruleExpr EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1072:2: iv_ruleExpr= ruleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleExpr_in_entryRuleExpr2161);
            iv_ruleExpr=ruleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpr2171); if (state.failed) return current;

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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1079:1: ruleExpr returns [EObject current=null] : ( ( (lv_exprSimple_0_0= ruleExprSimple ) ) | ( (lv_expEt_1_0= ruleAnd ) ) | ( (lv_expTerminale_2_0= ruleExprTerm ) ) ) ;
    public final EObject ruleExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_exprSimple_0_0 = null;

        EObject lv_expEt_1_0 = null;

        EObject lv_expTerminale_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1082:28: ( ( ( (lv_exprSimple_0_0= ruleExprSimple ) ) | ( (lv_expEt_1_0= ruleAnd ) ) | ( (lv_expTerminale_2_0= ruleExprTerm ) ) ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1083:1: ( ( (lv_exprSimple_0_0= ruleExprSimple ) ) | ( (lv_expEt_1_0= ruleAnd ) ) | ( (lv_expTerminale_2_0= ruleExprTerm ) ) )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1083:1: ( ( (lv_exprSimple_0_0= ruleExprSimple ) ) | ( (lv_expEt_1_0= ruleAnd ) ) | ( (lv_expTerminale_2_0= ruleExprTerm ) ) )
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1083:2: ( (lv_exprSimple_0_0= ruleExprSimple ) )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1083:2: ( (lv_exprSimple_0_0= ruleExprSimple ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1084:1: (lv_exprSimple_0_0= ruleExprSimple )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1084:1: (lv_exprSimple_0_0= ruleExprSimple )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1085:3: lv_exprSimple_0_0= ruleExprSimple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprAccess().getExprSimpleExprSimpleParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprSimple_in_ruleExpr2217);
                    lv_exprSimple_0_0=ruleExprSimple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprRule());
                      	        }
                             		set(
                             			current, 
                             			"exprSimple",
                              		lv_exprSimple_0_0, 
                              		"ExprSimple");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1102:6: ( (lv_expEt_1_0= ruleAnd ) )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1102:6: ( (lv_expEt_1_0= ruleAnd ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1103:1: (lv_expEt_1_0= ruleAnd )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1103:1: (lv_expEt_1_0= ruleAnd )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1104:3: lv_expEt_1_0= ruleAnd
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprAccess().getExpEtAndParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAnd_in_ruleExpr2244);
                    lv_expEt_1_0=ruleAnd();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprRule());
                      	        }
                             		set(
                             			current, 
                             			"expEt",
                              		lv_expEt_1_0, 
                              		"And");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1121:6: ( (lv_expTerminale_2_0= ruleExprTerm ) )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1121:6: ( (lv_expTerminale_2_0= ruleExprTerm ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1122:1: (lv_expTerminale_2_0= ruleExprTerm )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1122:1: (lv_expTerminale_2_0= ruleExprTerm )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1123:3: lv_expTerminale_2_0= ruleExprTerm
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprAccess().getExpTerminaleExprTermParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExprTerm_in_ruleExpr2271);
                    lv_expTerminale_2_0=ruleExprTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprRule());
                      	        }
                             		set(
                             			current, 
                             			"expTerminale",
                              		lv_expTerminale_2_0, 
                              		"ExprTerm");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

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
    // $ANTLR end "ruleExpr"


    // $ANTLR start "entryRuleAnd"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1147:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1148:2: (iv_ruleAnd= ruleAnd EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1149:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd2307);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd2317); if (state.failed) return current;

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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1156:1: ruleAnd returns [EObject current=null] : ( ( (lv_expOu_0_0= ruleOr ) ) (this_LC_1= RULE_LC otherlv_2= 'and' this_LC_3= RULE_LC ( (lv_expOu2_4_0= ruleOr ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token this_LC_1=null;
        Token otherlv_2=null;
        Token this_LC_3=null;
        EObject lv_expOu_0_0 = null;

        EObject lv_expOu2_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1159:28: ( ( ( (lv_expOu_0_0= ruleOr ) ) (this_LC_1= RULE_LC otherlv_2= 'and' this_LC_3= RULE_LC ( (lv_expOu2_4_0= ruleOr ) ) )* ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1160:1: ( ( (lv_expOu_0_0= ruleOr ) ) (this_LC_1= RULE_LC otherlv_2= 'and' this_LC_3= RULE_LC ( (lv_expOu2_4_0= ruleOr ) ) )* )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1160:1: ( ( (lv_expOu_0_0= ruleOr ) ) (this_LC_1= RULE_LC otherlv_2= 'and' this_LC_3= RULE_LC ( (lv_expOu2_4_0= ruleOr ) ) )* )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1160:2: ( (lv_expOu_0_0= ruleOr ) ) (this_LC_1= RULE_LC otherlv_2= 'and' this_LC_3= RULE_LC ( (lv_expOu2_4_0= ruleOr ) ) )*
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1160:2: ( (lv_expOu_0_0= ruleOr ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1161:1: (lv_expOu_0_0= ruleOr )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1161:1: (lv_expOu_0_0= ruleOr )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1162:3: lv_expOu_0_0= ruleOr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAndAccess().getExpOuOrParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleOr_in_ruleAnd2363);
            lv_expOu_0_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAndRule());
              	        }
                     		set(
                     			current, 
                     			"expOu",
                      		lv_expOu_0_0, 
                      		"Or");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1178:2: (this_LC_1= RULE_LC otherlv_2= 'and' this_LC_3= RULE_LC ( (lv_expOu2_4_0= ruleOr ) ) )*
            loop18:
            do {
                int alt18=2;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1178:3: this_LC_1= RULE_LC otherlv_2= 'and' this_LC_3= RULE_LC ( (lv_expOu2_4_0= ruleOr ) )
            	    {
            	    this_LC_1=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleAnd2375); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LC_1, grammarAccess.getAndAccess().getLCTerminalRuleCall_1_0()); 
            	          
            	    }
            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleAnd2386); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_1_1());
            	          
            	    }
            	    this_LC_3=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleAnd2397); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LC_3, grammarAccess.getAndAccess().getLCTerminalRuleCall_1_2()); 
            	          
            	    }
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1190:1: ( (lv_expOu2_4_0= ruleOr ) )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1191:1: (lv_expOu2_4_0= ruleOr )
            	    {
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1191:1: (lv_expOu2_4_0= ruleOr )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1192:3: lv_expOu2_4_0= ruleOr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndAccess().getExpOu2OrParserRuleCall_1_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOr_in_ruleAnd2417);
            	    lv_expOu2_4_0=ruleOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expOu2",
            	              		lv_expOu2_4_0, 
            	              		"Or");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1216:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1217:2: (iv_ruleOr= ruleOr EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1218:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr2455);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr2465); if (state.failed) return current;

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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1225:1: ruleOr returns [EObject current=null] : ( ( (lv_expNon_0_0= ruleNot ) ) (this_LC_1= RULE_LC otherlv_2= 'or' this_LC_3= RULE_LC ( (lv_expNon2_4_0= ruleNot ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token this_LC_1=null;
        Token otherlv_2=null;
        Token this_LC_3=null;
        EObject lv_expNon_0_0 = null;

        EObject lv_expNon2_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1228:28: ( ( ( (lv_expNon_0_0= ruleNot ) ) (this_LC_1= RULE_LC otherlv_2= 'or' this_LC_3= RULE_LC ( (lv_expNon2_4_0= ruleNot ) ) )* ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1229:1: ( ( (lv_expNon_0_0= ruleNot ) ) (this_LC_1= RULE_LC otherlv_2= 'or' this_LC_3= RULE_LC ( (lv_expNon2_4_0= ruleNot ) ) )* )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1229:1: ( ( (lv_expNon_0_0= ruleNot ) ) (this_LC_1= RULE_LC otherlv_2= 'or' this_LC_3= RULE_LC ( (lv_expNon2_4_0= ruleNot ) ) )* )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1229:2: ( (lv_expNon_0_0= ruleNot ) ) (this_LC_1= RULE_LC otherlv_2= 'or' this_LC_3= RULE_LC ( (lv_expNon2_4_0= ruleNot ) ) )*
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1229:2: ( (lv_expNon_0_0= ruleNot ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1230:1: (lv_expNon_0_0= ruleNot )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1230:1: (lv_expNon_0_0= ruleNot )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1231:3: lv_expNon_0_0= ruleNot
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getOrAccess().getExpNonNotParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNot_in_ruleOr2511);
            lv_expNon_0_0=ruleNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getOrRule());
              	        }
                     		set(
                     			current, 
                     			"expNon",
                      		lv_expNon_0_0, 
                      		"Not");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1247:2: (this_LC_1= RULE_LC otherlv_2= 'or' this_LC_3= RULE_LC ( (lv_expNon2_4_0= ruleNot ) ) )*
            loop19:
            do {
                int alt19=2;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1247:3: this_LC_1= RULE_LC otherlv_2= 'or' this_LC_3= RULE_LC ( (lv_expNon2_4_0= ruleNot ) )
            	    {
            	    this_LC_1=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleOr2523); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LC_1, grammarAccess.getOrAccess().getLCTerminalRuleCall_1_0()); 
            	          
            	    }
            	    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleOr2534); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getOrKeyword_1_1());
            	          
            	    }
            	    this_LC_3=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleOr2545); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LC_3, grammarAccess.getOrAccess().getLCTerminalRuleCall_1_2()); 
            	          
            	    }
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1259:1: ( (lv_expNon2_4_0= ruleNot ) )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1260:1: (lv_expNon2_4_0= ruleNot )
            	    {
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1260:1: (lv_expNon2_4_0= ruleNot )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1261:3: lv_expNon2_4_0= ruleNot
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrAccess().getExpNon2NotParserRuleCall_1_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNot_in_ruleOr2565);
            	    lv_expNon2_4_0=ruleNot();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expNon2",
            	              		lv_expNon2_4_0, 
            	              		"Not");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1285:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1286:2: (iv_ruleNot= ruleNot EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1287:2: iv_ruleNot= ruleNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotRule()); 
            }
            pushFollow(FOLLOW_ruleNot_in_entryRuleNot2603);
            iv_ruleNot=ruleNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNot; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNot2613); if (state.failed) return current;

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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1294:1: ruleNot returns [EObject current=null] : ( ( ( (lv_non_0_0= 'not' ) ) this_LC_1= RULE_LC )* ( (lv_expEq_2_0= ruleEq ) ) ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token lv_non_0_0=null;
        Token this_LC_1=null;
        EObject lv_expEq_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1297:28: ( ( ( ( (lv_non_0_0= 'not' ) ) this_LC_1= RULE_LC )* ( (lv_expEq_2_0= ruleEq ) ) ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1298:1: ( ( ( (lv_non_0_0= 'not' ) ) this_LC_1= RULE_LC )* ( (lv_expEq_2_0= ruleEq ) ) )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1298:1: ( ( ( (lv_non_0_0= 'not' ) ) this_LC_1= RULE_LC )* ( (lv_expEq_2_0= ruleEq ) ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1298:2: ( ( (lv_non_0_0= 'not' ) ) this_LC_1= RULE_LC )* ( (lv_expEq_2_0= ruleEq ) )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1298:2: ( ( (lv_non_0_0= 'not' ) ) this_LC_1= RULE_LC )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==35) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1298:3: ( (lv_non_0_0= 'not' ) ) this_LC_1= RULE_LC
            	    {
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1298:3: ( (lv_non_0_0= 'not' ) )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1299:1: (lv_non_0_0= 'not' )
            	    {
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1299:1: (lv_non_0_0= 'not' )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1300:3: lv_non_0_0= 'not'
            	    {
            	    lv_non_0_0=(Token)match(input,35,FOLLOW_35_in_ruleNot2657); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_non_0_0, grammarAccess.getNotAccess().getNonNotKeyword_0_0_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getNotRule());
            	      	        }
            	             		addWithLastConsumed(current, "non", lv_non_0_0, "not");
            	      	    
            	    }

            	    }


            	    }

            	    this_LC_1=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleNot2681); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LC_1, grammarAccess.getNotAccess().getLCTerminalRuleCall_0_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1317:3: ( (lv_expEq_2_0= ruleEq ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1318:1: (lv_expEq_2_0= ruleEq )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1318:1: (lv_expEq_2_0= ruleEq )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1319:3: lv_expEq_2_0= ruleEq
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNotAccess().getExpEqEqParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEq_in_ruleNot2703);
            lv_expEq_2_0=ruleEq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNotRule());
              	        }
                     		set(
                     			current, 
                     			"expEq",
                      		lv_expEq_2_0, 
                      		"Eq");
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
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleEq"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1343:1: entryRuleEq returns [EObject current=null] : iv_ruleEq= ruleEq EOF ;
    public final EObject entryRuleEq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEq = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1344:2: (iv_ruleEq= ruleEq EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1345:2: iv_ruleEq= ruleEq EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqRule()); 
            }
            pushFollow(FOLLOW_ruleEq_in_entryRuleEq2739);
            iv_ruleEq=ruleEq();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEq; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEq2749); if (state.failed) return current;

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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1352:1: ruleEq returns [EObject current=null] : ( ( ( ( (lv_exprEq1_0_1= ruleExprSimple | lv_exprEq1_0_2= ruleExprTerm ) ) ) (this_LC_1= RULE_LC )? otherlv_2= '=?' (this_LC_3= RULE_LC )? ( ( (lv_exprEq2_4_1= ruleExprSimple | lv_exprEq2_4_2= ruleExprTerm ) ) ) ) | (otherlv_5= '(' ( ( (lv_exp_6_1= ruleExprTerm | lv_exp_6_2= ruleExprSimple ) ) ) otherlv_7= ')' ) ) ;
    public final EObject ruleEq() throws RecognitionException {
        EObject current = null;

        Token this_LC_1=null;
        Token otherlv_2=null;
        Token this_LC_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_exprEq1_0_1 = null;

        EObject lv_exprEq1_0_2 = null;

        EObject lv_exprEq2_4_1 = null;

        EObject lv_exprEq2_4_2 = null;

        EObject lv_exp_6_1 = null;

        EObject lv_exp_6_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1355:28: ( ( ( ( ( (lv_exprEq1_0_1= ruleExprSimple | lv_exprEq1_0_2= ruleExprTerm ) ) ) (this_LC_1= RULE_LC )? otherlv_2= '=?' (this_LC_3= RULE_LC )? ( ( (lv_exprEq2_4_1= ruleExprSimple | lv_exprEq2_4_2= ruleExprTerm ) ) ) ) | (otherlv_5= '(' ( ( (lv_exp_6_1= ruleExprTerm | lv_exp_6_2= ruleExprSimple ) ) ) otherlv_7= ')' ) ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1356:1: ( ( ( ( (lv_exprEq1_0_1= ruleExprSimple | lv_exprEq1_0_2= ruleExprTerm ) ) ) (this_LC_1= RULE_LC )? otherlv_2= '=?' (this_LC_3= RULE_LC )? ( ( (lv_exprEq2_4_1= ruleExprSimple | lv_exprEq2_4_2= ruleExprTerm ) ) ) ) | (otherlv_5= '(' ( ( (lv_exp_6_1= ruleExprTerm | lv_exp_6_2= ruleExprSimple ) ) ) otherlv_7= ')' ) )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1356:1: ( ( ( ( (lv_exprEq1_0_1= ruleExprSimple | lv_exprEq1_0_2= ruleExprTerm ) ) ) (this_LC_1= RULE_LC )? otherlv_2= '=?' (this_LC_3= RULE_LC )? ( ( (lv_exprEq2_4_1= ruleExprSimple | lv_exprEq2_4_2= ruleExprTerm ) ) ) ) | (otherlv_5= '(' ( ( (lv_exp_6_1= ruleExprTerm | lv_exp_6_2= ruleExprSimple ) ) ) otherlv_7= ')' ) )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1356:2: ( ( ( (lv_exprEq1_0_1= ruleExprSimple | lv_exprEq1_0_2= ruleExprTerm ) ) ) (this_LC_1= RULE_LC )? otherlv_2= '=?' (this_LC_3= RULE_LC )? ( ( (lv_exprEq2_4_1= ruleExprSimple | lv_exprEq2_4_2= ruleExprTerm ) ) ) )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1356:2: ( ( ( (lv_exprEq1_0_1= ruleExprSimple | lv_exprEq1_0_2= ruleExprTerm ) ) ) (this_LC_1= RULE_LC )? otherlv_2= '=?' (this_LC_3= RULE_LC )? ( ( (lv_exprEq2_4_1= ruleExprSimple | lv_exprEq2_4_2= ruleExprTerm ) ) ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1356:3: ( ( (lv_exprEq1_0_1= ruleExprSimple | lv_exprEq1_0_2= ruleExprTerm ) ) ) (this_LC_1= RULE_LC )? otherlv_2= '=?' (this_LC_3= RULE_LC )? ( ( (lv_exprEq2_4_1= ruleExprSimple | lv_exprEq2_4_2= ruleExprTerm ) ) )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1356:3: ( ( (lv_exprEq1_0_1= ruleExprSimple | lv_exprEq1_0_2= ruleExprTerm ) ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1357:1: ( (lv_exprEq1_0_1= ruleExprSimple | lv_exprEq1_0_2= ruleExprTerm ) )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1357:1: ( (lv_exprEq1_0_1= ruleExprSimple | lv_exprEq1_0_2= ruleExprTerm ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1358:1: (lv_exprEq1_0_1= ruleExprSimple | lv_exprEq1_0_2= ruleExprTerm )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1358:1: (lv_exprEq1_0_1= ruleExprSimple | lv_exprEq1_0_2= ruleExprTerm )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==37) ) {
                        alt21=1;
                    }
                    else if ( ((LA21_0>=RULE_SYMBOLES && LA21_0<=RULE_VARIABLE)||LA21_0==39) ) {
                        alt21=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1359:3: lv_exprEq1_0_1= ruleExprSimple
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEqAccess().getExprEq1ExprSimpleParserRuleCall_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExprSimple_in_ruleEq2798);
                            lv_exprEq1_0_1=ruleExprSimple();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEqRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"exprEq1",
                                      		lv_exprEq1_0_1, 
                                      		"ExprSimple");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1374:8: lv_exprEq1_0_2= ruleExprTerm
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEqAccess().getExprEq1ExprTermParserRuleCall_0_0_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExprTerm_in_ruleEq2817);
                            lv_exprEq1_0_2=ruleExprTerm();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEqRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"exprEq1",
                                      		lv_exprEq1_0_2, 
                                      		"ExprTerm");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1392:2: (this_LC_1= RULE_LC )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_LC) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1392:3: this_LC_1= RULE_LC
                            {
                            this_LC_1=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleEq2832); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_LC_1, grammarAccess.getEqAccess().getLCTerminalRuleCall_0_1()); 
                                  
                            }

                            }
                            break;

                    }

                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleEq2845); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEqAccess().getEqualsSignQuestionMarkKeyword_0_2());
                          
                    }
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1400:1: (this_LC_3= RULE_LC )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_LC) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1400:2: this_LC_3= RULE_LC
                            {
                            this_LC_3=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleEq2857); if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                                  newLeafNode(this_LC_3, grammarAccess.getEqAccess().getLCTerminalRuleCall_0_3()); 
                                  
                            }

                            }
                            break;

                    }

                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1404:3: ( ( (lv_exprEq2_4_1= ruleExprSimple | lv_exprEq2_4_2= ruleExprTerm ) ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1405:1: ( (lv_exprEq2_4_1= ruleExprSimple | lv_exprEq2_4_2= ruleExprTerm ) )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1405:1: ( (lv_exprEq2_4_1= ruleExprSimple | lv_exprEq2_4_2= ruleExprTerm ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1406:1: (lv_exprEq2_4_1= ruleExprSimple | lv_exprEq2_4_2= ruleExprTerm )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1406:1: (lv_exprEq2_4_1= ruleExprSimple | lv_exprEq2_4_2= ruleExprTerm )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==37) ) {
                        alt24=1;
                    }
                    else if ( ((LA24_0>=RULE_SYMBOLES && LA24_0<=RULE_VARIABLE)||LA24_0==39) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1407:3: lv_exprEq2_4_1= ruleExprSimple
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEqAccess().getExprEq2ExprSimpleParserRuleCall_0_4_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExprSimple_in_ruleEq2881);
                            lv_exprEq2_4_1=ruleExprSimple();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEqRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"exprEq2",
                                      		lv_exprEq2_4_1, 
                                      		"ExprSimple");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1422:8: lv_exprEq2_4_2= ruleExprTerm
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEqAccess().getExprEq2ExprTermParserRuleCall_0_4_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExprTerm_in_ruleEq2900);
                            lv_exprEq2_4_2=ruleExprTerm();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEqRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"exprEq2",
                                      		lv_exprEq2_4_2, 
                                      		"ExprTerm");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1441:6: (otherlv_5= '(' ( ( (lv_exp_6_1= ruleExprTerm | lv_exp_6_2= ruleExprSimple ) ) ) otherlv_7= ')' )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1441:6: (otherlv_5= '(' ( ( (lv_exp_6_1= ruleExprTerm | lv_exp_6_2= ruleExprSimple ) ) ) otherlv_7= ')' )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1441:8: otherlv_5= '(' ( ( (lv_exp_6_1= ruleExprTerm | lv_exp_6_2= ruleExprSimple ) ) ) otherlv_7= ')'
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_37_in_ruleEq2923); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEqAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1445:1: ( ( (lv_exp_6_1= ruleExprTerm | lv_exp_6_2= ruleExprSimple ) ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1446:1: ( (lv_exp_6_1= ruleExprTerm | lv_exp_6_2= ruleExprSimple ) )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1446:1: ( (lv_exp_6_1= ruleExprTerm | lv_exp_6_2= ruleExprSimple ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1447:1: (lv_exp_6_1= ruleExprTerm | lv_exp_6_2= ruleExprSimple )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1447:1: (lv_exp_6_1= ruleExprTerm | lv_exp_6_2= ruleExprSimple )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=RULE_SYMBOLES && LA25_0<=RULE_VARIABLE)||LA25_0==39) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==37) ) {
                        alt25=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1448:3: lv_exp_6_1= ruleExprTerm
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEqAccess().getExpExprTermParserRuleCall_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExprTerm_in_ruleEq2946);
                            lv_exp_6_1=ruleExprTerm();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEqRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"exp",
                                      		lv_exp_6_1, 
                                      		"ExprTerm");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1463:8: lv_exp_6_2= ruleExprSimple
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getEqAccess().getExpExprSimpleParserRuleCall_1_1_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleExprSimple_in_ruleEq2965);
                            lv_exp_6_2=ruleExprSimple();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getEqRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"exp",
                                      		lv_exp_6_2, 
                                      		"ExprSimple");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_7=(Token)match(input,38,FOLLOW_38_in_ruleEq2980); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getEqAccess().getRightParenthesisKeyword_1_2());
                          
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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1493:1: entryRuleExprTerm returns [EObject current=null] : iv_ruleExprTerm= ruleExprTerm EOF ;
    public final EObject entryRuleExprTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprTerm = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1494:2: (iv_ruleExprTerm= ruleExprTerm EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1495:2: iv_ruleExprTerm= ruleExprTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprTermRule()); 
            }
            pushFollow(FOLLOW_ruleExprTerm_in_entryRuleExprTerm3017);
            iv_ruleExprTerm=ruleExprTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprTerm; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprTerm3027); if (state.failed) return current;

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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1502:1: ruleExprTerm returns [EObject current=null] : ( ( () otherlv_1= 'nil' ) | ( (lv_termVar_2_0= RULE_VARIABLE ) ) | ( (lv_termSym_3_0= RULE_SYMBOLES ) ) ) ;
    public final EObject ruleExprTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_termVar_2_0=null;
        Token lv_termSym_3_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1505:28: ( ( ( () otherlv_1= 'nil' ) | ( (lv_termVar_2_0= RULE_VARIABLE ) ) | ( (lv_termSym_3_0= RULE_SYMBOLES ) ) ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1506:1: ( ( () otherlv_1= 'nil' ) | ( (lv_termVar_2_0= RULE_VARIABLE ) ) | ( (lv_termSym_3_0= RULE_SYMBOLES ) ) )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1506:1: ( ( () otherlv_1= 'nil' ) | ( (lv_termVar_2_0= RULE_VARIABLE ) ) | ( (lv_termSym_3_0= RULE_SYMBOLES ) ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt27=1;
                }
                break;
            case RULE_VARIABLE:
                {
                alt27=2;
                }
                break;
            case RULE_SYMBOLES:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1506:2: ( () otherlv_1= 'nil' )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1506:2: ( () otherlv_1= 'nil' )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1506:3: () otherlv_1= 'nil'
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1506:3: ()
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1507:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getExprTermAccess().getExprTermAction_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleExprTerm3077); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getExprTermAccess().getNilKeyword_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1520:6: ( (lv_termVar_2_0= RULE_VARIABLE ) )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1520:6: ( (lv_termVar_2_0= RULE_VARIABLE ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1521:1: (lv_termVar_2_0= RULE_VARIABLE )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1521:1: (lv_termVar_2_0= RULE_VARIABLE )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1522:3: lv_termVar_2_0= RULE_VARIABLE
                    {
                    lv_termVar_2_0=(Token)match(input,RULE_VARIABLE,FOLLOW_RULE_VARIABLE_in_ruleExprTerm3101); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_termVar_2_0, grammarAccess.getExprTermAccess().getTermVarVARIABLETerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExprTermRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"termVar",
                              		lv_termVar_2_0, 
                              		"VARIABLE");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1539:6: ( (lv_termSym_3_0= RULE_SYMBOLES ) )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1539:6: ( (lv_termSym_3_0= RULE_SYMBOLES ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1540:1: (lv_termSym_3_0= RULE_SYMBOLES )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1540:1: (lv_termSym_3_0= RULE_SYMBOLES )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1541:3: lv_termSym_3_0= RULE_SYMBOLES
                    {
                    lv_termSym_3_0=(Token)match(input,RULE_SYMBOLES,FOLLOW_RULE_SYMBOLES_in_ruleExprTerm3129); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_termSym_3_0, grammarAccess.getExprTermAccess().getTermSymSYMBOLESTerminalRuleCall_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getExprTermRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"termSym",
                              		lv_termSym_3_0, 
                              		"SYMBOLES");
                      	    
                    }

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
    // $ANTLR end "ruleExprTerm"


    // $ANTLR start "entryRuleExprSimple"
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1565:1: entryRuleExprSimple returns [EObject current=null] : iv_ruleExprSimple= ruleExprSimple EOF ;
    public final EObject entryRuleExprSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprSimple = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1566:2: (iv_ruleExprSimple= ruleExprSimple EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1567:2: iv_ruleExprSimple= ruleExprSimple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprSimpleRule()); 
            }
            pushFollow(FOLLOW_ruleExprSimple_in_entryRuleExprSimple3170);
            iv_ruleExprSimple=ruleExprSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprSimple; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExprSimple3180); if (state.failed) return current;

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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1574:1: ruleExprSimple returns [EObject current=null] : (otherlv_0= '(' ( ( ( ( (lv_mot_1_1= 'cons' | lv_mot_1_2= 'list' ) ) ) ( (lv_lexpr_2_0= ruleLexpr ) ) ) | ( ( ( (lv_mot_3_1= 'hd' | lv_mot_3_2= 'tl' ) ) ) this_LC_4= RULE_LC ( (lv_expr_5_0= ruleExpr ) ) ) ) otherlv_6= ')' ) ;
    public final EObject ruleExprSimple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mot_1_1=null;
        Token lv_mot_1_2=null;
        Token lv_mot_3_1=null;
        Token lv_mot_3_2=null;
        Token this_LC_4=null;
        Token otherlv_6=null;
        EObject lv_lexpr_2_0 = null;

        EObject lv_expr_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1577:28: ( (otherlv_0= '(' ( ( ( ( (lv_mot_1_1= 'cons' | lv_mot_1_2= 'list' ) ) ) ( (lv_lexpr_2_0= ruleLexpr ) ) ) | ( ( ( (lv_mot_3_1= 'hd' | lv_mot_3_2= 'tl' ) ) ) this_LC_4= RULE_LC ( (lv_expr_5_0= ruleExpr ) ) ) ) otherlv_6= ')' ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1578:1: (otherlv_0= '(' ( ( ( ( (lv_mot_1_1= 'cons' | lv_mot_1_2= 'list' ) ) ) ( (lv_lexpr_2_0= ruleLexpr ) ) ) | ( ( ( (lv_mot_3_1= 'hd' | lv_mot_3_2= 'tl' ) ) ) this_LC_4= RULE_LC ( (lv_expr_5_0= ruleExpr ) ) ) ) otherlv_6= ')' )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1578:1: (otherlv_0= '(' ( ( ( ( (lv_mot_1_1= 'cons' | lv_mot_1_2= 'list' ) ) ) ( (lv_lexpr_2_0= ruleLexpr ) ) ) | ( ( ( (lv_mot_3_1= 'hd' | lv_mot_3_2= 'tl' ) ) ) this_LC_4= RULE_LC ( (lv_expr_5_0= ruleExpr ) ) ) ) otherlv_6= ')' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1578:3: otherlv_0= '(' ( ( ( ( (lv_mot_1_1= 'cons' | lv_mot_1_2= 'list' ) ) ) ( (lv_lexpr_2_0= ruleLexpr ) ) ) | ( ( ( (lv_mot_3_1= 'hd' | lv_mot_3_2= 'tl' ) ) ) this_LC_4= RULE_LC ( (lv_expr_5_0= ruleExpr ) ) ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleExprSimple3217); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExprSimpleAccess().getLeftParenthesisKeyword_0());
                  
            }
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1582:1: ( ( ( ( (lv_mot_1_1= 'cons' | lv_mot_1_2= 'list' ) ) ) ( (lv_lexpr_2_0= ruleLexpr ) ) ) | ( ( ( (lv_mot_3_1= 'hd' | lv_mot_3_2= 'tl' ) ) ) this_LC_4= RULE_LC ( (lv_expr_5_0= ruleExpr ) ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=40 && LA30_0<=41)) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=42 && LA30_0<=43)) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1582:2: ( ( ( (lv_mot_1_1= 'cons' | lv_mot_1_2= 'list' ) ) ) ( (lv_lexpr_2_0= ruleLexpr ) ) )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1582:2: ( ( ( (lv_mot_1_1= 'cons' | lv_mot_1_2= 'list' ) ) ) ( (lv_lexpr_2_0= ruleLexpr ) ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1582:3: ( ( (lv_mot_1_1= 'cons' | lv_mot_1_2= 'list' ) ) ) ( (lv_lexpr_2_0= ruleLexpr ) )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1582:3: ( ( (lv_mot_1_1= 'cons' | lv_mot_1_2= 'list' ) ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1583:1: ( (lv_mot_1_1= 'cons' | lv_mot_1_2= 'list' ) )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1583:1: ( (lv_mot_1_1= 'cons' | lv_mot_1_2= 'list' ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1584:1: (lv_mot_1_1= 'cons' | lv_mot_1_2= 'list' )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1584:1: (lv_mot_1_1= 'cons' | lv_mot_1_2= 'list' )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==40) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==41) ) {
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
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1585:3: lv_mot_1_1= 'cons'
                            {
                            lv_mot_1_1=(Token)match(input,40,FOLLOW_40_in_ruleExprSimple3239); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_mot_1_1, grammarAccess.getExprSimpleAccess().getMotConsKeyword_1_0_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExprSimpleRule());
                              	        }
                                     		setWithLastConsumed(current, "mot", lv_mot_1_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1597:8: lv_mot_1_2= 'list'
                            {
                            lv_mot_1_2=(Token)match(input,41,FOLLOW_41_in_ruleExprSimple3268); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_mot_1_2, grammarAccess.getExprSimpleAccess().getMotListKeyword_1_0_0_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExprSimpleRule());
                              	        }
                                     		setWithLastConsumed(current, "mot", lv_mot_1_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1612:2: ( (lv_lexpr_2_0= ruleLexpr ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1613:1: (lv_lexpr_2_0= ruleLexpr )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1613:1: (lv_lexpr_2_0= ruleLexpr )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1614:3: lv_lexpr_2_0= ruleLexpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getLexprLexprParserRuleCall_1_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleLexpr_in_ruleExprSimple3305);
                    lv_lexpr_2_0=ruleLexpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      	        }
                             		set(
                             			current, 
                             			"lexpr",
                              		lv_lexpr_2_0, 
                              		"Lexpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1631:6: ( ( ( (lv_mot_3_1= 'hd' | lv_mot_3_2= 'tl' ) ) ) this_LC_4= RULE_LC ( (lv_expr_5_0= ruleExpr ) ) )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1631:6: ( ( ( (lv_mot_3_1= 'hd' | lv_mot_3_2= 'tl' ) ) ) this_LC_4= RULE_LC ( (lv_expr_5_0= ruleExpr ) ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1631:7: ( ( (lv_mot_3_1= 'hd' | lv_mot_3_2= 'tl' ) ) ) this_LC_4= RULE_LC ( (lv_expr_5_0= ruleExpr ) )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1631:7: ( ( (lv_mot_3_1= 'hd' | lv_mot_3_2= 'tl' ) ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1632:1: ( (lv_mot_3_1= 'hd' | lv_mot_3_2= 'tl' ) )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1632:1: ( (lv_mot_3_1= 'hd' | lv_mot_3_2= 'tl' ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1633:1: (lv_mot_3_1= 'hd' | lv_mot_3_2= 'tl' )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1633:1: (lv_mot_3_1= 'hd' | lv_mot_3_2= 'tl' )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==42) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==43) ) {
                        alt29=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1634:3: lv_mot_3_1= 'hd'
                            {
                            lv_mot_3_1=(Token)match(input,42,FOLLOW_42_in_ruleExprSimple3333); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_mot_3_1, grammarAccess.getExprSimpleAccess().getMotHdKeyword_1_1_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExprSimpleRule());
                              	        }
                                     		setWithLastConsumed(current, "mot", lv_mot_3_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1646:8: lv_mot_3_2= 'tl'
                            {
                            lv_mot_3_2=(Token)match(input,43,FOLLOW_43_in_ruleExprSimple3362); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_mot_3_2, grammarAccess.getExprSimpleAccess().getMotTlKeyword_1_1_0_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getExprSimpleRule());
                              	        }
                                     		setWithLastConsumed(current, "mot", lv_mot_3_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    this_LC_4=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleExprSimple3389); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_LC_4, grammarAccess.getExprSimpleAccess().getLCTerminalRuleCall_1_1_1()); 
                          
                    }
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1665:1: ( (lv_expr_5_0= ruleExpr ) )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1666:1: (lv_expr_5_0= ruleExpr )
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1666:1: (lv_expr_5_0= ruleExpr )
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1667:3: lv_expr_5_0= ruleExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExprSimpleAccess().getExprExprParserRuleCall_1_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleExpr_in_ruleExprSimple3409);
                    lv_expr_5_0=ruleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExprSimpleRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_5_0, 
                              		"Expr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,38,FOLLOW_38_in_ruleExprSimple3423); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getExprSimpleAccess().getRightParenthesisKeyword_2());
                  
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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1695:1: entryRuleLexpr returns [EObject current=null] : iv_ruleLexpr= ruleLexpr EOF ;
    public final EObject entryRuleLexpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLexpr = null;


        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1696:2: (iv_ruleLexpr= ruleLexpr EOF )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1697:2: iv_ruleLexpr= ruleLexpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLexprRule()); 
            }
            pushFollow(FOLLOW_ruleLexpr_in_entryRuleLexpr3459);
            iv_ruleLexpr=ruleLexpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLexpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLexpr3469); if (state.failed) return current;

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
    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1704:1: ruleLexpr returns [EObject current=null] : (this_LC_0= RULE_LC ( (lv_exp_1_0= ruleExpr ) ) )+ ;
    public final EObject ruleLexpr() throws RecognitionException {
        EObject current = null;

        Token this_LC_0=null;
        EObject lv_exp_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1707:28: ( (this_LC_0= RULE_LC ( (lv_exp_1_0= ruleExpr ) ) )+ )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1708:1: (this_LC_0= RULE_LC ( (lv_exp_1_0= ruleExpr ) ) )+
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1708:1: (this_LC_0= RULE_LC ( (lv_exp_1_0= ruleExpr ) ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_LC) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1708:2: this_LC_0= RULE_LC ( (lv_exp_1_0= ruleExpr ) )
            	    {
            	    this_LC_0=(Token)match(input,RULE_LC,FOLLOW_RULE_LC_in_ruleLexpr3505); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_LC_0, grammarAccess.getLexprAccess().getLCTerminalRuleCall_0()); 
            	          
            	    }
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1712:1: ( (lv_exp_1_0= ruleExpr ) )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1713:1: (lv_exp_1_0= ruleExpr )
            	    {
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1713:1: (lv_exp_1_0= ruleExpr )
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1714:3: lv_exp_1_0= ruleExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLexprAccess().getExpExprParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleExpr_in_ruleLexpr3525);
            	    lv_exp_1_0=ruleExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLexprRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"exp",
            	              		lv_exp_1_0, 
            	              		"Expr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
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

    // $ANTLR start synpred21_InternalMyDsl
    public final void synpred21_InternalMyDsl_fragment() throws RecognitionException {   
        EObject lv_exprSimple_0_0 = null;


        // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1083:2: ( ( (lv_exprSimple_0_0= ruleExprSimple ) ) )
        // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1083:2: ( (lv_exprSimple_0_0= ruleExprSimple ) )
        {
        // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1083:2: ( (lv_exprSimple_0_0= ruleExprSimple ) )
        // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1084:1: (lv_exprSimple_0_0= ruleExprSimple )
        {
        // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1084:1: (lv_exprSimple_0_0= ruleExprSimple )
        // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1085:3: lv_exprSimple_0_0= ruleExprSimple
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExprAccess().getExprSimpleExprSimpleParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleExprSimple_in_synpred21_InternalMyDsl2217);
        lv_exprSimple_0_0=ruleExprSimple();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred21_InternalMyDsl

    // $ANTLR start synpred22_InternalMyDsl
    public final void synpred22_InternalMyDsl_fragment() throws RecognitionException {   
        EObject lv_expEt_1_0 = null;


        // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1102:6: ( ( (lv_expEt_1_0= ruleAnd ) ) )
        // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1102:6: ( (lv_expEt_1_0= ruleAnd ) )
        {
        // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1102:6: ( (lv_expEt_1_0= ruleAnd ) )
        // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1103:1: (lv_expEt_1_0= ruleAnd )
        {
        // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1103:1: (lv_expEt_1_0= ruleAnd )
        // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1104:3: lv_expEt_1_0= ruleAnd
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getExprAccess().getExpEtAndParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FOLLOW_ruleAnd_in_synpred22_InternalMyDsl2244);
        lv_expEt_1_0=ruleAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred22_InternalMyDsl

    // Delegated rules

    public final boolean synpred22_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalMyDsl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalMyDsl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA17_eotS =
        "\41\uffff";
    static final String DFA17_eofS =
        "\3\uffff\3\20\33\uffff";
    static final String DFA17_minS =
        "\2\5\1\uffff\3\4\4\0\4\uffff\1\0\10\uffff\1\0\2\uffff\1\0\6\uffff";
    static final String DFA17_maxS =
        "\1\47\1\53\1\uffff\3\46\4\0\4\uffff\1\0\10\uffff\1\0\2\uffff\1\0"+
        "\6\uffff";
    static final String DFA17_acceptS =
        "\2\uffff\1\2\15\uffff\1\3\17\uffff\1\1";
    static final String DFA17_specialS =
        "\6\uffff\1\0\1\1\1\2\1\3\4\uffff\1\4\10\uffff\1\5\2\uffff\1\6\6"+
        "\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\5\1\4\34\uffff\1\2\1\uffff\1\1\1\uffff\1\3",
            "\2\2\36\uffff\1\2\1\uffff\1\2\1\6\1\7\1\10\1\11",
            "",
            "\1\16\16\uffff\2\20\17\uffff\1\2\1\uffff\1\20",
            "\1\27\16\uffff\2\20\17\uffff\1\2\1\uffff\1\20",
            "\1\32\16\uffff\2\20\17\uffff\1\2\1\uffff\1\20",
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
            return "1083:1: ( ( (lv_exprSimple_0_0= ruleExprSimple ) ) | ( (lv_expEt_1_0= ruleAnd ) ) | ( (lv_expTerminale_2_0= ruleExprTerm ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_6 = input.LA(1);

                         
                        int index17_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalMyDsl()) ) {s = 32;}

                        else if ( (synpred22_InternalMyDsl()) ) {s = 2;}

                         
                        input.seek(index17_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_7 = input.LA(1);

                         
                        int index17_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalMyDsl()) ) {s = 32;}

                        else if ( (synpred22_InternalMyDsl()) ) {s = 2;}

                         
                        input.seek(index17_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_8 = input.LA(1);

                         
                        int index17_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalMyDsl()) ) {s = 32;}

                        else if ( (synpred22_InternalMyDsl()) ) {s = 2;}

                         
                        input.seek(index17_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_9 = input.LA(1);

                         
                        int index17_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalMyDsl()) ) {s = 32;}

                        else if ( (synpred22_InternalMyDsl()) ) {s = 2;}

                         
                        input.seek(index17_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_14 = input.LA(1);

                         
                        int index17_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalMyDsl()) ) {s = 2;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index17_14);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_23 = input.LA(1);

                         
                        int index17_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalMyDsl()) ) {s = 2;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index17_23);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_26 = input.LA(1);

                         
                        int index17_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalMyDsl()) ) {s = 2;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index17_26);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA18_eotS =
        "\24\uffff";
    static final String DFA18_eofS =
        "\1\1\3\uffff\1\1\17\uffff";
    static final String DFA18_minS =
        "\1\4\3\uffff\1\5\17\uffff";
    static final String DFA18_maxS =
        "\1\46\3\uffff\1\47\17\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\2\10\uffff\1\1\11\uffff";
    static final String DFA18_specialS =
        "\24\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\4\16\uffff\2\1\21\uffff\1\1",
            "",
            "",
            "",
            "\2\1\12\uffff\1\1\6\uffff\2\1\2\uffff\1\1\1\uffff\3\1\1\12"+
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

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "()* loopback of 1178:2: (this_LC_1= RULE_LC otherlv_2= 'and' this_LC_3= RULE_LC ( (lv_expOu2_4_0= ruleOr ) ) )*";
        }
    }
    static final String DFA19_eotS =
        "\25\uffff";
    static final String DFA19_eofS =
        "\2\2\23\uffff";
    static final String DFA19_minS =
        "\1\4\1\5\23\uffff";
    static final String DFA19_maxS =
        "\1\46\1\47\23\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\14\uffff\1\1\5\uffff";
    static final String DFA19_specialS =
        "\25\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1\16\uffff\2\2\21\uffff\1\2",
            "\2\2\12\uffff\1\2\6\uffff\2\2\2\uffff\1\2\1\uffff\4\2\1\17"+
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

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "()* loopback of 1247:2: (this_LC_1= RULE_LC otherlv_2= 'or' this_LC_3= RULE_LC ( (lv_expNon2_4_0= ruleNot ) ) )*";
        }
    }
    static final String DFA26_eotS =
        "\15\uffff";
    static final String DFA26_eofS =
        "\15\uffff";
    static final String DFA26_minS =
        "\2\5\13\uffff";
    static final String DFA26_maxS =
        "\1\47\1\53\13\uffff";
    static final String DFA26_acceptS =
        "\2\uffff\1\1\6\uffff\1\2\3\uffff";
    static final String DFA26_specialS =
        "\15\uffff}>";
    static final String[] DFA26_transitionS = {
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
            return "1356:1: ( ( ( ( (lv_exprEq1_0_1= ruleExprSimple | lv_exprEq1_0_2= ruleExprTerm ) ) ) (this_LC_1= RULE_LC )? otherlv_2= '=?' (this_LC_3= RULE_LC )? ( ( (lv_exprEq2_4_1= ruleExprSimple | lv_exprEq2_4_2= ruleExprTerm ) ) ) ) | (otherlv_5= '(' ( ( (lv_exp_6_1= ruleExprTerm | lv_exp_6_2= ruleExprSimple ) ) ) otherlv_7= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel90 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunction_in_ruleModel146 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleModel158 = new BitSet(new long[]{0x0000000000004012L});
    public static final BitSet FOLLOW_ruleFunction_in_entryRuleFunction196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunction206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleFunction243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleFunction254 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SYMBOLES_in_ruleFunction270 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleFunction287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleFunction298 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleDefiniton_in_ruleFunction318 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleInput_in_entryRuleInput576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInput586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleInput628 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleInput646 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleInput658 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleInput676 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOutput_in_entryRuleOutput719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOutput729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleOutput771 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleOutput789 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleOutput801 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleOutput819 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleCommands_in_entryRuleCommands862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommands872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleCommands918 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleCommands931 = new BitSet(new long[]{0x000000002CA00050L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommands943 = new BitSet(new long[]{0x000000002CA00040L});
    public static final BitSet FOLLOW_ruleCommand_in_ruleCommands965 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleVars_in_entryRuleVars1003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVars1013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleVars1055 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleVars1073 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleVars1085 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleVars1103 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleExprs_in_entryRuleExprs1146 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprs1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprs1202 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleExprs1215 = new BitSet(new long[]{0x000000A800000070L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleExprs1227 = new BitSet(new long[]{0x000000A800000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprs1249 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleCommand_in_entryRuleCommand1287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommand1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCommand1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVars_in_ruleCommand1376 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1388 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleCommand1401 = new BitSet(new long[]{0x000000A800000070L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1413 = new BitSet(new long[]{0x000000A800000070L});
    public static final BitSet FOLLOW_ruleExprs_in_ruleCommand1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCommand1461 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1485 = new BitSet(new long[]{0x000000A800000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommand1505 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1516 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCommand1527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1538 = new BitSet(new long[]{0x000000002CA00040L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommand1558 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1569 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCommand1580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleCommand1606 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1630 = new BitSet(new long[]{0x000000A800000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommand1650 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1661 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCommand1672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1683 = new BitSet(new long[]{0x000000002CA00040L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommand1703 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1714 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCommand1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleCommand1751 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1775 = new BitSet(new long[]{0x000000A800000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommand1795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1806 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCommand1817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1828 = new BitSet(new long[]{0x000000A800000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommand1848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1859 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCommand1870 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1881 = new BitSet(new long[]{0x000000002CA00040L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommand1901 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1912 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCommand1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCommand1949 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand1973 = new BitSet(new long[]{0x000000A800000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleCommand1993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand2004 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleCommand2015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand2026 = new BitSet(new long[]{0x000000002CA00040L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommand2046 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand2057 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_ruleCommand2069 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand2080 = new BitSet(new long[]{0x000000002CA00040L});
    public static final BitSet FOLLOW_ruleCommands_in_ruleCommand2100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleCommand2111 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleCommand2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpr_in_entryRuleExpr2161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpr2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleExpr2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleExpr2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_ruleExpr2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd2307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd2317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleAnd2363 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleAnd2375 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAnd2386 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleAnd2397 = new BitSet(new long[]{0x000000A800000060L});
    public static final BitSet FOLLOW_ruleOr_in_ruleAnd2417 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr2455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNot_in_ruleOr2511 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleOr2523 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleOr2534 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleOr2545 = new BitSet(new long[]{0x000000A800000060L});
    public static final BitSet FOLLOW_ruleNot_in_ruleOr2565 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleNot_in_entryRuleNot2603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNot2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleNot2657 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleNot2681 = new BitSet(new long[]{0x000000A800000060L});
    public static final BitSet FOLLOW_ruleEq_in_ruleNot2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEq_in_entryRuleEq2739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEq2749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleEq2798 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_ruleExprTerm_in_ruleEq2817 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleEq2832 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleEq2845 = new BitSet(new long[]{0x000000A000000070L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleEq2857 = new BitSet(new long[]{0x000000A000000060L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleEq2881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_ruleEq2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleEq2923 = new BitSet(new long[]{0x000000A000000060L});
    public static final BitSet FOLLOW_ruleExprTerm_in_ruleEq2946 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_ruleExprSimple_in_ruleEq2965 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleEq2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprTerm_in_entryRuleExprTerm3017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprTerm3027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleExprTerm3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VARIABLE_in_ruleExprTerm3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SYMBOLES_in_ruleExprTerm3129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExprSimple_in_entryRuleExprSimple3170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExprSimple3180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleExprSimple3217 = new BitSet(new long[]{0x00000F0000000000L});
    public static final BitSet FOLLOW_40_in_ruleExprSimple3239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_41_in_ruleExprSimple3268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLexpr_in_ruleExprSimple3305 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_42_in_ruleExprSimple3333 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_43_in_ruleExprSimple3362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleExprSimple3389 = new BitSet(new long[]{0x000000A800000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleExprSimple3409 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleExprSimple3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLexpr_in_entryRuleLexpr3459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLexpr3469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LC_in_ruleLexpr3505 = new BitSet(new long[]{0x000000A800000070L});
    public static final BitSet FOLLOW_ruleExpr_in_ruleLexpr3525 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleExprSimple_in_synpred21_InternalMyDsl2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_synpred22_InternalMyDsl2244 = new BitSet(new long[]{0x0000000000000002L});

}