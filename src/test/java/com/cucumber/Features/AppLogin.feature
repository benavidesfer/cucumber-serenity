Feature: github login

  Scenario: login without username and password
    Given Usuario se encuentra en el homepage de Github
    When Usuario hace el click en el boton Sign in
    Then Usuario ve la pantalla de login
    
  Scenario: login with invalid username and password 
    Given Usuario se encuentra en el homepage de Github
    When Usuario hace el click en el boton Sign in
    Then Usuario ve la pantalla de login
    Then Usuario ingresa su usuario y contraseña
    When Usuario hace click en el boton de Log in
    Then Usuario ve mensaje de username o password incorrecto