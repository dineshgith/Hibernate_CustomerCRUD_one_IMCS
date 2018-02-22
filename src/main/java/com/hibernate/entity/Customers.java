package com.hibernate.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "customers")
@Data
public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "customer_id")
	private Integer customerId;

	private String title;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "middle_name")
	private String middleName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	private String suffix;

	@Column(unique = true)
	private String email;

	private String company;

	@Column(name = "display_name")
	private String displayName;

	@Column(name = "print_on_check")
	private String printOnCheckAs;

	@Column(name = "billing_street")
	private String billingStreet;

	@Column(name = "billing_city")
	private String billingCity;

	@Column(name = "billing_state")
	private String billingState;

	@Column(name = "billing_zip")
	private Integer billingZip;

	@Column(name = "billing_country")
	private String billingCountry;

	@Column(name = "shipping_street")
	private String shippingStreet;

	@Column(name = "shipping_city")
	private String shippingCity;

	@Column(name = "shipping_state")
	private String shippingState;

	@Column(name = "shipping_zip")
	private Integer shippingZip;

	@Column(name = "shipping_country")
	private String shippingCountry;

	@Column(name = "other_details")
	private String otherDetails;

	@OneToMany(mappedBy = "customerId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<Orders> orders = new HashSet<Orders>();

	public Customers(Integer customerId, String title, String firstName, String middleName, String lastName,
			String suffix, String email, String company, String displayName, String printOnCheckAs,
			String billingStreet, String billingCity, String billingState, Integer billingZip, String billingCountry,
			String shippingStreet, String shippingCity, String shippingState, Integer shippingZip,
			String shippingCountry, String otherDetails, Set<Orders> orders) {
		super();
		this.customerId = customerId;
		this.title = title;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.suffix = suffix;
		this.email = email;
		this.company = company;
		this.displayName = displayName;
		this.printOnCheckAs = printOnCheckAs;
		this.billingStreet = billingStreet;
		this.billingCity = billingCity;
		this.billingState = billingState;
		this.billingZip = billingZip;
		this.billingCountry = billingCountry;
		this.shippingStreet = shippingStreet;
		this.shippingCity = shippingCity;
		this.shippingState = shippingState;
		this.shippingZip = shippingZip;
		this.shippingCountry = shippingCountry;
		this.otherDetails = otherDetails;
		this.orders = orders;
	}

	public Customers() {
		super();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customers [customerId=");
		builder.append(customerId);
		builder.append(", title=");
		builder.append(title);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", middleName=");
		builder.append(middleName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", suffix=");
		builder.append(suffix);
		builder.append(", email=");
		builder.append(email);
		builder.append(", company=");
		builder.append(company);
		builder.append(", displayName=");
		builder.append(displayName);
		builder.append(", printOnCheckAs=");
		builder.append(printOnCheckAs);
		builder.append(", billingStreet=");
		builder.append(billingStreet);
		builder.append(", billingCity=");
		builder.append(billingCity);
		builder.append(", billingState=");
		builder.append(billingState);
		builder.append(", billingZip=");
		builder.append(billingZip);
		builder.append(", billingCountry=");
		builder.append(billingCountry);
		builder.append(", shippingStreet=");
		builder.append(shippingStreet);
		builder.append(", shippingCity=");
		builder.append(shippingCity);
		builder.append(", shippingState=");
		builder.append(shippingState);
		builder.append(", shippingZip=");
		builder.append(shippingZip);
		builder.append(", shippingCountry=");
		builder.append(shippingCountry);
		builder.append(", otherDetails=");
		builder.append(otherDetails);
		builder.append(", orders=");
		builder.append(orders);
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();

	}

	public Customers(String title, String firstName, String middleName, String lastName, String suffix, String email,
			String company, String displayName, String printOnCheckAs, String billingStreet, String billingCity,
			String billingState, Integer billingZip, String billingCountry, String shippingStreet, String shippingCity,
			String shippingState, Integer shippingZip, String shippingCountry, String otherDetails) {
		super();
		this.title = title;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.suffix = suffix;
		this.email = email;
		this.company = company;
		this.displayName = displayName;
		this.printOnCheckAs = printOnCheckAs;
		this.billingStreet = billingStreet;
		this.billingCity = billingCity;
		this.billingState = billingState;
		this.billingZip = billingZip;
		this.billingCountry = billingCountry;
		this.shippingStreet = shippingStreet;
		this.shippingCity = shippingCity;
		this.shippingState = shippingState;
		this.shippingZip = shippingZip;
		this.shippingCountry = shippingCountry;
		this.otherDetails = otherDetails;
	}
}
