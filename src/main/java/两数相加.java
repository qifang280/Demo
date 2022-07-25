public class 两数相加 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode root = new ListNode(0);
//        ListNode cursor = root;
//        int carry = 0;
//        while(l1 != null || l2 != null || carry != 0) {
//            int l1Val = l1 != null ? l1.val : 0;
//            int l2Val = l2 != null ? l2.val : 0;
//            int sumVal = l1Val + l2Val + carry;
//            carry = sumVal / 10;
//
//            ListNode sumNode = new ListNode(sumVal % 10);
//            cursor.next = sumNode;
//            cursor = sumNode;
//
//            if(l1 != null) l1 = l1.next;
//            if(l2 != null) l2 = l2.next;
//        }
//
//        return root.next;
//    }


//        ListNode dummy = new ListNode();
//        // 指针
//        ListNode curr = dummy;
//        int carry = 0;
//        while (l1 != null || l2 != null) {
//            int x = l1 == null ? 0 : l1.val;
//            int y = l2 == null ? 0 : l2.val;
//
//            int total = x + y + carry;
//            // 14 取模10 等于4
//            curr.next = new ListNode(total % 10);
//            // bug 修复：视频中忘了移动 curr 指针了
//            curr = curr.next;
//            // 取十位数 是1 后链表+1
//            carry = total / 10;
//
//            if (l1 != null) l1 = l1.next;
//            if (l2 != null) l2 = l2.next;
//        }
//        // 最后一位
//        if (carry != 0) {
//            curr.next = new ListNode(carry);
//        }
//        return dummy.next;


        // 定义虚拟节点
        ListNode node = new ListNode();
        // 指针
        ListNode current = node;
        // 余数
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;

            int sum = x + y + carry;

            // 14 取模10 等于4
            current.next = new ListNode(sum % 10);
            // 移动指针到当前
            current = current.next;

            // 取十位数 为了下面的sum +1
            carry = sum / 10;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return node.next;
    }
}