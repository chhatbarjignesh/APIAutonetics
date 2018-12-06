Feature: Test the Weather API
  As a given user, I want to test the Weather API
###################################
#Application = Weather
#Feature = weather_by_city
##################################

@weather @weather_by_city @weawther_by_city_001
Scenario Outline: As a User I want to verify that service is returning weather for different city within defined SLA
Given I have an access to "Weather API"
When I call the "WeatherAPI" by "<City>"
Then I should see the "temperature" in the response within "5" seconds
Examples:
|	City			|
|	Springfield	|
|	Ellington	|
| 	Boston		|
|	Denver		|
