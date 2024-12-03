To run, pull the repo, load the project with Android Studio (latest version), 	and run on “Medium Phone API 35” emulator setting. The backend is going to 	default to localhost:8080. You will need an API key to access firebase, however, 	which is removed from the github repo for security purposes. You would need to 	set up your own firebase repo and download the google-services.json and place it 	in the root of the app directory for this to work. 

Implementation notes: 
 
Passwords for user credentials are hashed using Bcrypt before being stored in the database. Classes are mostly implemented as described in the assignment instructions. Reasonable validations for each field are handled in the backend (regex used for proper password usage during registration, must be of certain length, etc. States must be proper state codes, and so on). 

Database functionality can be tested using CURL commands (or Postman if you prefer, but CURL is going to be built-in to your system). You must send a json payload to the remote server (in the code, this is shown as http://10.0.2.2:8080). 10.0.2.2 is the loopback for localhost. So long as the payload is formatted as the code expects, it should return a message indicating success or failure depending on if validation conditions are met. Examples: 

curl -X POST http://localhost:8080/api/firestore/register \ -H "Content-Type: application/json" \ -d '{ "id": "test@example.com", "password": "password123!" }' 
We used Firebase (NoSQL) to store application data. 
