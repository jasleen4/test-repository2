package lanSimulation.internals;

public class Workstation extends Node {

	public Workstation(byte type, String name, Node nextNode) {
		super(type, name, nextNode);
		// TODO Auto-generated constructor stub
	}
	
	public Workstation( String name) {
		this(WORKSTATION,name,null);

	}

	public void printOn (StringBuffer buf) {
		buf.append("Workstation ");
		buf.append(this.name_);
		buf.append(" [Workstation]");
	}
	
	public void printHTMLOn (StringBuffer buf){
		buf.append("Workstation ");
		buf.append(this.name_);
		buf.append(" [Workstation]");
	}

	public void printXMLOn (StringBuffer buf) {
		buf.append("<workstation>");
		buf.append(this.name_);
		buf.append("</workstation>");
	}

}
