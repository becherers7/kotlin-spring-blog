package com.example.blog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BlogApplication

fun main(args: Array<String>) {
//	setBannerMode(Banner.Mode.OFF)
	runApplication<BlogApplication>(*args)
}
