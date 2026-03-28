package com.example

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.module() {
    routing {
        get("/") {
            call.respondText("Server is online at Lehman College.")
        }
        get("/greet/{name}") {
            val name = call.parameters["name"]
            call.respondText("Hello, $name! Welcome to CMP 269.")
        }
        get("/greet/{name}") {
            val name = call.parameters["name"]
            call.respondText("Hello, $name! Welcome to CMP 269.")
        }
    }
}
fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)
