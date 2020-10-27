# CobDataDeVencimento

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataDeVencimento** | [**LocalDate**](LocalDate.md) | Trata-se de uma data, no formato &#x60;yyyy-mm-dd&#x60;, segundo ISO 8601. É a data de vencimento da cobrança. A cobrança pode ser honrada até esse dia, inclusive, em qualquer horário do dia. | 
**validadeAposVencimento** | **Integer** | Trata-se da quantidade de dias corridos após o vencimento em que a cobrança poderá ser paga. Caso vencido este período e a cobrança não tenha sido paga, esta continuará ATIVA. | 
