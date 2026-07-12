## Endpoints da Aplicação

- **POST/comunicacao/agendar
- - Agenda uma nova communication
- - Basta preacher corpo da requisição
---
- **GET/comunicacao?emailDestinatario
- - Busca status de comunicação passando email
- - cadastrado como parâmetro
---
- **PATCH/comunicacao/cancelar?emailDestinatario
- - Altera status da comunicação para cancelado
- - passando email como parâmetro
