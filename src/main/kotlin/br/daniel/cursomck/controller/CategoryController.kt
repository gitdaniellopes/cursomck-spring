package br.daniel.cursomck.controller

import br.daniel.cursomck.models.Category
import br.daniel.cursomck.service.CategoryService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/categories")
class CategoryController(
    private val categoryService: CategoryService
) {

    @GetMapping("/{id}")
    fun list(@PathVariable id: Int): ResponseEntity<Category> {
        val category = categoryService.findById(id)
        return ResponseEntity.ok().body(category)
    }
}