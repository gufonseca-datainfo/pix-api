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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.Paginacao;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Parâmetros utilizados para a realização de uma consulta de locations.
 */
@Schema(description = "Parâmetros utilizados para a realização de uma consulta de locations.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-10-27T16:48:51.159Z[GMT]")
public class ParametrosConsultaPayloadLocation {
  @SerializedName("inicio")
  private OffsetDateTime inicio = null;

  @SerializedName("fim")
  private OffsetDateTime fim = null;

  @SerializedName("txIdPresente")
  private Boolean txIdPresente = null;

  @SerializedName("paginacao")
  private Paginacao paginacao = null;

  public ParametrosConsultaPayloadLocation inicio(OffsetDateTime inicio) {
    this.inicio = inicio;
    return this;
  }

   /**
   * Data inicial utilizada na consulta. Respeita RFC 3339.
   * @return inicio
  **/
  @Schema(example = "2020-04-01T00:00Z", required = true, description = "Data inicial utilizada na consulta. Respeita RFC 3339.")
  public OffsetDateTime getInicio() {
    return inicio;
  }

  public void setInicio(OffsetDateTime inicio) {
    this.inicio = inicio;
  }

  public ParametrosConsultaPayloadLocation fim(OffsetDateTime fim) {
    this.fim = fim;
    return this;
  }

   /**
   * Data de fim utilizada na consulta. Respeita RFC 3339.
   * @return fim
  **/
  @Schema(example = "2020-04-01T17:00Z", required = true, description = "Data de fim utilizada na consulta. Respeita RFC 3339.")
  public OffsetDateTime getFim() {
    return fim;
  }

  public void setFim(OffsetDateTime fim) {
    this.fim = fim;
  }

  public ParametrosConsultaPayloadLocation txIdPresente(Boolean txIdPresente) {
    this.txIdPresente = txIdPresente;
    return this;
  }

   /**
   * Filtro pela existência de txid.
   * @return txIdPresente
  **/
  @Schema(description = "Filtro pela existência de txid.")
  public Boolean isTxIdPresente() {
    return txIdPresente;
  }

  public void setTxIdPresente(Boolean txIdPresente) {
    this.txIdPresente = txIdPresente;
  }

  public ParametrosConsultaPayloadLocation paginacao(Paginacao paginacao) {
    this.paginacao = paginacao;
    return this;
  }

   /**
   * Get paginacao
   * @return paginacao
  **/
  @Schema(required = true, description = "")
  public Paginacao getPaginacao() {
    return paginacao;
  }

  public void setPaginacao(Paginacao paginacao) {
    this.paginacao = paginacao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParametrosConsultaPayloadLocation parametrosConsultaPayloadLocation = (ParametrosConsultaPayloadLocation) o;
    return Objects.equals(this.inicio, parametrosConsultaPayloadLocation.inicio) &&
        Objects.equals(this.fim, parametrosConsultaPayloadLocation.fim) &&
        Objects.equals(this.txIdPresente, parametrosConsultaPayloadLocation.txIdPresente) &&
        Objects.equals(this.paginacao, parametrosConsultaPayloadLocation.paginacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inicio, fim, txIdPresente, paginacao);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametrosConsultaPayloadLocation {\n");
    
    sb.append("    inicio: ").append(toIndentedString(inicio)).append("\n");
    sb.append("    fim: ").append(toIndentedString(fim)).append("\n");
    sb.append("    txIdPresente: ").append(toIndentedString(txIdPresente)).append("\n");
    sb.append("    paginacao: ").append(toIndentedString(paginacao)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
