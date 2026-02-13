package LeetCodeSolution.LinkedList;

import static LeetCodeSolution.LinkedList.Operations.buildList;

public class Main {
    static void main() {

        // LC 237 – Delete a Node
//        DeleteANode_237 dlt = new DeleteANode_237();
//        ListNode head1 = buildList(dlt, 10, 20, 30, 40, 50);
//        dlt.deleteNode(head1);
//        dlt.display();

        // LC 2095 – Delete Middle Node
//        DeleteMiddleNode_2095 dltMiddle = new DeleteMiddleNode_2095();
//        ListNode head2 = buildList(dltMiddle, 10, 20, 30, 40, 50);
//        ListNode newHead = dltMiddle.deleteMiddle(head2);
//        dltMiddle.display(newHead);

        // LC 876 – Middle of Linked List
//        MiddleOfTheLL_876 middle = new MiddleOfTheLL_876();
//        ListNode head3 = buildList(middle, 10, 20, 30, 40, 50);
//        System.out.println(middle.middleNode(head3).val);

        // LC 19 – Remove Nth From End
//        RmvFromKth_19 rk = new RmvFromKth_19();
//        ListNode head4 = buildList(rk, 10, 20, 30, 40, 50);
//        rk.display(rk.removeNthFromEnd(head4, 2));

        // LC 24 - Swap Nodes In Pairs
        SwapNodesInPairs_24 swp = new SwapNodesInPairs_24();
        ListNode head5 = buildList(swp, 10, 20, 30, 40, 50, 60);
    }
}
