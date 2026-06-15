package com.javier.recetario.infraestructure.persistence.repository;

import com.javier.recetario.domain.model.Recipe;
import com.javier.recetario.domain.repository.RecipeRepository;
import com.javier.recetario.infraestructure.persistence.mapper.RecipePersistenceMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class MongoRecipeRepository implements RecipeRepository {

    private final SpringRecipeRepository repository;

    private final RecipePersistenceMapper mapper;

    public MongoRecipeRepository(SpringRecipeRepository repository, RecipePersistenceMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Recipe save(Recipe recipe) {
        return mapper.toDomain(repository.save(mapper.toDocument(recipe)));
    }

    @Override
    public Optional<Recipe> findById(String id) {
        return repository.findById(id).map(mapper::toDomain);
    }

}
