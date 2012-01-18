package com.tref.cert

class Certificate {

	String name
	String picUrl
	Date dateCreated
	String description
	
    static constraints = {
		name maxSize:100
		picUrl nullable:true, url:true
		description nullable:true
		recepients nullable:true
    }
	static belongsTo = [owner:Account]
	static hasMany  = [recepients:Account]
}
