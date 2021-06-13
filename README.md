# CST-438-other-Reservations
## URL

[http://localhost:8080/]

## Spring Controller Routes:

Get ("/package") // Display packages
      
Post ("/package/new") // Process reservation
  
Get ("/package/reserve") // A new reservation from a form
    
Get ("/packages") // A new reservation from a form
   
Get ("/locations") // A new reservation from a form

Get ("/userlogin") 	// A user enters their username and password
  
Get ("/usersignup")	// A new user signup form 

Post ("/userlogin") // A new reservation from a form

Post ("/usersignup") // A new reservation from a form

## API Endpoints

## URL

[http://localhost:8080/api/]

## Get All Packages
`/api/allpackages`

`Type: GET`

**Description**: This route returns all the reservation packages stored in the table

### Parameters 
`none`

### Example
 `http://localhost:8080/api/allpackages`
### Response

```
[{"packageId":1,"userId":1,"airlineId":9,"hotelId":55,"carId":3,"pkgDescription":"Test Package Desc 5","destination":"boston","departureDate":"2025-06-15","returnDate":"2025-07-01","originCity":"new york"},{"packageId":2,"userId":1,"airlineId":9,"hotelId":55,"carId":3,"pkgDescription":"Test Package Desc 5","destination":"boston","departureDate":"2025-06-15","returnDate":"2025-07-01","originCity":"new york"},{"packageId":3,"userId":1,"airlineId":9,"hotelId":55,"carId":3,"pkgDescription":"Test Package Desc 5","destination":"boston","departureDate":"2025-06-15","returnDate":"2025-07-01","originCity":"new york"},{"packageId":4,"userId":1,"airlineId":9,"hotelId":55,"carId":3,"pkgDescription":"Test Package Desc 5","destination":"boston","departureDate":"2025-06-15","returnDate":"2025-07-01","originCity":"new york"},{"packageId":5,"userId":0,"airlineId":0,"hotelId":0,"carId":0,"pkgDescription":null,"destination":"miami","departureDate":"2021-07-01","returnDate":"2021-08-01","originCity":null},{"packageId":6,"userId":0,"airlineId":0,"hotelId":0,"carId":0,"pkgDescription":null,"destination":"miami","departureDate":"2021-07-01","returnDate":"2021-08-01","originCity":null},{"packageId":7,"userId":0,"airlineId":0,"hotelId":0,"carId":0,"pkgDescription":"going somewhere","destination":"boston","departureDate":"2021-07-01","returnDate":"2021-08-01","originCity":"new york"},{"packageId":8,"userId":0,"airlineId":0,"hotelId":0,"carId":0,"pkgDescription":"going somewhere","destination":"boston","departureDate":"2021-07-01","returnDate":"2021-08-01","originCity":"new york"},{"packageId":9,"userId":0,"airlineId":0,"hotelId":0,"carId":0,"pkgDescription":"going somewhere","destination":"boston","departureDate":"2021-07-01","returnDate":"2021-08-01","originCity":"new york"},{"packageId":10,"userId":0,"airlineId":0,"hotelId":0,"carId":0,"pkgDescription":"going somewhere","destination":"new york","departureDate":"2021-07-01","returnDate":"2021-08-01","originCity":"boston"},{"packageId":11,"userId":122,"airlineId":2322,"hotelId":323223,"carId":423123,"pkgDescription":"going somewhere","destination":"boston","departureDate":"2021-07-01","returnDate":"2021-08-01","originCity":"new york"},{"packageId":12,"userId":0,"airlineId":0,"hotelId":0,"carId":0,"pkgDescription":"rerer","destination":"San Jose","departureDate":"2021-07-01","returnDate":"2021-08-01","originCity":"San Jose"}]
```

## Get Rental Cars
`/api/getCarByCity/{city}`

`Type: GET`

**Description**: This route returns all the rental cars for a city

### Parameters 
`city (required) String`

### Example
`http://localhost:8080/api/getCarByCity/{city}"` 
 
 // Display all the cars available for a city

Get ("/getHotelByCity/{city}") // Display all the hotels available for a city

## Get Hotels
`/api/getHotelByCity/{city}`

`Type: GET`

**Description**: This route returns all the hotels available for a city

### Parameters 
`city (required) String`

### Example
`http://localhost:8080/api/getHotelByCity/{city}"` 
 
 // Display 

## Get Flights
`/api/getFlightByCity/{originCity}/{destination}`

`Type: GET`

**Description**: This route returns all the flights available for a route

### Parameters 
`originCity (required) String, destination (required) String`

### Example
`http://localhost:8080/api/getFlightByCity/{originCity}/{destination}"`
 
