package lanSimulation.internals;

public class Printer extends Node {

	public Printer(byte type, String name, Node nextNode) {
		super(type, name, nextNode);
		// TODO Auto-generated constructor stub
	}
	public Printer( String name) {
		super(PRINTER,name,null);
		// TODO Auto-generated constructor stub
	}
	public void printOn (StringBuffer buf) {
		buf.append("Printer ");
		buf.append(this.name_);
		buf.append(" [Printer]");
	}
	
	public void printHTMLOn (StringBuffer buf){
		buf.append("Printer ");
		buf.append(this.name_);
		buf.append(" [Printer]");
	}

	public void printXMLOn (StringBuffer buf) {
		buf.append("<printer>");
		buf.append(this.name_);
		buf.append("</printer>");
	}
}
