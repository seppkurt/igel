package com.tref.cert

class Account {
	
	String firstName
	String lastName
	String email

    static constraints = {
		firstName nullable:true
		lastName nullable:true
		email email:true
    }
	static belongsTo = [company:Company]
}
