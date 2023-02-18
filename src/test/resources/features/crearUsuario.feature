@NuevoUsuario
Feature: como usuario de product store
  deseo crear un nuevo usuario en su pagina web
  para acceder a sus servicios

  @NuevoUsuarioExitoso
  Scenario Outline: Nuevo usuario exitoso
    Given que Camilo quiere crear un nuevo usuario
    When ingrese sus datos correctamente
      |usuario|clave|
      |<usuario>|<clave>|
    Then debe ver product store en el home de la pagina

    Examples:
      |usuario|clave|
      |prueba9909|123456|