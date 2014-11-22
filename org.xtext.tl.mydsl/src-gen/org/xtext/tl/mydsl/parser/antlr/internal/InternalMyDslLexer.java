package org.xtext.tl.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int RULE_ID=7;
    public static final int T__41=41;
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
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=10;
    public static final int RULE_SYMBOLES=5;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=9;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int RULE_VARIABLE=6;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int RULE_LC=4;
    public static final int RULE_INT=8;
    public static final int RULE_WS=12;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:11:7: ( 'function' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:11:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:12:7: ( ':' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:12:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:13:7: ( 'read' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:13:9: 'read'
            {
            match("read"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:14:7: ( '%' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:14:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:15:7: ( 'write' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:15:9: 'write'
            {
            match("write"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:16:7: ( ',' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:17:7: ( ';' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:17:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:18:7: ( 'nop' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:18:9: 'nop'
            {
            match("nop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:19:7: ( ':=' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:19:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:20:7: ( 'while' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:20:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:21:7: ( 'do' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:21:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:22:7: ( 'od' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:22:9: 'od'
            {
            match("od"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:23:7: ( 'for' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:23:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:24:7: ( 'foreach' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:24:9: 'foreach'
            {
            match("foreach"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:25:7: ( 'in' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:25:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:26:7: ( 'if' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:26:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:27:7: ( 'then' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:27:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:28:7: ( 'else' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:28:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:29:7: ( 'fi' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:29:9: 'fi'
            {
            match("fi"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:30:7: ( 'and' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:30:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:31:7: ( 'or' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:31:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:32:7: ( 'not' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:32:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:33:7: ( '=?' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:33:9: '=?'
            {
            match("=?"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:34:7: ( '(' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:34:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:35:7: ( ')' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:35:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:36:7: ( 'nil' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:36:9: 'nil'
            {
            match("nil"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:37:7: ( 'cons' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:37:9: 'cons'
            {
            match("cons"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:38:7: ( 'list' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:38:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:39:7: ( 'hd' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:39:9: 'hd'
            {
            match("hd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:40:7: ( 'tl' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:40:9: 'tl'
            {
            match("tl"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "RULE_VARIABLE"
    public final void mRULE_VARIABLE() throws RecognitionException {
        try {
            int _type = RULE_VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1520:15: ( 'A' .. 'Z' ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' )* )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1520:17: 'A' .. 'Z' ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' )*
            {
            matchRange('A','Z'); 
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1520:26: ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VARIABLE"

    // $ANTLR start "RULE_SYMBOLES"
    public final void mRULE_SYMBOLES() throws RecognitionException {
        try {
            int _type = RULE_SYMBOLES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1522:15: ( 'a' .. 'z' ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' )* )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1522:17: 'a' .. 'z' ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' )*
            {
            matchRange('a','z'); 
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1522:26: ( 'a' .. 'z' | '0' .. '9' | 'A' .. 'Z' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SYMBOLES"

    // $ANTLR start "RULE_LC"
    public final void mRULE_LC() throws RecognitionException {
        try {
            int _type = RULE_LC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1524:9: ( ( ' ' | '\\n' | '\\t' )+ )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1524:11: ( ' ' | '\\n' | '\\t' )+
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1524:11: ( ' ' | '\\n' | '\\t' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\t' && LA3_0<='\n')||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LC"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1526:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1526:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1526:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1526:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1526:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1528:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1528:12: ( '0' .. '9' )+
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1528:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1528:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1530:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1530:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1530:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1530:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1530:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1530:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1530:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1530:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1530:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1530:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1530:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1532:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1532:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1532:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1532:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1534:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1534:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1534:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1534:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1534:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1534:41: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1534:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1534:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1536:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1536:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1536:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1538:16: ( . )
            // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1538:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_VARIABLE | RULE_SYMBOLES | RULE_LC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=40;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:178: T__42
                {
                mT__42(); 

                }
                break;
            case 30 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:184: T__43
                {
                mT__43(); 

                }
                break;
            case 31 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:190: RULE_VARIABLE
                {
                mRULE_VARIABLE(); 

                }
                break;
            case 32 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:204: RULE_SYMBOLES
                {
                mRULE_SYMBOLES(); 

                }
                break;
            case 33 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:218: RULE_LC
                {
                mRULE_LC(); 

                }
                break;
            case 34 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:226: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 35 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:234: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 36 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:243: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 37 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:255: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 38 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:271: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 39 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:287: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 40 :
                // ../org.xtext.tl.mydsl/src-gen/org/xtext/tl/mydsl/parser/antlr/internal/InternalMyDsl.g:1:295: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\1\44\1\47\1\44\1\uffff\1\44\2\uffff\7\44\1\37\2\uffff\3"+
        "\44\1\100\1\44\1\101\1\37\2\uffff\3\37\2\uffff\2\44\1\112\1\44\4"+
        "\uffff\1\44\1\uffff\2\44\2\uffff\2\44\1\121\1\122\1\123\1\124\1"+
        "\125\1\44\1\127\2\44\3\uffff\2\44\1\134\1\100\2\uffff\1\101\5\uffff"+
        "\1\44\1\137\1\uffff\3\44\1\143\1\144\1\145\5\uffff\1\44\1\uffff"+
        "\1\44\1\150\2\44\1\uffff\2\44\1\uffff\1\155\2\44\3\uffff\1\160\1"+
        "\161\1\uffff\1\162\1\163\2\44\1\uffff\1\166\1\167\4\uffff\2\44\2"+
        "\uffff\1\44\1\173\1\174\2\uffff";
    static final String DFA15_eofS =
        "\175\uffff";
    static final String DFA15_minS =
        "\1\0\1\60\1\75\1\60\1\uffff\1\60\2\uffff\7\60\1\77\2\uffff\5\60"+
        "\1\11\1\101\2\uffff\2\0\1\52\2\uffff\4\60\4\uffff\1\60\1\uffff\2"+
        "\60\2\uffff\13\60\3\uffff\4\60\2\uffff\1\11\5\uffff\2\60\1\uffff"+
        "\6\60\5\uffff\1\60\1\uffff\4\60\1\uffff\2\60\1\uffff\3\60\3\uffff"+
        "\2\60\1\uffff\4\60\1\uffff\2\60\4\uffff\2\60\2\uffff\3\60\2\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\172\1\75\1\172\1\uffff\1\172\2\uffff\7\172\1\77\2\uffff"+
        "\5\172\1\40\1\172\2\uffff\2\uffff\1\57\2\uffff\4\172\4\uffff\1\172"+
        "\1\uffff\2\172\2\uffff\13\172\3\uffff\4\172\2\uffff\1\40\5\uffff"+
        "\2\172\1\uffff\6\172\5\uffff\1\172\1\uffff\4\172\1\uffff\2\172\1"+
        "\uffff\3\172\3\uffff\2\172\1\uffff\4\172\1\uffff\2\172\4\uffff\2"+
        "\172\2\uffff\3\172\2\uffff";
    static final String DFA15_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\7\10\uffff\1\30\1\31\7\uffff\1\42\1\43"+
        "\3\uffff\1\47\1\50\4\uffff\1\40\1\42\1\11\1\2\1\uffff\1\4\2\uffff"+
        "\1\6\1\7\13\uffff\1\27\1\30\1\31\4\uffff\1\37\1\41\1\uffff\1\47"+
        "\1\43\1\44\1\45\1\46\2\uffff\1\23\6\uffff\1\13\1\14\1\25\1\17\1"+
        "\20\1\uffff\1\36\4\uffff\1\35\2\uffff\1\15\3\uffff\1\10\1\26\1\32"+
        "\2\uffff\1\24\4\uffff\1\3\2\uffff\1\21\1\22\1\33\1\34\2\uffff\1"+
        "\5\1\12\3\uffff\1\16\1\1";
    static final String DFA15_specialS =
        "\1\1\32\uffff\1\0\1\2\140\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\37\2\27\2\37\1\36\22\37\1\27\1\37\1\33\2\37\1\4\1\37\1\34"+
            "\1\20\1\21\2\37\1\6\2\37\1\35\12\32\1\2\1\7\1\37\1\17\3\37\32"+
            "\25\3\37\1\30\1\31\1\37\1\16\1\26\1\22\1\11\1\15\1\1\1\26\1"+
            "\24\1\13\2\26\1\23\1\26\1\10\1\12\2\26\1\3\1\26\1\14\2\26\1"+
            "\5\3\26\uff85\37",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\10\43\1\42\5\43\1"+
            "\41\5\43\1\40\5\43",
            "\1\46",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\4\43\1\50\25\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\7\43\1\53\11\43\1"+
            "\52\10\43",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\10\43\1\57\5\43\1"+
            "\56\13\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\16\43\1\60\13\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\3\43\1\61\15\43\1"+
            "\62\10\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\5\43\1\64\7\43\1"+
            "\63\14\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\7\43\1\65\3\43\1"+
            "\66\16\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\13\43\1\67\16\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\15\43\1\70\14\43",
            "\1\71",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\16\43\1\74\13\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\10\43\1\75\21\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\3\43\1\76\26\43",
            "\12\77\7\uffff\32\77\4\uffff\1\45\1\uffff\32\77",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\2\102\2\uffff\1\103\22\uffff\1\102",
            "\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\0\105",
            "\0\105",
            "\1\106\4\uffff\1\107",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\15\43\1\110\14\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\21\43\1\111\10\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\1\113\31\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\10\43\1\114\21\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\10\43\1\115\21\43",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\17\43\1\116\3\43"+
            "\1\117\6\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\13\43\1\120\16\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\4\43\1\126\25\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\22\43\1\130\7\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\3\43\1\131\26\43",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\15\43\1\132\14\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\22\43\1\133\7\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\77\7\uffff\32\77\4\uffff\1\45\1\uffff\32\77",
            "",
            "",
            "\2\102\2\uffff\1\103\22\uffff\1\102",
            "",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\2\43\1\135\27\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\4\43\1\136\25\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\3\43\1\140\26\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\23\43\1\141\6\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\13\43\1\142\16\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\15\43\1\146\14\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\4\43\1\147\25\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\22\43\1\151\7\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\23\43\1\152\6\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\23\43\1\153\6\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\1\154\31\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\4\43\1\156\25\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\4\43\1\157\25\43",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\10\43\1\164\21\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\2\43\1\165\27\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\16\43\1\170\13\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\7\43\1\171\22\43",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\15\43\1\172\14\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
            "\12\43\7\uffff\32\43\4\uffff\1\45\1\uffff\32\43",
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
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_VARIABLE | RULE_SYMBOLES | RULE_LC | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_27 = input.LA(1);

                        s = -1;
                        if ( ((LA15_27>='\u0000' && LA15_27<='\uFFFF')) ) {s = 69;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='f') ) {s = 1;}

                        else if ( (LA15_0==':') ) {s = 2;}

                        else if ( (LA15_0=='r') ) {s = 3;}

                        else if ( (LA15_0=='%') ) {s = 4;}

                        else if ( (LA15_0=='w') ) {s = 5;}

                        else if ( (LA15_0==',') ) {s = 6;}

                        else if ( (LA15_0==';') ) {s = 7;}

                        else if ( (LA15_0=='n') ) {s = 8;}

                        else if ( (LA15_0=='d') ) {s = 9;}

                        else if ( (LA15_0=='o') ) {s = 10;}

                        else if ( (LA15_0=='i') ) {s = 11;}

                        else if ( (LA15_0=='t') ) {s = 12;}

                        else if ( (LA15_0=='e') ) {s = 13;}

                        else if ( (LA15_0=='a') ) {s = 14;}

                        else if ( (LA15_0=='=') ) {s = 15;}

                        else if ( (LA15_0=='(') ) {s = 16;}

                        else if ( (LA15_0==')') ) {s = 17;}

                        else if ( (LA15_0=='c') ) {s = 18;}

                        else if ( (LA15_0=='l') ) {s = 19;}

                        else if ( (LA15_0=='h') ) {s = 20;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')) ) {s = 21;}

                        else if ( (LA15_0=='b'||LA15_0=='g'||(LA15_0>='j' && LA15_0<='k')||LA15_0=='m'||(LA15_0>='p' && LA15_0<='q')||LA15_0=='s'||(LA15_0>='u' && LA15_0<='v')||(LA15_0>='x' && LA15_0<='z')) ) {s = 22;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0==' ') ) {s = 23;}

                        else if ( (LA15_0=='^') ) {s = 24;}

                        else if ( (LA15_0=='_') ) {s = 25;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 26;}

                        else if ( (LA15_0=='\"') ) {s = 27;}

                        else if ( (LA15_0=='\'') ) {s = 28;}

                        else if ( (LA15_0=='/') ) {s = 29;}

                        else if ( (LA15_0=='\r') ) {s = 30;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='$')||LA15_0=='&'||(LA15_0>='*' && LA15_0<='+')||(LA15_0>='-' && LA15_0<='.')||LA15_0=='<'||(LA15_0>='>' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_28 = input.LA(1);

                        s = -1;
                        if ( ((LA15_28>='\u0000' && LA15_28<='\uFFFF')) ) {s = 69;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}