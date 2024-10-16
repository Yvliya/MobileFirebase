📝 NoteSync - Aplicativo de Anotações com Firebase
Descrição do Projeto
O NoteSync é um aplicativo mobile desenvolvido em Java, que permite a criação e sincronização de anotações. Usando o Firebase Authentication, o app oferece um sistema simples e seguro para login, registro e recuperação de senha, proporcionando uma experiência fluida para o usuário.

🛠️ Tecnologias Utilizadas
Linguagem: Java ☕
Plataforma: Android 🤖
Autenticação: Firebase Authentication 🔥
IDE: Android Studio 🛠️

🚀 Funcionalidades
Login: Autenticação via e-mail e senha. Em caso de erro, uma mensagem é exibida.
Registro: Permite criar uma conta nova e autenticar-se automaticamente.
Logout: Opção para desconectar da conta e retornar à tela de login.
Recuperação de Senha: Envio de e-mail para redefinir a senha.
Exibição de Dados: Exibe o e-mail do usuário logado após autenticação.

🌟 Pontos Fortes
Integração com Firebase: Implementação simples e de fácil manutenção.
Navegação Intuitiva: Alternância suave entre as telas.
Gerenciamento de Sessão: Login e logout eficazes, preservando o estado do usuário.

📈 Melhorias Futuras
Validação de Entradas: Garantir formato correto do e-mail e senha.
Adicionar novas telas
Melhoria no Design


*TELAS*
Login: 
--Campos de entrada:
Email: Campo para o usuário inserir seu endereço de e-mail.
Senha: Campo onde o usuário deve digitar sua senha.

--Botões:
Opção de "Esqueci a senha": Redireciona o usuário para uma página de recuperação de senha, caso ele a tenha esquecido.
Login: Um botão azul que autentica o usuário com as credenciais inseridas (e-mail e senha).
Cadastre-se: Um botão dourado que direciona o usuário para a página de cadastro, permitindo criar uma nova conta.
![image](https://github.com/user-attachments/assets/d651c11a-5cf6-420f-afc7-a3d8b849be1b)

Cadastro:
--Campos de Entrada:
Email: Campo onde o usuário deve inserir o endereço de e-mail.
Senha: Campo para o usuário definir uma senha.
Confirme a senha: Um campo adicional para o usuário confirmar a senha, garantindo que ambas as senhas coincidam.

--Botões:
Cadastrar: Um botão azul que, ao ser pressionado, realiza o cadastro do usuário com as informações fornecidas (e-mail e senha), adcionando ao firebase.
Já tenho uma conta: Um botão dourado que leva o usuário de volta para a página de login, caso ele já possua uma conta.
![image](https://github.com/user-attachments/assets/2a8c0d49-c154-427e-b00a-4a553c977819)

Esqueci a Senha:
--Campo de Entrada:
Um campo único onde o usuário insere seu e-mail. Esse campo é utilizado para identificar o usuário que deseja alterar a senha.

--Botões:
Enviar: Um botão azul que, ao ser pressionado, envia o e-mail para o processo de recuperação de senha, enviando um link para redefinição de senha ao e-mail fornecido.
Voltar: Um botão dourado que retorna o usuário à página anterior (tela de login)
![image](https://github.com/user-attachments/assets/153b94d0-07bf-469c-ae8c-867727f1c424)

Tela Inicial:
Contém o email logado
--Botão:
Logout: botão com icon representando saída, que ao ser pressionado é redirecionado a tela  de Login.
![image](https://github.com/user-attachments/assets/1a402ce6-2109-4dec-adc6-038fd0cfd4f0)









