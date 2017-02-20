Test rest service using postman
install chrome postman plugin
Test Login

URL: http://localhost:8888/auth - post request
payload : enter the following in the body tab
 {"username": "admin", "password": "admin"}

this returns joken

Test webservice
URL : http://localhost:8888/topics
in  headers tab
content-type:application/json
Authorization: token
submit 