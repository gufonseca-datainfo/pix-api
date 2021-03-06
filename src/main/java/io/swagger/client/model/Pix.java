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
import io.swagger.client.model.Devolucao;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * Pix
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-10-27T16:48:51.159Z[GMT]")
public class Pix {
  @SerializedName("endToEndId")
  private String endToEndId = null;

  @SerializedName("txid")
  private String txid = null;

  @SerializedName("valor")
  private String valor = null;

  @SerializedName("horario")
  private OffsetDateTime horario = null;

  @SerializedName("pagador")
  private OneOfPixPagador pagador = null;

  @SerializedName("infoPagador")
  private String infoPagador = null;

  @SerializedName("devolucoes")
  private List<Devolucao> devolucoes = null;

  public Pix endToEndId(String endToEndId) {
    this.endToEndId = endToEndId;
    return this;
  }

   /**
   * Get endToEndId
   * @return endToEndId
  **/
  @Schema(required = true, description = "")
  public String getEndToEndId() {
    return endToEndId;
  }

  public void setEndToEndId(String endToEndId) {
    this.endToEndId = endToEndId;
  }

  public Pix txid(String txid) {
    this.txid = txid;
    return this;
  }

   /**
   * Get txid
   * @return txid
  **/
  @Schema(description = "")
  public String getTxid() {
    return txid;
  }

  public void setTxid(String txid) {
    this.txid = txid;
  }

  public Pix valor(String valor) {
    this.valor = valor;
    return this;
  }

   /**
   * Valor do Pix.
   * @return valor
  **/
  @Schema(required = true, description = "Valor do Pix.")
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public Pix horario(OffsetDateTime horario) {
    this.horario = horario;
    return this;
  }

   /**
   * Horário em que o Pix foi processado no PSP.
   * @return horario
  **/
  @Schema(required = true, description = "Horário em que o Pix foi processado no PSP.")
  public OffsetDateTime getHorario() {
    return horario;
  }

  public void setHorario(OffsetDateTime horario) {
    this.horario = horario;
  }

  public Pix pagador(OneOfPixPagador pagador) {
    this.pagador = pagador;
    return this;
  }

   /**
   * Get pagador
   * @return pagador
  **/
  @Schema(description = "")
  public OneOfPixPagador getPagador() {
    return pagador;
  }

  public void setPagador(OneOfPixPagador pagador) {
    this.pagador = pagador;
  }

  public Pix infoPagador(String infoPagador) {
    this.infoPagador = infoPagador;
    return this;
  }

   /**
   * Get infoPagador
   * @return infoPagador
  **/
  @Schema(description = "")
  public String getInfoPagador() {
    return infoPagador;
  }

  public void setInfoPagador(String infoPagador) {
    this.infoPagador = infoPagador;
  }

  public Pix devolucoes(List<Devolucao> devolucoes) {
    this.devolucoes = devolucoes;
    return this;
  }

  public Pix addDevolucoesItem(Devolucao devolucoesItem) {
    if (this.devolucoes == null) {
      this.devolucoes = new ArrayList<Devolucao>();
    }
    this.devolucoes.add(devolucoesItem);
    return this;
  }

   /**
   * Get devolucoes
   * @return devolucoes
  **/
  @Schema(description = "")
  public List<Devolucao> getDevolucoes() {
    return devolucoes;
  }

  public void setDevolucoes(List<Devolucao> devolucoes) {
    this.devolucoes = devolucoes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pix pix = (Pix) o;
    return Objects.equals(this.endToEndId, pix.endToEndId) &&
        Objects.equals(this.txid, pix.txid) &&
        Objects.equals(this.valor, pix.valor) &&
        Objects.equals(this.horario, pix.horario) &&
        Objects.equals(this.pagador, pix.pagador) &&
        Objects.equals(this.infoPagador, pix.infoPagador) &&
        Objects.equals(this.devolucoes, pix.devolucoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endToEndId, txid, valor, horario, pagador, infoPagador, devolucoes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pix {\n");
    
    sb.append("    endToEndId: ").append(toIndentedString(endToEndId)).append("\n");
    sb.append("    txid: ").append(toIndentedString(txid)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    horario: ").append(toIndentedString(horario)).append("\n");
    sb.append("    pagador: ").append(toIndentedString(pagador)).append("\n");
    sb.append("    infoPagador: ").append(toIndentedString(infoPagador)).append("\n");
    sb.append("    devolucoes: ").append(toIndentedString(devolucoes)).append("\n");
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
