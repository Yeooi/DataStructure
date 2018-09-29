
public class Node 
{
	Object data;
	Node next;
	
	Node (Object data)
	{
		this.data = data;
		next = null;
	}
	
	Node (Object data, Node node)
	{
		this.data = data;
		next = node;
	}
	
	void setData (Object data)
	{
		this.data = data; 
	}
	
	Object getData()
	{
		return data;
	}
	
	void setNode(Node next)
	{
		this.next = next;
	}
	
	Node getNext()
	{
		return next;
	}
	
}
