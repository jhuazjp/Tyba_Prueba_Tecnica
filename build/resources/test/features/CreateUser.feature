@CreateUsers

Feature:  Yo como usuario me deseo registrar en el aplicativo

  Scenario Outline: Creacion de cuenta exitosa
    Given el usuario se registra en el aplicativo
    When el usuario ingresa sus datos
      |UserName|Password|Email|FirtsName|LastName|PhoneNumber|Country|City|Address|State|PostalCode|
      |<UserName>|<Password>|<Email>|<FirtsName>|<LastName>|<PhoneNumber>|<Country>|<City>|<Address>|<State>|<PostalCode>|
    Then el usuario valida la creacion exitosa de su cuenta
      |UserName|Password|Email|FirtsName|LastName|PhoneNumber|Country|City|Address|State|PostalCode|
      |<UserName>|<Password>|<Email>|<FirtsName>|<LastName>|<PhoneNumber>|<Country>|<City>|<Address>|<State>|<PostalCode>|
    Examples:
      |UserName|Password|Email|FirtsName|LastName|PhoneNumber|Country|City|Address|State|PostalCode|
      ##@externaldata@src/main/resources/data/CreateUser.xlsx@CreateUser@
   |Jhuaz2   |Jhuaz23123   |jupsanabriav@hotmail.com   |Juan   |Sanabria   |3214134806   |Colombia   |Bogota   |Kra 5#96a-65 sur   |Usme   |110541|


    Scenario Outline: Registro con cuenta Existente
      Given el usuario se registra en el aplicativo
      When el usuario ingresa sus datos
        |UserName|Password|Email|FirtsName|LastName|PhoneNumber|Country|City|Address|State|PostalCode|
        |<UserName>|<Password>|<Email>|<FirtsName>|<LastName>|<PhoneNumber>|<Country>|<City>|<Address>|<State>|<PostalCode>|
      Then el usuario no puede registrarse en el aplicativo
        |UserName|Password|Email|FirtsName|LastName|PhoneNumber|Country|City|Address|State|PostalCode|
        |<UserName>|<Password>|<Email>|<FirtsName>|<LastName>|<PhoneNumber>|<Country>|<City>|<Address>|<State>|<PostalCode>|
      Examples:
        |UserName|Password|Email|FirtsName|LastName|PhoneNumber|Country|City|Address|State|PostalCode|
      ##@externaldata@src/main/resources/data/CreateUser.xlsx@UserExist@
   |Jhuaz   |Jhuaz23123   |jupsanabriav@hotmail.com   |Juan   |Sanabria   |3214134806   |Colombia   |Bogota   |Kra 5#96a-65 sur   |Usme   |110541|

  Scenario Outline: Registro con email Existente
    Given el usuario se registra en el aplicativo
    When el usuario ingresa sus datos
      |UserName|Password|Email|FirtsName|LastName|PhoneNumber|Country|City|Address|State|PostalCode|
      |<UserName>|<Password>|<Email>|<FirtsName>|<LastName>|<PhoneNumber>|<Country>|<City>|<Address>|<State>|<PostalCode>|
    Then el usuario no puede continuar con el registro
      |UserName|Password|Email|FirtsName|LastName|PhoneNumber|Country|City|Address|State|PostalCode|
      |<UserName>|<Password>|<Email>|<FirtsName>|<LastName>|<PhoneNumber>|<Country>|<City>|<Address>|<State>|<PostalCode>|
    Examples:
      |UserName|Password|Email|FirtsName|LastName|PhoneNumber|Country|City|Address|State|PostalCode|
      ##@externaldata@src/main/resources/data/CreateUser.xlsx@EmailExist@
   |email   |Jhuaz23123   |jupsanabriav@hotmail.com   |Juan   |Sanabria   |3214134806   |Colombia   |Bogota   |Kra 5#96a-65 sur   |Usme   |110541|

  Scenario Outline: Registro con email Existente
    Given el usuario se registra en el aplicativo
    When el usuario ingresa sus datos
      |UserName|Password|Email|FirtsName|LastName|PhoneNumber|Country|City|Address|State|PostalCode|
      |<UserName>|<Password>|<Email>|<FirtsName>|<LastName>|<PhoneNumber>|<Country>|<City>|<Address>|<State>|<PostalCode>|
    Then el usuario no puede continuar con el registro
      |UserName|Password|Email|FirtsName|LastName|PhoneNumber|Country|City|Address|State|PostalCode|
      |<UserName>|<Password>|<Email>|<FirtsName>|<LastName>|<PhoneNumber>|<Country>|<City>|<Address>|<State>|<PostalCode>|
    Examples:
      |UserName|Password|Email|FirtsName|LastName|PhoneNumber|Country|City|Address|State|PostalCode|
      ##@externaldata@src/main/resources/data/CreateUser.xlsx@PhoneExist@
   |phone   |Jhuaz23123   |jupsanabriav@hotmail.com   |Juan   |Sanabria   |3214134806   |Colombia   |Bogota   |Kra 5#96a-65 sur   |Usme   |110541|

  Scenario Outline: Registro con email sin Terminos y condiciones
    Given el usuario se registra en el aplicativo
    When el usuario ingresa sus datos
      |UserName|Password|Email|FirtsName|LastName|PhoneNumber|Country|City|Address|State|PostalCode|
      |<UserName>|<Password>|<Email>|<FirtsName>|<LastName>|<PhoneNumber>|<Country>|<City>|<Address>|<State>|<PostalCode>|
    Then el usuario no puede continuar con el registro sin aceptar Terminos y condicones
      |UserName|Password|Email|FirtsName|LastName|PhoneNumber|Country|City|Address|State|PostalCode|
      |<UserName>|<Password>|<Email>|<FirtsName>|<LastName>|<PhoneNumber>|<Country>|<City>|<Address>|<State>|<PostalCode>|
    Examples:
      |UserName|Password|Email|FirtsName|LastName|PhoneNumber|Country|City|Address|State|PostalCode|
      ##@externaldata@src/main/resources/data/CreateUser.xlsx@TermsAndConditions@
   |phone   |Jhuaz23123   |jupsanabriav@hotmail.com   |Juan   |Sanabria   |3214134806   |Colombia   |Bogota   |Kra 5#96a-65 sur   |Usme   |110541|

  Scenario Outline: Registro Sin Ofertas Expeciales
    Given el usuario se registra en el aplicativo
    When el usuario ingresa sus datos
      |UserName|Password|Email|FirtsName|LastName|PhoneNumber|Country|City|Address|State|PostalCode|
      |<UserName>|<Password>|<Email>|<FirtsName>|<LastName>|<PhoneNumber>|<Country>|<City>|<Address>|<State>|<PostalCode>|
    And el usuario no desea recibir ofertas exclusivas
    Then el usuario valida la creacion exitosa de su cuenta
      |UserName|Password|Email|FirtsName|LastName|PhoneNumber|Country|City|Address|State|PostalCode|
      |<UserName>|<Password>|<Email>|<FirtsName>|<LastName>|<PhoneNumber>|<Country>|<City>|<Address>|<State>|<PostalCode>|
    Examples:
      |UserName|Password|Email|FirtsName|LastName|PhoneNumber|Country|City|Address|State|PostalCode|
      ##@externaldata@src/main/resources/data/CreateUser.xlsx@TermsAndConditions@
   |phone   |Jhuaz23123   |jupsanabriav@hotmail.com   |Juan   |Sanabria   |3214134806   |Colombia   |Bogota   |Kra 5#96a-65 sur   |Usme   |110541|
