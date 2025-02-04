# 📌 API de Pedidos

API RESTful para gerenciamento de pedidos, desenvolvida em **Kotlin** com **Spring Boot**, seguindo boas práticas de arquitetura.

## 🚀 Tecnologias Utilizadas
- **Kotlin** + **Spring Boot**
- **Spring Data JPA** (Persistência de dados)
- **H2 Database** (Banco de dados)
- **Springdoc OpenAPI** (Documentação Swagger)

---

## 🛠️ Como Rodar o Projeto
### 🔹 **1️⃣ Configuração do Banco de Dados**
- **Opção 1 (H2 - Testes)**: O banco já está configurado para rodar em memória.

### 🔹 **2️⃣ Clonar o repositório**
```sh
git clone [https://github.com/seu-usuario/api-pedidos.git](https://github.com/felipebs86/xpe-order-api.git)
cd xpe-order-api
```

### 🔹 **3️⃣ Rodar a Aplicação Localmente**
```sh
./gradlew bootRun  # Se estiver usando Gradle
```

A API estará disponível em: `http://localhost:8080`

### 🔹 **4️⃣ Acessar o Swagger UI** (Testes da API)
Após rodar a aplicação, acesse:
```
http://localhost:8080/swagger-ui/index.html
```
Lá você pode visualizar e testar os endpoints de forma interativa.

---

## 🔥 Endpoints da API
### 📍 **Pedidos** (`/pedidos`)
| Método  | Endpoint                     | Descrição                   |
|---------|------------------------------|------------------------------|
| `GET`   | `/orders`                   | Lista todos os pedidos      |
| `GET`   | `/orders/{id}`               | Busca um pedido pelo ID     |
| `POST`  | `/orders`                    | Cria um novo pedido         |
| `DELETE`| `/orders/{id}`               | Remove um pedido            |
| `GET`   | `/orders/count`             | Retorna a quantidade total  |

---

## 📌 Contribuição
1. Faça um fork do repositório.
2. Crie uma branch (`git checkout -b feature/nova-funcionalidade`).
3. Faça commit das suas alterações (`git commit -m 'Adiciona nova funcionalidade'`).
4. Faça push (`git push origin feature/nova-funcionalidade`).
5. Abra um Pull Request no GitHub.

---

## 📝 Licença
Este projeto está sob a licença MIT. Sinta-se à vontade para usar e modificar!

