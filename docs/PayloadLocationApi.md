# PayloadLocationApi

All URIs are relative to *https://pix.example.com/api/v2/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locGet**](PayloadLocationApi.md#locGet) | **GET** /loc | Consultar locations cadastradas.
[**locIdGet**](PayloadLocationApi.md#locIdGet) | **GET** /loc/{id} | Recuperar location do payload.
[**locIdTxidDelete**](PayloadLocationApi.md#locIdTxidDelete) | **DELETE** /loc/{id}/txid | Desvincular um txid de uma location.
[**locPost**](PayloadLocationApi.md#locPost) | **POST** /loc | Criar location do payload.

<a name="locGet"></a>
# **locGet**
> PayloadLocationConsultadas locGet(inicio, fim, txIdPresente, paginacaoPaginaAtual, paginacaoItensPorPagina)

Consultar locations cadastradas.

Endpoint para consultar locations cadastradas

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PayloadLocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PayloadLocationApi apiInstance = new PayloadLocationApi();
OffsetDateTime inicio = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime fim = new OffsetDateTime(); // OffsetDateTime | 
Boolean txIdPresente = true; // Boolean | 
Integer paginacaoPaginaAtual = 0; // Integer | 
Integer paginacaoItensPorPagina = 100; // Integer | 
try {
    PayloadLocationConsultadas result = apiInstance.locGet(inicio, fim, txIdPresente, paginacaoPaginaAtual, paginacaoItensPorPagina);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayloadLocationApi#locGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inicio** | **OffsetDateTime**|  |
 **fim** | **OffsetDateTime**|  |
 **txIdPresente** | **Boolean**|  | [optional]
 **paginacaoPaginaAtual** | **Integer**|  | [optional] [default to 0] [enum: ]
 **paginacaoItensPorPagina** | **Integer**|  | [optional] [default to 100] [enum: ]

### Return type

[**PayloadLocationConsultadas**](PayloadLocationConsultadas.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locIdGet"></a>
# **locIdGet**
> PayloadLocationCompleta locIdGet(id)

Recuperar location do payload.

Recupera a location do payload

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PayloadLocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PayloadLocationApi apiInstance = new PayloadLocationApi();
String id = "id_example"; // String | 
try {
    PayloadLocationCompleta result = apiInstance.locIdGet(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayloadLocationApi#locIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**PayloadLocationCompleta**](PayloadLocationCompleta.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locIdTxidDelete"></a>
# **locIdTxidDelete**
> PayloadLocation locIdTxidDelete(id)

Desvincular um txid de uma location.

Endpoint para desvinculo de um txid de uma location 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PayloadLocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PayloadLocationApi apiInstance = new PayloadLocationApi();
String id = "id_example"; // String | 
try {
    PayloadLocation result = apiInstance.locIdTxidDelete(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayloadLocationApi#locIdTxidDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**PayloadLocation**](PayloadLocation.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="locPost"></a>
# **locPost**
> PayloadLocation locPost()

Criar location do payload.

Criar location do payload

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PayloadLocationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

PayloadLocationApi apiInstance = new PayloadLocationApi();
try {
    PayloadLocation result = apiInstance.locPost();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PayloadLocationApi#locPost");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PayloadLocation**](PayloadLocation.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

