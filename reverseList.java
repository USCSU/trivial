public static ListNode reverseList(ListNode head){
			if(head == null)
				return null;
			ListNode dummy = new ListNode(-1);
			ListNode temp = dummy;
			while(head!=null){
				ListNode t = head;
				head=head.next;
				t.next = dummy.next;
				dummy.next = t;
			}
			
			return dummy.next;
		}
