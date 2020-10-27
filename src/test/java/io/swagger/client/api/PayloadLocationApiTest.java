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
import org.threeten.bp.OffsetDateTime;
import io.swagger.client.model.PayloadLocation;
import io.swagger.client.model.PayloadLocationCompleta;
import io.swagger.client.model.PayloadLocationConsultadas;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PayloadLocationApi
 */
@Ignore
public class PayloadLocationApiTest {

    private final PayloadLocationApi api = new PayloadLocationApi();

    /**
     * Consultar locations cadastradas.
     *
     * Endpoint para consultar locations cadastradas
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void locGetTest() throws ApiException {
        OffsetDateTime inicio = null;
        OffsetDateTime fim = null;
        Boolean txIdPresente = null;
        Integer paginacaoPaginaAtual = null;
        Integer paginacaoItensPorPagina = null;
        PayloadLocationConsultadas response = api.locGet(inicio, fim, txIdPresente, paginacaoPaginaAtual, paginacaoItensPorPagina);

        // TODO: test validations
    }
    /**
     * Recuperar location do payload.
     *
     * Recupera a location do payload
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void locIdGetTest() throws ApiException {
        String id = null;
        PayloadLocationCompleta response = api.locIdGet(id);

        // TODO: test validations
    }
    /**
     * Desvincular um txid de uma location.
     *
     * Endpoint para desvinculo de um txid de uma location 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void locIdTxidDeleteTest() throws ApiException {
        String id = null;
        PayloadLocation response = api.locIdTxidDelete(id);

        // TODO: test validations
    }
    /**
     * Criar location do payload.
     *
     * Criar location do payload
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void locPostTest() throws ApiException {
        PayloadLocation response = api.locPost();

        // TODO: test validations
    }
}