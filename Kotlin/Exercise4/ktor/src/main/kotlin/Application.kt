package com.example

import com.google.zxing.BarcodeFormat
import com.google.zxing.client.j2se.MatrixToImageWriter
import com.google.zxing.qrcode.QRCodeWriter
import io.ktor.server.application.*
import java.io.ByteArrayOutputStream
import java.io.OutputStream
import java.nio.file.Path

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    saveQRCode("amy.thompson@lc.cuny.edu", "my_email.png") // part 1
    configureRouting()
}
// part 1
fun saveQRCode(content: String, fileName: String) {
    val bitMatrix = QRCodeWriter().encode(content, BarcodeFormat.QR_CODE, 300, 300)
    MatrixToImageWriter.writeToPath(bitMatrix, "PNG", Path.of(fileName))
}
// part 2
fun saveQRCodeStream(content: String, output: ByteArrayOutputStream) {
    val bitMatrix = QRCodeWriter().encode(content, BarcodeFormat.QR_CODE, 300, 300)
    MatrixToImageWriter.writeToStream(bitMatrix, "PNG", output)
}
