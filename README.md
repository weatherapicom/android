# swagger-android-client

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



