public class GenericList<T> extends AbstractCollection<T> implements Deque<T>, Cloneable, Serializable {
   T[]a;
   int n;
   int puppyAge;
   public GenericList() {

   }
   public int size()
   {
	return n;
   }

   public T get(int i)
   {
	return a[i];
   }
   public T set(int i, T x)
   {
	T y = a[i];
  	a[i] = x;
	return y;
   }
   public void add(int i,T x)
   {
	if (n + 1 > a.length) resize;
        for (int j = n; j > i;j--)
		a[j] = a[i-1];

	a[i] = x;
	n++;
   }
   public T remove(int i)
   {
	T x = a[i];
	for (int j = i;j < n-1; j++)
	{
		a[j] = a[j+1];
	}
 	n--;
        if (a.length >= 3*n) resize();
        return x;
   }
   private void resize()
   {
	T[] b = newArray(max(n*2,1));
  	for(int i = 0; i < n;i++)
 	{
		b[i]
	}
   }
   public void printMessage(string message)
   {
	  System.out.println(message );
   }
   public void printMessage2(string message)
   {
	  System.out.println("This is the second Message Option: " + message );
   }
   public void printMessage3(string message)
   {
	  System.out.println("This is the third Message Option: " + message );
   }
   public void printMessage4(string message)
   {
	  System.out.println("This is the fourth Message Option: " + message );
   }
   public void printMessage5(string message)
   {
	  System.out.println("This is the fifth Message Option: " + message );
   }









   public static void main(String []args) {
      /* Object creation */
      Puppy myPuppy = new Puppy( "tommy" );

      /* Call class method to set puppy's age */
      myPuppy.setAge( 2 );

      /* Call another class method to get puppy's age */
      myPuppy.getAge( );

      /* You can access instance variable as follows as well */
      System.out.println("Variable Value :" + myPuppy.puppyAge );
   }
}
