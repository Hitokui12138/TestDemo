package M2_02_CollectionAndMap;

import java.util.Objects;

public class TreeSetItem implements Comparable<TreeSetItem>{
	private String description;
	private int partNumber;
	
	public TreeSetItem (String description,int partNumber){
		this.description = description;
		this.partNumber = partNumber;
	}
	
	@Override
	public String toString() {
		return description + partNumber;
	}
	
	public boolean equeal(Object otherObj) {
		if(this == otherObj) return true;
		else return false;
	}
	
	public int hashCode() {
		return Objects.hash(description,partNumber);
	}
	
	public int compareTo(TreeSetItem other) {
		int diff = Integer.compare(partNumber, other.partNumber);
		return diff!=0?diff:description.compareTo(other.description);
	}
	
	
	public String getDescription() {
		return description;
	}

	public int getPartNumber() {
		return partNumber;
	}	
}
