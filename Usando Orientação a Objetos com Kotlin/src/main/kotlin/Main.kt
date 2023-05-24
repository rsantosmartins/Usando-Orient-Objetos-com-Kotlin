import model.*

fun main() {
    println("iniciando teste de abstração!")

    val estruturasDeControlerDeFluxoEColecoesEmKotlin = EducationContent("Estruturas de Controler de Fluxo e coleções em Kotlin")

    // Criação de Steps para conteúdo educacional(Estruturas de Controler de Fluxo e coleções em Kotlin)
    // Step Apresentação
    val apresentacao = Step("Apresentação")
    // Adicionando Aula a grade de apresentação
    apresentacao.addLesson(Lesson("Introdução e Objetivos", 6))

    // Adicionando Step apresentação ao conteúdo educacional
    estruturasDeControlerDeFluxoEColecoesEmKotlin.addStep(apresentacao)

    // Step Controle de Fluxo
    val controleDeFluxo = Step("Controle de Fluxo")
    // Adicionando Aulas a grade de Controle de Fluxo
    controleDeFluxo.addLesson(
        Lesson("When Statement", 7),
        Lesson("When Expression", 7),
        Lesson("Lopps: For", 6),
        Lesson("Loops: While e do while", 7),
        Lesson("Loops: Iterators", 6),
        Lesson("Rangers: Loops com Int", 5),
        Lesson("Rangers: Ifs e loops com Char", 4),
        Lesson("Verificações de Igualdade == e ===", 5),
        Lesson("Expressão Condicional", 3)
    )
    // Adicionando Step Controle de Fluxo ao conteúdo educacional
    estruturasDeControlerDeFluxoEColecoesEmKotlin.addStep(controleDeFluxo)

    //Step Coleções
    val colecoes = Step("Coleções")
    // Adicionando Aulas a grade Coleções
    colecoes.addLesson(
        Lesson("Listas (List)", 11),
        Lesson("Conjuntos (Set)", 7),
        Lesson("Mapas (Map)", 8),
        Lesson("Funções Úteis", 9)
    )

    // Adicionando Step Coleções ao conteúdo educacional
    estruturasDeControlerDeFluxoEColecoesEmKotlin.addStep(colecoes)


    // Step material de apoio
    val materialDeApoio = Step("Materias de Apoio e Questionário")
    materialDeApoio.addLesson(
        Lesson("Materias de Apoio e Questionário e Conclusão", 4)
    )

    // Adicionando Step material de apoio ao conteúdo educacional
    estruturasDeControlerDeFluxoEColecoesEmKotlin.addStep(materialDeApoio)

    println("Dados do conteúdo educacional (Estruturas de Controler de Fluxo e Coleções em Kotlin)")
    println(estruturasDeControlerDeFluxoEColecoesEmKotlin.getSteps())

    // Adicionando meu conteúdo educacional na formação
    val bootcampTQIKotlinBackendDeveloper = Training("Bootcamp TQI Kotlin - Backend Developer")
    bootcampTQIKotlinBackendDeveloper.addContent(estruturasDeControlerDeFluxoEColecoesEmKotlin)

    println("Dados da minha formação (Bootcamp TQI Kotlin - Backend Developer)")
    println("Formação: " + bootcampTQIKotlinBackendDeveloper.name + " - Duração: " + bootcampTQIKotlinBackendDeveloper.getDuration())

    // Criando usuários
    val martins = User("Rafael Martins", "rsantosmartins@icloud.com")
    val cruvinel = User("Laissa Cruvinel", "laa-issa@hotmail.com")

    // Adicionando usuários na formação
    bootcampTQIKotlinBackendDeveloper.register(martins)
    bootcampTQIKotlinBackendDeveloper.register(cruvinel)

    //Mostrando os usuários cadastrados na formação
    println("Alunos da formação: " + bootcampTQIKotlinBackendDeveloper.name)
    println("Alunos: " + bootcampTQIKotlinBackendDeveloper.getSubscribed())

}