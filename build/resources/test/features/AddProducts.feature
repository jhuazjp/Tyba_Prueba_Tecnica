@AddProducts
  Feature: Agregar Productos al carrito

    Scenario Outline: Yo como usuario deseo agregar disitintos productos al carrito
      Given el usuario ingresa al aplicativo
    |UserName|Password|Producto A|Cantidad A|Color A|Producto B|Cantidad B|Color B|Producto C|Cantidad C|Color C|
    |<UserName>|<Password>|<Producto A>|<Cantidad A>|<Color A>|<Producto B>|<Cantidad B>|<Color B>|<Producto C>|<Cantidad C>|<Color C>|

      When el usuario seleciona los productos de preferencia
        |UserName|Password|Producto A|Cantidad A|Color A|Producto B|Cantidad B|Color B|Producto C|Cantidad C|Color C|
        |<UserName>|<Password>|<Producto A>|<Cantidad A>|<Color A>|<Producto B>|<Cantidad B>|<Color B>|<Producto C>|<Cantidad C>|<Color C>|

      Then el usuario valida que sus productos se agregaron correctamente
        |UserName|Password|Producto A|Cantidad A|Color A|Producto B|Cantidad B|Color B|Producto C|Cantidad C|Color C|
        |<UserName>|<Password>|<Producto A>|<Cantidad A>|<Color A>|<Producto B>|<Cantidad B>|<Color B>|<Producto C>|<Cantidad C>|<Color C>|

      Examples:
        |UserName|Password|Producto A|Cantidad A|Color A|Producto B|Cantidad B|Color B|Producto C|Cantidad C|Color C|
        ##@externaldata@src/main/resources/data/AddProducts.xlsx@AddProducts@
   |Jhuaz   |Jhuaz23123   |HP_ELITEPAD_1000_G2_TABLET   |1   |GRAY   |HP_ELITEBOOK_FOLIO   |1   |GRAY   |HP_ROAR_PLUS_WIRELESS_SPEAKER   |1   |BLACK|


    Scenario Outline: Yo como usuario quitar disitintos productos al carrito
      Given el usuario ingresa al aplicativo
        |UserName|Password|Producto A|Cantidad A|Color A|Producto B|Cantidad B|Color B|Producto C|Cantidad C|Color C|
        |<UserName>|<Password>|<Producto A>|<Cantidad A>|<Color A>|<Producto B>|<Cantidad B>|<Color B>|<Producto C>|<Cantidad C>|<Color C>|

      When el usuario seleciona los productos de preferencia
        |UserName|Password|Producto A|Cantidad A|Color A|Producto B|Cantidad B|Color B|Producto C|Cantidad C|Color C|
        |<UserName>|<Password>|<Producto A>|<Cantidad A>|<Color A>|<Producto B>|<Cantidad B>|<Color B>|<Producto C>|<Cantidad C>|<Color C>|

      And el usuario elimina los productos
        |UserName|Password|Producto A|Cantidad A|Color A|Producto B|Cantidad B|Color B|Producto C|Cantidad C|Color C|
        |<UserName>|<Password>|<Producto A>|<Cantidad A>|<Color A>|<Producto B>|<Cantidad B>|<Color B>|<Producto C>|<Cantidad C>|<Color C>|


      Then el usuario valida que sus productos se quitaron correctamente
        |UserName|Password|Producto A|Cantidad A|Color A|Producto B|Cantidad B|Color B|Producto C|Cantidad C|Color C|
        |<UserName>|<Password>|<Producto A>|<Cantidad A>|<Color A>|<Producto B>|<Cantidad B>|<Color B>|<Producto C>|<Cantidad C>|<Color C>|

      Examples:
        |UserName|Password|Producto A|Cantidad A|Color A|Producto B|Cantidad B|Color B|Producto C|Cantidad C|Color C|
        ##@externaldata@src/main/resources/data/AddProducts.xlsx@DeleteProduct@
   |Jhuaz   |Jhuaz23123   |HP_ELITEPAD_1000_G2_TABLET   |1   |GRAY   |HP_ELITEBOOK_FOLIO   |1   |GRAY   |HP_ROAR_PLUS_WIRELESS_SPEAKER   |1   |BLACK|

    Scenario Outline: Yo como usuario editar disitintos productos en el carrito
      Given el usuario ingresa al aplicativo
        |UserName|Password|Producto A|Cantidad A|Color A|Producto B|Cantidad B|Color B|Producto C|Cantidad C|Color C|
        |<UserName>|<Password>|<Producto A>|<Cantidad A>|<Color A>|<Producto B>|<Cantidad B>|<Color B>|<Producto C>|<Cantidad C>|<Color C>|

      When el usuario seleciona los productos de preferencia
        |UserName|Password|Producto A|Cantidad A|Color A|Producto B|Cantidad B|Color B|Producto C|Cantidad C|Color C|
        |<UserName>|<Password>|<Producto A>|<Cantidad A>|<Color A>|<Producto B>|<Cantidad B>|<Color B>|<Producto C>|<Cantidad C>|<Color C>|

      And el usuario edita los productos de su preferencia
        |UserName|Password|Producto A|Cantidad A|Color A|Producto B|Cantidad B|Color B|Producto C|Cantidad C|Color C|
        |<UserName>|<Password>|<Producto A>|<Cantidad A>|<Color A>|<Producto B>|<Cantidad B>|<Color B>|<Producto C>|<Cantidad C>|<Color C>|


      Then el usuario valida que que se editaran los productos correctamente
        |UserName|Password|Producto A|Cantidad A|Color A|Producto B|Cantidad B|Color B|Producto C|Cantidad C|Color C|
        |<UserName>|<Password>|<Producto A>|<Cantidad A>|<Color A>|<Producto B>|<Cantidad B>|<Color B>|<Producto C>|<Cantidad C>|<Color C>|

      Examples:
        |UserName|Password|Producto A|Cantidad A|Color A|Producto B|Cantidad B|Color B|Producto C|Cantidad C|Color C|
        ##@externaldata@src/main/resources/data/AddProducts.xlsx@EdtisProducts@
   |Jhuaz   |Jhuaz23123   |HP_ELITEPAD_1000_G2_TABLET   |1   |GRAY   |HP_ELITEBOOK_FOLIO   |1   |GRAY   |HP_ROAR_PLUS_WIRELESS_SPEAKER   |1   |BLACK|


