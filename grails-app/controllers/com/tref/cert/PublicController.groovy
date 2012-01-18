package com.tref.cert

class PublicController {

    def index() { }
    
    def showCert = {
    		[cert:Certificate.get(params.id)]
    }
    
    def widgetCert = {
    		[cert:Certificate.get(params.id)]
    }
    
    def createCert = {
    		
    }
    
    def editCert = {
    		[cert:Certificate.get(params.id)]
    }
    
    def showCertCustomer = {
    		[cert:Certificate.get(params.id)]
    }
    
    def prepareSendingCert = {
    		
    }
    
    def confirmSendCert = {
    		
    }
}
