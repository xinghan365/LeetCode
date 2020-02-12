package zhihui.xu.algorithm.no2;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int index = 0;
        int sum = 0;
        ListNode c1 = l1;
        ListNode c2 = l2;

        while (true) {
            c1 = l1.next;
            c2 = l2.next;
            if (c1 == null || c2 == null) {
                break;
            }
            sum += c1.val * Math.pow(10, index) + c2.val * Math.pow(10, index);

            index++;
            c1 = c1.next;
            c2 = c1.next;
        }

        System.out.println(sum);
        return null;

    }

    public static void main(String[] args) {
        new Solution().addTwoNumbers(new ListNode(2), new ListNode(5));
    }
}