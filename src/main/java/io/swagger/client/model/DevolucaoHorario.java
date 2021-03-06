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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * DevolucaoHorario
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-10-27T16:48:51.159Z[GMT]")
public class DevolucaoHorario {
  @SerializedName("solicitacao")
  private OffsetDateTime solicitacao = null;

  @SerializedName("liquidacao")
  private OffsetDateTime liquidacao = null;

  public DevolucaoHorario solicitacao(OffsetDateTime solicitacao) {
    this.solicitacao = solicitacao;
    return this;
  }

   /**
   * Horário no qual a devolução foi solicitada no PSP.
   * @return solicitacao
  **/
  @Schema(description = "Horário no qual a devolução foi solicitada no PSP.")
  public OffsetDateTime getSolicitacao() {
    return solicitacao;
  }

  public void setSolicitacao(OffsetDateTime solicitacao) {
    this.solicitacao = solicitacao;
  }

  public DevolucaoHorario liquidacao(OffsetDateTime liquidacao) {
    this.liquidacao = liquidacao;
    return this;
  }

   /**
   * Horário no qual a devolução foi liquidada no PSP.
   * @return liquidacao
  **/
  @Schema(description = "Horário no qual a devolução foi liquidada no PSP.")
  public OffsetDateTime getLiquidacao() {
    return liquidacao;
  }

  public void setLiquidacao(OffsetDateTime liquidacao) {
    this.liquidacao = liquidacao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DevolucaoHorario devolucaoHorario = (DevolucaoHorario) o;
    return Objects.equals(this.solicitacao, devolucaoHorario.solicitacao) &&
        Objects.equals(this.liquidacao, devolucaoHorario.liquidacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solicitacao, liquidacao);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevolucaoHorario {\n");
    
    sb.append("    solicitacao: ").append(toIndentedString(solicitacao)).append("\n");
    sb.append("    liquidacao: ").append(toIndentedString(liquidacao)).append("\n");
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
