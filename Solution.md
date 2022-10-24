# Task 1
1. updated application.yaml file to add variable addresses:blackListing:enabled = true
2. Added first Test case for invalid postcode to address controller test
3. Modified address controller to add logic (handling with standard Runtime Exception)
4. Added test and BlackListServiceException to handle BlackListService exceptions
5. Added some more test case with CAPS post code which failed 
6. Updated the controller to ignore case of the postcode

# Task 2
1. BlackListService throws IOException randomly/ service not in control of the solution scope
2. One way of handling this is to introduce retry mechanism when we get exception
3. Number of retries is configured in application.yaml file
4. implement retry mechanism to call BlackListService
5. write unit test case to test the functionality


# Task 3
1. Introduce Customer properties file and define customer specific variables to diff cust properties
2. Add more test coverage for edge/negative scenarios
3. add integration tests
4. BlackListingCalling Service can be added to separate out calling mechanism with retry
5. code can be refactored based on new service 
6. list method can be refactored to make it more readable. 


