
 import kotlin.system.exitProcess

 class bancofinanceiro() {

    private var nome = ""
    private var idade = 0
    private var digito = 0
    private  var valor = 3000
    private var nomeusuario = "Fulano Pereira"

    fun main(){
        usuario()

        menu()

    }

    fun usuario() { // login

        println("Faça seu login.")
        Thread.sleep(1000)
        println(".")

        println("Olá, qual é o seu nome? ")
        nome = readln().trimStart().trimEnd()
        Thread.sleep(1000)

        println(".")
        println(".")
        println(".")
        Thread.sleep(1000)

        println("Seja bem vindo, $nome! é um prazer ter você por aqui!")
        Thread.sleep(1000)

        println(".")
        println(".")
        println(".")
        Thread.sleep(1000)

        println("Qual a sua idade?: ")
         idade = readln().toInt()

        if (idade >= 18) {
            Thread.sleep(1000)

        }

        if (idade < 18) {

            println(".")
            println("você ainda não possui idade suficiente para criar uma conta!")

            exitProcess(0)
        }

        println(".")
        println(".")
        println(".")
        Thread.sleep(1000)

        while (true) {

            println("Saiba que ao continuar, você terá que criar uma senha.")
            println(".")
            Thread.sleep(3000)

            println("A senha é essencial para proteger às suas informações e transações bancárias. Ela garante que")
            println("apenas você tenha acesso às suas contas e ajuda a prevenir fraudes. Use uma senha forte de 4 dígitos e não a")
            println("compartilhe para manter sua segurança.")
            println(".")

            Thread.sleep(2000)

            print("Senha: ")
            digito = readln().trim().toInt()

            if (digito == 3589) {
                println(".")
                println("Senha cadastrada com sucesso!")
                return

            } else {
                println(".")
                println("Senha inválida!")
                exitProcess(0)
            }
        }
    }


     fun menu(){
         println(".")
         Thread.sleep(2000)
         println("""
             Informe a ação que deseja realizar no momento:
             
         1 -> Saldo
         2 -> Saque
         3 -> Transferência
         4 -> Extrato
         5 -> Depósito
         6 -> Sair
         """)

         val acao = readln().toInt()

         when(acao) {

             1 -> Saldo()
             2 -> Saque()
             3 -> Transferencia()
             4 -> Extrato()
             5 -> Deposito()
             6 -> {
                 println("Saindo...")

                 println(" Agradecendo por utilizar os serviços do banco: $nome, foi um prazer ter você por aqui!.")
                 exitProcess(0)
             }
             else -> println("Opção inválida, tente novamente.")

         }

}
    fun Saque(){
        println(".")
        println("Para continuar, informe a senha para que o acesso seja liberado.")
        val senhaa = readln().trim().toInt()

        if (senhaa == 3589) {
            println(".")
            println("Acesso liberado!")
        } else {
            println(".")
            println("Senha incorreta")
            return
        }

        println(".")
        println("Informe o valor que você deseja extrair da sua conta: ")
        val dinheiro = readln().toDouble()

        if (dinheiro > valor) {
            println(".")
            println("Não foi possível realizar a ação!")
            println("Valor extrapolado. Tente novamente de acordo com saldo atual.")
            return
        }

        if (dinheiro <= 0) {
            println(".")
            println("Não foi possível realizar a ação!")
            println("Valor inválido. Tente novamente!")
            return
        }

        else{
            println(".")
            println("Valor extraido com sucesso!")
            println(".")
            println("Saldo atual: ${valor - dinheiro}")

        }

    }
    fun Saldo(){

        println(".")
        println("Para continuar, informe a senha para que o acesso seja liberado.")
        val senhaa = readln().trim().toInt()

        if (senhaa == 3589) {
            println(".")
            println("Acesso liberado!")
        } else {
            println(".")
            println("Senha incorreta")
            return
        }

        println(".")
        println("Olá, deseja ver o saldo atual da sua conta? ")
        val resposta = readln().trim()

        if (resposta == "sim") {
            println(".")
            println("$nome, seu saldo atual é igual a: $valor")
        }

        else(return)

    }
    fun Transferencia(){

        println(".")
        println("Para continuar, informe a senha para que o acesso seja liberado.")
        val senhaa = readln().trim().toInt()

        if (senhaa == 3589) {
            println(".")
            println("Acesso liberado!")
        } else {
            println(".")
            println("Senha incorreta")
            return
        }

        println(".")
        println("Olá, $nome! qual é o valor que você deseja realizar a transrência bancária?: ")
        val vl = readln().toDoubleOrNull()

        if (vl == null) {
            println(".")
            println("Valor inválido!")
            return
        }

        if (vl<= 0) {
            println(".")
            println("O valor inválido!")
            return
        }

        if (vl > valor) {
            println(".")
            println("Valor inválido!")
            return
        }

        println(".")
        println("Informe o número comrespondente a conta do usuário(a) que você deseja realizar a transrência")
        val contausuario = readln().trim().toDoubleOrNull()

       if (contausuario?.toInt() == 123){

           println(".")
           println("Usuário, encontrado com sucesso!")
           println(".")
           println("$nome, você deseja fazer transferência para $nomeusuario? ")

           val res = readln().trim()

           if (res == "sim"){
               println(".")
               println("Transferência realizada com sucesso!")
               println(".")
               println("Saldo atual: ${valor - vl}")
           }

           else(return)

       }
        }
    }
    fun Extrato(){

        println(".")
        println("Para continuar, informe a senha para que o acesso seja liberado.")
        val senha = readln().trim().toInt()

        if (senha == 3589) {
            println(".")
            println("Acesso liberado!")
        }
        else {
            println(".")
            println("Senha incorreta")
            return
        }

        println(".")
        println("""Movimentações desse mês:
            
                   Data      | Descrição       | Valor   
                   01/09/24  | Marcado         | 350,00
                   05/09/24  | Açogue          | 150,00
                   10/09/24  | Salão de beleza | 300,00
                   12/09/24  | Manicure        | 150,00
                   18/09/24  | Farmácia        | 300,00
                   
        """.trimMargin())
    }
    fun Deposito(){

        println(".")
        println("Para continuar, informe a senha para que o acesso seja liberado.")
        val senha = readln().trim().toInt()

        if (senha == 3589) {
            println(".")
            println("Acesso liberado!")
        } else {
            println(".")
            println("Senha incorreta")
            return
        }

        println(".")
         println("Informe o valor que você deseja depositar: ")
        val vldepositar = readln().toDouble().toInt()

        if (vldepositar == 0) {
            println(".")
            println("Valor inválido!")
            return
        }

        if (vldepositar < 0) {
            println(".")
            println("O valor inválido!")
            return
        }

        if (vldepositar > 3000) {
            println(".")
            println("Valor inválido!")
            return
        }

        println(".")
        println("Informe o número comrespondente a conta do usuário(a) que você deseja realizar a transrência")
        val contausuario = readln().trim().toDoubleOrNull()

        if (contausuario?.toInt() == 123){
        }

            val nmusuario = "Cachorro Caramelo"
            println(".")
            println("Usuário, encontrado com sucesso!")
            println(".")
            println("Olá! você deseja fazer transferência para $nmusuario? ")

            val res = readln().trim()

            if (res == "sim"){
                println(".")
                println("Transferência realizada com sucesso!")
                println(".")
                println("Saldo atual: ${3000 - vldepositar}")
            }

            else(return)

        }
   fun main() {
    bancofinanceiro().main()
    }


