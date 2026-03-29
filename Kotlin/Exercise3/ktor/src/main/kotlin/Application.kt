package com.example

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.ktor.http.*

val grades = mapOf("123" to 95, "456" to 82)

fun Application.module() {
    routing {
        get("/") {
            call.respondText("Server is online at Lehman College.")
        }
        get("/greet/{name}") {
            val name = call.parameters["name"]
            call.respondText("Hello, $name! Welcome to CMP 269.")
        }
        get("/grade/{studentId}") {
            val studentId = call.parameters["studentId"]
            val grade = grades[studentId] ?: return@get call.respondText("Student not found.", status = HttpStatusCode.NotFound)
            call.respondText("Student $studentId earned a grade of $grade.")
            }
        }
    }
fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)
