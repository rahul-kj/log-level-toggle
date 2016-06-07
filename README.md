# log-level-toggle

SpringBoot Application to toggle the log level dynamically from ERROR to DEBUG and viceversa, by calling a REST endpoint

## Steps to use this app
- Build the app using maven `mvn clean install`
- Run as a spring boot application
- Endpoints to access
  - http://localhost:8080/yay
  - http://localhost:8080/toggle

If in DEBUG mode, you would see some log messages printed on the console
Else, you see the debug levels listed

Enjoy!
