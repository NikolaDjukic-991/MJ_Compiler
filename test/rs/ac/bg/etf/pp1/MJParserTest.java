package rs.ac.bg.etf.pp1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.log4j.Logger;

import java_cup.runtime.Symbol;
import rs.etf.pp1.mj.runtime.Code;
import rs.etf.pp1.symboltable.Tab;

public class MJParserTest {
	
	public static void main(String[] args) throws Exception{
		Logger log = Logger.getLogger(MJParserTest.class);
		
		if(args.length != 2){
			System.out.println("Usage:\nMJProjekat.jar <srcpath> <outpath>");
			System.exit(0);
		}
		
		Reader br = null;
		try {
			File sourceCode = new File(args[0]);
			log.info("Compiling source file: " + sourceCode.getAbsolutePath());
			br = new BufferedReader(new FileReader(sourceCode));
			Yylex lexer = new Yylex(br);
			MJParser p = new MJParser(lexer);
			Symbol s = p.parse();
			
			
			log.info("Global vars declared: " + p.globalVarCount);
			log.info("Global arrays declared: " + p.globalArrayCount);
			log.info("Global methods declared: " + p.globalMethodCount);
			log.info("Classes declared: " + p.classCount);
			log.info("Class vars declared: " + p.classVarCount);
			log.info("Class methods declared: " + p.classMethodCount);
			log.info("Constants declared: " + p.constCount);
			log.info("Main vars declared: " + p.mainVarCount);
			log.info("Formal parameters declared: " + p.formParsCount);
			
			
			log.info("Print calls: " + p.printCallCount);
			
			Tab.dump();
			
			if(!p.error){
				log.info("No errors detected - generating code");
				File objFile = new File(args[1]);
				if(objFile.exists())
					objFile.delete();
				Code.write(new FileOutputStream(new File(args[1])));
				
			} else {
				log.error("Errors detected aborting code generation");
			}
			
			
		}
		finally {
			if ( br != null) try { br.close(); } catch (IOException e1) { log.error(e1.getMessage(), e1); }
		}
	}
	
	
}
