import Alura_Kotlin.JuniorWender.GitHub.modelo.Cliente
import Alura_Kotlin.JuniorWender.GitHub.modelo.Diretor
import Alura_Kotlin.JuniorWender.GitHub.modelo.Gerente
import Alura_Kotlin.JuniorWender.GitHub.modelo.SistemaInterno

fun testaAutenticacao() {
    val gerente = Gerente(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
        senha = 1000
    )
    val diretora = Diretor(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 1000.0,
        senha = 2000,
        plr = 200.0
    )
    val cliente = Cliente(
        nome = "Gui",
        cpf = "333.333.333-33",
        senha = 1234
    )
    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretora, 2000)
    sistema.entra(cliente, 1234)
}