
// Logic

// At every level check the size of the list and level, if it is same, that means we have visited 1st
// to that level ,so add that node to the list now the list size increases by 1 and when again
//  this level will be visited, then the list size would not be equal to the level so the node 
// will not get added, hence for each level only the 1st node is added and hence we get the left 
// view of the BT.

// Code
import java.util.ArrayList;
class left_view
{
    class Node
    {
        Node left;
        Node right;
        int data;
    }

    public ArrayList<Integer> leftView(Node root)
    {
        ArrayList<Integer>list=new ArrayList<>();
        view(root,list,0);
        return list;
    }

    public void view(Node node, ArrayList<Integer>list, int level)
    {
        if(node==null)
        return;

        if(list.size()==level)
        {
            list.add(node.data);
        }

        view(node.left,list,level+1);
        view(node.right,list,level+1);
    }

}