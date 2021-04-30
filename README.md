# Unencrypted login system API

Hi! This repo is an API for the Hardcore Entrepreneur contest, that demonstrates the easiest way to create a login system API, using Spring Boot.

## Please note that:

- this is the most basic form of a login system
- nothing is encrypted in the database, and this is a huge vulnerability
- this is just a demo, DO NOT USE THIS IN PRODUCTION / APPS OUTSIDE THE CONTEST due to the fact that the passwords are not being encrypted
- in the modern days a login system is usually based on auth tokens
- why are passwords not encrypted? for the simplicity of the demo / api
- the API will be closed after the contest ends (22nd May, 2021) (all the links to the api, will not work)

## Others

For other projects / cool stuff, follow me on:

- [GitHub](https://github.com/rusudinu)
- [Instagram](https://www.instagram.com/dinuustefan/)
- [Facebook](https://www.facebook.com/rusudinustefan/)
- [CodingShadows](https://www.codingshadows.com)
- Please read this documentation [here](https://github.com/rusudinu/hardcoreentrepreneur_auth_api), for a better experience.

## API Reference

- Register a new user:
    * Send a POST request to https://he.codingshadows.com/api/register, with the body of the request being a RequestedUser object, the API will return a User object

- Authenticate a user:
    * Send a GET request to https://he.codingshadows.com/api/auth, with the body of the request being a RequestedUser object, the API will return a User object

- Update an existing user:
    * Send a POST request to https://he.codingshadows.com/api/update, with the body of the request being a RequestedUser object, the API will return a User object

If you need further assistance in sending an Object to an API, please check [this link](https://stackoverflow.com/questions/35390928/how-to-send-json-object-to-the-server-from-my-android-app).

If you need further assistance in parsing an Object from an API, please check [this link](https://stackoverflow.com/questions/5566669/how-to-parse-a-json-object-in-android).

## API Reference

- Note: In the screenshots below, in the top part is the request you send, and in the bottom part is the response from the API.

- Register a new user:
    * Send a POST request to https://he.codingshadows.com/api/register, with the body of the request being a RequestedUser object, the API will return a User object
    * If you register successfully, you will have something like this:
![Register Successful](https://github.com/rusudinu/hardcoreentrepreneur_auth_api/blob/master/readme_screenshots/register_successful.png?raw=true)
    * If the user already exists, you will have something like this:
![Register User Already Exists](https://github.com/rusudinu/hardcoreentrepreneur_auth_api/blob/master/readme_screenshots/register_already_exists.png?raw=true)

- Authenticate a user:
    * Send a GET request to https://he.codingshadows.com/api/auth, with the body of the request being a RequestedUser object, the API will return a User object
    * If you authenthicate successfully, you will have something like this:
![Auth Successful](https://github.com/rusudinu/hardcoreentrepreneur_auth_api/blob/master/readme_screenshots/auth_successful.png?raw=true)
    * If you fail to authenthicate, you will have something like this:
![Auth Incorrect Credentials](https://github.com/rusudinu/hardcoreentrepreneur_auth_api/blob/master/readme_screenshots/auth_incorrect_credentials.png?raw=true)

- Update an existing user:
    * Send a POST request to https://he.codingshadows.com/api/update, with the body of the request being a RequestedUser object, the API will return a User object
    * If the user was updated, you will get the old User object, for all the requests afterwards, you will get the updated User object
![Update User](https://github.com/rusudinu/hardcoreentrepreneur_auth_api/blob/master/readme_screenshots/update.png?raw=true)

- If you send the wrong request type (GET instead of POST or vice-versa), you will see something like this returend by the API:
![Wrong Request Type](https://github.com/rusudinu/hardcoreentrepreneur_auth_api/blob/master/readme_screenshots/wrong_request_type.png?raw=true)

If you need further assistance in sending an Object to an API, please check [this link](https://stackoverflow.com/questions/35390928/how-to-send-json-object-to-the-server-from-my-android-app).

If you need further assistance in parsing an Object from an API, please check [this link](https://stackoverflow.com/questions/5566669/how-to-parse-a-json-object-in-android).
