
import javax.swing.JOptionPane;


public class Car {
	
		private String color;
		private String horsepower;
		private String enginesize;
		public static int carCount;
		public boolean equals(Car Car){
			return (this.color .equals(Car.color))
					&& (this.horsepower .equals(Car.horsepower))
					&& (this.enginesize.equals(Car.enginesize));
		}
		
		public Car() { 
			this.color = "purple ";
			this.horsepower = "8";
			this.enginesize = "0"; 
			carCount++;
			
		}
		
		public Car(String color, String horsepower, String enginesize) {
			this.color = color;
			this.horsepower = horsepower;
			this.enginesize = enginesize; 
		}
		
		public String getColor() {
			return this.color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getHorsepower() {
			return this.horsepower;
		}
		public String setHorsepower(String horsepower) {
			return this.horsepower = horsepower;
		}
		public String getEnginesize() {
			return this.enginesize;
		}
		public void setEnginesize(String enginesize) { 
			this.enginesize = enginesize;
		}
		public String toString() {
			return  "The vehicle is the color..." + this.color + " has " + this.horsepower + (" amount of horsepower and ") 
		+ this.enginesize + " cylinders ";
		}
		public static int getcarCount() {
			return carCount;
		
		

		

		}


}

