package rs.ac.bg.etf.pp1;

public class WhileStruct {
	
	private static WhileStruct head = null;
	
	private WhileStruct outerWhile;
	private int topAdr;
	private CondEval conditions = null;
	private CondEval jumps = null;
	private int endJumpAdr;

	private WhileStruct(int topAdr) {
		if(head != null){
			this.outerWhile = head;
		} else {
			this.outerWhile = null;
		}
		this.topAdr = topAdr;
	}
	
	public static void enterWhile(int topAdr){
		WhileStruct ws = new WhileStruct(topAdr);
		if(head != null){
			ws.outerWhile = head;
		}
		head = ws;
	}
	
	public static void exitWhile(){
		head = head.outerWhile;
	}
	
	public static WhileStruct getCurrentTop(){
		return head;
	}
	
	public static void setEndJumpInstrAdr(int endjmpadr){
		head.endJumpAdr = endjmpadr;
	}
	
	public static int getEndJumpInstrAdr(){
		return head.endJumpAdr;
	}
	
	public void addCodeJump(int adr){
		CondEval ce = new CondEval(adr);
		if(jumps != null)
			ce.next = jumps;
		
		jumps = ce;
	}
	
	public void addCondition(int adr){
		CondEval ce = new CondEval(adr);
		if(conditions != null)
			ce.next = conditions;
		
		conditions = ce;

	}
	
	
	public CondEval getConds(){
		return conditions;
	}
	
	public CondEval getJumps(){
		return jumps;
	}
	
	public void wipeConds(){
		conditions = null;
	}
	
	public void wipeJumps(){
		jumps = null;
	}
	
	public int getTopAdr(){
		return topAdr;
	}
	
	public class CondEval{
		
		private int address;
		CondEval next;
		
		public CondEval(int adr){
			address = adr;
			next = null;
		}
		
		public int getAdr(){
			return address;
		}
		
	}

}
