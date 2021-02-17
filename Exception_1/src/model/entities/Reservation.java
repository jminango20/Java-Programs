package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {

	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	//public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException { //Usado com Exception
	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) { //Usado com RuntimeException
		if(!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}	
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	//Long pois datas usam esse jeti
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime(); //diferenca datas em ms
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); //Converte valor de ms para dias			
	}
	
	//public void updateDates(Date checkIn, Date checkOut) throws DomainException {	//Metodo que pode lanzar uma excepcao	
    public void updateDates(Date checkIn, Date checkOut) {	//Usando RuntimeException	

		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			//throw new IllegalArgumentException("Reservation dates for update must be future dates"); //Normal
			throw new DomainException("Reservation dates for update must be future dates"); //Personalizado
		}
		if(!checkOut.after(checkIn)) {
			//throw new IllegalArgumentException("Check-out date must be after check-in date"); //Normal
			throw new DomainException("Check-out date must be after check-in date");
		}		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	//toString es una sobreposicao
	@Override
	public String toString() {
		return "Room "
			+ roomNumber
			+ ", check-in: "
			+ sdf.format(checkIn) 
			+ ", check-out: "
			+ sdf.format(checkOut)
			+ ", "
			+ duration()
			+ " nigths";

	}
	
	
	
}
