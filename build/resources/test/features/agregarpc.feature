#language:es
Característica: Agregar un nuevo computador

 Antecedentes:
   Dado que el usuario ingresa a la pagina para agregar un pc

  @CasoExitoso
  Esquema del escenario: Diligenciamiento exitoso del formulario para agregar un nuevo pc

    Cuando diligencia el formulario registrando el nombre <computador>, <ingreso>, <vencimiento>, <compania>"
    Entonces se crea un nuevo pc

    Ejemplos:
    |computador|ingreso|vencimiento|compania|
    |"Cualquier nombre"|"2022-01-01"|"2023-01-01"|"3"|

  @CasoFallido
  Esquema del escenario: Diligenciamiento fallido del formulario para agregar un nuevo pc

    Cuando diligenciar el formulario con valores errados <computadorFa>, <ingresoFa>, <vencimientoFa>, <companiaFa>"
    Entonces no permite crear un computador por valores errados

    Ejemplos:
    |computadorFa|ingresoFa|vencimientoFa|companiaFa|
    |""   |"2020-01-01"|"2023-01-01"|"3"|
    |"PC1"|"01-01-2020"|"2023-01-01"|"3"|
    |"PC2"|"2020-01-01"|"01-01-2023"|"3"|