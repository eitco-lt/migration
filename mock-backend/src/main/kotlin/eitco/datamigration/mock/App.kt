package eitco.datamigration.mock

import io.ktor.http.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.util.UUID.randomUUID

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        routing {
            this.post("/api/documents/upload-binary") {
                // Simply return a random file ID
                val fileId = randomUUID().toString()
                call.application.environment.log.info("File upload requested, returning ID: $fileId")
                call.respondText(fileId, ContentType.Text.Plain, HttpStatusCode.OK)
            }

            this.post("/api/documents") {
                // Simply return 200 OK
                call.application.environment.log.info("Document creation requested")
                call.respond<HttpStatusCode>(HttpStatusCode.OK)
            }
        }
    }.start(wait = true)
}
