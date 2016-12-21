public class Coordinate {
   
   
   private double X = 0;
   private double  Y = 0;
   private double Z = 0;
   private double Geoid_Seperation = 0;
   
   public Coordinate(double x, double y, double z, double geoid_seperation) {
       this.set_x(x);
       this.set_y(y);
       this.set_z(z);
       this.set_geoid_seperation(geoid_seperation);

   }
   
   public double  get_x()
   {
	return this.X;
   }
   public void  set_x(double x)
   {
	this.X = x;
   }

   public double  get_y()
   {
	return this.Y;
   }
   public void  set_y(double y)
   {
	this.Y= y;
   }

   public double  get_z()
   {
	return this.Z;
   }
   public void  set_z(double z)
   {
	this.Z= z;
   }

  
   public double  get_geoid_seperation()
   {
	return this.Geoid_Seperation;
   }
   public void  set_geoid_seperation(double geoid_seperation)
   {
	this.Geoid_Seperation = geoid_seperation;
   }

   
}