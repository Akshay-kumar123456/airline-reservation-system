package com.springboot.main.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String code;
	private LocalDateTime departuretime;
	private LocalDateTime arrivaltime;
	private int avaliableseats;
	private double price;
	
	@ManyToOne
	private Route route;
	@ManyToOne
	private Airline airline;
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	public Airline getAirline() {
		return airline;
	}
	public void setAirline(Airline airline) {
		this.airline = airline;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public LocalDateTime getDeparture_time() {
		return departuretime;
	}
	public void setDeparture_time(LocalDateTime departuretime) {
		this.departuretime = departuretime;
	}
	public LocalDateTime getArrival_time() {
		return arrivaltime;
	}
	public void setArrival_time(LocalDateTime arrivaltime) {
		this.arrivaltime = arrivaltime;
	}
	public int getAvaliable_seats() {
		return avaliableseats;
	}
	public void setAvaliable_seats(int avaliableseats) {
		this.avaliableseats = avaliableseats;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Flight [id=" + id + ", code=" + code + ", departure_time=" + departuretime + ", arrivaltime="
				+ arrivaltime + ", avaliableseats=" + avaliableseats + ", price=" + price + ", route=" + route
				+ ", airline=" + airline + "]";
	}
	
	
	
	
	
}
