package tree;
import java.awt.*;


public class Tree {

	private double heightOfTree;
	private double trunkDiameterInches;
	private TreeType treeType;
	protected static Color TRUNK_COLOR=new Color(102,65,0);
	
	public Tree(TreeType treeType, double heightOfTree, double trunkDiameterInches){
		this.treeType= treeType;
		this.heightOfTree= heightOfTree;
		this.trunkDiameterInches= trunkDiameterInches;
	}
	
	public double getHeightOfTree() {
		return heightOfTree;
	}
	
	public double getTrunkDiameterInches() {
		return trunkDiameterInches;
	}
	
	public TreeType getTreeType() {
		return treeType;
	}
	
	public void setHeightOfTree(double heightOfTree) {
	this.heightOfTree = heightOfTree;	
	}
	
	static void announceTree() {
		System.out.println("Lookout at that " + TRUNK_COLOR + " tree!");
	}
	
	public void grow() {
		this.heightOfTree = this.heightOfTree + 10;
		System.out.println( "The height of "+ treeType +" is now:" + this.heightOfTree );
		this.trunkDiameterInches = this.trunkDiameterInches + 4;
		System.out.println( "The diameter of "+ treeType +" treetrunk is now:" + this.trunkDiameterInches );
	}
	
	public void displayTallerTree() {
		if(this.heightOfTree > 10) {
			System.out.println("That's a tall " + this.treeType + " tree!");
		}
	}
	
	public void displayLargerGirthTree() {
		if(this.trunkDiameterInches > 8) {
			System.out.println("That's a Large girth " + this.treeType + " tree!");
		}
	}
}
