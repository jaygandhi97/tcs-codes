package files;

public class soln2_1 {

	public static void main(String[] args) {
	
			Library library1= new Library(33,"drfnfuk","cqisthj");
			Library library2= new Library(78,"xhzebcf","nnpwbrf");
			Library library3= new Library(68,"qnoquku","qstcebj");
			Library library4= new Library(81,"ghgwsjm","xlewgbj");
			Library library5= new Library(47,"wgioqsg","vjtwscm");
			Library libraryRes1= new Library(56,"rmgjynm","qxkhlbb");
		Library[] objArray= {library1,library2,library3,library4,library5};
		boolean value =replacebyid( objArray,libraryRes1);System.out.println(value);
		//if (objArray1.length>=1) {System.out.println("Displaying contents of array: ");
		if (value==true) {System.out.println("Output for performing replace on libraryRes1 is:"+ value); {
			for (Library c:objArray) {
				System.out.println(c.getId()+" "+c.getAddress()+" "+c.getName());}}}
		else  {
			System.out.println("Output for performing replace on libraryRes1 is:"+ value);
		}
	}
			
			//}}else {System.out.println("Output after first search is null. ");}}

	
	public static boolean replacebyid(Library[] objArray,Library abc) {
int a=0;int b=0;
	for (int i=0;i<objArray.length;i++) {
		
		if (objArray[i].getId()== abc.getId()) {
			//System.out.println(objArray[i].getId()+""+objArray[i].getName()+""+objArray[i].getAddress());
		
		objArray[i].setName(abc.getName());
		objArray[i].setAddress(abc.getAddress());
		a=a+1;} 
		
		else	 {
			b=0;
		}
	

	
	
}
	if (a==1) {return true;}
	else {return false;}
}
}

class Library{
private int  id;
private String  name;
private String address;
public Library(int id, String name, String address) {
	this.id = id;
	this.name = name;
	this.address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}