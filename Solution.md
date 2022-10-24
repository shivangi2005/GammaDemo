# Task 1
1. Created Customer1.properties file and added variable addresses.blackListing.enabled = true
2. Added first Test case for invalid postcode to addresscontroller test
3. Modified address controller to add logic (handling with standard Runtime Exception)
4. Added test and BlackListServiceException to handle BlackListService exceptions
5. Added some more test case with CAPS post code which failed 
6. Updated the controller to ignore case of the postcode

# Task 2
1. BlackListService throws IOException randomly/ service not in control of the solution scope
2. One way of handling this is to introduce retry mechanism when we get exception
3. Number of retries can be configured in properties file



# Task 3
1. Introduce Customer properties file and define customer specific variables to diff cust properties
2. Add more test coverage
3. add integration tests
4. 

