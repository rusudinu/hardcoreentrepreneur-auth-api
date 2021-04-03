# Unencrypted login system API

Hi! This repo is an API for the Hardcore Entrepreneur contest, that demonstrates the easiest way to create a login system API, using Spring Boot.

## Please note that:

- this is the most basic form of a login system
- nothing is encrypted in the database, and this is a huge vulnerability
- this is just a demo, DO NOT USE THIS IN PRODUCTION / APPS OUTSIDE THE CONTEST due to the fact that the passwords are not being encrypted
- in the modern days a login system is usually based on auth tokens
- whi are passwords not encrypted? for the simplicity of the demo / api
- the API will be closed after the contest ends (22nd May, 2021) (all the links to the api, will not work)

## Others

For other projects / cool stuff, follow me on:

- [GitHub](https://github.com/rusudinu)
- [Instagram](https://www.instagram.com/dinuustefan/)
- [Facebook](https://www.facebook.com/rusudinustefan/)
- [CodingShadows](https://www.codingshadows.com)

## API Reference

- Register a new user:
    * Send a POST request to https://he.codingshadows.com/api/register, with the body of the request being a RequestedUser object, the API will return a User object

- Authenticate a user:
    * Send a GET request to https://he.codingshadows.com/api/auth, with the body of the request being a RequestedUser object, the API will return a User object

- Update an existing user:
    * Send a POST request to https://he.codingshadows.com/api/update, with the body of the request being a RequestedUser object, the API will return a User object

If you need further assistance in sending an Object to an API, please check [this link](https://stackoverflow.com/questions/35390928/how-to-send-json-object-to-the-server-from-my-android-app).

If you need further assistance in parsing an Object from an API, please check [this link](https://stackoverflow.com/questions/5566669/how-to-parse-a-json-object-in-android).
