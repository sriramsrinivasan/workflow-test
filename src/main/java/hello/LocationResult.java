package hello;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
@JsonTypeName("LocationResult")

@JsonInclude(Include.NON_NULL)
public class LocationResult {
	
	private Long id = null;
	private String name = null;
	private String formattedAddress = null;
	private String latitude = null;
	private String longitude = null;
	
	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public LocationResult(){
		
	}
	
	public LocationResult(Long id, String name, String formattedAddress) {
		super();
		this.id = id;
		this.name = name;
		this.formattedAddress = formattedAddress;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFormattedAddress() {
		return formattedAddress;
	}
	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}

}
