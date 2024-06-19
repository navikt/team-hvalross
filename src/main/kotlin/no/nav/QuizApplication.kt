package no.nav

import no.nav.quizrapid.*
import no.nav.rapid.Answer
import no.nav.rapid.Assessment
import no.nav.rapid.Question
import kotlin.math.round


/**
 * QuizApplication
 *
 * Her skal teamet bygge ut funksjonalitet for å løse oppgavene i leesah-game.
 */
class QuizApplication(private val teamName: String): QuizParticipant(teamName) {

    override fun handle(question: Question) {
        logger.log(question)
        if (question.category == "team-registration") handleRegisterTeam(question)
        if (question.category == "arithmetic") arithmetic(question)
    }


    override fun handle(assessment: Assessment) {
        logger.log(assessment)
    }

    override fun handle(answer: Answer) {
        logger.log(answer)
    }

    /**
     * Spørsmål handlers
     */

    private fun handleRegisterTeam(question: Question) {
        //TODO("Her må du skrive kode ;)")
        answer(question.category, questionId = question.id(), "#FFFFFF")
    }

    private fun arithmetic(question: Question){
        val x = 94/95
        answer(question.category, questionId="f1e5fa1d-b2af-4d5b-a37a-4f5e116ec848", round(x))
    }
    /*
    [Question] category: arithmetic, question: 
    94 / 95 (svaret må rundes til int), id: f1e5fa1d-b2af-4d5b-a37a-4f5e116ec848
    */

}