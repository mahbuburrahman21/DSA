package LeetCodeSolution.LinkedList;

public class DeleteANode_237 extends Operations{
    public void deleteNode(ListNode target) {// node -> target
        if (target == null) return;
        target.val = target.next.val;
        target.next = target.next.next;
        size--;
    }
}