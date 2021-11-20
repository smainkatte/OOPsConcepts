package tree;
import java.awt.*;


public class Tree {

	double heightOfTree;
	double trunkDiameterInches;
	TreeType treeType;
	static Color TRUNK_COLOR=new Color(102,65,0);
	
	Tree(TreeType treeType, double heightOfTree, double trunkDiameterInches){
		this.treeType= treeType;
		this.heightOfTree= heightOfTree;
		this.trunkDiameterInches= trunkDiameterInches;
	}
	
	static void announceTree() {
		System.out.println("Lookout at that " + TRUNK_COLOR + " tree!");
	}
	
	void grow() {
		this.heightOfTree = this.heightOfTree + 10;
		System.out.println( "The height of "+ treeType +" is now:" + this.heightOfTree );
		this.trunkDiameterInches = this.trunkDiameterInches + 4;
		System.out.println( "The diameter of "+ treeType +" treetrunk is now:" + this.trunkDiameterInches );
	}
	
	void displayTallerTree() {
		if(this.heightOfTree > 10) {
			System.out.println("That's a tall " + this.treeType + " tree!");
		}
	}
	
	void displayLargerGirthTree() {
		if(this.trunkDiameterInches > 8) {
			System.out.println("That's a Large girth " + this.treeType + " tree!");
		}
	}
}
