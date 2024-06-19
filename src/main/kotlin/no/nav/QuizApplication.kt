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
        //if (question.category == "ping-pong") ping(question)
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
        //println(question.question)
        val msg = question.question
        msg.split(" ")
        val x = msg[0].toInt()
        val y = msg[2].toInt()
        val operation = msg[1]
        val operations = arrayOf("+", "-", "/", "*")
        if(operation.equals(operations[0])) {
            val answer = x+y
            answer(question.category, question.id(), answer.toInt().toString())

        }
        else if(operation.equals(operations[1])) {
                val answer = x-y
                answer(question.category, question.id(), answer.toInt().toString())

        }
        else if(operation.equals(operations[2])) {
            val answer = x/y   
            answer(question.category, question.id(), answer.toInt().toString())
        }
        else if(operation.equals(operations[3])) {
            val answer = x*y
            answer(question.category, question.id(), answer.toInt().toString())
        }
        
    }
 }
    /*
    [Question] category: ping-pong, question: ping, id: fabd13f6-52a3-438a-944a-d20caa057f40
    
    private fun ping(question: Question){
        answer(question.category, questionId="fabd13f6-52a3-438a-944a-d20caa057f40", "pong")
    }
    
    [Question] category: arithmetic, question: 
    94 / 95 (svaret må rundes til int), id: f1e5fa1d-b2af-4d5b-a37a-4f5e116ec848
    */

