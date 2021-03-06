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
 * Parâmetros utilizados para a realização de uma consulta de cobranças.
 */
@Schema(description = "Parâmetros utilizados para a realização de uma consulta de cobranças.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-10-27T16:48:51.159Z[GMT]")
public class ParametrosConsultaCob {
  @SerializedName("inicio")
  private OffsetDateTime inicio = null;

  @SerializedName("fim")
  private OffsetDateTime fim = null;

  @SerializedName("cpf")
  private String cpf = null;

  @SerializedName("cnpj")
  private String cnpj = null;

  @SerializedName("locationPresente")
  private Boolean locationPresente = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("paginacao")
  private Paginacao paginacao = null;

  public ParametrosConsultaCob inicio(OffsetDateTime inicio) {
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

  public ParametrosConsultaCob fim(OffsetDateTime fim) {
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

  public ParametrosConsultaCob cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

   /**
   * Filtro pelo CPF do devedor. Não pode ser utilizado ao mesmo tempo que o CNPJ.
   * @return cpf
  **/
  @Schema(description = "Filtro pelo CPF do devedor. Não pode ser utilizado ao mesmo tempo que o CNPJ.")
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public ParametrosConsultaCob cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }

   /**
   * Filtro pelo CNPJ do devedor. Não pode ser utilizado ao mesmo tempo que o CPF.
   * @return cnpj
  **/
  @Schema(description = "Filtro pelo CNPJ do devedor. Não pode ser utilizado ao mesmo tempo que o CPF.")
  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public ParametrosConsultaCob locationPresente(Boolean locationPresente) {
    this.locationPresente = locationPresente;
    return this;
  }

   /**
   * Filtro pela existência de location vinculada.
   * @return locationPresente
  **/
  @Schema(description = "Filtro pela existência de location vinculada.")
  public Boolean isLocationPresente() {
    return locationPresente;
  }

  public void setLocationPresente(Boolean locationPresente) {
    this.locationPresente = locationPresente;
  }

  public ParametrosConsultaCob status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Filtro pelo status das cobranças.
   * @return status
  **/
  @Schema(description = "Filtro pelo status das cobranças.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ParametrosConsultaCob paginacao(Paginacao paginacao) {
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
    ParametrosConsultaCob parametrosConsultaCob = (ParametrosConsultaCob) o;
    return Objects.equals(this.inicio, parametrosConsultaCob.inicio) &&
        Objects.equals(this.fim, parametrosConsultaCob.fim) &&
        Objects.equals(this.cpf, parametrosConsultaCob.cpf) &&
        Objects.equals(this.cnpj, parametrosConsultaCob.cnpj) &&
        Objects.equals(this.locationPresente, parametrosConsultaCob.locationPresente) &&
        Objects.equals(this.status, parametrosConsultaCob.status) &&
        Objects.equals(this.paginacao, parametrosConsultaCob.paginacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inicio, fim, cpf, cnpj, locationPresente, status, paginacao);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParametrosConsultaCob {\n");
    
    sb.append("    inicio: ").append(toIndentedString(inicio)).append("\n");
    sb.append("    fim: ").append(toIndentedString(fim)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
    sb.append("    locationPresente: ").append(toIndentedString(locationPresente)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
