/*
 * API Pix
 * A API Pix padroniza serviços oferecidos pelo PSP recebedor no contexto do arranjo Pix, como criação de cobrança, verificação de Pix recebidos, devolução e conciliação. Os serviços expostos pelo PSP recebedor permitem ao usuário recebedor estabelecer integração de sua automação com os serviços Pix do PSP.  # Evolução da API Pix As seguintes mudanças são esperadas e consideradas retro-compatíveis (_backwards-compatibility_):  - Adição de novos recursos na API Pix. - Adição de novos parâmetros opcionais a cobranças. - Adição de novos campos em respostas da API Pix. - Alteração da ordem de campos. - Adição de novos elementos em enumerações  Mudanças compatíveis não geram nova versão da API Pix. Clientes devem estar preparados para lidar com essas mudanças sem quebrar.  Mudanças incompatíveis geram nova versão da API Pix.
 *
 * OpenAPI spec version: 2.1.0
 * Contact: suporte.ti@bcb.gov.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.CobPayload;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CobPayloadApi
 */
@Ignore
public class CobPayloadApiTest {

    private final CobPayloadApi api = new CobPayloadApi();

    /**
     * Recuperar o payload JSON que representa a cobrança.
     *
     * ## Endpoint (location) que serve um payload que representa uma cobrança.  No momento que o usuário devedor efetua a leitura de um QR Code dinâmico gerado pelo recebedor, esta URL será acessada e seu conteúdo consiste em uma estrutura JWS. As informações sobre a segurança no acesso às urls encontram-se no Manual de Segurança do Pix disponível em nesse __[link](https://www.bcb.gov.br/estabilidadefinanceira/comunicacaodados)__. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void pixUrlAcessTokenGetTest() throws ApiException {
        String pixUrlAcessToken = null;
        CobPayload response = api.pixUrlAcessTokenGet(pixUrlAcessToken);

        // TODO: test validations
    }
}