# <img src="https://imgur.com/MlNEHC2.png" width="110" alt="BugBank" style="vertical-align: middle;"> Desafio BugBank.
## Objetivo do teste
Desenvolver testes automatizados para simular o processo do cadastro de duas contas com saldo no site do Banco BugBank, acessar uma das contas e realizar uma transferência de valor para a outra. Em seguida, valide as operações de saída e entrada de fundos nas contas envolvidas no processo.

## Plano de testes
| ID  | Cenário de Teste                      | Etapas do Teste                                               | Resultado Esperado                                        |
|-----|---------------------------------------|---------------------------------------------------------------|-----------------------------------------------------------|
| 1   | Cadastro da Conta 1                   | 1. Acessar o site do BugBank                                  | Sucesso: Página de Login é exibida                        |
|     |                                       | 2. Clicar no botão "Registrar"                                | Sucesso: Página de Registro é exibida                     |
|     |                                       | 3. Preencher o formulário de registro com dados válidos       | Sucesso: Conta 1 é criada com mensagem de sucesso exibida |
| 2   | Cadastro da Conta 2                   | 1. Acessar o site do BugBank                                  | Sucesso: Página de Login é exibida                        |
|     |                                       | 2. Clicar no botão "Registrar"                                | Sucesso: Página de Registro é exibida                     |
|     |                                       | 3. Preencher o formulário de registro com dados válidos       | Sucesso: Conta 2 é criada com mensagem de sucesso exibida |
| 3   | Acesso à Conta 1                      | 1. Acessar o site do BugBank                                  | Sucesso: Página de Login é exibida                        |
|     |                                       | 2. Inserir credenciais da Conta 1 (autenticar)                | Sucesso: Conta 1 é autenticada com sucesso                |
| 4   | Acesso à Conta 2                      | 1. Acessar o site do BugBank                                  | Sucesso: Página de Login é exibida                        |
|     |                                       | 2. Inserir credenciais da Conta 2 (autenticar)                | Sucesso: Conta 2 é autenticada com sucesso                |
| 5   | Transferência da Conta 2 para Conta 1 | 1. Acessar a página de transferência                          | Sucesso: Página de transferência é exibida                |
|     |                                       | 2. Preencher o valor da transferência com o valor desejado    | Sucesso: Valor é preenchido                               |
|     |                                       | 3. Selecionar Conta 1 como conta de destino                   | Sucesso: Conta 1 é selecionada                            |
|     |                                       | 4. Confirmar a transferência                                  | Sucesso: Transferência é realizada com sucesso            |
| 6   | Validação do Saldo da Conta 1         | 1. Acessar a página de detalhes da Conta 1                    | Sucesso: Página de detalhes é exibida                     |
|     |                                       | 2. Verificar saldo da Conta 1 (deve refletir a transferência) | Sucesso: Saldo correto exibido                            |
| 7   | Validação do Saldo da Conta 2         | 1. Acessar a página de detalhes da Conta 2                    | Sucesso: Página de detalhes é exibida                     |
|     |                                       | 2. Verificar saldo da Conta 2 (deve refletir a transferência) | Sucesso: Saldo correto exibido                            |

## Relatório de evidências
Relatório gerado a cada execução de testes, que permite criar relatórios em HTML.Localizado na pasta Report do
projeto juntamente com screenshots de cada evidência de teste.
<p align="center"> <img src="https://imgur.com/oIOhJj2.png" min-width="100px" max-width="140px"> </p>

## Tecnologias Utilizadas / Frameworks / Bibliotecas
<div>
    <img src="https://imgur.com/NZjgS4y.png" width="40" alt="Node" style="vertical-align: middle;">
    <span style="vertical-align: middle;">IntelliJ IDEA 2022.3.2</span>
</div>
<p></p>
<div>
    <img src="https://imgur.com/T6vRl2Q.png" width="40" alt="Node" style="vertical-align: middle;">
<a href="https://www.selenium.dev/" style="vertical-align: middle;">Selenium - https://www.selenium.dev/</a>
</div>
<p></p>
<div>
    <img src="https://imgur.com/XGHJsjR.png" width="40" alt="Node" style="vertical-align: middle;">
    <a href="https://www.java.com/pt-BR/" style="vertical-align: middle;">Java JDK21 - https://www.selenium.dev/</a>
</div>
<p></p>
<div>
    <img src="https://imgur.com/EnDOYZt.png" width="40" alt="Node" style="vertical-align: middle;">
    <a href="https://junit.org/junit5/" style="vertical-align: middle;">JUnit5 - https://www.selenium.dev/</a>
</div>
<p></p>
<div>
    <img src="https://imgur.com/kn0WGKY.png" width="40" alt="Node" style="vertical-align: middle;">
    <a href="https://www.extentreports.com/" style="vertical-align: middle;">Extent Report - https://www.selenium.dev/</a>
</div>




##	Executando o projeto:
 - Executar o git - comando Git Bash here
 - Clonar o projeto - comando git clone https://github.com/masrodrigues/desafioBanri.git
 - Abrir o projeto no Intellij
 - Atualizar dependências com Maven (Reload all Maven Project)
 - Executar TestCase - RealizarTransferenciasEntreContas (Shift+f10)


## Dependências utilizadas - arquivo pom.xml:

- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.14.1
- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.10.0
- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.5.3
- https://mvnrepository.com/artifact/com.aventstack/extentreports/5.1.1
- https://mvnrepository.com/artifact/com.assertthat/selenium-shutterbug/1.6



