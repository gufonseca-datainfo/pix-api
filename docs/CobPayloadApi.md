# CobPayloadApi

All URIs are relative to *https://pix.example.com/api/v2/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pixUrlAcessTokenGet**](CobPayloadApi.md#pixUrlAcessTokenGet) | **GET** /{pixUrlAcessToken} | Recuperar o payload JSON que representa a cobrança.

<a name="pixUrlAcessTokenGet"></a>
# **pixUrlAcessTokenGet**
> CobPayload pixUrlAcessTokenGet(pixUrlAcessToken)

Recuperar o payload JSON que representa a cobrança.

## Endpoint (location) que serve um payload que representa uma cobrança.  No momento que o usuário devedor efetua a leitura de um QR Code dinâmico gerado pelo recebedor, esta URL será acessada e seu conteúdo consiste em uma estrutura JWS. As informações sobre a segurança no acesso às urls encontram-se no Manual de Segurança do Pix disponível em nesse __[link](https://www.bcb.gov.br/estabilidadefinanceira/comunicacaodados)__. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.CobPayloadApi;


CobPayloadApi apiInstance = new CobPayloadApi();
String pixUrlAcessToken = "pixUrlAcessToken_example"; // String | 
try {
    CobPayload result = apiInstance.pixUrlAcessTokenGet(pixUrlAcessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CobPayloadApi#pixUrlAcessTokenGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pixUrlAcessToken** | **String**|  |

### Return type

[**CobPayload**](CobPayload.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/jose

