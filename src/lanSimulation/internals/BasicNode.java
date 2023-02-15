package lanSimulation.internals;

public class BasicNode extends Node{

	public BasicNode(byte type, String name, Node nextNode) {
		super(type, name, nextNode);
		// TODO Auto-generated constructor stub
	}
	public  BasicNode(String name) {
		super(NODE,name,null);
		// TODO Auto-generated constructor stub
	}
	public void printOn (StringBuffer buf) {
		buf.append("Node ");
		buf.append(this.name_);
		buf.append(" [Node]");
	}

	
	public void printHTMLOn (StringBuffer buf){
		buf.append("Node ");
		buf.append(this.name_);
		buf.append(" [Node]");
	}

	
	public void printXMLOn (StringBuffer buf) {
		buf.append("<node>");
		buf.append(this.name_);
		buf.append("</node>");
	}

}
