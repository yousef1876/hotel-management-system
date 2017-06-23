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
@Table( name = "room_info" )
public class Room {

	@Id
	@GeneratedValue( strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
    private Long id;

	@Column( name = "room_no" , nullable = false )
	private String roomNo;
	
	@Column(name = "room_type" , nullable = false )
	private String roomType;

	@OneToMany(fetch = FetchType.LAZY , mappedBy = "rooms")
	private List<CheckIn> rooms ;
	
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "rooms")
	private List<CheckOut> checkOutRoom ;
	
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "rooms")
	private List<Booking> roomBk ;
	
	
	
	public List<Booking> getRoomBk() {
		return roomBk;
	}

	public void setRoomBk(List<Booking> roomBk) {
		this.roomBk = roomBk;
	}

	public List<CheckOut> getCheckOutRoom() {
		return checkOutRoom;
	}

	public void setCheckOutRoom(List<CheckOut> checkOutRoom) {
		this.checkOutRoom = checkOutRoom;
	}

	public List<CheckIn> getRooms() {
		return rooms;
	}

	public void setRooms(List<CheckIn> rooms) {
		this.rooms = rooms;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
}
