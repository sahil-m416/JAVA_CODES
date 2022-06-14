while(root != null)
{
    if(x == root.data)
        return root;
    
    if(x < root.data)
        root = root.left

    else 
        root = root.right
    

    return -1;
}