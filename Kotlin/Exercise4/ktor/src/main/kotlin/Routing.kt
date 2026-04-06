package com.example

import com.google.zxing.BarcodeFormat
import com.google.zxing.client.j2se.MatrixToImageWriter
import com.google.zxing.qrcode.QRCodeWriter
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpStatusCode
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.io.ByteArrayOutputStream

//part 3
fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        get("/qr") {
            val text = call.request.queryParameters["text"]
            if (text == null) {
                return@get call.respondText("Bad Request", status = HttpStatusCode.BadRequest)
            }
            call.response.header(HttpHeaders.ContentType, "image/png")
            val bitMatrix = QRCodeWriter().encode(text, BarcodeFormat.QR_CODE, 300, 300)
            val output = ByteArrayOutputStream()
            MatrixToImageWriter.writeToStream(bitMatrix, "PNG", output)
            call.respondBytes(output.toByteArray(), contentType = ContentType.Image.PNG)

        }
    }
}
