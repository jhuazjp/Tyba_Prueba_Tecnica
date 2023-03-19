@PayProducts
Feature: Yo como usuario deseo realizar la compra de mis productos en el carrito

  Scenario Outline: Yo como usuario quiero pagar mis productos seleccionados con SafePay

    Given el usuario ingresa al aplicativo
      |UserName|Password|
      |<UserName>|<Password>|
    When el usuario seleciona distintos prodcutos
    And el usuario procesa el pago con SafePay
    Then el valida el pago exitosamente

    Examples:
      |UserName|Password|
     ##@externaldata@src/main/resources/data/PayProducts.xlsx@SafePay@
   |Jhuaz   |Jhuaz23123|

