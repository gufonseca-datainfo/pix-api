# swagger-java-client

API Pix
- API version: 2.1.0
  - Build date: 2020-10-27T16:48:51.159Z[GMT]

A API Pix padroniza serviços oferecidos pelo PSP recebedor no contexto do arranjo Pix, como criação de cobrança, verificação de Pix recebidos, devolução e conciliação. Os serviços expostos pelo PSP recebedor permitem ao usuário recebedor estabelecer integração de sua automação com os serviços Pix do PSP.  # Evolução da API Pix As seguintes mudanças são esperadas e consideradas retro-compatíveis (_backwards-compatibility_):  - Adição de novos recursos na API Pix. - Adição de novos parâmetros opcionais a cobranças. - Adição de novos campos em respostas da API Pix. - Alteração da ordem de campos. - Adição de novos elementos em enumerações  Mudanças compatíveis não geram nova versão da API Pix. Clientes devem estar preparados para lidar com essas mudanças sem quebrar.  Mudanças incompatíveis geram nova versão da API Pix.

  For more information, please visit [https://www.bcb.gov.br/estabilidadefinanceira/pagamentosinstantaneos](https://www.bcb.gov.br/estabilidadefinanceira/pagamentosinstantaneos)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CobApi;

import java.io.File;
import java.util.*;

public class CobApiExample {

    public static void main(String[] args) {
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CobApi;

import java.io.File;
import java.util.*;

public class CobApiExample {

    public static void main(String[] args) {
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CobApi;

import java.io.File;
import java.util.*;

public class CobApiExample {

    public static void main(String[] args) {
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
    }
}
import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CobApi;

import java.io.File;
import java.util.*;

public class CobApiExample {

    public static void main(String[] args) {
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
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://pix.example.com/api/v2/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CobApi* | [**cobGet**](docs/CobApi.md#cobGet) | **GET** /cob | Consultar lista de cobranças.
*CobApi* | [**cobTxidGet**](docs/CobApi.md#cobTxidGet) | **GET** /cob/{txid} | Consultar cobrança.
*CobApi* | [**cobTxidPatch**](docs/CobApi.md#cobTxidPatch) | **PATCH** /cob/{txid} | Revisar cobrança.
*CobApi* | [**cobTxidPut**](docs/CobApi.md#cobTxidPut) | **PUT** /cob/{txid} | Criar cobrança.
*CobPayloadApi* | [**pixUrlAcessTokenGet**](docs/CobPayloadApi.md#pixUrlAcessTokenGet) | **GET** /{pixUrlAcessToken} | Recuperar o payload JSON que representa a cobrança.
*PayloadLocationApi* | [**locGet**](docs/PayloadLocationApi.md#locGet) | **GET** /loc | Consultar locations cadastradas.
*PayloadLocationApi* | [**locIdGet**](docs/PayloadLocationApi.md#locIdGet) | **GET** /loc/{id} | Recuperar location do payload.
*PayloadLocationApi* | [**locIdTxidDelete**](docs/PayloadLocationApi.md#locIdTxidDelete) | **DELETE** /loc/{id}/txid | Desvincular um txid de uma location.
*PayloadLocationApi* | [**locPost**](docs/PayloadLocationApi.md#locPost) | **POST** /loc | Criar location do payload.
*PixApi* | [**pixE2eidDevolucaoIdGet**](docs/PixApi.md#pixE2eidDevolucaoIdGet) | **GET** /pix/{e2eid}/devolucao/{id} | Consultar devolução.
*PixApi* | [**pixE2eidDevolucaoIdPut**](docs/PixApi.md#pixE2eidDevolucaoIdPut) | **PUT** /pix/{e2eid}/devolucao/{id} | Solicitar devolução.
*PixApi* | [**pixE2eidGet**](docs/PixApi.md#pixE2eidGet) | **GET** /pix/{e2eid} | Consultar Pix.
*PixApi* | [**pixGet**](docs/PixApi.md#pixGet) | **GET** /pix | Consultar Pix recebidos.
*WebhookApi* | [**webhookDelete**](docs/WebhookApi.md#webhookDelete) | **DELETE** /webhook | Cancelar o webhook Pix.
*WebhookApi* | [**webhookGet**](docs/WebhookApi.md#webhookGet) | **GET** /webhook | Exibir informações acerca do Webook Pix.
*WebhookApi* | [**webhookPut**](docs/WebhookApi.md#webhookPut) | **PUT** /webhook | Configurar o Webhook Pix.

## Documentation for Models

 - [AllOfCobsConsultadasCobsItems](docs/AllOfCobsConsultadasCobsItems.md)
 - [AllOfPayloadLocationConsultadasLocItems](docs/AllOfPayloadLocationConsultadasLocItems.md)
 - [AllOfPixConsultadosPixItems](docs/AllOfPixConsultadosPixItems.md)
 - [CobApresentacao](docs/CobApresentacao.md)
 - [CobBase](docs/CobBase.md)
 - [CobBaseInfoAdicionais](docs/CobBaseInfoAdicionais.md)
 - [CobCompleta](docs/CobCompleta.md)
 - [CobCriacao](docs/CobCriacao.md)
 - [CobDataDeVencimento](docs/CobDataDeVencimento.md)
 - [CobExpiracao](docs/CobExpiracao.md)
 - [CobGerada](docs/CobGerada.md)
 - [CobPayload](docs/CobPayload.md)
 - [CobRevisada](docs/CobRevisada.md)
 - [CobSolicitada](docs/CobSolicitada.md)
 - [CobValor](docs/CobValor.md)
 - [CobsConsultadas](docs/CobsConsultadas.md)
 - [Devolucao](docs/Devolucao.md)
 - [DevolucaoHorario](docs/DevolucaoHorario.md)
 - [DevolucaoSolicitada](docs/DevolucaoSolicitada.md)
 - [OneOfCobBaseDevedor](docs/OneOfCobBaseDevedor.md)
 - [OneOfCobValorAbatimento](docs/OneOfCobValorAbatimento.md)
 - [OneOfCobValorDesconto](docs/OneOfCobValorDesconto.md)
 - [OneOfCobValorJuros](docs/OneOfCobValorJuros.md)
 - [OneOfCobValorMulta](docs/OneOfCobValorMulta.md)
 - [OneOfPixPagador](docs/OneOfPixPagador.md)
 - [Paginacao](docs/Paginacao.md)
 - [ParametrosConsultaCob](docs/ParametrosConsultaCob.md)
 - [ParametrosConsultaPayloadLocation](docs/ParametrosConsultaPayloadLocation.md)
 - [ParametrosConsultaPix](docs/ParametrosConsultaPix.md)
 - [PayloadLocation](docs/PayloadLocation.md)
 - [PayloadLocationCob](docs/PayloadLocationCob.md)
 - [PayloadLocationCompleta](docs/PayloadLocationCompleta.md)
 - [PayloadLocationConsultadas](docs/PayloadLocationConsultadas.md)
 - [PessoaFisica](docs/PessoaFisica.md)
 - [PessoaJuridica](docs/PessoaJuridica.md)
 - [Pix](docs/Pix.md)
 - [PixConsultados](docs/PixConsultados.md)
 - [Webhook](docs/Webhook.md)

## Documentation for Authorization

Authentication schemes defined for the API:
### OAuth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: 
  - : 


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

suporte.ti@bcb.gov.br
