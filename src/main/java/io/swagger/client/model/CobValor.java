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
/**
 * Todos os campos que indicam valores monetários obedecem ao formato do ID 54 da especificação EMV/BR Code para QR Codes. O separador decimal é o caractere ponto. Não é aplicável utilizar separador de milhar. Exemplos de valores aderentes ao padrão: “0.00”, “1.00”, “123.99”, “123456789.23
 */
@Schema(description = "Todos os campos que indicam valores monetários obedecem ao formato do ID 54 da especificação EMV/BR Code para QR Codes. O separador decimal é o caractere ponto. Não é aplicável utilizar separador de milhar. Exemplos de valores aderentes ao padrão: “0.00”, “1.00”, “123.99”, “123456789.23")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-10-27T16:48:51.159Z[GMT]")
public class CobValor {
  @SerializedName("original")
  private String original = null;

  @SerializedName("multa")
  private OneOfCobValorMulta multa = null;

  @SerializedName("juros")
  private OneOfCobValorJuros juros = null;

  @SerializedName("abatimento")
  private OneOfCobValorAbatimento abatimento = null;

  @SerializedName("desconto")
  private OneOfCobValorDesconto desconto = null;

  public CobValor original(String original) {
    this.original = original;
    return this;
  }

   /**
   * Valor original da cobrança.
   * @return original
  **/
  @Schema(required = true, description = "Valor original da cobrança.")
  public String getOriginal() {
    return original;
  }

  public void setOriginal(String original) {
    this.original = original;
  }

  public CobValor multa(OneOfCobValorMulta multa) {
    this.multa = multa;
    return this;
  }

   /**
   * Multa aplicada à cobrança
   * @return multa
  **/
  @Schema(description = "Multa aplicada à cobrança")
  public OneOfCobValorMulta getMulta() {
    return multa;
  }

  public void setMulta(OneOfCobValorMulta multa) {
    this.multa = multa;
  }

  public CobValor juros(OneOfCobValorJuros juros) {
    this.juros = juros;
    return this;
  }

   /**
   * Juro aplicado à cobrança
   * @return juros
  **/
  @Schema(description = "Juro aplicado à cobrança")
  public OneOfCobValorJuros getJuros() {
    return juros;
  }

  public void setJuros(OneOfCobValorJuros juros) {
    this.juros = juros;
  }

  public CobValor abatimento(OneOfCobValorAbatimento abatimento) {
    this.abatimento = abatimento;
    return this;
  }

   /**
   * Abatimento aplicado à cobrança
   * @return abatimento
  **/
  @Schema(description = "Abatimento aplicado à cobrança")
  public OneOfCobValorAbatimento getAbatimento() {
    return abatimento;
  }

  public void setAbatimento(OneOfCobValorAbatimento abatimento) {
    this.abatimento = abatimento;
  }

  public CobValor desconto(OneOfCobValorDesconto desconto) {
    this.desconto = desconto;
    return this;
  }

   /**
   * Descontos aplicados à cobrança
   * @return desconto
  **/
  @Schema(description = "Descontos aplicados à cobrança")
  public OneOfCobValorDesconto getDesconto() {
    return desconto;
  }

  public void setDesconto(OneOfCobValorDesconto desconto) {
    this.desconto = desconto;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CobValor cobValor = (CobValor) o;
    return Objects.equals(this.original, cobValor.original) &&
        Objects.equals(this.multa, cobValor.multa) &&
        Objects.equals(this.juros, cobValor.juros) &&
        Objects.equals(this.abatimento, cobValor.abatimento) &&
        Objects.equals(this.desconto, cobValor.desconto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(original, multa, juros, abatimento, desconto);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CobValor {\n");
    
    sb.append("    original: ").append(toIndentedString(original)).append("\n");
    sb.append("    multa: ").append(toIndentedString(multa)).append("\n");
    sb.append("    juros: ").append(toIndentedString(juros)).append("\n");
    sb.append("    abatimento: ").append(toIndentedString(abatimento)).append("\n");
    sb.append("    desconto: ").append(toIndentedString(desconto)).append("\n");
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
