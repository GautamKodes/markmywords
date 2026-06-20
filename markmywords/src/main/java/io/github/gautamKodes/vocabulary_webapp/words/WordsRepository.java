package io.github.gautamKodes.vocabulary_webapp.words;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WordsRepository extends JpaRepository<Word, Long> {

}

