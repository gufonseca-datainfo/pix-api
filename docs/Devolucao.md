# Devolucao

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**rtrId** | **String** | ReturnIdentification que transita na PACS004. | 
**valor** | **String** | Valor a devolver. | 
**horario** | [**DevolucaoHorario**](DevolucaoHorario.md) |  | 
**status** | [**StatusEnum**](#StatusEnum) | Status da devolução. | 

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
EM_PROCESSAMENTO | &quot;EM_PROCESSAMENTO&quot;
DEVOLVIDO | &quot;DEVOLVIDO&quot;
NAO_REALIZADO | &quot;NAO_REALIZADO&quot;
