public static TreeNode commAncester(TreeNode root, TreeNode p, TreeNode q){
		if(root == null) return null;
		if(root == p || root == q) return root;
		TreeNode left = commAncester(root.left,p,q);
		TreeNode right = commAncester(root.right,p,q);
		if(left!=null && right!=null)
			return root;
		return left==null?right:left;
	}
