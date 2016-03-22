/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author a123
 */
public class Reservation {
    private String reservationCode;
    private Guest guestDetail;
    private Room roomDetail;
    private BillingInformation billingInformation;
    private Date checkInDate;
    private Date checkOutDate;
    private int numberOfAdults;
    private int numberOfChildren;
    private ReservationStatus reservationStatus;
    
    public Reservation(){
        String reservationCode;
        Guest guestDetail;
        Room roomDetail;
        BillingInformation billingInformation;
        Date checkInDate;
        Date checkOutDate;
        int numberOfAdults;
        int numberOfChildren;
        ReservationStatus reservationStatus;
    }
    
    public String getReservationCode(){
        return reservationCode;
    }
    
    public void setReservationCode(String newRCode){
        
    }
    
    public Guest getGuestDetail(){
        return guestDetail;
    }
    
    public void setGuestDetail(Guest guestDetail){
        
    }
    
    public void printReceipt(){
        
    }
    
    public ReservationStatus getReservationStatus(){
     return reservationStatus;   
    }
    
    public void setReservationStatus(ReservationStatus newRStatus){
        
    }
    
    public BillingInformation getbillingInformation(){
        return billingInformation;
    }
    
    public void setbillingInformation(BillingInformation newBInfo){
        
    }
    
}
