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

    2) "/update/product" This api is used for updating an existing product.   
        METHOD: POST
        Payload: {
                    "productId":4,   //This is must
                    "price":134.45,
                    "availableQuantity":10,
                    "productName":"Book2",
                    "productType":"BOOKS"
                  }             
        Response:       
                 {
                    "entity": {
                        "productId": 3,
                        "price": 134.45,
                        "availableQuantity": 10,
                        "productName": "Book2",
                        "productType": "BOOKS"
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
                        "cookies": {},
                        "mediaType": null,
                        "allowedMethods": [],
                        "lastModified": null,
                        "date": null,
                        "statusInfo": "ACCEPTED",
                        "entityTag": null,
                        "links": [],
                        "stringHeaders": {},
                        "headers": {}
                    }      
                    
    3) "/get/product/byType/{type}" : This api is used for getting all the products of a given type.Type can be CLOTHING, ELECTRONICS,  HOME_APPLIANACES, BOOKS


        METHOS: GET

        Response: {
            "entity": [
            {
                "productId": 1,
                "price": 334.45,
                "availableQuantity": 0,
                "productName": "Denim T-shirt",
                "productType": "CLOTHING"
                },
                {
                    "productId": 2,
                    "price": 1334.45,
                    "availableQuantity": 20,
                    "productName": "Denim shirt",
                    "productType": "CLOTHING"
                    },
                    {
                        "productId": 11,
                        "price": 334.45,
                        "availableQuantity": 20,
                        "productName": "Denim T-shirt",
                        "productType": "CLOTHING"
                    }
                    ],
                    "status": 202,
                    "metadata": {},
                    "annotations": null,
                    "entityClass": "java.util.ArrayList",
                    "genericType": null,
                    "length": -1,
                    "language": null,
                    "location": null,
                    "closed": false,
                    "cookies": {},
                    "mediaType": null,
                    "allowedMethods": [],
                    "lastModified": null,
                    "date": null,
                    "statusInfo": "ACCEPTED",
                    "entityTag": null,
                    "links": [],
                    "stringHeaders": {},
                    "headers": {}
                } 
    
    4) "/del/product/{productId}": This api used for deleting an existing product.

        METHOD: DELETE

        Response: {
            "entity": "There is no product with the given ID",
            "status": 500,
            "metadata": {},
            "annotations": null,
            "entityClass": "java.lang.String",
            "genericType": null,
            "length": -1,
            "language": null,
            "location": null,
            "closed": false,
            "cookies": {},
            "mediaType": null,
            "allowedMethods": [],
            "lastModified": null,
            "date": null,
            "statusInfo": "INTERNAL_SERVER_ERROR",
            "entityTag": null,
            "links": [],
            "stringHeaders": {},
            "headers": {}
        }

    5) "/get/product/all": This method is used for getting all the saved products.
    

        METHOD: GET

        Response: {
            "entity": [
            {
                "productId": 1,
                "price": 334.45,
                "availableQuantity": 0,
                "productName": "Denim T-shirt",
                "productType": "CLOTHING"
                },
                {
                    "productId": 2,
                    "price": 1334.45,
                    "availableQuantity": 20,
                    "productName": "Denim shirt",
                    "productType": "CLOTHING"
                    },
                    {
                        "productId": 3,
                        "price": 134.45,
                        "availableQuantity": 10,
                        "productName": "Book2",
                        "productType": "BOOKS"
                        },
                        {
                            "productId": 11,
                            "price": 334.45,
                            "availableQuantity": 20,
                            "productName": "Denim T-shirt",
                            "productType": "CLOTHING"
                        }
                        ],
                        "status": 202,
                        "metadata": {},
                        "annotations": null,
                        "entityClass": "java.util.ArrayList",
                        "genericType": null,
                        "length": -1,
                        "language": null,
                        "location": null,
                        "closed": false,
                        "cookies": {},
                        "mediaType": null,
                        "allowedMethods": [],
                        "lastModified": null,
                        "date": null,
                        "statusInfo": "ACCEPTED",
                        "entityTag": null,
                        "links": [],
                        "stringHeaders": {},
                        "headers": {}
                    }    

    6) "/get/product/{productId}": This api is ued for getting a product based on productId.
    
        METHOD: GET

        Response: {
            "entity": {
                "productId": 3,
                "price": 134.45,
                "availableQuantity": 10,
                "productName": "Book2",
                "productType": "BOOKS"
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
                "cookies": {},
                "mediaType": null,
                "allowedMethods": [],
                "lastModified": null,
                "date": null,
                "statusInfo": "ACCEPTED",
                "entityTag": null,
                "links": [],
                "stringHeaders": {},
                "headers": {}
            }                

2) OrderController: This class contains all the APIs related to order making. Below are the api details:

    1) "/create/order": This api is ued for creating an order. This api gives total cost of the items that are selected by user along with product details.If the items are out of stock then user will get an error message as "Items are out of stock currently".

        METHOD: POST

        Payload:{
            "username":"bin1",
            "emailId":"dsd@dd.com",
            "address":"banglore",
            "itemDomain":[
            {
                "productId":3,
                "reqdQuantity":2
                },
                {
                    "productId":1,
                    "reqdQuantity":2
                }
                ]
            }

          Response: {
                "entity": {
                    "orderId": 19,
                    "total": 268.9,
                    "userName": "bin1",
                    "userEmail": "dsd@dd.com",
                    "address": "banglore",
                    "orderName": null,
                    "items": [
                    {
                        "id": 21,
                        "product": {
                            "productId": 3,
                            "price": 134.45,
                            "availableQuantity": 8,
                            "productName": "Book2",
                            "productType": "BOOKS"
                            },
                            "reqdQuantity": 2
                        }
                        ]
                        },
                        "status": 202,
                        "metadata": {},
                        "annotations": null,
                        "entityClass": "com.omnicirus.models.Order",
                        "genericType": null,
                        "length": -1,
                        "language": null,
                        "location": null,
                        "closed": false,
                        "cookies": {},
                        "mediaType": null,
                        "allowedMethods": [],
                        "lastModified": null,
                        "date": null,
                        "statusInfo": "ACCEPTED",
                        "entityTag": null,
                        "links": [],
                        "stringHeaders": {},
                        "headers": {}
                    }    

    2) "/update/order/{orderId}" : This api is ued to update an existing order. The orderId is a must send parameter. If the order is not present then user will get an error message as "Order not present". And if the items are out of stock then user will get an error message as "Items are out of stock currently".

        METHOD: PUT

        Payload: {
            "username":"bin111",
            "emailId":"dsd@dd.com",
            "address":"banglore",
            "itemDomain":[
            {
                "productId":1,
                "reqdQuantity":2
            }
            ]
        }

        Response: {
            "entity": {
                "orderId": 20,
                "total": 2668.9,
                "userName": "bin111",
                "userEmail": "dsd@dd.com",
                "address": "banglore",
                "orderName": null,
                "items": [
                {
                    "id": 22,
                    "product": {
                        "productId": 2,
                        "price": 1334.45,
                        "availableQuantity": 18,
                        "productName": "Denim shirt",
                        "productType": "CLOTHING"
                        },
                        "reqdQuantity": 2
                    }
                    ]
                    },
                    "status": 202,
                    "metadata": {},
                    "annotations": null,
                    "entityClass": "com.omnicirus.models.Order",
                    "genericType": null,
                    "length": -1,
                    "language": null,
                    "location": null,
                    "closed": false,
                    "lastModified": null,
                    "date": null,
                    "mediaType": null,
                    "allowedMethods": [],
                    "cookies": {},
                    "links": [],
                    "statusInfo": "ACCEPTED",
                    "entityTag": null,
                    "stringHeaders": {},
                    "headers": {}
                }


How to run the application:
1) Check the mysql username and password. For me it it root root.
2) Simply use command mvn spring-boot:run                
