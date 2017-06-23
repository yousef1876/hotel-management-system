package com.application.hotel.model.all;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table( name = "classification" )
public class HotelClassification {

	@Id
	@GeneratedValue( strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	@JoinColumn(name = "hotel_id" , nullable = false)
	private Hotel hotels;
	
	@Column( name = "star_no" , nullable = false)
	private String starNo;
	
	@Column(name = "iso_no" , nullable = true )
	private String isoNo;
	
	@Column( name = "floors_no" , nullable = true)
	private String floorsNo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Hotel getHotels() {
		return hotels;
	}

	public void setHotels(Hotel hotels) {
		this.hotels = hotels;
	}

	public String getStarNo() {
		return starNo;
	}

	public void setStarNo(String starNo) {
		this.starNo = starNo;
	}

	public String getIsoNo() {
		return isoNo;
	}

	public void setIsoNo(String isoNo) {
		this.isoNo = isoNo;
	}

	public String getFloorsNo() {
		return floorsNo;
	}

	public void setFloorsNo(String floorsNo) {
		this.floorsNo = floorsNo;
	}

}
