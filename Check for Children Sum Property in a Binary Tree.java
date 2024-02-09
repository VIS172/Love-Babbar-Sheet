class Solution
{
    public static int isSumProperty(Node root)
    {
        return check(root)==-1 ? 0 : 1;
    }
    
    public static int check(Node root)
    {
        if(root == null)
            return 0;
            
        if(root.left==null && root.right==null)
            return root.data;
            
        int left = check(root.left);
        int right = check(root.right);
        
        if(left==-1 || right==-1)
            return -1;
            
        if(left+right == root.data)
            return root.data;
        else
            return -1;
    }
}