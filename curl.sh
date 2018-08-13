#!/bin/bash

curl http://127.0.0.1:8080/api/film/all?pagenum=28&pagesize=14

curl -l -H "Content-type: application/json" -X POST -d {"storeId": 2,"firstName": "GOLDFINGER","lastName": "Epistle",
"email": "A@B.com","addressId": 6,"createDate": "2006-02-14 22:04:37"}' http://localhost:8080/api/user

curl -l -H "Content-type: application/json" -X PUT
    -d '{
            "customerId": 600,
            "storeId": 1,
            "addressId": 77
        }' http://localhost:8080/api/user

curl http://localhost:8080/api/user/600