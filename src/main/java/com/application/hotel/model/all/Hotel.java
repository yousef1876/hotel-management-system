package com.application.hotel.model.all;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table ( name = "hotel_info")
public class Hotel {
	
	@Id
	@GeneratedValue( strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;
	
	@Column( name = "hotel_name" , nullable = false)
	private String hotelName;
	
	@Column(name = "hotel_address" , nullable = false)
	private String hotelAddress;

	@OneToMany(fetch = FetchType.LAZY , mappedBy = "hotels")
	private List<HotelClassification> hotels;
	
	public List<HotelClassification> getHotels() {
		return hotels;
	}

	public void setHotels(List<HotelClassification> hotels) {
		this.hotels = hotels;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelAddress() {
		return hotelAddress;
	}

	public void setHotelAddress(String hotelAddress) {
		this.hotelAddress = hotelAddress;
	}
	
}
