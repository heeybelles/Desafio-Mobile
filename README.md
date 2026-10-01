# 🎬 Desafio Filmes - Android App

Projeto desenvolvido em **Kotlin** para Android como parte das atividades práticas do curso na FATEC Praia Grande. O aplicativo implementa um fluxo de autenticação simples, cadastro em memória e visualização dinâmica de um catálogo de filmes com carregamento remoto de imagens via RecyclerView.

---

## 👥 Integrantes

* **Eduarda Belles**
* **Zeus Machado**

---

## 📱 Funcionalidades

- **Tela de Login (`MainActivity`):** Autenticação simples de usuário com validação de credenciais e mensagens informativas em caso de erro.
- **Cadastro de Filmes (`CadastroFilmesActivity`):** Permite inserir o título, gênero e a URL do pôster do filme. Limpa o formulário automaticamente e exibe notificações de confirmação via `Toast`.
- **Listagem e Gerenciamento (`ListaFilmesActivity`):**
  - Exibição dos filmes cadastrados através de um `RecyclerView` estilizado.
  - Carregamento assíncrono das imagens dos pôsteres a partir de links web usando a biblioteca **Coil**.
  - Remoção em tempo real de itens da lista diretamente no card do filme com atualização fluida de posições (`notifyItemRemoved`).

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** [Kotlin](https://kotlinlang.org/)
- **UI:** XML Views (ConstraintLayout, RecyclerView, Material Design)
- **Carregamento de Imagens:** [Coil 3](https://coil-kt.github.io/coil/) (`io.coil-kt.coil3:coil` + OkHttp engine)
- **Padrão de Dados:** Padrão Singleton DAO (`DaoFilmes`) para armazenamento em memória
- **Target SDK:** 35 | **Min SDK:** 24

---

## 📂 Estrutura do Projeto

```text
br.edu.fatecpg.desafiofilmes/
├── adapter/
│   └── FilmesAdapter.kt         # Adaptador do RecyclerView para exibição e exclusão
├── dao/
│   └── DaoFilmes.kt             # Objeto singleton para gerenciamento de dados em memória
├── model/
│   └── Filme.kt                 # Data class representando o modelo de filme
└── view/
    ├── MainActivity.kt          # Tela de login
    ├── CadastroFilmesActivity.kt# Formulário de inserção de filmes
    └── ListaFilmesActivity.kt   # Tela de catálogo com RecyclerView
```

---

## 🚀 Como Executar o Projeto

1. Clone este repositório ou baixe o código fonte:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   ```
2. Abra o projeto no **Android Studio**.
3. Aguarde o Gradle sincronizar todas as dependências (`Sync Project with Gradle Files`).
4. Conecte um dispositivo físico via depuração USB ou inicie um Emulador Android (API 24+).
5. Clique em **Run** (`Shift + F10`).

> **Credenciais de teste padrão:**
> - **Usuário:** `ale`
> - **Senha:** `123`
