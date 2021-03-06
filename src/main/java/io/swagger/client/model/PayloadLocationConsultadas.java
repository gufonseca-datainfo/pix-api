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
import io.swagger.client.model.ParametrosConsultaPayloadLocation;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PayloadLocationConsultadas
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-10-27T16:48:51.159Z[GMT]")
public class PayloadLocationConsultadas {
  @SerializedName("parametros")
  private ParametrosConsultaPayloadLocation parametros = null;

  @SerializedName("loc")
  private List<AllOfPayloadLocationConsultadasLocItems> loc = new ArrayList<AllOfPayloadLocationConsultadasLocItems>();

  public PayloadLocationConsultadas parametros(ParametrosConsultaPayloadLocation parametros) {
    this.parametros = parametros;
    return this;
  }

   /**
   * Get parametros
   * @return parametros
  **/
  @Schema(required = true, description = "")
  public ParametrosConsultaPayloadLocation getParametros() {
    return parametros;
  }

  public void setParametros(ParametrosConsultaPayloadLocation parametros) {
    this.parametros = parametros;
  }

  public PayloadLocationConsultadas loc(List<AllOfPayloadLocationConsultadasLocItems> loc) {
    this.loc = loc;
    return this;
  }

  public PayloadLocationConsultadas addLocItem(AllOfPayloadLocationConsultadasLocItems locItem) {
    this.loc.add(locItem);
    return this;
  }

   /**
   * Get loc
   * @return loc
  **/
  @Schema(required = true, description = "")
  public List<AllOfPayloadLocationConsultadasLocItems> getLoc() {
    return loc;
  }

  public void setLoc(List<AllOfPayloadLocationConsultadasLocItems> loc) {
    this.loc = loc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayloadLocationConsultadas payloadLocationConsultadas = (PayloadLocationConsultadas) o;
    return Objects.equals(this.parametros, payloadLocationConsultadas.parametros) &&
        Objects.equals(this.loc, payloadLocationConsultadas.loc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parametros, loc);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayloadLocationConsultadas {\n");
    
    sb.append("    parametros: ").append(toIndentedString(parametros)).append("\n");
    sb.append("    loc: ").append(toIndentedString(loc)).append("\n");
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
