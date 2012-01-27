package com.tref.cert

class BootStrap {

    def init = { servletContext ->

    	def company = new Company(name:'Foo Inc.').save()
    	def owner = new Account(company:company, email:'foo@example.com').save()
    	def cert = new Certificate(owner:owner, name:'Bar Cert').save()
    
    }
    def destroy = {
    }
}
