# CobApi

All URIs are relative to *https://pix.example.com/api/v2/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cobGet**](CobApi.md#cobGet) | **GET** /cob | Consultar lista de cobranças.
[**cobTxidGet**](CobApi.md#cobTxidGet) | **GET** /cob/{txid} | Consultar cobrança.
[**cobTxidPatch**](CobApi.md#cobTxidPatch) | **PATCH** /cob/{txid} | Revisar cobrança.
[**cobTxidPut**](CobApi.md#cobTxidPut) | **PUT** /cob/{txid} | Criar cobrança.

<a name="cobGet"></a>
# **cobGet**
> CobsConsultadas cobGet(inicio, fim, cpf, cnpj, locationPresente, status, paginacaoPaginaAtual, paginacaoItensPorPagina)

Consultar lista de cobranças.

Endpoint para consultar cobranças através de parâmetros como início, fim, cpf, cnpj e status.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CobApi apiInstance = new CobApi();
OffsetDateTime inicio = new OffsetDateTime(); // OffsetDateTime | 
OffsetDateTime fim = new OffsetDateTime(); // OffsetDateTime | 
String cpf = "cpf_example"; // String | 
String cnpj = "cnpj_example"; // String | 
Boolean locationPresente = true; // Boolean | 
String status = "status_example"; // String | 
Integer paginacaoPaginaAtual = 0; // Integer | 
Integer paginacaoItensPorPagina = 100; // Integer | 
try {
    CobsConsultadas result = apiInstance.cobGet(inicio, fim, cpf, cnpj, locationPresente, status, paginacaoPaginaAtual, paginacaoItensPorPagina);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CobApi#cobGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inicio** | **OffsetDateTime**|  |
 **fim** | **OffsetDateTime**|  |
 **cpf** | **String**|  | [optional]
 **cnpj** | **String**|  | [optional]
 **locationPresente** | **Boolean**|  | [optional]
 **status** | **String**|  | [optional]
 **paginacaoPaginaAtual** | **Integer**|  | [optional] [default to 0] [enum: ]
 **paginacaoItensPorPagina** | **Integer**|  | [optional] [default to 100] [enum: ]

### Return type

[**CobsConsultadas**](CobsConsultadas.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cobTxidGet"></a>
# **cobTxidGet**
> CobCompleta cobTxidGet(txid, revisao)

Consultar cobrança.

Endpoint para consultar uma cobrança através de um determinado txid.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CobApi apiInstance = new CobApi();
String txid = "txid_example"; // String | 
Integer revisao = 56; // Integer | 
try {
    CobCompleta result = apiInstance.cobTxidGet(txid, revisao);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CobApi#cobTxidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **txid** | [**String**](.md)|  |
 **revisao** | [**Integer**](.md)|  | [optional]

### Return type

[**CobCompleta**](CobCompleta.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="cobTxidPatch"></a>
# **cobTxidPatch**
> CobGerada cobTxidPatch(body, txid)

Revisar cobrança.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CobApi apiInstance = new CobApi();
CobRevisada body = new CobRevisada(); // CobRevisada | Dados para geração da cobrança.
String txid = "txid_example"; // String | 
try {
    CobGerada result = apiInstance.cobTxidPatch(body, txid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CobApi#cobTxidPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CobRevisada**](CobRevisada.md)| Dados para geração da cobrança. |
 **txid** | [**String**](.md)|  |

### Return type

[**CobGerada**](CobGerada.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cobTxidPut"></a>
# **cobTxidPut**
> CobGerada cobTxidPut(body, txid)

Criar cobrança.

Endpoint para criar uma cobrança.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

CobApi apiInstance = new CobApi();
CobSolicitada body = new CobSolicitada(); // CobSolicitada | Dados para geração da cobrança.
String txid = "txid_example"; // String | 
try {
    CobGerada result = apiInstance.cobTxidPut(body, txid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CobApi#cobTxidPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CobSolicitada**](CobSolicitada.md)| Dados para geração da cobrança. |
 **txid** | [**String**](.md)|  |

### Return type

[**CobGerada**](CobGerada.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

