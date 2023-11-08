# Android client for WeatherAPI.com

# Introduction
WeatherAPI.com provides access to weather and geo data via a JSON/XML restful API. It allows developers to create desktop, web and mobile applications using this data very easy. 

We provide following data through our API:     
- Real-time weather
- 14 day weather forecast
- Historical Weather
- Marine Weather and Tide Data
- Future Weather (Upto 365 days ahead)
- Daily and hourly intervals
- 15 min interval (Enterprise only)
- Astronomy
- Time zone
- Location data
- Sports
- Search or Autocomplete API
- Weather Alerts
- Air Quality Data
- Bulk Request

# Getting Started    
You need to [signup](https://www.weatherapi.com/signup.aspx) and then you can find your API key under [your account](https://www.weatherapi.com/login.aspx), and start using API right away!  

Try our weather API by using interactive [API Explorer](https://www.weatherapi.com/api-explorer.aspx).  

We also have SDK for popular framework/languages available on [Github](https://github.com/weatherapicom/) for quick integrations.  

If you find any features missing or have any suggestions, please [contact us](https://www.weatherapi.com/contact.aspx).    

# Authentication    
API access to the data is protected by an API key. If at anytime, you find the API key has become vulnerable, please regenerate the key using Regenerate button next to the API key.    

Authentication to the WeatherAPI.com API is provided by passing your API key as request parameter through an API .      

##  key parameter  
key=YOUR API KEY

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.APIsApi;

public class APIsApiExample {

    public static void main(String[] args) {
        APIsApi apiInstance = new APIsApi();
        String q = "q_example"; // String | Pass US Zipcode, UK Postcode, Canada Postalcode, IP address, Latitude/Longitude (decimal degree) or city name. Visit [request parameter section](https://www.weatherapi.com/docs/#intro-request) to learn more.
        Date dt = new Date(); // Date | Date on or after 1st Jan, 2015 in yyyy-MM-dd format
        try {
            Object result = apiInstance.astronomy(q, dt);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling APIsApi#astronomy");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.weatherapi.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*APIsApi* | [**astronomy**](docs/APIsApi.md#astronomy) | **GET** /astronomy.json | Astronomy API
*APIsApi* | [**forecastWeather**](docs/APIsApi.md#forecastWeather) | **GET** /forecast.json | Forecast API
*APIsApi* | [**futureWeather**](docs/APIsApi.md#futureWeather) | **GET** /future.json | Future API
*APIsApi* | [**historyWeather**](docs/APIsApi.md#historyWeather) | **GET** /history.json | History API
*APIsApi* | [**ipLookup**](docs/APIsApi.md#ipLookup) | **GET** /ip.json | IP Lookup API
*APIsApi* | [**marineWeather**](docs/APIsApi.md#marineWeather) | **GET** /marine.json | Marine Weather API
*APIsApi* | [**realtimeWeather**](docs/APIsApi.md#realtimeWeather) | **GET** /current.json | Realtime API
*APIsApi* | [**searchAutocompleteWeather**](docs/APIsApi.md#searchAutocompleteWeather) | **GET** /search.json | Search/Autocomplete API
*APIsApi* | [**timeZone**](docs/APIsApi.md#timeZone) | **GET** /timezone.json | Time Zone API


## Documentation for Models

 - [Alerts](docs/Alerts.md)
 - [AlertsAlert](docs/AlertsAlert.md)
 - [ArrayOfSearch](docs/ArrayOfSearch.md)
 - [Astronomy](docs/Astronomy.md)
 - [AstronomyAstro](docs/AstronomyAstro.md)
 - [Current](docs/Current.md)
 - [CurrentAirQuality](docs/CurrentAirQuality.md)
 - [CurrentCondition](docs/CurrentCondition.md)
 - [Error400](docs/Error400.md)
 - [Error401](docs/Error401.md)
 - [Error403](docs/Error403.md)
 - [Forecast](docs/Forecast.md)
 - [ForecastAstro](docs/ForecastAstro.md)
 - [ForecastCondition](docs/ForecastCondition.md)
 - [ForecastDay](docs/ForecastDay.md)
 - [ForecastDayCondition](docs/ForecastDayCondition.md)
 - [ForecastForecastday](docs/ForecastForecastday.md)
 - [ForecastHour](docs/ForecastHour.md)
 - [Ip](docs/Ip.md)
 - [Location](docs/Location.md)
 - [Marine](docs/Marine.md)
 - [MarineForecastday](docs/MarineForecastday.md)
 - [MarineHour](docs/MarineHour.md)
 - [Search](docs/Search.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: key
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



