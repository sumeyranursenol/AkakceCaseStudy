## API Automation Test
This project imports a test automation developed using Rest Assured and TestNG to test the /posts endpoint of the JSONPlaceholder API.

---
### Task Requests
Listed below are the test scenarios developed within the scope of the project:
- Status Code Test: 
A GET request is sent to the API.
It is verified whether the returned HTTP status code is 200 OK.
- JSON Structure Validation: It is checked that the JSON output returned from the API contains an array.
Verifies if the first post has the following fields: userId, ID, title,body
- Validating a Specific Value: The post with id value 1 is called.It is verified that the title field is not empty.
- List Length Control: The JSON array returned from the API is verified to contain at least 10 elements.
- Dynamic Data Controls: It is checked whether all userId values ​​returned from the API are positive integers.

### Task Properties
- Test URL: https://jsonplaceholder.typicode.com/