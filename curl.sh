#!/bin/bash

echo "-------------------- LOGIN--------------------------"
## login
curl -H "Content-Type:application/json" -X POST --data '{"name":"MARY","password":"SMITH"}' http://192.168.99.100:9090/v1/customers/login

echo "-------------------- GET--------------------------"
##getAllFilm
curl -d "pageNum=10&pageSize=5" --request GET http://192.168.99.100:9090/v1/films/list

echo "--------------------CREATE-----------------------"
## saveCustomer
curl -H "Content-Type: application/json" -X POST --data '
{
"storeId":2,
"firstName":"Li",
"lastName":"si",
"email":"7654321@qq.com",
"addressId":47
}' http://192.168.99.100:9090/v1/customers


echo "--------------------UPDATE-------------------------"
## addCustomer
curl -H "Content-Type: application/json" -X PUT --data '
{
 "customerId":620,
 "storeId":1,
 "firstName":"Lddi",
 "lastName":"sidd",
 "email":"1231231@qq.com",
 "addressId":"65"
 }' http://192.168.99.100:9090/v1/customers

echo "-------------------DELETE---------------------------"
## deleteCustomer
curl -X DELETE http://192.168.99.100:9090/v1/customers/620