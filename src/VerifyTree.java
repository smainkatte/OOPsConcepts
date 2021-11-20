
public class VerifyTree {

	public static void main(String[] args) {
		Tree oakTree = new Tree( TreeType.OAK, 18, 5 );
		Tree appleTree = new Tree( TreeType.Apple, 8, 1 );
		oakTree.grow();
		oakTree.displayTallerTree();
		oakTree.displayLargerGirthTree();
		Tree.announceTree();
		appleTree.grow();
		appleTree.displayTallerTree();
		appleTree.displayLargerGirthTree();

	}

}
