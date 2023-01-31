#language:pt
  Funcionalidade: Teste login affthehype

  Cenario: Login com sucesso
    Dado que eu esteja na pagina: "https://affthehype.com/produtos/cordao-adenia-chloe/"
    Quando preencher email: "paularecarneiro12@gmail" e senha: "Teste@123"
    E clicar em fazer login
    Entao valido que a pagina Minha Conta foi carregada

