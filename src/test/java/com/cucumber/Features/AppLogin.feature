Feature: github login

  Scenario: login without username and password
    Given Usuario se encuentra en el homepage de Github
    When Usuario hace el click en el boton Sign in
    Then Usuario ve la pantalla de login