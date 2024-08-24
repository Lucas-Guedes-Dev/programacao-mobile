//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val teste = Teste("lucas", 12)
    teste.PrintTeste()
}

class Teste (val nome: String, val idade: Int){
    fun PrintTeste() {
        println(this.nome + this.idade)
    }
}