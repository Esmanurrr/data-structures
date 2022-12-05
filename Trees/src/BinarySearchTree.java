
public class BinarySearchTree<anyTpe extends Comparable<? super anyTpe>> {

	TreeElement<anyType> root;
	
	public BinarySearchTree() {
		root = null;
	}
	
	public Boolean isEmpty() {
		return root==null;
	}
	
	public void makeEmpty() {
		root = null;
		
	}
	
	public TreeElement<anyType> insert(anyType data, TreeElement<anyType> subTreeRoot){
		
		if(subTreeRoot == null) {
			TreeElement<anyType> newRoot = new TreeElement<anyType>(data);
			return newRoot;
			
		}
		
	}


}
