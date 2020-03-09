//Behavioral Patterns-Iterator pattern
package com.patterns.designpatterns;
class IteratorPatternDemo {
	
	public static void main(String[] args) {
	      CollectionofNames cmpnyRepository = new CollectionofNames();
	      
	      for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){
	          String name = (String)iter.next();
	          System.out.println("Name : " + name);
	       } 	
	      
	}
}
class CollectionofNames implements Container {

	 public String name[]={"rakesh", "polu","Rakeshsai","polusai","psr"}; 
	
	 public int age[]={26, 25,24,25,23}; 
		
	 public String address[]={"New Delhi", "Gaziabad","Rishi Kumar","Rahul Mehta","Hemant Mishra"}; 
	 
	 public String designation[]={"Java Programmer and Content Writer", "CEO","Programmer and Web Designer","Manager",".Net Trainer"};
		
	
	@Override
	public Iterator getIterator() {
		
		return new CollectionofNamesIterate() ;
	}
	
	
	private class CollectionofNamesIterate implements Iterator{
		
		int i;

		@Override
		public boolean hasNext() {
			if (i<name.length){
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if(this.hasNext()){
	            return name[i++];
			}
		    return null;	
		}
	
	}
}
interface Container {

	public Iterator getIterator();
	
}
interface Iterator {
	
	public boolean hasNext();
	
	public Object next();

}
