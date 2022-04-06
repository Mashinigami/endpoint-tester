package br.com.endpointtester.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class Endpoints {
    @PostMapping("200")
    fun success(@RequestBody body: String): ResponseEntity<String> {
        println(body)
        return ResponseEntity("Ok", HttpStatus.OK)
    }

    @PostMapping("400")
    fun badRequest(@RequestBody body: String): ResponseEntity<String> {
        println(body)
        return ResponseEntity("Bad Request", HttpStatus.BAD_REQUEST)
    }

    @PostMapping("404")
    fun notFound(@RequestBody body: String): ResponseEntity<String> {
        println(body)
        return ResponseEntity("Not Found", HttpStatus.NOT_FOUND)
    }

    @PostMapping("500")
    fun internalServerError(@RequestBody body: String): ResponseEntity<String> {
        println(body)
        return ResponseEntity("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR)
    }
}