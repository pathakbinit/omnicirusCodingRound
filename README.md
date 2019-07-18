E-Comerce Rest APIs:

There are two controller classes (API classes).

1) ProductController: This class contains all the APIs related to products. Below are the api details:
    
    1) "/add/product" : This api is used for adding products: 
       
       METHOD: POST
       Payload: {
                	"price":134.45,
	                "availableQuantity":10,
	                "productName":"Book2",
	                "productType":"BOOKS"
                 }
                 
        Response: {
                    "entity": {
                        "productId": 11,
                        "price": 334.45,
                        "availableQuantity": 20,
                        "productName": "Denim T-shirt",
                         "productType": "CLOTHING"
                               },
                     "status": 202,
                     "metadata": {},
                     "annotations": null,
                     "entityClass": "com.omnicirus.models.Product",
                     "genericType": null,
                     "length": -1,
                     "language": null,
                     "location": null,
                     "closed": false,
                     "mediaType": null,
                     "allowedMethods": [],
                     "cookies": {},
                     "links": [],
                     "statusInfo": "ACCEPTED",
                     "entityTag": null,
                     "stringHeaders": {},
                     "lastModified": null,
                     "date": null,
                     "headers": {}
                    }      
                    
                    
