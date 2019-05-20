package com.cap.sakila.sakiladatabase.hib;
// Generated Apr 22, 2019 8:26:00 AM by Hibernate Tools 5.2.10.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Proxy;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * City generated by hbm2java
 */
@Entity
@Table(name = "city", catalog = "sakila")
@Proxy(lazy=false)
public class City implements java.io.Serializable {

	private Short cityId;
	@JsonManagedReference
	private Country country;
	private String city;
	private Date lastUpdate;
	@JsonBackReference
	private Set<Address> addresses = new HashSet<Address>(0);

	public City() {
	}

	public City(Country country, String city, Date lastUpdate) {
		this.country = country;
		this.city = city;
		this.lastUpdate = lastUpdate;
	}

	public City(Country country, String city, Date lastUpdate, Set<Address> addresses) {
		this.country = country;
		this.city = city;
		this.lastUpdate = lastUpdate;
		this.addresses = addresses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "city_id", unique = true, nullable = false)
	public Short getCityId() {
		return this.cityId;
	}

	public void setCityId(Short cityId) {
		this.cityId = cityId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "country_id", nullable = false)
	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Column(name = "city", nullable = false, length = 50)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_update", nullable = false, length = 26)
	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "city")
	public Set<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

}