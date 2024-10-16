Aqui está uma reformulação do texto para que você possa usar no GitHub:

---

# 📝 NoteSync - Aplicativo de Anotações com Firebase

## Descrição do Projeto
O **NoteSync** é um aplicativo mobile desenvolvido em **Java** que permite a criação e sincronização de anotações. Utilizando o **Firebase Authentication**, o app oferece um sistema simples e seguro para login, registro e recuperação de senha, garantindo uma experiência fluida para o usuário.

## 🛠️ Tecnologias Utilizadas
- **Linguagem**: Java ☕
- **Plataforma**: Android 🤖
- **Autenticação**: Firebase Authentication 🔥
- **IDE**: Android Studio 🛠️

## 🚀 Funcionalidades
- **Login**: Autenticação via e-mail e senha, com mensagens de erro em caso de falha.
- **Registro**: Permite criar uma nova conta e realiza autenticação automática.
- **Logout**: Opção para desconectar e retornar à tela de login.
- **Recuperação de Senha**: Envio de e-mail para redefinição de senha.
- **Exibição de Dados**: Mostra o e-mail do usuário logado após autenticação.

## 🌟 Pontos Fortes
- **Integração com Firebase**: Implementação simples e de fácil manutenção.
- **Navegação Intuitiva**: Alternância suave entre as telas.
- **Gerenciamento de Sessão**: Login e logout eficazes, preservando o estado do usuário.

## 📈 Melhorias Futuras
- **Validação de Entradas**: Garantir formato correto do e-mail e senha.
- **Adicionar Novas Telas**: Expansão das funcionalidades do aplicativo.
- **Melhoria no Design**: Aperfeiçoar a estética e usabilidade do app.

---

### TELAS

#### **Login**:
- **Campos de entrada**:
  - **Email**: Campo para o usuário inserir seu endereço de e-mail.
  - **Senha**: Campo onde o usuário deve digitar sua senha.

- **Botões**:
  - **Esqueci a senha**: Redireciona para a página de recuperação de senha.
  - **Login**: Botão azul que autentica o usuário com as credenciais inseridas.
  - **Cadastre-se**: Botão dourado que leva o usuário para a página de cadastro.

![Tela de Login](https://github.com/user-attachments/assets/d651c11a-5cf6-420f-afc7-a3d8b849be1b)

---

#### **Cadastro**:
- **Campos de Entrada**:
  - **Email**: Campo para o usuário inserir o endereço de e-mail.
  - **Senha**: Campo para o usuário definir uma senha.
  - **Confirme a senha**: Campo adicional para garantir que ambas as senhas coincidam.

- **Botões**:
  - **Cadastrar**: Botão azul que realiza o cadastro do usuário e adiciona ao Firebase.
  - **Já tenho uma conta**: Botão dourado que retorna à página de login.

![Tela de Cadastro](https://github.com/user-attachments/assets/2a8c0d49-c154-427e-b00a-4a553c977819)

---

#### **Esqueci a Senha**:
- **Campo de Entrada**:
  - Um campo único para o usuário inserir seu e-mail.

- **Botões**:
  - **Enviar**: Botão azul que envia o e-mail para recuperação de senha.
  - **Voltar**: Botão dourado que retorna à tela de login.

![Tela de Esqueci a Senha](https://github.com/user-attachments/assets/153b94d0-07bf-469c-ae8c-867727f1c424)

---

#### **Tela Inicial**:
- Exibe o e-mail do usuário logado.
- **Botão**:
  - **Logout**: Botão com ícone representando saída que redireciona para a tela de login.

![Tela Inicial](https://github.com/user-attachments/assets/1a402ce6-2109-4dec-adc6-038fd0cfd4f0)

---

Sinta-se à vontade para fazer ajustes ou adições! Se precisar de mais alguma coisa, é só avisar.
