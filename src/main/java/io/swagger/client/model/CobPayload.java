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
import io.swagger.client.model.CobBase;
import io.swagger.client.model.CobBaseInfoAdicionais;
import io.swagger.client.model.CobValor;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Dados da cobrança acessados pelo payload JSON
 */
@Schema(description = "Dados da cobrança acessados pelo payload JSON")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-10-27T16:48:51.159Z[GMT]")
public class CobPayload {
  @SerializedName("devedor")
  private Object devedor = null;

  @SerializedName("valor")
  private CobValor valor = null;

  @SerializedName("chave")
  private String chave = null;

  @SerializedName("solicitacaoPagador")
  private String solicitacaoPagador = null;

  @SerializedName("infoAdicionais")
  private List<CobBaseInfoAdicionais> infoAdicionais = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ATIVA("ATIVA"),
    CONCLUIDA("CONCLUIDA"),
    REMOVIDO_PELO_USUARIO_RECEBEDOR("REMOVIDO_PELO_USUARIO_RECEBEDOR"),
    REMOVIDO_PELO_PSP("REMOVIDO_PELO_PSP");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("status")
  private StatusEnum status = null;

  public CobPayload devedor(Object devedor) {
    this.devedor = devedor;
    return this;
  }

   /**
   * Os campos aninhados sob o objeto devedor são opcionais e identificam o devedor, ou seja, a pessoa ou a instituição a quem a cobrança está endereçada. Não identifica, necessariamente, quem irá efetivamente realizar o pagamento. Um CPF pode ser o devedor de uma cobrança, mas pode acontecer de outro CPF realizar, efetivamente, o pagamento do documento. Não é permitido que o campo devedor.cpf e campo devedor.cnpj estejam preenchidos ao mesmo tempo. Se o campo devedor.cnpj está preenchido, então o campo devedor.cpf não pode estar preenchido, e vice-versa. Se o campo devedor.nome está preenchido, então deve existir ou um devedor.cpf ou um campo devedor.cnpj preenchido.
   * @return devedor
  **/
  @Schema(description = "Os campos aninhados sob o objeto devedor são opcionais e identificam o devedor, ou seja, a pessoa ou a instituição a quem a cobrança está endereçada. Não identifica, necessariamente, quem irá efetivamente realizar o pagamento. Um CPF pode ser o devedor de uma cobrança, mas pode acontecer de outro CPF realizar, efetivamente, o pagamento do documento. Não é permitido que o campo devedor.cpf e campo devedor.cnpj estejam preenchidos ao mesmo tempo. Se o campo devedor.cnpj está preenchido, então o campo devedor.cpf não pode estar preenchido, e vice-versa. Se o campo devedor.nome está preenchido, então deve existir ou um devedor.cpf ou um campo devedor.cnpj preenchido.")
  public Object getDevedor() {
    return devedor;
  }

  public void setDevedor(Object devedor) {
    this.devedor = devedor;
  }

  public CobPayload valor(CobValor valor) {
    this.valor = valor;
    return this;
  }

   /**
   * Get valor
   * @return valor
  **/
  @Schema(required = true, description = "")
  public CobValor getValor() {
    return valor;
  }

  public void setValor(CobValor valor) {
    this.valor = valor;
  }

  public CobPayload chave(String chave) {
    this.chave = chave;
    return this;
  }

   /**
   * # Formato do campo chave  * O campo chave, obrigatório, determina a chave Pix registrada no DICT que será utilizada para a cobrança. Essa chave será lida pelo aplicativo do PSP do pagador para consulta ao DICT, que retornará a informação que identificará o recebedor da cobrança. * Os tipos de chave podem ser: telefone, e-mail, cpf/cnpj ou EVP. * O formato das chaves pode ser encontrado na seção \&quot;Formatação das chaves do DICT no BR Code\&quot; do [Manual de Padrões para iniciação do Pix](https://www.bcb.gov.br/estabilidadefinanceira/pagamentosinstantaneos). 
   * @return chave
  **/
  @Schema(required = true, description = "# Formato do campo chave  * O campo chave, obrigatório, determina a chave Pix registrada no DICT que será utilizada para a cobrança. Essa chave será lida pelo aplicativo do PSP do pagador para consulta ao DICT, que retornará a informação que identificará o recebedor da cobrança. * Os tipos de chave podem ser: telefone, e-mail, cpf/cnpj ou EVP. * O formato das chaves pode ser encontrado na seção \"Formatação das chaves do DICT no BR Code\" do [Manual de Padrões para iniciação do Pix](https://www.bcb.gov.br/estabilidadefinanceira/pagamentosinstantaneos). ")
  public String getChave() {
    return chave;
  }

  public void setChave(String chave) {
    this.chave = chave;
  }

  public CobPayload solicitacaoPagador(String solicitacaoPagador) {
    this.solicitacaoPagador = solicitacaoPagador;
    return this;
  }

   /**
   * O campo solicitacaoPagador, opcional, determina um texto a ser apresentado ao pagador para que ele possa digitar uma informação correlata, em formato livre, a ser enviada ao recebedor. Esse texto será preenchido, na pacs.008, pelo PSP do pagador, no campo RemittanceInformation &lt;RmtInf&gt;. O tamanho do campo &lt;RmtInf&gt; na pacs.008 está limitado a 140 caracteres.
   * @return solicitacaoPagador
  **/
  @Schema(description = "O campo solicitacaoPagador, opcional, determina um texto a ser apresentado ao pagador para que ele possa digitar uma informação correlata, em formato livre, a ser enviada ao recebedor. Esse texto será preenchido, na pacs.008, pelo PSP do pagador, no campo RemittanceInformation <RmtInf>. O tamanho do campo <RmtInf> na pacs.008 está limitado a 140 caracteres.")
  public String getSolicitacaoPagador() {
    return solicitacaoPagador;
  }

  public void setSolicitacaoPagador(String solicitacaoPagador) {
    this.solicitacaoPagador = solicitacaoPagador;
  }

  public CobPayload infoAdicionais(List<CobBaseInfoAdicionais> infoAdicionais) {
    this.infoAdicionais = infoAdicionais;
    return this;
  }

  public CobPayload addInfoAdicionaisItem(CobBaseInfoAdicionais infoAdicionaisItem) {
    if (this.infoAdicionais == null) {
      this.infoAdicionais = new ArrayList<CobBaseInfoAdicionais>();
    }
    this.infoAdicionais.add(infoAdicionaisItem);
    return this;
  }

   /**
   * Cada respectiva informação adicional contida na lista (nome e valor) deve ser apresentada ao pagador.
   * @return infoAdicionais
  **/
  @Schema(description = "Cada respectiva informação adicional contida na lista (nome e valor) deve ser apresentada ao pagador.")
  public List<CobBaseInfoAdicionais> getInfoAdicionais() {
    return infoAdicionais;
  }

  public void setInfoAdicionais(List<CobBaseInfoAdicionais> infoAdicionais) {
    this.infoAdicionais = infoAdicionais;
  }

  public CobPayload status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(required = true, description = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CobPayload cobPayload = (CobPayload) o;
    return Objects.equals(this.devedor, cobPayload.devedor) &&
        Objects.equals(this.valor, cobPayload.valor) &&
        Objects.equals(this.chave, cobPayload.chave) &&
        Objects.equals(this.solicitacaoPagador, cobPayload.solicitacaoPagador) &&
        Objects.equals(this.infoAdicionais, cobPayload.infoAdicionais) &&
        Objects.equals(this.status, cobPayload.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devedor, valor, chave, solicitacaoPagador, infoAdicionais, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CobPayload {\n");
    
    sb.append("    devedor: ").append(toIndentedString(devedor)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    chave: ").append(toIndentedString(chave)).append("\n");
    sb.append("    solicitacaoPagador: ").append(toIndentedString(solicitacaoPagador)).append("\n");
    sb.append("    infoAdicionais: ").append(toIndentedString(infoAdicionais)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
