package com.tref.cert

class Company {
	
	String name
	String url
	String ceo
	String address
	String city
	String postalCode
	String country
	String taxId
	String vat
	String about
	String ceoPicUrl
	String email

    static constraints = {
		name minSize:2, maxSize:100
		url nullable:true, url:true
		ceo nullable:true
		address nullable:true
		city nullable:true
		postalCode nullable:true
		country nullable:true
		taxId nullable:true
		vat nullable:true
		about nullable:true
		ceoPicUrl nullable:true, url:true
		email nullable:true, email:true
    }
	static hasMany = [Certificate, Account]
}
