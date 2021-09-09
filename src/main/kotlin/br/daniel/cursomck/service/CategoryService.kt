package br.daniel.cursomck.service

import br.daniel.cursomck.models.Category
import br.daniel.cursomck.repository.CategoryRepository
import org.springframework.stereotype.Service

@Service
class CategoryService(
    private val categoryRepository: CategoryRepository
) {
    fun findAll(): List<Category> = categoryRepository.findAll()

    fun findById(id: Int): Category {
        return categoryRepository.findById(id)
            .orElseThrow()
    }
}