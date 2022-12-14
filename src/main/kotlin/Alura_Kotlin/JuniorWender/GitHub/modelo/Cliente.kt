package Alura_Kotlin.JuniorWender.GitHub.modelo

class Cliente(
    var nome: String,
    val cpf: String,
    private val senha: Int,
    var Endereco: Endereco = Endereco()
) : Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}