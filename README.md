# UserClient

Simple API Client app, based on the following specification:

* The client java class should be called `UserClient`
* It contains only one public method called `users()`
* The method should not have any arguments
* The method should return users returned here: `https://randomuser.me/api/`
* The method should return a List of DTOs with the following information:
    * Gender
    * First name
    * Last name
    * City
    * Login uuid
    * Registration date

To implement the client use: 
1. `RestTemplate` (from Spring Framework)
2. Java 8 or higher
3. Unit tests
