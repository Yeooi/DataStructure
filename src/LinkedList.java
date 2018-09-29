public class LinkedList {
	Node head;
	Node tail;
	
	void initialise()
	{
		head = null;
		tail = null;
	}
	
	boolean isEmpty()
	{
		return (head==null);
	}
	
	void addNodeToTail(int data)
	{
		Node p = new Node(data);

		if(isEmpty())
		{
			head = p;
			tail = p;
		}
		else
		{
			tail.next = p;
			tail = p;
		}
	}
	
	void addOneNode(int index, int data)
	{
		if(index>countList())
		{
			System.out.println("Index out of bound");
			System.out.println("Adding to tail...");
			addNodeToTail(data);
			return;
		}

		Node p = new Node(data);
		Node temp = head;
		int count = 0;

		while(count < index-1)
		{
			temp = temp.next;
			count++;
		}

		p.next = temp.next;
		temp.next = p;
	}
	
	void removeNode(int index)
	{
		if(index>countList())
		{
			System.out.println("Index out of bound");
			return;
		}

		Node temp = head;
		int count = 0;

		while(count < index-1)
		{
			temp = temp.next;
			count++;
		}

		temp.next = (temp.next).next;
	}
	
	void printList()
	{
		if(isEmpty())
			return;

		SOP(head.data);
		Node p = new Node(0);
		p = head.next;
	
		while(p!=null)
		{
			SOP(p.getData());
			p = p.getNext();
		}
	}
	
	int countList()
	{
		int count = 0;

		if(isEmpty())
			return count;
		
		count++;
		Node p = new Node(0);
		p = head.next;
	
		while(p!=null)
		{
			count++;
			p = p.getNext();
		}
		
		return count;
	}

	void SOP(Object x)
	{
		System.out.println(x);
	}
}
