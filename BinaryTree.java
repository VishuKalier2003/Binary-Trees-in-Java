import java.util.*;  // Package to import Scanner class
class Node                // Node class created to specify attributes of every Tree Node
    {
        int data;      // Data members
        Node left;
        Node right;
        public Node(int val)    // Parametrized Constructor
        {
            this.data = val;
            this.left = null;      // null pointer declaration
            this.right = null;     // null pointer declaration
        }
    }      // Node class ends
public class BinaryTree     // Binary Tree class created to Implement Binary Trees
{
    public
    Node InsertNodeInTree(Node root, int val)    // Inserting Node in the Tree
    {
        if(root == null)    // If Node reaches the end of the tree while traversing
            return new Node(val);     // Create Node and backtrack
        if(val <= root.data)       // If value is lesser, Left Subtree is called by Recursion
            root.left = InsertNodeInTree(root.left, val);
        else                       // If value is greater, Right Subtree is called by Recursion
            root.right = InsertNodeInTree(root.right, val);
        return root;          // returning root Node
        }
    public
    void DisplayTree(Node root)    // Displaying Binary Tree
    {
        if(root == null)    // If there are no further child Nodes in a branch
            return;      // Backtrack to the last caller function
        DisplayTree(root.left);          // Displaying the Left Subtree by Recursion
        System.out.println("Node : ");
        if(root.left != null)     // If left child is available
            System.out.println("\t"+root.data+"---> "+root.left.data+"\t (Occupied)");
        else                      // If left child does not exist
            System.out.println("\t"+root.data+"\t"+"\t (Empty)");
        if(root.right != null)    // If right child is available
            System.out.println("\t"+root.data+"---> "+root.right.data+"\t (Occupied)");
        else                      // If right child does not exist
            System.out.println("\t"+root.data+"\t"+"\t (Empty)");
        DisplayTree(root.right);          // Displaying the Right Subtree by Recursion
    }
    public static void main(String args[])    // main function
    {
        Scanner sc = new Scanner(System.in);    // Scanner object created
        int x, value;
        BinaryTree binarytree = new BinaryTree();    // Binary Tree class object created
        System.out.print("Enter Root Node value : ");
        x = sc.nextInt();
        Node root = new Node(x);     // Node class object created
        root = binarytree.InsertNodeInTree(root, x);     // Inserting Root node
        System.out.print("Enter the number of Nodes to Insert in Binary Tree : ");
        x = sc.nextInt();
        for(int loop = 0; loop < x; loop++)     // For Loop for iterations
        {
            System.out.print("Enter Node value : ");
            value = sc.nextInt();
            root = binarytree.InsertNodeInTree(root, value);   // INserting Nodes in the Tree
        }
        binarytree.DisplayTree(root);   // Displaying the Tree
        sc.close();    // Closing Scanner class
    }
}      // End of the Program (Binary Tree Class)