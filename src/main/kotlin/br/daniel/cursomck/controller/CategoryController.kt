package br.daniel.cursomck.controller

import br.daniel.cursomck.models.Category
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/categories")
class CategoryController {

    @GetMapping
    fun list(): List<Category> {

        val cat = Category(1, "Informatica")
        val cat2 = Category(2, "Escritorio")

        val list = mutableListOf<Category>()
        list.add(cat)
        list.add(cat2)

        return list
    }
}