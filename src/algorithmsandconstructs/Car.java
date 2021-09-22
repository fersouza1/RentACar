/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmsandconstructs;
import algorithmsandconstructs.enums.Make;
import algorithmsandconstructs.enums.Month;
import java.util.HashMap;
import java.util.Map;

public class Car implements CarInterface{
    
    public Make make;
    public double dailyrate;
    public int id;
    public Map availability;
    public boolean isAvailable;
    public int day;
    public Month numofDays;
  
 
   

    @Override
    public Map<Month, boolean[]> createAvailability() {
        
        Map<Month, boolean[]> availability = new HashMap<Month, boolean[]>();
   
        availability.put(Month.JANUARY, new boolean[] {true, false});
        availability.put(Month.FEBRUARY, new boolean[] {true, false});
        availability.put(Month.MARCH, new boolean[] {true, false});
        availability.put(Month.APRIL, new boolean[] {true, false});
        availability.put(Month.MAY, new boolean[] {true, false});
        availability.put(Month.JUNE, new boolean[] {true, false});
        availability.put(Month.JULY, new boolean[] {true, false});
        availability.put(Month.AUGUST, new boolean[] {true, false});
        availability.put(Month.SEPTEMBER, new boolean[] {true, false});
        availability.put(Month.OCTOBER, new boolean[] {true, false});
        availability.put(Month.NOVEMBER, new boolean[] {true, false});
        availability.put(Month.DECEMBER, new boolean[] {true, false});
            
        return availability;
        
        
    
    }
    

    @Override
    public Make getMake() {
        return make;
    }

    @Override
    public void setMake(Make make) {
        this.make = make;
    }

    @Override
    public double getRate() {
        return dailyrate;
    }

    @Override
    public void setRate(double rate) {
        this.dailyrate = rate;
    }

    @Override
    public Map<Month, boolean[]> getAvailability() {
        return availability;
    }

    @Override
    public void setAvailability(Map<Month, boolean[]> availability) {
      this.availability = availability;
       
    }

    @Override
    public int getId() {
       return id;
    }

    @Override
    public boolean isAvailable(Month month, int day) {
       if(availability.equals(true)){
           return true;
       }else{
           return false; 
        }
    }

    @Override
    public boolean book(Month month, int day) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

 
