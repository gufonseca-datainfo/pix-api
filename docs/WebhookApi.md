# WebhookApi

All URIs are relative to *https://pix.example.com/api/v2/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**webhookDelete**](WebhookApi.md#webhookDelete) | **DELETE** /webhook | Cancelar o webhook Pix.
[**webhookGet**](WebhookApi.md#webhookGet) | **GET** /webhook | Exibir informações acerca do Webook Pix.
[**webhookPut**](WebhookApi.md#webhookPut) | **PUT** /webhook | Configurar o Webhook Pix.

<a name="webhookDelete"></a>
# **webhookDelete**
> webhookDelete()

Cancelar o webhook Pix.

Endpoint para cancelamento do webhook. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhookApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

WebhookApi apiInstance = new WebhookApi();
try {
    apiInstance.webhookDelete();
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#webhookDelete");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="webhookGet"></a>
# **webhookGet**
> Webhook webhookGet()

Exibir informações acerca do Webook Pix.

Endpoint para recuperação de informações sobre o webhook pix. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhookApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

WebhookApi apiInstance = new WebhookApi();
try {
    Webhook result = apiInstance.webhookGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#webhookGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Webhook**](Webhook.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="webhookPut"></a>
# **webhookPut**
> webhookPut(body)

Configurar o Webhook Pix.

Endpoint para configuração do serviço de notificações acerca de Pix recebidos. Somente Pix associados a um txid serão notificados. O Webhook é único por client ID. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WebhookApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

WebhookApi apiInstance = new WebhookApi();
Webhook body = new Webhook(); // Webhook | 
try {
    apiInstance.webhookPut(body);
} catch (ApiException e) {
    System.err.println("Exception when calling WebhookApi#webhookPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Webhook**](Webhook.md)|  |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

